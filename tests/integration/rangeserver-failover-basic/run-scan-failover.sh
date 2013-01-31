#!/usr/bin/env bash

HT_HOME=${INSTALL_DIR:-"/opt/hypertable/current"}
HYPERTABLE_HOME=${HT_HOME}
HT_SHELL=$HT_HOME/bin/hypertable
SCRIPT_DIR=`dirname $0`
MAX_KEYS=${MAX_KEYS:-"500000"}
RS1_PIDFILE=$HT_HOME/run/Hypertable.RangeServer.rs1.pid
RS2_PIDFILE=$HT_HOME/run/Hypertable.RangeServer.rs2.pid
RUN_DIR=`pwd`

. $HT_HOME/bin/ht-env.sh

. $SCRIPT_DIR/utilities.sh

kill -9 `cat $HT_HOME/run/Hypertable.RangeServer.*.pid`
$HT_HOME/bin/stop-servers.sh

# get rid of all old logfiles
\rm -rf $HT_HOME/log/*
\rm metadata.* dbdump-* rs*dump.* 
\rm -rf fs fs_pre

# generate golden output file
gen_test_data

INDUCER_ARG=
let j=1
[ $TEST == $j ] && INDUCER_ARG="--induce-failure=create-scanner-user-1:exit:1"
let j+=1
[ $TEST == $j ] && INDUCER_ARG="--induce-failure=fetch-scanblock-user-1:exit:0"


# stop and start servers
$HT_HOME/bin/start-test-servers.sh --no-rangeserver --no-thriftbroker \
    --clear --config=${SCRIPT_DIR}/test.cfg

# start both rangeservers
$HT_HOME/bin/ht Hypertable.RangeServer --verbose --pidfile=$RS1_PIDFILE \
   --Hypertable.RangeServer.ProxyName=rs1 $INDUCER_ARG \
   --Hypertable.RangeServer.Scanner.BufferSize=5K \
   --Hypertable.RangeServer.Port=38060 --config=${SCRIPT_DIR}/test.cfg 2>&1 > rangeserver.rs1.output&
$HT_HOME/bin/ht Hypertable.RangeServer --verbose --pidfile=$RS2_PIDFILE \
   --Hypertable.RangeServer.ProxyName=rs2 \
   --Hypertable.RangeServer.Port=38061 --config=${SCRIPT_DIR}/test.cfg 2>&1 > rangeserver.rs2.output&

# create table
$HT_HOME/bin/ht shell --no-prompt < $SCRIPT_DIR/create-table.hql

# write data 
$HT_HOME/bin/ht load_generator --spec-file=$SCRIPT_DIR/data.spec \
    --max-keys=$MAX_KEYS --row-seed=$ROW_SEED --table=LoadTest \
    --Hypertable.Mutator.ScatterBuffer.FlushLimit.PerServer=2M \
    --Hypertable.Mutator.FlushDelay=250 update
if [ $? != 0 ] ; then
    echo "Problem loading table 'LoadTest', exiting ..."
    exit 1
fi

sleep 2

# dump keys
dump_keys dbdump-scan-failover

# wait for recovery to complete 
wait_for_recovery rs1

# bounce servers
$HT_HOME/bin/stop-servers.sh
kill_rs 2

echo "Test passed"
exit 0
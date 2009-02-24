/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.hypertable.thriftgen;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;

import org.apache.thrift.protocol.*;
import org.apache.thrift.transport.*;

/**
 * Specifies options for a scan
 * 
 * <dl>
 *   <dt>row_intervals</dt>
 *   <dd>A list of ranges of rows to scan. Mutually exclusive with
 *   cell_interval</dd>
 * 
 *   <dt>cell_intervals</dt>
 *   <dd>A list of ranges of cells to scan. Mutually exclusive with
 *   row_intervals</dd>
 * 
 *   <dt>return_deletes</dt>
 *   <dd>Indicates whether cells pending delete are returned</dd>
 * 
 *   <dt>revs</dt>
 *   <dd>Specifies max number of revisions of cells to return</dd>
 * 
 *   <dt>row_limit</dt>
 *   <dd>Specifies max number of rows to return</dd>
 * 
 *   <dt>start_time</dt>
 *   <dd>Specifies start time in nanoseconds since epoch for cells to
 *   return</dd>
 * 
 *   <dt>end_time</dt>
 *   <dd>Specifies end time in nanoseconds since epoch for cells to return</dd>
 * 
 *   <dt>columns</dt>
 *   <dd>Specifies the names of the columns to return</dd>
 * </dl>
 */
public class ScanSpec implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ScanSpec");
  private static final TField ROW_INTERVALS_FIELD_DESC = new TField("row_intervals", TType.LIST, (short)1);
  private static final TField CELL_INTERVALS_FIELD_DESC = new TField("cell_intervals", TType.LIST, (short)2);
  private static final TField RETURN_DELETES_FIELD_DESC = new TField("return_deletes", TType.BOOL, (short)3);
  private static final TField REVS_FIELD_DESC = new TField("revs", TType.I32, (short)4);
  private static final TField ROW_LIMIT_FIELD_DESC = new TField("row_limit", TType.I32, (short)5);
  private static final TField START_TIME_FIELD_DESC = new TField("start_time", TType.I64, (short)6);
  private static final TField END_TIME_FIELD_DESC = new TField("end_time", TType.I64, (short)7);
  private static final TField COLUMNS_FIELD_DESC = new TField("columns", TType.LIST, (short)8);

  public List<RowInterval> row_intervals;
  public static final int ROW_INTERVALS = 1;
  public List<CellInterval> cell_intervals;
  public static final int CELL_INTERVALS = 2;
  public boolean return_deletes;
  public static final int RETURN_DELETES = 3;
  public int revs;
  public static final int REVS = 4;
  public int row_limit;
  public static final int ROW_LIMIT = 5;
  public long start_time;
  public static final int START_TIME = 6;
  public long end_time;
  public static final int END_TIME = 7;
  public List<String> columns;
  public static final int COLUMNS = 8;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean return_deletes = false;
    public boolean revs = false;
    public boolean row_limit = false;
    public boolean start_time = false;
    public boolean end_time = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(ROW_INTERVALS, new FieldMetaData("row_intervals", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, RowInterval.class))));
    put(CELL_INTERVALS, new FieldMetaData("cell_intervals", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, CellInterval.class))));
    put(RETURN_DELETES, new FieldMetaData("return_deletes", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    put(REVS, new FieldMetaData("revs", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    put(ROW_LIMIT, new FieldMetaData("row_limit", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    put(START_TIME, new FieldMetaData("start_time", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    put(END_TIME, new FieldMetaData("end_time", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    put(COLUMNS, new FieldMetaData("columns", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(ScanSpec.class, metaDataMap);
  }

  public ScanSpec() {
    this.return_deletes = false;

    this.revs = 0;

    this.row_limit = 0;

  }

  public ScanSpec(
    List<RowInterval> row_intervals,
    List<CellInterval> cell_intervals,
    boolean return_deletes,
    int revs,
    int row_limit,
    long start_time,
    long end_time,
    List<String> columns)
  {
    this();
    this.row_intervals = row_intervals;
    this.cell_intervals = cell_intervals;
    this.return_deletes = return_deletes;
    this.__isset.return_deletes = true;
    this.revs = revs;
    this.__isset.revs = true;
    this.row_limit = row_limit;
    this.__isset.row_limit = true;
    this.start_time = start_time;
    this.__isset.start_time = true;
    this.end_time = end_time;
    this.__isset.end_time = true;
    this.columns = columns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScanSpec(ScanSpec other) {
    if (other.isSetRow_intervals()) {
      List<RowInterval> __this__row_intervals = new ArrayList<RowInterval>();
      for (RowInterval other_element : other.row_intervals) {
        __this__row_intervals.add(new RowInterval(other_element));
      }
      this.row_intervals = __this__row_intervals;
    }
    if (other.isSetCell_intervals()) {
      List<CellInterval> __this__cell_intervals = new ArrayList<CellInterval>();
      for (CellInterval other_element : other.cell_intervals) {
        __this__cell_intervals.add(new CellInterval(other_element));
      }
      this.cell_intervals = __this__cell_intervals;
    }
    __isset.return_deletes = other.__isset.return_deletes;
    this.return_deletes = other.return_deletes;
    __isset.revs = other.__isset.revs;
    this.revs = other.revs;
    __isset.row_limit = other.__isset.row_limit;
    this.row_limit = other.row_limit;
    __isset.start_time = other.__isset.start_time;
    this.start_time = other.start_time;
    __isset.end_time = other.__isset.end_time;
    this.end_time = other.end_time;
    if (other.isSetColumns()) {
      List<String> __this__columns = new ArrayList<String>();
      for (String other_element : other.columns) {
        __this__columns.add(other_element);
      }
      this.columns = __this__columns;
    }
  }

  @Override
  public ScanSpec clone() {
    return new ScanSpec(this);
  }

  public int getRow_intervalsSize() {
    return (this.row_intervals == null) ? 0 : this.row_intervals.size();
  }

  public java.util.Iterator<RowInterval> getRow_intervalsIterator() {
    return (this.row_intervals == null) ? null : this.row_intervals.iterator();
  }

  public void addToRow_intervals(RowInterval elem) {
    if (this.row_intervals == null) {
      this.row_intervals = new ArrayList<RowInterval>();
    }
    this.row_intervals.add(elem);
  }

  public List<RowInterval> getRow_intervals() {
    return this.row_intervals;
  }

  public void setRow_intervals(List<RowInterval> row_intervals) {
    this.row_intervals = row_intervals;
  }

  public void unsetRow_intervals() {
    this.row_intervals = null;
  }

  // Returns true if field row_intervals is set (has been asigned a value) and false otherwise
  public boolean isSetRow_intervals() {
    return this.row_intervals != null;
  }

  public void setRow_intervalsIsSet(boolean value) {
    if (!value) {
      this.row_intervals = null;
    }
  }

  public int getCell_intervalsSize() {
    return (this.cell_intervals == null) ? 0 : this.cell_intervals.size();
  }

  public java.util.Iterator<CellInterval> getCell_intervalsIterator() {
    return (this.cell_intervals == null) ? null : this.cell_intervals.iterator();
  }

  public void addToCell_intervals(CellInterval elem) {
    if (this.cell_intervals == null) {
      this.cell_intervals = new ArrayList<CellInterval>();
    }
    this.cell_intervals.add(elem);
  }

  public List<CellInterval> getCell_intervals() {
    return this.cell_intervals;
  }

  public void setCell_intervals(List<CellInterval> cell_intervals) {
    this.cell_intervals = cell_intervals;
  }

  public void unsetCell_intervals() {
    this.cell_intervals = null;
  }

  // Returns true if field cell_intervals is set (has been asigned a value) and false otherwise
  public boolean isSetCell_intervals() {
    return this.cell_intervals != null;
  }

  public void setCell_intervalsIsSet(boolean value) {
    if (!value) {
      this.cell_intervals = null;
    }
  }

  public boolean isReturn_deletes() {
    return this.return_deletes;
  }

  public void setReturn_deletes(boolean return_deletes) {
    this.return_deletes = return_deletes;
    this.__isset.return_deletes = true;
  }

  public void unsetReturn_deletes() {
    this.__isset.return_deletes = false;
  }

  // Returns true if field return_deletes is set (has been asigned a value) and false otherwise
  public boolean isSetReturn_deletes() {
    return this.__isset.return_deletes;
  }

  public void setReturn_deletesIsSet(boolean value) {
    this.__isset.return_deletes = value;
  }

  public int getRevs() {
    return this.revs;
  }

  public void setRevs(int revs) {
    this.revs = revs;
    this.__isset.revs = true;
  }

  public void unsetRevs() {
    this.__isset.revs = false;
  }

  // Returns true if field revs is set (has been asigned a value) and false otherwise
  public boolean isSetRevs() {
    return this.__isset.revs;
  }

  public void setRevsIsSet(boolean value) {
    this.__isset.revs = value;
  }

  public int getRow_limit() {
    return this.row_limit;
  }

  public void setRow_limit(int row_limit) {
    this.row_limit = row_limit;
    this.__isset.row_limit = true;
  }

  public void unsetRow_limit() {
    this.__isset.row_limit = false;
  }

  // Returns true if field row_limit is set (has been asigned a value) and false otherwise
  public boolean isSetRow_limit() {
    return this.__isset.row_limit;
  }

  public void setRow_limitIsSet(boolean value) {
    this.__isset.row_limit = value;
  }

  public long getStart_time() {
    return this.start_time;
  }

  public void setStart_time(long start_time) {
    this.start_time = start_time;
    this.__isset.start_time = true;
  }

  public void unsetStart_time() {
    this.__isset.start_time = false;
  }

  // Returns true if field start_time is set (has been asigned a value) and false otherwise
  public boolean isSetStart_time() {
    return this.__isset.start_time;
  }

  public void setStart_timeIsSet(boolean value) {
    this.__isset.start_time = value;
  }

  public long getEnd_time() {
    return this.end_time;
  }

  public void setEnd_time(long end_time) {
    this.end_time = end_time;
    this.__isset.end_time = true;
  }

  public void unsetEnd_time() {
    this.__isset.end_time = false;
  }

  // Returns true if field end_time is set (has been asigned a value) and false otherwise
  public boolean isSetEnd_time() {
    return this.__isset.end_time;
  }

  public void setEnd_timeIsSet(boolean value) {
    this.__isset.end_time = value;
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<String> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(String elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<String>();
    }
    this.columns.add(elem);
  }

  public List<String> getColumns() {
    return this.columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  // Returns true if field columns is set (has been asigned a value) and false otherwise
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case ROW_INTERVALS:
      setRow_intervals((List<RowInterval>)value);
      break;

    case CELL_INTERVALS:
      setCell_intervals((List<CellInterval>)value);
      break;

    case RETURN_DELETES:
      setReturn_deletes((Boolean)value);
      break;

    case REVS:
      setRevs((Integer)value);
      break;

    case ROW_LIMIT:
      setRow_limit((Integer)value);
      break;

    case START_TIME:
      setStart_time((Long)value);
      break;

    case END_TIME:
      setEnd_time((Long)value);
      break;

    case COLUMNS:
      setColumns((List<String>)value);
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ROW_INTERVALS:
      return getRow_intervals();

    case CELL_INTERVALS:
      return getCell_intervals();

    case RETURN_DELETES:
      return new Boolean(isReturn_deletes());

    case REVS:
      return new Integer(getRevs());

    case ROW_LIMIT:
      return new Integer(getRow_limit());

    case START_TIME:
      return new Long(getStart_time());

    case END_TIME:
      return new Long(getEnd_time());

    case COLUMNS:
      return getColumns();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ROW_INTERVALS:
      return isSetRow_intervals();
    case CELL_INTERVALS:
      return isSetCell_intervals();
    case RETURN_DELETES:
      return isSetReturn_deletes();
    case REVS:
      return isSetRevs();
    case ROW_LIMIT:
      return isSetRow_limit();
    case START_TIME:
      return isSetStart_time();
    case END_TIME:
      return isSetEnd_time();
    case COLUMNS:
      return isSetColumns();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ScanSpec)
      return this.equals((ScanSpec)that);
    return false;
  }

  public boolean equals(ScanSpec that) {
    if (that == null)
      return false;

    boolean this_present_row_intervals = true && this.isSetRow_intervals();
    boolean that_present_row_intervals = true && that.isSetRow_intervals();
    if (this_present_row_intervals || that_present_row_intervals) {
      if (!(this_present_row_intervals && that_present_row_intervals))
        return false;
      if (!this.row_intervals.equals(that.row_intervals))
        return false;
    }

    boolean this_present_cell_intervals = true && this.isSetCell_intervals();
    boolean that_present_cell_intervals = true && that.isSetCell_intervals();
    if (this_present_cell_intervals || that_present_cell_intervals) {
      if (!(this_present_cell_intervals && that_present_cell_intervals))
        return false;
      if (!this.cell_intervals.equals(that.cell_intervals))
        return false;
    }

    boolean this_present_return_deletes = true && this.isSetReturn_deletes();
    boolean that_present_return_deletes = true && that.isSetReturn_deletes();
    if (this_present_return_deletes || that_present_return_deletes) {
      if (!(this_present_return_deletes && that_present_return_deletes))
        return false;
      if (this.return_deletes != that.return_deletes)
        return false;
    }

    boolean this_present_revs = true && this.isSetRevs();
    boolean that_present_revs = true && that.isSetRevs();
    if (this_present_revs || that_present_revs) {
      if (!(this_present_revs && that_present_revs))
        return false;
      if (this.revs != that.revs)
        return false;
    }

    boolean this_present_row_limit = true && this.isSetRow_limit();
    boolean that_present_row_limit = true && that.isSetRow_limit();
    if (this_present_row_limit || that_present_row_limit) {
      if (!(this_present_row_limit && that_present_row_limit))
        return false;
      if (this.row_limit != that.row_limit)
        return false;
    }

    boolean this_present_start_time = true && this.isSetStart_time();
    boolean that_present_start_time = true && that.isSetStart_time();
    if (this_present_start_time || that_present_start_time) {
      if (!(this_present_start_time && that_present_start_time))
        return false;
      if (this.start_time != that.start_time)
        return false;
    }

    boolean this_present_end_time = true && this.isSetEnd_time();
    boolean that_present_end_time = true && that.isSetEnd_time();
    if (this_present_end_time || that_present_end_time) {
      if (!(this_present_end_time && that_present_end_time))
        return false;
      if (this.end_time != that.end_time)
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case ROW_INTERVALS:
          if (field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              this.row_intervals = new ArrayList<RowInterval>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                RowInterval _elem2;
                _elem2 = new RowInterval();
                _elem2.read(iprot);
                this.row_intervals.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CELL_INTERVALS:
          if (field.type == TType.LIST) {
            {
              TList _list3 = iprot.readListBegin();
              this.cell_intervals = new ArrayList<CellInterval>(_list3.size);
              for (int _i4 = 0; _i4 < _list3.size; ++_i4)
              {
                CellInterval _elem5;
                _elem5 = new CellInterval();
                _elem5.read(iprot);
                this.cell_intervals.add(_elem5);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RETURN_DELETES:
          if (field.type == TType.BOOL) {
            this.return_deletes = iprot.readBool();
            this.__isset.return_deletes = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REVS:
          if (field.type == TType.I32) {
            this.revs = iprot.readI32();
            this.__isset.revs = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ROW_LIMIT:
          if (field.type == TType.I32) {
            this.row_limit = iprot.readI32();
            this.__isset.row_limit = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case START_TIME:
          if (field.type == TType.I64) {
            this.start_time = iprot.readI64();
            this.__isset.start_time = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case END_TIME:
          if (field.type == TType.I64) {
            this.end_time = iprot.readI64();
            this.__isset.end_time = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COLUMNS:
          if (field.type == TType.LIST) {
            {
              TList _list6 = iprot.readListBegin();
              this.columns = new ArrayList<String>(_list6.size);
              for (int _i7 = 0; _i7 < _list6.size; ++_i7)
              {
                String _elem8;
                _elem8 = iprot.readString();
                this.columns.add(_elem8);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.row_intervals != null) {
      oprot.writeFieldBegin(ROW_INTERVALS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.row_intervals.size()));
        for (RowInterval _iter9 : this.row_intervals)        {
          _iter9.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.cell_intervals != null) {
      oprot.writeFieldBegin(CELL_INTERVALS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.cell_intervals.size()));
        for (CellInterval _iter10 : this.cell_intervals)        {
          _iter10.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(RETURN_DELETES_FIELD_DESC);
    oprot.writeBool(this.return_deletes);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(REVS_FIELD_DESC);
    oprot.writeI32(this.revs);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ROW_LIMIT_FIELD_DESC);
    oprot.writeI32(this.row_limit);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(START_TIME_FIELD_DESC);
    oprot.writeI64(this.start_time);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(END_TIME_FIELD_DESC);
    oprot.writeI64(this.end_time);
    oprot.writeFieldEnd();
    if (this.columns != null) {
      oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.columns.size()));
        for (String _iter11 : this.columns)        {
          oprot.writeString(_iter11);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ScanSpec(");
    boolean first = true;

    if (isSetRow_intervals()) {
      sb.append("row_intervals:");
      if (this.row_intervals == null) {
        sb.append("null");
      } else {
        sb.append(this.row_intervals);
      }
      first = false;
    }
    if (isSetCell_intervals()) {
      if (!first) sb.append(", ");
      sb.append("cell_intervals:");
      if (this.cell_intervals == null) {
        sb.append("null");
      } else {
        sb.append(this.cell_intervals);
      }
      first = false;
    }
    if (isSetReturn_deletes()) {
      if (!first) sb.append(", ");
      sb.append("return_deletes:");
      sb.append(this.return_deletes);
      first = false;
    }
    if (isSetRevs()) {
      if (!first) sb.append(", ");
      sb.append("revs:");
      sb.append(this.revs);
      first = false;
    }
    if (isSetRow_limit()) {
      if (!first) sb.append(", ");
      sb.append("row_limit:");
      sb.append(this.row_limit);
      first = false;
    }
    if (isSetStart_time()) {
      if (!first) sb.append(", ");
      sb.append("start_time:");
      sb.append(this.start_time);
      first = false;
    }
    if (isSetEnd_time()) {
      if (!first) sb.append(", ");
      sb.append("end_time:");
      sb.append(this.end_time);
      first = false;
    }
    if (isSetColumns()) {
      if (!first) sb.append(", ");
      sb.append("columns:");
      if (this.columns == null) {
        sb.append("null");
      } else {
        sb.append(this.columns);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}


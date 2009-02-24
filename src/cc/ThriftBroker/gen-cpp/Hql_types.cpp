/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
#include "Hql_types.h"

namespace Hypertable { namespace ThriftGen {

const char* HqlResult::ascii_fingerprint = "18145C760E907938802BB3CC3490043E";
const uint8_t HqlResult::binary_fingerprint[16] = {0x18,0x14,0x5C,0x76,0x0E,0x90,0x79,0x38,0x80,0x2B,0xB3,0xCC,0x34,0x90,0x04,0x3E};

uint32_t HqlResult::read(apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == apache::thrift::protocol::T_LIST) {
          {
            this->results.clear();
            uint32_t _size0;
            apache::thrift::protocol::TType _etype3;
            iprot->readListBegin(_etype3, _size0);
            this->results.resize(_size0);
            uint32_t _i4;
            for (_i4 = 0; _i4 < _size0; ++_i4)
            {
              xfer += iprot->readString(this->results[_i4]);
            }
            iprot->readListEnd();
          }
          this->__isset.results = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == apache::thrift::protocol::T_LIST) {
          {
            this->cells.clear();
            uint32_t _size5;
            apache::thrift::protocol::TType _etype8;
            iprot->readListBegin(_etype8, _size5);
            this->cells.resize(_size5);
            uint32_t _i9;
            for (_i9 = 0; _i9 < _size5; ++_i9)
            {
              xfer += this->cells[_i9].read(iprot);
            }
            iprot->readListEnd();
          }
          this->__isset.cells = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->scanner);
          this->__isset.scanner = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->mutator);
          this->__isset.mutator = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t HqlResult::write(apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  xfer += oprot->writeStructBegin("HqlResult");
  if (this->__isset.results) {
    xfer += oprot->writeFieldBegin("results", apache::thrift::protocol::T_LIST, 1);
    {
      xfer += oprot->writeListBegin(apache::thrift::protocol::T_STRING, this->results.size());
      std::vector<std::string> ::const_iterator _iter10;
      for (_iter10 = this->results.begin(); _iter10 != this->results.end(); ++_iter10)
      {
        xfer += oprot->writeString((*_iter10));
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.cells) {
    xfer += oprot->writeFieldBegin("cells", apache::thrift::protocol::T_LIST, 2);
    {
      xfer += oprot->writeListBegin(apache::thrift::protocol::T_STRUCT, this->cells.size());
      std::vector<Hypertable::ThriftGen::Cell> ::const_iterator _iter11;
      for (_iter11 = this->cells.begin(); _iter11 != this->cells.end(); ++_iter11)
      {
        xfer += (*_iter11).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.scanner) {
    xfer += oprot->writeFieldBegin("scanner", apache::thrift::protocol::T_I64, 3);
    xfer += oprot->writeI64(this->scanner);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.mutator) {
    xfer += oprot->writeFieldBegin("mutator", apache::thrift::protocol::T_I64, 4);
    xfer += oprot->writeI64(this->mutator);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

}} // namespace

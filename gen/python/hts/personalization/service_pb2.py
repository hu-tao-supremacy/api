# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: hts/personalization/service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from hts.common import common_pb2 as hts_dot_common_dot_common__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='hts/personalization/service.proto',
  package='hts.personalization',
  syntax='proto3',
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n!hts/personalization/service.proto\x12\x13hts.personalization\x1a\x17hts/common/common.proto\"(\n\x10\x46ibonacciRequest\x12\x14\n\x05index\x18\x01 \x01(\x05R\x05index\"+\n\x11\x46ibonacciResponse\x12\x16\n\x06result\x18\x01 \x01(\x05R\x06result2t\n\x16PersonalizationService\x12Z\n\tFibonacci\x12%.hts.personalization.FibonacciRequest\x1a&.hts.personalization.FibonacciResponseb\x06proto3'
  ,
  dependencies=[hts_dot_common_dot_common__pb2.DESCRIPTOR,])




_FIBONACCIREQUEST = _descriptor.Descriptor(
  name='FibonacciRequest',
  full_name='hts.personalization.FibonacciRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='index', full_name='hts.personalization.FibonacciRequest.index', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='index', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=83,
  serialized_end=123,
)


_FIBONACCIRESPONSE = _descriptor.Descriptor(
  name='FibonacciResponse',
  full_name='hts.personalization.FibonacciResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='hts.personalization.FibonacciResponse.result', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='result', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=125,
  serialized_end=168,
)

DESCRIPTOR.message_types_by_name['FibonacciRequest'] = _FIBONACCIREQUEST
DESCRIPTOR.message_types_by_name['FibonacciResponse'] = _FIBONACCIRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FibonacciRequest = _reflection.GeneratedProtocolMessageType('FibonacciRequest', (_message.Message,), {
  'DESCRIPTOR' : _FIBONACCIREQUEST,
  '__module__' : 'hts.personalization.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.personalization.FibonacciRequest)
  })
_sym_db.RegisterMessage(FibonacciRequest)

FibonacciResponse = _reflection.GeneratedProtocolMessageType('FibonacciResponse', (_message.Message,), {
  'DESCRIPTOR' : _FIBONACCIRESPONSE,
  '__module__' : 'hts.personalization.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.personalization.FibonacciResponse)
  })
_sym_db.RegisterMessage(FibonacciResponse)



_PERSONALIZATIONSERVICE = _descriptor.ServiceDescriptor(
  name='PersonalizationService',
  full_name='hts.personalization.PersonalizationService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=170,
  serialized_end=286,
  methods=[
  _descriptor.MethodDescriptor(
    name='Fibonacci',
    full_name='hts.personalization.PersonalizationService.Fibonacci',
    index=0,
    containing_service=None,
    input_type=_FIBONACCIREQUEST,
    output_type=_FIBONACCIRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_PERSONALIZATIONSERVICE)

DESCRIPTOR.services_by_name['PersonalizationService'] = _PERSONALIZATIONSERVICE

# @@protoc_insertion_point(module_scope)
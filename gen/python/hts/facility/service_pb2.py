# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: hts/facility/service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from hts.common import common_pb2 as hts_dot_common_dot_common__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='hts/facility/service.proto',
  package='hts.facility',
  syntax='proto3',
  serialized_options=b'\n\020app.onepass.apisB\rFacilityProtoP\001Z!onepass.app/facility/hts/facility',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1ahts/facility/service.proto\x12\x0chts.facility\x1a\x17hts/common/common.proto\x1a\x1bgoogle/protobuf/empty.proto\"\xa3\x01\n\x0f\x46\x61\x63ilityRequest\x12\x0e\n\x02id\x18\x01 \x01(\x03R\x02id\x12\x19\n\x08\x65vent_id\x18\x02 \x01(\x03R\x07\x65ventId\x12\x1f\n\x0b\x66\x61\x63ility_id\x18\x03 \x01(\x03R\nfacilityId\x12\x1f\n\x0bis_approved\x18\x04 \x01(\x03R\nisApproved\x12#\n\rreject_reason\x18\x05 \x01(\x03R\x0crejectReason\"\xdc\x01\n\x08\x46\x61\x63ility\x12\x0e\n\x02id\x18\x01 \x01(\x03R\x02id\x12\'\n\x0forganization_id\x18\x02 \x01(\x03R\x0eorganizationId\x12\x12\n\x04name\x18\x03 \x01(\tR\x04name\x12\x1a\n\x08latitude\x18\x04 \x01(\x03R\x08latitude\x12\x1c\n\tlongitude\x18\x05 \x01(\x03R\tlongitude\x12\'\n\x0foperating_hours\x18\x06 \x01(\tR\x0eoperatingHours\x12 \n\x0b\x64\x65scription\x18\x07 \x01(\tR\x0b\x64\x65scription\"A\n\x16GetFacilityListRequest\x12\'\n\x0forganization_id\x18\x01 \x01(\x03R\x0eorganizationId\"Q\n\x17GetFacilityListResponse\x12\x36\n\nfacilities\x18\x01 \x03(\x0b\x32\x16.hts.facility.FacilityR\nfacilities\"H\n\x1dGetFacilityRequestListRequest\x12\'\n\x0forganization_id\x18\x01 \x01(\x03R\x0eorganizationId\"[\n\x1eGetFacilityRequestListResponse\x12\x39\n\x08requests\x18\x01 \x03(\x0b\x32\x1d.hts.facility.FacilityRequestR\x08requests\"<\n\x1fGetFacilityRequestStatusRequest\x12\x19\n\x08\x65vent_id\x18\x01 \x01(\x03R\x07\x65ventId\"Z\n GetAvailableFacilityListResponse\x12\x36\n\nfacilities\x18\x01 \x03(\x0b\x32\x16.hts.facility.FacilityR\nfacilities\":\n\x1dRequestFacilityRequestRequest\x12\x19\n\x08\x65vent_id\x18\x01 \x01(\x03R\x07\x65ventId\">\n\x1d\x41pproveFacilityRequestRequest\x12\x1d\n\nrequest_id\x18\x01 \x01(\x03R\trequestId\"U\n\x1cRejectFacilityRequestRequest\x12\x1d\n\nrequest_id\x18\x01 \x01(\x03R\trequestId\x12\x16\n\x06reason\x18\x02 \x01(\tR\x06reason\"9\n\x16GetFacilityInfoRequest\x12\x1f\n\x0b\x66\x61\x63ility_id\x18\x01 \x01(\x03R\nfacilityId2\x9f\x06\n\x0f\x46\x61\x63ilityService\x12^\n\x0fGetFacilityList\x12$.hts.facility.GetFacilityListRequest\x1a%.hts.facility.GetFacilityListResponse\x12s\n\x16GetFacilityRequestList\x12+.hts.facility.GetFacilityRequestListRequest\x1a,.hts.facility.GetFacilityRequestListResponse\x12h\n\x18GetFacilityRequestStatus\x12-.hts.facility.GetFacilityRequestStatusRequest\x1a\x1d.hts.facility.FacilityRequest\x12\x62\n\x18GetAvailableFacilityList\x12\x16.google.protobuf.Empty\x1a..hts.facility.GetAvailableFacilityListResponse\x12\x64\n\x16RequestFacilityRequest\x12+.hts.facility.RequestFacilityRequestRequest\x1a\x1d.hts.facility.FacilityRequest\x12Y\n\x16\x41pproveFacilityRequest\x12+.hts.facility.ApproveFacilityRequestRequest\x1a\x12.hts.common.Result\x12W\n\x15RejectFacilityRequest\x12*.hts.facility.RejectFacilityRequestRequest\x1a\x12.hts.common.Result\x12O\n\x0fGetFacilityInfo\x12$.hts.facility.GetFacilityInfoRequest\x1a\x16.hts.facility.FacilityBF\n\x10\x61pp.onepass.apisB\rFacilityProtoP\x01Z!onepass.app/facility/hts/facilityb\x06proto3'
  ,
  dependencies=[hts_dot_common_dot_common__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,])




_FACILITYREQUEST = _descriptor.Descriptor(
  name='FacilityRequest',
  full_name='hts.facility.FacilityRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='hts.facility.FacilityRequest.id', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='id', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='event_id', full_name='hts.facility.FacilityRequest.event_id', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='eventId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='facility_id', full_name='hts.facility.FacilityRequest.facility_id', index=2,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='facilityId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='is_approved', full_name='hts.facility.FacilityRequest.is_approved', index=3,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='isApproved', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reject_reason', full_name='hts.facility.FacilityRequest.reject_reason', index=4,
      number=5, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='rejectReason', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=99,
  serialized_end=262,
)


_FACILITY = _descriptor.Descriptor(
  name='Facility',
  full_name='hts.facility.Facility',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='hts.facility.Facility.id', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='id', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='organization_id', full_name='hts.facility.Facility.organization_id', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='organizationId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='hts.facility.Facility.name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='name', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='latitude', full_name='hts.facility.Facility.latitude', index=3,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='latitude', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='longitude', full_name='hts.facility.Facility.longitude', index=4,
      number=5, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='longitude', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operating_hours', full_name='hts.facility.Facility.operating_hours', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='operatingHours', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='hts.facility.Facility.description', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='description', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=265,
  serialized_end=485,
)


_GETFACILITYLISTREQUEST = _descriptor.Descriptor(
  name='GetFacilityListRequest',
  full_name='hts.facility.GetFacilityListRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='organization_id', full_name='hts.facility.GetFacilityListRequest.organization_id', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='organizationId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=487,
  serialized_end=552,
)


_GETFACILITYLISTRESPONSE = _descriptor.Descriptor(
  name='GetFacilityListResponse',
  full_name='hts.facility.GetFacilityListResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='facilities', full_name='hts.facility.GetFacilityListResponse.facilities', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='facilities', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=554,
  serialized_end=635,
)


_GETFACILITYREQUESTLISTREQUEST = _descriptor.Descriptor(
  name='GetFacilityRequestListRequest',
  full_name='hts.facility.GetFacilityRequestListRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='organization_id', full_name='hts.facility.GetFacilityRequestListRequest.organization_id', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='organizationId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=637,
  serialized_end=709,
)


_GETFACILITYREQUESTLISTRESPONSE = _descriptor.Descriptor(
  name='GetFacilityRequestListResponse',
  full_name='hts.facility.GetFacilityRequestListResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='requests', full_name='hts.facility.GetFacilityRequestListResponse.requests', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='requests', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=711,
  serialized_end=802,
)


_GETFACILITYREQUESTSTATUSREQUEST = _descriptor.Descriptor(
  name='GetFacilityRequestStatusRequest',
  full_name='hts.facility.GetFacilityRequestStatusRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='event_id', full_name='hts.facility.GetFacilityRequestStatusRequest.event_id', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='eventId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=804,
  serialized_end=864,
)


_GETAVAILABLEFACILITYLISTRESPONSE = _descriptor.Descriptor(
  name='GetAvailableFacilityListResponse',
  full_name='hts.facility.GetAvailableFacilityListResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='facilities', full_name='hts.facility.GetAvailableFacilityListResponse.facilities', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='facilities', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=866,
  serialized_end=956,
)


_REQUESTFACILITYREQUESTREQUEST = _descriptor.Descriptor(
  name='RequestFacilityRequestRequest',
  full_name='hts.facility.RequestFacilityRequestRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='event_id', full_name='hts.facility.RequestFacilityRequestRequest.event_id', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='eventId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=958,
  serialized_end=1016,
)


_APPROVEFACILITYREQUESTREQUEST = _descriptor.Descriptor(
  name='ApproveFacilityRequestRequest',
  full_name='hts.facility.ApproveFacilityRequestRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='request_id', full_name='hts.facility.ApproveFacilityRequestRequest.request_id', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='requestId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1018,
  serialized_end=1080,
)


_REJECTFACILITYREQUESTREQUEST = _descriptor.Descriptor(
  name='RejectFacilityRequestRequest',
  full_name='hts.facility.RejectFacilityRequestRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='request_id', full_name='hts.facility.RejectFacilityRequestRequest.request_id', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='requestId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reason', full_name='hts.facility.RejectFacilityRequestRequest.reason', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='reason', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1082,
  serialized_end=1167,
)


_GETFACILITYINFOREQUEST = _descriptor.Descriptor(
  name='GetFacilityInfoRequest',
  full_name='hts.facility.GetFacilityInfoRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='facility_id', full_name='hts.facility.GetFacilityInfoRequest.facility_id', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='facilityId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1169,
  serialized_end=1226,
)

_GETFACILITYLISTRESPONSE.fields_by_name['facilities'].message_type = _FACILITY
_GETFACILITYREQUESTLISTRESPONSE.fields_by_name['requests'].message_type = _FACILITYREQUEST
_GETAVAILABLEFACILITYLISTRESPONSE.fields_by_name['facilities'].message_type = _FACILITY
DESCRIPTOR.message_types_by_name['FacilityRequest'] = _FACILITYREQUEST
DESCRIPTOR.message_types_by_name['Facility'] = _FACILITY
DESCRIPTOR.message_types_by_name['GetFacilityListRequest'] = _GETFACILITYLISTREQUEST
DESCRIPTOR.message_types_by_name['GetFacilityListResponse'] = _GETFACILITYLISTRESPONSE
DESCRIPTOR.message_types_by_name['GetFacilityRequestListRequest'] = _GETFACILITYREQUESTLISTREQUEST
DESCRIPTOR.message_types_by_name['GetFacilityRequestListResponse'] = _GETFACILITYREQUESTLISTRESPONSE
DESCRIPTOR.message_types_by_name['GetFacilityRequestStatusRequest'] = _GETFACILITYREQUESTSTATUSREQUEST
DESCRIPTOR.message_types_by_name['GetAvailableFacilityListResponse'] = _GETAVAILABLEFACILITYLISTRESPONSE
DESCRIPTOR.message_types_by_name['RequestFacilityRequestRequest'] = _REQUESTFACILITYREQUESTREQUEST
DESCRIPTOR.message_types_by_name['ApproveFacilityRequestRequest'] = _APPROVEFACILITYREQUESTREQUEST
DESCRIPTOR.message_types_by_name['RejectFacilityRequestRequest'] = _REJECTFACILITYREQUESTREQUEST
DESCRIPTOR.message_types_by_name['GetFacilityInfoRequest'] = _GETFACILITYINFOREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FacilityRequest = _reflection.GeneratedProtocolMessageType('FacilityRequest', (_message.Message,), {
  'DESCRIPTOR' : _FACILITYREQUEST,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.FacilityRequest)
  })
_sym_db.RegisterMessage(FacilityRequest)

Facility = _reflection.GeneratedProtocolMessageType('Facility', (_message.Message,), {
  'DESCRIPTOR' : _FACILITY,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.Facility)
  })
_sym_db.RegisterMessage(Facility)

GetFacilityListRequest = _reflection.GeneratedProtocolMessageType('GetFacilityListRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETFACILITYLISTREQUEST,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.GetFacilityListRequest)
  })
_sym_db.RegisterMessage(GetFacilityListRequest)

GetFacilityListResponse = _reflection.GeneratedProtocolMessageType('GetFacilityListResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETFACILITYLISTRESPONSE,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.GetFacilityListResponse)
  })
_sym_db.RegisterMessage(GetFacilityListResponse)

GetFacilityRequestListRequest = _reflection.GeneratedProtocolMessageType('GetFacilityRequestListRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETFACILITYREQUESTLISTREQUEST,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.GetFacilityRequestListRequest)
  })
_sym_db.RegisterMessage(GetFacilityRequestListRequest)

GetFacilityRequestListResponse = _reflection.GeneratedProtocolMessageType('GetFacilityRequestListResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETFACILITYREQUESTLISTRESPONSE,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.GetFacilityRequestListResponse)
  })
_sym_db.RegisterMessage(GetFacilityRequestListResponse)

GetFacilityRequestStatusRequest = _reflection.GeneratedProtocolMessageType('GetFacilityRequestStatusRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETFACILITYREQUESTSTATUSREQUEST,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.GetFacilityRequestStatusRequest)
  })
_sym_db.RegisterMessage(GetFacilityRequestStatusRequest)

GetAvailableFacilityListResponse = _reflection.GeneratedProtocolMessageType('GetAvailableFacilityListResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETAVAILABLEFACILITYLISTRESPONSE,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.GetAvailableFacilityListResponse)
  })
_sym_db.RegisterMessage(GetAvailableFacilityListResponse)

RequestFacilityRequestRequest = _reflection.GeneratedProtocolMessageType('RequestFacilityRequestRequest', (_message.Message,), {
  'DESCRIPTOR' : _REQUESTFACILITYREQUESTREQUEST,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.RequestFacilityRequestRequest)
  })
_sym_db.RegisterMessage(RequestFacilityRequestRequest)

ApproveFacilityRequestRequest = _reflection.GeneratedProtocolMessageType('ApproveFacilityRequestRequest', (_message.Message,), {
  'DESCRIPTOR' : _APPROVEFACILITYREQUESTREQUEST,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.ApproveFacilityRequestRequest)
  })
_sym_db.RegisterMessage(ApproveFacilityRequestRequest)

RejectFacilityRequestRequest = _reflection.GeneratedProtocolMessageType('RejectFacilityRequestRequest', (_message.Message,), {
  'DESCRIPTOR' : _REJECTFACILITYREQUESTREQUEST,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.RejectFacilityRequestRequest)
  })
_sym_db.RegisterMessage(RejectFacilityRequestRequest)

GetFacilityInfoRequest = _reflection.GeneratedProtocolMessageType('GetFacilityInfoRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETFACILITYINFOREQUEST,
  '__module__' : 'hts.facility.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.facility.GetFacilityInfoRequest)
  })
_sym_db.RegisterMessage(GetFacilityInfoRequest)


DESCRIPTOR._options = None

_FACILITYSERVICE = _descriptor.ServiceDescriptor(
  name='FacilityService',
  full_name='hts.facility.FacilityService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=1229,
  serialized_end=2028,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetFacilityList',
    full_name='hts.facility.FacilityService.GetFacilityList',
    index=0,
    containing_service=None,
    input_type=_GETFACILITYLISTREQUEST,
    output_type=_GETFACILITYLISTRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetFacilityRequestList',
    full_name='hts.facility.FacilityService.GetFacilityRequestList',
    index=1,
    containing_service=None,
    input_type=_GETFACILITYREQUESTLISTREQUEST,
    output_type=_GETFACILITYREQUESTLISTRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetFacilityRequestStatus',
    full_name='hts.facility.FacilityService.GetFacilityRequestStatus',
    index=2,
    containing_service=None,
    input_type=_GETFACILITYREQUESTSTATUSREQUEST,
    output_type=_FACILITYREQUEST,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetAvailableFacilityList',
    full_name='hts.facility.FacilityService.GetAvailableFacilityList',
    index=3,
    containing_service=None,
    input_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    output_type=_GETAVAILABLEFACILITYLISTRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='RequestFacilityRequest',
    full_name='hts.facility.FacilityService.RequestFacilityRequest',
    index=4,
    containing_service=None,
    input_type=_REQUESTFACILITYREQUESTREQUEST,
    output_type=_FACILITYREQUEST,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ApproveFacilityRequest',
    full_name='hts.facility.FacilityService.ApproveFacilityRequest',
    index=5,
    containing_service=None,
    input_type=_APPROVEFACILITYREQUESTREQUEST,
    output_type=hts_dot_common_dot_common__pb2._RESULT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='RejectFacilityRequest',
    full_name='hts.facility.FacilityService.RejectFacilityRequest',
    index=6,
    containing_service=None,
    input_type=_REJECTFACILITYREQUESTREQUEST,
    output_type=hts_dot_common_dot_common__pb2._RESULT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetFacilityInfo',
    full_name='hts.facility.FacilityService.GetFacilityInfo',
    index=7,
    containing_service=None,
    input_type=_GETFACILITYINFOREQUEST,
    output_type=_FACILITY,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_FACILITYSERVICE)

DESCRIPTOR.services_by_name['FacilityService'] = _FACILITYSERVICE

# @@protoc_insertion_point(module_scope)

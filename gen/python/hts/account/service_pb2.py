# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: hts/account/service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from hts.common import common_pb2 as hts_dot_common_dot_common__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='hts/account/service.proto',
  package='hts.account',
  syntax='proto3',
  serialized_options=b'\n\020app.onepass.apisB\014AccountProtoP\001Z onepass.app/facility/hts/account',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x19hts/account/service.proto\x12\x0bhts.account\x1a\x17hts/common/common.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1egoogle/protobuf/wrappers.proto\"-\n\x12\x41\x63\x63\x65ssTokenPayload\x12\x17\n\x07user_id\x18\x01 \x01(\x05R\x06userId\";\n\x16IsAuthenticatedRequest\x12!\n\x0c\x61\x63\x63\x65ss_token\x18\x01 \x01(\tR\x0b\x61\x63\x63\x65ssToken\"5\n\x1aGenerateAccessTokenRequest\x12\x17\n\x07user_id\x18\x01 \x01(\x05R\x06userId\"@\n\x1bGenerateAccessTokenResponse\x12!\n\x0c\x61\x63\x63\x65ss_token\x18\x01 \x01(\tR\x0b\x61\x63\x63\x65ssToken\"\x99\x01\n\x14HasPermissionRequest\x12\x17\n\x07user_id\x18\x01 \x01(\x05R\x06userId\x12\'\n\x0forganization_id\x18\x02 \x01(\x05R\x0eorganizationId\x12?\n\x0fpermission_name\x18\x03 \x01(\x0e\x32\x16.hts.common.PermissionR\x0epermissionName\"\xaa\x01\n\x11\x43reateUserRequest\x12\x1d\n\nfirst_name\x18\x01 \x01(\tR\tfirstName\x12\x1b\n\tlast_name\x18\x02 \x01(\tR\x08lastName\x12\x19\n\x08\x63hula_id\x18\x03 \x01(\tR\x07\x63hulaId\x12\x14\n\x05\x65mail\x18\x04 \x01(\tR\x05\x65mail\x12(\n\x10is_chula_student\x18\x05 \x01(\x08R\x0eisChulaStudent\")\n\x17GetUserByChulaIdRequest\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\"-\n\x15GetUserByEmailRequest\x12\x14\n\x05\x65mail\x18\x01 \x01(\tR\x05\x65mail\"|\n\x11\x41ssignRoleRequest\x12\x17\n\x07user_id\x18\x01 \x01(\x05R\x06userId\x12\'\n\x0forganization_id\x18\x02 \x01(\x05R\x0eorganizationId\x12%\n\x04role\x18\x03 \x01(\x0e\x32\x11.hts.account.RoleR\x04role\"|\n\x11RemoveRoleRequest\x12\x17\n\x07user_id\x18\x01 \x01(\x05R\x06userId\x12\'\n\x0forganization_id\x18\x02 \x01(\x05R\x0eorganizationId\x12%\n\x04role\x18\x03 \x01(\x0e\x32\x11.hts.account.RoleR\x04role\"N\n\x1aUpdateUserInterestsRequest\x12\x17\n\x07user_id\x18\x01 \x01(\x05R\x06userId\x12\x17\n\x07tag_ids\x18\x02 \x03(\x05R\x06tagIds*f\n\x04Role\x12\x14\n\x10ROLE_UNSPECIFIED\x10\x00\x12\x16\n\x12ORGANIZATION_OWNER\x10\x01\x12\x17\n\x13ORGANIZATION_EDITOR\x10\x02\x12\x17\n\x13ORGANIZATION_MEMBER\x10\x03\x32\x90\x07\n\x0e\x41\x63\x63ountService\x12>\n\nCreateUser\x12\x1e.hts.account.CreateUserRequest\x1a\x10.hts.common.User\x12J\n\x10GetUserByChulaId\x12$.hts.account.GetUserByChulaIdRequest\x1a\x10.hts.common.User\x12\x46\n\x0eGetUserByEmail\x12\".hts.account.GetUserByEmailRequest\x1a\x10.hts.common.User\x12R\n\x0fIsAuthenticated\x12#.hts.account.IsAuthenticatedRequest\x1a\x1a.google.protobuf.BoolValue\x12\x37\n\x11UpdateAccountInfo\x12\x10.hts.common.User\x1a\x10.hts.common.User\x12P\n\x13UpdateUserInterests\x12\'.hts.account.UpdateUserInterestsRequest\x1a\x10.hts.common.User\x12\x41\n\x0bGetUserById\x12 .hts.common.GetObjectByIdRequest\x1a\x10.hts.common.User\x12h\n\x13GenerateAccessToken\x12\'.hts.account.GenerateAccessTokenRequest\x1a(.hts.account.GenerateAccessTokenResponse\x12N\n\rHasPermission\x12!.hts.account.HasPermissionRequest\x1a\x1a.google.protobuf.BoolValue\x12H\n\nAssignRole\x12\x1e.hts.account.AssignRoleRequest\x1a\x1a.google.protobuf.BoolValue\x12H\n\nRemoveRole\x12\x1e.hts.account.RemoveRoleRequest\x1a\x1a.google.protobuf.BoolValue\x12:\n\x04Ping\x12\x16.google.protobuf.Empty\x1a\x1a.google.protobuf.BoolValueBD\n\x10\x61pp.onepass.apisB\x0c\x41\x63\x63ountProtoP\x01Z onepass.app/facility/hts/accountb\x06proto3'
  ,
  dependencies=[hts_dot_common_dot_common__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,])

_ROLE = _descriptor.EnumDescriptor(
  name='Role',
  full_name='hts.account.Role',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ROLE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ORGANIZATION_OWNER', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ORGANIZATION_EDITOR', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ORGANIZATION_MEMBER', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1108,
  serialized_end=1210,
)
_sym_db.RegisterEnumDescriptor(_ROLE)

Role = enum_type_wrapper.EnumTypeWrapper(_ROLE)
ROLE_UNSPECIFIED = 0
ORGANIZATION_OWNER = 1
ORGANIZATION_EDITOR = 2
ORGANIZATION_MEMBER = 3



_ACCESSTOKENPAYLOAD = _descriptor.Descriptor(
  name='AccessTokenPayload',
  full_name='hts.account.AccessTokenPayload',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='hts.account.AccessTokenPayload.user_id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='userId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=128,
  serialized_end=173,
)


_ISAUTHENTICATEDREQUEST = _descriptor.Descriptor(
  name='IsAuthenticatedRequest',
  full_name='hts.account.IsAuthenticatedRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='access_token', full_name='hts.account.IsAuthenticatedRequest.access_token', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='accessToken', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=175,
  serialized_end=234,
)


_GENERATEACCESSTOKENREQUEST = _descriptor.Descriptor(
  name='GenerateAccessTokenRequest',
  full_name='hts.account.GenerateAccessTokenRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='hts.account.GenerateAccessTokenRequest.user_id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='userId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=236,
  serialized_end=289,
)


_GENERATEACCESSTOKENRESPONSE = _descriptor.Descriptor(
  name='GenerateAccessTokenResponse',
  full_name='hts.account.GenerateAccessTokenResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='access_token', full_name='hts.account.GenerateAccessTokenResponse.access_token', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='accessToken', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=291,
  serialized_end=355,
)


_HASPERMISSIONREQUEST = _descriptor.Descriptor(
  name='HasPermissionRequest',
  full_name='hts.account.HasPermissionRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='hts.account.HasPermissionRequest.user_id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='userId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='organization_id', full_name='hts.account.HasPermissionRequest.organization_id', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='organizationId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='permission_name', full_name='hts.account.HasPermissionRequest.permission_name', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='permissionName', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=358,
  serialized_end=511,
)


_CREATEUSERREQUEST = _descriptor.Descriptor(
  name='CreateUserRequest',
  full_name='hts.account.CreateUserRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='first_name', full_name='hts.account.CreateUserRequest.first_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='firstName', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='last_name', full_name='hts.account.CreateUserRequest.last_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='lastName', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='chula_id', full_name='hts.account.CreateUserRequest.chula_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='chulaId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='email', full_name='hts.account.CreateUserRequest.email', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='email', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='is_chula_student', full_name='hts.account.CreateUserRequest.is_chula_student', index=4,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='isChulaStudent', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=514,
  serialized_end=684,
)


_GETUSERBYCHULAIDREQUEST = _descriptor.Descriptor(
  name='GetUserByChulaIdRequest',
  full_name='hts.account.GetUserByChulaIdRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='hts.account.GetUserByChulaIdRequest.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='id', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=686,
  serialized_end=727,
)


_GETUSERBYEMAILREQUEST = _descriptor.Descriptor(
  name='GetUserByEmailRequest',
  full_name='hts.account.GetUserByEmailRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='email', full_name='hts.account.GetUserByEmailRequest.email', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='email', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=729,
  serialized_end=774,
)


_ASSIGNROLEREQUEST = _descriptor.Descriptor(
  name='AssignRoleRequest',
  full_name='hts.account.AssignRoleRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='hts.account.AssignRoleRequest.user_id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='userId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='organization_id', full_name='hts.account.AssignRoleRequest.organization_id', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='organizationId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='role', full_name='hts.account.AssignRoleRequest.role', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='role', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=776,
  serialized_end=900,
)


_REMOVEROLEREQUEST = _descriptor.Descriptor(
  name='RemoveRoleRequest',
  full_name='hts.account.RemoveRoleRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='hts.account.RemoveRoleRequest.user_id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='userId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='organization_id', full_name='hts.account.RemoveRoleRequest.organization_id', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='organizationId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='role', full_name='hts.account.RemoveRoleRequest.role', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='role', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=902,
  serialized_end=1026,
)


_UPDATEUSERINTERESTSREQUEST = _descriptor.Descriptor(
  name='UpdateUserInterestsRequest',
  full_name='hts.account.UpdateUserInterestsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='hts.account.UpdateUserInterestsRequest.user_id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='userId', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tag_ids', full_name='hts.account.UpdateUserInterestsRequest.tag_ids', index=1,
      number=2, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='tagIds', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1028,
  serialized_end=1106,
)

_HASPERMISSIONREQUEST.fields_by_name['permission_name'].enum_type = hts_dot_common_dot_common__pb2._PERMISSION
_ASSIGNROLEREQUEST.fields_by_name['role'].enum_type = _ROLE
_REMOVEROLEREQUEST.fields_by_name['role'].enum_type = _ROLE
DESCRIPTOR.message_types_by_name['AccessTokenPayload'] = _ACCESSTOKENPAYLOAD
DESCRIPTOR.message_types_by_name['IsAuthenticatedRequest'] = _ISAUTHENTICATEDREQUEST
DESCRIPTOR.message_types_by_name['GenerateAccessTokenRequest'] = _GENERATEACCESSTOKENREQUEST
DESCRIPTOR.message_types_by_name['GenerateAccessTokenResponse'] = _GENERATEACCESSTOKENRESPONSE
DESCRIPTOR.message_types_by_name['HasPermissionRequest'] = _HASPERMISSIONREQUEST
DESCRIPTOR.message_types_by_name['CreateUserRequest'] = _CREATEUSERREQUEST
DESCRIPTOR.message_types_by_name['GetUserByChulaIdRequest'] = _GETUSERBYCHULAIDREQUEST
DESCRIPTOR.message_types_by_name['GetUserByEmailRequest'] = _GETUSERBYEMAILREQUEST
DESCRIPTOR.message_types_by_name['AssignRoleRequest'] = _ASSIGNROLEREQUEST
DESCRIPTOR.message_types_by_name['RemoveRoleRequest'] = _REMOVEROLEREQUEST
DESCRIPTOR.message_types_by_name['UpdateUserInterestsRequest'] = _UPDATEUSERINTERESTSREQUEST
DESCRIPTOR.enum_types_by_name['Role'] = _ROLE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AccessTokenPayload = _reflection.GeneratedProtocolMessageType('AccessTokenPayload', (_message.Message,), {
  'DESCRIPTOR' : _ACCESSTOKENPAYLOAD,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.AccessTokenPayload)
  })
_sym_db.RegisterMessage(AccessTokenPayload)

IsAuthenticatedRequest = _reflection.GeneratedProtocolMessageType('IsAuthenticatedRequest', (_message.Message,), {
  'DESCRIPTOR' : _ISAUTHENTICATEDREQUEST,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.IsAuthenticatedRequest)
  })
_sym_db.RegisterMessage(IsAuthenticatedRequest)

GenerateAccessTokenRequest = _reflection.GeneratedProtocolMessageType('GenerateAccessTokenRequest', (_message.Message,), {
  'DESCRIPTOR' : _GENERATEACCESSTOKENREQUEST,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.GenerateAccessTokenRequest)
  })
_sym_db.RegisterMessage(GenerateAccessTokenRequest)

GenerateAccessTokenResponse = _reflection.GeneratedProtocolMessageType('GenerateAccessTokenResponse', (_message.Message,), {
  'DESCRIPTOR' : _GENERATEACCESSTOKENRESPONSE,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.GenerateAccessTokenResponse)
  })
_sym_db.RegisterMessage(GenerateAccessTokenResponse)

HasPermissionRequest = _reflection.GeneratedProtocolMessageType('HasPermissionRequest', (_message.Message,), {
  'DESCRIPTOR' : _HASPERMISSIONREQUEST,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.HasPermissionRequest)
  })
_sym_db.RegisterMessage(HasPermissionRequest)

CreateUserRequest = _reflection.GeneratedProtocolMessageType('CreateUserRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEUSERREQUEST,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.CreateUserRequest)
  })
_sym_db.RegisterMessage(CreateUserRequest)

GetUserByChulaIdRequest = _reflection.GeneratedProtocolMessageType('GetUserByChulaIdRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETUSERBYCHULAIDREQUEST,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.GetUserByChulaIdRequest)
  })
_sym_db.RegisterMessage(GetUserByChulaIdRequest)

GetUserByEmailRequest = _reflection.GeneratedProtocolMessageType('GetUserByEmailRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETUSERBYEMAILREQUEST,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.GetUserByEmailRequest)
  })
_sym_db.RegisterMessage(GetUserByEmailRequest)

AssignRoleRequest = _reflection.GeneratedProtocolMessageType('AssignRoleRequest', (_message.Message,), {
  'DESCRIPTOR' : _ASSIGNROLEREQUEST,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.AssignRoleRequest)
  })
_sym_db.RegisterMessage(AssignRoleRequest)

RemoveRoleRequest = _reflection.GeneratedProtocolMessageType('RemoveRoleRequest', (_message.Message,), {
  'DESCRIPTOR' : _REMOVEROLEREQUEST,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.RemoveRoleRequest)
  })
_sym_db.RegisterMessage(RemoveRoleRequest)

UpdateUserInterestsRequest = _reflection.GeneratedProtocolMessageType('UpdateUserInterestsRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEUSERINTERESTSREQUEST,
  '__module__' : 'hts.account.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.account.UpdateUserInterestsRequest)
  })
_sym_db.RegisterMessage(UpdateUserInterestsRequest)


DESCRIPTOR._options = None

_ACCOUNTSERVICE = _descriptor.ServiceDescriptor(
  name='AccountService',
  full_name='hts.account.AccountService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=1213,
  serialized_end=2125,
  methods=[
  _descriptor.MethodDescriptor(
    name='CreateUser',
    full_name='hts.account.AccountService.CreateUser',
    index=0,
    containing_service=None,
    input_type=_CREATEUSERREQUEST,
    output_type=hts_dot_common_dot_common__pb2._USER,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetUserByChulaId',
    full_name='hts.account.AccountService.GetUserByChulaId',
    index=1,
    containing_service=None,
    input_type=_GETUSERBYCHULAIDREQUEST,
    output_type=hts_dot_common_dot_common__pb2._USER,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetUserByEmail',
    full_name='hts.account.AccountService.GetUserByEmail',
    index=2,
    containing_service=None,
    input_type=_GETUSERBYEMAILREQUEST,
    output_type=hts_dot_common_dot_common__pb2._USER,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='IsAuthenticated',
    full_name='hts.account.AccountService.IsAuthenticated',
    index=3,
    containing_service=None,
    input_type=_ISAUTHENTICATEDREQUEST,
    output_type=google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateAccountInfo',
    full_name='hts.account.AccountService.UpdateAccountInfo',
    index=4,
    containing_service=None,
    input_type=hts_dot_common_dot_common__pb2._USER,
    output_type=hts_dot_common_dot_common__pb2._USER,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateUserInterests',
    full_name='hts.account.AccountService.UpdateUserInterests',
    index=5,
    containing_service=None,
    input_type=_UPDATEUSERINTERESTSREQUEST,
    output_type=hts_dot_common_dot_common__pb2._USER,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetUserById',
    full_name='hts.account.AccountService.GetUserById',
    index=6,
    containing_service=None,
    input_type=hts_dot_common_dot_common__pb2._GETOBJECTBYIDREQUEST,
    output_type=hts_dot_common_dot_common__pb2._USER,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GenerateAccessToken',
    full_name='hts.account.AccountService.GenerateAccessToken',
    index=7,
    containing_service=None,
    input_type=_GENERATEACCESSTOKENREQUEST,
    output_type=_GENERATEACCESSTOKENRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='HasPermission',
    full_name='hts.account.AccountService.HasPermission',
    index=8,
    containing_service=None,
    input_type=_HASPERMISSIONREQUEST,
    output_type=google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='AssignRole',
    full_name='hts.account.AccountService.AssignRole',
    index=9,
    containing_service=None,
    input_type=_ASSIGNROLEREQUEST,
    output_type=google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='RemoveRole',
    full_name='hts.account.AccountService.RemoveRole',
    index=10,
    containing_service=None,
    input_type=_REMOVEROLEREQUEST,
    output_type=google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='Ping',
    full_name='hts.account.AccountService.Ping',
    index=11,
    containing_service=None,
    input_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    output_type=google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ACCOUNTSERVICE)

DESCRIPTOR.services_by_name['AccountService'] = _ACCOUNTSERVICE

# @@protoc_insertion_point(module_scope)

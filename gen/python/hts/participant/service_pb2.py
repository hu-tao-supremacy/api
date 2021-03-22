# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: hts/participant/service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from hts.common import common_pb2 as hts_dot_common_dot_common__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='hts/participant/service.proto',
  package='hts.participant',
  syntax='proto3',
  serialized_options=b'\n\020app.onepass.apisB\020ParticipantProtoP\001Z$onepass.app/facility/hts/participant',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1dhts/participant/service.proto\x12\x0fhts.participant\x1a\x17hts/common/common.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"I\n\x11GenerateQRRequest\x12\x34\n\nuser_event\x18\x01 \x01(\x0b\x32\x15.hts.common.UserEventR\tuserEvent\",\n\x0fGetEventRequest\x12\x19\n\x08\x65vent_id\x18\x01 \x01(\x03R\x07\x65ventId\"(\n\x12StringInputRequest\x12\x12\n\x04text\x18\x01 \x01(\tR\x04text\"e\n\x14UserWithEventRequest\x12$\n\x04user\x18\x01 \x01(\x0b\x32\x10.hts.common.UserR\x04user\x12\'\n\x05\x65vent\x18\x02 \x01(\x0b\x32\x11.hts.common.EventR\x05\x65vent\"t\n\x15\x43reateFeedbackRequest\x12$\n\x04user\x18\x01 \x01(\x0b\x32\x10.hts.common.UserR\x04user\x12\x35\n\x08\x66\x65\x65\x64\x62\x61\x63k\x18\x02 \x01(\x0b\x32\x19.hts.common.EventFeedbackR\x08\x66\x65\x65\x64\x62\x61\x63k\"(\n\x12GenerateQRResponse\x12\x12\n\x04\x64\x61ta\x18\x01 \x01(\tR\x04\x64\x61ta\"a\n\x1dGetFeedbacksFromEventResponse\x12@\n\x0e\x65vent_feedback\x18\x01 \x03(\x0b\x32\x19.hts.common.EventFeedbackR\reventFeedback\"9\n\x0e\x45ventsResponse\x12\'\n\x05\x65vent\x18\x01 \x03(\x0b\x32\x11.hts.common.EventR\x05\x65vent\"r\n\x17IsEventAvailableRequest\x12\'\n\x05\x65vent\x18\x01 \x01(\x0b\x32\x11.hts.common.EventR\x05\x65vent\x12.\n\x04\x64\x61te\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\x04\x64\x61te2\x94\x0b\n\x12ParticipantService\x12P\n\x10IsEventAvailable\x12(.hts.participant.IsEventAvailableRequest\x1a\x12.hts.common.Result\x12\x45\n\tJoinEvent\x12%.hts.participant.UserWithEventRequest\x1a\x11.hts.common.Event\x12G\n\x0b\x43\x61ncelEvent\x12%.hts.participant.UserWithEventRequest\x1a\x11.hts.common.Event\x12S\n\x0e\x43reateFeedback\x12&.hts.participant.CreateFeedbackRequest\x1a\x19.hts.common.EventFeedback\x12U\n\x11HasSubmitFeedback\x12%.hts.participant.UserWithEventRequest\x1a\x19.hts.common.EventFeedback\x12\x46\n\x0eRemoveFeedback\x12\x19.hts.common.EventFeedback\x1a\x19.hts.common.EventFeedback\x12Z\n\x15GetFeedbacksFromEvent\x12\x11.hts.common.Event\x1a..hts.participant.GetFeedbacksFromEventResponse\x12\\\n\x18GetUserFeedbackFromEvent\x12%.hts.participant.UserWithEventRequest\x1a\x19.hts.common.EventFeedback\x12?\n\x08GetEvent\x12 .hts.participant.GetEventRequest\x1a\x11.hts.common.Event\x12G\n\x0cGetAllEvents\x12\x16.google.protobuf.Empty\x1a\x1f.hts.participant.EventsResponse\x12M\n\x12GetSuggestedEvents\x12\x16.google.protobuf.Empty\x1a\x1f.hts.participant.EventsResponse\x12_\n\x17GetEventsByStringOfName\x12#.hts.participant.StringInputRequest\x1a\x1f.hts.participant.EventsResponse\x12\x42\n\x0eGetEventsByTag\x12\x0f.hts.common.Tag\x1a\x1f.hts.participant.EventsResponse\x12T\n\x17GetEventsByOrganization\x12\x18.hts.common.Organization\x1a\x1f.hts.participant.EventsResponse\x12L\n\x13GetEventsByFacility\x12\x14.hts.common.Facility\x1a\x1f.hts.participant.EventsResponse\x12N\n\x0fGetEventsByDate\x12\x1a.google.protobuf.Timestamp\x1a\x1f.hts.participant.EventsResponse\x12H\n\nGenerateQR\x12\x15.hts.common.UserEvent\x1a#.hts.participant.GenerateQRResponse\x12\x32\n\x04Ping\x12\x16.google.protobuf.Empty\x1a\x12.hts.common.ResultBL\n\x10\x61pp.onepass.apisB\x10ParticipantProtoP\x01Z$onepass.app/facility/hts/participantb\x06proto3'
  ,
  dependencies=[hts_dot_common_dot_common__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])




_GENERATEQRREQUEST = _descriptor.Descriptor(
  name='GenerateQRRequest',
  full_name='hts.participant.GenerateQRRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_event', full_name='hts.participant.GenerateQRRequest.user_event', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='userEvent', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=137,
  serialized_end=210,
)


_GETEVENTREQUEST = _descriptor.Descriptor(
  name='GetEventRequest',
  full_name='hts.participant.GetEventRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='event_id', full_name='hts.participant.GetEventRequest.event_id', index=0,
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
  serialized_start=212,
  serialized_end=256,
)


_STRINGINPUTREQUEST = _descriptor.Descriptor(
  name='StringInputRequest',
  full_name='hts.participant.StringInputRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='text', full_name='hts.participant.StringInputRequest.text', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='text', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=258,
  serialized_end=298,
)


_USERWITHEVENTREQUEST = _descriptor.Descriptor(
  name='UserWithEventRequest',
  full_name='hts.participant.UserWithEventRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user', full_name='hts.participant.UserWithEventRequest.user', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='user', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='event', full_name='hts.participant.UserWithEventRequest.event', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='event', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=300,
  serialized_end=401,
)


_CREATEFEEDBACKREQUEST = _descriptor.Descriptor(
  name='CreateFeedbackRequest',
  full_name='hts.participant.CreateFeedbackRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user', full_name='hts.participant.CreateFeedbackRequest.user', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='user', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feedback', full_name='hts.participant.CreateFeedbackRequest.feedback', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='feedback', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=403,
  serialized_end=519,
)


_GENERATEQRRESPONSE = _descriptor.Descriptor(
  name='GenerateQRResponse',
  full_name='hts.participant.GenerateQRResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='data', full_name='hts.participant.GenerateQRResponse.data', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='data', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=521,
  serialized_end=561,
)


_GETFEEDBACKSFROMEVENTRESPONSE = _descriptor.Descriptor(
  name='GetFeedbacksFromEventResponse',
  full_name='hts.participant.GetFeedbacksFromEventResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='event_feedback', full_name='hts.participant.GetFeedbacksFromEventResponse.event_feedback', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='eventFeedback', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=563,
  serialized_end=660,
)


_EVENTSRESPONSE = _descriptor.Descriptor(
  name='EventsResponse',
  full_name='hts.participant.EventsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='event', full_name='hts.participant.EventsResponse.event', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='event', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=662,
  serialized_end=719,
)


_ISEVENTAVAILABLEREQUEST = _descriptor.Descriptor(
  name='IsEventAvailableRequest',
  full_name='hts.participant.IsEventAvailableRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='event', full_name='hts.participant.IsEventAvailableRequest.event', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='event', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='date', full_name='hts.participant.IsEventAvailableRequest.date', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='date', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=721,
  serialized_end=835,
)

_GENERATEQRREQUEST.fields_by_name['user_event'].message_type = hts_dot_common_dot_common__pb2._USEREVENT
_USERWITHEVENTREQUEST.fields_by_name['user'].message_type = hts_dot_common_dot_common__pb2._USER
_USERWITHEVENTREQUEST.fields_by_name['event'].message_type = hts_dot_common_dot_common__pb2._EVENT
_CREATEFEEDBACKREQUEST.fields_by_name['user'].message_type = hts_dot_common_dot_common__pb2._USER
_CREATEFEEDBACKREQUEST.fields_by_name['feedback'].message_type = hts_dot_common_dot_common__pb2._EVENTFEEDBACK
_GETFEEDBACKSFROMEVENTRESPONSE.fields_by_name['event_feedback'].message_type = hts_dot_common_dot_common__pb2._EVENTFEEDBACK
_EVENTSRESPONSE.fields_by_name['event'].message_type = hts_dot_common_dot_common__pb2._EVENT
_ISEVENTAVAILABLEREQUEST.fields_by_name['event'].message_type = hts_dot_common_dot_common__pb2._EVENT
_ISEVENTAVAILABLEREQUEST.fields_by_name['date'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
DESCRIPTOR.message_types_by_name['GenerateQRRequest'] = _GENERATEQRREQUEST
DESCRIPTOR.message_types_by_name['GetEventRequest'] = _GETEVENTREQUEST
DESCRIPTOR.message_types_by_name['StringInputRequest'] = _STRINGINPUTREQUEST
DESCRIPTOR.message_types_by_name['UserWithEventRequest'] = _USERWITHEVENTREQUEST
DESCRIPTOR.message_types_by_name['CreateFeedbackRequest'] = _CREATEFEEDBACKREQUEST
DESCRIPTOR.message_types_by_name['GenerateQRResponse'] = _GENERATEQRRESPONSE
DESCRIPTOR.message_types_by_name['GetFeedbacksFromEventResponse'] = _GETFEEDBACKSFROMEVENTRESPONSE
DESCRIPTOR.message_types_by_name['EventsResponse'] = _EVENTSRESPONSE
DESCRIPTOR.message_types_by_name['IsEventAvailableRequest'] = _ISEVENTAVAILABLEREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GenerateQRRequest = _reflection.GeneratedProtocolMessageType('GenerateQRRequest', (_message.Message,), {
  'DESCRIPTOR' : _GENERATEQRREQUEST,
  '__module__' : 'hts.participant.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.participant.GenerateQRRequest)
  })
_sym_db.RegisterMessage(GenerateQRRequest)

GetEventRequest = _reflection.GeneratedProtocolMessageType('GetEventRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETEVENTREQUEST,
  '__module__' : 'hts.participant.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.participant.GetEventRequest)
  })
_sym_db.RegisterMessage(GetEventRequest)

StringInputRequest = _reflection.GeneratedProtocolMessageType('StringInputRequest', (_message.Message,), {
  'DESCRIPTOR' : _STRINGINPUTREQUEST,
  '__module__' : 'hts.participant.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.participant.StringInputRequest)
  })
_sym_db.RegisterMessage(StringInputRequest)

UserWithEventRequest = _reflection.GeneratedProtocolMessageType('UserWithEventRequest', (_message.Message,), {
  'DESCRIPTOR' : _USERWITHEVENTREQUEST,
  '__module__' : 'hts.participant.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.participant.UserWithEventRequest)
  })
_sym_db.RegisterMessage(UserWithEventRequest)

CreateFeedbackRequest = _reflection.GeneratedProtocolMessageType('CreateFeedbackRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEFEEDBACKREQUEST,
  '__module__' : 'hts.participant.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.participant.CreateFeedbackRequest)
  })
_sym_db.RegisterMessage(CreateFeedbackRequest)

GenerateQRResponse = _reflection.GeneratedProtocolMessageType('GenerateQRResponse', (_message.Message,), {
  'DESCRIPTOR' : _GENERATEQRRESPONSE,
  '__module__' : 'hts.participant.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.participant.GenerateQRResponse)
  })
_sym_db.RegisterMessage(GenerateQRResponse)

GetFeedbacksFromEventResponse = _reflection.GeneratedProtocolMessageType('GetFeedbacksFromEventResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETFEEDBACKSFROMEVENTRESPONSE,
  '__module__' : 'hts.participant.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.participant.GetFeedbacksFromEventResponse)
  })
_sym_db.RegisterMessage(GetFeedbacksFromEventResponse)

EventsResponse = _reflection.GeneratedProtocolMessageType('EventsResponse', (_message.Message,), {
  'DESCRIPTOR' : _EVENTSRESPONSE,
  '__module__' : 'hts.participant.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.participant.EventsResponse)
  })
_sym_db.RegisterMessage(EventsResponse)

IsEventAvailableRequest = _reflection.GeneratedProtocolMessageType('IsEventAvailableRequest', (_message.Message,), {
  'DESCRIPTOR' : _ISEVENTAVAILABLEREQUEST,
  '__module__' : 'hts.participant.service_pb2'
  # @@protoc_insertion_point(class_scope:hts.participant.IsEventAvailableRequest)
  })
_sym_db.RegisterMessage(IsEventAvailableRequest)


DESCRIPTOR._options = None

_PARTICIPANTSERVICE = _descriptor.ServiceDescriptor(
  name='ParticipantService',
  full_name='hts.participant.ParticipantService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=838,
  serialized_end=2266,
  methods=[
  _descriptor.MethodDescriptor(
    name='IsEventAvailable',
    full_name='hts.participant.ParticipantService.IsEventAvailable',
    index=0,
    containing_service=None,
    input_type=_ISEVENTAVAILABLEREQUEST,
    output_type=hts_dot_common_dot_common__pb2._RESULT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='JoinEvent',
    full_name='hts.participant.ParticipantService.JoinEvent',
    index=1,
    containing_service=None,
    input_type=_USERWITHEVENTREQUEST,
    output_type=hts_dot_common_dot_common__pb2._EVENT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CancelEvent',
    full_name='hts.participant.ParticipantService.CancelEvent',
    index=2,
    containing_service=None,
    input_type=_USERWITHEVENTREQUEST,
    output_type=hts_dot_common_dot_common__pb2._EVENT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateFeedback',
    full_name='hts.participant.ParticipantService.CreateFeedback',
    index=3,
    containing_service=None,
    input_type=_CREATEFEEDBACKREQUEST,
    output_type=hts_dot_common_dot_common__pb2._EVENTFEEDBACK,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='HasSubmitFeedback',
    full_name='hts.participant.ParticipantService.HasSubmitFeedback',
    index=4,
    containing_service=None,
    input_type=_USERWITHEVENTREQUEST,
    output_type=hts_dot_common_dot_common__pb2._EVENTFEEDBACK,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='RemoveFeedback',
    full_name='hts.participant.ParticipantService.RemoveFeedback',
    index=5,
    containing_service=None,
    input_type=hts_dot_common_dot_common__pb2._EVENTFEEDBACK,
    output_type=hts_dot_common_dot_common__pb2._EVENTFEEDBACK,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetFeedbacksFromEvent',
    full_name='hts.participant.ParticipantService.GetFeedbacksFromEvent',
    index=6,
    containing_service=None,
    input_type=hts_dot_common_dot_common__pb2._EVENT,
    output_type=_GETFEEDBACKSFROMEVENTRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetUserFeedbackFromEvent',
    full_name='hts.participant.ParticipantService.GetUserFeedbackFromEvent',
    index=7,
    containing_service=None,
    input_type=_USERWITHEVENTREQUEST,
    output_type=hts_dot_common_dot_common__pb2._EVENTFEEDBACK,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetEvent',
    full_name='hts.participant.ParticipantService.GetEvent',
    index=8,
    containing_service=None,
    input_type=_GETEVENTREQUEST,
    output_type=hts_dot_common_dot_common__pb2._EVENT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetAllEvents',
    full_name='hts.participant.ParticipantService.GetAllEvents',
    index=9,
    containing_service=None,
    input_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    output_type=_EVENTSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetSuggestedEvents',
    full_name='hts.participant.ParticipantService.GetSuggestedEvents',
    index=10,
    containing_service=None,
    input_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    output_type=_EVENTSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetEventsByStringOfName',
    full_name='hts.participant.ParticipantService.GetEventsByStringOfName',
    index=11,
    containing_service=None,
    input_type=_STRINGINPUTREQUEST,
    output_type=_EVENTSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetEventsByTag',
    full_name='hts.participant.ParticipantService.GetEventsByTag',
    index=12,
    containing_service=None,
    input_type=hts_dot_common_dot_common__pb2._TAG,
    output_type=_EVENTSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetEventsByOrganization',
    full_name='hts.participant.ParticipantService.GetEventsByOrganization',
    index=13,
    containing_service=None,
    input_type=hts_dot_common_dot_common__pb2._ORGANIZATION,
    output_type=_EVENTSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetEventsByFacility',
    full_name='hts.participant.ParticipantService.GetEventsByFacility',
    index=14,
    containing_service=None,
    input_type=hts_dot_common_dot_common__pb2._FACILITY,
    output_type=_EVENTSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetEventsByDate',
    full_name='hts.participant.ParticipantService.GetEventsByDate',
    index=15,
    containing_service=None,
    input_type=google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP,
    output_type=_EVENTSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GenerateQR',
    full_name='hts.participant.ParticipantService.GenerateQR',
    index=16,
    containing_service=None,
    input_type=hts_dot_common_dot_common__pb2._USEREVENT,
    output_type=_GENERATEQRRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='Ping',
    full_name='hts.participant.ParticipantService.Ping',
    index=17,
    containing_service=None,
    input_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    output_type=hts_dot_common_dot_common__pb2._RESULT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_PARTICIPANTSERVICE)

DESCRIPTOR.services_by_name['ParticipantService'] = _PARTICIPANTSERVICE

# @@protoc_insertion_point(module_scope)

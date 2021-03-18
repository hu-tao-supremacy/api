// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var hts_participant_service_pb = require('../../hts/participant/service_pb.js');
var hts_common_common_pb = require('../../hts/common/common_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_google_protobuf_Empty(arg) {
  if (!(arg instanceof google_protobuf_empty_pb.Empty)) {
    throw new Error('Expected argument of type google.protobuf.Empty');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_google_protobuf_Empty(buffer_arg) {
  return google_protobuf_empty_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_common_Event(arg) {
  if (!(arg instanceof hts_common_common_pb.Event)) {
    throw new Error('Expected argument of type hts.common.Event');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_common_Event(buffer_arg) {
  return hts_common_common_pb.Event.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_common_EventFeedback(arg) {
  if (!(arg instanceof hts_common_common_pb.EventFeedback)) {
    throw new Error('Expected argument of type hts.common.EventFeedback');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_common_EventFeedback(buffer_arg) {
  return hts_common_common_pb.EventFeedback.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_common_Facility(arg) {
  if (!(arg instanceof hts_common_common_pb.Facility)) {
    throw new Error('Expected argument of type hts.common.Facility');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_common_Facility(buffer_arg) {
  return hts_common_common_pb.Facility.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_common_Organization(arg) {
  if (!(arg instanceof hts_common_common_pb.Organization)) {
    throw new Error('Expected argument of type hts.common.Organization');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_common_Organization(buffer_arg) {
  return hts_common_common_pb.Organization.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_common_Result(arg) {
  if (!(arg instanceof hts_common_common_pb.Result)) {
    throw new Error('Expected argument of type hts.common.Result');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_common_Result(buffer_arg) {
  return hts_common_common_pb.Result.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_common_Tag(arg) {
  if (!(arg instanceof hts_common_common_pb.Tag)) {
    throw new Error('Expected argument of type hts.common.Tag');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_common_Tag(buffer_arg) {
  return hts_common_common_pb.Tag.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_common_UserEvent(arg) {
  if (!(arg instanceof hts_common_common_pb.UserEvent)) {
    throw new Error('Expected argument of type hts.common.UserEvent');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_common_UserEvent(buffer_arg) {
  return hts_common_common_pb.UserEvent.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_participant_CreateFeedbackRequest(arg) {
  if (!(arg instanceof hts_participant_service_pb.CreateFeedbackRequest)) {
    throw new Error('Expected argument of type hts.participant.CreateFeedbackRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_participant_CreateFeedbackRequest(buffer_arg) {
  return hts_participant_service_pb.CreateFeedbackRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_participant_EventsResponse(arg) {
  if (!(arg instanceof hts_participant_service_pb.EventsResponse)) {
    throw new Error('Expected argument of type hts.participant.EventsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_participant_EventsResponse(buffer_arg) {
  return hts_participant_service_pb.EventsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_participant_GenerateQRResponse(arg) {
  if (!(arg instanceof hts_participant_service_pb.GenerateQRResponse)) {
    throw new Error('Expected argument of type hts.participant.GenerateQRResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_participant_GenerateQRResponse(buffer_arg) {
  return hts_participant_service_pb.GenerateQRResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_participant_GetEventRequest(arg) {
  if (!(arg instanceof hts_participant_service_pb.GetEventRequest)) {
    throw new Error('Expected argument of type hts.participant.GetEventRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_participant_GetEventRequest(buffer_arg) {
  return hts_participant_service_pb.GetEventRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_participant_GetFeedbacksFromEventResponse(arg) {
  if (!(arg instanceof hts_participant_service_pb.GetFeedbacksFromEventResponse)) {
    throw new Error('Expected argument of type hts.participant.GetFeedbacksFromEventResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_participant_GetFeedbacksFromEventResponse(buffer_arg) {
  return hts_participant_service_pb.GetFeedbacksFromEventResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_participant_IsEventAvailableRequest(arg) {
  if (!(arg instanceof hts_participant_service_pb.IsEventAvailableRequest)) {
    throw new Error('Expected argument of type hts.participant.IsEventAvailableRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_participant_IsEventAvailableRequest(buffer_arg) {
  return hts_participant_service_pb.IsEventAvailableRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_participant_StringInputRequest(arg) {
  if (!(arg instanceof hts_participant_service_pb.StringInputRequest)) {
    throw new Error('Expected argument of type hts.participant.StringInputRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_participant_StringInputRequest(buffer_arg) {
  return hts_participant_service_pb.StringInputRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_participant_UserWithEventRequest(arg) {
  if (!(arg instanceof hts_participant_service_pb.UserWithEventRequest)) {
    throw new Error('Expected argument of type hts.participant.UserWithEventRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_participant_UserWithEventRequest(buffer_arg) {
  return hts_participant_service_pb.UserWithEventRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


var ParticipantServiceService = exports.ParticipantServiceService = {
  isEventAvailable: {
    path: '/hts.participant.ParticipantService/IsEventAvailable',
    requestStream: false,
    responseStream: false,
    requestType: hts_participant_service_pb.IsEventAvailableRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_participant_IsEventAvailableRequest,
    requestDeserialize: deserialize_hts_participant_IsEventAvailableRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  joinEvent: {
    path: '/hts.participant.ParticipantService/JoinEvent',
    requestStream: false,
    responseStream: false,
    requestType: hts_participant_service_pb.UserWithEventRequest,
    responseType: hts_common_common_pb.Event,
    requestSerialize: serialize_hts_participant_UserWithEventRequest,
    requestDeserialize: deserialize_hts_participant_UserWithEventRequest,
    responseSerialize: serialize_hts_common_Event,
    responseDeserialize: deserialize_hts_common_Event,
  },
  cancelEvent: {
    path: '/hts.participant.ParticipantService/CancelEvent',
    requestStream: false,
    responseStream: false,
    requestType: hts_participant_service_pb.UserWithEventRequest,
    responseType: hts_common_common_pb.Event,
    requestSerialize: serialize_hts_participant_UserWithEventRequest,
    requestDeserialize: deserialize_hts_participant_UserWithEventRequest,
    responseSerialize: serialize_hts_common_Event,
    responseDeserialize: deserialize_hts_common_Event,
  },
  createFeedback: {
    path: '/hts.participant.ParticipantService/CreateFeedback',
    requestStream: false,
    responseStream: false,
    requestType: hts_participant_service_pb.CreateFeedbackRequest,
    responseType: hts_common_common_pb.EventFeedback,
    requestSerialize: serialize_hts_participant_CreateFeedbackRequest,
    requestDeserialize: deserialize_hts_participant_CreateFeedbackRequest,
    responseSerialize: serialize_hts_common_EventFeedback,
    responseDeserialize: deserialize_hts_common_EventFeedback,
  },
  hasSubmitFeedback: {
    path: '/hts.participant.ParticipantService/HasSubmitFeedback',
    requestStream: false,
    responseStream: false,
    requestType: hts_participant_service_pb.UserWithEventRequest,
    responseType: hts_common_common_pb.EventFeedback,
    requestSerialize: serialize_hts_participant_UserWithEventRequest,
    requestDeserialize: deserialize_hts_participant_UserWithEventRequest,
    responseSerialize: serialize_hts_common_EventFeedback,
    responseDeserialize: deserialize_hts_common_EventFeedback,
  },
  removeFeedback: {
    path: '/hts.participant.ParticipantService/RemoveFeedback',
    requestStream: false,
    responseStream: false,
    requestType: hts_common_common_pb.EventFeedback,
    responseType: hts_common_common_pb.EventFeedback,
    requestSerialize: serialize_hts_common_EventFeedback,
    requestDeserialize: deserialize_hts_common_EventFeedback,
    responseSerialize: serialize_hts_common_EventFeedback,
    responseDeserialize: deserialize_hts_common_EventFeedback,
  },
  getFeedbacksFromEvent: {
    path: '/hts.participant.ParticipantService/GetFeedbacksFromEvent',
    requestStream: false,
    responseStream: false,
    requestType: hts_common_common_pb.Event,
    responseType: hts_participant_service_pb.GetFeedbacksFromEventResponse,
    requestSerialize: serialize_hts_common_Event,
    requestDeserialize: deserialize_hts_common_Event,
    responseSerialize: serialize_hts_participant_GetFeedbacksFromEventResponse,
    responseDeserialize: deserialize_hts_participant_GetFeedbacksFromEventResponse,
  },
  getUserFeedbackFromEvent: {
    path: '/hts.participant.ParticipantService/GetUserFeedbackFromEvent',
    requestStream: false,
    responseStream: false,
    requestType: hts_participant_service_pb.UserWithEventRequest,
    responseType: hts_common_common_pb.EventFeedback,
    requestSerialize: serialize_hts_participant_UserWithEventRequest,
    requestDeserialize: deserialize_hts_participant_UserWithEventRequest,
    responseSerialize: serialize_hts_common_EventFeedback,
    responseDeserialize: deserialize_hts_common_EventFeedback,
  },
  getEvent: {
    path: '/hts.participant.ParticipantService/GetEvent',
    requestStream: false,
    responseStream: false,
    requestType: hts_participant_service_pb.GetEventRequest,
    responseType: hts_common_common_pb.Event,
    requestSerialize: serialize_hts_participant_GetEventRequest,
    requestDeserialize: deserialize_hts_participant_GetEventRequest,
    responseSerialize: serialize_hts_common_Event,
    responseDeserialize: deserialize_hts_common_Event,
  },
  getAllEvents: {
    path: '/hts.participant.ParticipantService/GetAllEvents',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: hts_participant_service_pb.EventsResponse,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_hts_participant_EventsResponse,
    responseDeserialize: deserialize_hts_participant_EventsResponse,
  },
  getSuggestedEvents: {
    path: '/hts.participant.ParticipantService/GetSuggestedEvents',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: hts_participant_service_pb.EventsResponse,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_hts_participant_EventsResponse,
    responseDeserialize: deserialize_hts_participant_EventsResponse,
  },
  getEventsByStringOfName: {
    path: '/hts.participant.ParticipantService/GetEventsByStringOfName',
    requestStream: false,
    responseStream: false,
    requestType: hts_participant_service_pb.StringInputRequest,
    responseType: hts_participant_service_pb.EventsResponse,
    requestSerialize: serialize_hts_participant_StringInputRequest,
    requestDeserialize: deserialize_hts_participant_StringInputRequest,
    responseSerialize: serialize_hts_participant_EventsResponse,
    responseDeserialize: deserialize_hts_participant_EventsResponse,
  },
  getEventsByTag: {
    path: '/hts.participant.ParticipantService/GetEventsByTag',
    requestStream: false,
    responseStream: false,
    requestType: hts_common_common_pb.Tag,
    responseType: hts_participant_service_pb.EventsResponse,
    requestSerialize: serialize_hts_common_Tag,
    requestDeserialize: deserialize_hts_common_Tag,
    responseSerialize: serialize_hts_participant_EventsResponse,
    responseDeserialize: deserialize_hts_participant_EventsResponse,
  },
  getEventsByOrganization: {
    path: '/hts.participant.ParticipantService/GetEventsByOrganization',
    requestStream: false,
    responseStream: false,
    requestType: hts_common_common_pb.Organization,
    responseType: hts_participant_service_pb.EventsResponse,
    requestSerialize: serialize_hts_common_Organization,
    requestDeserialize: deserialize_hts_common_Organization,
    responseSerialize: serialize_hts_participant_EventsResponse,
    responseDeserialize: deserialize_hts_participant_EventsResponse,
  },
  getEventsByFacility: {
    path: '/hts.participant.ParticipantService/GetEventsByFacility',
    requestStream: false,
    responseStream: false,
    requestType: hts_common_common_pb.Facility,
    responseType: hts_participant_service_pb.EventsResponse,
    requestSerialize: serialize_hts_common_Facility,
    requestDeserialize: deserialize_hts_common_Facility,
    responseSerialize: serialize_hts_participant_EventsResponse,
    responseDeserialize: deserialize_hts_participant_EventsResponse,
  },
  getEventsByDate: {
    path: '/hts.participant.ParticipantService/GetEventsByDate',
    requestStream: false,
    responseStream: false,
    requestType: hts_participant_service_pb.StringInputRequest,
    responseType: hts_participant_service_pb.EventsResponse,
    requestSerialize: serialize_hts_participant_StringInputRequest,
    requestDeserialize: deserialize_hts_participant_StringInputRequest,
    responseSerialize: serialize_hts_participant_EventsResponse,
    responseDeserialize: deserialize_hts_participant_EventsResponse,
  },
  generateQR: {
    path: '/hts.participant.ParticipantService/GenerateQR',
    requestStream: false,
    responseStream: false,
    requestType: hts_common_common_pb.UserEvent,
    responseType: hts_participant_service_pb.GenerateQRResponse,
    requestSerialize: serialize_hts_common_UserEvent,
    requestDeserialize: deserialize_hts_common_UserEvent,
    responseSerialize: serialize_hts_participant_GenerateQRResponse,
    responseDeserialize: deserialize_hts_participant_GenerateQRResponse,
  },
  ping: {
    path: '/hts.participant.ParticipantService/Ping',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
};

exports.ParticipantServiceClient = grpc.makeGenericClientConstructor(ParticipantServiceService);

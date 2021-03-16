// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var hts_organizer_service_pb = require('../../hts/organizer/service_pb.js');
var hts_common_common_pb = require('../../hts/common/common_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');

function serialize_google_protobuf_Empty(arg) {
  if (!(arg instanceof google_protobuf_empty_pb.Empty)) {
    throw new Error('Expected argument of type google.protobuf.Empty');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_google_protobuf_Empty(buffer_arg) {
  return google_protobuf_empty_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
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

function serialize_hts_organizer_CreateEventRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.CreateEventRequest)) {
    throw new Error('Expected argument of type hts.organizer.CreateEventRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_CreateEventRequest(buffer_arg) {
  return hts_organizer_service_pb.CreateEventRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_CreateOrganizationRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.CreateOrganizationRequest)) {
    throw new Error('Expected argument of type hts.organizer.CreateOrganizationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_CreateOrganizationRequest(buffer_arg) {
  return hts_organizer_service_pb.CreateOrganizationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_CreateTagRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.CreateTagRequest)) {
    throw new Error('Expected argument of type hts.organizer.CreateTagRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_CreateTagRequest(buffer_arg) {
  return hts_organizer_service_pb.CreateTagRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_GetByIdRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.GetByIdRequest)) {
    throw new Error('Expected argument of type hts.organizer.GetByIdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_GetByIdRequest(buffer_arg) {
  return hts_organizer_service_pb.GetByIdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_GetEventByIdResponse(arg) {
  if (!(arg instanceof hts_organizer_service_pb.GetEventByIdResponse)) {
    throw new Error('Expected argument of type hts.organizer.GetEventByIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_GetEventByIdResponse(buffer_arg) {
  return hts_organizer_service_pb.GetEventByIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_GetEventResponse(arg) {
  if (!(arg instanceof hts_organizer_service_pb.GetEventResponse)) {
    throw new Error('Expected argument of type hts.organizer.GetEventResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_GetEventResponse(buffer_arg) {
  return hts_organizer_service_pb.GetEventResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_GetOrganizationByIdResponse(arg) {
  if (!(arg instanceof hts_organizer_service_pb.GetOrganizationByIdResponse)) {
    throw new Error('Expected argument of type hts.organizer.GetOrganizationByIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_GetOrganizationByIdResponse(buffer_arg) {
  return hts_organizer_service_pb.GetOrganizationByIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_GetOrganizationResponse(arg) {
  if (!(arg instanceof hts_organizer_service_pb.GetOrganizationResponse)) {
    throw new Error('Expected argument of type hts.organizer.GetOrganizationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_GetOrganizationResponse(buffer_arg) {
  return hts_organizer_service_pb.GetOrganizationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_GetTagByIdResponse(arg) {
  if (!(arg instanceof hts_organizer_service_pb.GetTagByIdResponse)) {
    throw new Error('Expected argument of type hts.organizer.GetTagByIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_GetTagByIdResponse(buffer_arg) {
  return hts_organizer_service_pb.GetTagByIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_GetTagResponse(arg) {
  if (!(arg instanceof hts_organizer_service_pb.GetTagResponse)) {
    throw new Error('Expected argument of type hts.organizer.GetTagResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_GetTagResponse(buffer_arg) {
  return hts_organizer_service_pb.GetTagResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_HasEventRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.HasEventRequest)) {
    throw new Error('Expected argument of type hts.organizer.HasEventRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_HasEventRequest(buffer_arg) {
  return hts_organizer_service_pb.HasEventRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_RemoveEventRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.RemoveEventRequest)) {
    throw new Error('Expected argument of type hts.organizer.RemoveEventRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_RemoveEventRequest(buffer_arg) {
  return hts_organizer_service_pb.RemoveEventRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_RemoveOrganizationRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.RemoveOrganizationRequest)) {
    throw new Error('Expected argument of type hts.organizer.RemoveOrganizationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_RemoveOrganizationRequest(buffer_arg) {
  return hts_organizer_service_pb.RemoveOrganizationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_UpdateEventDurationRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.UpdateEventDurationRequest)) {
    throw new Error('Expected argument of type hts.organizer.UpdateEventDurationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_UpdateEventDurationRequest(buffer_arg) {
  return hts_organizer_service_pb.UpdateEventDurationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_UpdateEventFacilityRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.UpdateEventFacilityRequest)) {
    throw new Error('Expected argument of type hts.organizer.UpdateEventFacilityRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_UpdateEventFacilityRequest(buffer_arg) {
  return hts_organizer_service_pb.UpdateEventFacilityRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_UpdateEventInfoRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.UpdateEventInfoRequest)) {
    throw new Error('Expected argument of type hts.organizer.UpdateEventInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_UpdateEventInfoRequest(buffer_arg) {
  return hts_organizer_service_pb.UpdateEventInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_UpdateOrganizationRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.UpdateOrganizationRequest)) {
    throw new Error('Expected argument of type hts.organizer.UpdateOrganizationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_UpdateOrganizationRequest(buffer_arg) {
  return hts_organizer_service_pb.UpdateOrganizationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_UpdateRegistrationRequestRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.UpdateRegistrationRequestRequest)) {
    throw new Error('Expected argument of type hts.organizer.UpdateRegistrationRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_UpdateRegistrationRequestRequest(buffer_arg) {
  return hts_organizer_service_pb.UpdateRegistrationRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_UpdateTagRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.UpdateTagRequest)) {
    throw new Error('Expected argument of type hts.organizer.UpdateTagRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_UpdateTagRequest(buffer_arg) {
  return hts_organizer_service_pb.UpdateTagRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_UpdateUsersInOrganizationRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.UpdateUsersInOrganizationRequest)) {
    throw new Error('Expected argument of type hts.organizer.UpdateUsersInOrganizationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_UpdateUsersInOrganizationRequest(buffer_arg) {
  return hts_organizer_service_pb.UpdateUsersInOrganizationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_organizer_UserRequest(arg) {
  if (!(arg instanceof hts_organizer_service_pb.UserRequest)) {
    throw new Error('Expected argument of type hts.organizer.UserRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_organizer_UserRequest(buffer_arg) {
  return hts_organizer_service_pb.UserRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


var OrganizerServiceService = exports.OrganizerServiceService = {
  createOrganization: {
    path: '/hts.organizer.OrganizerService/CreateOrganization',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.CreateOrganizationRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_CreateOrganizationRequest,
    requestDeserialize: deserialize_hts_organizer_CreateOrganizationRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  getOrganization: {
    path: '/hts.organizer.OrganizerService/GetOrganization',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UserRequest,
    responseType: hts_organizer_service_pb.GetOrganizationResponse,
    requestSerialize: serialize_hts_organizer_UserRequest,
    requestDeserialize: deserialize_hts_organizer_UserRequest,
    responseSerialize: serialize_hts_organizer_GetOrganizationResponse,
    responseDeserialize: deserialize_hts_organizer_GetOrganizationResponse,
  },
  getOrganizationById: {
    path: '/hts.organizer.OrganizerService/GetOrganizationById',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.GetByIdRequest,
    responseType: hts_organizer_service_pb.GetOrganizationByIdResponse,
    requestSerialize: serialize_hts_organizer_GetByIdRequest,
    requestDeserialize: deserialize_hts_organizer_GetByIdRequest,
    responseSerialize: serialize_hts_organizer_GetOrganizationByIdResponse,
    responseDeserialize: deserialize_hts_organizer_GetOrganizationByIdResponse,
  },
  updateOrganization: {
    path: '/hts.organizer.OrganizerService/UpdateOrganization',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UpdateOrganizationRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_UpdateOrganizationRequest,
    requestDeserialize: deserialize_hts_organizer_UpdateOrganizationRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  removeOrganization: {
    path: '/hts.organizer.OrganizerService/RemoveOrganization',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.RemoveOrganizationRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_RemoveOrganizationRequest,
    requestDeserialize: deserialize_hts_organizer_RemoveOrganizationRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  addUsersToOrganization: {
    path: '/hts.organizer.OrganizerService/AddUsersToOrganization',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UpdateUsersInOrganizationRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_UpdateUsersInOrganizationRequest,
    requestDeserialize: deserialize_hts_organizer_UpdateUsersInOrganizationRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  removeUsersFromOrganization: {
    path: '/hts.organizer.OrganizerService/RemoveUsersFromOrganization',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UpdateUsersInOrganizationRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_UpdateUsersInOrganizationRequest,
    requestDeserialize: deserialize_hts_organizer_UpdateUsersInOrganizationRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  createEvent: {
    path: '/hts.organizer.OrganizerService/CreateEvent',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.CreateEventRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_CreateEventRequest,
    requestDeserialize: deserialize_hts_organizer_CreateEventRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  getEvent: {
    path: '/hts.organizer.OrganizerService/GetEvent',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UserRequest,
    responseType: hts_organizer_service_pb.GetEventResponse,
    requestSerialize: serialize_hts_organizer_UserRequest,
    requestDeserialize: deserialize_hts_organizer_UserRequest,
    responseSerialize: serialize_hts_organizer_GetEventResponse,
    responseDeserialize: deserialize_hts_organizer_GetEventResponse,
  },
  getEventById: {
    path: '/hts.organizer.OrganizerService/GetEventById',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.GetByIdRequest,
    responseType: hts_organizer_service_pb.GetEventByIdResponse,
    requestSerialize: serialize_hts_organizer_GetByIdRequest,
    requestDeserialize: deserialize_hts_organizer_GetByIdRequest,
    responseSerialize: serialize_hts_organizer_GetEventByIdResponse,
    responseDeserialize: deserialize_hts_organizer_GetEventByIdResponse,
  },
  updateEventInfo: {
    path: '/hts.organizer.OrganizerService/UpdateEventInfo',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UpdateEventInfoRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_UpdateEventInfoRequest,
    requestDeserialize: deserialize_hts_organizer_UpdateEventInfoRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  updateEventFacility: {
    path: '/hts.organizer.OrganizerService/UpdateEventFacility',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UpdateEventFacilityRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_UpdateEventFacilityRequest,
    requestDeserialize: deserialize_hts_organizer_UpdateEventFacilityRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  updateEventDuration: {
    path: '/hts.organizer.OrganizerService/UpdateEventDuration',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UpdateEventDurationRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_UpdateEventDurationRequest,
    requestDeserialize: deserialize_hts_organizer_UpdateEventDurationRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  removeEvent: {
    path: '/hts.organizer.OrganizerService/RemoveEvent',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.RemoveEventRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_RemoveEventRequest,
    requestDeserialize: deserialize_hts_organizer_RemoveEventRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  updateRegistrationRequest: {
    path: '/hts.organizer.OrganizerService/UpdateRegistrationRequest',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UpdateRegistrationRequestRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_UpdateRegistrationRequestRequest,
    requestDeserialize: deserialize_hts_organizer_UpdateRegistrationRequestRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  createTag: {
    path: '/hts.organizer.OrganizerService/CreateTag',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.CreateTagRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_CreateTagRequest,
    requestDeserialize: deserialize_hts_organizer_CreateTagRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  addTag: {
    path: '/hts.organizer.OrganizerService/AddTag',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UpdateTagRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_UpdateTagRequest,
    requestDeserialize: deserialize_hts_organizer_UpdateTagRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  removeTag: {
    path: '/hts.organizer.OrganizerService/RemoveTag',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UpdateTagRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_UpdateTagRequest,
    requestDeserialize: deserialize_hts_organizer_UpdateTagRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  getTag: {
    path: '/hts.organizer.OrganizerService/GetTag',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.UserRequest,
    responseType: hts_organizer_service_pb.GetTagResponse,
    requestSerialize: serialize_hts_organizer_UserRequest,
    requestDeserialize: deserialize_hts_organizer_UserRequest,
    responseSerialize: serialize_hts_organizer_GetTagResponse,
    responseDeserialize: deserialize_hts_organizer_GetTagResponse,
  },
  getTagById: {
    path: '/hts.organizer.OrganizerService/GetTagById',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.GetByIdRequest,
    responseType: hts_organizer_service_pb.GetTagByIdResponse,
    requestSerialize: serialize_hts_organizer_GetByIdRequest,
    requestDeserialize: deserialize_hts_organizer_GetByIdRequest,
    responseSerialize: serialize_hts_organizer_GetTagByIdResponse,
    responseDeserialize: deserialize_hts_organizer_GetTagByIdResponse,
  },
  hasEvent: {
    path: '/hts.organizer.OrganizerService/HasEvent',
    requestStream: false,
    responseStream: false,
    requestType: hts_organizer_service_pb.HasEventRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_organizer_HasEventRequest,
    requestDeserialize: deserialize_hts_organizer_HasEventRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  ping: {
    path: '/hts.organizer.OrganizerService/Ping',
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

exports.OrganizerServiceClient = grpc.makeGenericClientConstructor(OrganizerServiceService);

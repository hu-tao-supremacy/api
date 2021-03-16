// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var hts_facility_service_pb = require('../../hts/facility/service_pb.js');
var hts_common_common_pb = require('../../hts/common/common_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_wrappers_pb = require('google-protobuf/google/protobuf/wrappers_pb.js');

function serialize_google_protobuf_Empty(arg) {
  if (!(arg instanceof google_protobuf_empty_pb.Empty)) {
    throw new Error('Expected argument of type google.protobuf.Empty');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_google_protobuf_Empty(buffer_arg) {
  return google_protobuf_empty_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
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

function serialize_hts_common_FacilityRequest(arg) {
  if (!(arg instanceof hts_common_common_pb.FacilityRequest)) {
    throw new Error('Expected argument of type hts.common.FacilityRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_common_FacilityRequest(buffer_arg) {
  return hts_common_common_pb.FacilityRequest.deserializeBinary(new Uint8Array(buffer_arg));
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

function serialize_hts_facility_ApproveFacilityRequestRequest(arg) {
  if (!(arg instanceof hts_facility_service_pb.ApproveFacilityRequestRequest)) {
    throw new Error('Expected argument of type hts.facility.ApproveFacilityRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_ApproveFacilityRequestRequest(buffer_arg) {
  return hts_facility_service_pb.ApproveFacilityRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_CreateFacilityRequestRequest(arg) {
  if (!(arg instanceof hts_facility_service_pb.CreateFacilityRequestRequest)) {
    throw new Error('Expected argument of type hts.facility.CreateFacilityRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_CreateFacilityRequestRequest(buffer_arg) {
  return hts_facility_service_pb.CreateFacilityRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_FacilityRequestWithFacilityInfo(arg) {
  if (!(arg instanceof hts_facility_service_pb.FacilityRequestWithFacilityInfo)) {
    throw new Error('Expected argument of type hts.facility.FacilityRequestWithFacilityInfo');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_FacilityRequestWithFacilityInfo(buffer_arg) {
  return hts_facility_service_pb.FacilityRequestWithFacilityInfo.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetAvailableFacilityListResponse(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetAvailableFacilityListResponse)) {
    throw new Error('Expected argument of type hts.facility.GetAvailableFacilityListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetAvailableFacilityListResponse(buffer_arg) {
  return hts_facility_service_pb.GetAvailableFacilityListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetAvailableTimeOfFacilityRequest(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetAvailableTimeOfFacilityRequest)) {
    throw new Error('Expected argument of type hts.facility.GetAvailableTimeOfFacilityRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetAvailableTimeOfFacilityRequest(buffer_arg) {
  return hts_facility_service_pb.GetAvailableTimeOfFacilityRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetAvailableTimeOfFacilityResponse(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetAvailableTimeOfFacilityResponse)) {
    throw new Error('Expected argument of type hts.facility.GetAvailableTimeOfFacilityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetAvailableTimeOfFacilityResponse(buffer_arg) {
  return hts_facility_service_pb.GetAvailableTimeOfFacilityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetFacilityInfoRequest(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetFacilityInfoRequest)) {
    throw new Error('Expected argument of type hts.facility.GetFacilityInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetFacilityInfoRequest(buffer_arg) {
  return hts_facility_service_pb.GetFacilityInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetFacilityListRequest(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetFacilityListRequest)) {
    throw new Error('Expected argument of type hts.facility.GetFacilityListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetFacilityListRequest(buffer_arg) {
  return hts_facility_service_pb.GetFacilityListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetFacilityListResponse(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetFacilityListResponse)) {
    throw new Error('Expected argument of type hts.facility.GetFacilityListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetFacilityListResponse(buffer_arg) {
  return hts_facility_service_pb.GetFacilityListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetFacilityRequestListRequest(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetFacilityRequestListRequest)) {
    throw new Error('Expected argument of type hts.facility.GetFacilityRequestListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetFacilityRequestListRequest(buffer_arg) {
  return hts_facility_service_pb.GetFacilityRequestListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetFacilityRequestListResponse(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetFacilityRequestListResponse)) {
    throw new Error('Expected argument of type hts.facility.GetFacilityRequestListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetFacilityRequestListResponse(buffer_arg) {
  return hts_facility_service_pb.GetFacilityRequestListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetFacilityRequestStatusFullRequest(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetFacilityRequestStatusFullRequest)) {
    throw new Error('Expected argument of type hts.facility.GetFacilityRequestStatusFullRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetFacilityRequestStatusFullRequest(buffer_arg) {
  return hts_facility_service_pb.GetFacilityRequestStatusFullRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetFacilityRequestStatusRequest(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetFacilityRequestStatusRequest)) {
    throw new Error('Expected argument of type hts.facility.GetFacilityRequestStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetFacilityRequestStatusRequest(buffer_arg) {
  return hts_facility_service_pb.GetFacilityRequestStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetFacilityRequestsListStatusRequest(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetFacilityRequestsListStatusRequest)) {
    throw new Error('Expected argument of type hts.facility.GetFacilityRequestsListStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetFacilityRequestsListStatusRequest(buffer_arg) {
  return hts_facility_service_pb.GetFacilityRequestsListStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_GetFacilityRequestsListStatusResponse(arg) {
  if (!(arg instanceof hts_facility_service_pb.GetFacilityRequestsListStatusResponse)) {
    throw new Error('Expected argument of type hts.facility.GetFacilityRequestsListStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_GetFacilityRequestsListStatusResponse(buffer_arg) {
  return hts_facility_service_pb.GetFacilityRequestsListStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_facility_RejectFacilityRequestRequest(arg) {
  if (!(arg instanceof hts_facility_service_pb.RejectFacilityRequestRequest)) {
    throw new Error('Expected argument of type hts.facility.RejectFacilityRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_facility_RejectFacilityRequestRequest(buffer_arg) {
  return hts_facility_service_pb.RejectFacilityRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


var FacilityServiceService = exports.FacilityServiceService = {
  getFacilityList: {
    path: '/hts.facility.FacilityService/GetFacilityList',
    requestStream: false,
    responseStream: false,
    requestType: hts_facility_service_pb.GetFacilityListRequest,
    responseType: hts_facility_service_pb.GetFacilityListResponse,
    requestSerialize: serialize_hts_facility_GetFacilityListRequest,
    requestDeserialize: deserialize_hts_facility_GetFacilityListRequest,
    responseSerialize: serialize_hts_facility_GetFacilityListResponse,
    responseDeserialize: deserialize_hts_facility_GetFacilityListResponse,
  },
  getFacilityRequestList: {
    path: '/hts.facility.FacilityService/GetFacilityRequestList',
    requestStream: false,
    responseStream: false,
    requestType: hts_facility_service_pb.GetFacilityRequestListRequest,
    responseType: hts_facility_service_pb.GetFacilityRequestListResponse,
    requestSerialize: serialize_hts_facility_GetFacilityRequestListRequest,
    requestDeserialize: deserialize_hts_facility_GetFacilityRequestListRequest,
    responseSerialize: serialize_hts_facility_GetFacilityRequestListResponse,
    responseDeserialize: deserialize_hts_facility_GetFacilityRequestListResponse,
  },
  getFacilityRequestsListStatus: {
    path: '/hts.facility.FacilityService/GetFacilityRequestsListStatus',
    requestStream: false,
    responseStream: false,
    requestType: hts_facility_service_pb.GetFacilityRequestsListStatusRequest,
    responseType: hts_facility_service_pb.GetFacilityRequestsListStatusResponse,
    requestSerialize: serialize_hts_facility_GetFacilityRequestsListStatusRequest,
    requestDeserialize: deserialize_hts_facility_GetFacilityRequestsListStatusRequest,
    responseSerialize: serialize_hts_facility_GetFacilityRequestsListStatusResponse,
    responseDeserialize: deserialize_hts_facility_GetFacilityRequestsListStatusResponse,
  },
  getFacilityRequestStatus: {
    path: '/hts.facility.FacilityService/GetFacilityRequestStatus',
    requestStream: false,
    responseStream: false,
    requestType: hts_facility_service_pb.GetFacilityRequestStatusRequest,
    responseType: hts_common_common_pb.FacilityRequest,
    requestSerialize: serialize_hts_facility_GetFacilityRequestStatusRequest,
    requestDeserialize: deserialize_hts_facility_GetFacilityRequestStatusRequest,
    responseSerialize: serialize_hts_common_FacilityRequest,
    responseDeserialize: deserialize_hts_common_FacilityRequest,
  },
  getFacilityRequestStatusFull: {
    path: '/hts.facility.FacilityService/GetFacilityRequestStatusFull',
    requestStream: false,
    responseStream: false,
    requestType: hts_facility_service_pb.GetFacilityRequestStatusFullRequest,
    responseType: hts_facility_service_pb.FacilityRequestWithFacilityInfo,
    requestSerialize: serialize_hts_facility_GetFacilityRequestStatusFullRequest,
    requestDeserialize: deserialize_hts_facility_GetFacilityRequestStatusFullRequest,
    responseSerialize: serialize_hts_facility_FacilityRequestWithFacilityInfo,
    responseDeserialize: deserialize_hts_facility_FacilityRequestWithFacilityInfo,
  },
  getAvailableFacilityList: {
    path: '/hts.facility.FacilityService/GetAvailableFacilityList',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: hts_facility_service_pb.GetAvailableFacilityListResponse,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_hts_facility_GetAvailableFacilityListResponse,
    responseDeserialize: deserialize_hts_facility_GetAvailableFacilityListResponse,
  },
  getAvailableTimeOfFacility: {
    path: '/hts.facility.FacilityService/GetAvailableTimeOfFacility',
    requestStream: false,
    responseStream: false,
    requestType: hts_facility_service_pb.GetAvailableTimeOfFacilityRequest,
    responseType: hts_facility_service_pb.GetAvailableTimeOfFacilityResponse,
    requestSerialize: serialize_hts_facility_GetAvailableTimeOfFacilityRequest,
    requestDeserialize: deserialize_hts_facility_GetAvailableTimeOfFacilityRequest,
    responseSerialize: serialize_hts_facility_GetAvailableTimeOfFacilityResponse,
    responseDeserialize: deserialize_hts_facility_GetAvailableTimeOfFacilityResponse,
  },
  createFacilityRequest: {
    path: '/hts.facility.FacilityService/CreateFacilityRequest',
    requestStream: false,
    responseStream: false,
    requestType: hts_facility_service_pb.CreateFacilityRequestRequest,
    responseType: hts_common_common_pb.FacilityRequest,
    requestSerialize: serialize_hts_facility_CreateFacilityRequestRequest,
    requestDeserialize: deserialize_hts_facility_CreateFacilityRequestRequest,
    responseSerialize: serialize_hts_common_FacilityRequest,
    responseDeserialize: deserialize_hts_common_FacilityRequest,
  },
  approveFacilityRequest: {
    path: '/hts.facility.FacilityService/ApproveFacilityRequest',
    requestStream: false,
    responseStream: false,
    requestType: hts_facility_service_pb.ApproveFacilityRequestRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_facility_ApproveFacilityRequestRequest,
    requestDeserialize: deserialize_hts_facility_ApproveFacilityRequestRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  rejectFacilityRequest: {
    path: '/hts.facility.FacilityService/RejectFacilityRequest',
    requestStream: false,
    responseStream: false,
    requestType: hts_facility_service_pb.RejectFacilityRequestRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_facility_RejectFacilityRequestRequest,
    requestDeserialize: deserialize_hts_facility_RejectFacilityRequestRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  getFacilityInfo: {
    path: '/hts.facility.FacilityService/GetFacilityInfo',
    requestStream: false,
    responseStream: false,
    requestType: hts_facility_service_pb.GetFacilityInfoRequest,
    responseType: hts_common_common_pb.Facility,
    requestSerialize: serialize_hts_facility_GetFacilityInfoRequest,
    requestDeserialize: deserialize_hts_facility_GetFacilityInfoRequest,
    responseSerialize: serialize_hts_common_Facility,
    responseDeserialize: deserialize_hts_common_Facility,
  },
  ping: {
    path: '/hts.facility.FacilityService/Ping',
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

exports.FacilityServiceClient = grpc.makeGenericClientConstructor(FacilityServiceService);

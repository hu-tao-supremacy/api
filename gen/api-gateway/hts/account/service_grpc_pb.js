// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var hts_account_service_pb = require('../../hts/account/service_pb.js');
var hts_common_common_pb = require('../../hts/common/common_pb.js');
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

function serialize_hts_account_GenerateJWTRequest(arg) {
  if (!(arg instanceof hts_account_service_pb.GenerateJWTRequest)) {
    throw new Error('Expected argument of type hts.account.GenerateJWTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_GenerateJWTRequest(buffer_arg) {
  return hts_account_service_pb.GenerateJWTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_account_HasPermissionRequest(arg) {
  if (!(arg instanceof hts_account_service_pb.HasPermissionRequest)) {
    throw new Error('Expected argument of type hts.account.HasPermissionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_HasPermissionRequest(buffer_arg) {
  return hts_account_service_pb.HasPermissionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_account_InvalidateJWTRequest(arg) {
  if (!(arg instanceof hts_account_service_pb.InvalidateJWTRequest)) {
    throw new Error('Expected argument of type hts.account.InvalidateJWTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_InvalidateJWTRequest(buffer_arg) {
  return hts_account_service_pb.InvalidateJWTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_account_IsAuthenticatedRequest(arg) {
  if (!(arg instanceof hts_account_service_pb.IsAuthenticatedRequest)) {
    throw new Error('Expected argument of type hts.account.IsAuthenticatedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_IsAuthenticatedRequest(buffer_arg) {
  return hts_account_service_pb.IsAuthenticatedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_account_UpdateAccountInfoRequest(arg) {
  if (!(arg instanceof hts_account_service_pb.UpdateAccountInfoRequest)) {
    throw new Error('Expected argument of type hts.account.UpdateAccountInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_UpdateAccountInfoRequest(buffer_arg) {
  return hts_account_service_pb.UpdateAccountInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_account_UpdateAccountInfoResponse(arg) {
  if (!(arg instanceof hts_account_service_pb.UpdateAccountInfoResponse)) {
    throw new Error('Expected argument of type hts.account.UpdateAccountInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_UpdateAccountInfoResponse(buffer_arg) {
  return hts_account_service_pb.UpdateAccountInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
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


var AccountServiceService = exports.AccountServiceService = {
  isAuthenticated: {
    path: '/hts.account.AccountService/IsAuthenticated',
    requestStream: false,
    responseStream: false,
    requestType: hts_account_service_pb.IsAuthenticatedRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_account_IsAuthenticatedRequest,
    requestDeserialize: deserialize_hts_account_IsAuthenticatedRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  updateAccountInfo: {
    path: '/hts.account.AccountService/UpdateAccountInfo',
    requestStream: false,
    responseStream: false,
    requestType: hts_account_service_pb.UpdateAccountInfoRequest,
    responseType: hts_account_service_pb.UpdateAccountInfoResponse,
    requestSerialize: serialize_hts_account_UpdateAccountInfoRequest,
    requestDeserialize: deserialize_hts_account_UpdateAccountInfoRequest,
    responseSerialize: serialize_hts_account_UpdateAccountInfoResponse,
    responseDeserialize: deserialize_hts_account_UpdateAccountInfoResponse,
  },
  generateJWT: {
    path: '/hts.account.AccountService/GenerateJWT',
    requestStream: false,
    responseStream: false,
    requestType: hts_account_service_pb.GenerateJWTRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_account_GenerateJWTRequest,
    requestDeserialize: deserialize_hts_account_GenerateJWTRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  invalidateJWT: {
    path: '/hts.account.AccountService/InvalidateJWT',
    requestStream: false,
    responseStream: false,
    requestType: hts_account_service_pb.InvalidateJWTRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_account_InvalidateJWTRequest,
    requestDeserialize: deserialize_hts_account_InvalidateJWTRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  hasPermission: {
    path: '/hts.account.AccountService/HasPermission',
    requestStream: false,
    responseStream: false,
    requestType: hts_account_service_pb.HasPermissionRequest,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_account_HasPermissionRequest,
    requestDeserialize: deserialize_hts_account_HasPermissionRequest,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  ping: {
    path: '/hts.account.AccountService/Ping',
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

exports.AccountServiceClient = grpc.makeGenericClientConstructor(AccountServiceService);

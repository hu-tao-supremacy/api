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

function serialize_hts_account_GenerateJWTInput(arg) {
  if (!(arg instanceof hts_account_service_pb.GenerateJWTInput)) {
    throw new Error('Expected argument of type hts.account.GenerateJWTInput');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_GenerateJWTInput(buffer_arg) {
  return hts_account_service_pb.GenerateJWTInput.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_account_HasPermissionInput(arg) {
  if (!(arg instanceof hts_account_service_pb.HasPermissionInput)) {
    throw new Error('Expected argument of type hts.account.HasPermissionInput');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_HasPermissionInput(buffer_arg) {
  return hts_account_service_pb.HasPermissionInput.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_account_InvalidateJWTInput(arg) {
  if (!(arg instanceof hts_account_service_pb.InvalidateJWTInput)) {
    throw new Error('Expected argument of type hts.account.InvalidateJWTInput');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_InvalidateJWTInput(buffer_arg) {
  return hts_account_service_pb.InvalidateJWTInput.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_account_IsAuthenticatedInput(arg) {
  if (!(arg instanceof hts_account_service_pb.IsAuthenticatedInput)) {
    throw new Error('Expected argument of type hts.account.IsAuthenticatedInput');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_IsAuthenticatedInput(buffer_arg) {
  return hts_account_service_pb.IsAuthenticatedInput.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_account_UpdateAccountInfoInput(arg) {
  if (!(arg instanceof hts_account_service_pb.UpdateAccountInfoInput)) {
    throw new Error('Expected argument of type hts.account.UpdateAccountInfoInput');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_UpdateAccountInfoInput(buffer_arg) {
  return hts_account_service_pb.UpdateAccountInfoInput.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_hts_account_UpdateAccountInfoOutput(arg) {
  if (!(arg instanceof hts_account_service_pb.UpdateAccountInfoOutput)) {
    throw new Error('Expected argument of type hts.account.UpdateAccountInfoOutput');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_UpdateAccountInfoOutput(buffer_arg) {
  return hts_account_service_pb.UpdateAccountInfoOutput.deserializeBinary(new Uint8Array(buffer_arg));
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
    requestType: hts_account_service_pb.IsAuthenticatedInput,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_account_IsAuthenticatedInput,
    requestDeserialize: deserialize_hts_account_IsAuthenticatedInput,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  updateAccountInfo: {
    path: '/hts.account.AccountService/UpdateAccountInfo',
    requestStream: false,
    responseStream: false,
    requestType: hts_account_service_pb.UpdateAccountInfoInput,
    responseType: hts_account_service_pb.UpdateAccountInfoOutput,
    requestSerialize: serialize_hts_account_UpdateAccountInfoInput,
    requestDeserialize: deserialize_hts_account_UpdateAccountInfoInput,
    responseSerialize: serialize_hts_account_UpdateAccountInfoOutput,
    responseDeserialize: deserialize_hts_account_UpdateAccountInfoOutput,
  },
  generateJWT: {
    path: '/hts.account.AccountService/GenerateJWT',
    requestStream: false,
    responseStream: false,
    requestType: hts_account_service_pb.GenerateJWTInput,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_account_GenerateJWTInput,
    requestDeserialize: deserialize_hts_account_GenerateJWTInput,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  invalidateJWT: {
    path: '/hts.account.AccountService/InvalidateJWT',
    requestStream: false,
    responseStream: false,
    requestType: hts_account_service_pb.InvalidateJWTInput,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_account_InvalidateJWTInput,
    requestDeserialize: deserialize_hts_account_InvalidateJWTInput,
    responseSerialize: serialize_hts_common_Result,
    responseDeserialize: deserialize_hts_common_Result,
  },
  hasPermission: {
    path: '/hts.account.AccountService/HasPermission',
    requestStream: false,
    responseStream: false,
    requestType: hts_account_service_pb.HasPermissionInput,
    responseType: hts_common_common_pb.Result,
    requestSerialize: serialize_hts_account_HasPermissionInput,
    requestDeserialize: deserialize_hts_account_HasPermissionInput,
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

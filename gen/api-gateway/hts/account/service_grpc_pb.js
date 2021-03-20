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

function serialize_hts_account_GenerateJWTOutput(arg) {
  if (!(arg instanceof hts_account_service_pb.GenerateJWTOutput)) {
    throw new Error('Expected argument of type hts.account.GenerateJWTOutput');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_GenerateJWTOutput(buffer_arg) {
  return hts_account_service_pb.GenerateJWTOutput.deserializeBinary(new Uint8Array(buffer_arg));
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

function serialize_hts_account_IsAuthenticatedInput(arg) {
  if (!(arg instanceof hts_account_service_pb.IsAuthenticatedInput)) {
    throw new Error('Expected argument of type hts.account.IsAuthenticatedInput');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_account_IsAuthenticatedInput(buffer_arg) {
  return hts_account_service_pb.IsAuthenticatedInput.deserializeBinary(new Uint8Array(buffer_arg));
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

function serialize_hts_common_User(arg) {
  if (!(arg instanceof hts_common_common_pb.User)) {
    throw new Error('Expected argument of type hts.common.User');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_hts_common_User(buffer_arg) {
  return hts_common_common_pb.User.deserializeBinary(new Uint8Array(buffer_arg));
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
    requestType: hts_common_common_pb.User,
    responseType: hts_common_common_pb.User,
    requestSerialize: serialize_hts_common_User,
    requestDeserialize: deserialize_hts_common_User,
    responseSerialize: serialize_hts_common_User,
    responseDeserialize: deserialize_hts_common_User,
  },
  generateJWT: {
    path: '/hts.account.AccountService/GenerateJWT',
    requestStream: false,
    responseStream: false,
    requestType: hts_common_common_pb.User,
    responseType: hts_account_service_pb.GenerateJWTOutput,
    requestSerialize: serialize_hts_common_User,
    requestDeserialize: deserialize_hts_common_User,
    responseSerialize: serialize_hts_account_GenerateJWTOutput,
    responseDeserialize: deserialize_hts_account_GenerateJWTOutput,
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
  validatePermission: {
    path: '/hts.account.AccountService/ValidatePermission',
    requestStream: false,
    responseStream: false,
    requestType: hts_account_service_pb.HasPermissionInput,
    responseType: google_protobuf_empty_pb.Empty,
    requestSerialize: serialize_hts_account_HasPermissionInput,
    requestDeserialize: deserialize_hts_account_HasPermissionInput,
    responseSerialize: serialize_google_protobuf_Empty,
    responseDeserialize: deserialize_google_protobuf_Empty,
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

// GENERATED CODE -- DO NOT EDIT!

// package: hts.account
// file: hts/account/service.proto

import * as hts_account_service_pb from "../../hts/account/service_pb";
import * as hts_common_common_pb from "../../hts/common/common_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";
import * as grpc from "grpc";

interface IAccountServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  isAuthenticated: grpc.MethodDefinition<hts_account_service_pb.IsAuthenticatedInput, hts_common_common_pb.Result>;
  updateAccountInfo: grpc.MethodDefinition<hts_account_service_pb.UpdateAccountInfoInput, hts_account_service_pb.UpdateAccountInfoOutput>;
  generateJWT: grpc.MethodDefinition<hts_account_service_pb.GenerateJWTInput, hts_common_common_pb.Result>;
  invalidateJWT: grpc.MethodDefinition<hts_account_service_pb.InvalidateJWTInput, hts_common_common_pb.Result>;
  hasPermission: grpc.MethodDefinition<hts_account_service_pb.HasPermissionInput, hts_common_common_pb.Result>;
  validatePermission: grpc.MethodDefinition<hts_account_service_pb.HasPermissionInput, google_protobuf_empty_pb.Empty>;
  ping: grpc.MethodDefinition<google_protobuf_empty_pb.Empty, hts_common_common_pb.Result>;
}

export const AccountServiceService: IAccountServiceService;

export interface IAccountServiceServer extends grpc.UntypedServiceImplementation {
  isAuthenticated: grpc.handleUnaryCall<hts_account_service_pb.IsAuthenticatedInput, hts_common_common_pb.Result>;
  updateAccountInfo: grpc.handleUnaryCall<hts_account_service_pb.UpdateAccountInfoInput, hts_account_service_pb.UpdateAccountInfoOutput>;
  generateJWT: grpc.handleUnaryCall<hts_account_service_pb.GenerateJWTInput, hts_common_common_pb.Result>;
  invalidateJWT: grpc.handleUnaryCall<hts_account_service_pb.InvalidateJWTInput, hts_common_common_pb.Result>;
  hasPermission: grpc.handleUnaryCall<hts_account_service_pb.HasPermissionInput, hts_common_common_pb.Result>;
  validatePermission: grpc.handleUnaryCall<hts_account_service_pb.HasPermissionInput, google_protobuf_empty_pb.Empty>;
  ping: grpc.handleUnaryCall<google_protobuf_empty_pb.Empty, hts_common_common_pb.Result>;
}

export class AccountServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  isAuthenticated(argument: hts_account_service_pb.IsAuthenticatedInput, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  isAuthenticated(argument: hts_account_service_pb.IsAuthenticatedInput, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  isAuthenticated(argument: hts_account_service_pb.IsAuthenticatedInput, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateAccountInfo(argument: hts_account_service_pb.UpdateAccountInfoInput, callback: grpc.requestCallback<hts_account_service_pb.UpdateAccountInfoOutput>): grpc.ClientUnaryCall;
  updateAccountInfo(argument: hts_account_service_pb.UpdateAccountInfoInput, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_account_service_pb.UpdateAccountInfoOutput>): grpc.ClientUnaryCall;
  updateAccountInfo(argument: hts_account_service_pb.UpdateAccountInfoInput, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_account_service_pb.UpdateAccountInfoOutput>): grpc.ClientUnaryCall;
  generateJWT(argument: hts_account_service_pb.GenerateJWTInput, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  generateJWT(argument: hts_account_service_pb.GenerateJWTInput, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  generateJWT(argument: hts_account_service_pb.GenerateJWTInput, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  invalidateJWT(argument: hts_account_service_pb.InvalidateJWTInput, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  invalidateJWT(argument: hts_account_service_pb.InvalidateJWTInput, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  invalidateJWT(argument: hts_account_service_pb.InvalidateJWTInput, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  hasPermission(argument: hts_account_service_pb.HasPermissionInput, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  hasPermission(argument: hts_account_service_pb.HasPermissionInput, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  hasPermission(argument: hts_account_service_pb.HasPermissionInput, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  validatePermission(argument: hts_account_service_pb.HasPermissionInput, callback: grpc.requestCallback<google_protobuf_empty_pb.Empty>): grpc.ClientUnaryCall;
  validatePermission(argument: hts_account_service_pb.HasPermissionInput, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<google_protobuf_empty_pb.Empty>): grpc.ClientUnaryCall;
  validatePermission(argument: hts_account_service_pb.HasPermissionInput, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<google_protobuf_empty_pb.Empty>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
}

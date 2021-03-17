// GENERATED CODE -- DO NOT EDIT!

// package: hts.account
// file: hts/account/service.proto

import * as hts_account_service_pb from "../../hts/account/service_pb";
import * as hts_common_common_pb from "../../hts/common/common_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";
import * as grpc from "grpc";

interface IAccountServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  isAuthenticated: grpc.MethodDefinition<hts_account_service_pb.IsAuthenticatedRequest, hts_common_common_pb.Result>;
  updateAccountInfo: grpc.MethodDefinition<hts_account_service_pb.UpdateAccountInfoRequest, hts_account_service_pb.UpdateAccountInfoResponse>;
  generateJWT: grpc.MethodDefinition<hts_account_service_pb.GenerateJWTRequest, hts_common_common_pb.Result>;
  invalidateJWT: grpc.MethodDefinition<hts_account_service_pb.InvalidateJWTRequest, hts_common_common_pb.Result>;
  hasPermission: grpc.MethodDefinition<hts_account_service_pb.HasPermissionRequest, hts_common_common_pb.Result>;
  ping: grpc.MethodDefinition<google_protobuf_empty_pb.Empty, hts_common_common_pb.Result>;
}

export const AccountServiceService: IAccountServiceService;

export interface IAccountServiceServer extends grpc.UntypedServiceImplementation {
  isAuthenticated: grpc.handleUnaryCall<hts_account_service_pb.IsAuthenticatedRequest, hts_common_common_pb.Result>;
  updateAccountInfo: grpc.handleUnaryCall<hts_account_service_pb.UpdateAccountInfoRequest, hts_account_service_pb.UpdateAccountInfoResponse>;
  generateJWT: grpc.handleUnaryCall<hts_account_service_pb.GenerateJWTRequest, hts_common_common_pb.Result>;
  invalidateJWT: grpc.handleUnaryCall<hts_account_service_pb.InvalidateJWTRequest, hts_common_common_pb.Result>;
  hasPermission: grpc.handleUnaryCall<hts_account_service_pb.HasPermissionRequest, hts_common_common_pb.Result>;
  ping: grpc.handleUnaryCall<google_protobuf_empty_pb.Empty, hts_common_common_pb.Result>;
}

export class AccountServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  isAuthenticated(argument: hts_account_service_pb.IsAuthenticatedRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  isAuthenticated(argument: hts_account_service_pb.IsAuthenticatedRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  isAuthenticated(argument: hts_account_service_pb.IsAuthenticatedRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateAccountInfo(argument: hts_account_service_pb.UpdateAccountInfoRequest, callback: grpc.requestCallback<hts_account_service_pb.UpdateAccountInfoResponse>): grpc.ClientUnaryCall;
  updateAccountInfo(argument: hts_account_service_pb.UpdateAccountInfoRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_account_service_pb.UpdateAccountInfoResponse>): grpc.ClientUnaryCall;
  updateAccountInfo(argument: hts_account_service_pb.UpdateAccountInfoRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_account_service_pb.UpdateAccountInfoResponse>): grpc.ClientUnaryCall;
  generateJWT(argument: hts_account_service_pb.GenerateJWTRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  generateJWT(argument: hts_account_service_pb.GenerateJWTRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  generateJWT(argument: hts_account_service_pb.GenerateJWTRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  invalidateJWT(argument: hts_account_service_pb.InvalidateJWTRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  invalidateJWT(argument: hts_account_service_pb.InvalidateJWTRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  invalidateJWT(argument: hts_account_service_pb.InvalidateJWTRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  hasPermission(argument: hts_account_service_pb.HasPermissionRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  hasPermission(argument: hts_account_service_pb.HasPermissionRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  hasPermission(argument: hts_account_service_pb.HasPermissionRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
}

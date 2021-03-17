// GENERATED CODE -- DO NOT EDIT!

// package: hts.facility
// file: hts/facility/service.proto

import * as hts_facility_service_pb from "../../hts/facility/service_pb";
import * as hts_common_common_pb from "../../hts/common/common_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";
import * as grpc from "grpc";

interface IFacilityServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  getFacilityList: grpc.MethodDefinition<hts_facility_service_pb.GetFacilityListRequest, hts_facility_service_pb.GetFacilityListResponse>;
  getFacilityRequestList: grpc.MethodDefinition<hts_facility_service_pb.GetFacilityRequestListRequest, hts_facility_service_pb.GetFacilityRequestListResponse>;
  getFacilityRequestsListStatus: grpc.MethodDefinition<hts_facility_service_pb.GetFacilityRequestsListStatusRequest, hts_facility_service_pb.GetFacilityRequestsListStatusResponse>;
  getFacilityRequestStatus: grpc.MethodDefinition<hts_facility_service_pb.GetFacilityRequestStatusRequest, hts_common_common_pb.FacilityRequest>;
  getFacilityRequestStatusFull: grpc.MethodDefinition<hts_facility_service_pb.GetFacilityRequestStatusFullRequest, hts_facility_service_pb.FacilityRequestWithFacilityInfo>;
  getAvailableFacilityList: grpc.MethodDefinition<google_protobuf_empty_pb.Empty, hts_facility_service_pb.GetAvailableFacilityListResponse>;
  getAvailableTimeOfFacility: grpc.MethodDefinition<hts_facility_service_pb.GetAvailableTimeOfFacilityRequest, hts_facility_service_pb.GetAvailableTimeOfFacilityResponse>;
  createFacilityRequest: grpc.MethodDefinition<hts_facility_service_pb.CreateFacilityRequestRequest, hts_common_common_pb.FacilityRequest>;
  approveFacilityRequest: grpc.MethodDefinition<hts_facility_service_pb.ApproveFacilityRequestRequest, hts_common_common_pb.Result>;
  rejectFacilityRequest: grpc.MethodDefinition<hts_facility_service_pb.RejectFacilityRequestRequest, hts_common_common_pb.Result>;
  getFacilityInfo: grpc.MethodDefinition<hts_facility_service_pb.GetFacilityInfoRequest, hts_common_common_pb.Facility>;
  ping: grpc.MethodDefinition<google_protobuf_empty_pb.Empty, hts_common_common_pb.Result>;
}

export const FacilityServiceService: IFacilityServiceService;

export interface IFacilityServiceServer extends grpc.UntypedServiceImplementation {
  getFacilityList: grpc.handleUnaryCall<hts_facility_service_pb.GetFacilityListRequest, hts_facility_service_pb.GetFacilityListResponse>;
  getFacilityRequestList: grpc.handleUnaryCall<hts_facility_service_pb.GetFacilityRequestListRequest, hts_facility_service_pb.GetFacilityRequestListResponse>;
  getFacilityRequestsListStatus: grpc.handleUnaryCall<hts_facility_service_pb.GetFacilityRequestsListStatusRequest, hts_facility_service_pb.GetFacilityRequestsListStatusResponse>;
  getFacilityRequestStatus: grpc.handleUnaryCall<hts_facility_service_pb.GetFacilityRequestStatusRequest, hts_common_common_pb.FacilityRequest>;
  getFacilityRequestStatusFull: grpc.handleUnaryCall<hts_facility_service_pb.GetFacilityRequestStatusFullRequest, hts_facility_service_pb.FacilityRequestWithFacilityInfo>;
  getAvailableFacilityList: grpc.handleUnaryCall<google_protobuf_empty_pb.Empty, hts_facility_service_pb.GetAvailableFacilityListResponse>;
  getAvailableTimeOfFacility: grpc.handleUnaryCall<hts_facility_service_pb.GetAvailableTimeOfFacilityRequest, hts_facility_service_pb.GetAvailableTimeOfFacilityResponse>;
  createFacilityRequest: grpc.handleUnaryCall<hts_facility_service_pb.CreateFacilityRequestRequest, hts_common_common_pb.FacilityRequest>;
  approveFacilityRequest: grpc.handleUnaryCall<hts_facility_service_pb.ApproveFacilityRequestRequest, hts_common_common_pb.Result>;
  rejectFacilityRequest: grpc.handleUnaryCall<hts_facility_service_pb.RejectFacilityRequestRequest, hts_common_common_pb.Result>;
  getFacilityInfo: grpc.handleUnaryCall<hts_facility_service_pb.GetFacilityInfoRequest, hts_common_common_pb.Facility>;
  ping: grpc.handleUnaryCall<google_protobuf_empty_pb.Empty, hts_common_common_pb.Result>;
}

export class FacilityServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  getFacilityList(argument: hts_facility_service_pb.GetFacilityListRequest, callback: grpc.requestCallback<hts_facility_service_pb.GetFacilityListResponse>): grpc.ClientUnaryCall;
  getFacilityList(argument: hts_facility_service_pb.GetFacilityListRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.GetFacilityListResponse>): grpc.ClientUnaryCall;
  getFacilityList(argument: hts_facility_service_pb.GetFacilityListRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.GetFacilityListResponse>): grpc.ClientUnaryCall;
  getFacilityRequestList(argument: hts_facility_service_pb.GetFacilityRequestListRequest, callback: grpc.requestCallback<hts_facility_service_pb.GetFacilityRequestListResponse>): grpc.ClientUnaryCall;
  getFacilityRequestList(argument: hts_facility_service_pb.GetFacilityRequestListRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.GetFacilityRequestListResponse>): grpc.ClientUnaryCall;
  getFacilityRequestList(argument: hts_facility_service_pb.GetFacilityRequestListRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.GetFacilityRequestListResponse>): grpc.ClientUnaryCall;
  getFacilityRequestsListStatus(argument: hts_facility_service_pb.GetFacilityRequestsListStatusRequest, callback: grpc.requestCallback<hts_facility_service_pb.GetFacilityRequestsListStatusResponse>): grpc.ClientUnaryCall;
  getFacilityRequestsListStatus(argument: hts_facility_service_pb.GetFacilityRequestsListStatusRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.GetFacilityRequestsListStatusResponse>): grpc.ClientUnaryCall;
  getFacilityRequestsListStatus(argument: hts_facility_service_pb.GetFacilityRequestsListStatusRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.GetFacilityRequestsListStatusResponse>): grpc.ClientUnaryCall;
  getFacilityRequestStatus(argument: hts_facility_service_pb.GetFacilityRequestStatusRequest, callback: grpc.requestCallback<hts_common_common_pb.FacilityRequest>): grpc.ClientUnaryCall;
  getFacilityRequestStatus(argument: hts_facility_service_pb.GetFacilityRequestStatusRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.FacilityRequest>): grpc.ClientUnaryCall;
  getFacilityRequestStatus(argument: hts_facility_service_pb.GetFacilityRequestStatusRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.FacilityRequest>): grpc.ClientUnaryCall;
  getFacilityRequestStatusFull(argument: hts_facility_service_pb.GetFacilityRequestStatusFullRequest, callback: grpc.requestCallback<hts_facility_service_pb.FacilityRequestWithFacilityInfo>): grpc.ClientUnaryCall;
  getFacilityRequestStatusFull(argument: hts_facility_service_pb.GetFacilityRequestStatusFullRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.FacilityRequestWithFacilityInfo>): grpc.ClientUnaryCall;
  getFacilityRequestStatusFull(argument: hts_facility_service_pb.GetFacilityRequestStatusFullRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.FacilityRequestWithFacilityInfo>): grpc.ClientUnaryCall;
  getAvailableFacilityList(argument: google_protobuf_empty_pb.Empty, callback: grpc.requestCallback<hts_facility_service_pb.GetAvailableFacilityListResponse>): grpc.ClientUnaryCall;
  getAvailableFacilityList(argument: google_protobuf_empty_pb.Empty, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.GetAvailableFacilityListResponse>): grpc.ClientUnaryCall;
  getAvailableFacilityList(argument: google_protobuf_empty_pb.Empty, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.GetAvailableFacilityListResponse>): grpc.ClientUnaryCall;
  getAvailableTimeOfFacility(argument: hts_facility_service_pb.GetAvailableTimeOfFacilityRequest, callback: grpc.requestCallback<hts_facility_service_pb.GetAvailableTimeOfFacilityResponse>): grpc.ClientUnaryCall;
  getAvailableTimeOfFacility(argument: hts_facility_service_pb.GetAvailableTimeOfFacilityRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.GetAvailableTimeOfFacilityResponse>): grpc.ClientUnaryCall;
  getAvailableTimeOfFacility(argument: hts_facility_service_pb.GetAvailableTimeOfFacilityRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_facility_service_pb.GetAvailableTimeOfFacilityResponse>): grpc.ClientUnaryCall;
  createFacilityRequest(argument: hts_facility_service_pb.CreateFacilityRequestRequest, callback: grpc.requestCallback<hts_common_common_pb.FacilityRequest>): grpc.ClientUnaryCall;
  createFacilityRequest(argument: hts_facility_service_pb.CreateFacilityRequestRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.FacilityRequest>): grpc.ClientUnaryCall;
  createFacilityRequest(argument: hts_facility_service_pb.CreateFacilityRequestRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.FacilityRequest>): grpc.ClientUnaryCall;
  approveFacilityRequest(argument: hts_facility_service_pb.ApproveFacilityRequestRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  approveFacilityRequest(argument: hts_facility_service_pb.ApproveFacilityRequestRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  approveFacilityRequest(argument: hts_facility_service_pb.ApproveFacilityRequestRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  rejectFacilityRequest(argument: hts_facility_service_pb.RejectFacilityRequestRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  rejectFacilityRequest(argument: hts_facility_service_pb.RejectFacilityRequestRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  rejectFacilityRequest(argument: hts_facility_service_pb.RejectFacilityRequestRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  getFacilityInfo(argument: hts_facility_service_pb.GetFacilityInfoRequest, callback: grpc.requestCallback<hts_common_common_pb.Facility>): grpc.ClientUnaryCall;
  getFacilityInfo(argument: hts_facility_service_pb.GetFacilityInfoRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Facility>): grpc.ClientUnaryCall;
  getFacilityInfo(argument: hts_facility_service_pb.GetFacilityInfoRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Facility>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
}

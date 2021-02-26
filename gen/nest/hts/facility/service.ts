/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
  Status,
  OperatingHour,
  Facility,
  FacilityRequest,
  Result,
} from "../../hts/common/common";
import { Observable } from "rxjs";
import { Timestamp } from "../../google/protobuf/timestamp";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.facility";

export interface FacilityRequestWithFacilityInfo {
  id: number;
  eventId: number;
  facilityId: number;
  organizationId: number;
  status: Status;
  rejectReason: string | undefined;
  start: Timestamp | undefined;
  finish: Timestamp | undefined;
  facilityName: string;
  latitude: number;
  longitude: number;
  operatingHours: OperatingHour[];
  description: string;
}

export interface GetFacilityListRequest {
  organizationId: number;
}

export interface GetFacilityListResponse {
  facilities: Facility[];
}

export interface GetFacilityRequestListRequest {
  userId: number;
  organizationId: number;
}

export interface GetFacilityRequestListResponse {
  requests: FacilityRequestWithFacilityInfo[];
}

export interface GetFacilityRequestsListStatusRequest {
  userId: number;
  eventId: number;
}

export interface GetFacilityRequestsListStatusResponse {
  requests: FacilityRequestWithFacilityInfo[];
}

export interface GetAvailableFacilityListResponse {
  facilities: Facility[];
}

export interface GetAvailableTimeOfFacilityRequest {
  facilityId: number;
  start: Timestamp | undefined;
  end: Timestamp | undefined;
}

export interface GetAvailableTimeOfFacilityResponse {
  day: GetAvailableTimeOfFacilityResponse_Day[];
}

export interface GetAvailableTimeOfFacilityResponse_Day {
  items: boolean[];
}

export interface CreateFacilityRequestRequest {
  userId: number;
  eventId: number;
  facilityId: number;
  start: Timestamp | undefined;
  end: Timestamp | undefined;
}

export interface ApproveFacilityRequestRequest {
  userId: number;
  requestId: number;
}

export interface RejectFacilityRequestRequest {
  userId: number;
  requestId: number;
  reason: string | undefined;
}

export interface GetFacilityInfoRequest {
  facilityId: number;
}

export interface GetFacilityRequestStatusRequest {
  userId: number;
  requestId: number;
}

export interface GetFacilityRequestStatusFullRequest {
  userId: number;
  requestId: number;
}

export const HTS_FACILITY_PACKAGE_NAME = "hts.facility";

export interface FacilityServiceClient {
  getFacilityList(
    request: GetFacilityListRequest
  ): Observable<GetFacilityListResponse>;

  getFacilityRequestList(
    request: GetFacilityRequestListRequest
  ): Observable<GetFacilityRequestListResponse>;

  getFacilityRequestsListStatus(
    request: GetFacilityRequestsListStatusRequest
  ): Observable<GetFacilityRequestsListStatusResponse>;

  getFacilityRequestStatus(
    request: GetFacilityRequestStatusRequest
  ): Observable<FacilityRequest>;

  getFacilityRequestStatusFull(
    request: GetFacilityRequestStatusFullRequest
  ): Observable<FacilityRequestWithFacilityInfo>;

  getAvailableFacilityList(
    request: Empty
  ): Observable<GetAvailableFacilityListResponse>;

  getAvailableTimeOfFacility(
    request: GetAvailableTimeOfFacilityRequest
  ): Observable<GetAvailableTimeOfFacilityResponse>;

  createFacilityRequest(
    request: CreateFacilityRequestRequest
  ): Observable<FacilityRequest>;

  approveFacilityRequest(
    request: ApproveFacilityRequestRequest
  ): Observable<Result>;

  rejectFacilityRequest(
    request: RejectFacilityRequestRequest
  ): Observable<Result>;

  getFacilityInfo(request: GetFacilityInfoRequest): Observable<Facility>;

  ping(request: Empty): Observable<Result>;
}

export interface FacilityServiceController {
  getFacilityList(
    request: GetFacilityListRequest
  ):
    | Promise<GetFacilityListResponse>
    | Observable<GetFacilityListResponse>
    | GetFacilityListResponse;

  getFacilityRequestList(
    request: GetFacilityRequestListRequest
  ):
    | Promise<GetFacilityRequestListResponse>
    | Observable<GetFacilityRequestListResponse>
    | GetFacilityRequestListResponse;

  getFacilityRequestsListStatus(
    request: GetFacilityRequestsListStatusRequest
  ):
    | Promise<GetFacilityRequestsListStatusResponse>
    | Observable<GetFacilityRequestsListStatusResponse>
    | GetFacilityRequestsListStatusResponse;

  getFacilityRequestStatus(
    request: GetFacilityRequestStatusRequest
  ): Promise<FacilityRequest> | Observable<FacilityRequest> | FacilityRequest;

  getFacilityRequestStatusFull(
    request: GetFacilityRequestStatusFullRequest
  ):
    | Promise<FacilityRequestWithFacilityInfo>
    | Observable<FacilityRequestWithFacilityInfo>
    | FacilityRequestWithFacilityInfo;

  getAvailableFacilityList(
    request: Empty
  ):
    | Promise<GetAvailableFacilityListResponse>
    | Observable<GetAvailableFacilityListResponse>
    | GetAvailableFacilityListResponse;

  getAvailableTimeOfFacility(
    request: GetAvailableTimeOfFacilityRequest
  ):
    | Promise<GetAvailableTimeOfFacilityResponse>
    | Observable<GetAvailableTimeOfFacilityResponse>
    | GetAvailableTimeOfFacilityResponse;

  createFacilityRequest(
    request: CreateFacilityRequestRequest
  ): Promise<FacilityRequest> | Observable<FacilityRequest> | FacilityRequest;

  approveFacilityRequest(
    request: ApproveFacilityRequestRequest
  ): Promise<Result> | Observable<Result> | Result;

  rejectFacilityRequest(
    request: RejectFacilityRequestRequest
  ): Promise<Result> | Observable<Result> | Result;

  getFacilityInfo(
    request: GetFacilityInfoRequest
  ): Promise<Facility> | Observable<Facility> | Facility;

  ping(request: Empty): Promise<Result> | Observable<Result> | Result;
}

export function FacilityServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods = [
      "getFacilityList",
      "getFacilityRequestList",
      "getFacilityRequestsListStatus",
      "getFacilityRequestStatus",
      "getFacilityRequestStatusFull",
      "getAvailableFacilityList",
      "getAvailableTimeOfFacility",
      "createFacilityRequest",
      "approveFacilityRequest",
      "rejectFacilityRequest",
      "getFacilityInfo",
      "ping",
    ];
    for (const method of grpcMethods) {
      const descriptor: any = Reflect.getOwnPropertyDescriptor(
        constructor.prototype,
        method
      );
      GrpcMethod("FacilityService", method)(
        constructor.prototype[method],
        method,
        descriptor
      );
    }
    const grpcStreamMethods = [];
    for (const method of grpcStreamMethods) {
      const descriptor: any = Reflect.getOwnPropertyDescriptor(
        constructor.prototype,
        method
      );
      GrpcStreamMethod("FacilityService", method)(
        constructor.prototype[method],
        method,
        descriptor
      );
    }
  };
}

export const FACILITY_SERVICE_NAME = "FacilityService";

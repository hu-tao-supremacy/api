/* eslint-disable */
import {
  Status,
  OperatingHour,
  Facility,
  FacilityRequest,
  Result,
} from "../../hts/common/common";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.facility";

export interface FacilityRequestWithFacilityInfo {
  id: number;
  eventId: number;
  facilityId: number;
  organizationId: number;
  status: Status;
  rejectReason: string | undefined;
  start: Date | undefined;
  finish: Date | undefined;
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
  start: Date | undefined;
  end: Date | undefined;
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
  start: Date | undefined;
  end: Date | undefined;
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

export interface FacilityService {
  GetFacilityList(
    request: GetFacilityListRequest
  ): Promise<GetFacilityListResponse>;
  GetFacilityRequestList(
    request: GetFacilityRequestListRequest
  ): Promise<GetFacilityRequestListResponse>;
  GetFacilityRequestsListStatus(
    request: GetFacilityRequestsListStatusRequest
  ): Promise<GetFacilityRequestsListStatusResponse>;
  GetFacilityRequestStatus(
    request: GetFacilityRequestStatusRequest
  ): Promise<FacilityRequest>;
  GetFacilityRequestStatusFull(
    request: GetFacilityRequestStatusFullRequest
  ): Promise<FacilityRequestWithFacilityInfo>;
  GetAvailableFacilityList(
    request: Empty
  ): Promise<GetAvailableFacilityListResponse>;
  GetAvailableTimeOfFacility(
    request: GetAvailableTimeOfFacilityRequest
  ): Promise<GetAvailableTimeOfFacilityResponse>;
  CreateFacilityRequest(
    request: CreateFacilityRequestRequest
  ): Promise<FacilityRequest>;
  ApproveFacilityRequest(
    request: ApproveFacilityRequestRequest
  ): Promise<Result>;
  RejectFacilityRequest(request: RejectFacilityRequestRequest): Promise<Result>;
  GetFacilityInfo(request: GetFacilityInfoRequest): Promise<Facility>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

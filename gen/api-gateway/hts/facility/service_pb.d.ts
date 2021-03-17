// package: hts.facility
// file: hts/facility/service.proto

import * as jspb from "google-protobuf";
import * as hts_common_common_pb from "../../hts/common/common_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";
import * as google_protobuf_timestamp_pb from "google-protobuf/google/protobuf/timestamp_pb";
import * as google_protobuf_wrappers_pb from "google-protobuf/google/protobuf/wrappers_pb";

export class FacilityRequestWithFacilityInfo extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  getFacilityId(): number;
  setFacilityId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  getStatus(): hts_common_common_pb.StatusMap[keyof hts_common_common_pb.StatusMap];
  setStatus(value: hts_common_common_pb.StatusMap[keyof hts_common_common_pb.StatusMap]): void;

  hasRejectReason(): boolean;
  clearRejectReason(): void;
  getRejectReason(): google_protobuf_wrappers_pb.StringValue | undefined;
  setRejectReason(value?: google_protobuf_wrappers_pb.StringValue): void;

  hasStart(): boolean;
  clearStart(): void;
  getStart(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setStart(value?: google_protobuf_timestamp_pb.Timestamp): void;

  hasFinish(): boolean;
  clearFinish(): void;
  getFinish(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setFinish(value?: google_protobuf_timestamp_pb.Timestamp): void;

  getFacilityName(): string;
  setFacilityName(value: string): void;

  getLatitude(): number;
  setLatitude(value: number): void;

  getLongitude(): number;
  setLongitude(value: number): void;

  clearOperatingHoursList(): void;
  getOperatingHoursList(): Array<hts_common_common_pb.OperatingHour>;
  setOperatingHoursList(value: Array<hts_common_common_pb.OperatingHour>): void;
  addOperatingHours(value?: hts_common_common_pb.OperatingHour, index?: number): hts_common_common_pb.OperatingHour;

  getDescription(): string;
  setDescription(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FacilityRequestWithFacilityInfo.AsObject;
  static toObject(includeInstance: boolean, msg: FacilityRequestWithFacilityInfo): FacilityRequestWithFacilityInfo.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FacilityRequestWithFacilityInfo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FacilityRequestWithFacilityInfo;
  static deserializeBinaryFromReader(message: FacilityRequestWithFacilityInfo, reader: jspb.BinaryReader): FacilityRequestWithFacilityInfo;
}

export namespace FacilityRequestWithFacilityInfo {
  export type AsObject = {
    id: number,
    eventId: number,
    facilityId: number,
    organizationId: number,
    status: hts_common_common_pb.StatusMap[keyof hts_common_common_pb.StatusMap],
    rejectReason?: google_protobuf_wrappers_pb.StringValue.AsObject,
    start?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    finish?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    facilityName: string,
    latitude: number,
    longitude: number,
    operatingHoursList: Array<hts_common_common_pb.OperatingHour.AsObject>,
    description: string,
  }
}

export class GetFacilityListRequest extends jspb.Message {
  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFacilityListRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetFacilityListRequest): GetFacilityListRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFacilityListRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFacilityListRequest;
  static deserializeBinaryFromReader(message: GetFacilityListRequest, reader: jspb.BinaryReader): GetFacilityListRequest;
}

export namespace GetFacilityListRequest {
  export type AsObject = {
    organizationId: number,
  }
}

export class GetFacilityListResponse extends jspb.Message {
  clearFacilitiesList(): void;
  getFacilitiesList(): Array<hts_common_common_pb.Facility>;
  setFacilitiesList(value: Array<hts_common_common_pb.Facility>): void;
  addFacilities(value?: hts_common_common_pb.Facility, index?: number): hts_common_common_pb.Facility;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFacilityListResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetFacilityListResponse): GetFacilityListResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFacilityListResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFacilityListResponse;
  static deserializeBinaryFromReader(message: GetFacilityListResponse, reader: jspb.BinaryReader): GetFacilityListResponse;
}

export namespace GetFacilityListResponse {
  export type AsObject = {
    facilitiesList: Array<hts_common_common_pb.Facility.AsObject>,
  }
}

export class GetFacilityRequestListRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFacilityRequestListRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetFacilityRequestListRequest): GetFacilityRequestListRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFacilityRequestListRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFacilityRequestListRequest;
  static deserializeBinaryFromReader(message: GetFacilityRequestListRequest, reader: jspb.BinaryReader): GetFacilityRequestListRequest;
}

export namespace GetFacilityRequestListRequest {
  export type AsObject = {
    userId: number,
    organizationId: number,
  }
}

export class GetFacilityRequestListResponse extends jspb.Message {
  clearRequestsList(): void;
  getRequestsList(): Array<FacilityRequestWithFacilityInfo>;
  setRequestsList(value: Array<FacilityRequestWithFacilityInfo>): void;
  addRequests(value?: FacilityRequestWithFacilityInfo, index?: number): FacilityRequestWithFacilityInfo;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFacilityRequestListResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetFacilityRequestListResponse): GetFacilityRequestListResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFacilityRequestListResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFacilityRequestListResponse;
  static deserializeBinaryFromReader(message: GetFacilityRequestListResponse, reader: jspb.BinaryReader): GetFacilityRequestListResponse;
}

export namespace GetFacilityRequestListResponse {
  export type AsObject = {
    requestsList: Array<FacilityRequestWithFacilityInfo.AsObject>,
  }
}

export class GetFacilityRequestsListStatusRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFacilityRequestsListStatusRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetFacilityRequestsListStatusRequest): GetFacilityRequestsListStatusRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFacilityRequestsListStatusRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFacilityRequestsListStatusRequest;
  static deserializeBinaryFromReader(message: GetFacilityRequestsListStatusRequest, reader: jspb.BinaryReader): GetFacilityRequestsListStatusRequest;
}

export namespace GetFacilityRequestsListStatusRequest {
  export type AsObject = {
    userId: number,
    eventId: number,
  }
}

export class GetFacilityRequestsListStatusResponse extends jspb.Message {
  clearRequestsList(): void;
  getRequestsList(): Array<FacilityRequestWithFacilityInfo>;
  setRequestsList(value: Array<FacilityRequestWithFacilityInfo>): void;
  addRequests(value?: FacilityRequestWithFacilityInfo, index?: number): FacilityRequestWithFacilityInfo;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFacilityRequestsListStatusResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetFacilityRequestsListStatusResponse): GetFacilityRequestsListStatusResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFacilityRequestsListStatusResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFacilityRequestsListStatusResponse;
  static deserializeBinaryFromReader(message: GetFacilityRequestsListStatusResponse, reader: jspb.BinaryReader): GetFacilityRequestsListStatusResponse;
}

export namespace GetFacilityRequestsListStatusResponse {
  export type AsObject = {
    requestsList: Array<FacilityRequestWithFacilityInfo.AsObject>,
  }
}

export class GetAvailableFacilityListResponse extends jspb.Message {
  clearFacilitiesList(): void;
  getFacilitiesList(): Array<hts_common_common_pb.Facility>;
  setFacilitiesList(value: Array<hts_common_common_pb.Facility>): void;
  addFacilities(value?: hts_common_common_pb.Facility, index?: number): hts_common_common_pb.Facility;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetAvailableFacilityListResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetAvailableFacilityListResponse): GetAvailableFacilityListResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetAvailableFacilityListResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetAvailableFacilityListResponse;
  static deserializeBinaryFromReader(message: GetAvailableFacilityListResponse, reader: jspb.BinaryReader): GetAvailableFacilityListResponse;
}

export namespace GetAvailableFacilityListResponse {
  export type AsObject = {
    facilitiesList: Array<hts_common_common_pb.Facility.AsObject>,
  }
}

export class GetAvailableTimeOfFacilityRequest extends jspb.Message {
  getFacilityId(): number;
  setFacilityId(value: number): void;

  hasStart(): boolean;
  clearStart(): void;
  getStart(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setStart(value?: google_protobuf_timestamp_pb.Timestamp): void;

  hasEnd(): boolean;
  clearEnd(): void;
  getEnd(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setEnd(value?: google_protobuf_timestamp_pb.Timestamp): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetAvailableTimeOfFacilityRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetAvailableTimeOfFacilityRequest): GetAvailableTimeOfFacilityRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetAvailableTimeOfFacilityRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetAvailableTimeOfFacilityRequest;
  static deserializeBinaryFromReader(message: GetAvailableTimeOfFacilityRequest, reader: jspb.BinaryReader): GetAvailableTimeOfFacilityRequest;
}

export namespace GetAvailableTimeOfFacilityRequest {
  export type AsObject = {
    facilityId: number,
    start?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    end?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

export class GetAvailableTimeOfFacilityResponse extends jspb.Message {
  clearDayList(): void;
  getDayList(): Array<GetAvailableTimeOfFacilityResponse.Day>;
  setDayList(value: Array<GetAvailableTimeOfFacilityResponse.Day>): void;
  addDay(value?: GetAvailableTimeOfFacilityResponse.Day, index?: number): GetAvailableTimeOfFacilityResponse.Day;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetAvailableTimeOfFacilityResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetAvailableTimeOfFacilityResponse): GetAvailableTimeOfFacilityResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetAvailableTimeOfFacilityResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetAvailableTimeOfFacilityResponse;
  static deserializeBinaryFromReader(message: GetAvailableTimeOfFacilityResponse, reader: jspb.BinaryReader): GetAvailableTimeOfFacilityResponse;
}

export namespace GetAvailableTimeOfFacilityResponse {
  export type AsObject = {
    dayList: Array<GetAvailableTimeOfFacilityResponse.Day.AsObject>,
  }

  export class Day extends jspb.Message {
    clearItemsList(): void;
    getItemsList(): Array<boolean>;
    setItemsList(value: Array<boolean>): void;
    addItems(value: boolean, index?: number): boolean;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): Day.AsObject;
    static toObject(includeInstance: boolean, msg: Day): Day.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: Day, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): Day;
    static deserializeBinaryFromReader(message: Day, reader: jspb.BinaryReader): Day;
  }

  export namespace Day {
    export type AsObject = {
      itemsList: Array<boolean>,
    }
  }
}

export class CreateFacilityRequestRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  getFacilityId(): number;
  setFacilityId(value: number): void;

  hasStart(): boolean;
  clearStart(): void;
  getStart(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setStart(value?: google_protobuf_timestamp_pb.Timestamp): void;

  hasEnd(): boolean;
  clearEnd(): void;
  getEnd(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setEnd(value?: google_protobuf_timestamp_pb.Timestamp): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateFacilityRequestRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CreateFacilityRequestRequest): CreateFacilityRequestRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CreateFacilityRequestRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateFacilityRequestRequest;
  static deserializeBinaryFromReader(message: CreateFacilityRequestRequest, reader: jspb.BinaryReader): CreateFacilityRequestRequest;
}

export namespace CreateFacilityRequestRequest {
  export type AsObject = {
    userId: number,
    eventId: number,
    facilityId: number,
    start?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    end?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

export class ApproveFacilityRequestRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getRequestId(): number;
  setRequestId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ApproveFacilityRequestRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ApproveFacilityRequestRequest): ApproveFacilityRequestRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ApproveFacilityRequestRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ApproveFacilityRequestRequest;
  static deserializeBinaryFromReader(message: ApproveFacilityRequestRequest, reader: jspb.BinaryReader): ApproveFacilityRequestRequest;
}

export namespace ApproveFacilityRequestRequest {
  export type AsObject = {
    userId: number,
    requestId: number,
  }
}

export class RejectFacilityRequestRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getRequestId(): number;
  setRequestId(value: number): void;

  hasReason(): boolean;
  clearReason(): void;
  getReason(): google_protobuf_wrappers_pb.StringValue | undefined;
  setReason(value?: google_protobuf_wrappers_pb.StringValue): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RejectFacilityRequestRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RejectFacilityRequestRequest): RejectFacilityRequestRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RejectFacilityRequestRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RejectFacilityRequestRequest;
  static deserializeBinaryFromReader(message: RejectFacilityRequestRequest, reader: jspb.BinaryReader): RejectFacilityRequestRequest;
}

export namespace RejectFacilityRequestRequest {
  export type AsObject = {
    userId: number,
    requestId: number,
    reason?: google_protobuf_wrappers_pb.StringValue.AsObject,
  }
}

export class GetFacilityInfoRequest extends jspb.Message {
  getFacilityId(): number;
  setFacilityId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFacilityInfoRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetFacilityInfoRequest): GetFacilityInfoRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFacilityInfoRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFacilityInfoRequest;
  static deserializeBinaryFromReader(message: GetFacilityInfoRequest, reader: jspb.BinaryReader): GetFacilityInfoRequest;
}

export namespace GetFacilityInfoRequest {
  export type AsObject = {
    facilityId: number,
  }
}

export class GetFacilityRequestStatusRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getRequestId(): number;
  setRequestId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFacilityRequestStatusRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetFacilityRequestStatusRequest): GetFacilityRequestStatusRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFacilityRequestStatusRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFacilityRequestStatusRequest;
  static deserializeBinaryFromReader(message: GetFacilityRequestStatusRequest, reader: jspb.BinaryReader): GetFacilityRequestStatusRequest;
}

export namespace GetFacilityRequestStatusRequest {
  export type AsObject = {
    userId: number,
    requestId: number,
  }
}

export class GetFacilityRequestStatusFullRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getRequestId(): number;
  setRequestId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFacilityRequestStatusFullRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetFacilityRequestStatusFullRequest): GetFacilityRequestStatusFullRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFacilityRequestStatusFullRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFacilityRequestStatusFullRequest;
  static deserializeBinaryFromReader(message: GetFacilityRequestStatusFullRequest, reader: jspb.BinaryReader): GetFacilityRequestStatusFullRequest;
}

export namespace GetFacilityRequestStatusFullRequest {
  export type AsObject = {
    userId: number,
    requestId: number,
  }
}


/* eslint-disable */
import {
  FacilityRequest_Status,
  OperatingHour,
  Facility,
  FacilityRequest,
  facilityRequest_StatusFromJSON,
  facilityRequest_StatusToJSON,
} from "../../hts/common/common";
import { Timestamp } from "../../google/protobuf/timestamp";
import { Writer, Reader } from "protobufjs/minimal";
import { Empty } from "../../google/protobuf/empty";
import { StringValue } from "../../google/protobuf/wrappers";

export const protobufPackage = "hts.facility";

export interface FacilityRequestWithFacilityInfo {
  id: number;
  eventId: number;
  facilityId: number;
  organizationId: number;
  status: FacilityRequest_Status;
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

const baseFacilityRequestWithFacilityInfo: object = {
  id: 0,
  eventId: 0,
  facilityId: 0,
  organizationId: 0,
  status: 0,
  facilityName: "",
  latitude: 0,
  longitude: 0,
  description: "",
};

export const FacilityRequestWithFacilityInfo = {
  encode(
    message: FacilityRequestWithFacilityInfo,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
    }
    if (message.facilityId !== 0) {
      writer.uint32(24).int32(message.facilityId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(32).int32(message.organizationId);
    }
    if (message.status !== 0) {
      writer.uint32(40).int32(message.status);
    }
    if (message.rejectReason !== undefined) {
      StringValue.encode(
        { value: message.rejectReason! },
        writer.uint32(50).fork()
      ).ldelim();
    }
    if (message.start !== undefined) {
      Timestamp.encode(
        toTimestamp(message.start),
        writer.uint32(58).fork()
      ).ldelim();
    }
    if (message.finish !== undefined) {
      Timestamp.encode(
        toTimestamp(message.finish),
        writer.uint32(66).fork()
      ).ldelim();
    }
    if (message.facilityName !== "") {
      writer.uint32(74).string(message.facilityName);
    }
    if (message.latitude !== 0) {
      writer.uint32(81).double(message.latitude);
    }
    if (message.longitude !== 0) {
      writer.uint32(89).double(message.longitude);
    }
    for (const v of message.operatingHours) {
      OperatingHour.encode(v!, writer.uint32(98).fork()).ldelim();
    }
    if (message.description !== "") {
      writer.uint32(106).string(message.description);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): FacilityRequestWithFacilityInfo {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseFacilityRequestWithFacilityInfo,
    } as FacilityRequestWithFacilityInfo;
    message.operatingHours = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.eventId = reader.int32();
          break;
        case 3:
          message.facilityId = reader.int32();
          break;
        case 4:
          message.organizationId = reader.int32();
          break;
        case 5:
          message.status = reader.int32() as any;
          break;
        case 6:
          message.rejectReason = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 7:
          message.start = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        case 8:
          message.finish = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        case 9:
          message.facilityName = reader.string();
          break;
        case 10:
          message.latitude = reader.double();
          break;
        case 11:
          message.longitude = reader.double();
          break;
        case 12:
          message.operatingHours.push(
            OperatingHour.decode(reader, reader.uint32())
          );
          break;
        case 13:
          message.description = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): FacilityRequestWithFacilityInfo {
    const message = {
      ...baseFacilityRequestWithFacilityInfo,
    } as FacilityRequestWithFacilityInfo;
    message.operatingHours = [];
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    if (object.facilityId !== undefined && object.facilityId !== null) {
      message.facilityId = Number(object.facilityId);
    } else {
      message.facilityId = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = facilityRequest_StatusFromJSON(object.status);
    } else {
      message.status = 0;
    }
    if (object.rejectReason !== undefined && object.rejectReason !== null) {
      message.rejectReason = String(object.rejectReason);
    } else {
      message.rejectReason = undefined;
    }
    if (object.start !== undefined && object.start !== null) {
      message.start = fromJsonTimestamp(object.start);
    } else {
      message.start = undefined;
    }
    if (object.finish !== undefined && object.finish !== null) {
      message.finish = fromJsonTimestamp(object.finish);
    } else {
      message.finish = undefined;
    }
    if (object.facilityName !== undefined && object.facilityName !== null) {
      message.facilityName = String(object.facilityName);
    } else {
      message.facilityName = "";
    }
    if (object.latitude !== undefined && object.latitude !== null) {
      message.latitude = Number(object.latitude);
    } else {
      message.latitude = 0;
    }
    if (object.longitude !== undefined && object.longitude !== null) {
      message.longitude = Number(object.longitude);
    } else {
      message.longitude = 0;
    }
    if (object.operatingHours !== undefined && object.operatingHours !== null) {
      for (const e of object.operatingHours) {
        message.operatingHours.push(OperatingHour.fromJSON(e));
      }
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = String(object.description);
    } else {
      message.description = "";
    }
    return message;
  },

  toJSON(message: FacilityRequestWithFacilityInfo): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    message.facilityId !== undefined && (obj.facilityId = message.facilityId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.status !== undefined &&
      (obj.status = facilityRequest_StatusToJSON(message.status));
    message.rejectReason !== undefined &&
      (obj.rejectReason = message.rejectReason);
    message.start !== undefined &&
      (obj.start =
        message.start !== undefined ? message.start.toISOString() : null);
    message.finish !== undefined &&
      (obj.finish =
        message.finish !== undefined ? message.finish.toISOString() : null);
    message.facilityName !== undefined &&
      (obj.facilityName = message.facilityName);
    message.latitude !== undefined && (obj.latitude = message.latitude);
    message.longitude !== undefined && (obj.longitude = message.longitude);
    if (message.operatingHours) {
      obj.operatingHours = message.operatingHours.map((e) =>
        e ? OperatingHour.toJSON(e) : undefined
      );
    } else {
      obj.operatingHours = [];
    }
    message.description !== undefined &&
      (obj.description = message.description);
    return obj;
  },

  fromPartial(
    object: DeepPartial<FacilityRequestWithFacilityInfo>
  ): FacilityRequestWithFacilityInfo {
    const message = {
      ...baseFacilityRequestWithFacilityInfo,
    } as FacilityRequestWithFacilityInfo;
    message.operatingHours = [];
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    if (object.facilityId !== undefined && object.facilityId !== null) {
      message.facilityId = object.facilityId;
    } else {
      message.facilityId = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = object.organizationId;
    } else {
      message.organizationId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = object.status;
    } else {
      message.status = 0;
    }
    if (object.rejectReason !== undefined && object.rejectReason !== null) {
      message.rejectReason = object.rejectReason;
    } else {
      message.rejectReason = undefined;
    }
    if (object.start !== undefined && object.start !== null) {
      message.start = object.start;
    } else {
      message.start = undefined;
    }
    if (object.finish !== undefined && object.finish !== null) {
      message.finish = object.finish;
    } else {
      message.finish = undefined;
    }
    if (object.facilityName !== undefined && object.facilityName !== null) {
      message.facilityName = object.facilityName;
    } else {
      message.facilityName = "";
    }
    if (object.latitude !== undefined && object.latitude !== null) {
      message.latitude = object.latitude;
    } else {
      message.latitude = 0;
    }
    if (object.longitude !== undefined && object.longitude !== null) {
      message.longitude = object.longitude;
    } else {
      message.longitude = 0;
    }
    if (object.operatingHours !== undefined && object.operatingHours !== null) {
      for (const e of object.operatingHours) {
        message.operatingHours.push(OperatingHour.fromPartial(e));
      }
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = object.description;
    } else {
      message.description = "";
    }
    return message;
  },
};

const baseGetFacilityListRequest: object = { organizationId: 0 };

export const GetFacilityListRequest = {
  encode(
    message: GetFacilityListRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.organizationId !== 0) {
      writer.uint32(8).int32(message.organizationId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetFacilityListRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetFacilityListRequest } as GetFacilityListRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.organizationId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetFacilityListRequest {
    const message = { ...baseGetFacilityListRequest } as GetFacilityListRequest;
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    return message;
  },

  toJSON(message: GetFacilityListRequest): unknown {
    const obj: any = {};
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetFacilityListRequest>
  ): GetFacilityListRequest {
    const message = { ...baseGetFacilityListRequest } as GetFacilityListRequest;
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = object.organizationId;
    } else {
      message.organizationId = 0;
    }
    return message;
  },
};

const baseGetFacilityListResponse: object = {};

export const GetFacilityListResponse = {
  encode(
    message: GetFacilityListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.facilities) {
      Facility.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetFacilityListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetFacilityListResponse,
    } as GetFacilityListResponse;
    message.facilities = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.facilities.push(Facility.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetFacilityListResponse {
    const message = {
      ...baseGetFacilityListResponse,
    } as GetFacilityListResponse;
    message.facilities = [];
    if (object.facilities !== undefined && object.facilities !== null) {
      for (const e of object.facilities) {
        message.facilities.push(Facility.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetFacilityListResponse): unknown {
    const obj: any = {};
    if (message.facilities) {
      obj.facilities = message.facilities.map((e) =>
        e ? Facility.toJSON(e) : undefined
      );
    } else {
      obj.facilities = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetFacilityListResponse>
  ): GetFacilityListResponse {
    const message = {
      ...baseGetFacilityListResponse,
    } as GetFacilityListResponse;
    message.facilities = [];
    if (object.facilities !== undefined && object.facilities !== null) {
      for (const e of object.facilities) {
        message.facilities.push(Facility.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetFacilityRequestListRequest: object = {
  userId: 0,
  organizationId: 0,
};

export const GetFacilityRequestListRequest = {
  encode(
    message: GetFacilityRequestListRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int32(message.organizationId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetFacilityRequestListRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetFacilityRequestListRequest,
    } as GetFacilityRequestListRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.organizationId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetFacilityRequestListRequest {
    const message = {
      ...baseGetFacilityRequestListRequest,
    } as GetFacilityRequestListRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    return message;
  },

  toJSON(message: GetFacilityRequestListRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetFacilityRequestListRequest>
  ): GetFacilityRequestListRequest {
    const message = {
      ...baseGetFacilityRequestListRequest,
    } as GetFacilityRequestListRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = object.organizationId;
    } else {
      message.organizationId = 0;
    }
    return message;
  },
};

const baseGetFacilityRequestListResponse: object = {};

export const GetFacilityRequestListResponse = {
  encode(
    message: GetFacilityRequestListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.requests) {
      FacilityRequestWithFacilityInfo.encode(
        v!,
        writer.uint32(10).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetFacilityRequestListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetFacilityRequestListResponse,
    } as GetFacilityRequestListResponse;
    message.requests = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.requests.push(
            FacilityRequestWithFacilityInfo.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetFacilityRequestListResponse {
    const message = {
      ...baseGetFacilityRequestListResponse,
    } as GetFacilityRequestListResponse;
    message.requests = [];
    if (object.requests !== undefined && object.requests !== null) {
      for (const e of object.requests) {
        message.requests.push(FacilityRequestWithFacilityInfo.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetFacilityRequestListResponse): unknown {
    const obj: any = {};
    if (message.requests) {
      obj.requests = message.requests.map((e) =>
        e ? FacilityRequestWithFacilityInfo.toJSON(e) : undefined
      );
    } else {
      obj.requests = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetFacilityRequestListResponse>
  ): GetFacilityRequestListResponse {
    const message = {
      ...baseGetFacilityRequestListResponse,
    } as GetFacilityRequestListResponse;
    message.requests = [];
    if (object.requests !== undefined && object.requests !== null) {
      for (const e of object.requests) {
        message.requests.push(FacilityRequestWithFacilityInfo.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetFacilityRequestsListStatusRequest: object = {
  userId: 0,
  eventId: 0,
};

export const GetFacilityRequestsListStatusRequest = {
  encode(
    message: GetFacilityRequestsListStatusRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetFacilityRequestsListStatusRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetFacilityRequestsListStatusRequest,
    } as GetFacilityRequestsListStatusRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.eventId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetFacilityRequestsListStatusRequest {
    const message = {
      ...baseGetFacilityRequestsListStatusRequest,
    } as GetFacilityRequestsListStatusRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: GetFacilityRequestsListStatusRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetFacilityRequestsListStatusRequest>
  ): GetFacilityRequestsListStatusRequest {
    const message = {
      ...baseGetFacilityRequestsListStatusRequest,
    } as GetFacilityRequestsListStatusRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    return message;
  },
};

const baseGetFacilityRequestsListStatusResponse: object = {};

export const GetFacilityRequestsListStatusResponse = {
  encode(
    message: GetFacilityRequestsListStatusResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.requests) {
      FacilityRequestWithFacilityInfo.encode(
        v!,
        writer.uint32(10).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetFacilityRequestsListStatusResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetFacilityRequestsListStatusResponse,
    } as GetFacilityRequestsListStatusResponse;
    message.requests = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.requests.push(
            FacilityRequestWithFacilityInfo.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetFacilityRequestsListStatusResponse {
    const message = {
      ...baseGetFacilityRequestsListStatusResponse,
    } as GetFacilityRequestsListStatusResponse;
    message.requests = [];
    if (object.requests !== undefined && object.requests !== null) {
      for (const e of object.requests) {
        message.requests.push(FacilityRequestWithFacilityInfo.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetFacilityRequestsListStatusResponse): unknown {
    const obj: any = {};
    if (message.requests) {
      obj.requests = message.requests.map((e) =>
        e ? FacilityRequestWithFacilityInfo.toJSON(e) : undefined
      );
    } else {
      obj.requests = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetFacilityRequestsListStatusResponse>
  ): GetFacilityRequestsListStatusResponse {
    const message = {
      ...baseGetFacilityRequestsListStatusResponse,
    } as GetFacilityRequestsListStatusResponse;
    message.requests = [];
    if (object.requests !== undefined && object.requests !== null) {
      for (const e of object.requests) {
        message.requests.push(FacilityRequestWithFacilityInfo.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetAvailableFacilityListResponse: object = {};

export const GetAvailableFacilityListResponse = {
  encode(
    message: GetAvailableFacilityListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.facilities) {
      Facility.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetAvailableFacilityListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetAvailableFacilityListResponse,
    } as GetAvailableFacilityListResponse;
    message.facilities = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.facilities.push(Facility.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetAvailableFacilityListResponse {
    const message = {
      ...baseGetAvailableFacilityListResponse,
    } as GetAvailableFacilityListResponse;
    message.facilities = [];
    if (object.facilities !== undefined && object.facilities !== null) {
      for (const e of object.facilities) {
        message.facilities.push(Facility.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetAvailableFacilityListResponse): unknown {
    const obj: any = {};
    if (message.facilities) {
      obj.facilities = message.facilities.map((e) =>
        e ? Facility.toJSON(e) : undefined
      );
    } else {
      obj.facilities = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetAvailableFacilityListResponse>
  ): GetAvailableFacilityListResponse {
    const message = {
      ...baseGetAvailableFacilityListResponse,
    } as GetAvailableFacilityListResponse;
    message.facilities = [];
    if (object.facilities !== undefined && object.facilities !== null) {
      for (const e of object.facilities) {
        message.facilities.push(Facility.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetAvailableTimeOfFacilityRequest: object = { facilityId: 0 };

export const GetAvailableTimeOfFacilityRequest = {
  encode(
    message: GetAvailableTimeOfFacilityRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.facilityId !== 0) {
      writer.uint32(8).int32(message.facilityId);
    }
    if (message.start !== undefined) {
      Timestamp.encode(
        toTimestamp(message.start),
        writer.uint32(18).fork()
      ).ldelim();
    }
    if (message.end !== undefined) {
      Timestamp.encode(
        toTimestamp(message.end),
        writer.uint32(26).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetAvailableTimeOfFacilityRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetAvailableTimeOfFacilityRequest,
    } as GetAvailableTimeOfFacilityRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.facilityId = reader.int32();
          break;
        case 2:
          message.start = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        case 3:
          message.end = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetAvailableTimeOfFacilityRequest {
    const message = {
      ...baseGetAvailableTimeOfFacilityRequest,
    } as GetAvailableTimeOfFacilityRequest;
    if (object.facilityId !== undefined && object.facilityId !== null) {
      message.facilityId = Number(object.facilityId);
    } else {
      message.facilityId = 0;
    }
    if (object.start !== undefined && object.start !== null) {
      message.start = fromJsonTimestamp(object.start);
    } else {
      message.start = undefined;
    }
    if (object.end !== undefined && object.end !== null) {
      message.end = fromJsonTimestamp(object.end);
    } else {
      message.end = undefined;
    }
    return message;
  },

  toJSON(message: GetAvailableTimeOfFacilityRequest): unknown {
    const obj: any = {};
    message.facilityId !== undefined && (obj.facilityId = message.facilityId);
    message.start !== undefined &&
      (obj.start =
        message.start !== undefined ? message.start.toISOString() : null);
    message.end !== undefined &&
      (obj.end = message.end !== undefined ? message.end.toISOString() : null);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetAvailableTimeOfFacilityRequest>
  ): GetAvailableTimeOfFacilityRequest {
    const message = {
      ...baseGetAvailableTimeOfFacilityRequest,
    } as GetAvailableTimeOfFacilityRequest;
    if (object.facilityId !== undefined && object.facilityId !== null) {
      message.facilityId = object.facilityId;
    } else {
      message.facilityId = 0;
    }
    if (object.start !== undefined && object.start !== null) {
      message.start = object.start;
    } else {
      message.start = undefined;
    }
    if (object.end !== undefined && object.end !== null) {
      message.end = object.end;
    } else {
      message.end = undefined;
    }
    return message;
  },
};

const baseGetAvailableTimeOfFacilityResponse: object = {};

export const GetAvailableTimeOfFacilityResponse = {
  encode(
    message: GetAvailableTimeOfFacilityResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.day) {
      GetAvailableTimeOfFacilityResponse_Day.encode(
        v!,
        writer.uint32(10).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetAvailableTimeOfFacilityResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetAvailableTimeOfFacilityResponse,
    } as GetAvailableTimeOfFacilityResponse;
    message.day = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.day.push(
            GetAvailableTimeOfFacilityResponse_Day.decode(
              reader,
              reader.uint32()
            )
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetAvailableTimeOfFacilityResponse {
    const message = {
      ...baseGetAvailableTimeOfFacilityResponse,
    } as GetAvailableTimeOfFacilityResponse;
    message.day = [];
    if (object.day !== undefined && object.day !== null) {
      for (const e of object.day) {
        message.day.push(GetAvailableTimeOfFacilityResponse_Day.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetAvailableTimeOfFacilityResponse): unknown {
    const obj: any = {};
    if (message.day) {
      obj.day = message.day.map((e) =>
        e ? GetAvailableTimeOfFacilityResponse_Day.toJSON(e) : undefined
      );
    } else {
      obj.day = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetAvailableTimeOfFacilityResponse>
  ): GetAvailableTimeOfFacilityResponse {
    const message = {
      ...baseGetAvailableTimeOfFacilityResponse,
    } as GetAvailableTimeOfFacilityResponse;
    message.day = [];
    if (object.day !== undefined && object.day !== null) {
      for (const e of object.day) {
        message.day.push(GetAvailableTimeOfFacilityResponse_Day.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetAvailableTimeOfFacilityResponse_Day: object = { items: false };

export const GetAvailableTimeOfFacilityResponse_Day = {
  encode(
    message: GetAvailableTimeOfFacilityResponse_Day,
    writer: Writer = Writer.create()
  ): Writer {
    writer.uint32(10).fork();
    for (const v of message.items) {
      writer.bool(v);
    }
    writer.ldelim();
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetAvailableTimeOfFacilityResponse_Day {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetAvailableTimeOfFacilityResponse_Day,
    } as GetAvailableTimeOfFacilityResponse_Day;
    message.items = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.items.push(reader.bool());
            }
          } else {
            message.items.push(reader.bool());
          }
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetAvailableTimeOfFacilityResponse_Day {
    const message = {
      ...baseGetAvailableTimeOfFacilityResponse_Day,
    } as GetAvailableTimeOfFacilityResponse_Day;
    message.items = [];
    if (object.items !== undefined && object.items !== null) {
      for (const e of object.items) {
        message.items.push(Boolean(e));
      }
    }
    return message;
  },

  toJSON(message: GetAvailableTimeOfFacilityResponse_Day): unknown {
    const obj: any = {};
    if (message.items) {
      obj.items = message.items.map((e) => e);
    } else {
      obj.items = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetAvailableTimeOfFacilityResponse_Day>
  ): GetAvailableTimeOfFacilityResponse_Day {
    const message = {
      ...baseGetAvailableTimeOfFacilityResponse_Day,
    } as GetAvailableTimeOfFacilityResponse_Day;
    message.items = [];
    if (object.items !== undefined && object.items !== null) {
      for (const e of object.items) {
        message.items.push(e);
      }
    }
    return message;
  },
};

const baseCreateFacilityRequestRequest: object = {
  userId: 0,
  eventId: 0,
  facilityId: 0,
};

export const CreateFacilityRequestRequest = {
  encode(
    message: CreateFacilityRequestRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
    }
    if (message.facilityId !== 0) {
      writer.uint32(24).int32(message.facilityId);
    }
    if (message.start !== undefined) {
      Timestamp.encode(
        toTimestamp(message.start),
        writer.uint32(34).fork()
      ).ldelim();
    }
    if (message.end !== undefined) {
      Timestamp.encode(
        toTimestamp(message.end),
        writer.uint32(42).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): CreateFacilityRequestRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseCreateFacilityRequestRequest,
    } as CreateFacilityRequestRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.eventId = reader.int32();
          break;
        case 3:
          message.facilityId = reader.int32();
          break;
        case 4:
          message.start = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        case 5:
          message.end = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateFacilityRequestRequest {
    const message = {
      ...baseCreateFacilityRequestRequest,
    } as CreateFacilityRequestRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    if (object.facilityId !== undefined && object.facilityId !== null) {
      message.facilityId = Number(object.facilityId);
    } else {
      message.facilityId = 0;
    }
    if (object.start !== undefined && object.start !== null) {
      message.start = fromJsonTimestamp(object.start);
    } else {
      message.start = undefined;
    }
    if (object.end !== undefined && object.end !== null) {
      message.end = fromJsonTimestamp(object.end);
    } else {
      message.end = undefined;
    }
    return message;
  },

  toJSON(message: CreateFacilityRequestRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    message.facilityId !== undefined && (obj.facilityId = message.facilityId);
    message.start !== undefined &&
      (obj.start =
        message.start !== undefined ? message.start.toISOString() : null);
    message.end !== undefined &&
      (obj.end = message.end !== undefined ? message.end.toISOString() : null);
    return obj;
  },

  fromPartial(
    object: DeepPartial<CreateFacilityRequestRequest>
  ): CreateFacilityRequestRequest {
    const message = {
      ...baseCreateFacilityRequestRequest,
    } as CreateFacilityRequestRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    if (object.facilityId !== undefined && object.facilityId !== null) {
      message.facilityId = object.facilityId;
    } else {
      message.facilityId = 0;
    }
    if (object.start !== undefined && object.start !== null) {
      message.start = object.start;
    } else {
      message.start = undefined;
    }
    if (object.end !== undefined && object.end !== null) {
      message.end = object.end;
    } else {
      message.end = undefined;
    }
    return message;
  },
};

const baseApproveFacilityRequestRequest: object = { userId: 0, requestId: 0 };

export const ApproveFacilityRequestRequest = {
  encode(
    message: ApproveFacilityRequestRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.requestId !== 0) {
      writer.uint32(16).int32(message.requestId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): ApproveFacilityRequestRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseApproveFacilityRequestRequest,
    } as ApproveFacilityRequestRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.requestId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ApproveFacilityRequestRequest {
    const message = {
      ...baseApproveFacilityRequestRequest,
    } as ApproveFacilityRequestRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.requestId !== undefined && object.requestId !== null) {
      message.requestId = Number(object.requestId);
    } else {
      message.requestId = 0;
    }
    return message;
  },

  toJSON(message: ApproveFacilityRequestRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.requestId !== undefined && (obj.requestId = message.requestId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<ApproveFacilityRequestRequest>
  ): ApproveFacilityRequestRequest {
    const message = {
      ...baseApproveFacilityRequestRequest,
    } as ApproveFacilityRequestRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.requestId !== undefined && object.requestId !== null) {
      message.requestId = object.requestId;
    } else {
      message.requestId = 0;
    }
    return message;
  },
};

const baseRejectFacilityRequestRequest: object = { userId: 0, requestId: 0 };

export const RejectFacilityRequestRequest = {
  encode(
    message: RejectFacilityRequestRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.requestId !== 0) {
      writer.uint32(16).int32(message.requestId);
    }
    if (message.reason !== undefined) {
      StringValue.encode(
        { value: message.reason! },
        writer.uint32(26).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): RejectFacilityRequestRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseRejectFacilityRequestRequest,
    } as RejectFacilityRequestRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.requestId = reader.int32();
          break;
        case 3:
          message.reason = StringValue.decode(reader, reader.uint32()).value;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): RejectFacilityRequestRequest {
    const message = {
      ...baseRejectFacilityRequestRequest,
    } as RejectFacilityRequestRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.requestId !== undefined && object.requestId !== null) {
      message.requestId = Number(object.requestId);
    } else {
      message.requestId = 0;
    }
    if (object.reason !== undefined && object.reason !== null) {
      message.reason = String(object.reason);
    } else {
      message.reason = undefined;
    }
    return message;
  },

  toJSON(message: RejectFacilityRequestRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.requestId !== undefined && (obj.requestId = message.requestId);
    message.reason !== undefined && (obj.reason = message.reason);
    return obj;
  },

  fromPartial(
    object: DeepPartial<RejectFacilityRequestRequest>
  ): RejectFacilityRequestRequest {
    const message = {
      ...baseRejectFacilityRequestRequest,
    } as RejectFacilityRequestRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.requestId !== undefined && object.requestId !== null) {
      message.requestId = object.requestId;
    } else {
      message.requestId = 0;
    }
    if (object.reason !== undefined && object.reason !== null) {
      message.reason = object.reason;
    } else {
      message.reason = undefined;
    }
    return message;
  },
};

const baseGetFacilityInfoRequest: object = { facilityId: 0 };

export const GetFacilityInfoRequest = {
  encode(
    message: GetFacilityInfoRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.facilityId !== 0) {
      writer.uint32(8).int32(message.facilityId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetFacilityInfoRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetFacilityInfoRequest } as GetFacilityInfoRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.facilityId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetFacilityInfoRequest {
    const message = { ...baseGetFacilityInfoRequest } as GetFacilityInfoRequest;
    if (object.facilityId !== undefined && object.facilityId !== null) {
      message.facilityId = Number(object.facilityId);
    } else {
      message.facilityId = 0;
    }
    return message;
  },

  toJSON(message: GetFacilityInfoRequest): unknown {
    const obj: any = {};
    message.facilityId !== undefined && (obj.facilityId = message.facilityId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetFacilityInfoRequest>
  ): GetFacilityInfoRequest {
    const message = { ...baseGetFacilityInfoRequest } as GetFacilityInfoRequest;
    if (object.facilityId !== undefined && object.facilityId !== null) {
      message.facilityId = object.facilityId;
    } else {
      message.facilityId = 0;
    }
    return message;
  },
};

const baseGetFacilityRequestStatusRequest: object = { userId: 0, requestId: 0 };

export const GetFacilityRequestStatusRequest = {
  encode(
    message: GetFacilityRequestStatusRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.requestId !== 0) {
      writer.uint32(16).int32(message.requestId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetFacilityRequestStatusRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetFacilityRequestStatusRequest,
    } as GetFacilityRequestStatusRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.requestId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetFacilityRequestStatusRequest {
    const message = {
      ...baseGetFacilityRequestStatusRequest,
    } as GetFacilityRequestStatusRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.requestId !== undefined && object.requestId !== null) {
      message.requestId = Number(object.requestId);
    } else {
      message.requestId = 0;
    }
    return message;
  },

  toJSON(message: GetFacilityRequestStatusRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.requestId !== undefined && (obj.requestId = message.requestId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetFacilityRequestStatusRequest>
  ): GetFacilityRequestStatusRequest {
    const message = {
      ...baseGetFacilityRequestStatusRequest,
    } as GetFacilityRequestStatusRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.requestId !== undefined && object.requestId !== null) {
      message.requestId = object.requestId;
    } else {
      message.requestId = 0;
    }
    return message;
  },
};

const baseGetFacilityRequestStatusFullRequest: object = {
  userId: 0,
  requestId: 0,
};

export const GetFacilityRequestStatusFullRequest = {
  encode(
    message: GetFacilityRequestStatusFullRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.requestId !== 0) {
      writer.uint32(16).int32(message.requestId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetFacilityRequestStatusFullRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetFacilityRequestStatusFullRequest,
    } as GetFacilityRequestStatusFullRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.requestId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetFacilityRequestStatusFullRequest {
    const message = {
      ...baseGetFacilityRequestStatusFullRequest,
    } as GetFacilityRequestStatusFullRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.requestId !== undefined && object.requestId !== null) {
      message.requestId = Number(object.requestId);
    } else {
      message.requestId = 0;
    }
    return message;
  },

  toJSON(message: GetFacilityRequestStatusFullRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.requestId !== undefined && (obj.requestId = message.requestId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetFacilityRequestStatusFullRequest>
  ): GetFacilityRequestStatusFullRequest {
    const message = {
      ...baseGetFacilityRequestStatusFullRequest,
    } as GetFacilityRequestStatusFullRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.requestId !== undefined && object.requestId !== null) {
      message.requestId = object.requestId;
    } else {
      message.requestId = 0;
    }
    return message;
  },
};

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
  ): Promise<boolean | undefined>;
  RejectFacilityRequest(
    request: RejectFacilityRequestRequest
  ): Promise<boolean | undefined>;
  GetFacilityInfo(request: GetFacilityInfoRequest): Promise<Facility>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

type Builtin = Date | Function | Uint8Array | string | number | undefined;
export type DeepPartial<T> = T extends Builtin
  ? T
  : T extends Array<infer U>
  ? Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U>
  ? ReadonlyArray<DeepPartial<U>>
  : T extends {}
  ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

function toTimestamp(date: Date): Timestamp {
  const seconds = date.getTime() / 1_000;
  const nanos = (date.getTime() % 1_000) * 1_000_000;
  return { seconds, nanos };
}

function fromTimestamp(t: Timestamp): Date {
  let millis = t.seconds * 1_000;
  millis += t.nanos / 1_000_000;
  return new Date(millis);
}

function fromJsonTimestamp(o: any): Date {
  if (o instanceof Date) {
    return o;
  } else if (typeof o === "string") {
    return new Date(o);
  } else {
    return fromTimestamp(Timestamp.fromJSON(o));
  }
}

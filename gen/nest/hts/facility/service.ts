/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
  FacilityRequest_Status,
  OperatingHour,
  Facility,
  FacilityRequest,
  facilityRequest_StatusFromJSON,
  facilityRequest_StatusToJSON,
} from "../../hts/common/common";
import { Observable } from "rxjs";
import { Timestamp } from "../../google/protobuf/timestamp";
import { StringValue, BoolValue } from "../../google/protobuf/wrappers";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.facility";

export interface FacilityRequestWithFacilityInfo {
  id: number;
  eventId: number;
  facilityId: number;
  organizationId: number;
  status: FacilityRequest_Status;
  rejectReason: StringValue | undefined;
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
  reason: StringValue | undefined;
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
      message.rejectReason = StringValue.fromJSON(object.rejectReason);
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
      (obj.rejectReason = message.rejectReason
        ? StringValue.toJSON(message.rejectReason)
        : undefined);
    message.start !== undefined &&
      (obj.start =
        message.start !== undefined
          ? fromTimestamp(message.start).toISOString()
          : null);
    message.finish !== undefined &&
      (obj.finish =
        message.finish !== undefined
          ? fromTimestamp(message.finish).toISOString()
          : null);
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
};

const baseGetFacilityListRequest: object = { organizationId: 0 };

export const GetFacilityListRequest = {
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
};

const baseGetFacilityListResponse: object = {};

export const GetFacilityListResponse = {
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
};

const baseGetFacilityRequestListRequest: object = {
  userId: 0,
  organizationId: 0,
};

export const GetFacilityRequestListRequest = {
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
};

const baseGetFacilityRequestListResponse: object = {};

export const GetFacilityRequestListResponse = {
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
};

const baseGetFacilityRequestsListStatusRequest: object = {
  userId: 0,
  eventId: 0,
};

export const GetFacilityRequestsListStatusRequest = {
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
};

const baseGetFacilityRequestsListStatusResponse: object = {};

export const GetFacilityRequestsListStatusResponse = {
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
};

const baseGetAvailableFacilityListResponse: object = {};

export const GetAvailableFacilityListResponse = {
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
};

const baseGetAvailableTimeOfFacilityRequest: object = { facilityId: 0 };

export const GetAvailableTimeOfFacilityRequest = {
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
        message.start !== undefined
          ? fromTimestamp(message.start).toISOString()
          : null);
    message.end !== undefined &&
      (obj.end =
        message.end !== undefined
          ? fromTimestamp(message.end).toISOString()
          : null);
    return obj;
  },
};

const baseGetAvailableTimeOfFacilityResponse: object = {};

export const GetAvailableTimeOfFacilityResponse = {
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
};

const baseGetAvailableTimeOfFacilityResponse_Day: object = { items: false };

export const GetAvailableTimeOfFacilityResponse_Day = {
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
};

const baseCreateFacilityRequestRequest: object = {
  userId: 0,
  eventId: 0,
  facilityId: 0,
};

export const CreateFacilityRequestRequest = {
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
        message.start !== undefined
          ? fromTimestamp(message.start).toISOString()
          : null);
    message.end !== undefined &&
      (obj.end =
        message.end !== undefined
          ? fromTimestamp(message.end).toISOString()
          : null);
    return obj;
  },
};

const baseApproveFacilityRequestRequest: object = { userId: 0, requestId: 0 };

export const ApproveFacilityRequestRequest = {
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
};

const baseRejectFacilityRequestRequest: object = { userId: 0, requestId: 0 };

export const RejectFacilityRequestRequest = {
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
      message.reason = StringValue.fromJSON(object.reason);
    } else {
      message.reason = undefined;
    }
    return message;
  },

  toJSON(message: RejectFacilityRequestRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.requestId !== undefined && (obj.requestId = message.requestId);
    message.reason !== undefined &&
      (obj.reason = message.reason
        ? StringValue.toJSON(message.reason)
        : undefined);
    return obj;
  },
};

const baseGetFacilityInfoRequest: object = { facilityId: 0 };

export const GetFacilityInfoRequest = {
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
};

const baseGetFacilityRequestStatusRequest: object = { userId: 0, requestId: 0 };

export const GetFacilityRequestStatusRequest = {
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
};

const baseGetFacilityRequestStatusFullRequest: object = {
  userId: 0,
  requestId: 0,
};

export const GetFacilityRequestStatusFullRequest = {
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
};

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
  ): Observable<BoolValue>;

  rejectFacilityRequest(
    request: RejectFacilityRequestRequest
  ): Observable<BoolValue>;

  getFacilityInfo(request: GetFacilityInfoRequest): Observable<Facility>;

  ping(request: Empty): Observable<BoolValue>;
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
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  rejectFacilityRequest(
    request: RejectFacilityRequestRequest
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  getFacilityInfo(
    request: GetFacilityInfoRequest
  ): Promise<Facility> | Observable<Facility> | Facility;

  ping(request: Empty): Promise<BoolValue> | Observable<BoolValue> | BoolValue;
}

export function FacilityServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
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
    const grpcStreamMethods: string[] = [];
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

function fromJsonTimestamp(o: any): Timestamp {
  if (o instanceof Date) {
    return toTimestamp(o);
  } else if (typeof o === "string") {
    return toTimestamp(new Date(o));
  } else {
    return Timestamp.fromJSON(o);
  }
}

/* eslint-disable */
import {
  Status,
  Organization,
  Event,
  Facility,
  Tag,
  Result,
  statusFromJSON,
  statusToJSON,
} from "../../hts/common/common";
import { Reader, util, configure, Writer } from "protobufjs/minimal";
import { Timestamp } from "../../google/protobuf/timestamp";
import * as Long from "long";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.organizer";

export interface UserRequest {
  userId: number;
}

export interface GetByIdRequest {
  userId: number;
  readId: number;
}

export interface Duration {
  start: Date | undefined;
  finish: Date | undefined;
}

export interface CreateOrganizationRequest {
  userId: number;
  organization: Organization | undefined;
}

export interface UpdateOrganizationRequest {
  userId: number;
  organizationId: number;
  organization: Organization | undefined;
}

export interface RemoveOrganizationRequest {
  userId: number;
  organizationId: number;
}

export interface UpdateUsersInOrganizationRequest {
  userId: number;
  userIds: number[];
  organizationId: number;
}

export interface CreateEventRequest {
  userId: number;
  event: Event | undefined;
}

export interface UpdateEventInfoRequest {
  userId: number;
  event: Event | undefined;
}

export interface UpdateEventFacilityRequest {
  userId: number;
  facility: Facility | undefined;
}

export interface UpdateEventDurationRequest {
  userId: number;
  eventId: number;
  duration: Duration[];
}

export interface RemoveEventRequest {
  userId: number;
  eventId: number;
}

export interface UpdateRegistrationRequestRequest {
  userId: number;
  registeredUserId: number;
  registeredEventId: number;
  status: Status;
}

export interface CreateTagRequest {
  userId: number;
  tag: Tag | undefined;
}

export interface UpdateTagRequest {
  userId: number;
  tagIds: number[];
  eventId: number;
}

export interface HasEventRequest {
  userId: number;
  organizationId: number;
  eventId: number;
}

export interface GetOrganizationResponse {
  organizations: Organization[];
}

export interface GetOrganizationByIdResponse {
  organization: Organization | undefined;
}

export interface GetEventResponse {
  events: Event[];
}

export interface GetEventByIdResponse {
  event: Event | undefined;
}

export interface GetTagResponse {
  tags: Tag[];
}

export interface GetTagByIdResponse {
  tag: Tag | undefined;
}

const baseUserRequest: object = { userId: 0 };

export const UserRequest = {
  encode(message: UserRequest, writer: Writer = Writer.create()): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UserRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserRequest } as UserRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UserRequest {
    const message = { ...baseUserRequest } as UserRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    return message;
  },

  toJSON(message: UserRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    return obj;
  },

  fromPartial(object: DeepPartial<UserRequest>): UserRequest {
    const message = { ...baseUserRequest } as UserRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    return message;
  },
};

const baseGetByIdRequest: object = { userId: 0, readId: 0 };

export const GetByIdRequest = {
  encode(message: GetByIdRequest, writer: Writer = Writer.create()): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.readId !== 0) {
      writer.uint32(16).int64(message.readId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetByIdRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetByIdRequest } as GetByIdRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.readId = longToNumber(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetByIdRequest {
    const message = { ...baseGetByIdRequest } as GetByIdRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.readId !== undefined && object.readId !== null) {
      message.readId = Number(object.readId);
    } else {
      message.readId = 0;
    }
    return message;
  },

  toJSON(message: GetByIdRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.readId !== undefined && (obj.readId = message.readId);
    return obj;
  },

  fromPartial(object: DeepPartial<GetByIdRequest>): GetByIdRequest {
    const message = { ...baseGetByIdRequest } as GetByIdRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.readId !== undefined && object.readId !== null) {
      message.readId = object.readId;
    } else {
      message.readId = 0;
    }
    return message;
  },
};

const baseDuration: object = {};

export const Duration = {
  encode(message: Duration, writer: Writer = Writer.create()): Writer {
    if (message.start !== undefined) {
      Timestamp.encode(
        toTimestamp(message.start),
        writer.uint32(10).fork()
      ).ldelim();
    }
    if (message.finish !== undefined) {
      Timestamp.encode(
        toTimestamp(message.finish),
        writer.uint32(18).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): Duration {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseDuration } as Duration;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.start = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        case 2:
          message.finish = fromTimestamp(
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

  fromJSON(object: any): Duration {
    const message = { ...baseDuration } as Duration;
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
    return message;
  },

  toJSON(message: Duration): unknown {
    const obj: any = {};
    message.start !== undefined &&
      (obj.start =
        message.start !== undefined ? message.start.toISOString() : null);
    message.finish !== undefined &&
      (obj.finish =
        message.finish !== undefined ? message.finish.toISOString() : null);
    return obj;
  },

  fromPartial(object: DeepPartial<Duration>): Duration {
    const message = { ...baseDuration } as Duration;
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
    return message;
  },
};

const baseCreateOrganizationRequest: object = { userId: 0 };

export const CreateOrganizationRequest = {
  encode(
    message: CreateOrganizationRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.organization !== undefined) {
      Organization.encode(
        message.organization,
        writer.uint32(18).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): CreateOrganizationRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseCreateOrganizationRequest,
    } as CreateOrganizationRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.organization = Organization.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateOrganizationRequest {
    const message = {
      ...baseCreateOrganizationRequest,
    } as CreateOrganizationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.organization !== undefined && object.organization !== null) {
      message.organization = Organization.fromJSON(object.organization);
    } else {
      message.organization = undefined;
    }
    return message;
  },

  toJSON(message: CreateOrganizationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organization !== undefined &&
      (obj.organization = message.organization
        ? Organization.toJSON(message.organization)
        : undefined);
    return obj;
  },

  fromPartial(
    object: DeepPartial<CreateOrganizationRequest>
  ): CreateOrganizationRequest {
    const message = {
      ...baseCreateOrganizationRequest,
    } as CreateOrganizationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.organization !== undefined && object.organization !== null) {
      message.organization = Organization.fromPartial(object.organization);
    } else {
      message.organization = undefined;
    }
    return message;
  },
};

const baseUpdateOrganizationRequest: object = { userId: 0, organizationId: 0 };

export const UpdateOrganizationRequest = {
  encode(
    message: UpdateOrganizationRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int64(message.organizationId);
    }
    if (message.organization !== undefined) {
      Organization.encode(
        message.organization,
        writer.uint32(26).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): UpdateOrganizationRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseUpdateOrganizationRequest,
    } as UpdateOrganizationRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.organizationId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.organization = Organization.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateOrganizationRequest {
    const message = {
      ...baseUpdateOrganizationRequest,
    } as UpdateOrganizationRequest;
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
    if (object.organization !== undefined && object.organization !== null) {
      message.organization = Organization.fromJSON(object.organization);
    } else {
      message.organization = undefined;
    }
    return message;
  },

  toJSON(message: UpdateOrganizationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.organization !== undefined &&
      (obj.organization = message.organization
        ? Organization.toJSON(message.organization)
        : undefined);
    return obj;
  },

  fromPartial(
    object: DeepPartial<UpdateOrganizationRequest>
  ): UpdateOrganizationRequest {
    const message = {
      ...baseUpdateOrganizationRequest,
    } as UpdateOrganizationRequest;
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
    if (object.organization !== undefined && object.organization !== null) {
      message.organization = Organization.fromPartial(object.organization);
    } else {
      message.organization = undefined;
    }
    return message;
  },
};

const baseRemoveOrganizationRequest: object = { userId: 0, organizationId: 0 };

export const RemoveOrganizationRequest = {
  encode(
    message: RemoveOrganizationRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int64(message.organizationId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): RemoveOrganizationRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseRemoveOrganizationRequest,
    } as RemoveOrganizationRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.organizationId = longToNumber(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): RemoveOrganizationRequest {
    const message = {
      ...baseRemoveOrganizationRequest,
    } as RemoveOrganizationRequest;
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

  toJSON(message: RemoveOrganizationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<RemoveOrganizationRequest>
  ): RemoveOrganizationRequest {
    const message = {
      ...baseRemoveOrganizationRequest,
    } as RemoveOrganizationRequest;
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

const baseUpdateUsersInOrganizationRequest: object = {
  userId: 0,
  userIds: 0,
  organizationId: 0,
};

export const UpdateUsersInOrganizationRequest = {
  encode(
    message: UpdateUsersInOrganizationRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    writer.uint32(18).fork();
    for (const v of message.userIds) {
      writer.int64(v);
    }
    writer.ldelim();
    if (message.organizationId !== 0) {
      writer.uint32(24).int64(message.organizationId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): UpdateUsersInOrganizationRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseUpdateUsersInOrganizationRequest,
    } as UpdateUsersInOrganizationRequest;
    message.userIds = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.userIds.push(longToNumber(reader.int64() as Long));
            }
          } else {
            message.userIds.push(longToNumber(reader.int64() as Long));
          }
          break;
        case 3:
          message.organizationId = longToNumber(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateUsersInOrganizationRequest {
    const message = {
      ...baseUpdateUsersInOrganizationRequest,
    } as UpdateUsersInOrganizationRequest;
    message.userIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.userIds !== undefined && object.userIds !== null) {
      for (const e of object.userIds) {
        message.userIds.push(Number(e));
      }
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    return message;
  },

  toJSON(message: UpdateUsersInOrganizationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.userIds) {
      obj.userIds = message.userIds.map((e) => e);
    } else {
      obj.userIds = [];
    }
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<UpdateUsersInOrganizationRequest>
  ): UpdateUsersInOrganizationRequest {
    const message = {
      ...baseUpdateUsersInOrganizationRequest,
    } as UpdateUsersInOrganizationRequest;
    message.userIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.userIds !== undefined && object.userIds !== null) {
      for (const e of object.userIds) {
        message.userIds.push(e);
      }
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = object.organizationId;
    } else {
      message.organizationId = 0;
    }
    return message;
  },
};

const baseCreateEventRequest: object = { userId: 0 };

export const CreateEventRequest = {
  encode(
    message: CreateEventRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.event !== undefined) {
      Event.encode(message.event, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): CreateEventRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseCreateEventRequest } as CreateEventRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.event = Event.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateEventRequest {
    const message = { ...baseCreateEventRequest } as CreateEventRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromJSON(object.event);
    } else {
      message.event = undefined;
    }
    return message;
  },

  toJSON(message: CreateEventRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.event !== undefined &&
      (obj.event = message.event ? Event.toJSON(message.event) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<CreateEventRequest>): CreateEventRequest {
    const message = { ...baseCreateEventRequest } as CreateEventRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromPartial(object.event);
    } else {
      message.event = undefined;
    }
    return message;
  },
};

const baseUpdateEventInfoRequest: object = { userId: 0 };

export const UpdateEventInfoRequest = {
  encode(
    message: UpdateEventInfoRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.event !== undefined) {
      Event.encode(message.event, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UpdateEventInfoRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUpdateEventInfoRequest } as UpdateEventInfoRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.event = Event.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateEventInfoRequest {
    const message = { ...baseUpdateEventInfoRequest } as UpdateEventInfoRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromJSON(object.event);
    } else {
      message.event = undefined;
    }
    return message;
  },

  toJSON(message: UpdateEventInfoRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.event !== undefined &&
      (obj.event = message.event ? Event.toJSON(message.event) : undefined);
    return obj;
  },

  fromPartial(
    object: DeepPartial<UpdateEventInfoRequest>
  ): UpdateEventInfoRequest {
    const message = { ...baseUpdateEventInfoRequest } as UpdateEventInfoRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromPartial(object.event);
    } else {
      message.event = undefined;
    }
    return message;
  },
};

const baseUpdateEventFacilityRequest: object = { userId: 0 };

export const UpdateEventFacilityRequest = {
  encode(
    message: UpdateEventFacilityRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.facility !== undefined) {
      Facility.encode(message.facility, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): UpdateEventFacilityRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseUpdateEventFacilityRequest,
    } as UpdateEventFacilityRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.facility = Facility.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateEventFacilityRequest {
    const message = {
      ...baseUpdateEventFacilityRequest,
    } as UpdateEventFacilityRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.facility !== undefined && object.facility !== null) {
      message.facility = Facility.fromJSON(object.facility);
    } else {
      message.facility = undefined;
    }
    return message;
  },

  toJSON(message: UpdateEventFacilityRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.facility !== undefined &&
      (obj.facility = message.facility
        ? Facility.toJSON(message.facility)
        : undefined);
    return obj;
  },

  fromPartial(
    object: DeepPartial<UpdateEventFacilityRequest>
  ): UpdateEventFacilityRequest {
    const message = {
      ...baseUpdateEventFacilityRequest,
    } as UpdateEventFacilityRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.facility !== undefined && object.facility !== null) {
      message.facility = Facility.fromPartial(object.facility);
    } else {
      message.facility = undefined;
    }
    return message;
  },
};

const baseUpdateEventDurationRequest: object = { userId: 0, eventId: 0 };

export const UpdateEventDurationRequest = {
  encode(
    message: UpdateEventDurationRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int64(message.eventId);
    }
    for (const v of message.duration) {
      Duration.encode(v!, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): UpdateEventDurationRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseUpdateEventDurationRequest,
    } as UpdateEventDurationRequest;
    message.duration = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.eventId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.duration.push(Duration.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateEventDurationRequest {
    const message = {
      ...baseUpdateEventDurationRequest,
    } as UpdateEventDurationRequest;
    message.duration = [];
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
    if (object.duration !== undefined && object.duration !== null) {
      for (const e of object.duration) {
        message.duration.push(Duration.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: UpdateEventDurationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    if (message.duration) {
      obj.duration = message.duration.map((e) =>
        e ? Duration.toJSON(e) : undefined
      );
    } else {
      obj.duration = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<UpdateEventDurationRequest>
  ): UpdateEventDurationRequest {
    const message = {
      ...baseUpdateEventDurationRequest,
    } as UpdateEventDurationRequest;
    message.duration = [];
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
    if (object.duration !== undefined && object.duration !== null) {
      for (const e of object.duration) {
        message.duration.push(Duration.fromPartial(e));
      }
    }
    return message;
  },
};

const baseRemoveEventRequest: object = { userId: 0, eventId: 0 };

export const RemoveEventRequest = {
  encode(
    message: RemoveEventRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int64(message.eventId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): RemoveEventRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseRemoveEventRequest } as RemoveEventRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.eventId = longToNumber(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): RemoveEventRequest {
    const message = { ...baseRemoveEventRequest } as RemoveEventRequest;
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

  toJSON(message: RemoveEventRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(object: DeepPartial<RemoveEventRequest>): RemoveEventRequest {
    const message = { ...baseRemoveEventRequest } as RemoveEventRequest;
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

const baseUpdateRegistrationRequestRequest: object = {
  userId: 0,
  registeredUserId: 0,
  registeredEventId: 0,
  status: 0,
};

export const UpdateRegistrationRequestRequest = {
  encode(
    message: UpdateRegistrationRequestRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.registeredUserId !== 0) {
      writer.uint32(16).int64(message.registeredUserId);
    }
    if (message.registeredEventId !== 0) {
      writer.uint32(24).int64(message.registeredEventId);
    }
    if (message.status !== 0) {
      writer.uint32(32).int32(message.status);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): UpdateRegistrationRequestRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseUpdateRegistrationRequestRequest,
    } as UpdateRegistrationRequestRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.registeredUserId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.registeredEventId = longToNumber(reader.int64() as Long);
          break;
        case 4:
          message.status = reader.int32() as any;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateRegistrationRequestRequest {
    const message = {
      ...baseUpdateRegistrationRequestRequest,
    } as UpdateRegistrationRequestRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (
      object.registeredUserId !== undefined &&
      object.registeredUserId !== null
    ) {
      message.registeredUserId = Number(object.registeredUserId);
    } else {
      message.registeredUserId = 0;
    }
    if (
      object.registeredEventId !== undefined &&
      object.registeredEventId !== null
    ) {
      message.registeredEventId = Number(object.registeredEventId);
    } else {
      message.registeredEventId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = statusFromJSON(object.status);
    } else {
      message.status = 0;
    }
    return message;
  },

  toJSON(message: UpdateRegistrationRequestRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.registeredUserId !== undefined &&
      (obj.registeredUserId = message.registeredUserId);
    message.registeredEventId !== undefined &&
      (obj.registeredEventId = message.registeredEventId);
    message.status !== undefined && (obj.status = statusToJSON(message.status));
    return obj;
  },

  fromPartial(
    object: DeepPartial<UpdateRegistrationRequestRequest>
  ): UpdateRegistrationRequestRequest {
    const message = {
      ...baseUpdateRegistrationRequestRequest,
    } as UpdateRegistrationRequestRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (
      object.registeredUserId !== undefined &&
      object.registeredUserId !== null
    ) {
      message.registeredUserId = object.registeredUserId;
    } else {
      message.registeredUserId = 0;
    }
    if (
      object.registeredEventId !== undefined &&
      object.registeredEventId !== null
    ) {
      message.registeredEventId = object.registeredEventId;
    } else {
      message.registeredEventId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = object.status;
    } else {
      message.status = 0;
    }
    return message;
  },
};

const baseCreateTagRequest: object = { userId: 0 };

export const CreateTagRequest = {
  encode(message: CreateTagRequest, writer: Writer = Writer.create()): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.tag !== undefined) {
      Tag.encode(message.tag, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): CreateTagRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseCreateTagRequest } as CreateTagRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.tag = Tag.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateTagRequest {
    const message = { ...baseCreateTagRequest } as CreateTagRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.tag !== undefined && object.tag !== null) {
      message.tag = Tag.fromJSON(object.tag);
    } else {
      message.tag = undefined;
    }
    return message;
  },

  toJSON(message: CreateTagRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.tag !== undefined &&
      (obj.tag = message.tag ? Tag.toJSON(message.tag) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<CreateTagRequest>): CreateTagRequest {
    const message = { ...baseCreateTagRequest } as CreateTagRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.tag !== undefined && object.tag !== null) {
      message.tag = Tag.fromPartial(object.tag);
    } else {
      message.tag = undefined;
    }
    return message;
  },
};

const baseUpdateTagRequest: object = { userId: 0, tagIds: 0, eventId: 0 };

export const UpdateTagRequest = {
  encode(message: UpdateTagRequest, writer: Writer = Writer.create()): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    writer.uint32(18).fork();
    for (const v of message.tagIds) {
      writer.int64(v);
    }
    writer.ldelim();
    if (message.eventId !== 0) {
      writer.uint32(24).int64(message.eventId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UpdateTagRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUpdateTagRequest } as UpdateTagRequest;
    message.tagIds = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.tagIds.push(longToNumber(reader.int64() as Long));
            }
          } else {
            message.tagIds.push(longToNumber(reader.int64() as Long));
          }
          break;
        case 3:
          message.eventId = longToNumber(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateTagRequest {
    const message = { ...baseUpdateTagRequest } as UpdateTagRequest;
    message.tagIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.tagIds !== undefined && object.tagIds !== null) {
      for (const e of object.tagIds) {
        message.tagIds.push(Number(e));
      }
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: UpdateTagRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.tagIds) {
      obj.tagIds = message.tagIds.map((e) => e);
    } else {
      obj.tagIds = [];
    }
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(object: DeepPartial<UpdateTagRequest>): UpdateTagRequest {
    const message = { ...baseUpdateTagRequest } as UpdateTagRequest;
    message.tagIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.tagIds !== undefined && object.tagIds !== null) {
      for (const e of object.tagIds) {
        message.tagIds.push(e);
      }
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    return message;
  },
};

const baseHasEventRequest: object = {
  userId: 0,
  organizationId: 0,
  eventId: 0,
};

export const HasEventRequest = {
  encode(message: HasEventRequest, writer: Writer = Writer.create()): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int64(message.organizationId);
    }
    if (message.eventId !== 0) {
      writer.uint32(24).int64(message.eventId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): HasEventRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseHasEventRequest } as HasEventRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.organizationId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.eventId = longToNumber(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): HasEventRequest {
    const message = { ...baseHasEventRequest } as HasEventRequest;
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
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: HasEventRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(object: DeepPartial<HasEventRequest>): HasEventRequest {
    const message = { ...baseHasEventRequest } as HasEventRequest;
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
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    return message;
  },
};

const baseGetOrganizationResponse: object = {};

export const GetOrganizationResponse = {
  encode(
    message: GetOrganizationResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.organizations) {
      Organization.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetOrganizationResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetOrganizationResponse,
    } as GetOrganizationResponse;
    message.organizations = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.organizations.push(
            Organization.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetOrganizationResponse {
    const message = {
      ...baseGetOrganizationResponse,
    } as GetOrganizationResponse;
    message.organizations = [];
    if (object.organizations !== undefined && object.organizations !== null) {
      for (const e of object.organizations) {
        message.organizations.push(Organization.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetOrganizationResponse): unknown {
    const obj: any = {};
    if (message.organizations) {
      obj.organizations = message.organizations.map((e) =>
        e ? Organization.toJSON(e) : undefined
      );
    } else {
      obj.organizations = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetOrganizationResponse>
  ): GetOrganizationResponse {
    const message = {
      ...baseGetOrganizationResponse,
    } as GetOrganizationResponse;
    message.organizations = [];
    if (object.organizations !== undefined && object.organizations !== null) {
      for (const e of object.organizations) {
        message.organizations.push(Organization.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetOrganizationByIdResponse: object = {};

export const GetOrganizationByIdResponse = {
  encode(
    message: GetOrganizationByIdResponse,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.organization !== undefined) {
      Organization.encode(
        message.organization,
        writer.uint32(10).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetOrganizationByIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetOrganizationByIdResponse,
    } as GetOrganizationByIdResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.organization = Organization.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetOrganizationByIdResponse {
    const message = {
      ...baseGetOrganizationByIdResponse,
    } as GetOrganizationByIdResponse;
    if (object.organization !== undefined && object.organization !== null) {
      message.organization = Organization.fromJSON(object.organization);
    } else {
      message.organization = undefined;
    }
    return message;
  },

  toJSON(message: GetOrganizationByIdResponse): unknown {
    const obj: any = {};
    message.organization !== undefined &&
      (obj.organization = message.organization
        ? Organization.toJSON(message.organization)
        : undefined);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetOrganizationByIdResponse>
  ): GetOrganizationByIdResponse {
    const message = {
      ...baseGetOrganizationByIdResponse,
    } as GetOrganizationByIdResponse;
    if (object.organization !== undefined && object.organization !== null) {
      message.organization = Organization.fromPartial(object.organization);
    } else {
      message.organization = undefined;
    }
    return message;
  },
};

const baseGetEventResponse: object = {};

export const GetEventResponse = {
  encode(message: GetEventResponse, writer: Writer = Writer.create()): Writer {
    for (const v of message.events) {
      Event.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetEventResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetEventResponse } as GetEventResponse;
    message.events = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.events.push(Event.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventResponse {
    const message = { ...baseGetEventResponse } as GetEventResponse;
    message.events = [];
    if (object.events !== undefined && object.events !== null) {
      for (const e of object.events) {
        message.events.push(Event.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetEventResponse): unknown {
    const obj: any = {};
    if (message.events) {
      obj.events = message.events.map((e) => (e ? Event.toJSON(e) : undefined));
    } else {
      obj.events = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<GetEventResponse>): GetEventResponse {
    const message = { ...baseGetEventResponse } as GetEventResponse;
    message.events = [];
    if (object.events !== undefined && object.events !== null) {
      for (const e of object.events) {
        message.events.push(Event.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetEventByIdResponse: object = {};

export const GetEventByIdResponse = {
  encode(
    message: GetEventByIdResponse,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.event !== undefined) {
      Event.encode(message.event, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetEventByIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetEventByIdResponse } as GetEventByIdResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.event = Event.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventByIdResponse {
    const message = { ...baseGetEventByIdResponse } as GetEventByIdResponse;
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromJSON(object.event);
    } else {
      message.event = undefined;
    }
    return message;
  },

  toJSON(message: GetEventByIdResponse): unknown {
    const obj: any = {};
    message.event !== undefined &&
      (obj.event = message.event ? Event.toJSON(message.event) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<GetEventByIdResponse>): GetEventByIdResponse {
    const message = { ...baseGetEventByIdResponse } as GetEventByIdResponse;
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromPartial(object.event);
    } else {
      message.event = undefined;
    }
    return message;
  },
};

const baseGetTagResponse: object = {};

export const GetTagResponse = {
  encode(message: GetTagResponse, writer: Writer = Writer.create()): Writer {
    for (const v of message.tags) {
      Tag.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetTagResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetTagResponse } as GetTagResponse;
    message.tags = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.tags.push(Tag.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetTagResponse {
    const message = { ...baseGetTagResponse } as GetTagResponse;
    message.tags = [];
    if (object.tags !== undefined && object.tags !== null) {
      for (const e of object.tags) {
        message.tags.push(Tag.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetTagResponse): unknown {
    const obj: any = {};
    if (message.tags) {
      obj.tags = message.tags.map((e) => (e ? Tag.toJSON(e) : undefined));
    } else {
      obj.tags = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<GetTagResponse>): GetTagResponse {
    const message = { ...baseGetTagResponse } as GetTagResponse;
    message.tags = [];
    if (object.tags !== undefined && object.tags !== null) {
      for (const e of object.tags) {
        message.tags.push(Tag.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetTagByIdResponse: object = {};

export const GetTagByIdResponse = {
  encode(
    message: GetTagByIdResponse,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.tag !== undefined) {
      Tag.encode(message.tag, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetTagByIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetTagByIdResponse } as GetTagByIdResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.tag = Tag.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetTagByIdResponse {
    const message = { ...baseGetTagByIdResponse } as GetTagByIdResponse;
    if (object.tag !== undefined && object.tag !== null) {
      message.tag = Tag.fromJSON(object.tag);
    } else {
      message.tag = undefined;
    }
    return message;
  },

  toJSON(message: GetTagByIdResponse): unknown {
    const obj: any = {};
    message.tag !== undefined &&
      (obj.tag = message.tag ? Tag.toJSON(message.tag) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<GetTagByIdResponse>): GetTagByIdResponse {
    const message = { ...baseGetTagByIdResponse } as GetTagByIdResponse;
    if (object.tag !== undefined && object.tag !== null) {
      message.tag = Tag.fromPartial(object.tag);
    } else {
      message.tag = undefined;
    }
    return message;
  },
};

export interface OrganizerService {
  CreateOrganization(request: CreateOrganizationRequest): Promise<Result>;
  GetOrganization(request: UserRequest): Promise<GetOrganizationResponse>;
  GetOrganizationById(
    request: GetByIdRequest
  ): Promise<GetOrganizationByIdResponse>;
  UpdateOrganization(request: UpdateOrganizationRequest): Promise<Result>;
  RemoveOrganization(request: RemoveOrganizationRequest): Promise<Result>;
  AddUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Result>;
  RemoveUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Result>;
  CreateEvent(request: CreateEventRequest): Promise<Result>;
  GetEvent(request: UserRequest): Promise<GetEventResponse>;
  GetEventById(request: GetByIdRequest): Promise<GetEventByIdResponse>;
  UpdateEventInfo(request: UpdateEventInfoRequest): Promise<Result>;
  UpdateEventFacility(request: UpdateEventFacilityRequest): Promise<Result>;
  UpdateEventDuration(request: UpdateEventDurationRequest): Promise<Result>;
  RemoveEvent(request: RemoveEventRequest): Promise<Result>;
  UpdateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<Result>;
  CreateTag(request: CreateTagRequest): Promise<Result>;
  AddTag(request: UpdateTagRequest): Promise<Result>;
  RemoveTag(request: UpdateTagRequest): Promise<Result>;
  GetTag(request: UserRequest): Promise<GetTagResponse>;
  GetTagById(request: GetByIdRequest): Promise<GetTagByIdResponse>;
  HasEvent(request: HasEventRequest): Promise<Result>;
  Ping(request: Empty): Promise<Result>;
}

export class OrganizerServiceClientImpl implements OrganizerService {
  private readonly rpc: Rpc;
  constructor(rpc: Rpc) {
    this.rpc = rpc;
  }
  CreateOrganization(request: CreateOrganizationRequest): Promise<Result> {
    const data = CreateOrganizationRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "CreateOrganization",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  GetOrganization(request: UserRequest): Promise<GetOrganizationResponse> {
    const data = UserRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "GetOrganization",
      data
    );
    return promise.then((data) =>
      GetOrganizationResponse.decode(new Reader(data))
    );
  }

  GetOrganizationById(
    request: GetByIdRequest
  ): Promise<GetOrganizationByIdResponse> {
    const data = GetByIdRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "GetOrganizationById",
      data
    );
    return promise.then((data) =>
      GetOrganizationByIdResponse.decode(new Reader(data))
    );
  }

  UpdateOrganization(request: UpdateOrganizationRequest): Promise<Result> {
    const data = UpdateOrganizationRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "UpdateOrganization",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  RemoveOrganization(request: RemoveOrganizationRequest): Promise<Result> {
    const data = RemoveOrganizationRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "RemoveOrganization",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  AddUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Result> {
    const data = UpdateUsersInOrganizationRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "AddUsersToOrganization",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  RemoveUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Result> {
    const data = UpdateUsersInOrganizationRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "RemoveUsersFromOrganization",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  CreateEvent(request: CreateEventRequest): Promise<Result> {
    const data = CreateEventRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "CreateEvent",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  GetEvent(request: UserRequest): Promise<GetEventResponse> {
    const data = UserRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "GetEvent",
      data
    );
    return promise.then((data) => GetEventResponse.decode(new Reader(data)));
  }

  GetEventById(request: GetByIdRequest): Promise<GetEventByIdResponse> {
    const data = GetByIdRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "GetEventById",
      data
    );
    return promise.then((data) =>
      GetEventByIdResponse.decode(new Reader(data))
    );
  }

  UpdateEventInfo(request: UpdateEventInfoRequest): Promise<Result> {
    const data = UpdateEventInfoRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "UpdateEventInfo",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  UpdateEventFacility(request: UpdateEventFacilityRequest): Promise<Result> {
    const data = UpdateEventFacilityRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "UpdateEventFacility",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  UpdateEventDuration(request: UpdateEventDurationRequest): Promise<Result> {
    const data = UpdateEventDurationRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "UpdateEventDuration",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  RemoveEvent(request: RemoveEventRequest): Promise<Result> {
    const data = RemoveEventRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "RemoveEvent",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  UpdateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<Result> {
    const data = UpdateRegistrationRequestRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "UpdateRegistrationRequest",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  CreateTag(request: CreateTagRequest): Promise<Result> {
    const data = CreateTagRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "CreateTag",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  AddTag(request: UpdateTagRequest): Promise<Result> {
    const data = UpdateTagRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "AddTag",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  RemoveTag(request: UpdateTagRequest): Promise<Result> {
    const data = UpdateTagRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "RemoveTag",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  GetTag(request: UserRequest): Promise<GetTagResponse> {
    const data = UserRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "GetTag",
      data
    );
    return promise.then((data) => GetTagResponse.decode(new Reader(data)));
  }

  GetTagById(request: GetByIdRequest): Promise<GetTagByIdResponse> {
    const data = GetByIdRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "GetTagById",
      data
    );
    return promise.then((data) => GetTagByIdResponse.decode(new Reader(data)));
  }

  HasEvent(request: HasEventRequest): Promise<Result> {
    const data = HasEventRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "HasEvent",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  Ping(request: Empty): Promise<Result> {
    const data = Empty.encode(request).finish();
    const promise = this.rpc.request(
      "hts.organizer.OrganizerService",
      "Ping",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }
}

interface Rpc {
  request(
    service: string,
    method: string,
    data: Uint8Array
  ): Promise<Uint8Array>;
}

declare var self: any | undefined;
declare var window: any | undefined;
var globalThis: any = (() => {
  if (typeof globalThis !== "undefined") return globalThis;
  if (typeof self !== "undefined") return self;
  if (typeof window !== "undefined") return window;
  if (typeof global !== "undefined") return global;
  throw "Unable to locate global object";
})();

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

function longToNumber(long: Long): number {
  if (long.gt(Number.MAX_SAFE_INTEGER)) {
    throw new globalThis.Error("Value is larger than Number.MAX_SAFE_INTEGER");
  }
  return long.toNumber();
}

// If you get a compile-error about 'Constructor<Long> and ... have no overlap',
// add '--ts_proto_opt=esModuleInterop=true' as a flag when calling 'protoc'.
if (util.Long !== Long) {
  util.Long = Long as any;
  configure();
}

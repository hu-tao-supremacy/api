/* eslint-disable */
import {
  UserEvent_Status,
  Organization,
  Event,
  Tag,
  QuestionGroup,
  Question,
  Location,
  User,
  UserOrganization,
  EventDuration,
  EventTag,
  Answer,
  UserEvent,
  userEvent_StatusFromJSON,
  userEvent_StatusToJSON,
  GetObjectByIdRequest,
  GetObjectByNameRequest,
} from "../../hts/common/common";
import { Timestamp } from "../../google/protobuf/timestamp";
import { Writer, Reader } from "protobufjs/minimal";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.organizer";

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

export interface UpdateEventRequest {
  userId: number;
  event: Event | undefined;
}

export interface UpdateEventDurationsRequest {
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
  status: UserEvent_Status;
}

export interface CreateTagRequest {
  userId: number;
  organizationId: number;
  tag: Tag | undefined;
}

export interface UpdateTagRequest {
  userId: number;
  tagIds: number[];
  eventId: number;
}

export interface HasEventRequest {
  organizationId: number;
  eventId: number;
}

export interface AddQuestionGroupsRequest {
  userId: number;
  questionGroups: QuestionGroup[];
}

export interface RemoveQuestionGroupsRequest {
  userId: number;
  questionGroupIds: number[];
}

export interface AddQuestionsRequest {
  userId: number;
  questions: Question[];
}

export interface RemoveQuestionsRequest {
  userId: number;
  questionIds: number[];
}

export interface CreateLocationRequest {
  userId: number;
  location: Location | undefined;
}

export interface UpdateLocationRequest {
  userId: number;
  location: Location | undefined;
}

export interface RemoveLocationRequest {
  userId: number;
  locationId: number;
}

export interface GenerateTicketRequest {
  userId: number;
  eventId: number;
}

export interface OrganizationListResponse {
  organizations: Organization[];
}

export interface UserListResponse {
  users: User[];
}

export interface UserOrganizationListResponse {
  userOrganizations: UserOrganization[];
}

export interface EventDurationListResponse {
  eventDurations: EventDuration[];
}

export interface EventTagListResponse {
  eventTags: EventTag[];
}

export interface QuestionGroupListResponse {
  questionGroups: QuestionGroup[];
}

export interface QuestionListResponse {
  questions: Question[];
}

export interface AnswerListResponse {
  answers: Answer[];
}

export interface LocationListResponse {
  locations: Location[];
}

export interface CheckInRequest {
  ticket: string;
  eventId: number;
}

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
      writer.uint32(8).int32(message.userId);
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
          message.userId = reader.int32();
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

const baseUpdateOrganizationRequest: object = { userId: 0 };

export const UpdateOrganizationRequest = {
  encode(
    message: UpdateOrganizationRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
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
          message.userId = reader.int32();
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

  fromJSON(object: any): UpdateOrganizationRequest {
    const message = {
      ...baseUpdateOrganizationRequest,
    } as UpdateOrganizationRequest;
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

  toJSON(message: UpdateOrganizationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
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
      writer.uint32(8).int32(message.userId);
    }
    writer.uint32(18).fork();
    for (const v of message.userIds) {
      writer.int32(v);
    }
    writer.ldelim();
    if (message.organizationId !== 0) {
      writer.uint32(24).int32(message.organizationId);
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
          message.userId = reader.int32();
          break;
        case 2:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.userIds.push(reader.int32());
            }
          } else {
            message.userIds.push(reader.int32());
          }
          break;
        case 3:
          message.organizationId = reader.int32();
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
      writer.uint32(8).int32(message.userId);
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
          message.userId = reader.int32();
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

const baseUpdateEventRequest: object = { userId: 0 };

export const UpdateEventRequest = {
  encode(
    message: UpdateEventRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.event !== undefined) {
      Event.encode(message.event, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UpdateEventRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUpdateEventRequest } as UpdateEventRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
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

  fromJSON(object: any): UpdateEventRequest {
    const message = { ...baseUpdateEventRequest } as UpdateEventRequest;
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

  toJSON(message: UpdateEventRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.event !== undefined &&
      (obj.event = message.event ? Event.toJSON(message.event) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<UpdateEventRequest>): UpdateEventRequest {
    const message = { ...baseUpdateEventRequest } as UpdateEventRequest;
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

const baseUpdateEventDurationsRequest: object = { userId: 0, eventId: 0 };

export const UpdateEventDurationsRequest = {
  encode(
    message: UpdateEventDurationsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
    }
    for (const v of message.duration) {
      Duration.encode(v!, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): UpdateEventDurationsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseUpdateEventDurationsRequest,
    } as UpdateEventDurationsRequest;
    message.duration = [];
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
          message.duration.push(Duration.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateEventDurationsRequest {
    const message = {
      ...baseUpdateEventDurationsRequest,
    } as UpdateEventDurationsRequest;
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

  toJSON(message: UpdateEventDurationsRequest): unknown {
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
    object: DeepPartial<UpdateEventDurationsRequest>
  ): UpdateEventDurationsRequest {
    const message = {
      ...baseUpdateEventDurationsRequest,
    } as UpdateEventDurationsRequest;
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
      writer.uint32(8).int32(message.userId);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
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
      writer.uint32(8).int32(message.userId);
    }
    if (message.registeredUserId !== 0) {
      writer.uint32(16).int32(message.registeredUserId);
    }
    if (message.registeredEventId !== 0) {
      writer.uint32(24).int32(message.registeredEventId);
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
          message.userId = reader.int32();
          break;
        case 2:
          message.registeredUserId = reader.int32();
          break;
        case 3:
          message.registeredEventId = reader.int32();
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
      message.status = userEvent_StatusFromJSON(object.status);
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
    message.status !== undefined &&
      (obj.status = userEvent_StatusToJSON(message.status));
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

const baseCreateTagRequest: object = { userId: 0, organizationId: 0 };

export const CreateTagRequest = {
  encode(message: CreateTagRequest, writer: Writer = Writer.create()): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int32(message.organizationId);
    }
    if (message.tag !== undefined) {
      Tag.encode(message.tag, writer.uint32(26).fork()).ldelim();
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
          message.userId = reader.int32();
          break;
        case 2:
          message.organizationId = reader.int32();
          break;
        case 3:
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
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
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
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
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
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = object.organizationId;
    } else {
      message.organizationId = 0;
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
      writer.uint32(8).int32(message.userId);
    }
    writer.uint32(18).fork();
    for (const v of message.tagIds) {
      writer.int32(v);
    }
    writer.ldelim();
    if (message.eventId !== 0) {
      writer.uint32(24).int32(message.eventId);
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
          message.userId = reader.int32();
          break;
        case 2:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.tagIds.push(reader.int32());
            }
          } else {
            message.tagIds.push(reader.int32());
          }
          break;
        case 3:
          message.eventId = reader.int32();
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

const baseHasEventRequest: object = { organizationId: 0, eventId: 0 };

export const HasEventRequest = {
  encode(message: HasEventRequest, writer: Writer = Writer.create()): Writer {
    if (message.organizationId !== 0) {
      writer.uint32(8).int32(message.organizationId);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
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
          message.organizationId = reader.int32();
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

  fromJSON(object: any): HasEventRequest {
    const message = { ...baseHasEventRequest } as HasEventRequest;
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
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(object: DeepPartial<HasEventRequest>): HasEventRequest {
    const message = { ...baseHasEventRequest } as HasEventRequest;
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

const baseAddQuestionGroupsRequest: object = { userId: 0 };

export const AddQuestionGroupsRequest = {
  encode(
    message: AddQuestionGroupsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    for (const v of message.questionGroups) {
      QuestionGroup.encode(v!, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): AddQuestionGroupsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseAddQuestionGroupsRequest,
    } as AddQuestionGroupsRequest;
    message.questionGroups = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.questionGroups.push(
            QuestionGroup.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): AddQuestionGroupsRequest {
    const message = {
      ...baseAddQuestionGroupsRequest,
    } as AddQuestionGroupsRequest;
    message.questionGroups = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.questionGroups !== undefined && object.questionGroups !== null) {
      for (const e of object.questionGroups) {
        message.questionGroups.push(QuestionGroup.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: AddQuestionGroupsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.questionGroups) {
      obj.questionGroups = message.questionGroups.map((e) =>
        e ? QuestionGroup.toJSON(e) : undefined
      );
    } else {
      obj.questionGroups = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<AddQuestionGroupsRequest>
  ): AddQuestionGroupsRequest {
    const message = {
      ...baseAddQuestionGroupsRequest,
    } as AddQuestionGroupsRequest;
    message.questionGroups = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.questionGroups !== undefined && object.questionGroups !== null) {
      for (const e of object.questionGroups) {
        message.questionGroups.push(QuestionGroup.fromPartial(e));
      }
    }
    return message;
  },
};

const baseRemoveQuestionGroupsRequest: object = {
  userId: 0,
  questionGroupIds: 0,
};

export const RemoveQuestionGroupsRequest = {
  encode(
    message: RemoveQuestionGroupsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    writer.uint32(18).fork();
    for (const v of message.questionGroupIds) {
      writer.int32(v);
    }
    writer.ldelim();
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): RemoveQuestionGroupsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseRemoveQuestionGroupsRequest,
    } as RemoveQuestionGroupsRequest;
    message.questionGroupIds = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.questionGroupIds.push(reader.int32());
            }
          } else {
            message.questionGroupIds.push(reader.int32());
          }
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): RemoveQuestionGroupsRequest {
    const message = {
      ...baseRemoveQuestionGroupsRequest,
    } as RemoveQuestionGroupsRequest;
    message.questionGroupIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (
      object.questionGroupIds !== undefined &&
      object.questionGroupIds !== null
    ) {
      for (const e of object.questionGroupIds) {
        message.questionGroupIds.push(Number(e));
      }
    }
    return message;
  },

  toJSON(message: RemoveQuestionGroupsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.questionGroupIds) {
      obj.questionGroupIds = message.questionGroupIds.map((e) => e);
    } else {
      obj.questionGroupIds = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<RemoveQuestionGroupsRequest>
  ): RemoveQuestionGroupsRequest {
    const message = {
      ...baseRemoveQuestionGroupsRequest,
    } as RemoveQuestionGroupsRequest;
    message.questionGroupIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (
      object.questionGroupIds !== undefined &&
      object.questionGroupIds !== null
    ) {
      for (const e of object.questionGroupIds) {
        message.questionGroupIds.push(e);
      }
    }
    return message;
  },
};

const baseAddQuestionsRequest: object = { userId: 0 };

export const AddQuestionsRequest = {
  encode(
    message: AddQuestionsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    for (const v of message.questions) {
      Question.encode(v!, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): AddQuestionsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseAddQuestionsRequest } as AddQuestionsRequest;
    message.questions = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.questions.push(Question.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): AddQuestionsRequest {
    const message = { ...baseAddQuestionsRequest } as AddQuestionsRequest;
    message.questions = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.questions !== undefined && object.questions !== null) {
      for (const e of object.questions) {
        message.questions.push(Question.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: AddQuestionsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.questions) {
      obj.questions = message.questions.map((e) =>
        e ? Question.toJSON(e) : undefined
      );
    } else {
      obj.questions = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<AddQuestionsRequest>): AddQuestionsRequest {
    const message = { ...baseAddQuestionsRequest } as AddQuestionsRequest;
    message.questions = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.questions !== undefined && object.questions !== null) {
      for (const e of object.questions) {
        message.questions.push(Question.fromPartial(e));
      }
    }
    return message;
  },
};

const baseRemoveQuestionsRequest: object = { userId: 0, questionIds: 0 };

export const RemoveQuestionsRequest = {
  encode(
    message: RemoveQuestionsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    writer.uint32(18).fork();
    for (const v of message.questionIds) {
      writer.int32(v);
    }
    writer.ldelim();
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): RemoveQuestionsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseRemoveQuestionsRequest } as RemoveQuestionsRequest;
    message.questionIds = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.questionIds.push(reader.int32());
            }
          } else {
            message.questionIds.push(reader.int32());
          }
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): RemoveQuestionsRequest {
    const message = { ...baseRemoveQuestionsRequest } as RemoveQuestionsRequest;
    message.questionIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.questionIds !== undefined && object.questionIds !== null) {
      for (const e of object.questionIds) {
        message.questionIds.push(Number(e));
      }
    }
    return message;
  },

  toJSON(message: RemoveQuestionsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.questionIds) {
      obj.questionIds = message.questionIds.map((e) => e);
    } else {
      obj.questionIds = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<RemoveQuestionsRequest>
  ): RemoveQuestionsRequest {
    const message = { ...baseRemoveQuestionsRequest } as RemoveQuestionsRequest;
    message.questionIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.questionIds !== undefined && object.questionIds !== null) {
      for (const e of object.questionIds) {
        message.questionIds.push(e);
      }
    }
    return message;
  },
};

const baseCreateLocationRequest: object = { userId: 0 };

export const CreateLocationRequest = {
  encode(
    message: CreateLocationRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.location !== undefined) {
      Location.encode(message.location, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): CreateLocationRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseCreateLocationRequest } as CreateLocationRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.location = Location.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateLocationRequest {
    const message = { ...baseCreateLocationRequest } as CreateLocationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.location !== undefined && object.location !== null) {
      message.location = Location.fromJSON(object.location);
    } else {
      message.location = undefined;
    }
    return message;
  },

  toJSON(message: CreateLocationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.location !== undefined &&
      (obj.location = message.location
        ? Location.toJSON(message.location)
        : undefined);
    return obj;
  },

  fromPartial(
    object: DeepPartial<CreateLocationRequest>
  ): CreateLocationRequest {
    const message = { ...baseCreateLocationRequest } as CreateLocationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.location !== undefined && object.location !== null) {
      message.location = Location.fromPartial(object.location);
    } else {
      message.location = undefined;
    }
    return message;
  },
};

const baseUpdateLocationRequest: object = { userId: 0 };

export const UpdateLocationRequest = {
  encode(
    message: UpdateLocationRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.location !== undefined) {
      Location.encode(message.location, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UpdateLocationRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUpdateLocationRequest } as UpdateLocationRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.location = Location.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateLocationRequest {
    const message = { ...baseUpdateLocationRequest } as UpdateLocationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.location !== undefined && object.location !== null) {
      message.location = Location.fromJSON(object.location);
    } else {
      message.location = undefined;
    }
    return message;
  },

  toJSON(message: UpdateLocationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.location !== undefined &&
      (obj.location = message.location
        ? Location.toJSON(message.location)
        : undefined);
    return obj;
  },

  fromPartial(
    object: DeepPartial<UpdateLocationRequest>
  ): UpdateLocationRequest {
    const message = { ...baseUpdateLocationRequest } as UpdateLocationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.location !== undefined && object.location !== null) {
      message.location = Location.fromPartial(object.location);
    } else {
      message.location = undefined;
    }
    return message;
  },
};

const baseRemoveLocationRequest: object = { userId: 0, locationId: 0 };

export const RemoveLocationRequest = {
  encode(
    message: RemoveLocationRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.locationId !== 0) {
      writer.uint32(16).int32(message.locationId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): RemoveLocationRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseRemoveLocationRequest } as RemoveLocationRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.locationId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): RemoveLocationRequest {
    const message = { ...baseRemoveLocationRequest } as RemoveLocationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.locationId !== undefined && object.locationId !== null) {
      message.locationId = Number(object.locationId);
    } else {
      message.locationId = 0;
    }
    return message;
  },

  toJSON(message: RemoveLocationRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.locationId !== undefined && (obj.locationId = message.locationId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<RemoveLocationRequest>
  ): RemoveLocationRequest {
    const message = { ...baseRemoveLocationRequest } as RemoveLocationRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.locationId !== undefined && object.locationId !== null) {
      message.locationId = object.locationId;
    } else {
      message.locationId = 0;
    }
    return message;
  },
};

const baseGenerateTicketRequest: object = { userId: 0, eventId: 0 };

export const GenerateTicketRequest = {
  encode(
    message: GenerateTicketRequest,
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

  decode(input: Reader | Uint8Array, length?: number): GenerateTicketRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGenerateTicketRequest } as GenerateTicketRequest;
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

  fromJSON(object: any): GenerateTicketRequest {
    const message = { ...baseGenerateTicketRequest } as GenerateTicketRequest;
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

  toJSON(message: GenerateTicketRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GenerateTicketRequest>
  ): GenerateTicketRequest {
    const message = { ...baseGenerateTicketRequest } as GenerateTicketRequest;
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

const baseOrganizationListResponse: object = {};

export const OrganizationListResponse = {
  encode(
    message: OrganizationListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.organizations) {
      Organization.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): OrganizationListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseOrganizationListResponse,
    } as OrganizationListResponse;
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

  fromJSON(object: any): OrganizationListResponse {
    const message = {
      ...baseOrganizationListResponse,
    } as OrganizationListResponse;
    message.organizations = [];
    if (object.organizations !== undefined && object.organizations !== null) {
      for (const e of object.organizations) {
        message.organizations.push(Organization.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: OrganizationListResponse): unknown {
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
    object: DeepPartial<OrganizationListResponse>
  ): OrganizationListResponse {
    const message = {
      ...baseOrganizationListResponse,
    } as OrganizationListResponse;
    message.organizations = [];
    if (object.organizations !== undefined && object.organizations !== null) {
      for (const e of object.organizations) {
        message.organizations.push(Organization.fromPartial(e));
      }
    }
    return message;
  },
};

const baseUserListResponse: object = {};

export const UserListResponse = {
  encode(message: UserListResponse, writer: Writer = Writer.create()): Writer {
    for (const v of message.users) {
      User.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UserListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserListResponse } as UserListResponse;
    message.users = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.users.push(User.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UserListResponse {
    const message = { ...baseUserListResponse } as UserListResponse;
    message.users = [];
    if (object.users !== undefined && object.users !== null) {
      for (const e of object.users) {
        message.users.push(User.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: UserListResponse): unknown {
    const obj: any = {};
    if (message.users) {
      obj.users = message.users.map((e) => (e ? User.toJSON(e) : undefined));
    } else {
      obj.users = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<UserListResponse>): UserListResponse {
    const message = { ...baseUserListResponse } as UserListResponse;
    message.users = [];
    if (object.users !== undefined && object.users !== null) {
      for (const e of object.users) {
        message.users.push(User.fromPartial(e));
      }
    }
    return message;
  },
};

const baseUserOrganizationListResponse: object = {};

export const UserOrganizationListResponse = {
  encode(
    message: UserOrganizationListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.userOrganizations) {
      UserOrganization.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): UserOrganizationListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseUserOrganizationListResponse,
    } as UserOrganizationListResponse;
    message.userOrganizations = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userOrganizations.push(
            UserOrganization.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UserOrganizationListResponse {
    const message = {
      ...baseUserOrganizationListResponse,
    } as UserOrganizationListResponse;
    message.userOrganizations = [];
    if (
      object.userOrganizations !== undefined &&
      object.userOrganizations !== null
    ) {
      for (const e of object.userOrganizations) {
        message.userOrganizations.push(UserOrganization.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: UserOrganizationListResponse): unknown {
    const obj: any = {};
    if (message.userOrganizations) {
      obj.userOrganizations = message.userOrganizations.map((e) =>
        e ? UserOrganization.toJSON(e) : undefined
      );
    } else {
      obj.userOrganizations = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<UserOrganizationListResponse>
  ): UserOrganizationListResponse {
    const message = {
      ...baseUserOrganizationListResponse,
    } as UserOrganizationListResponse;
    message.userOrganizations = [];
    if (
      object.userOrganizations !== undefined &&
      object.userOrganizations !== null
    ) {
      for (const e of object.userOrganizations) {
        message.userOrganizations.push(UserOrganization.fromPartial(e));
      }
    }
    return message;
  },
};

const baseEventDurationListResponse: object = {};

export const EventDurationListResponse = {
  encode(
    message: EventDurationListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.eventDurations) {
      EventDuration.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): EventDurationListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseEventDurationListResponse,
    } as EventDurationListResponse;
    message.eventDurations = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.eventDurations.push(
            EventDuration.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventDurationListResponse {
    const message = {
      ...baseEventDurationListResponse,
    } as EventDurationListResponse;
    message.eventDurations = [];
    if (object.eventDurations !== undefined && object.eventDurations !== null) {
      for (const e of object.eventDurations) {
        message.eventDurations.push(EventDuration.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: EventDurationListResponse): unknown {
    const obj: any = {};
    if (message.eventDurations) {
      obj.eventDurations = message.eventDurations.map((e) =>
        e ? EventDuration.toJSON(e) : undefined
      );
    } else {
      obj.eventDurations = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<EventDurationListResponse>
  ): EventDurationListResponse {
    const message = {
      ...baseEventDurationListResponse,
    } as EventDurationListResponse;
    message.eventDurations = [];
    if (object.eventDurations !== undefined && object.eventDurations !== null) {
      for (const e of object.eventDurations) {
        message.eventDurations.push(EventDuration.fromPartial(e));
      }
    }
    return message;
  },
};

const baseEventTagListResponse: object = {};

export const EventTagListResponse = {
  encode(
    message: EventTagListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.eventTags) {
      EventTag.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): EventTagListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseEventTagListResponse } as EventTagListResponse;
    message.eventTags = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.eventTags.push(EventTag.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventTagListResponse {
    const message = { ...baseEventTagListResponse } as EventTagListResponse;
    message.eventTags = [];
    if (object.eventTags !== undefined && object.eventTags !== null) {
      for (const e of object.eventTags) {
        message.eventTags.push(EventTag.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: EventTagListResponse): unknown {
    const obj: any = {};
    if (message.eventTags) {
      obj.eventTags = message.eventTags.map((e) =>
        e ? EventTag.toJSON(e) : undefined
      );
    } else {
      obj.eventTags = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<EventTagListResponse>): EventTagListResponse {
    const message = { ...baseEventTagListResponse } as EventTagListResponse;
    message.eventTags = [];
    if (object.eventTags !== undefined && object.eventTags !== null) {
      for (const e of object.eventTags) {
        message.eventTags.push(EventTag.fromPartial(e));
      }
    }
    return message;
  },
};

const baseQuestionGroupListResponse: object = {};

export const QuestionGroupListResponse = {
  encode(
    message: QuestionGroupListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.questionGroups) {
      QuestionGroup.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): QuestionGroupListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseQuestionGroupListResponse,
    } as QuestionGroupListResponse;
    message.questionGroups = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.questionGroups.push(
            QuestionGroup.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): QuestionGroupListResponse {
    const message = {
      ...baseQuestionGroupListResponse,
    } as QuestionGroupListResponse;
    message.questionGroups = [];
    if (object.questionGroups !== undefined && object.questionGroups !== null) {
      for (const e of object.questionGroups) {
        message.questionGroups.push(QuestionGroup.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: QuestionGroupListResponse): unknown {
    const obj: any = {};
    if (message.questionGroups) {
      obj.questionGroups = message.questionGroups.map((e) =>
        e ? QuestionGroup.toJSON(e) : undefined
      );
    } else {
      obj.questionGroups = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<QuestionGroupListResponse>
  ): QuestionGroupListResponse {
    const message = {
      ...baseQuestionGroupListResponse,
    } as QuestionGroupListResponse;
    message.questionGroups = [];
    if (object.questionGroups !== undefined && object.questionGroups !== null) {
      for (const e of object.questionGroups) {
        message.questionGroups.push(QuestionGroup.fromPartial(e));
      }
    }
    return message;
  },
};

const baseQuestionListResponse: object = {};

export const QuestionListResponse = {
  encode(
    message: QuestionListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.questions) {
      Question.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): QuestionListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseQuestionListResponse } as QuestionListResponse;
    message.questions = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.questions.push(Question.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): QuestionListResponse {
    const message = { ...baseQuestionListResponse } as QuestionListResponse;
    message.questions = [];
    if (object.questions !== undefined && object.questions !== null) {
      for (const e of object.questions) {
        message.questions.push(Question.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: QuestionListResponse): unknown {
    const obj: any = {};
    if (message.questions) {
      obj.questions = message.questions.map((e) =>
        e ? Question.toJSON(e) : undefined
      );
    } else {
      obj.questions = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<QuestionListResponse>): QuestionListResponse {
    const message = { ...baseQuestionListResponse } as QuestionListResponse;
    message.questions = [];
    if (object.questions !== undefined && object.questions !== null) {
      for (const e of object.questions) {
        message.questions.push(Question.fromPartial(e));
      }
    }
    return message;
  },
};

const baseAnswerListResponse: object = {};

export const AnswerListResponse = {
  encode(
    message: AnswerListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.answers) {
      Answer.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): AnswerListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseAnswerListResponse } as AnswerListResponse;
    message.answers = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.answers.push(Answer.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): AnswerListResponse {
    const message = { ...baseAnswerListResponse } as AnswerListResponse;
    message.answers = [];
    if (object.answers !== undefined && object.answers !== null) {
      for (const e of object.answers) {
        message.answers.push(Answer.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: AnswerListResponse): unknown {
    const obj: any = {};
    if (message.answers) {
      obj.answers = message.answers.map((e) =>
        e ? Answer.toJSON(e) : undefined
      );
    } else {
      obj.answers = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<AnswerListResponse>): AnswerListResponse {
    const message = { ...baseAnswerListResponse } as AnswerListResponse;
    message.answers = [];
    if (object.answers !== undefined && object.answers !== null) {
      for (const e of object.answers) {
        message.answers.push(Answer.fromPartial(e));
      }
    }
    return message;
  },
};

const baseLocationListResponse: object = {};

export const LocationListResponse = {
  encode(
    message: LocationListResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.locations) {
      Location.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): LocationListResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseLocationListResponse } as LocationListResponse;
    message.locations = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.locations.push(Location.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): LocationListResponse {
    const message = { ...baseLocationListResponse } as LocationListResponse;
    message.locations = [];
    if (object.locations !== undefined && object.locations !== null) {
      for (const e of object.locations) {
        message.locations.push(Location.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: LocationListResponse): unknown {
    const obj: any = {};
    if (message.locations) {
      obj.locations = message.locations.map((e) =>
        e ? Location.toJSON(e) : undefined
      );
    } else {
      obj.locations = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<LocationListResponse>): LocationListResponse {
    const message = { ...baseLocationListResponse } as LocationListResponse;
    message.locations = [];
    if (object.locations !== undefined && object.locations !== null) {
      for (const e of object.locations) {
        message.locations.push(Location.fromPartial(e));
      }
    }
    return message;
  },
};

const baseCheckInRequest: object = { ticket: "", eventId: 0 };

export const CheckInRequest = {
  encode(message: CheckInRequest, writer: Writer = Writer.create()): Writer {
    if (message.ticket !== "") {
      writer.uint32(10).string(message.ticket);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): CheckInRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseCheckInRequest } as CheckInRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.ticket = reader.string();
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

  fromJSON(object: any): CheckInRequest {
    const message = { ...baseCheckInRequest } as CheckInRequest;
    if (object.ticket !== undefined && object.ticket !== null) {
      message.ticket = String(object.ticket);
    } else {
      message.ticket = "";
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: CheckInRequest): unknown {
    const obj: any = {};
    message.ticket !== undefined && (obj.ticket = message.ticket);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(object: DeepPartial<CheckInRequest>): CheckInRequest {
    const message = { ...baseCheckInRequest } as CheckInRequest;
    if (object.ticket !== undefined && object.ticket !== null) {
      message.ticket = object.ticket;
    } else {
      message.ticket = "";
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    return message;
  },
};

export interface OrganizerService {
  CreateOrganization(request: CreateOrganizationRequest): Promise<Organization>;
  GetOrganizations(request: Empty): Promise<OrganizationListResponse>;
  GetOrganizationById(request: GetObjectByIdRequest): Promise<Organization>;
  GetUsersInOrganizationById(
    request: GetObjectByIdRequest
  ): Promise<UserListResponse>;
  UpdateOrganization(request: UpdateOrganizationRequest): Promise<Organization>;
  RemoveOrganization(request: RemoveOrganizationRequest): Promise<Organization>;
  AddUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<UserOrganizationListResponse>;
  RemoveUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<UserOrganizationListResponse>;
  CreateEvent(request: CreateEventRequest): Promise<Event>;
  UpdateEvent(request: UpdateEventRequest): Promise<Event>;
  UpdateEventDurations(
    request: UpdateEventDurationsRequest
  ): Promise<EventDurationListResponse>;
  RemoveEvent(request: RemoveEventRequest): Promise<Event>;
  UpdateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<UserEvent>;
  CreateTag(request: CreateTagRequest): Promise<Tag>;
  AddTags(request: UpdateTagRequest): Promise<EventTagListResponse>;
  RemoveTags(request: UpdateTagRequest): Promise<EventTagListResponse>;
  HasEvent(request: HasEventRequest): Promise<Event>;
  AddQuestionGroups(
    request: AddQuestionGroupsRequest
  ): Promise<QuestionGroupListResponse>;
  RemoveQuestionGroups(
    request: RemoveQuestionGroupsRequest
  ): Promise<QuestionGroupListResponse>;
  AddQuestions(request: AddQuestionsRequest): Promise<QuestionListResponse>;
  RemoveQuestions(
    request: RemoveQuestionsRequest
  ): Promise<QuestionListResponse>;
  GetAnswersByQuestionId(
    request: GetObjectByIdRequest
  ): Promise<AnswerListResponse>;
  CreateLocation(request: CreateLocationRequest): Promise<Location>;
  GetLocations(request: Empty): Promise<LocationListResponse>;
  GetLocationById(request: GetObjectByIdRequest): Promise<Location>;
  SearchLocationsByName(
    request: GetObjectByNameRequest
  ): Promise<LocationListResponse>;
  UpdateLocation(request: UpdateLocationRequest): Promise<Location>;
  RemoveLocation(request: RemoveLocationRequest): Promise<Location>;
  GenerateTicket(request: GenerateTicketRequest): Promise<UserEvent>;
  CheckIn(request: CheckInRequest): Promise<UserEvent>;
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

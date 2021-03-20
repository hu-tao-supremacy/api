/* eslint-disable */
import { Reader, util, configure, Writer } from "protobufjs/minimal";
import { Timestamp } from "../../google/protobuf/timestamp";
import * as Long from "long";
import {
  UserEvent,
  User,
  Event,
  EventFeedback,
  Result,
  Tag,
  Organization,
  Facility,
} from "../../hts/common/common";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.participant";

export interface GenerateQRRequest {
  userEvent: UserEvent | undefined;
}

export interface GetEventRequest {
  eventId: number;
}

export interface StringInputRequest {
  text: string;
}

export interface UserWithEventRequest {
  user: User | undefined;
  event: Event | undefined;
}

export interface CreateFeedbackRequest {
  user: User | undefined;
  feedback: EventFeedback | undefined;
}

export interface GenerateQRResponse {
  data: string;
}

export interface GetFeedbacksFromEventResponse {
  eventFeedback: EventFeedback[];
}

export interface EventsResponse {
  event: Event[];
}

export interface IsEventAvailableRequest {
  event: Event | undefined;
  date: Date | undefined;
}

const baseGenerateQRRequest: object = {};

export const GenerateQRRequest = {
  encode(message: GenerateQRRequest, writer: Writer = Writer.create()): Writer {
    if (message.userEvent !== undefined) {
      UserEvent.encode(message.userEvent, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GenerateQRRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGenerateQRRequest } as GenerateQRRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userEvent = UserEvent.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GenerateQRRequest {
    const message = { ...baseGenerateQRRequest } as GenerateQRRequest;
    if (object.userEvent !== undefined && object.userEvent !== null) {
      message.userEvent = UserEvent.fromJSON(object.userEvent);
    } else {
      message.userEvent = undefined;
    }
    return message;
  },

  toJSON(message: GenerateQRRequest): unknown {
    const obj: any = {};
    message.userEvent !== undefined &&
      (obj.userEvent = message.userEvent
        ? UserEvent.toJSON(message.userEvent)
        : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<GenerateQRRequest>): GenerateQRRequest {
    const message = { ...baseGenerateQRRequest } as GenerateQRRequest;
    if (object.userEvent !== undefined && object.userEvent !== null) {
      message.userEvent = UserEvent.fromPartial(object.userEvent);
    } else {
      message.userEvent = undefined;
    }
    return message;
  },
};

const baseGetEventRequest: object = { eventId: 0 };

export const GetEventRequest = {
  encode(message: GetEventRequest, writer: Writer = Writer.create()): Writer {
    if (message.eventId !== 0) {
      writer.uint32(8).int64(message.eventId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetEventRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetEventRequest } as GetEventRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.eventId = longToNumber(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventRequest {
    const message = { ...baseGetEventRequest } as GetEventRequest;
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: GetEventRequest): unknown {
    const obj: any = {};
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(object: DeepPartial<GetEventRequest>): GetEventRequest {
    const message = { ...baseGetEventRequest } as GetEventRequest;
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    return message;
  },
};

const baseStringInputRequest: object = { text: "" };

export const StringInputRequest = {
  encode(
    message: StringInputRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.text !== "") {
      writer.uint32(10).string(message.text);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): StringInputRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseStringInputRequest } as StringInputRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.text = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): StringInputRequest {
    const message = { ...baseStringInputRequest } as StringInputRequest;
    if (object.text !== undefined && object.text !== null) {
      message.text = String(object.text);
    } else {
      message.text = "";
    }
    return message;
  },

  toJSON(message: StringInputRequest): unknown {
    const obj: any = {};
    message.text !== undefined && (obj.text = message.text);
    return obj;
  },

  fromPartial(object: DeepPartial<StringInputRequest>): StringInputRequest {
    const message = { ...baseStringInputRequest } as StringInputRequest;
    if (object.text !== undefined && object.text !== null) {
      message.text = object.text;
    } else {
      message.text = "";
    }
    return message;
  },
};

const baseUserWithEventRequest: object = {};

export const UserWithEventRequest = {
  encode(
    message: UserWithEventRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.user !== undefined) {
      User.encode(message.user, writer.uint32(10).fork()).ldelim();
    }
    if (message.event !== undefined) {
      Event.encode(message.event, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UserWithEventRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserWithEventRequest } as UserWithEventRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.user = User.decode(reader, reader.uint32());
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

  fromJSON(object: any): UserWithEventRequest {
    const message = { ...baseUserWithEventRequest } as UserWithEventRequest;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromJSON(object.user);
    } else {
      message.user = undefined;
    }
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromJSON(object.event);
    } else {
      message.event = undefined;
    }
    return message;
  },

  toJSON(message: UserWithEventRequest): unknown {
    const obj: any = {};
    message.user !== undefined &&
      (obj.user = message.user ? User.toJSON(message.user) : undefined);
    message.event !== undefined &&
      (obj.event = message.event ? Event.toJSON(message.event) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<UserWithEventRequest>): UserWithEventRequest {
    const message = { ...baseUserWithEventRequest } as UserWithEventRequest;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromPartial(object.user);
    } else {
      message.user = undefined;
    }
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromPartial(object.event);
    } else {
      message.event = undefined;
    }
    return message;
  },
};

const baseCreateFeedbackRequest: object = {};

export const CreateFeedbackRequest = {
  encode(
    message: CreateFeedbackRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.user !== undefined) {
      User.encode(message.user, writer.uint32(10).fork()).ldelim();
    }
    if (message.feedback !== undefined) {
      EventFeedback.encode(message.feedback, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): CreateFeedbackRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseCreateFeedbackRequest } as CreateFeedbackRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.user = User.decode(reader, reader.uint32());
          break;
        case 2:
          message.feedback = EventFeedback.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateFeedbackRequest {
    const message = { ...baseCreateFeedbackRequest } as CreateFeedbackRequest;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromJSON(object.user);
    } else {
      message.user = undefined;
    }
    if (object.feedback !== undefined && object.feedback !== null) {
      message.feedback = EventFeedback.fromJSON(object.feedback);
    } else {
      message.feedback = undefined;
    }
    return message;
  },

  toJSON(message: CreateFeedbackRequest): unknown {
    const obj: any = {};
    message.user !== undefined &&
      (obj.user = message.user ? User.toJSON(message.user) : undefined);
    message.feedback !== undefined &&
      (obj.feedback = message.feedback
        ? EventFeedback.toJSON(message.feedback)
        : undefined);
    return obj;
  },

  fromPartial(
    object: DeepPartial<CreateFeedbackRequest>
  ): CreateFeedbackRequest {
    const message = { ...baseCreateFeedbackRequest } as CreateFeedbackRequest;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromPartial(object.user);
    } else {
      message.user = undefined;
    }
    if (object.feedback !== undefined && object.feedback !== null) {
      message.feedback = EventFeedback.fromPartial(object.feedback);
    } else {
      message.feedback = undefined;
    }
    return message;
  },
};

const baseGenerateQRResponse: object = { data: "" };

export const GenerateQRResponse = {
  encode(
    message: GenerateQRResponse,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.data !== "") {
      writer.uint32(10).string(message.data);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GenerateQRResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGenerateQRResponse } as GenerateQRResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.data = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GenerateQRResponse {
    const message = { ...baseGenerateQRResponse } as GenerateQRResponse;
    if (object.data !== undefined && object.data !== null) {
      message.data = String(object.data);
    } else {
      message.data = "";
    }
    return message;
  },

  toJSON(message: GenerateQRResponse): unknown {
    const obj: any = {};
    message.data !== undefined && (obj.data = message.data);
    return obj;
  },

  fromPartial(object: DeepPartial<GenerateQRResponse>): GenerateQRResponse {
    const message = { ...baseGenerateQRResponse } as GenerateQRResponse;
    if (object.data !== undefined && object.data !== null) {
      message.data = object.data;
    } else {
      message.data = "";
    }
    return message;
  },
};

const baseGetFeedbacksFromEventResponse: object = {};

export const GetFeedbacksFromEventResponse = {
  encode(
    message: GetFeedbacksFromEventResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.eventFeedback) {
      EventFeedback.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetFeedbacksFromEventResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetFeedbacksFromEventResponse,
    } as GetFeedbacksFromEventResponse;
    message.eventFeedback = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.eventFeedback.push(
            EventFeedback.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetFeedbacksFromEventResponse {
    const message = {
      ...baseGetFeedbacksFromEventResponse,
    } as GetFeedbacksFromEventResponse;
    message.eventFeedback = [];
    if (object.eventFeedback !== undefined && object.eventFeedback !== null) {
      for (const e of object.eventFeedback) {
        message.eventFeedback.push(EventFeedback.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetFeedbacksFromEventResponse): unknown {
    const obj: any = {};
    if (message.eventFeedback) {
      obj.eventFeedback = message.eventFeedback.map((e) =>
        e ? EventFeedback.toJSON(e) : undefined
      );
    } else {
      obj.eventFeedback = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetFeedbacksFromEventResponse>
  ): GetFeedbacksFromEventResponse {
    const message = {
      ...baseGetFeedbacksFromEventResponse,
    } as GetFeedbacksFromEventResponse;
    message.eventFeedback = [];
    if (object.eventFeedback !== undefined && object.eventFeedback !== null) {
      for (const e of object.eventFeedback) {
        message.eventFeedback.push(EventFeedback.fromPartial(e));
      }
    }
    return message;
  },
};

const baseEventsResponse: object = {};

export const EventsResponse = {
  encode(message: EventsResponse, writer: Writer = Writer.create()): Writer {
    for (const v of message.event) {
      Event.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): EventsResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseEventsResponse } as EventsResponse;
    message.event = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.event.push(Event.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventsResponse {
    const message = { ...baseEventsResponse } as EventsResponse;
    message.event = [];
    if (object.event !== undefined && object.event !== null) {
      for (const e of object.event) {
        message.event.push(Event.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: EventsResponse): unknown {
    const obj: any = {};
    if (message.event) {
      obj.event = message.event.map((e) => (e ? Event.toJSON(e) : undefined));
    } else {
      obj.event = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<EventsResponse>): EventsResponse {
    const message = { ...baseEventsResponse } as EventsResponse;
    message.event = [];
    if (object.event !== undefined && object.event !== null) {
      for (const e of object.event) {
        message.event.push(Event.fromPartial(e));
      }
    }
    return message;
  },
};

const baseIsEventAvailableRequest: object = {};

export const IsEventAvailableRequest = {
  encode(
    message: IsEventAvailableRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.event !== undefined) {
      Event.encode(message.event, writer.uint32(10).fork()).ldelim();
    }
    if (message.date !== undefined) {
      Timestamp.encode(
        toTimestamp(message.date),
        writer.uint32(18).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): IsEventAvailableRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseIsEventAvailableRequest,
    } as IsEventAvailableRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.event = Event.decode(reader, reader.uint32());
          break;
        case 2:
          message.date = fromTimestamp(
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

  fromJSON(object: any): IsEventAvailableRequest {
    const message = {
      ...baseIsEventAvailableRequest,
    } as IsEventAvailableRequest;
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromJSON(object.event);
    } else {
      message.event = undefined;
    }
    if (object.date !== undefined && object.date !== null) {
      message.date = fromJsonTimestamp(object.date);
    } else {
      message.date = undefined;
    }
    return message;
  },

  toJSON(message: IsEventAvailableRequest): unknown {
    const obj: any = {};
    message.event !== undefined &&
      (obj.event = message.event ? Event.toJSON(message.event) : undefined);
    message.date !== undefined &&
      (obj.date =
        message.date !== undefined ? message.date.toISOString() : null);
    return obj;
  },

  fromPartial(
    object: DeepPartial<IsEventAvailableRequest>
  ): IsEventAvailableRequest {
    const message = {
      ...baseIsEventAvailableRequest,
    } as IsEventAvailableRequest;
    if (object.event !== undefined && object.event !== null) {
      message.event = Event.fromPartial(object.event);
    } else {
      message.event = undefined;
    }
    if (object.date !== undefined && object.date !== null) {
      message.date = object.date;
    } else {
      message.date = undefined;
    }
    return message;
  },
};

export interface ParticipantService {
  IsEventAvailable(request: IsEventAvailableRequest): Promise<Result>;
  JoinEvent(request: UserWithEventRequest): Promise<Event>;
  CancelEvent(request: UserWithEventRequest): Promise<Event>;
  CreateFeedback(request: CreateFeedbackRequest): Promise<EventFeedback>;
  HasSubmitFeedback(request: UserWithEventRequest): Promise<EventFeedback>;
  RemoveFeedback(request: EventFeedback): Promise<EventFeedback>;
  GetFeedbacksFromEvent(request: Event): Promise<GetFeedbacksFromEventResponse>;
  GetUserFeedbackFromEvent(
    request: UserWithEventRequest
  ): Promise<EventFeedback>;
  GetEvent(request: GetEventRequest): Promise<Event>;
  GetAllEvents(request: Empty): Promise<EventsResponse>;
  GetSuggestedEvents(request: Empty): Promise<EventsResponse>;
  GetEventsByStringOfName(request: StringInputRequest): Promise<EventsResponse>;
  GetEventsByTag(request: Tag): Promise<EventsResponse>;
  GetEventsByOrganization(request: Organization): Promise<EventsResponse>;
  GetEventsByFacility(request: Facility): Promise<EventsResponse>;
  GetEventsByDate(request: StringInputRequest): Promise<EventsResponse>;
  GenerateQR(request: UserEvent): Promise<GenerateQRResponse>;
  Ping(request: Empty): Promise<Result>;
}

export class ParticipantServiceClientImpl implements ParticipantService {
  private readonly rpc: Rpc;
  constructor(rpc: Rpc) {
    this.rpc = rpc;
  }
  IsEventAvailable(request: IsEventAvailableRequest): Promise<Result> {
    const data = IsEventAvailableRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "IsEventAvailable",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  JoinEvent(request: UserWithEventRequest): Promise<Event> {
    const data = UserWithEventRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "JoinEvent",
      data
    );
    return promise.then((data) => Event.decode(new Reader(data)));
  }

  CancelEvent(request: UserWithEventRequest): Promise<Event> {
    const data = UserWithEventRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "CancelEvent",
      data
    );
    return promise.then((data) => Event.decode(new Reader(data)));
  }

  CreateFeedback(request: CreateFeedbackRequest): Promise<EventFeedback> {
    const data = CreateFeedbackRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "CreateFeedback",
      data
    );
    return promise.then((data) => EventFeedback.decode(new Reader(data)));
  }

  HasSubmitFeedback(request: UserWithEventRequest): Promise<EventFeedback> {
    const data = UserWithEventRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "HasSubmitFeedback",
      data
    );
    return promise.then((data) => EventFeedback.decode(new Reader(data)));
  }

  RemoveFeedback(request: EventFeedback): Promise<EventFeedback> {
    const data = EventFeedback.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "RemoveFeedback",
      data
    );
    return promise.then((data) => EventFeedback.decode(new Reader(data)));
  }

  GetFeedbacksFromEvent(
    request: Event
  ): Promise<GetFeedbacksFromEventResponse> {
    const data = Event.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GetFeedbacksFromEvent",
      data
    );
    return promise.then((data) =>
      GetFeedbacksFromEventResponse.decode(new Reader(data))
    );
  }

  GetUserFeedbackFromEvent(
    request: UserWithEventRequest
  ): Promise<EventFeedback> {
    const data = UserWithEventRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GetUserFeedbackFromEvent",
      data
    );
    return promise.then((data) => EventFeedback.decode(new Reader(data)));
  }

  GetEvent(request: GetEventRequest): Promise<Event> {
    const data = GetEventRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GetEvent",
      data
    );
    return promise.then((data) => Event.decode(new Reader(data)));
  }

  GetAllEvents(request: Empty): Promise<EventsResponse> {
    const data = Empty.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GetAllEvents",
      data
    );
    return promise.then((data) => EventsResponse.decode(new Reader(data)));
  }

  GetSuggestedEvents(request: Empty): Promise<EventsResponse> {
    const data = Empty.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GetSuggestedEvents",
      data
    );
    return promise.then((data) => EventsResponse.decode(new Reader(data)));
  }

  GetEventsByStringOfName(
    request: StringInputRequest
  ): Promise<EventsResponse> {
    const data = StringInputRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GetEventsByStringOfName",
      data
    );
    return promise.then((data) => EventsResponse.decode(new Reader(data)));
  }

  GetEventsByTag(request: Tag): Promise<EventsResponse> {
    const data = Tag.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GetEventsByTag",
      data
    );
    return promise.then((data) => EventsResponse.decode(new Reader(data)));
  }

  GetEventsByOrganization(request: Organization): Promise<EventsResponse> {
    const data = Organization.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GetEventsByOrganization",
      data
    );
    return promise.then((data) => EventsResponse.decode(new Reader(data)));
  }

  GetEventsByFacility(request: Facility): Promise<EventsResponse> {
    const data = Facility.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GetEventsByFacility",
      data
    );
    return promise.then((data) => EventsResponse.decode(new Reader(data)));
  }

  GetEventsByDate(request: StringInputRequest): Promise<EventsResponse> {
    const data = StringInputRequest.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GetEventsByDate",
      data
    );
    return promise.then((data) => EventsResponse.decode(new Reader(data)));
  }

  GenerateQR(request: UserEvent): Promise<GenerateQRResponse> {
    const data = UserEvent.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
      "GenerateQR",
      data
    );
    return promise.then((data) => GenerateQRResponse.decode(new Reader(data)));
  }

  Ping(request: Empty): Promise<Result> {
    const data = Empty.encode(request).finish();
    const promise = this.rpc.request(
      "hts.participant.ParticipantService",
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

if (util.Long !== Long) {
  util.Long = Long as any;
  configure();
}

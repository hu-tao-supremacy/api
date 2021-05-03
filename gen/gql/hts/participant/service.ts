/* eslint-disable */
import {
  QuestionGroupType,
  UserEvent_Status,
  Answer,
  Event,
  Tag,
  User,
  EventDuration,
  QuestionGroup,
  Question,
  UserEvent,
  Location,
  questionGroupTypeFromJSON,
  questionGroupTypeToJSON,
  userEvent_StatusFromJSON,
  userEvent_StatusToJSON,
  GetObjectByIdRequest,
} from "../../hts/common/common";
import { Timestamp } from "../../google/protobuf/timestamp";
import { Writer, Reader } from "protobufjs/minimal";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.participant";

export interface GetEventByIdRequest {
  eventId: number;
}

export interface StringInputRequest {
  text: string;
}

export interface UserWithEventRequest {
  userId: number;
  eventId: number;
}

export interface SubmitAnswerForEventQuestionRequest {
  answers: SubmitAnswerForEventQuestionRequest_Answer[];
  userEventId: number;
  type: QuestionGroupType;
}

export interface SubmitAnswerForEventQuestionRequest_Answer {
  questionId: number;
  value: string;
}

export interface SubmitAnswerForEventQuestionResponse {
  answers: Answer[];
}

export interface GenerateQRResponse {
  data: string;
}

export interface EventsResponse {
  event: Event[];
}

export interface IsEventAvailableRequest {
  eventId: number;
  date: Date | undefined;
}

export interface GetUpcomingEventsRequest {
  start: Date | undefined;
  end: Date | undefined;
}

export interface GenerateQRRequest {
  userEventId: number;
  userId: number;
  eventId: number;
}

export interface TagsResponse {
  tags: Tag[];
}

export interface GetUsersByEventIdRequest {
  eventId: number;
  status: UserEvent_Status;
}

export interface GetUsersByEventIdResponse {
  users: User[];
}

export interface GetRatingByEventIdResponse {
  result: number[];
}

export interface GetEventDurationsByEventIdResponse {
  eventDurations: EventDuration[];
}

export interface GetUserAnswerByQuestionIdRequest {
  userId: number;
  questionId: number;
}

export interface GetQuestionGroupsByEventIdResponse {
  questionGroups: QuestionGroup[];
}

export interface GetQuestionsByQuestionGroupIdResponse {
  questions: Question[];
}

export interface AnswersResponse {
  answers: Answer[];
}

export interface GetEventsByUserIdRequest {
  userId: number;
}

export interface GetEventsByTagIdsRequest {
  tagIds: number[];
}

export interface GetUserEventsByEventIdResponse {
  userEvents: UserEvent[];
}

export interface SetRatingByUserEventIdRequest {
  userEventId: number;
  rating: number;
}

export interface GetPastEventsFromTagsRequest {
  tagId: number[];
  numberOfEvents: number;
}

export interface GetOnlineEventsRequest {
  n: number;
}

export interface GetOnSiteEventsRequest {
  n: number;
}

const baseGetEventByIdRequest: object = { eventId: 0 };

export const GetEventByIdRequest = {
  encode(
    message: GetEventByIdRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.eventId !== 0) {
      writer.uint32(8).int32(message.eventId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetEventByIdRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetEventByIdRequest } as GetEventByIdRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.eventId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventByIdRequest {
    const message = { ...baseGetEventByIdRequest } as GetEventByIdRequest;
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    return message;
  },

  toJSON(message: GetEventByIdRequest): unknown {
    const obj: any = {};
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(object: DeepPartial<GetEventByIdRequest>): GetEventByIdRequest {
    const message = { ...baseGetEventByIdRequest } as GetEventByIdRequest;
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

const baseUserWithEventRequest: object = { userId: 0, eventId: 0 };

export const UserWithEventRequest = {
  encode(
    message: UserWithEventRequest,
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

  decode(input: Reader | Uint8Array, length?: number): UserWithEventRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserWithEventRequest } as UserWithEventRequest;
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

  fromJSON(object: any): UserWithEventRequest {
    const message = { ...baseUserWithEventRequest } as UserWithEventRequest;
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

  toJSON(message: UserWithEventRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(object: DeepPartial<UserWithEventRequest>): UserWithEventRequest {
    const message = { ...baseUserWithEventRequest } as UserWithEventRequest;
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

const baseSubmitAnswerForEventQuestionRequest: object = {
  userEventId: 0,
  type: 0,
};

export const SubmitAnswerForEventQuestionRequest = {
  encode(
    message: SubmitAnswerForEventQuestionRequest,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.answers) {
      SubmitAnswerForEventQuestionRequest_Answer.encode(
        v!,
        writer.uint32(10).fork()
      ).ldelim();
    }
    if (message.userEventId !== 0) {
      writer.uint32(16).int32(message.userEventId);
    }
    if (message.type !== 0) {
      writer.uint32(24).int32(message.type);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): SubmitAnswerForEventQuestionRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseSubmitAnswerForEventQuestionRequest,
    } as SubmitAnswerForEventQuestionRequest;
    message.answers = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.answers.push(
            SubmitAnswerForEventQuestionRequest_Answer.decode(
              reader,
              reader.uint32()
            )
          );
          break;
        case 2:
          message.userEventId = reader.int32();
          break;
        case 3:
          message.type = reader.int32() as any;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SubmitAnswerForEventQuestionRequest {
    const message = {
      ...baseSubmitAnswerForEventQuestionRequest,
    } as SubmitAnswerForEventQuestionRequest;
    message.answers = [];
    if (object.answers !== undefined && object.answers !== null) {
      for (const e of object.answers) {
        message.answers.push(
          SubmitAnswerForEventQuestionRequest_Answer.fromJSON(e)
        );
      }
    }
    if (object.userEventId !== undefined && object.userEventId !== null) {
      message.userEventId = Number(object.userEventId);
    } else {
      message.userEventId = 0;
    }
    if (object.type !== undefined && object.type !== null) {
      message.type = questionGroupTypeFromJSON(object.type);
    } else {
      message.type = 0;
    }
    return message;
  },

  toJSON(message: SubmitAnswerForEventQuestionRequest): unknown {
    const obj: any = {};
    if (message.answers) {
      obj.answers = message.answers.map((e) =>
        e ? SubmitAnswerForEventQuestionRequest_Answer.toJSON(e) : undefined
      );
    } else {
      obj.answers = [];
    }
    message.userEventId !== undefined &&
      (obj.userEventId = message.userEventId);
    message.type !== undefined &&
      (obj.type = questionGroupTypeToJSON(message.type));
    return obj;
  },

  fromPartial(
    object: DeepPartial<SubmitAnswerForEventQuestionRequest>
  ): SubmitAnswerForEventQuestionRequest {
    const message = {
      ...baseSubmitAnswerForEventQuestionRequest,
    } as SubmitAnswerForEventQuestionRequest;
    message.answers = [];
    if (object.answers !== undefined && object.answers !== null) {
      for (const e of object.answers) {
        message.answers.push(
          SubmitAnswerForEventQuestionRequest_Answer.fromPartial(e)
        );
      }
    }
    if (object.userEventId !== undefined && object.userEventId !== null) {
      message.userEventId = object.userEventId;
    } else {
      message.userEventId = 0;
    }
    if (object.type !== undefined && object.type !== null) {
      message.type = object.type;
    } else {
      message.type = 0;
    }
    return message;
  },
};

const baseSubmitAnswerForEventQuestionRequest_Answer: object = {
  questionId: 0,
  value: "",
};

export const SubmitAnswerForEventQuestionRequest_Answer = {
  encode(
    message: SubmitAnswerForEventQuestionRequest_Answer,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.questionId !== 0) {
      writer.uint32(8).int32(message.questionId);
    }
    if (message.value !== "") {
      writer.uint32(18).string(message.value);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): SubmitAnswerForEventQuestionRequest_Answer {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseSubmitAnswerForEventQuestionRequest_Answer,
    } as SubmitAnswerForEventQuestionRequest_Answer;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.questionId = reader.int32();
          break;
        case 2:
          message.value = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SubmitAnswerForEventQuestionRequest_Answer {
    const message = {
      ...baseSubmitAnswerForEventQuestionRequest_Answer,
    } as SubmitAnswerForEventQuestionRequest_Answer;
    if (object.questionId !== undefined && object.questionId !== null) {
      message.questionId = Number(object.questionId);
    } else {
      message.questionId = 0;
    }
    if (object.value !== undefined && object.value !== null) {
      message.value = String(object.value);
    } else {
      message.value = "";
    }
    return message;
  },

  toJSON(message: SubmitAnswerForEventQuestionRequest_Answer): unknown {
    const obj: any = {};
    message.questionId !== undefined && (obj.questionId = message.questionId);
    message.value !== undefined && (obj.value = message.value);
    return obj;
  },

  fromPartial(
    object: DeepPartial<SubmitAnswerForEventQuestionRequest_Answer>
  ): SubmitAnswerForEventQuestionRequest_Answer {
    const message = {
      ...baseSubmitAnswerForEventQuestionRequest_Answer,
    } as SubmitAnswerForEventQuestionRequest_Answer;
    if (object.questionId !== undefined && object.questionId !== null) {
      message.questionId = object.questionId;
    } else {
      message.questionId = 0;
    }
    if (object.value !== undefined && object.value !== null) {
      message.value = object.value;
    } else {
      message.value = "";
    }
    return message;
  },
};

const baseSubmitAnswerForEventQuestionResponse: object = {};

export const SubmitAnswerForEventQuestionResponse = {
  encode(
    message: SubmitAnswerForEventQuestionResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.answers) {
      Answer.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): SubmitAnswerForEventQuestionResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseSubmitAnswerForEventQuestionResponse,
    } as SubmitAnswerForEventQuestionResponse;
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

  fromJSON(object: any): SubmitAnswerForEventQuestionResponse {
    const message = {
      ...baseSubmitAnswerForEventQuestionResponse,
    } as SubmitAnswerForEventQuestionResponse;
    message.answers = [];
    if (object.answers !== undefined && object.answers !== null) {
      for (const e of object.answers) {
        message.answers.push(Answer.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: SubmitAnswerForEventQuestionResponse): unknown {
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

  fromPartial(
    object: DeepPartial<SubmitAnswerForEventQuestionResponse>
  ): SubmitAnswerForEventQuestionResponse {
    const message = {
      ...baseSubmitAnswerForEventQuestionResponse,
    } as SubmitAnswerForEventQuestionResponse;
    message.answers = [];
    if (object.answers !== undefined && object.answers !== null) {
      for (const e of object.answers) {
        message.answers.push(Answer.fromPartial(e));
      }
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

const baseIsEventAvailableRequest: object = { eventId: 0 };

export const IsEventAvailableRequest = {
  encode(
    message: IsEventAvailableRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.eventId !== 0) {
      writer.uint32(8).int32(message.eventId);
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
          message.eventId = reader.int32();
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
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
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
    message.eventId !== undefined && (obj.eventId = message.eventId);
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
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    if (object.date !== undefined && object.date !== null) {
      message.date = object.date;
    } else {
      message.date = undefined;
    }
    return message;
  },
};

const baseGetUpcomingEventsRequest: object = {};

export const GetUpcomingEventsRequest = {
  encode(
    message: GetUpcomingEventsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.start !== undefined) {
      Timestamp.encode(
        toTimestamp(message.start),
        writer.uint32(10).fork()
      ).ldelim();
    }
    if (message.end !== undefined) {
      Timestamp.encode(
        toTimestamp(message.end),
        writer.uint32(18).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetUpcomingEventsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetUpcomingEventsRequest,
    } as GetUpcomingEventsRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.start = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        case 2:
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

  fromJSON(object: any): GetUpcomingEventsRequest {
    const message = {
      ...baseGetUpcomingEventsRequest,
    } as GetUpcomingEventsRequest;
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

  toJSON(message: GetUpcomingEventsRequest): unknown {
    const obj: any = {};
    message.start !== undefined &&
      (obj.start =
        message.start !== undefined ? message.start.toISOString() : null);
    message.end !== undefined &&
      (obj.end = message.end !== undefined ? message.end.toISOString() : null);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetUpcomingEventsRequest>
  ): GetUpcomingEventsRequest {
    const message = {
      ...baseGetUpcomingEventsRequest,
    } as GetUpcomingEventsRequest;
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

const baseGenerateQRRequest: object = { userEventId: 0, userId: 0, eventId: 0 };

export const GenerateQRRequest = {
  encode(message: GenerateQRRequest, writer: Writer = Writer.create()): Writer {
    if (message.userEventId !== 0) {
      writer.uint32(8).int32(message.userEventId);
    }
    if (message.userId !== 0) {
      writer.uint32(16).int32(message.userId);
    }
    if (message.eventId !== 0) {
      writer.uint32(24).int32(message.eventId);
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
          message.userEventId = reader.int32();
          break;
        case 2:
          message.userId = reader.int32();
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

  fromJSON(object: any): GenerateQRRequest {
    const message = { ...baseGenerateQRRequest } as GenerateQRRequest;
    if (object.userEventId !== undefined && object.userEventId !== null) {
      message.userEventId = Number(object.userEventId);
    } else {
      message.userEventId = 0;
    }
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

  toJSON(message: GenerateQRRequest): unknown {
    const obj: any = {};
    message.userEventId !== undefined &&
      (obj.userEventId = message.userEventId);
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    return obj;
  },

  fromPartial(object: DeepPartial<GenerateQRRequest>): GenerateQRRequest {
    const message = { ...baseGenerateQRRequest } as GenerateQRRequest;
    if (object.userEventId !== undefined && object.userEventId !== null) {
      message.userEventId = object.userEventId;
    } else {
      message.userEventId = 0;
    }
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

const baseTagsResponse: object = {};

export const TagsResponse = {
  encode(message: TagsResponse, writer: Writer = Writer.create()): Writer {
    for (const v of message.tags) {
      Tag.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): TagsResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseTagsResponse } as TagsResponse;
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

  fromJSON(object: any): TagsResponse {
    const message = { ...baseTagsResponse } as TagsResponse;
    message.tags = [];
    if (object.tags !== undefined && object.tags !== null) {
      for (const e of object.tags) {
        message.tags.push(Tag.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: TagsResponse): unknown {
    const obj: any = {};
    if (message.tags) {
      obj.tags = message.tags.map((e) => (e ? Tag.toJSON(e) : undefined));
    } else {
      obj.tags = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<TagsResponse>): TagsResponse {
    const message = { ...baseTagsResponse } as TagsResponse;
    message.tags = [];
    if (object.tags !== undefined && object.tags !== null) {
      for (const e of object.tags) {
        message.tags.push(Tag.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetUsersByEventIdRequest: object = { eventId: 0, status: 0 };

export const GetUsersByEventIdRequest = {
  encode(
    message: GetUsersByEventIdRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.eventId !== 0) {
      writer.uint32(8).int32(message.eventId);
    }
    if (message.status !== 0) {
      writer.uint32(16).int32(message.status);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetUsersByEventIdRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetUsersByEventIdRequest,
    } as GetUsersByEventIdRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.eventId = reader.int32();
          break;
        case 2:
          message.status = reader.int32() as any;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUsersByEventIdRequest {
    const message = {
      ...baseGetUsersByEventIdRequest,
    } as GetUsersByEventIdRequest;
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = userEvent_StatusFromJSON(object.status);
    } else {
      message.status = 0;
    }
    return message;
  },

  toJSON(message: GetUsersByEventIdRequest): unknown {
    const obj: any = {};
    message.eventId !== undefined && (obj.eventId = message.eventId);
    message.status !== undefined &&
      (obj.status = userEvent_StatusToJSON(message.status));
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetUsersByEventIdRequest>
  ): GetUsersByEventIdRequest {
    const message = {
      ...baseGetUsersByEventIdRequest,
    } as GetUsersByEventIdRequest;
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = object.status;
    } else {
      message.status = 0;
    }
    return message;
  },
};

const baseGetUsersByEventIdResponse: object = {};

export const GetUsersByEventIdResponse = {
  encode(
    message: GetUsersByEventIdResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.users) {
      User.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetUsersByEventIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetUsersByEventIdResponse,
    } as GetUsersByEventIdResponse;
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

  fromJSON(object: any): GetUsersByEventIdResponse {
    const message = {
      ...baseGetUsersByEventIdResponse,
    } as GetUsersByEventIdResponse;
    message.users = [];
    if (object.users !== undefined && object.users !== null) {
      for (const e of object.users) {
        message.users.push(User.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetUsersByEventIdResponse): unknown {
    const obj: any = {};
    if (message.users) {
      obj.users = message.users.map((e) => (e ? User.toJSON(e) : undefined));
    } else {
      obj.users = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetUsersByEventIdResponse>
  ): GetUsersByEventIdResponse {
    const message = {
      ...baseGetUsersByEventIdResponse,
    } as GetUsersByEventIdResponse;
    message.users = [];
    if (object.users !== undefined && object.users !== null) {
      for (const e of object.users) {
        message.users.push(User.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetRatingByEventIdResponse: object = { result: 0 };

export const GetRatingByEventIdResponse = {
  encode(
    message: GetRatingByEventIdResponse,
    writer: Writer = Writer.create()
  ): Writer {
    writer.uint32(10).fork();
    for (const v of message.result) {
      writer.int32(v);
    }
    writer.ldelim();
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetRatingByEventIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetRatingByEventIdResponse,
    } as GetRatingByEventIdResponse;
    message.result = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.result.push(reader.int32());
            }
          } else {
            message.result.push(reader.int32());
          }
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetRatingByEventIdResponse {
    const message = {
      ...baseGetRatingByEventIdResponse,
    } as GetRatingByEventIdResponse;
    message.result = [];
    if (object.result !== undefined && object.result !== null) {
      for (const e of object.result) {
        message.result.push(Number(e));
      }
    }
    return message;
  },

  toJSON(message: GetRatingByEventIdResponse): unknown {
    const obj: any = {};
    if (message.result) {
      obj.result = message.result.map((e) => e);
    } else {
      obj.result = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetRatingByEventIdResponse>
  ): GetRatingByEventIdResponse {
    const message = {
      ...baseGetRatingByEventIdResponse,
    } as GetRatingByEventIdResponse;
    message.result = [];
    if (object.result !== undefined && object.result !== null) {
      for (const e of object.result) {
        message.result.push(e);
      }
    }
    return message;
  },
};

const baseGetEventDurationsByEventIdResponse: object = {};

export const GetEventDurationsByEventIdResponse = {
  encode(
    message: GetEventDurationsByEventIdResponse,
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
  ): GetEventDurationsByEventIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetEventDurationsByEventIdResponse,
    } as GetEventDurationsByEventIdResponse;
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

  fromJSON(object: any): GetEventDurationsByEventIdResponse {
    const message = {
      ...baseGetEventDurationsByEventIdResponse,
    } as GetEventDurationsByEventIdResponse;
    message.eventDurations = [];
    if (object.eventDurations !== undefined && object.eventDurations !== null) {
      for (const e of object.eventDurations) {
        message.eventDurations.push(EventDuration.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetEventDurationsByEventIdResponse): unknown {
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
    object: DeepPartial<GetEventDurationsByEventIdResponse>
  ): GetEventDurationsByEventIdResponse {
    const message = {
      ...baseGetEventDurationsByEventIdResponse,
    } as GetEventDurationsByEventIdResponse;
    message.eventDurations = [];
    if (object.eventDurations !== undefined && object.eventDurations !== null) {
      for (const e of object.eventDurations) {
        message.eventDurations.push(EventDuration.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetUserAnswerByQuestionIdRequest: object = {
  userId: 0,
  questionId: 0,
};

export const GetUserAnswerByQuestionIdRequest = {
  encode(
    message: GetUserAnswerByQuestionIdRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.questionId !== 0) {
      writer.uint32(16).int32(message.questionId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetUserAnswerByQuestionIdRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetUserAnswerByQuestionIdRequest,
    } as GetUserAnswerByQuestionIdRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.questionId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUserAnswerByQuestionIdRequest {
    const message = {
      ...baseGetUserAnswerByQuestionIdRequest,
    } as GetUserAnswerByQuestionIdRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.questionId !== undefined && object.questionId !== null) {
      message.questionId = Number(object.questionId);
    } else {
      message.questionId = 0;
    }
    return message;
  },

  toJSON(message: GetUserAnswerByQuestionIdRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.questionId !== undefined && (obj.questionId = message.questionId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetUserAnswerByQuestionIdRequest>
  ): GetUserAnswerByQuestionIdRequest {
    const message = {
      ...baseGetUserAnswerByQuestionIdRequest,
    } as GetUserAnswerByQuestionIdRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.questionId !== undefined && object.questionId !== null) {
      message.questionId = object.questionId;
    } else {
      message.questionId = 0;
    }
    return message;
  },
};

const baseGetQuestionGroupsByEventIdResponse: object = {};

export const GetQuestionGroupsByEventIdResponse = {
  encode(
    message: GetQuestionGroupsByEventIdResponse,
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
  ): GetQuestionGroupsByEventIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetQuestionGroupsByEventIdResponse,
    } as GetQuestionGroupsByEventIdResponse;
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

  fromJSON(object: any): GetQuestionGroupsByEventIdResponse {
    const message = {
      ...baseGetQuestionGroupsByEventIdResponse,
    } as GetQuestionGroupsByEventIdResponse;
    message.questionGroups = [];
    if (object.questionGroups !== undefined && object.questionGroups !== null) {
      for (const e of object.questionGroups) {
        message.questionGroups.push(QuestionGroup.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetQuestionGroupsByEventIdResponse): unknown {
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
    object: DeepPartial<GetQuestionGroupsByEventIdResponse>
  ): GetQuestionGroupsByEventIdResponse {
    const message = {
      ...baseGetQuestionGroupsByEventIdResponse,
    } as GetQuestionGroupsByEventIdResponse;
    message.questionGroups = [];
    if (object.questionGroups !== undefined && object.questionGroups !== null) {
      for (const e of object.questionGroups) {
        message.questionGroups.push(QuestionGroup.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetQuestionsByQuestionGroupIdResponse: object = {};

export const GetQuestionsByQuestionGroupIdResponse = {
  encode(
    message: GetQuestionsByQuestionGroupIdResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.questions) {
      Question.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetQuestionsByQuestionGroupIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetQuestionsByQuestionGroupIdResponse,
    } as GetQuestionsByQuestionGroupIdResponse;
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

  fromJSON(object: any): GetQuestionsByQuestionGroupIdResponse {
    const message = {
      ...baseGetQuestionsByQuestionGroupIdResponse,
    } as GetQuestionsByQuestionGroupIdResponse;
    message.questions = [];
    if (object.questions !== undefined && object.questions !== null) {
      for (const e of object.questions) {
        message.questions.push(Question.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetQuestionsByQuestionGroupIdResponse): unknown {
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

  fromPartial(
    object: DeepPartial<GetQuestionsByQuestionGroupIdResponse>
  ): GetQuestionsByQuestionGroupIdResponse {
    const message = {
      ...baseGetQuestionsByQuestionGroupIdResponse,
    } as GetQuestionsByQuestionGroupIdResponse;
    message.questions = [];
    if (object.questions !== undefined && object.questions !== null) {
      for (const e of object.questions) {
        message.questions.push(Question.fromPartial(e));
      }
    }
    return message;
  },
};

const baseAnswersResponse: object = {};

export const AnswersResponse = {
  encode(message: AnswersResponse, writer: Writer = Writer.create()): Writer {
    for (const v of message.answers) {
      Answer.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): AnswersResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseAnswersResponse } as AnswersResponse;
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

  fromJSON(object: any): AnswersResponse {
    const message = { ...baseAnswersResponse } as AnswersResponse;
    message.answers = [];
    if (object.answers !== undefined && object.answers !== null) {
      for (const e of object.answers) {
        message.answers.push(Answer.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: AnswersResponse): unknown {
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

  fromPartial(object: DeepPartial<AnswersResponse>): AnswersResponse {
    const message = { ...baseAnswersResponse } as AnswersResponse;
    message.answers = [];
    if (object.answers !== undefined && object.answers !== null) {
      for (const e of object.answers) {
        message.answers.push(Answer.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetEventsByUserIdRequest: object = { userId: 0 };

export const GetEventsByUserIdRequest = {
  encode(
    message: GetEventsByUserIdRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetEventsByUserIdRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetEventsByUserIdRequest,
    } as GetEventsByUserIdRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventsByUserIdRequest {
    const message = {
      ...baseGetEventsByUserIdRequest,
    } as GetEventsByUserIdRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    return message;
  },

  toJSON(message: GetEventsByUserIdRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetEventsByUserIdRequest>
  ): GetEventsByUserIdRequest {
    const message = {
      ...baseGetEventsByUserIdRequest,
    } as GetEventsByUserIdRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    return message;
  },
};

const baseGetEventsByTagIdsRequest: object = { tagIds: 0 };

export const GetEventsByTagIdsRequest = {
  encode(
    message: GetEventsByTagIdsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    writer.uint32(10).fork();
    for (const v of message.tagIds) {
      writer.int32(v);
    }
    writer.ldelim();
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetEventsByTagIdsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetEventsByTagIdsRequest,
    } as GetEventsByTagIdsRequest;
    message.tagIds = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.tagIds.push(reader.int32());
            }
          } else {
            message.tagIds.push(reader.int32());
          }
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventsByTagIdsRequest {
    const message = {
      ...baseGetEventsByTagIdsRequest,
    } as GetEventsByTagIdsRequest;
    message.tagIds = [];
    if (object.tagIds !== undefined && object.tagIds !== null) {
      for (const e of object.tagIds) {
        message.tagIds.push(Number(e));
      }
    }
    return message;
  },

  toJSON(message: GetEventsByTagIdsRequest): unknown {
    const obj: any = {};
    if (message.tagIds) {
      obj.tagIds = message.tagIds.map((e) => e);
    } else {
      obj.tagIds = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetEventsByTagIdsRequest>
  ): GetEventsByTagIdsRequest {
    const message = {
      ...baseGetEventsByTagIdsRequest,
    } as GetEventsByTagIdsRequest;
    message.tagIds = [];
    if (object.tagIds !== undefined && object.tagIds !== null) {
      for (const e of object.tagIds) {
        message.tagIds.push(e);
      }
    }
    return message;
  },
};

const baseGetUserEventsByEventIdResponse: object = {};

export const GetUserEventsByEventIdResponse = {
  encode(
    message: GetUserEventsByEventIdResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.userEvents) {
      UserEvent.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetUserEventsByEventIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetUserEventsByEventIdResponse,
    } as GetUserEventsByEventIdResponse;
    message.userEvents = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userEvents.push(UserEvent.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUserEventsByEventIdResponse {
    const message = {
      ...baseGetUserEventsByEventIdResponse,
    } as GetUserEventsByEventIdResponse;
    message.userEvents = [];
    if (object.userEvents !== undefined && object.userEvents !== null) {
      for (const e of object.userEvents) {
        message.userEvents.push(UserEvent.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetUserEventsByEventIdResponse): unknown {
    const obj: any = {};
    if (message.userEvents) {
      obj.userEvents = message.userEvents.map((e) =>
        e ? UserEvent.toJSON(e) : undefined
      );
    } else {
      obj.userEvents = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetUserEventsByEventIdResponse>
  ): GetUserEventsByEventIdResponse {
    const message = {
      ...baseGetUserEventsByEventIdResponse,
    } as GetUserEventsByEventIdResponse;
    message.userEvents = [];
    if (object.userEvents !== undefined && object.userEvents !== null) {
      for (const e of object.userEvents) {
        message.userEvents.push(UserEvent.fromPartial(e));
      }
    }
    return message;
  },
};

const baseSetRatingByUserEventIdRequest: object = { userEventId: 0, rating: 0 };

export const SetRatingByUserEventIdRequest = {
  encode(
    message: SetRatingByUserEventIdRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userEventId !== 0) {
      writer.uint32(8).int32(message.userEventId);
    }
    if (message.rating !== 0) {
      writer.uint32(16).int32(message.rating);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): SetRatingByUserEventIdRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseSetRatingByUserEventIdRequest,
    } as SetRatingByUserEventIdRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userEventId = reader.int32();
          break;
        case 2:
          message.rating = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SetRatingByUserEventIdRequest {
    const message = {
      ...baseSetRatingByUserEventIdRequest,
    } as SetRatingByUserEventIdRequest;
    if (object.userEventId !== undefined && object.userEventId !== null) {
      message.userEventId = Number(object.userEventId);
    } else {
      message.userEventId = 0;
    }
    if (object.rating !== undefined && object.rating !== null) {
      message.rating = Number(object.rating);
    } else {
      message.rating = 0;
    }
    return message;
  },

  toJSON(message: SetRatingByUserEventIdRequest): unknown {
    const obj: any = {};
    message.userEventId !== undefined &&
      (obj.userEventId = message.userEventId);
    message.rating !== undefined && (obj.rating = message.rating);
    return obj;
  },

  fromPartial(
    object: DeepPartial<SetRatingByUserEventIdRequest>
  ): SetRatingByUserEventIdRequest {
    const message = {
      ...baseSetRatingByUserEventIdRequest,
    } as SetRatingByUserEventIdRequest;
    if (object.userEventId !== undefined && object.userEventId !== null) {
      message.userEventId = object.userEventId;
    } else {
      message.userEventId = 0;
    }
    if (object.rating !== undefined && object.rating !== null) {
      message.rating = object.rating;
    } else {
      message.rating = 0;
    }
    return message;
  },
};

const baseGetPastEventsFromTagsRequest: object = {
  tagId: 0,
  numberOfEvents: 0,
};

export const GetPastEventsFromTagsRequest = {
  encode(
    message: GetPastEventsFromTagsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    writer.uint32(10).fork();
    for (const v of message.tagId) {
      writer.int32(v);
    }
    writer.ldelim();
    if (message.numberOfEvents !== 0) {
      writer.uint32(16).int32(message.numberOfEvents);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetPastEventsFromTagsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetPastEventsFromTagsRequest,
    } as GetPastEventsFromTagsRequest;
    message.tagId = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.tagId.push(reader.int32());
            }
          } else {
            message.tagId.push(reader.int32());
          }
          break;
        case 2:
          message.numberOfEvents = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetPastEventsFromTagsRequest {
    const message = {
      ...baseGetPastEventsFromTagsRequest,
    } as GetPastEventsFromTagsRequest;
    message.tagId = [];
    if (object.tagId !== undefined && object.tagId !== null) {
      for (const e of object.tagId) {
        message.tagId.push(Number(e));
      }
    }
    if (object.numberOfEvents !== undefined && object.numberOfEvents !== null) {
      message.numberOfEvents = Number(object.numberOfEvents);
    } else {
      message.numberOfEvents = 0;
    }
    return message;
  },

  toJSON(message: GetPastEventsFromTagsRequest): unknown {
    const obj: any = {};
    if (message.tagId) {
      obj.tagId = message.tagId.map((e) => e);
    } else {
      obj.tagId = [];
    }
    message.numberOfEvents !== undefined &&
      (obj.numberOfEvents = message.numberOfEvents);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetPastEventsFromTagsRequest>
  ): GetPastEventsFromTagsRequest {
    const message = {
      ...baseGetPastEventsFromTagsRequest,
    } as GetPastEventsFromTagsRequest;
    message.tagId = [];
    if (object.tagId !== undefined && object.tagId !== null) {
      for (const e of object.tagId) {
        message.tagId.push(e);
      }
    }
    if (object.numberOfEvents !== undefined && object.numberOfEvents !== null) {
      message.numberOfEvents = object.numberOfEvents;
    } else {
      message.numberOfEvents = 0;
    }
    return message;
  },
};

const baseGetOnlineEventsRequest: object = { n: 0 };

export const GetOnlineEventsRequest = {
  encode(
    message: GetOnlineEventsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.n !== 0) {
      writer.uint32(8).int32(message.n);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetOnlineEventsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetOnlineEventsRequest } as GetOnlineEventsRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.n = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetOnlineEventsRequest {
    const message = { ...baseGetOnlineEventsRequest } as GetOnlineEventsRequest;
    if (object.n !== undefined && object.n !== null) {
      message.n = Number(object.n);
    } else {
      message.n = 0;
    }
    return message;
  },

  toJSON(message: GetOnlineEventsRequest): unknown {
    const obj: any = {};
    message.n !== undefined && (obj.n = message.n);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetOnlineEventsRequest>
  ): GetOnlineEventsRequest {
    const message = { ...baseGetOnlineEventsRequest } as GetOnlineEventsRequest;
    if (object.n !== undefined && object.n !== null) {
      message.n = object.n;
    } else {
      message.n = 0;
    }
    return message;
  },
};

const baseGetOnSiteEventsRequest: object = { n: 0 };

export const GetOnSiteEventsRequest = {
  encode(
    message: GetOnSiteEventsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.n !== 0) {
      writer.uint32(8).int32(message.n);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetOnSiteEventsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetOnSiteEventsRequest } as GetOnSiteEventsRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.n = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetOnSiteEventsRequest {
    const message = { ...baseGetOnSiteEventsRequest } as GetOnSiteEventsRequest;
    if (object.n !== undefined && object.n !== null) {
      message.n = Number(object.n);
    } else {
      message.n = 0;
    }
    return message;
  },

  toJSON(message: GetOnSiteEventsRequest): unknown {
    const obj: any = {};
    message.n !== undefined && (obj.n = message.n);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetOnSiteEventsRequest>
  ): GetOnSiteEventsRequest {
    const message = { ...baseGetOnSiteEventsRequest } as GetOnSiteEventsRequest;
    if (object.n !== undefined && object.n !== null) {
      message.n = object.n;
    } else {
      message.n = 0;
    }
    return message;
  },
};

export interface ParticipantService {
  IsEventAvailable(
    request: IsEventAvailableRequest
  ): Promise<boolean | undefined>;
  JoinEvent(request: UserWithEventRequest): Promise<UserEvent>;
  CancelEvent(request: UserWithEventRequest): Promise<Event>;
  SubmitAnswersForEventQuestion(
    request: SubmitAnswerForEventQuestionRequest
  ): Promise<SubmitAnswerForEventQuestionResponse>;
  GetEventById(request: GetEventByIdRequest): Promise<Event>;
  GetAllEvents(request: Empty): Promise<EventsResponse>;
  GetTagById(request: GetObjectByIdRequest): Promise<Tag>;
  GetAllTags(request: Empty): Promise<TagsResponse>;
  GetSuggestedEvents(request: Empty): Promise<EventsResponse>;
  GetUpcomingEvents(request: GetUpcomingEventsRequest): Promise<EventsResponse>;
  GetOnlineEvents(request: GetOnlineEventsRequest): Promise<EventsResponse>;
  GetOnSiteEvents(request: GetOnSiteEventsRequest): Promise<EventsResponse>;
  GetEventsByStringOfName(request: StringInputRequest): Promise<EventsResponse>;
  GetEventsByTagIds(request: GetEventsByTagIdsRequest): Promise<EventsResponse>;
  GetEventsByOrganizationId(
    request: GetObjectByIdRequest
  ): Promise<EventsResponse>;
  GetEventsByFacilityId(request: GetObjectByIdRequest): Promise<EventsResponse>;
  GetEventsByDate(request: Date): Promise<EventsResponse>;
  GetLocationById(request: GetObjectByIdRequest): Promise<Location>;
  GetTagsByEventId(request: GetObjectByIdRequest): Promise<TagsResponse>;
  GetRatingByEventId(
    request: GetObjectByIdRequest
  ): Promise<GetRatingByEventIdResponse>;
  GetUsersByEventId(
    request: GetUsersByEventIdRequest
  ): Promise<GetUsersByEventIdResponse>;
  GetEventDurationsByEventId(
    request: GetObjectByIdRequest
  ): Promise<GetEventDurationsByEventIdResponse>;
  GetQuestionGroupsByEventId(
    request: GetObjectByIdRequest
  ): Promise<GetQuestionGroupsByEventIdResponse>;
  GetQuestionsByQuestionGroupId(
    request: GetObjectByIdRequest
  ): Promise<GetQuestionsByQuestionGroupIdResponse>;
  GetAnswersByQuestionId(
    request: GetObjectByIdRequest
  ): Promise<AnswersResponse>;
  GetAnswersByUserEventId(
    request: GetObjectByIdRequest
  ): Promise<AnswersResponse>;
  GetUserAnswerByQuestionId(
    request: GetUserAnswerByQuestionIdRequest
  ): Promise<Answer>;
  GetEventsByUserId(request: GetEventsByUserIdRequest): Promise<EventsResponse>;
  GetUserEventByUserAndEventId(
    request: UserWithEventRequest
  ): Promise<UserEvent>;
  GetUserEventsByEventId(
    request: GetObjectByIdRequest
  ): Promise<GetUserEventsByEventIdResponse>;
  GetPastEventsFromTags(
    request: GetPastEventsFromTagsRequest
  ): Promise<EventsResponse>;
  SetRatingByUserEventId(
    request: SetRatingByUserEventIdRequest
  ): Promise<UserEvent>;
  GenerateQR(request: GenerateQRRequest): Promise<GenerateQRResponse>;
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

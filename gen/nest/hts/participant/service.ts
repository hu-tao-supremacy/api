/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
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
import { Observable } from "rxjs";
import { Timestamp } from "../../google/protobuf/timestamp";
import { BoolValue } from "../../google/protobuf/wrappers";
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
  date: Timestamp | undefined;
}

export interface GetUpcomingEventsRequest {
  start: Timestamp | undefined;
  end: Timestamp | undefined;
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

export const HTS_PARTICIPANT_PACKAGE_NAME = "hts.participant";

const baseGetEventByIdRequest: object = { eventId: 0 };

export const GetEventByIdRequest = {
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
};

const baseStringInputRequest: object = { text: "" };

export const StringInputRequest = {
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
};

const baseUserWithEventRequest: object = { userId: 0, eventId: 0 };

export const UserWithEventRequest = {
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
};

const baseSubmitAnswerForEventQuestionRequest: object = {
  userEventId: 0,
  type: 0,
};

export const SubmitAnswerForEventQuestionRequest = {
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
};

const baseSubmitAnswerForEventQuestionRequest_Answer: object = {
  questionId: 0,
  value: "",
};

export const SubmitAnswerForEventQuestionRequest_Answer = {
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
};

const baseSubmitAnswerForEventQuestionResponse: object = {};

export const SubmitAnswerForEventQuestionResponse = {
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
};

const baseGenerateQRResponse: object = { data: "" };

export const GenerateQRResponse = {
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
};

const baseEventsResponse: object = {};

export const EventsResponse = {
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
};

const baseIsEventAvailableRequest: object = { eventId: 0 };

export const IsEventAvailableRequest = {
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
        message.date !== undefined
          ? fromTimestamp(message.date).toISOString()
          : null);
    return obj;
  },
};

const baseGetUpcomingEventsRequest: object = {};

export const GetUpcomingEventsRequest = {
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

const baseGenerateQRRequest: object = { userEventId: 0, userId: 0, eventId: 0 };

export const GenerateQRRequest = {
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
};

const baseTagsResponse: object = {};

export const TagsResponse = {
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
};

const baseGetUsersByEventIdRequest: object = { eventId: 0, status: 0 };

export const GetUsersByEventIdRequest = {
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
};

const baseGetUsersByEventIdResponse: object = {};

export const GetUsersByEventIdResponse = {
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
};

const baseGetRatingByEventIdResponse: object = { result: 0 };

export const GetRatingByEventIdResponse = {
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
};

const baseGetEventDurationsByEventIdResponse: object = {};

export const GetEventDurationsByEventIdResponse = {
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
};

const baseGetUserAnswerByQuestionIdRequest: object = {
  userId: 0,
  questionId: 0,
};

export const GetUserAnswerByQuestionIdRequest = {
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
};

const baseGetQuestionGroupsByEventIdResponse: object = {};

export const GetQuestionGroupsByEventIdResponse = {
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
};

const baseGetQuestionsByQuestionGroupIdResponse: object = {};

export const GetQuestionsByQuestionGroupIdResponse = {
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
};

const baseAnswersResponse: object = {};

export const AnswersResponse = {
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
};

const baseGetEventsByUserIdRequest: object = { userId: 0 };

export const GetEventsByUserIdRequest = {
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
};

const baseGetEventsByTagIdsRequest: object = { tagIds: 0 };

export const GetEventsByTagIdsRequest = {
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
};

const baseGetUserEventsByEventIdResponse: object = {};

export const GetUserEventsByEventIdResponse = {
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
};

const baseSetRatingByUserEventIdRequest: object = { userEventId: 0, rating: 0 };

export const SetRatingByUserEventIdRequest = {
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
};

const baseGetPastEventsFromTagsRequest: object = {
  tagId: 0,
  numberOfEvents: 0,
};

export const GetPastEventsFromTagsRequest = {
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
};

const baseGetOnlineEventsRequest: object = { n: 0 };

export const GetOnlineEventsRequest = {
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
};

const baseGetOnSiteEventsRequest: object = { n: 0 };

export const GetOnSiteEventsRequest = {
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
};

export interface ParticipantServiceClient {
  isEventAvailable(request: IsEventAvailableRequest): Observable<BoolValue>;

  joinEvent(request: UserWithEventRequest): Observable<UserEvent>;

  cancelEvent(request: UserWithEventRequest): Observable<Event>;

  submitAnswersForEventQuestion(
    request: SubmitAnswerForEventQuestionRequest
  ): Observable<SubmitAnswerForEventQuestionResponse>;

  getEventById(request: GetEventByIdRequest): Observable<Event>;

  getAllEvents(request: Empty): Observable<EventsResponse>;

  getTagById(request: GetObjectByIdRequest): Observable<Tag>;

  getAllTags(request: Empty): Observable<TagsResponse>;

  getSuggestedEvents(request: Empty): Observable<EventsResponse>;

  getUpcomingEvents(
    request: GetUpcomingEventsRequest
  ): Observable<EventsResponse>;

  getOnlineEvents(request: GetOnlineEventsRequest): Observable<EventsResponse>;

  getOnSiteEvents(request: GetOnSiteEventsRequest): Observable<EventsResponse>;

  getEventsByStringOfName(
    request: StringInputRequest
  ): Observable<EventsResponse>;

  getEventsByTagIds(
    request: GetEventsByTagIdsRequest
  ): Observable<EventsResponse>;

  getEventsByOrganizationId(
    request: GetObjectByIdRequest
  ): Observable<EventsResponse>;

  getEventsByFacilityId(
    request: GetObjectByIdRequest
  ): Observable<EventsResponse>;

  getEventsByDate(request: Timestamp): Observable<EventsResponse>;

  getLocationById(request: GetObjectByIdRequest): Observable<Location>;

  getTagsByEventId(request: GetObjectByIdRequest): Observable<TagsResponse>;

  getRatingByEventId(
    request: GetObjectByIdRequest
  ): Observable<GetRatingByEventIdResponse>;

  getUsersByEventId(
    request: GetUsersByEventIdRequest
  ): Observable<GetUsersByEventIdResponse>;

  getEventDurationsByEventId(
    request: GetObjectByIdRequest
  ): Observable<GetEventDurationsByEventIdResponse>;

  getQuestionGroupsByEventId(
    request: GetObjectByIdRequest
  ): Observable<GetQuestionGroupsByEventIdResponse>;

  getQuestionsByQuestionGroupId(
    request: GetObjectByIdRequest
  ): Observable<GetQuestionsByQuestionGroupIdResponse>;

  getAnswersByQuestionId(
    request: GetObjectByIdRequest
  ): Observable<AnswersResponse>;

  getAnswersByUserEventId(
    request: GetObjectByIdRequest
  ): Observable<AnswersResponse>;

  getUserAnswerByQuestionId(
    request: GetUserAnswerByQuestionIdRequest
  ): Observable<Answer>;

  getQuestionById(request: GetObjectByIdRequest): Observable<Question>;

  getEventsByUserId(
    request: GetEventsByUserIdRequest
  ): Observable<EventsResponse>;

  getUserEventByUserAndEventId(
    request: UserWithEventRequest
  ): Observable<UserEvent>;

  getUserEventsByEventId(
    request: GetObjectByIdRequest
  ): Observable<GetUserEventsByEventIdResponse>;

  getPastEventsFromTags(
    request: GetPastEventsFromTagsRequest
  ): Observable<EventsResponse>;

  setRatingByUserEventId(
    request: SetRatingByUserEventIdRequest
  ): Observable<UserEvent>;

  generateQR(request: GenerateQRRequest): Observable<GenerateQRResponse>;

  ping(request: Empty): Observable<BoolValue>;
}

export interface ParticipantServiceController {
  isEventAvailable(
    request: IsEventAvailableRequest
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  joinEvent(
    request: UserWithEventRequest
  ): Promise<UserEvent> | Observable<UserEvent> | UserEvent;

  cancelEvent(
    request: UserWithEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  submitAnswersForEventQuestion(
    request: SubmitAnswerForEventQuestionRequest
  ):
    | Promise<SubmitAnswerForEventQuestionResponse>
    | Observable<SubmitAnswerForEventQuestionResponse>
    | SubmitAnswerForEventQuestionResponse;

  getEventById(
    request: GetEventByIdRequest
  ): Promise<Event> | Observable<Event> | Event;

  getAllEvents(
    request: Empty
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getTagById(
    request: GetObjectByIdRequest
  ): Promise<Tag> | Observable<Tag> | Tag;

  getAllTags(
    request: Empty
  ): Promise<TagsResponse> | Observable<TagsResponse> | TagsResponse;

  getSuggestedEvents(
    request: Empty
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getUpcomingEvents(
    request: GetUpcomingEventsRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getOnlineEvents(
    request: GetOnlineEventsRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getOnSiteEvents(
    request: GetOnSiteEventsRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getEventsByStringOfName(
    request: StringInputRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getEventsByTagIds(
    request: GetEventsByTagIdsRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getEventsByOrganizationId(
    request: GetObjectByIdRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getEventsByFacilityId(
    request: GetObjectByIdRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getEventsByDate(
    request: Timestamp
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getLocationById(
    request: GetObjectByIdRequest
  ): Promise<Location> | Observable<Location> | Location;

  getTagsByEventId(
    request: GetObjectByIdRequest
  ): Promise<TagsResponse> | Observable<TagsResponse> | TagsResponse;

  getRatingByEventId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetRatingByEventIdResponse>
    | Observable<GetRatingByEventIdResponse>
    | GetRatingByEventIdResponse;

  getUsersByEventId(
    request: GetUsersByEventIdRequest
  ):
    | Promise<GetUsersByEventIdResponse>
    | Observable<GetUsersByEventIdResponse>
    | GetUsersByEventIdResponse;

  getEventDurationsByEventId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetEventDurationsByEventIdResponse>
    | Observable<GetEventDurationsByEventIdResponse>
    | GetEventDurationsByEventIdResponse;

  getQuestionGroupsByEventId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetQuestionGroupsByEventIdResponse>
    | Observable<GetQuestionGroupsByEventIdResponse>
    | GetQuestionGroupsByEventIdResponse;

  getQuestionsByQuestionGroupId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetQuestionsByQuestionGroupIdResponse>
    | Observable<GetQuestionsByQuestionGroupIdResponse>
    | GetQuestionsByQuestionGroupIdResponse;

  getAnswersByQuestionId(
    request: GetObjectByIdRequest
  ): Promise<AnswersResponse> | Observable<AnswersResponse> | AnswersResponse;

  getAnswersByUserEventId(
    request: GetObjectByIdRequest
  ): Promise<AnswersResponse> | Observable<AnswersResponse> | AnswersResponse;

  getUserAnswerByQuestionId(
    request: GetUserAnswerByQuestionIdRequest
  ): Promise<Answer> | Observable<Answer> | Answer;

  getQuestionById(
    request: GetObjectByIdRequest
  ): Promise<Question> | Observable<Question> | Question;

  getEventsByUserId(
    request: GetEventsByUserIdRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getUserEventByUserAndEventId(
    request: UserWithEventRequest
  ): Promise<UserEvent> | Observable<UserEvent> | UserEvent;

  getUserEventsByEventId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetUserEventsByEventIdResponse>
    | Observable<GetUserEventsByEventIdResponse>
    | GetUserEventsByEventIdResponse;

  getPastEventsFromTags(
    request: GetPastEventsFromTagsRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  setRatingByUserEventId(
    request: SetRatingByUserEventIdRequest
  ): Promise<UserEvent> | Observable<UserEvent> | UserEvent;

  generateQR(
    request: GenerateQRRequest
  ):
    | Promise<GenerateQRResponse>
    | Observable<GenerateQRResponse>
    | GenerateQRResponse;

  ping(request: Empty): Promise<BoolValue> | Observable<BoolValue> | BoolValue;
}

export function ParticipantServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "isEventAvailable",
      "joinEvent",
      "cancelEvent",
      "submitAnswersForEventQuestion",
      "getEventById",
      "getAllEvents",
      "getTagById",
      "getAllTags",
      "getSuggestedEvents",
      "getUpcomingEvents",
      "getOnlineEvents",
      "getOnSiteEvents",
      "getEventsByStringOfName",
      "getEventsByTagIds",
      "getEventsByOrganizationId",
      "getEventsByFacilityId",
      "getEventsByDate",
      "getLocationById",
      "getTagsByEventId",
      "getRatingByEventId",
      "getUsersByEventId",
      "getEventDurationsByEventId",
      "getQuestionGroupsByEventId",
      "getQuestionsByQuestionGroupId",
      "getAnswersByQuestionId",
      "getAnswersByUserEventId",
      "getUserAnswerByQuestionId",
      "getQuestionById",
      "getEventsByUserId",
      "getUserEventByUserAndEventId",
      "getUserEventsByEventId",
      "getPastEventsFromTags",
      "setRatingByUserEventId",
      "generateQR",
      "ping",
    ];
    for (const method of grpcMethods) {
      const descriptor: any = Reflect.getOwnPropertyDescriptor(
        constructor.prototype,
        method
      );
      GrpcMethod("ParticipantService", method)(
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
      GrpcStreamMethod("ParticipantService", method)(
        constructor.prototype[method],
        method,
        descriptor
      );
    }
  };
}

export const PARTICIPANT_SERVICE_NAME = "ParticipantService";

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

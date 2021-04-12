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

export interface GetAnswersByQuestionIdResponse {
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

export const HTS_PARTICIPANT_PACKAGE_NAME = "hts.participant";

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
  ): Observable<GetAnswersByQuestionIdResponse>;

  getUserAnswerByQuestionId(
    request: GetUserAnswerByQuestionIdRequest
  ): Observable<Answer>;

  getEventsByUserId(
    request: GetEventsByUserIdRequest
  ): Observable<EventsResponse>;

  getUserEventByUserAndEventId(
    request: UserWithEventRequest
  ): Observable<UserEvent>;

  getUserEventsByEventId(
    request: GetObjectByIdRequest
  ): Observable<GetUserEventsByEventIdResponse>;

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
  ):
    | Promise<GetAnswersByQuestionIdResponse>
    | Observable<GetAnswersByQuestionIdResponse>
    | GetAnswersByQuestionIdResponse;

  getUserAnswerByQuestionId(
    request: GetUserAnswerByQuestionIdRequest
  ): Promise<Answer> | Observable<Answer> | Answer;

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
      "getUserAnswerByQuestionId",
      "getEventsByUserId",
      "getUserEventByUserAndEventId",
      "getUserEventsByEventId",
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

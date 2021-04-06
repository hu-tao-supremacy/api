/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
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

export interface SubmitAnswerForPostEventQuestionRequest {
  answers: SubmitAnswerForPostEventQuestionRequest_Answer[];
  userEventId: number;
}

export interface SubmitAnswerForPostEventQuestionRequest_Answer {
  questionId: number;
  value: string;
}

export interface SubmitAnswerForPostEventQuestionResponse {
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

export interface GetApprovedUserByEventIdResponse {
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
  userId: string;
}

export interface GetUserEventByUserAndEventIdRequest {
  userId: string;
  eventId: string;
  status: UserEvent_Status;
}

export const HTS_PARTICIPANT_PACKAGE_NAME = "hts.participant";

export interface ParticipantServiceClient {
  isEventAvailable(request: IsEventAvailableRequest): Observable<BoolValue>;

  joinEvent(request: UserWithEventRequest): Observable<UserEvent>;

  cancelEvent(request: UserWithEventRequest): Observable<Event>;

  submitAnswerForPostEventQuestion(
    request: SubmitAnswerForPostEventQuestionRequest
  ): Observable<SubmitAnswerForPostEventQuestionResponse>;

  getEventById(request: GetEventByIdRequest): Observable<Event>;

  getAllEvents(request: Empty): Observable<EventsResponse>;

  getAllTags(request: Empty): Observable<TagsResponse>;

  getSuggestedEvents(request: Empty): Observable<EventsResponse>;

  getUpcomingEvents(
    request: GetUpcomingEventsRequest
  ): Observable<EventsResponse>;

  getEventsByStringOfName(
    request: StringInputRequest
  ): Observable<EventsResponse>;

  getEventsByTagId(request: GetObjectByIdRequest): Observable<EventsResponse>;

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

  getApprovedUserByEventId(
    request: GetObjectByIdRequest
  ): Observable<GetApprovedUserByEventIdResponse>;

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
    request: GetUserEventByUserAndEventIdRequest
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

  submitAnswerForPostEventQuestion(
    request: SubmitAnswerForPostEventQuestionRequest
  ):
    | Promise<SubmitAnswerForPostEventQuestionResponse>
    | Observable<SubmitAnswerForPostEventQuestionResponse>
    | SubmitAnswerForPostEventQuestionResponse;

  getEventById(
    request: GetEventByIdRequest
  ): Promise<Event> | Observable<Event> | Event;

  getAllEvents(
    request: Empty
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

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

  getEventsByTagId(
    request: GetObjectByIdRequest
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

  getApprovedUserByEventId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetApprovedUserByEventIdResponse>
    | Observable<GetApprovedUserByEventIdResponse>
    | GetApprovedUserByEventIdResponse;

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
    request: GetUserEventByUserAndEventIdRequest
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
      "submitAnswerForPostEventQuestion",
      "getEventById",
      "getAllEvents",
      "getAllTags",
      "getSuggestedEvents",
      "getUpcomingEvents",
      "getEventsByStringOfName",
      "getEventsByTagId",
      "getEventsByOrganizationId",
      "getEventsByFacilityId",
      "getEventsByDate",
      "getLocationById",
      "getTagsByEventId",
      "getRatingByEventId",
      "getApprovedUserByEventId",
      "getEventDurationsByEventId",
      "getQuestionGroupsByEventId",
      "getQuestionsByQuestionGroupId",
      "getAnswersByQuestionId",
      "getUserAnswerByQuestionId",
      "getEventsByUserId",
      "getUserEventByUserAndEventId",
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

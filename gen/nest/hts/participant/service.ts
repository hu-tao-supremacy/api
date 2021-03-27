/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import { Observable } from "rxjs";
import {
  Answer,
  Event,
  Tag,
  User,
  UserEvent,
  Location,
} from "../../hts/common/common";
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

export interface GetObjectByIdRequest {
  id: number;
}

export interface GenerateQRRequest {
  userEventId: number;
  userId: number;
  eventId: number;
}

export interface GetTagsFromEventIdResonse {
  tags: Tag[];
}

export interface GetApprovedUserFromEventIdResponse {
  users: User[];
}

export interface GetRatingFromEventIdResponse {
  result: number[];
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

  getTagsFromEventId(
    request: GetObjectByIdRequest
  ): Observable<GetTagsFromEventIdResonse>;

  getRatingFromEventId(
    request: GetObjectByIdRequest
  ): Observable<GetRatingFromEventIdResponse>;

  getApprovedUserFromEventId(
    request: GetObjectByIdRequest
  ): Observable<GetApprovedUserFromEventIdResponse>;

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

  getTagsFromEventId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetTagsFromEventIdResonse>
    | Observable<GetTagsFromEventIdResonse>
    | GetTagsFromEventIdResonse;

  getRatingFromEventId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetRatingFromEventIdResponse>
    | Observable<GetRatingFromEventIdResponse>
    | GetRatingFromEventIdResponse;

  getApprovedUserFromEventId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetApprovedUserFromEventIdResponse>
    | Observable<GetApprovedUserFromEventIdResponse>
    | GetApprovedUserFromEventIdResponse;

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
      "getSuggestedEvents",
      "getUpcomingEvents",
      "getEventsByStringOfName",
      "getEventsByTagId",
      "getEventsByOrganizationId",
      "getEventsByFacilityId",
      "getEventsByDate",
      "getLocationById",
      "getTagsFromEventId",
      "getRatingFromEventId",
      "getApprovedUserFromEventId",
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

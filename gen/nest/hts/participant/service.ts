/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import { Observable } from "rxjs";
import {
  UserEvent,
  User,
  Event,
  EventFeedback,
  Result,
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

export interface GetFeedbackForEventResponse {
  eventFeedback: EventFeedback[];
}

export interface EventsResponse {
  event: Event[];
}

export const HTS_PARTICIPANT_PACKAGE_NAME = "hts.participant";

export interface ParticipantServiceClient {
  isEventAvailable(request: Event): Observable<Result>;

  joinEvent(request: UserWithEventRequest): Observable<Result>;

  cancelEvent(request: UserWithEventRequest): Observable<Result>;

  createFeedback(request: CreateFeedbackRequest): Observable<Result>;

  hasSubmitFeedback(request: UserWithEventRequest): Observable<Result>;

  removeFeedback(request: EventFeedback): Observable<Result>;

  getFeedbackFromEvent(request: Event): Observable<GetFeedbackForEventResponse>;

  getUserFeedbackForEvent(
    request: UserWithEventRequest
  ): Observable<EventsResponse>;

  searchEventsByName(request: StringInputRequest): Observable<EventsResponse>;

  searchEventsByTag(request: StringInputRequest): Observable<EventsResponse>;

  generateQR(request: UserEvent): Observable<GenerateQRResponse>;

  getEvent(request: GetEventRequest): Observable<Event>;

  getSuggestedEvents(request: Empty): Observable<EventsResponse>;

  getAllEvents(request: Empty): Observable<EventsResponse>;

  ping(request: Empty): Observable<Result>;
}

export interface ParticipantServiceController {
  isEventAvailable(
    request: Event
  ): Promise<Result> | Observable<Result> | Result;

  joinEvent(
    request: UserWithEventRequest
  ): Promise<Result> | Observable<Result> | Result;

  cancelEvent(
    request: UserWithEventRequest
  ): Promise<Result> | Observable<Result> | Result;

  createFeedback(
    request: CreateFeedbackRequest
  ): Promise<Result> | Observable<Result> | Result;

  hasSubmitFeedback(
    request: UserWithEventRequest
  ): Promise<Result> | Observable<Result> | Result;

  removeFeedback(
    request: EventFeedback
  ): Promise<Result> | Observable<Result> | Result;

  getFeedbackFromEvent(
    request: Event
  ):
    | Promise<GetFeedbackForEventResponse>
    | Observable<GetFeedbackForEventResponse>
    | GetFeedbackForEventResponse;

  getUserFeedbackForEvent(
    request: UserWithEventRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  searchEventsByName(
    request: StringInputRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  searchEventsByTag(
    request: StringInputRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  generateQR(
    request: UserEvent
  ):
    | Promise<GenerateQRResponse>
    | Observable<GenerateQRResponse>
    | GenerateQRResponse;

  getEvent(
    request: GetEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  getSuggestedEvents(
    request: Empty
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getAllEvents(
    request: Empty
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  ping(request: Empty): Promise<Result> | Observable<Result> | Result;
}

export function ParticipantServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods = [
      "isEventAvailable",
      "joinEvent",
      "cancelEvent",
      "createFeedback",
      "hasSubmitFeedback",
      "removeFeedback",
      "getFeedbackFromEvent",
      "getUserFeedbackForEvent",
      "searchEventsByName",
      "searchEventsByTag",
      "generateQR",
      "getEvent",
      "getSuggestedEvents",
      "getAllEvents",
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
    const grpcStreamMethods = [];
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

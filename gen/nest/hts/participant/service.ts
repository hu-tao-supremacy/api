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
import { Timestamp } from "../../google/protobuf/timestamp";
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
  date: Timestamp | undefined;
}

export const HTS_PARTICIPANT_PACKAGE_NAME = "hts.participant";

export interface ParticipantServiceClient {
  isEventAvailable(request: IsEventAvailableRequest): Observable<Result>;

  joinEvent(request: UserWithEventRequest): Observable<Event>;

  cancelEvent(request: UserWithEventRequest): Observable<Event>;

  createFeedback(request: CreateFeedbackRequest): Observable<EventFeedback>;

  hasSubmitFeedback(request: UserWithEventRequest): Observable<EventFeedback>;

  removeFeedback(request: EventFeedback): Observable<EventFeedback>;

  getFeedbacksFromEvent(
    request: Event
  ): Observable<GetFeedbacksFromEventResponse>;

  getUserFeedbackFromEvent(
    request: UserWithEventRequest
  ): Observable<EventFeedback>;

  getEvent(request: GetEventRequest): Observable<Event>;

  getAllEvents(request: Empty): Observable<EventsResponse>;

  getSuggestedEvents(request: Empty): Observable<EventsResponse>;

  getEventsByNameString(
    request: StringInputRequest
  ): Observable<EventsResponse>;

  getEventsByTagString(request: StringInputRequest): Observable<EventsResponse>;

  getEventsByFacilityString(
    request: StringInputRequest
  ): Observable<EventsResponse>;

  getEventsByOrganizationString(
    request: StringInputRequest
  ): Observable<EventsResponse>;

  getEventsByDate(request: StringInputRequest): Observable<EventsResponse>;

  generateQR(request: UserEvent): Observable<GenerateQRResponse>;

  ping(request: Empty): Observable<Result>;
}

export interface ParticipantServiceController {
  isEventAvailable(
    request: IsEventAvailableRequest
  ): Promise<Result> | Observable<Result> | Result;

  joinEvent(
    request: UserWithEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  cancelEvent(
    request: UserWithEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  createFeedback(
    request: CreateFeedbackRequest
  ): Promise<EventFeedback> | Observable<EventFeedback> | EventFeedback;

  hasSubmitFeedback(
    request: UserWithEventRequest
  ): Promise<EventFeedback> | Observable<EventFeedback> | EventFeedback;

  removeFeedback(
    request: EventFeedback
  ): Promise<EventFeedback> | Observable<EventFeedback> | EventFeedback;

  getFeedbacksFromEvent(
    request: Event
  ):
    | Promise<GetFeedbacksFromEventResponse>
    | Observable<GetFeedbacksFromEventResponse>
    | GetFeedbacksFromEventResponse;

  getUserFeedbackFromEvent(
    request: UserWithEventRequest
  ): Promise<EventFeedback> | Observable<EventFeedback> | EventFeedback;

  getEvent(
    request: GetEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  getAllEvents(
    request: Empty
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getSuggestedEvents(
    request: Empty
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getEventsByNameString(
    request: StringInputRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getEventsByTagString(
    request: StringInputRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getEventsByFacilityString(
    request: StringInputRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getEventsByOrganizationString(
    request: StringInputRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  getEventsByDate(
    request: StringInputRequest
  ): Promise<EventsResponse> | Observable<EventsResponse> | EventsResponse;

  generateQR(
    request: UserEvent
  ):
    | Promise<GenerateQRResponse>
    | Observable<GenerateQRResponse>
    | GenerateQRResponse;

  ping(request: Empty): Promise<Result> | Observable<Result> | Result;
}

export function ParticipantServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "isEventAvailable",
      "joinEvent",
      "cancelEvent",
      "createFeedback",
      "hasSubmitFeedback",
      "removeFeedback",
      "getFeedbacksFromEvent",
      "getUserFeedbackFromEvent",
      "getEvent",
      "getAllEvents",
      "getSuggestedEvents",
      "getEventsByNameString",
      "getEventsByTagString",
      "getEventsByFacilityString",
      "getEventsByOrganizationString",
      "getEventsByDate",
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

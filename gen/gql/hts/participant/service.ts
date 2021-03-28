/* eslint-disable */
import {
  Answer,
  Event,
  Tag,
  User,
  UserEvent,
  Location,
  GetObjectByIdRequest,
} from "../../hts/common/common";
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

export interface GetTagsFromEventIdResonse {
  tags: Tag[];
}

export interface GetApprovedUserFromEventIdResponse {
  users: User[];
}

export interface GetRatingFromEventIdResponse {
  result: number[];
}

export interface ParticipantService {
  IsEventAvailable(
    request: IsEventAvailableRequest
  ): Promise<boolean | undefined>;
  JoinEvent(request: UserWithEventRequest): Promise<UserEvent>;
  CancelEvent(request: UserWithEventRequest): Promise<Event>;
  SubmitAnswerForPostEventQuestion(
    request: SubmitAnswerForPostEventQuestionRequest
  ): Promise<SubmitAnswerForPostEventQuestionResponse>;
  GetEventById(request: GetEventByIdRequest): Promise<Event>;
  GetAllEvents(request: Empty): Promise<EventsResponse>;
  GetSuggestedEvents(request: Empty): Promise<EventsResponse>;
  GetUpcomingEvents(request: GetUpcomingEventsRequest): Promise<EventsResponse>;
  GetEventsByStringOfName(request: StringInputRequest): Promise<EventsResponse>;
  GetEventsByTagId(request: GetObjectByIdRequest): Promise<EventsResponse>;
  GetEventsByOrganizationId(
    request: GetObjectByIdRequest
  ): Promise<EventsResponse>;
  GetEventsByFacilityId(request: GetObjectByIdRequest): Promise<EventsResponse>;
  GetEventsByDate(request: Date): Promise<EventsResponse>;
  GetLocationById(request: GetObjectByIdRequest): Promise<Location>;
  GetTagsFromEventId(
    request: GetObjectByIdRequest
  ): Promise<GetTagsFromEventIdResonse>;
  GetRatingFromEventId(
    request: GetObjectByIdRequest
  ): Promise<GetRatingFromEventIdResponse>;
  GetApprovedUserFromEventId(
    request: GetObjectByIdRequest
  ): Promise<GetApprovedUserFromEventIdResponse>;
  GenerateQR(request: GenerateQRRequest): Promise<GenerateQRResponse>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

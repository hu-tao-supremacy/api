/* eslint-disable */
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
  GetAllTags(request: Empty): Promise<TagsResponse>;
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
  GetTagsByEventId(request: GetObjectByIdRequest): Promise<TagsResponse>;
  GetRatingByEventId(
    request: GetObjectByIdRequest
  ): Promise<GetRatingByEventIdResponse>;
  GetApprovedUserByEventId(
    request: GetObjectByIdRequest
  ): Promise<GetApprovedUserByEventIdResponse>;
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
  ): Promise<GetAnswersByQuestionIdResponse>;
  GetUserAnswerByQuestionId(
    request: GetUserAnswerByQuestionIdRequest
  ): Promise<Answer>;
  GetEventsByUserId(request: GetEventsByUserIdRequest): Promise<EventsResponse>;
  GetUserEventByUserAndEventId(
    request: GetUserEventByUserAndEventIdRequest
  ): Promise<UserEvent>;
  GenerateQR(request: GenerateQRRequest): Promise<GenerateQRResponse>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

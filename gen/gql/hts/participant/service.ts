/* eslint-disable */
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

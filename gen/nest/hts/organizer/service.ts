/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
  UserEvent_Status,
  Organization,
  Event,
  Tag,
  QuestionGroup,
  Question,
  Location,
  User,
  UserOrganization,
  EventDuration,
  EventTag,
  Answer,
  UserEvent,
  GetObjectByIdRequest,
  GetObjectByNameRequest,
} from "../../hts/common/common";
import { Observable } from "rxjs";
import { Timestamp } from "../../google/protobuf/timestamp";
import { BoolValue } from "../../google/protobuf/wrappers";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.organizer";

export interface Duration {
  start: Timestamp | undefined;
  finish: Timestamp | undefined;
}

export interface CreateOrganizationRequest {
  userId: number;
  organization: Organization | undefined;
}

export interface UpdateOrganizationRequest {
  userId: number;
  organization: Organization | undefined;
}

export interface RemoveOrganizationRequest {
  userId: number;
  organizationId: number;
}

export interface UpdateUsersInOrganizationRequest {
  userId: number;
  userIds: number[];
  organizationId: number;
}

export interface CreateEventRequest {
  userId: number;
  event: Event | undefined;
}

export interface UpdateEventRequest {
  userId: number;
  event: Event | undefined;
}

export interface UpdateEventDurationRequest {
  userId: number;
  eventId: number;
  duration: Duration[];
}

export interface RemoveEventRequest {
  userId: number;
  eventId: number;
}

export interface UpdateRegistrationRequestRequest {
  userId: number;
  registeredUserId: number;
  registeredEventId: number;
  status: UserEvent_Status;
}

export interface CreateTagRequest {
  userId: number;
  organizationId: number;
  tag: Tag | undefined;
}

export interface UpdateTagRequest {
  userId: number;
  tagIds: number[];
  eventId: number;
}

export interface HasEventRequest {
  organizationId: number;
  eventId: number;
}

export interface AddQuestionGroupsRequest {
  userId: number;
  questionGroups: QuestionGroup[];
}

export interface RemoveQuestionGroupsRequest {
  userId: number;
  questionGroupIds: number[];
}

export interface AddQuestionsRequest {
  userId: number;
  questions: Question[];
}

export interface RemoveQuestionsRequest {
  userId: number;
  questionIds: number[];
}

export interface CreateLocationRequest {
  userId: number;
  location: Location | undefined;
}

export interface UpdateLocationRequest {
  userId: number;
  location: Location | undefined;
}

export interface RemoveLocationRequest {
  userId: number;
  locationId: number;
}

export interface GenerateTicketRequest {
  userId: number;
  eventId: number;
}

export interface OrganizationListResponse {
  organizations: Organization[];
}

export interface UserListResponse {
  users: User[];
}

export interface UserOrganizationListResponse {
  userOrganizations: UserOrganization[];
}

export interface EventDurationListResponse {
  eventDurations: EventDuration[];
}

export interface EventTagListResponse {
  eventTags: EventTag[];
}

export interface QuestionGroupListResponse {
  questionGroups: QuestionGroup[];
}

export interface QuestionListResponse {
  questions: Question[];
}

export interface AnswerListResponse {
  answers: Answer[];
}

export interface LocationListResponse {
  locations: Location[];
}

export const HTS_ORGANIZER_PACKAGE_NAME = "hts.organizer";

export interface OrganizerServiceClient {
  createOrganization(
    request: CreateOrganizationRequest
  ): Observable<Organization>;

  getOrganizations(request: Empty): Observable<OrganizationListResponse>;

  getOrganizationById(request: GetObjectByIdRequest): Observable<Organization>;

  getUsersInOrganizationById(
    request: GetObjectByIdRequest
  ): Observable<UserListResponse>;

  updateOrganization(
    request: UpdateOrganizationRequest
  ): Observable<Organization>;

  removeOrganization(
    request: RemoveOrganizationRequest
  ): Observable<Organization>;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<UserOrganizationListResponse>;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<UserOrganizationListResponse>;

  createEvent(request: CreateEventRequest): Observable<Event>;

  updateEvent(request: UpdateEventRequest): Observable<Event>;

  updateEventDurations(
    request: UpdateEventDurationRequest
  ): Observable<EventDurationListResponse>;

  removeEvent(request: RemoveEventRequest): Observable<Event>;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Observable<UserEvent>;

  createTag(request: CreateTagRequest): Observable<Tag>;

  addTags(request: UpdateTagRequest): Observable<EventTagListResponse>;

  removeTags(request: UpdateTagRequest): Observable<EventTagListResponse>;

  hasEvent(request: HasEventRequest): Observable<Event>;

  addQuestionGroups(
    request: AddQuestionGroupsRequest
  ): Observable<QuestionGroupListResponse>;

  removeQuestionGroups(
    request: RemoveQuestionGroupsRequest
  ): Observable<QuestionGroupListResponse>;

  addQuestions(request: AddQuestionsRequest): Observable<QuestionListResponse>;

  removeQuestions(
    request: RemoveQuestionsRequest
  ): Observable<QuestionListResponse>;

  getAnswersByQuestionId(
    request: GetObjectByIdRequest
  ): Observable<AnswerListResponse>;

  createLocation(request: CreateLocationRequest): Observable<Location>;

  getLocations(request: Empty): Observable<LocationListResponse>;

  getLocationById(request: GetObjectByIdRequest): Observable<Location>;

  searchLocationsByName(
    request: GetObjectByNameRequest
  ): Observable<LocationListResponse>;

  updateLocation(request: UpdateLocationRequest): Observable<Location>;

  removeLocation(request: RemoveLocationRequest): Observable<Location>;

  generateTicket(request: GenerateTicketRequest): Observable<UserEvent>;

  ping(request: Empty): Observable<BoolValue>;
}

export interface OrganizerServiceController {
  createOrganization(
    request: CreateOrganizationRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  getOrganizations(
    request: Empty
  ):
    | Promise<OrganizationListResponse>
    | Observable<OrganizationListResponse>
    | OrganizationListResponse;

  getOrganizationById(
    request: GetObjectByIdRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  getUsersInOrganizationById(
    request: GetObjectByIdRequest
  ):
    | Promise<UserListResponse>
    | Observable<UserListResponse>
    | UserListResponse;

  updateOrganization(
    request: UpdateOrganizationRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  removeOrganization(
    request: RemoveOrganizationRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ):
    | Promise<UserOrganizationListResponse>
    | Observable<UserOrganizationListResponse>
    | UserOrganizationListResponse;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ):
    | Promise<UserOrganizationListResponse>
    | Observable<UserOrganizationListResponse>
    | UserOrganizationListResponse;

  createEvent(
    request: CreateEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  updateEvent(
    request: UpdateEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  updateEventDurations(
    request: UpdateEventDurationRequest
  ):
    | Promise<EventDurationListResponse>
    | Observable<EventDurationListResponse>
    | EventDurationListResponse;

  removeEvent(
    request: RemoveEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<UserEvent> | Observable<UserEvent> | UserEvent;

  createTag(request: CreateTagRequest): Promise<Tag> | Observable<Tag> | Tag;

  addTags(
    request: UpdateTagRequest
  ):
    | Promise<EventTagListResponse>
    | Observable<EventTagListResponse>
    | EventTagListResponse;

  removeTags(
    request: UpdateTagRequest
  ):
    | Promise<EventTagListResponse>
    | Observable<EventTagListResponse>
    | EventTagListResponse;

  hasEvent(
    request: HasEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  addQuestionGroups(
    request: AddQuestionGroupsRequest
  ):
    | Promise<QuestionGroupListResponse>
    | Observable<QuestionGroupListResponse>
    | QuestionGroupListResponse;

  removeQuestionGroups(
    request: RemoveQuestionGroupsRequest
  ):
    | Promise<QuestionGroupListResponse>
    | Observable<QuestionGroupListResponse>
    | QuestionGroupListResponse;

  addQuestions(
    request: AddQuestionsRequest
  ):
    | Promise<QuestionListResponse>
    | Observable<QuestionListResponse>
    | QuestionListResponse;

  removeQuestions(
    request: RemoveQuestionsRequest
  ):
    | Promise<QuestionListResponse>
    | Observable<QuestionListResponse>
    | QuestionListResponse;

  getAnswersByQuestionId(
    request: GetObjectByIdRequest
  ):
    | Promise<AnswerListResponse>
    | Observable<AnswerListResponse>
    | AnswerListResponse;

  createLocation(
    request: CreateLocationRequest
  ): Promise<Location> | Observable<Location> | Location;

  getLocations(
    request: Empty
  ):
    | Promise<LocationListResponse>
    | Observable<LocationListResponse>
    | LocationListResponse;

  getLocationById(
    request: GetObjectByIdRequest
  ): Promise<Location> | Observable<Location> | Location;

  searchLocationsByName(
    request: GetObjectByNameRequest
  ):
    | Promise<LocationListResponse>
    | Observable<LocationListResponse>
    | LocationListResponse;

  updateLocation(
    request: UpdateLocationRequest
  ): Promise<Location> | Observable<Location> | Location;

  removeLocation(
    request: RemoveLocationRequest
  ): Promise<Location> | Observable<Location> | Location;

  generateTicket(
    request: GenerateTicketRequest
  ): Promise<UserEvent> | Observable<UserEvent> | UserEvent;

  ping(request: Empty): Promise<BoolValue> | Observable<BoolValue> | BoolValue;
}

export function OrganizerServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "createOrganization",
      "getOrganizations",
      "getOrganizationById",
      "getUsersInOrganizationById",
      "updateOrganization",
      "removeOrganization",
      "addUsersToOrganization",
      "removeUsersFromOrganization",
      "createEvent",
      "updateEvent",
      "updateEventDurations",
      "removeEvent",
      "updateRegistrationRequest",
      "createTag",
      "addTags",
      "removeTags",
      "hasEvent",
      "addQuestionGroups",
      "removeQuestionGroups",
      "addQuestions",
      "removeQuestions",
      "getAnswersByQuestionId",
      "createLocation",
      "getLocations",
      "getLocationById",
      "searchLocationsByName",
      "updateLocation",
      "removeLocation",
      "generateTicket",
      "ping",
    ];
    for (const method of grpcMethods) {
      const descriptor: any = Reflect.getOwnPropertyDescriptor(
        constructor.prototype,
        method
      );
      GrpcMethod("OrganizerService", method)(
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
      GrpcStreamMethod("OrganizerService", method)(
        constructor.prototype[method],
        method,
        descriptor
      );
    }
  };
}

export const ORGANIZER_SERVICE_NAME = "OrganizerService";

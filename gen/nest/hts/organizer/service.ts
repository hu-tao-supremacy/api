/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
  UserEvent_Status,
  Organization,
  Event,
  Tag,
  QuestionGroup,
  Question,
  UserOrganization,
  EventDuration,
  UserEvent,
  GetObjectByIdRequest,
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

export interface OrganizationListResponse {
  organizations: Organization[];
}

export interface UserOrganizationListResponse {
  userOrganizations: UserOrganization[];
}

export interface EventDurationListResponse {
  eventDurations: EventDuration[];
}

export interface TagListResponse {
  tags: Tag[];
}

export interface QuestionGroupListResponse {
  questionGroups: QuestionGroup[];
}

export interface QuestionListResponse {
  questions: Question[];
}

export const HTS_ORGANIZER_PACKAGE_NAME = "hts.organizer";

export interface OrganizerServiceClient {
  createOrganization(
    request: CreateOrganizationRequest
  ): Observable<Organization>;

  getOrganizations(request: Empty): Observable<OrganizationListResponse>;

  getOrganizationById(request: GetObjectByIdRequest): Observable<Organization>;

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

  addTags(request: UpdateTagRequest): Observable<TagListResponse>;

  removeTags(request: UpdateTagRequest): Observable<TagListResponse>;

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
  ): Promise<TagListResponse> | Observable<TagListResponse> | TagListResponse;

  removeTags(
    request: UpdateTagRequest
  ): Promise<TagListResponse> | Observable<TagListResponse> | TagListResponse;

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

  ping(request: Empty): Promise<BoolValue> | Observable<BoolValue> | BoolValue;
}

export function OrganizerServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "createOrganization",
      "getOrganizations",
      "getOrganizationById",
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

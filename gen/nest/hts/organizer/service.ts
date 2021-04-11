/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
  UserEvent_Status,
  Organization,
  Event,
  Tag,
  QuestionGroup,
  Question,
  UserEvent,
  GetObjectByIdRequest,
} from "../../hts/common/common";
import { Observable } from "rxjs";
import { Timestamp } from "../../google/protobuf/timestamp";
import { Empty } from "../../google/protobuf/empty";
import { BoolValue } from "../../google/protobuf/wrappers";

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

export interface IdsResponse {
  ids: number[];
}

export interface GetOrganizationsResponse {
  organizations: Organization[];
}

export const HTS_ORGANIZER_PACKAGE_NAME = "hts.organizer";

export interface OrganizerServiceClient {
  createOrganization(
    request: CreateOrganizationRequest
  ): Observable<Organization>;

  getOrganizations(request: Empty): Observable<GetOrganizationsResponse>;

  getOrganizationById(request: GetObjectByIdRequest): Observable<Organization>;

  updateOrganization(
    request: UpdateOrganizationRequest
  ): Observable<Organization>;

  removeOrganization(
    request: RemoveOrganizationRequest
  ): Observable<Organization>;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<Empty>;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<Empty>;

  createEvent(request: CreateEventRequest): Observable<Event>;

  updateEvent(request: UpdateEventRequest): Observable<Event>;

  updateEventDurations(
    request: UpdateEventDurationRequest
  ): Observable<IdsResponse>;

  removeEvent(request: RemoveEventRequest): Observable<Event>;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Observable<UserEvent>;

  createTag(request: CreateTagRequest): Observable<Tag>;

  addTags(request: UpdateTagRequest): Observable<IdsResponse>;

  removeTags(request: UpdateTagRequest): Observable<IdsResponse>;

  hasEvent(request: HasEventRequest): Observable<Event>;

  addQuestionGroups(request: AddQuestionGroupsRequest): Observable<IdsResponse>;

  removeQuestionGroups(
    request: RemoveQuestionGroupsRequest
  ): Observable<IdsResponse>;

  addQuestions(request: AddQuestionsRequest): Observable<IdsResponse>;

  removeQuestions(request: RemoveQuestionsRequest): Observable<IdsResponse>;

  ping(request: Empty): Observable<BoolValue>;
}

export interface OrganizerServiceController {
  createOrganization(
    request: CreateOrganizationRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  getOrganizations(
    request: Empty
  ):
    | Promise<GetOrganizationsResponse>
    | Observable<GetOrganizationsResponse>
    | GetOrganizationsResponse;

  getOrganizationById(
    request: GetObjectByIdRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  updateOrganization(
    request: UpdateOrganizationRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  removeOrganization(
    request: RemoveOrganizationRequest
  ): Promise<Organization> | Observable<Organization> | Organization;

  addUsersToOrganization(request: UpdateUsersInOrganizationRequest): void;

  removeUsersFromOrganization(request: UpdateUsersInOrganizationRequest): void;

  createEvent(
    request: CreateEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  updateEvent(
    request: UpdateEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  updateEventDurations(
    request: UpdateEventDurationRequest
  ): Promise<IdsResponse> | Observable<IdsResponse> | IdsResponse;

  removeEvent(
    request: RemoveEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<UserEvent> | Observable<UserEvent> | UserEvent;

  createTag(request: CreateTagRequest): Promise<Tag> | Observable<Tag> | Tag;

  addTags(
    request: UpdateTagRequest
  ): Promise<IdsResponse> | Observable<IdsResponse> | IdsResponse;

  removeTags(
    request: UpdateTagRequest
  ): Promise<IdsResponse> | Observable<IdsResponse> | IdsResponse;

  hasEvent(
    request: HasEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  addQuestionGroups(
    request: AddQuestionGroupsRequest
  ): Promise<IdsResponse> | Observable<IdsResponse> | IdsResponse;

  removeQuestionGroups(
    request: RemoveQuestionGroupsRequest
  ): Promise<IdsResponse> | Observable<IdsResponse> | IdsResponse;

  addQuestions(
    request: AddQuestionsRequest
  ): Promise<IdsResponse> | Observable<IdsResponse> | IdsResponse;

  removeQuestions(
    request: RemoveQuestionsRequest
  ): Promise<IdsResponse> | Observable<IdsResponse> | IdsResponse;

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

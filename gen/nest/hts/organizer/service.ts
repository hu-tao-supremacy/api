/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
  Status,
  Organization,
  Event,
  Tag,
  QuestionGroup,
  Question,
} from "../../hts/common/common";
import { Observable } from "rxjs";
import { Timestamp } from "../../google/protobuf/timestamp";
import { Empty } from "../../google/protobuf/empty";
import { BoolValue } from "../../google/protobuf/wrappers";

export const protobufPackage = "hts.organizer";

export interface GetByIdRequest {
  id: number;
}

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
  status: Status;
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

export interface QuestionGroupsRequest {
  questionGroups: QuestionGroup[];
}

export interface QuestionsRequest {
  questions: Question[];
}

export interface GetOrganizationsResponse {
  organizations: Organization[];
}

export interface GetOrganizationByIdResponse {
  organization: Organization | undefined;
}

export interface GetTagsResponse {
  tags: Tag[];
}

export interface GetTagByIdResponse {
  tag: Tag | undefined;
}

export interface GetQuestionGroupsByEventIdResponse {
  questionGroup: QuestionGroup[];
}

export interface GetQuestionsByGroupIdResponse {
  question: Question[];
}

export const HTS_ORGANIZER_PACKAGE_NAME = "hts.organizer";

export interface OrganizerServiceClient {
  createOrganization(request: CreateOrganizationRequest): Observable<Empty>;

  getOrganizations(request: Empty): Observable<GetOrganizationsResponse>;

  getOrganizationById(
    request: GetByIdRequest
  ): Observable<GetOrganizationByIdResponse>;

  updateOrganization(request: UpdateOrganizationRequest): Observable<Empty>;

  removeOrganization(request: RemoveOrganizationRequest): Observable<Empty>;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<Empty>;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<Empty>;

  createEvent(request: CreateEventRequest): Observable<Empty>;

  updateEvent(request: UpdateEventRequest): Observable<Empty>;

  updateEventDurations(request: UpdateEventDurationRequest): Observable<Empty>;

  removeEvent(request: RemoveEventRequest): Observable<Empty>;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Observable<Empty>;

  createTag(request: CreateTagRequest): Observable<Empty>;

  addTags(request: UpdateTagRequest): Observable<Empty>;

  removeTags(request: UpdateTagRequest): Observable<Empty>;

  getTags(request: Empty): Observable<GetTagsResponse>;

  getTagById(request: GetByIdRequest): Observable<GetTagByIdResponse>;

  hasEvent(request: HasEventRequest): Observable<Event>;

  getQuestionGroupsByEventId(
    request: GetByIdRequest
  ): Observable<GetQuestionGroupsByEventIdResponse>;

  addQuestionGroups(request: QuestionGroupsRequest): Observable<Empty>;

  removeQuestionGroups(request: QuestionGroupsRequest): Observable<Empty>;

  getQuestionsByGroupId(
    request: GetByIdRequest
  ): Observable<GetQuestionsByGroupIdResponse>;

  addQuestions(request: QuestionsRequest): Observable<Empty>;

  removeQuestions(request: QuestionsRequest): Observable<Empty>;

  ping(request: Empty): Observable<BoolValue>;
}

export interface OrganizerServiceController {
  createOrganization(request: CreateOrganizationRequest): void;

  getOrganizations(
    request: Empty
  ):
    | Promise<GetOrganizationsResponse>
    | Observable<GetOrganizationsResponse>
    | GetOrganizationsResponse;

  getOrganizationById(
    request: GetByIdRequest
  ):
    | Promise<GetOrganizationByIdResponse>
    | Observable<GetOrganizationByIdResponse>
    | GetOrganizationByIdResponse;

  updateOrganization(request: UpdateOrganizationRequest): void;

  removeOrganization(request: RemoveOrganizationRequest): void;

  addUsersToOrganization(request: UpdateUsersInOrganizationRequest): void;

  removeUsersFromOrganization(request: UpdateUsersInOrganizationRequest): void;

  createEvent(request: CreateEventRequest): void;

  updateEvent(request: UpdateEventRequest): void;

  updateEventDurations(request: UpdateEventDurationRequest): void;

  removeEvent(request: RemoveEventRequest): void;

  updateRegistrationRequest(request: UpdateRegistrationRequestRequest): void;

  createTag(request: CreateTagRequest): void;

  addTags(request: UpdateTagRequest): void;

  removeTags(request: UpdateTagRequest): void;

  getTags(
    request: Empty
  ): Promise<GetTagsResponse> | Observable<GetTagsResponse> | GetTagsResponse;

  getTagById(
    request: GetByIdRequest
  ):
    | Promise<GetTagByIdResponse>
    | Observable<GetTagByIdResponse>
    | GetTagByIdResponse;

  hasEvent(
    request: HasEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  getQuestionGroupsByEventId(
    request: GetByIdRequest
  ):
    | Promise<GetQuestionGroupsByEventIdResponse>
    | Observable<GetQuestionGroupsByEventIdResponse>
    | GetQuestionGroupsByEventIdResponse;

  addQuestionGroups(request: QuestionGroupsRequest): void;

  removeQuestionGroups(request: QuestionGroupsRequest): void;

  getQuestionsByGroupId(
    request: GetByIdRequest
  ):
    | Promise<GetQuestionsByGroupIdResponse>
    | Observable<GetQuestionsByGroupIdResponse>
    | GetQuestionsByGroupIdResponse;

  addQuestions(request: QuestionsRequest): void;

  removeQuestions(request: QuestionsRequest): void;

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
      "getTags",
      "getTagById",
      "hasEvent",
      "getQuestionGroupsByEventId",
      "addQuestionGroups",
      "removeQuestionGroups",
      "getQuestionsByGroupId",
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

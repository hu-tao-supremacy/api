/* eslint-disable */
import {
  UserEvent_Status,
  Organization,
  Event,
  Tag,
  QuestionGroup,
  Question,
  User,
  UserOrganization,
  EventDuration,
  EventTag,
  Answer,
  UserEvent,
  GetObjectByIdRequest,
} from "../../hts/common/common";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.organizer";

export interface Duration {
  start: Date | undefined;
  finish: Date | undefined;
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

export interface OrganizerService {
  CreateOrganization(request: CreateOrganizationRequest): Promise<Organization>;
  GetOrganizations(request: Empty): Promise<OrganizationListResponse>;
  GetOrganizationById(request: GetObjectByIdRequest): Promise<Organization>;
  GetUsersInOrganizationById(
    request: GetObjectByIdRequest
  ): Promise<UserListResponse>;
  UpdateOrganization(request: UpdateOrganizationRequest): Promise<Organization>;
  RemoveOrganization(request: RemoveOrganizationRequest): Promise<Organization>;
  AddUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<UserOrganizationListResponse>;
  RemoveUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<UserOrganizationListResponse>;
  CreateEvent(request: CreateEventRequest): Promise<Event>;
  UpdateEvent(request: UpdateEventRequest): Promise<Event>;
  UpdateEventDurations(
    request: UpdateEventDurationRequest
  ): Promise<EventDurationListResponse>;
  RemoveEvent(request: RemoveEventRequest): Promise<Event>;
  UpdateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<UserEvent>;
  CreateTag(request: CreateTagRequest): Promise<Tag>;
  AddTags(request: UpdateTagRequest): Promise<EventTagListResponse>;
  RemoveTags(request: UpdateTagRequest): Promise<EventTagListResponse>;
  HasEvent(request: HasEventRequest): Promise<Event>;
  AddQuestionGroups(
    request: AddQuestionGroupsRequest
  ): Promise<QuestionGroupListResponse>;
  RemoveQuestionGroups(
    request: RemoveQuestionGroupsRequest
  ): Promise<QuestionGroupListResponse>;
  AddQuestions(request: AddQuestionsRequest): Promise<QuestionListResponse>;
  RemoveQuestions(
    request: RemoveQuestionsRequest
  ): Promise<QuestionListResponse>;
  GetAnswersByQuestionId(
    request: GetObjectByIdRequest
  ): Promise<AnswerListResponse>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

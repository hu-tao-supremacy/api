/* eslint-disable */
import {
  Status,
  Organization,
  Event,
  Tag,
  QuestionGroup,
  Question,
} from "../../hts/common/common";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.organizer";

export interface GetByIdRequest {
  id: number;
}

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
  questionGroup: QuestionGroup | undefined;
}

export interface GetQuestionsByGroupIdResponse {
  question: Question | undefined;
}

export interface OrganizerService {
  CreateOrganization(request: CreateOrganizationRequest): Promise<Empty>;
  GetOrganizations(request: Empty): Promise<GetOrganizationsResponse>;
  GetOrganizationById(
    request: GetByIdRequest
  ): Promise<GetOrganizationByIdResponse>;
  UpdateOrganization(request: UpdateOrganizationRequest): Promise<Empty>;
  RemoveOrganization(request: RemoveOrganizationRequest): Promise<Empty>;
  AddUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Empty>;
  RemoveUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Empty>;
  CreateEvent(request: CreateEventRequest): Promise<Empty>;
  UpdateEvent(request: UpdateEventRequest): Promise<Empty>;
  UpdateEventDurations(request: UpdateEventDurationRequest): Promise<Empty>;
  RemoveEvent(request: RemoveEventRequest): Promise<Empty>;
  UpdateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<Empty>;
  CreateTag(request: CreateTagRequest): Promise<Empty>;
  AddTags(request: UpdateTagRequest): Promise<Empty>;
  RemoveTags(request: UpdateTagRequest): Promise<Empty>;
  GetTags(request: Empty): Promise<GetTagsResponse>;
  GetTagById(request: GetByIdRequest): Promise<GetTagByIdResponse>;
  HasEvent(request: HasEventRequest): Promise<Event>;
  GetQuestionGroupsByEventId(
    request: GetByIdRequest
  ): Promise<GetQuestionGroupsByEventIdResponse>;
  AddQuestionGroups(request: QuestionGroupsRequest): Promise<Empty>;
  RemoveQuestionGroups(request: QuestionGroupsRequest): Promise<Empty>;
  GetQuestionsByGroupId(
    request: GetByIdRequest
  ): Promise<GetQuestionsByGroupIdResponse>;
  AddQuestions(request: QuestionsRequest): Promise<Empty>;
  RemoveQuestions(request: QuestionsRequest): Promise<Empty>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

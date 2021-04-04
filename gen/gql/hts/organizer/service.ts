/* eslint-disable */
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

export interface GetOrganizationsResponse {
  organizations: Organization[];
}

export interface OrganizerService {
  CreateOrganization(request: CreateOrganizationRequest): Promise<Organization>;
  GetOrganizations(request: Empty): Promise<GetOrganizationsResponse>;
  GetOrganizationById(request: GetObjectByIdRequest): Promise<Organization>;
  UpdateOrganization(request: UpdateOrganizationRequest): Promise<Organization>;
  RemoveOrganization(request: RemoveOrganizationRequest): Promise<Organization>;
  AddUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Empty>;
  RemoveUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Empty>;
  CreateEvent(request: CreateEventRequest): Promise<Event>;
  UpdateEvent(request: UpdateEventRequest): Promise<Event>;
  UpdateEventDurations(request: UpdateEventDurationRequest): Promise<Empty>;
  RemoveEvent(request: RemoveEventRequest): Promise<Event>;
  UpdateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<UserEvent>;
  CreateTag(request: CreateTagRequest): Promise<Tag>;
  AddTags(request: UpdateTagRequest): Promise<Empty>;
  RemoveTags(request: UpdateTagRequest): Promise<Empty>;
  HasEvent(request: HasEventRequest): Promise<Event>;
  AddQuestionGroups(request: AddQuestionGroupsRequest): Promise<Empty>;
  RemoveQuestionGroups(request: RemoveQuestionGroupsRequest): Promise<Empty>;
  AddQuestions(request: AddQuestionsRequest): Promise<Empty>;
  RemoveQuestions(request: RemoveQuestionsRequest): Promise<Empty>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

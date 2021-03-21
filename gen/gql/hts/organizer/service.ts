/* eslint-disable */
import {
  Status,
  Organization,
  Event,
  Facility,
  Tag,
  Result,
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

export interface UpdateEventInfoRequest {
  userId: number;
  event: Event | undefined;
}

export interface UpdateEventFacilityRequest {
  userId: number;
  facility: Facility | undefined;
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

export interface GetOrganizationResponse {
  organizations: Organization[];
}

export interface GetOrganizationByIdResponse {
  organization: Organization | undefined;
}

export interface GetEventResponse {
  events: Event[];
}

export interface GetEventByIdResponse {
  event: Event | undefined;
}

export interface GetTagResponse {
  tags: Tag[];
}

export interface GetTagByIdResponse {
  tag: Tag | undefined;
}

export interface OrganizerService {
  CreateOrganization(request: CreateOrganizationRequest): Promise<Empty>;
  GetOrganization(request: Empty): Promise<GetOrganizationByIdResponse>;
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
  UpdateEventInfo(request: UpdateEventInfoRequest): Promise<Empty>;
  UpdateEventDuration(request: UpdateEventDurationRequest): Promise<Empty>;
  RemoveEvent(request: RemoveEventRequest): Promise<Empty>;
  UpdateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<Empty>;
  CreateTag(request: CreateTagRequest): Promise<Empty>;
  AddTag(request: UpdateTagRequest): Promise<Empty>;
  RemoveTag(request: UpdateTagRequest): Promise<Empty>;
  GetTag(request: Empty): Promise<GetTagResponse>;
  GetTagById(request: GetByIdRequest): Promise<GetTagByIdResponse>;
  HasEvent(request: HasEventRequest): Promise<Event>;
  Ping(request: Empty): Promise<Result>;
}

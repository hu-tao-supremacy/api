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

export interface UserRequest {
  userId: number;
}

export interface GetByIdRequest {
  userId: number;
  readId: number;
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
  organizationId: number;
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
  userId: number;
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
  CreateOrganization(request: CreateOrganizationRequest): Promise<Result>;
  GetOrganization(request: UserRequest): Promise<GetOrganizationResponse>;
  GetOrganizationById(
    request: GetByIdRequest
  ): Promise<GetOrganizationByIdResponse>;
  UpdateOrganization(request: UpdateOrganizationRequest): Promise<Result>;
  RemoveOrganization(request: RemoveOrganizationRequest): Promise<Result>;
  AddUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Result>;
  RemoveUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Result>;
  CreateEvent(request: CreateEventRequest): Promise<Result>;
  GetEvent(request: UserRequest): Promise<GetEventResponse>;
  GetEventById(request: GetByIdRequest): Promise<GetEventByIdResponse>;
  UpdateEventInfo(request: UpdateEventInfoRequest): Promise<Result>;
  UpdateEventFacility(request: UpdateEventFacilityRequest): Promise<Result>;
  UpdateEventDuration(request: UpdateEventDurationRequest): Promise<Result>;
  RemoveEvent(request: RemoveEventRequest): Promise<Result>;
  UpdateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<Result>;
  CreateTag(request: CreateTagRequest): Promise<Result>;
  AddTag(request: UpdateTagRequest): Promise<Result>;
  RemoveTag(request: UpdateTagRequest): Promise<Result>;
  GetTag(request: UserRequest): Promise<GetTagResponse>;
  GetTagById(request: GetByIdRequest): Promise<GetTagByIdResponse>;
  HasEvent(request: HasEventRequest): Promise<Result>;
  Ping(request: Empty): Promise<Result>;
}

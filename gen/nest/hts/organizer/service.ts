/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
  Status,
  Organization,
  Event,
  Facility,
  Tag,
  Result,
} from "../../hts/common/common";
import { Observable } from "rxjs";
import { Timestamp } from "../../google/protobuf/timestamp";
import { Empty } from "../../google/protobuf/empty";

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

export const HTS_ORGANIZER_PACKAGE_NAME = "hts.organizer";

export interface OrganizerServiceClient {
  createOrganization(request: CreateOrganizationRequest): Observable<Empty>;

  getOrganization(request: Empty): Observable<GetOrganizationByIdResponse>;

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

  updateEventInfo(request: UpdateEventInfoRequest): Observable<Empty>;

  updateEventDuration(request: UpdateEventDurationRequest): Observable<Empty>;

  removeEvent(request: RemoveEventRequest): Observable<Empty>;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Observable<Empty>;

  createTag(request: CreateTagRequest): Observable<Empty>;

  addTag(request: UpdateTagRequest): Observable<Empty>;

  removeTag(request: UpdateTagRequest): Observable<Empty>;

  getTag(request: Empty): Observable<GetTagResponse>;

  getTagById(request: GetByIdRequest): Observable<GetTagByIdResponse>;

  hasEvent(request: HasEventRequest): Observable<Event>;

  ping(request: Empty): Observable<Result>;
}

export interface OrganizerServiceController {
  createOrganization(request: CreateOrganizationRequest): void;

  getOrganization(
    request: Empty
  ):
    | Promise<GetOrganizationByIdResponse>
    | Observable<GetOrganizationByIdResponse>
    | GetOrganizationByIdResponse;

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

  updateEventInfo(request: UpdateEventInfoRequest): void;

  updateEventDuration(request: UpdateEventDurationRequest): void;

  removeEvent(request: RemoveEventRequest): void;

  updateRegistrationRequest(request: UpdateRegistrationRequestRequest): void;

  createTag(request: CreateTagRequest): void;

  addTag(request: UpdateTagRequest): void;

  removeTag(request: UpdateTagRequest): void;

  getTag(
    request: Empty
  ): Promise<GetTagResponse> | Observable<GetTagResponse> | GetTagResponse;

  getTagById(
    request: GetByIdRequest
  ):
    | Promise<GetTagByIdResponse>
    | Observable<GetTagByIdResponse>
    | GetTagByIdResponse;

  hasEvent(
    request: HasEventRequest
  ): Promise<Event> | Observable<Event> | Event;

  ping(request: Empty): Promise<Result> | Observable<Result> | Result;
}

export function OrganizerServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "createOrganization",
      "getOrganization",
      "getOrganizationById",
      "updateOrganization",
      "removeOrganization",
      "addUsersToOrganization",
      "removeUsersFromOrganization",
      "createEvent",
      "updateEventInfo",
      "updateEventDuration",
      "removeEvent",
      "updateRegistrationRequest",
      "createTag",
      "addTag",
      "removeTag",
      "getTag",
      "getTagById",
      "hasEvent",
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

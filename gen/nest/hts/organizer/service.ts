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

export interface UserRequest {
  userId: number;
}

export interface GetByIdRequest {
  userId: number;
  readId: number;
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

export const HTS_ORGANIZER_PACKAGE_NAME = "hts.organizer";

export interface OrganizerServiceClient {
  createOrganization(request: CreateOrganizationRequest): Observable<Result>;

  getOrganization(request: UserRequest): Observable<GetOrganizationResponse>;

  getOrganizationById(
    request: GetByIdRequest
  ): Observable<GetOrganizationByIdResponse>;

  updateOrganization(request: UpdateOrganizationRequest): Observable<Result>;

  removeOrganization(request: RemoveOrganizationRequest): Observable<Result>;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<Result>;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<Result>;

  createEvent(request: CreateEventRequest): Observable<Result>;

  getEvent(request: UserRequest): Observable<GetEventResponse>;

  getEventById(request: GetByIdRequest): Observable<GetEventByIdResponse>;

  updateEventInfo(request: UpdateEventInfoRequest): Observable<Result>;

  updateEventFacility(request: UpdateEventFacilityRequest): Observable<Result>;

  updateEventDuration(request: UpdateEventDurationRequest): Observable<Result>;

  removeEvent(request: RemoveEventRequest): Observable<Result>;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Observable<Result>;

  createTag(request: CreateTagRequest): Observable<Result>;

  addTag(request: UpdateTagRequest): Observable<Result>;

  removeTag(request: UpdateTagRequest): Observable<Result>;

  getTag(request: UserRequest): Observable<GetTagResponse>;

  getTagById(request: GetByIdRequest): Observable<GetTagByIdResponse>;

  hasEvent(request: HasEventRequest): Observable<Result>;

  ping(request: Empty): Observable<Result>;
}

export interface OrganizerServiceController {
  createOrganization(
    request: CreateOrganizationRequest
  ): Promise<Result> | Observable<Result> | Result;

  getOrganization(
    request: UserRequest
  ):
    | Promise<GetOrganizationResponse>
    | Observable<GetOrganizationResponse>
    | GetOrganizationResponse;

  getOrganizationById(
    request: GetByIdRequest
  ):
    | Promise<GetOrganizationByIdResponse>
    | Observable<GetOrganizationByIdResponse>
    | GetOrganizationByIdResponse;

  updateOrganization(
    request: UpdateOrganizationRequest
  ): Promise<Result> | Observable<Result> | Result;

  removeOrganization(
    request: RemoveOrganizationRequest
  ): Promise<Result> | Observable<Result> | Result;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Result> | Observable<Result> | Result;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Promise<Result> | Observable<Result> | Result;

  createEvent(
    request: CreateEventRequest
  ): Promise<Result> | Observable<Result> | Result;

  getEvent(
    request: UserRequest
  ):
    | Promise<GetEventResponse>
    | Observable<GetEventResponse>
    | GetEventResponse;

  getEventById(
    request: GetByIdRequest
  ):
    | Promise<GetEventByIdResponse>
    | Observable<GetEventByIdResponse>
    | GetEventByIdResponse;

  updateEventInfo(
    request: UpdateEventInfoRequest
  ): Promise<Result> | Observable<Result> | Result;

  updateEventFacility(
    request: UpdateEventFacilityRequest
  ): Promise<Result> | Observable<Result> | Result;

  updateEventDuration(
    request: UpdateEventDurationRequest
  ): Promise<Result> | Observable<Result> | Result;

  removeEvent(
    request: RemoveEventRequest
  ): Promise<Result> | Observable<Result> | Result;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<Result> | Observable<Result> | Result;

  createTag(
    request: CreateTagRequest
  ): Promise<Result> | Observable<Result> | Result;

  addTag(
    request: UpdateTagRequest
  ): Promise<Result> | Observable<Result> | Result;

  removeTag(
    request: UpdateTagRequest
  ): Promise<Result> | Observable<Result> | Result;

  getTag(
    request: UserRequest
  ): Promise<GetTagResponse> | Observable<GetTagResponse> | GetTagResponse;

  getTagById(
    request: GetByIdRequest
  ):
    | Promise<GetTagByIdResponse>
    | Observable<GetTagByIdResponse>
    | GetTagByIdResponse;

  hasEvent(
    request: HasEventRequest
  ): Promise<Result> | Observable<Result> | Result;

  ping(request: Empty): Promise<Result> | Observable<Result> | Result;
}

export function OrganizerServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods = [
      "createOrganization",
      "getOrganization",
      "getOrganizationById",
      "updateOrganization",
      "removeOrganization",
      "addUsersToOrganization",
      "removeUsersFromOrganization",
      "createEvent",
      "getEvent",
      "getEventById",
      "updateEventInfo",
      "updateEventFacility",
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
    const grpcStreamMethods = [];
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

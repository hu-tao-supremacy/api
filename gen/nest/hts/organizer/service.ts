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

export interface ReadByIdRequest {
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

export interface DeleteOrganizationRequest {
  userId: number;
  organizationId: number;
}

export interface AddUsersToOrganizationRequest {
  userId: number;
  userIds: number[];
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

export interface DeleteEventRequest {
  userId: number;
  eventId: number;
}

export interface UpdateRegistrationRequestRequest {
  userId: number;
  registeredUserId: number;
  registeredEventId: number;
  status: Status;
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

export interface ReadOrganizationResult {
  organizations: Organization[];
}

export interface ReadOrganizationByIdResult {
  organization: Organization | undefined;
}

export interface ReadEventResult {
  events: Event[];
}

export interface ReadEventByIdResult {
  event: Event | undefined;
}

export interface ReadTagResult {
  tags: Tag[];
}

export interface ReadTagByIdResult {
  tag: Tag | undefined;
}

export const HTS_ORGANIZER_PACKAGE_NAME = "hts.organizer";

export interface OrganizerServiceClient {
  createOrganization(request: CreateOrganizationRequest): Observable<Result>;

  readOrganization(request: UserRequest): Observable<ReadOrganizationResult>;

  readOrganizationById(
    request: ReadByIdRequest
  ): Observable<ReadOrganizationByIdResult>;

  updateOrganization(request: UpdateOrganizationRequest): Observable<Result>;

  deleteOrganization(request: DeleteOrganizationRequest): Observable<Result>;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<Result>;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationRequest
  ): Observable<Result>;

  createEvent(request: CreateEventRequest): Observable<Result>;

  readEvent(request: UserRequest): Observable<ReadEventResult>;

  readEventById(request: ReadByIdRequest): Observable<ReadEventByIdResult>;

  updateEventInfo(request: UpdateEventInfoRequest): Observable<Result>;

  updateEventFacility(request: UpdateEventFacilityRequest): Observable<Result>;

  updateEventDuration(request: UpdateEventDurationRequest): Observable<Result>;

  deleteEvent(request: DeleteEventRequest): Observable<Result>;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Observable<Result>;

  addTag(request: UpdateTagRequest): Observable<Result>;

  removeTag(request: UpdateTagRequest): Observable<Result>;

  readTag(request: UserRequest): Observable<ReadTagResult>;

  readTagById(request: ReadByIdRequest): Observable<ReadTagByIdResult>;

  hasEvent(request: HasEventRequest): Observable<Result>;

  ping(request: Empty): Observable<Result>;
}

export interface OrganizerServiceController {
  createOrganization(
    request: CreateOrganizationRequest
  ): Promise<Result> | Observable<Result> | Result;

  readOrganization(
    request: UserRequest
  ):
    | Promise<ReadOrganizationResult>
    | Observable<ReadOrganizationResult>
    | ReadOrganizationResult;

  readOrganizationById(
    request: ReadByIdRequest
  ):
    | Promise<ReadOrganizationByIdResult>
    | Observable<ReadOrganizationByIdResult>
    | ReadOrganizationByIdResult;

  updateOrganization(
    request: UpdateOrganizationRequest
  ): Promise<Result> | Observable<Result> | Result;

  deleteOrganization(
    request: DeleteOrganizationRequest
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

  readEvent(
    request: UserRequest
  ): Promise<ReadEventResult> | Observable<ReadEventResult> | ReadEventResult;

  readEventById(
    request: ReadByIdRequest
  ):
    | Promise<ReadEventByIdResult>
    | Observable<ReadEventByIdResult>
    | ReadEventByIdResult;

  updateEventInfo(
    request: UpdateEventInfoRequest
  ): Promise<Result> | Observable<Result> | Result;

  updateEventFacility(
    request: UpdateEventFacilityRequest
  ): Promise<Result> | Observable<Result> | Result;

  updateEventDuration(
    request: UpdateEventDurationRequest
  ): Promise<Result> | Observable<Result> | Result;

  deleteEvent(
    request: DeleteEventRequest
  ): Promise<Result> | Observable<Result> | Result;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestRequest
  ): Promise<Result> | Observable<Result> | Result;

  addTag(
    request: UpdateTagRequest
  ): Promise<Result> | Observable<Result> | Result;

  removeTag(
    request: UpdateTagRequest
  ): Promise<Result> | Observable<Result> | Result;

  readTag(
    request: UserRequest
  ): Promise<ReadTagResult> | Observable<ReadTagResult> | ReadTagResult;

  readTagById(
    request: ReadByIdRequest
  ):
    | Promise<ReadTagByIdResult>
    | Observable<ReadTagByIdResult>
    | ReadTagByIdResult;

  hasEvent(
    request: HasEventRequest
  ): Promise<Result> | Observable<Result> | Result;

  ping(request: Empty): Promise<Result> | Observable<Result> | Result;
}

export function OrganizerServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods = [
      "createOrganization",
      "readOrganization",
      "readOrganizationById",
      "updateOrganization",
      "deleteOrganization",
      "addUsersToOrganization",
      "removeUsersFromOrganization",
      "createEvent",
      "readEvent",
      "readEventById",
      "updateEventInfo",
      "updateEventFacility",
      "updateEventDuration",
      "deleteEvent",
      "updateRegistrationRequest",
      "addTag",
      "removeTag",
      "readTag",
      "readTagById",
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

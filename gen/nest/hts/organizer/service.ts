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

export const protobufPackage = "hts.organizer";

export interface UserReq {
  userId: number;
}

export interface Duration {
  start: Timestamp | undefined;
  finish: Timestamp | undefined;
}

export interface CreateOrganizationReq {
  userId: number;
  organization: Organization | undefined;
}

export interface UpdateOrganizationReq {
  userId: number;
  organizationId: number;
  organization: Organization | undefined;
}

export interface DeleteOrganizationReq {
  userId: number;
  organizationId: number;
}

export interface AddUsersToOrganizationReq {
  userId: number;
  userIds: number[];
}

export interface UpdateUsersInOrganizationReq {
  userId: number;
  userIds: number[];
}

export interface CreateEventReq {
  userId: number;
  event: Event | undefined;
}

export interface UpdateEventInfoReq {
  userId: number;
  event: Event | undefined;
}

export interface UpdateEventFacilityReq {
  userId: number;
  facility: Facility | undefined;
}

export interface UpdateEventDurationReq {
  userId: number;
  eventId: number;
  duration: Duration[];
}

export interface DeleteEventReq {
  userId: number;
  eventId: number;
}

export interface UpdateRegistrationRequestReq {
  userId: number;
  registeredUserId: number;
  registeredEventId: number;
  status: Status;
}

export interface UpdateTagReq {
  userId: number;
  tagIds: number[];
  eventId: number;
}

export interface HasEventReq {
  userId: number;
  organizationId: number;
  eventId: number;
}

export interface ReadOrganizationRes {
  organizations: Organization[];
}

export interface ReadEventRes {
  events: Event[];
}

export interface ReadTagRes {
  tags: Tag[];
}

export const HTS_ORGANIZER_PACKAGE_NAME = "hts.organizer";

export interface OrganizationServiceClient {
  createOrganization(request: CreateOrganizationReq): Observable<Result>;

  readOrganization(request: UserReq): Observable<ReadOrganizationRes>;

  updateOrganization(request: UpdateOrganizationReq): Observable<Result>;

  deleteOrganization(request: DeleteOrganizationReq): Observable<Result>;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationReq
  ): Observable<Result>;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationReq
  ): Observable<Result>;

  createEvent(request: CreateEventReq): Observable<Result>;

  readEvent(request: UserReq): Observable<ReadEventRes>;

  updateEventInfo(request: UpdateEventInfoReq): Observable<Result>;

  updateEventFacility(request: UpdateEventFacilityReq): Observable<Result>;

  updateEventDuration(request: UpdateEventDurationReq): Observable<Result>;

  deleteEvent(request: DeleteEventReq): Observable<Result>;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestReq
  ): Observable<Result>;

  addTag(request: UpdateTagReq): Observable<Result>;

  removeTag(request: UpdateTagReq): Observable<Result>;

  readTag(request: UserReq): Observable<ReadTagRes>;

  hasEvent(request: HasEventReq): Observable<Result>;
}

export interface OrganizationServiceController {
  createOrganization(
    request: CreateOrganizationReq
  ): Promise<Result> | Observable<Result> | Result;

  readOrganization(
    request: UserReq
  ):
    | Promise<ReadOrganizationRes>
    | Observable<ReadOrganizationRes>
    | ReadOrganizationRes;

  updateOrganization(
    request: UpdateOrganizationReq
  ): Promise<Result> | Observable<Result> | Result;

  deleteOrganization(
    request: DeleteOrganizationReq
  ): Promise<Result> | Observable<Result> | Result;

  addUsersToOrganization(
    request: UpdateUsersInOrganizationReq
  ): Promise<Result> | Observable<Result> | Result;

  removeUsersFromOrganization(
    request: UpdateUsersInOrganizationReq
  ): Promise<Result> | Observable<Result> | Result;

  createEvent(
    request: CreateEventReq
  ): Promise<Result> | Observable<Result> | Result;

  readEvent(
    request: UserReq
  ): Promise<ReadEventRes> | Observable<ReadEventRes> | ReadEventRes;

  updateEventInfo(
    request: UpdateEventInfoReq
  ): Promise<Result> | Observable<Result> | Result;

  updateEventFacility(
    request: UpdateEventFacilityReq
  ): Promise<Result> | Observable<Result> | Result;

  updateEventDuration(
    request: UpdateEventDurationReq
  ): Promise<Result> | Observable<Result> | Result;

  deleteEvent(
    request: DeleteEventReq
  ): Promise<Result> | Observable<Result> | Result;

  updateRegistrationRequest(
    request: UpdateRegistrationRequestReq
  ): Promise<Result> | Observable<Result> | Result;

  addTag(request: UpdateTagReq): Promise<Result> | Observable<Result> | Result;

  removeTag(
    request: UpdateTagReq
  ): Promise<Result> | Observable<Result> | Result;

  readTag(
    request: UserReq
  ): Promise<ReadTagRes> | Observable<ReadTagRes> | ReadTagRes;

  hasEvent(request: HasEventReq): Promise<Result> | Observable<Result> | Result;
}

export function OrganizationServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods = [
      "createOrganization",
      "readOrganization",
      "updateOrganization",
      "deleteOrganization",
      "addUsersToOrganization",
      "removeUsersFromOrganization",
      "createEvent",
      "readEvent",
      "updateEventInfo",
      "updateEventFacility",
      "updateEventDuration",
      "deleteEvent",
      "updateRegistrationRequest",
      "addTag",
      "removeTag",
      "readTag",
      "hasEvent",
    ];
    for (const method of grpcMethods) {
      const descriptor: any = Reflect.getOwnPropertyDescriptor(
        constructor.prototype,
        method
      );
      GrpcMethod("OrganizationService", method)(
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
      GrpcStreamMethod("OrganizationService", method)(
        constructor.prototype[method],
        method,
        descriptor
      );
    }
  };
}

export const ORGANIZATION_SERVICE_NAME = "OrganizationService";

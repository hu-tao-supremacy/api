/* eslint-disable */
import { StringValue, Int64Value } from "../../google/protobuf/wrappers";
import { Timestamp } from "../../google/protobuf/timestamp";

export const protobufPackage = "hts.common";

export enum DayOfWeek {
  SUN = 0,
  MON = 1,
  TUE = 2,
  WED = 3,
  THU = 4,
  FRI = 5,
  SAT = 6,
  UNRECOGNIZED = -1,
}

export enum Gender {
  MALE = 0,
  FEMALE = 1,
  NOT_SPECIFIED = 2,
  UNRECOGNIZED = -1,
}

export enum Status {
  PENDING = 0,
  APPROVED = 1,
  REJECTED = 2,
  UNRECOGNIZED = -1,
}

export enum Permission {
  ORGANIZATION_UPDATE = 0,
  ORGANIZATION_REMOVE = 1,
  ORGANIZATION_MEMBER_ADD = 2,
  ORGANIZATION_MEMBER_REMOVE = 3,
  EVENT_CREATE = 4,
  EVENT_UPDATE = 5,
  EVENT_REMOVE = 6,
  TAG_CREATE = 7,
  TAG_REMOVE = 8,
  EVENT_TAG_UPDATE = 9,
  FACILITY_CREATE = 10,
  FACILITY_UPDATE = 11,
  FACILITY_REMOVE = 12,
  UNRECOGNIZED = -1,
}

export interface OperatingHour {
  startHour: number;
  finishHour: number;
  day: DayOfWeek;
}

export interface Result {
  isOk: boolean;
  description: string;
}

export interface User {
  id: number;
  firstName: string;
  lastName: string;
  email: string;
  nickname: StringValue | undefined;
  chulaId: StringValue | undefined;
  isChulaStudent: boolean;
  gender: Gender;
  address: StringValue | undefined;
  profilePicture: StringValue | undefined;
}

export interface Organization {
  id: number;
  name: string;
  isVerified: boolean;
}

export interface UserOrganization {
  id: number;
  userId: number;
  organizationId: number;
}

export interface Event {
  id: number;
  organizationId: number;
  eventLocationId: Int64Value | undefined;
  description: string;
  name: string;
  coverImage: StringValue | undefined;
  coverImageHash: StringValue | undefined;
  posterImage: StringValue | undefined;
  posterImageHash: StringValue | undefined;
  contact: string;
}

export interface UserEventFeedback {
  id: number;
  userId: number;
  eventFeedbackId: number;
}

export interface EventFeedback {
  id: number;
  eventId: number;
  feedback: string;
}

export interface EventLocation {
  id: number;
  name: string;
  latitude: number;
  longitude: number;
}

export interface UserEvent {
  id: number;
  userId: number;
  eventId: number;
}

export interface EventDuration {
  id: number;
  eventId: number;
  start: Timestamp | undefined;
  finish: Timestamp | undefined;
}

export interface EventRegistration {
  id: number;
  eventId: number;
  userId: number;
  status: Status;
}

export interface Tag {
  id: number;
  name: string;
}

export interface EventTag {
  id: number;
  eventId: number;
  tagId: number;
}

export interface OrganizationPermission {
  id: number;
  organizationId: number;
  permission: Permission;
}

export interface UserPermission {
  id: number;
  userId: number;
  organizationPermissionId: number;
}

export interface FacilityRequest {
  id: number;
  eventId: number;
  facilityId: number;
  status: Status;
  rejectReason: StringValue | undefined;
  start: Timestamp | undefined;
  finish: Timestamp | undefined;
}

export interface Facility {
  id: number;
  organizationId: number;
  name: string;
  latitude: number;
  longitude: number;
  operatingHours: OperatingHour[];
  description: string;
}

export const HTS_COMMON_PACKAGE_NAME = "hts.common";

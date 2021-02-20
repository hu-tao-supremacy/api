/* eslint-disable */
import { Timestamp } from "../../google/protobuf/timestamp";

export const protobufPackage = "hts.common";

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
  CREATE_ORGANIZATION = 0,
  READ_ORGANIZATION = 1,
  UPDATE_ORGANIZATION = 2,
  DELETE_ORGANIZATION = 3,
  ADD_MEMBERS_TO_ORGANIZATION = 4,
  REMOVE_MEMBERS_FROM_ORGANIZATION = 5,
  CREATE_EVENT = 6,
  READ_EVENT = 7,
  UPDATE_EVENT = 8,
  DELETE_EVENT = 9,
  CREATE_TAG = 10,
  READ_TAG = 11,
  UPDATE_TAG = 12,
  DELETE_TAG = 13,
  ADD_TAGS_TO_EVENT = 14,
  REMOVE_TAGS_FROM_EVENT = 15,
  CREATE_FACILITY = 16,
  READ_FACILITY = 17,
  UPDATE_FACILITY = 18,
  DELETE_FACILITY = 19,
  UNRECOGNIZED = -1,
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
  nickname: string | undefined;
  chulaId: string | undefined;
  isChulaStudent: boolean;
  gender: Gender;
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
  eventLocationId: number | undefined;
  description: string;
  name: string;
  coverImage: string | undefined;
  coverImageHash: string | undefined;
  posterImage: string | undefined;
  posterImageHash: string | undefined;
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
  rejectReason: string | undefined;
  start: Timestamp | undefined;
  finish: Timestamp | undefined;
}

export interface Facility {
  id: number;
  organizationId: number;
  name: string;
  latitude: number;
  longitude: number;
  operatingHours: string;
  description: string;
}

export const HTS_COMMON_PACKAGE_NAME = "hts.common";

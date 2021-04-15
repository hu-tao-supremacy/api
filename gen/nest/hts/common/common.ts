/* eslint-disable */
import { StringValue, Int32Value } from "../../google/protobuf/wrappers";
import { Timestamp } from "../../google/protobuf/timestamp";

export const protobufPackage = "hts.common";

export enum DayOfWeek {
  DAY_OF_WEEK_UNSPECIFIED = 0,
  SUN = 1,
  MON = 2,
  TUE = 3,
  WED = 4,
  THU = 5,
  FRI = 6,
  SAT = 7,
  UNRECOGNIZED = -1,
}

export enum AnswerType {
  ANSWER_TYPE_UNSPECIFIED = 0,
  SCALE = 1,
  TEXT = 2,
  UNRECOGNIZED = -1,
}

export enum QuestionGroupType {
  QUESTION_GROUP_TYPE_UNSPECIFIED = 0,
  PRE_EVENT = 1,
  POST_EVENT = 2,
  UNRECOGNIZED = -1,
}

export enum Gender {
  GENDER_UNSPECIFIED = 0,
  M = 1,
  F = 2,
  NS = 3,
  UNRECOGNIZED = -1,
}

export enum Permission {
  PERMISSION_UNSPECIFIED = 0,
  ORGANIZATION_UPDATE = 1,
  ORGANIZATION_REMOVE = 2,
  ORGANIZATION_MEMBER_ADD = 3,
  ORGANIZATION_MEMBER_REMOVE = 4,
  EVENT_CREATE = 5,
  EVENT_UPDATE = 6,
  EVENT_REMOVE = 7,
  TAG_CREATE = 8,
  TAG_REMOVE = 9,
  EVENT_TAG_UPDATE = 10,
  FACILITY_CREATE = 11,
  FACILITY_UPDATE = 12,
  FACILITY_REMOVE = 13,
  UNRECOGNIZED = -1,
}

export interface OperatingHour {
  startHour: number;
  finishHour: number;
  day: DayOfWeek;
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
  profilePictureUrl: StringValue | undefined;
  didSetup: boolean;
  district: StringValue | undefined;
  zipCode: StringValue | undefined;
  phoneNumber: StringValue | undefined;
  province: StringValue | undefined;
  academicYear: Int32Value | undefined;
}

export interface Organization {
  id: number;
  name: string;
  isVerified: boolean;
  abbreviation: StringValue | undefined;
  advisor: StringValue | undefined;
  associatedFaculty: StringValue | undefined;
  description: StringValue | undefined;
  facebookPage: StringValue | undefined;
  instagram: StringValue | undefined;
  lineOfficialAccount: StringValue | undefined;
  email: StringValue | undefined;
  contactFullName: StringValue | undefined;
  contactEmail: StringValue | undefined;
  contactPhoneNumber: StringValue | undefined;
  contactLineId: StringValue | undefined;
  profilePictureUrl: StringValue | undefined;
  profilePictureHash: StringValue | undefined;
}

export interface QuestionGroup {
  id: number;
  eventId: number;
  type: QuestionGroupType;
  seq: number;
  title: string;
}

export interface Question {
  id: number;
  questionGroupId: number;
  seq: number;
  answerType: AnswerType;
  isOptional: boolean;
  title: string;
  subtitle: string;
}

export interface UserOrganization {
  id: number;
  userId: number;
  organizationId: number;
}

export interface Event {
  id: number;
  organizationId: number;
  locationId: Int32Value | undefined;
  description: string;
  name: string;
  coverImageUrl: StringValue | undefined;
  coverImageHash: StringValue | undefined;
  posterImageUrl: StringValue | undefined;
  posterImageHash: StringValue | undefined;
  contact: StringValue | undefined;
  profileImageUrl: StringValue | undefined;
  profileImageHash: StringValue | undefined;
  attendeeLimit: number;
}

export interface Location {
  id: number;
  name: string;
  googleMapUrl: string;
  description: StringValue | undefined;
  travelInformationImageUrl: StringValue | undefined;
  travelInformationImageHash: StringValue | undefined;
}

export interface Answer {
  id: number;
  userEventId: number;
  questionId: number;
  value: string;
}

export interface UserEvent {
  id: number;
  userId: number;
  eventId: number;
  rating: Int32Value | undefined;
  ticket: StringValue | undefined;
  status: UserEvent_Status;
  isInternal: boolean;
}

export enum UserEvent_Status {
  STATUS_UNSPECIFIED = 0,
  PENDING = 1,
  APPROVED = 2,
  REJECTED = 3,
  UNRECOGNIZED = -1,
}

export interface EventDuration {
  id: number;
  eventId: number;
  start: Timestamp | undefined;
  finish: Timestamp | undefined;
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
  permissionName: Permission;
}

export interface UserInterest {
  id: number;
  userId: number;
  tagId: number;
}

export interface FacilityRequest {
  id: number;
  eventId: number;
  facilityId: number;
  status: FacilityRequest_Status;
  rejectReason: StringValue | undefined;
  start: Timestamp | undefined;
  finish: Timestamp | undefined;
}

export enum FacilityRequest_Status {
  STATUS_UNSPECIFIED = 0,
  PENDING = 1,
  APPROVED = 2,
  REJECTED = 3,
  UNRECOGNIZED = -1,
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

export interface GetObjectByIdRequest {
  id: number;
}

export interface GetObjectByNameRequest {
  name: string;
}

export const HTS_COMMON_PACKAGE_NAME = "hts.common";

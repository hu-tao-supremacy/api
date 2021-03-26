/* eslint-disable */
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

export enum AnswerType {
  SCALE = 0,
  TEXT = 1,
  UNRECOGNIZED = -1,
}

export enum QuestionGroupType {
  PRE_EVENT = 0,
  POST_EVENT = 1,
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
  nickname: string | undefined;
  chulaId: string | undefined;
  isChulaStudent: boolean;
  gender: Gender;
  address: string | undefined;
  profilePicture: string | undefined;
}

export interface Organization {
  id: number;
  name: string;
  isVerified: boolean;
  abbreviation: string | undefined;
  advisor: string | undefined;
  associatedFaculty: string | undefined;
  description: string | undefined;
  facebookPage: string | undefined;
  instagram: string | undefined;
  lineOfficialAccount: string | undefined;
  email: string | undefined;
  contactFullName: string | undefined;
  contactEmail: string | undefined;
  contactPhoneNumber: string | undefined;
  contactLineId: string | undefined;
  profilePictureUrl: string | undefined;
  profilePictureHash: string | undefined;
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
  locationId: number | undefined;
  description: string;
  name: string;
  coverImageUrl: string | undefined;
  coverImageHash: string | undefined;
  posterImageUrl: string | undefined;
  posterImageHash: string | undefined;
  contact: string;
  profileImageUrl: string | undefined;
  profileImageHash: string | undefined;
  attendeeLimit: number;
}

export interface Location {
  id: number;
  name: string;
  googleMapUrl: string;
  description: string | undefined;
  travelInformationImageUrl: string | undefined;
  travelInformationImageHash: string | undefined;
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
  rating: number | undefined;
  ticket: string;
  status: Status;
}

export interface EventDuration {
  id: number;
  eventId: number;
  start: Date | undefined;
  finish: Date | undefined;
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

export interface UserInterest {
  id: number;
  userId: number;
  tagId: number;
}

export interface FacilityRequest {
  id: number;
  eventId: number;
  facilityId: number;
  status: Status;
  rejectReason: string | undefined;
  start: Date | undefined;
  finish: Date | undefined;
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

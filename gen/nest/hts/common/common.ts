/* eslint-disable */
import { Timestamp } from "../../google/protobuf/timestamp";
import { StringValue, Int32Value } from "../../google/protobuf/wrappers";

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

export function dayOfWeekFromJSON(object: any): DayOfWeek {
  switch (object) {
    case 0:
    case "DAY_OF_WEEK_UNSPECIFIED":
      return DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
    case 1:
    case "SUN":
      return DayOfWeek.SUN;
    case 2:
    case "MON":
      return DayOfWeek.MON;
    case 3:
    case "TUE":
      return DayOfWeek.TUE;
    case 4:
    case "WED":
      return DayOfWeek.WED;
    case 5:
    case "THU":
      return DayOfWeek.THU;
    case 6:
    case "FRI":
      return DayOfWeek.FRI;
    case 7:
    case "SAT":
      return DayOfWeek.SAT;
    case -1:
    case "UNRECOGNIZED":
    default:
      return DayOfWeek.UNRECOGNIZED;
  }
}

export function dayOfWeekToJSON(object: DayOfWeek): string {
  switch (object) {
    case DayOfWeek.DAY_OF_WEEK_UNSPECIFIED:
      return "DAY_OF_WEEK_UNSPECIFIED";
    case DayOfWeek.SUN:
      return "SUN";
    case DayOfWeek.MON:
      return "MON";
    case DayOfWeek.TUE:
      return "TUE";
    case DayOfWeek.WED:
      return "WED";
    case DayOfWeek.THU:
      return "THU";
    case DayOfWeek.FRI:
      return "FRI";
    case DayOfWeek.SAT:
      return "SAT";
    default:
      return "UNKNOWN";
  }
}

export enum AnswerType {
  ANSWER_TYPE_UNSPECIFIED = 0,
  SCALE = 1,
  TEXT = 2,
  UNRECOGNIZED = -1,
}

export function answerTypeFromJSON(object: any): AnswerType {
  switch (object) {
    case 0:
    case "ANSWER_TYPE_UNSPECIFIED":
      return AnswerType.ANSWER_TYPE_UNSPECIFIED;
    case 1:
    case "SCALE":
      return AnswerType.SCALE;
    case 2:
    case "TEXT":
      return AnswerType.TEXT;
    case -1:
    case "UNRECOGNIZED":
    default:
      return AnswerType.UNRECOGNIZED;
  }
}

export function answerTypeToJSON(object: AnswerType): string {
  switch (object) {
    case AnswerType.ANSWER_TYPE_UNSPECIFIED:
      return "ANSWER_TYPE_UNSPECIFIED";
    case AnswerType.SCALE:
      return "SCALE";
    case AnswerType.TEXT:
      return "TEXT";
    default:
      return "UNKNOWN";
  }
}

export enum QuestionGroupType {
  QUESTION_GROUP_TYPE_UNSPECIFIED = 0,
  PRE_EVENT = 1,
  POST_EVENT = 2,
  UNRECOGNIZED = -1,
}

export function questionGroupTypeFromJSON(object: any): QuestionGroupType {
  switch (object) {
    case 0:
    case "QUESTION_GROUP_TYPE_UNSPECIFIED":
      return QuestionGroupType.QUESTION_GROUP_TYPE_UNSPECIFIED;
    case 1:
    case "PRE_EVENT":
      return QuestionGroupType.PRE_EVENT;
    case 2:
    case "POST_EVENT":
      return QuestionGroupType.POST_EVENT;
    case -1:
    case "UNRECOGNIZED":
    default:
      return QuestionGroupType.UNRECOGNIZED;
  }
}

export function questionGroupTypeToJSON(object: QuestionGroupType): string {
  switch (object) {
    case QuestionGroupType.QUESTION_GROUP_TYPE_UNSPECIFIED:
      return "QUESTION_GROUP_TYPE_UNSPECIFIED";
    case QuestionGroupType.PRE_EVENT:
      return "PRE_EVENT";
    case QuestionGroupType.POST_EVENT:
      return "POST_EVENT";
    default:
      return "UNKNOWN";
  }
}

export enum Gender {
  GENDER_UNSPECIFIED = 0,
  M = 1,
  F = 2,
  NS = 3,
  UNRECOGNIZED = -1,
}

export function genderFromJSON(object: any): Gender {
  switch (object) {
    case 0:
    case "GENDER_UNSPECIFIED":
      return Gender.GENDER_UNSPECIFIED;
    case 1:
    case "M":
      return Gender.M;
    case 2:
    case "F":
      return Gender.F;
    case 3:
    case "NS":
      return Gender.NS;
    case -1:
    case "UNRECOGNIZED":
    default:
      return Gender.UNRECOGNIZED;
  }
}

export function genderToJSON(object: Gender): string {
  switch (object) {
    case Gender.GENDER_UNSPECIFIED:
      return "GENDER_UNSPECIFIED";
    case Gender.M:
      return "M";
    case Gender.F:
      return "F";
    case Gender.NS:
      return "NS";
    default:
      return "UNKNOWN";
  }
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

export function permissionFromJSON(object: any): Permission {
  switch (object) {
    case 0:
    case "PERMISSION_UNSPECIFIED":
      return Permission.PERMISSION_UNSPECIFIED;
    case 1:
    case "ORGANIZATION_UPDATE":
      return Permission.ORGANIZATION_UPDATE;
    case 2:
    case "ORGANIZATION_REMOVE":
      return Permission.ORGANIZATION_REMOVE;
    case 3:
    case "ORGANIZATION_MEMBER_ADD":
      return Permission.ORGANIZATION_MEMBER_ADD;
    case 4:
    case "ORGANIZATION_MEMBER_REMOVE":
      return Permission.ORGANIZATION_MEMBER_REMOVE;
    case 5:
    case "EVENT_CREATE":
      return Permission.EVENT_CREATE;
    case 6:
    case "EVENT_UPDATE":
      return Permission.EVENT_UPDATE;
    case 7:
    case "EVENT_REMOVE":
      return Permission.EVENT_REMOVE;
    case 8:
    case "TAG_CREATE":
      return Permission.TAG_CREATE;
    case 9:
    case "TAG_REMOVE":
      return Permission.TAG_REMOVE;
    case 10:
    case "EVENT_TAG_UPDATE":
      return Permission.EVENT_TAG_UPDATE;
    case 11:
    case "FACILITY_CREATE":
      return Permission.FACILITY_CREATE;
    case 12:
    case "FACILITY_UPDATE":
      return Permission.FACILITY_UPDATE;
    case 13:
    case "FACILITY_REMOVE":
      return Permission.FACILITY_REMOVE;
    case -1:
    case "UNRECOGNIZED":
    default:
      return Permission.UNRECOGNIZED;
  }
}

export function permissionToJSON(object: Permission): string {
  switch (object) {
    case Permission.PERMISSION_UNSPECIFIED:
      return "PERMISSION_UNSPECIFIED";
    case Permission.ORGANIZATION_UPDATE:
      return "ORGANIZATION_UPDATE";
    case Permission.ORGANIZATION_REMOVE:
      return "ORGANIZATION_REMOVE";
    case Permission.ORGANIZATION_MEMBER_ADD:
      return "ORGANIZATION_MEMBER_ADD";
    case Permission.ORGANIZATION_MEMBER_REMOVE:
      return "ORGANIZATION_MEMBER_REMOVE";
    case Permission.EVENT_CREATE:
      return "EVENT_CREATE";
    case Permission.EVENT_UPDATE:
      return "EVENT_UPDATE";
    case Permission.EVENT_REMOVE:
      return "EVENT_REMOVE";
    case Permission.TAG_CREATE:
      return "TAG_CREATE";
    case Permission.TAG_REMOVE:
      return "TAG_REMOVE";
    case Permission.EVENT_TAG_UPDATE:
      return "EVENT_TAG_UPDATE";
    case Permission.FACILITY_CREATE:
      return "FACILITY_CREATE";
    case Permission.FACILITY_UPDATE:
      return "FACILITY_UPDATE";
    case Permission.FACILITY_REMOVE:
      return "FACILITY_REMOVE";
    default:
      return "UNKNOWN";
  }
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
  registrationDueDate: Timestamp | undefined;
}

export interface Location {
  id: number;
  name: string;
  googleMapUrl: string;
  description: StringValue | undefined;
  travelInformationImageUrl: StringValue | undefined;
  travelInformationImageHash: StringValue | undefined;
  isOnline: boolean;
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
  ATTENDED = 4,
  UNRECOGNIZED = -1,
}

export function userEvent_StatusFromJSON(object: any): UserEvent_Status {
  switch (object) {
    case 0:
    case "STATUS_UNSPECIFIED":
      return UserEvent_Status.STATUS_UNSPECIFIED;
    case 1:
    case "PENDING":
      return UserEvent_Status.PENDING;
    case 2:
    case "APPROVED":
      return UserEvent_Status.APPROVED;
    case 3:
    case "REJECTED":
      return UserEvent_Status.REJECTED;
    case 4:
    case "ATTENDED":
      return UserEvent_Status.ATTENDED;
    case -1:
    case "UNRECOGNIZED":
    default:
      return UserEvent_Status.UNRECOGNIZED;
  }
}

export function userEvent_StatusToJSON(object: UserEvent_Status): string {
  switch (object) {
    case UserEvent_Status.STATUS_UNSPECIFIED:
      return "STATUS_UNSPECIFIED";
    case UserEvent_Status.PENDING:
      return "PENDING";
    case UserEvent_Status.APPROVED:
      return "APPROVED";
    case UserEvent_Status.REJECTED:
      return "REJECTED";
    case UserEvent_Status.ATTENDED:
      return "ATTENDED";
    default:
      return "UNKNOWN";
  }
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
  imageUrl: string;
  imageHash: string;
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

export function facilityRequest_StatusFromJSON(
  object: any
): FacilityRequest_Status {
  switch (object) {
    case 0:
    case "STATUS_UNSPECIFIED":
      return FacilityRequest_Status.STATUS_UNSPECIFIED;
    case 1:
    case "PENDING":
      return FacilityRequest_Status.PENDING;
    case 2:
    case "APPROVED":
      return FacilityRequest_Status.APPROVED;
    case 3:
    case "REJECTED":
      return FacilityRequest_Status.REJECTED;
    case -1:
    case "UNRECOGNIZED":
    default:
      return FacilityRequest_Status.UNRECOGNIZED;
  }
}

export function facilityRequest_StatusToJSON(
  object: FacilityRequest_Status
): string {
  switch (object) {
    case FacilityRequest_Status.STATUS_UNSPECIFIED:
      return "STATUS_UNSPECIFIED";
    case FacilityRequest_Status.PENDING:
      return "PENDING";
    case FacilityRequest_Status.APPROVED:
      return "APPROVED";
    case FacilityRequest_Status.REJECTED:
      return "REJECTED";
    default:
      return "UNKNOWN";
  }
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

const baseOperatingHour: object = { startHour: 0, finishHour: 0, day: 0 };

export const OperatingHour = {
  fromJSON(object: any): OperatingHour {
    const message = { ...baseOperatingHour } as OperatingHour;
    if (object.startHour !== undefined && object.startHour !== null) {
      message.startHour = Number(object.startHour);
    } else {
      message.startHour = 0;
    }
    if (object.finishHour !== undefined && object.finishHour !== null) {
      message.finishHour = Number(object.finishHour);
    } else {
      message.finishHour = 0;
    }
    if (object.day !== undefined && object.day !== null) {
      message.day = dayOfWeekFromJSON(object.day);
    } else {
      message.day = 0;
    }
    return message;
  },

  toJSON(message: OperatingHour): unknown {
    const obj: any = {};
    message.startHour !== undefined && (obj.startHour = message.startHour);
    message.finishHour !== undefined && (obj.finishHour = message.finishHour);
    message.day !== undefined && (obj.day = dayOfWeekToJSON(message.day));
    return obj;
  },
};

const baseUser: object = {
  id: 0,
  firstName: "",
  lastName: "",
  email: "",
  isChulaStudent: false,
  gender: 0,
  didSetup: false,
};

export const User = {
  fromJSON(object: any): User {
    const message = { ...baseUser } as User;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.firstName !== undefined && object.firstName !== null) {
      message.firstName = String(object.firstName);
    } else {
      message.firstName = "";
    }
    if (object.lastName !== undefined && object.lastName !== null) {
      message.lastName = String(object.lastName);
    } else {
      message.lastName = "";
    }
    if (object.email !== undefined && object.email !== null) {
      message.email = String(object.email);
    } else {
      message.email = "";
    }
    if (object.nickname !== undefined && object.nickname !== null) {
      message.nickname = StringValue.fromJSON(object.nickname);
    } else {
      message.nickname = undefined;
    }
    if (object.chulaId !== undefined && object.chulaId !== null) {
      message.chulaId = StringValue.fromJSON(object.chulaId);
    } else {
      message.chulaId = undefined;
    }
    if (object.isChulaStudent !== undefined && object.isChulaStudent !== null) {
      message.isChulaStudent = Boolean(object.isChulaStudent);
    } else {
      message.isChulaStudent = false;
    }
    if (object.gender !== undefined && object.gender !== null) {
      message.gender = genderFromJSON(object.gender);
    } else {
      message.gender = 0;
    }
    if (object.address !== undefined && object.address !== null) {
      message.address = StringValue.fromJSON(object.address);
    } else {
      message.address = undefined;
    }
    if (
      object.profilePictureUrl !== undefined &&
      object.profilePictureUrl !== null
    ) {
      message.profilePictureUrl = StringValue.fromJSON(
        object.profilePictureUrl
      );
    } else {
      message.profilePictureUrl = undefined;
    }
    if (object.didSetup !== undefined && object.didSetup !== null) {
      message.didSetup = Boolean(object.didSetup);
    } else {
      message.didSetup = false;
    }
    if (object.district !== undefined && object.district !== null) {
      message.district = StringValue.fromJSON(object.district);
    } else {
      message.district = undefined;
    }
    if (object.zipCode !== undefined && object.zipCode !== null) {
      message.zipCode = StringValue.fromJSON(object.zipCode);
    } else {
      message.zipCode = undefined;
    }
    if (object.phoneNumber !== undefined && object.phoneNumber !== null) {
      message.phoneNumber = StringValue.fromJSON(object.phoneNumber);
    } else {
      message.phoneNumber = undefined;
    }
    if (object.province !== undefined && object.province !== null) {
      message.province = StringValue.fromJSON(object.province);
    } else {
      message.province = undefined;
    }
    if (object.academicYear !== undefined && object.academicYear !== null) {
      message.academicYear = Int32Value.fromJSON(object.academicYear);
    } else {
      message.academicYear = undefined;
    }
    return message;
  },

  toJSON(message: User): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.firstName !== undefined && (obj.firstName = message.firstName);
    message.lastName !== undefined && (obj.lastName = message.lastName);
    message.email !== undefined && (obj.email = message.email);
    message.nickname !== undefined &&
      (obj.nickname = message.nickname
        ? StringValue.toJSON(message.nickname)
        : undefined);
    message.chulaId !== undefined &&
      (obj.chulaId = message.chulaId
        ? StringValue.toJSON(message.chulaId)
        : undefined);
    message.isChulaStudent !== undefined &&
      (obj.isChulaStudent = message.isChulaStudent);
    message.gender !== undefined && (obj.gender = genderToJSON(message.gender));
    message.address !== undefined &&
      (obj.address = message.address
        ? StringValue.toJSON(message.address)
        : undefined);
    message.profilePictureUrl !== undefined &&
      (obj.profilePictureUrl = message.profilePictureUrl
        ? StringValue.toJSON(message.profilePictureUrl)
        : undefined);
    message.didSetup !== undefined && (obj.didSetup = message.didSetup);
    message.district !== undefined &&
      (obj.district = message.district
        ? StringValue.toJSON(message.district)
        : undefined);
    message.zipCode !== undefined &&
      (obj.zipCode = message.zipCode
        ? StringValue.toJSON(message.zipCode)
        : undefined);
    message.phoneNumber !== undefined &&
      (obj.phoneNumber = message.phoneNumber
        ? StringValue.toJSON(message.phoneNumber)
        : undefined);
    message.province !== undefined &&
      (obj.province = message.province
        ? StringValue.toJSON(message.province)
        : undefined);
    message.academicYear !== undefined &&
      (obj.academicYear = message.academicYear
        ? Int32Value.toJSON(message.academicYear)
        : undefined);
    return obj;
  },
};

const baseOrganization: object = { id: 0, name: "", isVerified: false };

export const Organization = {
  fromJSON(object: any): Organization {
    const message = { ...baseOrganization } as Organization;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.isVerified !== undefined && object.isVerified !== null) {
      message.isVerified = Boolean(object.isVerified);
    } else {
      message.isVerified = false;
    }
    if (object.abbreviation !== undefined && object.abbreviation !== null) {
      message.abbreviation = StringValue.fromJSON(object.abbreviation);
    } else {
      message.abbreviation = undefined;
    }
    if (object.advisor !== undefined && object.advisor !== null) {
      message.advisor = StringValue.fromJSON(object.advisor);
    } else {
      message.advisor = undefined;
    }
    if (
      object.associatedFaculty !== undefined &&
      object.associatedFaculty !== null
    ) {
      message.associatedFaculty = StringValue.fromJSON(
        object.associatedFaculty
      );
    } else {
      message.associatedFaculty = undefined;
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = StringValue.fromJSON(object.description);
    } else {
      message.description = undefined;
    }
    if (object.facebookPage !== undefined && object.facebookPage !== null) {
      message.facebookPage = StringValue.fromJSON(object.facebookPage);
    } else {
      message.facebookPage = undefined;
    }
    if (object.instagram !== undefined && object.instagram !== null) {
      message.instagram = StringValue.fromJSON(object.instagram);
    } else {
      message.instagram = undefined;
    }
    if (
      object.lineOfficialAccount !== undefined &&
      object.lineOfficialAccount !== null
    ) {
      message.lineOfficialAccount = StringValue.fromJSON(
        object.lineOfficialAccount
      );
    } else {
      message.lineOfficialAccount = undefined;
    }
    if (object.email !== undefined && object.email !== null) {
      message.email = StringValue.fromJSON(object.email);
    } else {
      message.email = undefined;
    }
    if (
      object.contactFullName !== undefined &&
      object.contactFullName !== null
    ) {
      message.contactFullName = StringValue.fromJSON(object.contactFullName);
    } else {
      message.contactFullName = undefined;
    }
    if (object.contactEmail !== undefined && object.contactEmail !== null) {
      message.contactEmail = StringValue.fromJSON(object.contactEmail);
    } else {
      message.contactEmail = undefined;
    }
    if (
      object.contactPhoneNumber !== undefined &&
      object.contactPhoneNumber !== null
    ) {
      message.contactPhoneNumber = StringValue.fromJSON(
        object.contactPhoneNumber
      );
    } else {
      message.contactPhoneNumber = undefined;
    }
    if (object.contactLineId !== undefined && object.contactLineId !== null) {
      message.contactLineId = StringValue.fromJSON(object.contactLineId);
    } else {
      message.contactLineId = undefined;
    }
    if (
      object.profilePictureUrl !== undefined &&
      object.profilePictureUrl !== null
    ) {
      message.profilePictureUrl = StringValue.fromJSON(
        object.profilePictureUrl
      );
    } else {
      message.profilePictureUrl = undefined;
    }
    if (
      object.profilePictureHash !== undefined &&
      object.profilePictureHash !== null
    ) {
      message.profilePictureHash = StringValue.fromJSON(
        object.profilePictureHash
      );
    } else {
      message.profilePictureHash = undefined;
    }
    return message;
  },

  toJSON(message: Organization): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.name !== undefined && (obj.name = message.name);
    message.isVerified !== undefined && (obj.isVerified = message.isVerified);
    message.abbreviation !== undefined &&
      (obj.abbreviation = message.abbreviation
        ? StringValue.toJSON(message.abbreviation)
        : undefined);
    message.advisor !== undefined &&
      (obj.advisor = message.advisor
        ? StringValue.toJSON(message.advisor)
        : undefined);
    message.associatedFaculty !== undefined &&
      (obj.associatedFaculty = message.associatedFaculty
        ? StringValue.toJSON(message.associatedFaculty)
        : undefined);
    message.description !== undefined &&
      (obj.description = message.description
        ? StringValue.toJSON(message.description)
        : undefined);
    message.facebookPage !== undefined &&
      (obj.facebookPage = message.facebookPage
        ? StringValue.toJSON(message.facebookPage)
        : undefined);
    message.instagram !== undefined &&
      (obj.instagram = message.instagram
        ? StringValue.toJSON(message.instagram)
        : undefined);
    message.lineOfficialAccount !== undefined &&
      (obj.lineOfficialAccount = message.lineOfficialAccount
        ? StringValue.toJSON(message.lineOfficialAccount)
        : undefined);
    message.email !== undefined &&
      (obj.email = message.email
        ? StringValue.toJSON(message.email)
        : undefined);
    message.contactFullName !== undefined &&
      (obj.contactFullName = message.contactFullName
        ? StringValue.toJSON(message.contactFullName)
        : undefined);
    message.contactEmail !== undefined &&
      (obj.contactEmail = message.contactEmail
        ? StringValue.toJSON(message.contactEmail)
        : undefined);
    message.contactPhoneNumber !== undefined &&
      (obj.contactPhoneNumber = message.contactPhoneNumber
        ? StringValue.toJSON(message.contactPhoneNumber)
        : undefined);
    message.contactLineId !== undefined &&
      (obj.contactLineId = message.contactLineId
        ? StringValue.toJSON(message.contactLineId)
        : undefined);
    message.profilePictureUrl !== undefined &&
      (obj.profilePictureUrl = message.profilePictureUrl
        ? StringValue.toJSON(message.profilePictureUrl)
        : undefined);
    message.profilePictureHash !== undefined &&
      (obj.profilePictureHash = message.profilePictureHash
        ? StringValue.toJSON(message.profilePictureHash)
        : undefined);
    return obj;
  },
};

const baseQuestionGroup: object = {
  id: 0,
  eventId: 0,
  type: 0,
  seq: 0,
  title: "",
};

export const QuestionGroup = {
  fromJSON(object: any): QuestionGroup {
    const message = { ...baseQuestionGroup } as QuestionGroup;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    if (object.type !== undefined && object.type !== null) {
      message.type = questionGroupTypeFromJSON(object.type);
    } else {
      message.type = 0;
    }
    if (object.seq !== undefined && object.seq !== null) {
      message.seq = Number(object.seq);
    } else {
      message.seq = 0;
    }
    if (object.title !== undefined && object.title !== null) {
      message.title = String(object.title);
    } else {
      message.title = "";
    }
    return message;
  },

  toJSON(message: QuestionGroup): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    message.type !== undefined &&
      (obj.type = questionGroupTypeToJSON(message.type));
    message.seq !== undefined && (obj.seq = message.seq);
    message.title !== undefined && (obj.title = message.title);
    return obj;
  },
};

const baseQuestion: object = {
  id: 0,
  questionGroupId: 0,
  seq: 0,
  answerType: 0,
  isOptional: false,
  title: "",
  subtitle: "",
};

export const Question = {
  fromJSON(object: any): Question {
    const message = { ...baseQuestion } as Question;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (
      object.questionGroupId !== undefined &&
      object.questionGroupId !== null
    ) {
      message.questionGroupId = Number(object.questionGroupId);
    } else {
      message.questionGroupId = 0;
    }
    if (object.seq !== undefined && object.seq !== null) {
      message.seq = Number(object.seq);
    } else {
      message.seq = 0;
    }
    if (object.answerType !== undefined && object.answerType !== null) {
      message.answerType = answerTypeFromJSON(object.answerType);
    } else {
      message.answerType = 0;
    }
    if (object.isOptional !== undefined && object.isOptional !== null) {
      message.isOptional = Boolean(object.isOptional);
    } else {
      message.isOptional = false;
    }
    if (object.title !== undefined && object.title !== null) {
      message.title = String(object.title);
    } else {
      message.title = "";
    }
    if (object.subtitle !== undefined && object.subtitle !== null) {
      message.subtitle = String(object.subtitle);
    } else {
      message.subtitle = "";
    }
    return message;
  },

  toJSON(message: Question): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.questionGroupId !== undefined &&
      (obj.questionGroupId = message.questionGroupId);
    message.seq !== undefined && (obj.seq = message.seq);
    message.answerType !== undefined &&
      (obj.answerType = answerTypeToJSON(message.answerType));
    message.isOptional !== undefined && (obj.isOptional = message.isOptional);
    message.title !== undefined && (obj.title = message.title);
    message.subtitle !== undefined && (obj.subtitle = message.subtitle);
    return obj;
  },
};

const baseUserOrganization: object = { id: 0, userId: 0, organizationId: 0 };

export const UserOrganization = {
  fromJSON(object: any): UserOrganization {
    const message = { ...baseUserOrganization } as UserOrganization;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    return message;
  },

  toJSON(message: UserOrganization): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    return obj;
  },
};

const baseEvent: object = {
  id: 0,
  organizationId: 0,
  description: "",
  name: "",
  attendeeLimit: 0,
};

export const Event = {
  fromJSON(object: any): Event {
    const message = { ...baseEvent } as Event;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    if (object.locationId !== undefined && object.locationId !== null) {
      message.locationId = Int32Value.fromJSON(object.locationId);
    } else {
      message.locationId = undefined;
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = String(object.description);
    } else {
      message.description = "";
    }
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.coverImageUrl !== undefined && object.coverImageUrl !== null) {
      message.coverImageUrl = StringValue.fromJSON(object.coverImageUrl);
    } else {
      message.coverImageUrl = undefined;
    }
    if (object.coverImageHash !== undefined && object.coverImageHash !== null) {
      message.coverImageHash = StringValue.fromJSON(object.coverImageHash);
    } else {
      message.coverImageHash = undefined;
    }
    if (object.posterImageUrl !== undefined && object.posterImageUrl !== null) {
      message.posterImageUrl = StringValue.fromJSON(object.posterImageUrl);
    } else {
      message.posterImageUrl = undefined;
    }
    if (
      object.posterImageHash !== undefined &&
      object.posterImageHash !== null
    ) {
      message.posterImageHash = StringValue.fromJSON(object.posterImageHash);
    } else {
      message.posterImageHash = undefined;
    }
    if (object.contact !== undefined && object.contact !== null) {
      message.contact = StringValue.fromJSON(object.contact);
    } else {
      message.contact = undefined;
    }
    if (
      object.profileImageUrl !== undefined &&
      object.profileImageUrl !== null
    ) {
      message.profileImageUrl = StringValue.fromJSON(object.profileImageUrl);
    } else {
      message.profileImageUrl = undefined;
    }
    if (
      object.profileImageHash !== undefined &&
      object.profileImageHash !== null
    ) {
      message.profileImageHash = StringValue.fromJSON(object.profileImageHash);
    } else {
      message.profileImageHash = undefined;
    }
    if (object.attendeeLimit !== undefined && object.attendeeLimit !== null) {
      message.attendeeLimit = Number(object.attendeeLimit);
    } else {
      message.attendeeLimit = 0;
    }
    if (
      object.registrationDueDate !== undefined &&
      object.registrationDueDate !== null
    ) {
      message.registrationDueDate = fromJsonTimestamp(
        object.registrationDueDate
      );
    } else {
      message.registrationDueDate = undefined;
    }
    return message;
  },

  toJSON(message: Event): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.locationId !== undefined &&
      (obj.locationId = message.locationId
        ? Int32Value.toJSON(message.locationId)
        : undefined);
    message.description !== undefined &&
      (obj.description = message.description);
    message.name !== undefined && (obj.name = message.name);
    message.coverImageUrl !== undefined &&
      (obj.coverImageUrl = message.coverImageUrl
        ? StringValue.toJSON(message.coverImageUrl)
        : undefined);
    message.coverImageHash !== undefined &&
      (obj.coverImageHash = message.coverImageHash
        ? StringValue.toJSON(message.coverImageHash)
        : undefined);
    message.posterImageUrl !== undefined &&
      (obj.posterImageUrl = message.posterImageUrl
        ? StringValue.toJSON(message.posterImageUrl)
        : undefined);
    message.posterImageHash !== undefined &&
      (obj.posterImageHash = message.posterImageHash
        ? StringValue.toJSON(message.posterImageHash)
        : undefined);
    message.contact !== undefined &&
      (obj.contact = message.contact
        ? StringValue.toJSON(message.contact)
        : undefined);
    message.profileImageUrl !== undefined &&
      (obj.profileImageUrl = message.profileImageUrl
        ? StringValue.toJSON(message.profileImageUrl)
        : undefined);
    message.profileImageHash !== undefined &&
      (obj.profileImageHash = message.profileImageHash
        ? StringValue.toJSON(message.profileImageHash)
        : undefined);
    message.attendeeLimit !== undefined &&
      (obj.attendeeLimit = message.attendeeLimit);
    message.registrationDueDate !== undefined &&
      (obj.registrationDueDate =
        message.registrationDueDate !== undefined
          ? fromTimestamp(message.registrationDueDate).toISOString()
          : null);
    return obj;
  },
};

const baseLocation: object = {
  id: 0,
  name: "",
  googleMapUrl: "",
  isOnline: false,
};

export const Location = {
  fromJSON(object: any): Location {
    const message = { ...baseLocation } as Location;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.googleMapUrl !== undefined && object.googleMapUrl !== null) {
      message.googleMapUrl = String(object.googleMapUrl);
    } else {
      message.googleMapUrl = "";
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = StringValue.fromJSON(object.description);
    } else {
      message.description = undefined;
    }
    if (
      object.travelInformationImageUrl !== undefined &&
      object.travelInformationImageUrl !== null
    ) {
      message.travelInformationImageUrl = StringValue.fromJSON(
        object.travelInformationImageUrl
      );
    } else {
      message.travelInformationImageUrl = undefined;
    }
    if (
      object.travelInformationImageHash !== undefined &&
      object.travelInformationImageHash !== null
    ) {
      message.travelInformationImageHash = StringValue.fromJSON(
        object.travelInformationImageHash
      );
    } else {
      message.travelInformationImageHash = undefined;
    }
    if (object.isOnline !== undefined && object.isOnline !== null) {
      message.isOnline = Boolean(object.isOnline);
    } else {
      message.isOnline = false;
    }
    return message;
  },

  toJSON(message: Location): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.name !== undefined && (obj.name = message.name);
    message.googleMapUrl !== undefined &&
      (obj.googleMapUrl = message.googleMapUrl);
    message.description !== undefined &&
      (obj.description = message.description
        ? StringValue.toJSON(message.description)
        : undefined);
    message.travelInformationImageUrl !== undefined &&
      (obj.travelInformationImageUrl = message.travelInformationImageUrl
        ? StringValue.toJSON(message.travelInformationImageUrl)
        : undefined);
    message.travelInformationImageHash !== undefined &&
      (obj.travelInformationImageHash = message.travelInformationImageHash
        ? StringValue.toJSON(message.travelInformationImageHash)
        : undefined);
    message.isOnline !== undefined && (obj.isOnline = message.isOnline);
    return obj;
  },
};

const baseAnswer: object = { id: 0, userEventId: 0, questionId: 0, value: "" };

export const Answer = {
  fromJSON(object: any): Answer {
    const message = { ...baseAnswer } as Answer;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.userEventId !== undefined && object.userEventId !== null) {
      message.userEventId = Number(object.userEventId);
    } else {
      message.userEventId = 0;
    }
    if (object.questionId !== undefined && object.questionId !== null) {
      message.questionId = Number(object.questionId);
    } else {
      message.questionId = 0;
    }
    if (object.value !== undefined && object.value !== null) {
      message.value = String(object.value);
    } else {
      message.value = "";
    }
    return message;
  },

  toJSON(message: Answer): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.userEventId !== undefined &&
      (obj.userEventId = message.userEventId);
    message.questionId !== undefined && (obj.questionId = message.questionId);
    message.value !== undefined && (obj.value = message.value);
    return obj;
  },
};

const baseUserEvent: object = {
  id: 0,
  userId: 0,
  eventId: 0,
  status: 0,
  isInternal: false,
};

export const UserEvent = {
  fromJSON(object: any): UserEvent {
    const message = { ...baseUserEvent } as UserEvent;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    if (object.rating !== undefined && object.rating !== null) {
      message.rating = Int32Value.fromJSON(object.rating);
    } else {
      message.rating = undefined;
    }
    if (object.ticket !== undefined && object.ticket !== null) {
      message.ticket = StringValue.fromJSON(object.ticket);
    } else {
      message.ticket = undefined;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = userEvent_StatusFromJSON(object.status);
    } else {
      message.status = 0;
    }
    if (object.isInternal !== undefined && object.isInternal !== null) {
      message.isInternal = Boolean(object.isInternal);
    } else {
      message.isInternal = false;
    }
    return message;
  },

  toJSON(message: UserEvent): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    message.rating !== undefined &&
      (obj.rating = message.rating
        ? Int32Value.toJSON(message.rating)
        : undefined);
    message.ticket !== undefined &&
      (obj.ticket = message.ticket
        ? StringValue.toJSON(message.ticket)
        : undefined);
    message.status !== undefined &&
      (obj.status = userEvent_StatusToJSON(message.status));
    message.isInternal !== undefined && (obj.isInternal = message.isInternal);
    return obj;
  },
};

const baseEventDuration: object = { id: 0, eventId: 0 };

export const EventDuration = {
  fromJSON(object: any): EventDuration {
    const message = { ...baseEventDuration } as EventDuration;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    if (object.start !== undefined && object.start !== null) {
      message.start = fromJsonTimestamp(object.start);
    } else {
      message.start = undefined;
    }
    if (object.finish !== undefined && object.finish !== null) {
      message.finish = fromJsonTimestamp(object.finish);
    } else {
      message.finish = undefined;
    }
    return message;
  },

  toJSON(message: EventDuration): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    message.start !== undefined &&
      (obj.start =
        message.start !== undefined
          ? fromTimestamp(message.start).toISOString()
          : null);
    message.finish !== undefined &&
      (obj.finish =
        message.finish !== undefined
          ? fromTimestamp(message.finish).toISOString()
          : null);
    return obj;
  },
};

const baseTag: object = { id: 0, name: "", imageUrl: "", imageHash: "" };

export const Tag = {
  fromJSON(object: any): Tag {
    const message = { ...baseTag } as Tag;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.imageUrl !== undefined && object.imageUrl !== null) {
      message.imageUrl = String(object.imageUrl);
    } else {
      message.imageUrl = "";
    }
    if (object.imageHash !== undefined && object.imageHash !== null) {
      message.imageHash = String(object.imageHash);
    } else {
      message.imageHash = "";
    }
    return message;
  },

  toJSON(message: Tag): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.name !== undefined && (obj.name = message.name);
    message.imageUrl !== undefined && (obj.imageUrl = message.imageUrl);
    message.imageHash !== undefined && (obj.imageHash = message.imageHash);
    return obj;
  },
};

const baseEventTag: object = { id: 0, eventId: 0, tagId: 0 };

export const EventTag = {
  fromJSON(object: any): EventTag {
    const message = { ...baseEventTag } as EventTag;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    if (object.tagId !== undefined && object.tagId !== null) {
      message.tagId = Number(object.tagId);
    } else {
      message.tagId = 0;
    }
    return message;
  },

  toJSON(message: EventTag): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    message.tagId !== undefined && (obj.tagId = message.tagId);
    return obj;
  },
};

const baseOrganizationPermission: object = {
  id: 0,
  organizationId: 0,
  permission: 0,
};

export const OrganizationPermission = {
  fromJSON(object: any): OrganizationPermission {
    const message = { ...baseOrganizationPermission } as OrganizationPermission;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    if (object.permission !== undefined && object.permission !== null) {
      message.permission = permissionFromJSON(object.permission);
    } else {
      message.permission = 0;
    }
    return message;
  },

  toJSON(message: OrganizationPermission): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.permission !== undefined &&
      (obj.permission = permissionToJSON(message.permission));
    return obj;
  },
};

const baseUserPermission: object = { id: 0, userId: 0, permissionName: 0 };

export const UserPermission = {
  fromJSON(object: any): UserPermission {
    const message = { ...baseUserPermission } as UserPermission;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.permissionName !== undefined && object.permissionName !== null) {
      message.permissionName = permissionFromJSON(object.permissionName);
    } else {
      message.permissionName = 0;
    }
    return message;
  },

  toJSON(message: UserPermission): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.userId !== undefined && (obj.userId = message.userId);
    message.permissionName !== undefined &&
      (obj.permissionName = permissionToJSON(message.permissionName));
    return obj;
  },
};

const baseUserInterest: object = { id: 0, userId: 0, tagId: 0 };

export const UserInterest = {
  fromJSON(object: any): UserInterest {
    const message = { ...baseUserInterest } as UserInterest;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.tagId !== undefined && object.tagId !== null) {
      message.tagId = Number(object.tagId);
    } else {
      message.tagId = 0;
    }
    return message;
  },

  toJSON(message: UserInterest): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.userId !== undefined && (obj.userId = message.userId);
    message.tagId !== undefined && (obj.tagId = message.tagId);
    return obj;
  },
};

const baseFacilityRequest: object = {
  id: 0,
  eventId: 0,
  facilityId: 0,
  status: 0,
};

export const FacilityRequest = {
  fromJSON(object: any): FacilityRequest {
    const message = { ...baseFacilityRequest } as FacilityRequest;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = Number(object.eventId);
    } else {
      message.eventId = 0;
    }
    if (object.facilityId !== undefined && object.facilityId !== null) {
      message.facilityId = Number(object.facilityId);
    } else {
      message.facilityId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = facilityRequest_StatusFromJSON(object.status);
    } else {
      message.status = 0;
    }
    if (object.rejectReason !== undefined && object.rejectReason !== null) {
      message.rejectReason = StringValue.fromJSON(object.rejectReason);
    } else {
      message.rejectReason = undefined;
    }
    if (object.start !== undefined && object.start !== null) {
      message.start = fromJsonTimestamp(object.start);
    } else {
      message.start = undefined;
    }
    if (object.finish !== undefined && object.finish !== null) {
      message.finish = fromJsonTimestamp(object.finish);
    } else {
      message.finish = undefined;
    }
    return message;
  },

  toJSON(message: FacilityRequest): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    message.facilityId !== undefined && (obj.facilityId = message.facilityId);
    message.status !== undefined &&
      (obj.status = facilityRequest_StatusToJSON(message.status));
    message.rejectReason !== undefined &&
      (obj.rejectReason = message.rejectReason
        ? StringValue.toJSON(message.rejectReason)
        : undefined);
    message.start !== undefined &&
      (obj.start =
        message.start !== undefined
          ? fromTimestamp(message.start).toISOString()
          : null);
    message.finish !== undefined &&
      (obj.finish =
        message.finish !== undefined
          ? fromTimestamp(message.finish).toISOString()
          : null);
    return obj;
  },
};

const baseFacility: object = {
  id: 0,
  organizationId: 0,
  name: "",
  latitude: 0,
  longitude: 0,
  description: "",
};

export const Facility = {
  fromJSON(object: any): Facility {
    const message = { ...baseFacility } as Facility;
    message.operatingHours = [];
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.latitude !== undefined && object.latitude !== null) {
      message.latitude = Number(object.latitude);
    } else {
      message.latitude = 0;
    }
    if (object.longitude !== undefined && object.longitude !== null) {
      message.longitude = Number(object.longitude);
    } else {
      message.longitude = 0;
    }
    if (object.operatingHours !== undefined && object.operatingHours !== null) {
      for (const e of object.operatingHours) {
        message.operatingHours.push(OperatingHour.fromJSON(e));
      }
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = String(object.description);
    } else {
      message.description = "";
    }
    return message;
  },

  toJSON(message: Facility): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.name !== undefined && (obj.name = message.name);
    message.latitude !== undefined && (obj.latitude = message.latitude);
    message.longitude !== undefined && (obj.longitude = message.longitude);
    if (message.operatingHours) {
      obj.operatingHours = message.operatingHours.map((e) =>
        e ? OperatingHour.toJSON(e) : undefined
      );
    } else {
      obj.operatingHours = [];
    }
    message.description !== undefined &&
      (obj.description = message.description);
    return obj;
  },
};

const baseGetObjectByIdRequest: object = { id: 0 };

export const GetObjectByIdRequest = {
  fromJSON(object: any): GetObjectByIdRequest {
    const message = { ...baseGetObjectByIdRequest } as GetObjectByIdRequest;
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    return message;
  },

  toJSON(message: GetObjectByIdRequest): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    return obj;
  },
};

const baseGetObjectByNameRequest: object = { name: "" };

export const GetObjectByNameRequest = {
  fromJSON(object: any): GetObjectByNameRequest {
    const message = { ...baseGetObjectByNameRequest } as GetObjectByNameRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    return message;
  },

  toJSON(message: GetObjectByNameRequest): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    return obj;
  },
};

function toTimestamp(date: Date): Timestamp {
  const seconds = date.getTime() / 1_000;
  const nanos = (date.getTime() % 1_000) * 1_000_000;
  return { seconds, nanos };
}

function fromTimestamp(t: Timestamp): Date {
  let millis = t.seconds * 1_000;
  millis += t.nanos / 1_000_000;
  return new Date(millis);
}

function fromJsonTimestamp(o: any): Timestamp {
  if (o instanceof Date) {
    return toTimestamp(o);
  } else if (typeof o === "string") {
    return toTimestamp(new Date(o));
  } else {
    return Timestamp.fromJSON(o);
  }
}

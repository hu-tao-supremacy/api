/* eslint-disable */
import { Timestamp } from "../../google/protobuf/timestamp";
import { Writer, Reader } from "protobufjs/minimal";
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
  nickname: string | undefined;
  chulaId: string | undefined;
  isChulaStudent: boolean;
  gender: Gender;
  address: string | undefined;
  profilePictureUrl: string | undefined;
  didSetup: boolean;
  district: string | undefined;
  zipCode: string | undefined;
  phoneNumber: string | undefined;
  province: string | undefined;
  academicYear: number | undefined;
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
  contact: string | undefined;
  profileImageUrl: string | undefined;
  profileImageHash: string | undefined;
  attendeeLimit: number;
  registrationDueDate: Date | undefined;
}

export interface Location {
  id: number;
  name: string;
  googleMapUrl: string;
  description: string | undefined;
  travelInformationImageUrl: string | undefined;
  travelInformationImageHash: string | undefined;
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
  rating: number | undefined;
  ticket: string | undefined;
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
    default:
      return "UNKNOWN";
  }
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
  rejectReason: string | undefined;
  start: Date | undefined;
  finish: Date | undefined;
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

const baseOperatingHour: object = { startHour: 0, finishHour: 0, day: 0 };

export const OperatingHour = {
  encode(message: OperatingHour, writer: Writer = Writer.create()): Writer {
    if (message.startHour !== 0) {
      writer.uint32(8).int32(message.startHour);
    }
    if (message.finishHour !== 0) {
      writer.uint32(16).int32(message.finishHour);
    }
    if (message.day !== 0) {
      writer.uint32(24).int32(message.day);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): OperatingHour {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseOperatingHour } as OperatingHour;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.startHour = reader.int32();
          break;
        case 2:
          message.finishHour = reader.int32();
          break;
        case 3:
          message.day = reader.int32() as any;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(object: DeepPartial<OperatingHour>): OperatingHour {
    const message = { ...baseOperatingHour } as OperatingHour;
    if (object.startHour !== undefined && object.startHour !== null) {
      message.startHour = object.startHour;
    } else {
      message.startHour = 0;
    }
    if (object.finishHour !== undefined && object.finishHour !== null) {
      message.finishHour = object.finishHour;
    } else {
      message.finishHour = 0;
    }
    if (object.day !== undefined && object.day !== null) {
      message.day = object.day;
    } else {
      message.day = 0;
    }
    return message;
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
  encode(message: User, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.firstName !== "") {
      writer.uint32(18).string(message.firstName);
    }
    if (message.lastName !== "") {
      writer.uint32(26).string(message.lastName);
    }
    if (message.email !== "") {
      writer.uint32(34).string(message.email);
    }
    if (message.nickname !== undefined) {
      StringValue.encode(
        { value: message.nickname! },
        writer.uint32(42).fork()
      ).ldelim();
    }
    if (message.chulaId !== undefined) {
      StringValue.encode(
        { value: message.chulaId! },
        writer.uint32(50).fork()
      ).ldelim();
    }
    if (message.isChulaStudent === true) {
      writer.uint32(56).bool(message.isChulaStudent);
    }
    if (message.gender !== 0) {
      writer.uint32(64).int32(message.gender);
    }
    if (message.address !== undefined) {
      StringValue.encode(
        { value: message.address! },
        writer.uint32(74).fork()
      ).ldelim();
    }
    if (message.profilePictureUrl !== undefined) {
      StringValue.encode(
        { value: message.profilePictureUrl! },
        writer.uint32(82).fork()
      ).ldelim();
    }
    if (message.didSetup === true) {
      writer.uint32(88).bool(message.didSetup);
    }
    if (message.district !== undefined) {
      StringValue.encode(
        { value: message.district! },
        writer.uint32(98).fork()
      ).ldelim();
    }
    if (message.zipCode !== undefined) {
      StringValue.encode(
        { value: message.zipCode! },
        writer.uint32(106).fork()
      ).ldelim();
    }
    if (message.phoneNumber !== undefined) {
      StringValue.encode(
        { value: message.phoneNumber! },
        writer.uint32(114).fork()
      ).ldelim();
    }
    if (message.province !== undefined) {
      StringValue.encode(
        { value: message.province! },
        writer.uint32(122).fork()
      ).ldelim();
    }
    if (message.academicYear !== undefined) {
      Int32Value.encode(
        { value: message.academicYear! },
        writer.uint32(130).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): User {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUser } as User;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.firstName = reader.string();
          break;
        case 3:
          message.lastName = reader.string();
          break;
        case 4:
          message.email = reader.string();
          break;
        case 5:
          message.nickname = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 6:
          message.chulaId = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 7:
          message.isChulaStudent = reader.bool();
          break;
        case 8:
          message.gender = reader.int32() as any;
          break;
        case 9:
          message.address = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 10:
          message.profilePictureUrl = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 11:
          message.didSetup = reader.bool();
          break;
        case 12:
          message.district = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 13:
          message.zipCode = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 14:
          message.phoneNumber = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 15:
          message.province = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 16:
          message.academicYear = Int32Value.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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
      message.nickname = String(object.nickname);
    } else {
      message.nickname = undefined;
    }
    if (object.chulaId !== undefined && object.chulaId !== null) {
      message.chulaId = String(object.chulaId);
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
      message.address = String(object.address);
    } else {
      message.address = undefined;
    }
    if (
      object.profilePictureUrl !== undefined &&
      object.profilePictureUrl !== null
    ) {
      message.profilePictureUrl = String(object.profilePictureUrl);
    } else {
      message.profilePictureUrl = undefined;
    }
    if (object.didSetup !== undefined && object.didSetup !== null) {
      message.didSetup = Boolean(object.didSetup);
    } else {
      message.didSetup = false;
    }
    if (object.district !== undefined && object.district !== null) {
      message.district = String(object.district);
    } else {
      message.district = undefined;
    }
    if (object.zipCode !== undefined && object.zipCode !== null) {
      message.zipCode = String(object.zipCode);
    } else {
      message.zipCode = undefined;
    }
    if (object.phoneNumber !== undefined && object.phoneNumber !== null) {
      message.phoneNumber = String(object.phoneNumber);
    } else {
      message.phoneNumber = undefined;
    }
    if (object.province !== undefined && object.province !== null) {
      message.province = String(object.province);
    } else {
      message.province = undefined;
    }
    if (object.academicYear !== undefined && object.academicYear !== null) {
      message.academicYear = Number(object.academicYear);
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
    message.nickname !== undefined && (obj.nickname = message.nickname);
    message.chulaId !== undefined && (obj.chulaId = message.chulaId);
    message.isChulaStudent !== undefined &&
      (obj.isChulaStudent = message.isChulaStudent);
    message.gender !== undefined && (obj.gender = genderToJSON(message.gender));
    message.address !== undefined && (obj.address = message.address);
    message.profilePictureUrl !== undefined &&
      (obj.profilePictureUrl = message.profilePictureUrl);
    message.didSetup !== undefined && (obj.didSetup = message.didSetup);
    message.district !== undefined && (obj.district = message.district);
    message.zipCode !== undefined && (obj.zipCode = message.zipCode);
    message.phoneNumber !== undefined &&
      (obj.phoneNumber = message.phoneNumber);
    message.province !== undefined && (obj.province = message.province);
    message.academicYear !== undefined &&
      (obj.academicYear = message.academicYear);
    return obj;
  },

  fromPartial(object: DeepPartial<User>): User {
    const message = { ...baseUser } as User;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.firstName !== undefined && object.firstName !== null) {
      message.firstName = object.firstName;
    } else {
      message.firstName = "";
    }
    if (object.lastName !== undefined && object.lastName !== null) {
      message.lastName = object.lastName;
    } else {
      message.lastName = "";
    }
    if (object.email !== undefined && object.email !== null) {
      message.email = object.email;
    } else {
      message.email = "";
    }
    if (object.nickname !== undefined && object.nickname !== null) {
      message.nickname = object.nickname;
    } else {
      message.nickname = undefined;
    }
    if (object.chulaId !== undefined && object.chulaId !== null) {
      message.chulaId = object.chulaId;
    } else {
      message.chulaId = undefined;
    }
    if (object.isChulaStudent !== undefined && object.isChulaStudent !== null) {
      message.isChulaStudent = object.isChulaStudent;
    } else {
      message.isChulaStudent = false;
    }
    if (object.gender !== undefined && object.gender !== null) {
      message.gender = object.gender;
    } else {
      message.gender = 0;
    }
    if (object.address !== undefined && object.address !== null) {
      message.address = object.address;
    } else {
      message.address = undefined;
    }
    if (
      object.profilePictureUrl !== undefined &&
      object.profilePictureUrl !== null
    ) {
      message.profilePictureUrl = object.profilePictureUrl;
    } else {
      message.profilePictureUrl = undefined;
    }
    if (object.didSetup !== undefined && object.didSetup !== null) {
      message.didSetup = object.didSetup;
    } else {
      message.didSetup = false;
    }
    if (object.district !== undefined && object.district !== null) {
      message.district = object.district;
    } else {
      message.district = undefined;
    }
    if (object.zipCode !== undefined && object.zipCode !== null) {
      message.zipCode = object.zipCode;
    } else {
      message.zipCode = undefined;
    }
    if (object.phoneNumber !== undefined && object.phoneNumber !== null) {
      message.phoneNumber = object.phoneNumber;
    } else {
      message.phoneNumber = undefined;
    }
    if (object.province !== undefined && object.province !== null) {
      message.province = object.province;
    } else {
      message.province = undefined;
    }
    if (object.academicYear !== undefined && object.academicYear !== null) {
      message.academicYear = object.academicYear;
    } else {
      message.academicYear = undefined;
    }
    return message;
  },
};

const baseOrganization: object = { id: 0, name: "", isVerified: false };

export const Organization = {
  encode(message: Organization, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.name !== "") {
      writer.uint32(18).string(message.name);
    }
    if (message.isVerified === true) {
      writer.uint32(24).bool(message.isVerified);
    }
    if (message.abbreviation !== undefined) {
      StringValue.encode(
        { value: message.abbreviation! },
        writer.uint32(34).fork()
      ).ldelim();
    }
    if (message.advisor !== undefined) {
      StringValue.encode(
        { value: message.advisor! },
        writer.uint32(42).fork()
      ).ldelim();
    }
    if (message.associatedFaculty !== undefined) {
      StringValue.encode(
        { value: message.associatedFaculty! },
        writer.uint32(50).fork()
      ).ldelim();
    }
    if (message.description !== undefined) {
      StringValue.encode(
        { value: message.description! },
        writer.uint32(58).fork()
      ).ldelim();
    }
    if (message.facebookPage !== undefined) {
      StringValue.encode(
        { value: message.facebookPage! },
        writer.uint32(66).fork()
      ).ldelim();
    }
    if (message.instagram !== undefined) {
      StringValue.encode(
        { value: message.instagram! },
        writer.uint32(74).fork()
      ).ldelim();
    }
    if (message.lineOfficialAccount !== undefined) {
      StringValue.encode(
        { value: message.lineOfficialAccount! },
        writer.uint32(82).fork()
      ).ldelim();
    }
    if (message.email !== undefined) {
      StringValue.encode(
        { value: message.email! },
        writer.uint32(90).fork()
      ).ldelim();
    }
    if (message.contactFullName !== undefined) {
      StringValue.encode(
        { value: message.contactFullName! },
        writer.uint32(98).fork()
      ).ldelim();
    }
    if (message.contactEmail !== undefined) {
      StringValue.encode(
        { value: message.contactEmail! },
        writer.uint32(106).fork()
      ).ldelim();
    }
    if (message.contactPhoneNumber !== undefined) {
      StringValue.encode(
        { value: message.contactPhoneNumber! },
        writer.uint32(114).fork()
      ).ldelim();
    }
    if (message.contactLineId !== undefined) {
      StringValue.encode(
        { value: message.contactLineId! },
        writer.uint32(122).fork()
      ).ldelim();
    }
    if (message.profilePictureUrl !== undefined) {
      StringValue.encode(
        { value: message.profilePictureUrl! },
        writer.uint32(130).fork()
      ).ldelim();
    }
    if (message.profilePictureHash !== undefined) {
      StringValue.encode(
        { value: message.profilePictureHash! },
        writer.uint32(138).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): Organization {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseOrganization } as Organization;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.name = reader.string();
          break;
        case 3:
          message.isVerified = reader.bool();
          break;
        case 4:
          message.abbreviation = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 5:
          message.advisor = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 6:
          message.associatedFaculty = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 7:
          message.description = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 8:
          message.facebookPage = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 9:
          message.instagram = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 10:
          message.lineOfficialAccount = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 11:
          message.email = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 12:
          message.contactFullName = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 13:
          message.contactEmail = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 14:
          message.contactPhoneNumber = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 15:
          message.contactLineId = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 16:
          message.profilePictureUrl = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 17:
          message.profilePictureHash = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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
      message.abbreviation = String(object.abbreviation);
    } else {
      message.abbreviation = undefined;
    }
    if (object.advisor !== undefined && object.advisor !== null) {
      message.advisor = String(object.advisor);
    } else {
      message.advisor = undefined;
    }
    if (
      object.associatedFaculty !== undefined &&
      object.associatedFaculty !== null
    ) {
      message.associatedFaculty = String(object.associatedFaculty);
    } else {
      message.associatedFaculty = undefined;
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = String(object.description);
    } else {
      message.description = undefined;
    }
    if (object.facebookPage !== undefined && object.facebookPage !== null) {
      message.facebookPage = String(object.facebookPage);
    } else {
      message.facebookPage = undefined;
    }
    if (object.instagram !== undefined && object.instagram !== null) {
      message.instagram = String(object.instagram);
    } else {
      message.instagram = undefined;
    }
    if (
      object.lineOfficialAccount !== undefined &&
      object.lineOfficialAccount !== null
    ) {
      message.lineOfficialAccount = String(object.lineOfficialAccount);
    } else {
      message.lineOfficialAccount = undefined;
    }
    if (object.email !== undefined && object.email !== null) {
      message.email = String(object.email);
    } else {
      message.email = undefined;
    }
    if (
      object.contactFullName !== undefined &&
      object.contactFullName !== null
    ) {
      message.contactFullName = String(object.contactFullName);
    } else {
      message.contactFullName = undefined;
    }
    if (object.contactEmail !== undefined && object.contactEmail !== null) {
      message.contactEmail = String(object.contactEmail);
    } else {
      message.contactEmail = undefined;
    }
    if (
      object.contactPhoneNumber !== undefined &&
      object.contactPhoneNumber !== null
    ) {
      message.contactPhoneNumber = String(object.contactPhoneNumber);
    } else {
      message.contactPhoneNumber = undefined;
    }
    if (object.contactLineId !== undefined && object.contactLineId !== null) {
      message.contactLineId = String(object.contactLineId);
    } else {
      message.contactLineId = undefined;
    }
    if (
      object.profilePictureUrl !== undefined &&
      object.profilePictureUrl !== null
    ) {
      message.profilePictureUrl = String(object.profilePictureUrl);
    } else {
      message.profilePictureUrl = undefined;
    }
    if (
      object.profilePictureHash !== undefined &&
      object.profilePictureHash !== null
    ) {
      message.profilePictureHash = String(object.profilePictureHash);
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
      (obj.abbreviation = message.abbreviation);
    message.advisor !== undefined && (obj.advisor = message.advisor);
    message.associatedFaculty !== undefined &&
      (obj.associatedFaculty = message.associatedFaculty);
    message.description !== undefined &&
      (obj.description = message.description);
    message.facebookPage !== undefined &&
      (obj.facebookPage = message.facebookPage);
    message.instagram !== undefined && (obj.instagram = message.instagram);
    message.lineOfficialAccount !== undefined &&
      (obj.lineOfficialAccount = message.lineOfficialAccount);
    message.email !== undefined && (obj.email = message.email);
    message.contactFullName !== undefined &&
      (obj.contactFullName = message.contactFullName);
    message.contactEmail !== undefined &&
      (obj.contactEmail = message.contactEmail);
    message.contactPhoneNumber !== undefined &&
      (obj.contactPhoneNumber = message.contactPhoneNumber);
    message.contactLineId !== undefined &&
      (obj.contactLineId = message.contactLineId);
    message.profilePictureUrl !== undefined &&
      (obj.profilePictureUrl = message.profilePictureUrl);
    message.profilePictureHash !== undefined &&
      (obj.profilePictureHash = message.profilePictureHash);
    return obj;
  },

  fromPartial(object: DeepPartial<Organization>): Organization {
    const message = { ...baseOrganization } as Organization;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    if (object.isVerified !== undefined && object.isVerified !== null) {
      message.isVerified = object.isVerified;
    } else {
      message.isVerified = false;
    }
    if (object.abbreviation !== undefined && object.abbreviation !== null) {
      message.abbreviation = object.abbreviation;
    } else {
      message.abbreviation = undefined;
    }
    if (object.advisor !== undefined && object.advisor !== null) {
      message.advisor = object.advisor;
    } else {
      message.advisor = undefined;
    }
    if (
      object.associatedFaculty !== undefined &&
      object.associatedFaculty !== null
    ) {
      message.associatedFaculty = object.associatedFaculty;
    } else {
      message.associatedFaculty = undefined;
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = object.description;
    } else {
      message.description = undefined;
    }
    if (object.facebookPage !== undefined && object.facebookPage !== null) {
      message.facebookPage = object.facebookPage;
    } else {
      message.facebookPage = undefined;
    }
    if (object.instagram !== undefined && object.instagram !== null) {
      message.instagram = object.instagram;
    } else {
      message.instagram = undefined;
    }
    if (
      object.lineOfficialAccount !== undefined &&
      object.lineOfficialAccount !== null
    ) {
      message.lineOfficialAccount = object.lineOfficialAccount;
    } else {
      message.lineOfficialAccount = undefined;
    }
    if (object.email !== undefined && object.email !== null) {
      message.email = object.email;
    } else {
      message.email = undefined;
    }
    if (
      object.contactFullName !== undefined &&
      object.contactFullName !== null
    ) {
      message.contactFullName = object.contactFullName;
    } else {
      message.contactFullName = undefined;
    }
    if (object.contactEmail !== undefined && object.contactEmail !== null) {
      message.contactEmail = object.contactEmail;
    } else {
      message.contactEmail = undefined;
    }
    if (
      object.contactPhoneNumber !== undefined &&
      object.contactPhoneNumber !== null
    ) {
      message.contactPhoneNumber = object.contactPhoneNumber;
    } else {
      message.contactPhoneNumber = undefined;
    }
    if (object.contactLineId !== undefined && object.contactLineId !== null) {
      message.contactLineId = object.contactLineId;
    } else {
      message.contactLineId = undefined;
    }
    if (
      object.profilePictureUrl !== undefined &&
      object.profilePictureUrl !== null
    ) {
      message.profilePictureUrl = object.profilePictureUrl;
    } else {
      message.profilePictureUrl = undefined;
    }
    if (
      object.profilePictureHash !== undefined &&
      object.profilePictureHash !== null
    ) {
      message.profilePictureHash = object.profilePictureHash;
    } else {
      message.profilePictureHash = undefined;
    }
    return message;
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
  encode(message: QuestionGroup, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
    }
    if (message.type !== 0) {
      writer.uint32(24).int32(message.type);
    }
    if (message.seq !== 0) {
      writer.uint32(32).int32(message.seq);
    }
    if (message.title !== "") {
      writer.uint32(42).string(message.title);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): QuestionGroup {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseQuestionGroup } as QuestionGroup;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.eventId = reader.int32();
          break;
        case 3:
          message.type = reader.int32() as any;
          break;
        case 4:
          message.seq = reader.int32();
          break;
        case 5:
          message.title = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(object: DeepPartial<QuestionGroup>): QuestionGroup {
    const message = { ...baseQuestionGroup } as QuestionGroup;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    if (object.type !== undefined && object.type !== null) {
      message.type = object.type;
    } else {
      message.type = 0;
    }
    if (object.seq !== undefined && object.seq !== null) {
      message.seq = object.seq;
    } else {
      message.seq = 0;
    }
    if (object.title !== undefined && object.title !== null) {
      message.title = object.title;
    } else {
      message.title = "";
    }
    return message;
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
  encode(message: Question, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.questionGroupId !== 0) {
      writer.uint32(16).int32(message.questionGroupId);
    }
    if (message.seq !== 0) {
      writer.uint32(24).int32(message.seq);
    }
    if (message.answerType !== 0) {
      writer.uint32(32).int32(message.answerType);
    }
    if (message.isOptional === true) {
      writer.uint32(40).bool(message.isOptional);
    }
    if (message.title !== "") {
      writer.uint32(50).string(message.title);
    }
    if (message.subtitle !== "") {
      writer.uint32(58).string(message.subtitle);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): Question {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseQuestion } as Question;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.questionGroupId = reader.int32();
          break;
        case 3:
          message.seq = reader.int32();
          break;
        case 4:
          message.answerType = reader.int32() as any;
          break;
        case 5:
          message.isOptional = reader.bool();
          break;
        case 6:
          message.title = reader.string();
          break;
        case 7:
          message.subtitle = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(object: DeepPartial<Question>): Question {
    const message = { ...baseQuestion } as Question;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (
      object.questionGroupId !== undefined &&
      object.questionGroupId !== null
    ) {
      message.questionGroupId = object.questionGroupId;
    } else {
      message.questionGroupId = 0;
    }
    if (object.seq !== undefined && object.seq !== null) {
      message.seq = object.seq;
    } else {
      message.seq = 0;
    }
    if (object.answerType !== undefined && object.answerType !== null) {
      message.answerType = object.answerType;
    } else {
      message.answerType = 0;
    }
    if (object.isOptional !== undefined && object.isOptional !== null) {
      message.isOptional = object.isOptional;
    } else {
      message.isOptional = false;
    }
    if (object.title !== undefined && object.title !== null) {
      message.title = object.title;
    } else {
      message.title = "";
    }
    if (object.subtitle !== undefined && object.subtitle !== null) {
      message.subtitle = object.subtitle;
    } else {
      message.subtitle = "";
    }
    return message;
  },
};

const baseUserOrganization: object = { id: 0, userId: 0, organizationId: 0 };

export const UserOrganization = {
  encode(message: UserOrganization, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.userId !== 0) {
      writer.uint32(16).int32(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(24).int32(message.organizationId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UserOrganization {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserOrganization } as UserOrganization;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.userId = reader.int32();
          break;
        case 3:
          message.organizationId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(object: DeepPartial<UserOrganization>): UserOrganization {
    const message = { ...baseUserOrganization } as UserOrganization;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = object.organizationId;
    } else {
      message.organizationId = 0;
    }
    return message;
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
  encode(message: Event, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int32(message.organizationId);
    }
    if (message.locationId !== undefined) {
      Int32Value.encode(
        { value: message.locationId! },
        writer.uint32(26).fork()
      ).ldelim();
    }
    if (message.description !== "") {
      writer.uint32(34).string(message.description);
    }
    if (message.name !== "") {
      writer.uint32(42).string(message.name);
    }
    if (message.coverImageUrl !== undefined) {
      StringValue.encode(
        { value: message.coverImageUrl! },
        writer.uint32(50).fork()
      ).ldelim();
    }
    if (message.coverImageHash !== undefined) {
      StringValue.encode(
        { value: message.coverImageHash! },
        writer.uint32(58).fork()
      ).ldelim();
    }
    if (message.posterImageUrl !== undefined) {
      StringValue.encode(
        { value: message.posterImageUrl! },
        writer.uint32(66).fork()
      ).ldelim();
    }
    if (message.posterImageHash !== undefined) {
      StringValue.encode(
        { value: message.posterImageHash! },
        writer.uint32(74).fork()
      ).ldelim();
    }
    if (message.contact !== undefined) {
      StringValue.encode(
        { value: message.contact! },
        writer.uint32(82).fork()
      ).ldelim();
    }
    if (message.profileImageUrl !== undefined) {
      StringValue.encode(
        { value: message.profileImageUrl! },
        writer.uint32(90).fork()
      ).ldelim();
    }
    if (message.profileImageHash !== undefined) {
      StringValue.encode(
        { value: message.profileImageHash! },
        writer.uint32(98).fork()
      ).ldelim();
    }
    if (message.attendeeLimit !== 0) {
      writer.uint32(104).int32(message.attendeeLimit);
    }
    if (message.registrationDueDate !== undefined) {
      Timestamp.encode(
        toTimestamp(message.registrationDueDate),
        writer.uint32(114).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): Event {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseEvent } as Event;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.organizationId = reader.int32();
          break;
        case 3:
          message.locationId = Int32Value.decode(reader, reader.uint32()).value;
          break;
        case 4:
          message.description = reader.string();
          break;
        case 5:
          message.name = reader.string();
          break;
        case 6:
          message.coverImageUrl = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 7:
          message.coverImageHash = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 8:
          message.posterImageUrl = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 9:
          message.posterImageHash = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 10:
          message.contact = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 11:
          message.profileImageUrl = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 12:
          message.profileImageHash = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 13:
          message.attendeeLimit = reader.int32();
          break;
        case 14:
          message.registrationDueDate = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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
      message.locationId = Number(object.locationId);
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
      message.coverImageUrl = String(object.coverImageUrl);
    } else {
      message.coverImageUrl = undefined;
    }
    if (object.coverImageHash !== undefined && object.coverImageHash !== null) {
      message.coverImageHash = String(object.coverImageHash);
    } else {
      message.coverImageHash = undefined;
    }
    if (object.posterImageUrl !== undefined && object.posterImageUrl !== null) {
      message.posterImageUrl = String(object.posterImageUrl);
    } else {
      message.posterImageUrl = undefined;
    }
    if (
      object.posterImageHash !== undefined &&
      object.posterImageHash !== null
    ) {
      message.posterImageHash = String(object.posterImageHash);
    } else {
      message.posterImageHash = undefined;
    }
    if (object.contact !== undefined && object.contact !== null) {
      message.contact = String(object.contact);
    } else {
      message.contact = undefined;
    }
    if (
      object.profileImageUrl !== undefined &&
      object.profileImageUrl !== null
    ) {
      message.profileImageUrl = String(object.profileImageUrl);
    } else {
      message.profileImageUrl = undefined;
    }
    if (
      object.profileImageHash !== undefined &&
      object.profileImageHash !== null
    ) {
      message.profileImageHash = String(object.profileImageHash);
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
    message.locationId !== undefined && (obj.locationId = message.locationId);
    message.description !== undefined &&
      (obj.description = message.description);
    message.name !== undefined && (obj.name = message.name);
    message.coverImageUrl !== undefined &&
      (obj.coverImageUrl = message.coverImageUrl);
    message.coverImageHash !== undefined &&
      (obj.coverImageHash = message.coverImageHash);
    message.posterImageUrl !== undefined &&
      (obj.posterImageUrl = message.posterImageUrl);
    message.posterImageHash !== undefined &&
      (obj.posterImageHash = message.posterImageHash);
    message.contact !== undefined && (obj.contact = message.contact);
    message.profileImageUrl !== undefined &&
      (obj.profileImageUrl = message.profileImageUrl);
    message.profileImageHash !== undefined &&
      (obj.profileImageHash = message.profileImageHash);
    message.attendeeLimit !== undefined &&
      (obj.attendeeLimit = message.attendeeLimit);
    message.registrationDueDate !== undefined &&
      (obj.registrationDueDate =
        message.registrationDueDate !== undefined
          ? message.registrationDueDate.toISOString()
          : null);
    return obj;
  },

  fromPartial(object: DeepPartial<Event>): Event {
    const message = { ...baseEvent } as Event;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = object.organizationId;
    } else {
      message.organizationId = 0;
    }
    if (object.locationId !== undefined && object.locationId !== null) {
      message.locationId = object.locationId;
    } else {
      message.locationId = undefined;
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = object.description;
    } else {
      message.description = "";
    }
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    if (object.coverImageUrl !== undefined && object.coverImageUrl !== null) {
      message.coverImageUrl = object.coverImageUrl;
    } else {
      message.coverImageUrl = undefined;
    }
    if (object.coverImageHash !== undefined && object.coverImageHash !== null) {
      message.coverImageHash = object.coverImageHash;
    } else {
      message.coverImageHash = undefined;
    }
    if (object.posterImageUrl !== undefined && object.posterImageUrl !== null) {
      message.posterImageUrl = object.posterImageUrl;
    } else {
      message.posterImageUrl = undefined;
    }
    if (
      object.posterImageHash !== undefined &&
      object.posterImageHash !== null
    ) {
      message.posterImageHash = object.posterImageHash;
    } else {
      message.posterImageHash = undefined;
    }
    if (object.contact !== undefined && object.contact !== null) {
      message.contact = object.contact;
    } else {
      message.contact = undefined;
    }
    if (
      object.profileImageUrl !== undefined &&
      object.profileImageUrl !== null
    ) {
      message.profileImageUrl = object.profileImageUrl;
    } else {
      message.profileImageUrl = undefined;
    }
    if (
      object.profileImageHash !== undefined &&
      object.profileImageHash !== null
    ) {
      message.profileImageHash = object.profileImageHash;
    } else {
      message.profileImageHash = undefined;
    }
    if (object.attendeeLimit !== undefined && object.attendeeLimit !== null) {
      message.attendeeLimit = object.attendeeLimit;
    } else {
      message.attendeeLimit = 0;
    }
    if (
      object.registrationDueDate !== undefined &&
      object.registrationDueDate !== null
    ) {
      message.registrationDueDate = object.registrationDueDate;
    } else {
      message.registrationDueDate = undefined;
    }
    return message;
  },
};

const baseLocation: object = {
  id: 0,
  name: "",
  googleMapUrl: "",
  isOnline: false,
};

export const Location = {
  encode(message: Location, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.name !== "") {
      writer.uint32(18).string(message.name);
    }
    if (message.googleMapUrl !== "") {
      writer.uint32(26).string(message.googleMapUrl);
    }
    if (message.description !== undefined) {
      StringValue.encode(
        { value: message.description! },
        writer.uint32(34).fork()
      ).ldelim();
    }
    if (message.travelInformationImageUrl !== undefined) {
      StringValue.encode(
        { value: message.travelInformationImageUrl! },
        writer.uint32(42).fork()
      ).ldelim();
    }
    if (message.travelInformationImageHash !== undefined) {
      StringValue.encode(
        { value: message.travelInformationImageHash! },
        writer.uint32(50).fork()
      ).ldelim();
    }
    if (message.isOnline === true) {
      writer.uint32(56).bool(message.isOnline);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): Location {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseLocation } as Location;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.name = reader.string();
          break;
        case 3:
          message.googleMapUrl = reader.string();
          break;
        case 4:
          message.description = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 5:
          message.travelInformationImageUrl = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 6:
          message.travelInformationImageHash = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 7:
          message.isOnline = reader.bool();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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
      message.description = String(object.description);
    } else {
      message.description = undefined;
    }
    if (
      object.travelInformationImageUrl !== undefined &&
      object.travelInformationImageUrl !== null
    ) {
      message.travelInformationImageUrl = String(
        object.travelInformationImageUrl
      );
    } else {
      message.travelInformationImageUrl = undefined;
    }
    if (
      object.travelInformationImageHash !== undefined &&
      object.travelInformationImageHash !== null
    ) {
      message.travelInformationImageHash = String(
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
      (obj.description = message.description);
    message.travelInformationImageUrl !== undefined &&
      (obj.travelInformationImageUrl = message.travelInformationImageUrl);
    message.travelInformationImageHash !== undefined &&
      (obj.travelInformationImageHash = message.travelInformationImageHash);
    message.isOnline !== undefined && (obj.isOnline = message.isOnline);
    return obj;
  },

  fromPartial(object: DeepPartial<Location>): Location {
    const message = { ...baseLocation } as Location;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    if (object.googleMapUrl !== undefined && object.googleMapUrl !== null) {
      message.googleMapUrl = object.googleMapUrl;
    } else {
      message.googleMapUrl = "";
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = object.description;
    } else {
      message.description = undefined;
    }
    if (
      object.travelInformationImageUrl !== undefined &&
      object.travelInformationImageUrl !== null
    ) {
      message.travelInformationImageUrl = object.travelInformationImageUrl;
    } else {
      message.travelInformationImageUrl = undefined;
    }
    if (
      object.travelInformationImageHash !== undefined &&
      object.travelInformationImageHash !== null
    ) {
      message.travelInformationImageHash = object.travelInformationImageHash;
    } else {
      message.travelInformationImageHash = undefined;
    }
    if (object.isOnline !== undefined && object.isOnline !== null) {
      message.isOnline = object.isOnline;
    } else {
      message.isOnline = false;
    }
    return message;
  },
};

const baseAnswer: object = { id: 0, userEventId: 0, questionId: 0, value: "" };

export const Answer = {
  encode(message: Answer, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.userEventId !== 0) {
      writer.uint32(16).int32(message.userEventId);
    }
    if (message.questionId !== 0) {
      writer.uint32(24).int32(message.questionId);
    }
    if (message.value !== "") {
      writer.uint32(34).string(message.value);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): Answer {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseAnswer } as Answer;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.userEventId = reader.int32();
          break;
        case 3:
          message.questionId = reader.int32();
          break;
        case 4:
          message.value = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(object: DeepPartial<Answer>): Answer {
    const message = { ...baseAnswer } as Answer;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.userEventId !== undefined && object.userEventId !== null) {
      message.userEventId = object.userEventId;
    } else {
      message.userEventId = 0;
    }
    if (object.questionId !== undefined && object.questionId !== null) {
      message.questionId = object.questionId;
    } else {
      message.questionId = 0;
    }
    if (object.value !== undefined && object.value !== null) {
      message.value = object.value;
    } else {
      message.value = "";
    }
    return message;
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
  encode(message: UserEvent, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.userId !== 0) {
      writer.uint32(16).int32(message.userId);
    }
    if (message.eventId !== 0) {
      writer.uint32(24).int32(message.eventId);
    }
    if (message.rating !== undefined) {
      Int32Value.encode(
        { value: message.rating! },
        writer.uint32(34).fork()
      ).ldelim();
    }
    if (message.ticket !== undefined) {
      StringValue.encode(
        { value: message.ticket! },
        writer.uint32(42).fork()
      ).ldelim();
    }
    if (message.status !== 0) {
      writer.uint32(48).int32(message.status);
    }
    if (message.isInternal === true) {
      writer.uint32(56).bool(message.isInternal);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UserEvent {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserEvent } as UserEvent;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.userId = reader.int32();
          break;
        case 3:
          message.eventId = reader.int32();
          break;
        case 4:
          message.rating = Int32Value.decode(reader, reader.uint32()).value;
          break;
        case 5:
          message.ticket = StringValue.decode(reader, reader.uint32()).value;
          break;
        case 6:
          message.status = reader.int32() as any;
          break;
        case 7:
          message.isInternal = reader.bool();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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
      message.rating = Number(object.rating);
    } else {
      message.rating = undefined;
    }
    if (object.ticket !== undefined && object.ticket !== null) {
      message.ticket = String(object.ticket);
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
    message.rating !== undefined && (obj.rating = message.rating);
    message.ticket !== undefined && (obj.ticket = message.ticket);
    message.status !== undefined &&
      (obj.status = userEvent_StatusToJSON(message.status));
    message.isInternal !== undefined && (obj.isInternal = message.isInternal);
    return obj;
  },

  fromPartial(object: DeepPartial<UserEvent>): UserEvent {
    const message = { ...baseUserEvent } as UserEvent;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    if (object.rating !== undefined && object.rating !== null) {
      message.rating = object.rating;
    } else {
      message.rating = undefined;
    }
    if (object.ticket !== undefined && object.ticket !== null) {
      message.ticket = object.ticket;
    } else {
      message.ticket = undefined;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = object.status;
    } else {
      message.status = 0;
    }
    if (object.isInternal !== undefined && object.isInternal !== null) {
      message.isInternal = object.isInternal;
    } else {
      message.isInternal = false;
    }
    return message;
  },
};

const baseEventDuration: object = { id: 0, eventId: 0 };

export const EventDuration = {
  encode(message: EventDuration, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
    }
    if (message.start !== undefined) {
      Timestamp.encode(
        toTimestamp(message.start),
        writer.uint32(26).fork()
      ).ldelim();
    }
    if (message.finish !== undefined) {
      Timestamp.encode(
        toTimestamp(message.finish),
        writer.uint32(34).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): EventDuration {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseEventDuration } as EventDuration;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.eventId = reader.int32();
          break;
        case 3:
          message.start = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        case 4:
          message.finish = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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
        message.start !== undefined ? message.start.toISOString() : null);
    message.finish !== undefined &&
      (obj.finish =
        message.finish !== undefined ? message.finish.toISOString() : null);
    return obj;
  },

  fromPartial(object: DeepPartial<EventDuration>): EventDuration {
    const message = { ...baseEventDuration } as EventDuration;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    if (object.start !== undefined && object.start !== null) {
      message.start = object.start;
    } else {
      message.start = undefined;
    }
    if (object.finish !== undefined && object.finish !== null) {
      message.finish = object.finish;
    } else {
      message.finish = undefined;
    }
    return message;
  },
};

const baseTag: object = { id: 0, name: "" };

export const Tag = {
  encode(message: Tag, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.name !== "") {
      writer.uint32(18).string(message.name);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): Tag {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseTag } as Tag;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.name = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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
    return message;
  },

  toJSON(message: Tag): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.name !== undefined && (obj.name = message.name);
    return obj;
  },

  fromPartial(object: DeepPartial<Tag>): Tag {
    const message = { ...baseTag } as Tag;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    return message;
  },
};

const baseEventTag: object = { id: 0, eventId: 0, tagId: 0 };

export const EventTag = {
  encode(message: EventTag, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
    }
    if (message.tagId !== 0) {
      writer.uint32(24).int32(message.tagId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): EventTag {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseEventTag } as EventTag;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.eventId = reader.int32();
          break;
        case 3:
          message.tagId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(object: DeepPartial<EventTag>): EventTag {
    const message = { ...baseEventTag } as EventTag;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    if (object.tagId !== undefined && object.tagId !== null) {
      message.tagId = object.tagId;
    } else {
      message.tagId = 0;
    }
    return message;
  },
};

const baseOrganizationPermission: object = {
  id: 0,
  organizationId: 0,
  permission: 0,
};

export const OrganizationPermission = {
  encode(
    message: OrganizationPermission,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int32(message.organizationId);
    }
    if (message.permission !== 0) {
      writer.uint32(24).int32(message.permission);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): OrganizationPermission {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseOrganizationPermission } as OrganizationPermission;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.organizationId = reader.int32();
          break;
        case 3:
          message.permission = reader.int32() as any;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(
    object: DeepPartial<OrganizationPermission>
  ): OrganizationPermission {
    const message = { ...baseOrganizationPermission } as OrganizationPermission;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = object.organizationId;
    } else {
      message.organizationId = 0;
    }
    if (object.permission !== undefined && object.permission !== null) {
      message.permission = object.permission;
    } else {
      message.permission = 0;
    }
    return message;
  },
};

const baseUserPermission: object = { id: 0, userId: 0, permissionName: 0 };

export const UserPermission = {
  encode(message: UserPermission, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.userId !== 0) {
      writer.uint32(16).int32(message.userId);
    }
    if (message.permissionName !== 0) {
      writer.uint32(24).int32(message.permissionName);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UserPermission {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserPermission } as UserPermission;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.userId = reader.int32();
          break;
        case 3:
          message.permissionName = reader.int32() as any;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(object: DeepPartial<UserPermission>): UserPermission {
    const message = { ...baseUserPermission } as UserPermission;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.permissionName !== undefined && object.permissionName !== null) {
      message.permissionName = object.permissionName;
    } else {
      message.permissionName = 0;
    }
    return message;
  },
};

const baseUserInterest: object = { id: 0, userId: 0, tagId: 0 };

export const UserInterest = {
  encode(message: UserInterest, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.userId !== 0) {
      writer.uint32(16).int32(message.userId);
    }
    if (message.tagId !== 0) {
      writer.uint32(24).int32(message.tagId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UserInterest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserInterest } as UserInterest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.userId = reader.int32();
          break;
        case 3:
          message.tagId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(object: DeepPartial<UserInterest>): UserInterest {
    const message = { ...baseUserInterest } as UserInterest;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.tagId !== undefined && object.tagId !== null) {
      message.tagId = object.tagId;
    } else {
      message.tagId = 0;
    }
    return message;
  },
};

const baseFacilityRequest: object = {
  id: 0,
  eventId: 0,
  facilityId: 0,
  status: 0,
};

export const FacilityRequest = {
  encode(message: FacilityRequest, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int32(message.eventId);
    }
    if (message.facilityId !== 0) {
      writer.uint32(24).int32(message.facilityId);
    }
    if (message.status !== 0) {
      writer.uint32(32).int32(message.status);
    }
    if (message.rejectReason !== undefined) {
      StringValue.encode(
        { value: message.rejectReason! },
        writer.uint32(42).fork()
      ).ldelim();
    }
    if (message.start !== undefined) {
      Timestamp.encode(
        toTimestamp(message.start),
        writer.uint32(50).fork()
      ).ldelim();
    }
    if (message.finish !== undefined) {
      Timestamp.encode(
        toTimestamp(message.finish),
        writer.uint32(58).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): FacilityRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseFacilityRequest } as FacilityRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.eventId = reader.int32();
          break;
        case 3:
          message.facilityId = reader.int32();
          break;
        case 4:
          message.status = reader.int32() as any;
          break;
        case 5:
          message.rejectReason = StringValue.decode(
            reader,
            reader.uint32()
          ).value;
          break;
        case 6:
          message.start = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        case 7:
          message.finish = fromTimestamp(
            Timestamp.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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
      message.rejectReason = String(object.rejectReason);
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
      (obj.rejectReason = message.rejectReason);
    message.start !== undefined &&
      (obj.start =
        message.start !== undefined ? message.start.toISOString() : null);
    message.finish !== undefined &&
      (obj.finish =
        message.finish !== undefined ? message.finish.toISOString() : null);
    return obj;
  },

  fromPartial(object: DeepPartial<FacilityRequest>): FacilityRequest {
    const message = { ...baseFacilityRequest } as FacilityRequest;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.eventId !== undefined && object.eventId !== null) {
      message.eventId = object.eventId;
    } else {
      message.eventId = 0;
    }
    if (object.facilityId !== undefined && object.facilityId !== null) {
      message.facilityId = object.facilityId;
    } else {
      message.facilityId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = object.status;
    } else {
      message.status = 0;
    }
    if (object.rejectReason !== undefined && object.rejectReason !== null) {
      message.rejectReason = object.rejectReason;
    } else {
      message.rejectReason = undefined;
    }
    if (object.start !== undefined && object.start !== null) {
      message.start = object.start;
    } else {
      message.start = undefined;
    }
    if (object.finish !== undefined && object.finish !== null) {
      message.finish = object.finish;
    } else {
      message.finish = undefined;
    }
    return message;
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
  encode(message: Facility, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int32(message.organizationId);
    }
    if (message.name !== "") {
      writer.uint32(26).string(message.name);
    }
    if (message.latitude !== 0) {
      writer.uint32(33).double(message.latitude);
    }
    if (message.longitude !== 0) {
      writer.uint32(41).double(message.longitude);
    }
    for (const v of message.operatingHours) {
      OperatingHour.encode(v!, writer.uint32(50).fork()).ldelim();
    }
    if (message.description !== "") {
      writer.uint32(58).string(message.description);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): Facility {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseFacility } as Facility;
    message.operatingHours = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        case 2:
          message.organizationId = reader.int32();
          break;
        case 3:
          message.name = reader.string();
          break;
        case 4:
          message.latitude = reader.double();
          break;
        case 5:
          message.longitude = reader.double();
          break;
        case 6:
          message.operatingHours.push(
            OperatingHour.decode(reader, reader.uint32())
          );
          break;
        case 7:
          message.description = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(object: DeepPartial<Facility>): Facility {
    const message = { ...baseFacility } as Facility;
    message.operatingHours = [];
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = object.organizationId;
    } else {
      message.organizationId = 0;
    }
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    if (object.latitude !== undefined && object.latitude !== null) {
      message.latitude = object.latitude;
    } else {
      message.latitude = 0;
    }
    if (object.longitude !== undefined && object.longitude !== null) {
      message.longitude = object.longitude;
    } else {
      message.longitude = 0;
    }
    if (object.operatingHours !== undefined && object.operatingHours !== null) {
      for (const e of object.operatingHours) {
        message.operatingHours.push(OperatingHour.fromPartial(e));
      }
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = object.description;
    } else {
      message.description = "";
    }
    return message;
  },
};

const baseGetObjectByIdRequest: object = { id: 0 };

export const GetObjectByIdRequest = {
  encode(
    message: GetObjectByIdRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int32(message.id);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetObjectByIdRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetObjectByIdRequest } as GetObjectByIdRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(object: DeepPartial<GetObjectByIdRequest>): GetObjectByIdRequest {
    const message = { ...baseGetObjectByIdRequest } as GetObjectByIdRequest;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    return message;
  },
};

const baseGetObjectByNameRequest: object = { name: "" };

export const GetObjectByNameRequest = {
  encode(
    message: GetObjectByNameRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetObjectByNameRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetObjectByNameRequest } as GetObjectByNameRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

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

  fromPartial(
    object: DeepPartial<GetObjectByNameRequest>
  ): GetObjectByNameRequest {
    const message = { ...baseGetObjectByNameRequest } as GetObjectByNameRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    return message;
  },
};

type Builtin = Date | Function | Uint8Array | string | number | undefined;
export type DeepPartial<T> = T extends Builtin
  ? T
  : T extends Array<infer U>
  ? Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U>
  ? ReadonlyArray<DeepPartial<U>>
  : T extends {}
  ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

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

function fromJsonTimestamp(o: any): Date {
  if (o instanceof Date) {
    return o;
  } else if (typeof o === "string") {
    return new Date(o);
  } else {
    return fromTimestamp(Timestamp.fromJSON(o));
  }
}

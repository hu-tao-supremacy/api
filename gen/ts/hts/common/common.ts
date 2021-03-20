/* eslint-disable */
import { Timestamp } from "../../google/protobuf/timestamp";
import * as Long from "long";
import { util, configure, Writer, Reader } from "protobufjs/minimal";
import { StringValue, Int64Value } from "../../google/protobuf/wrappers";

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

export function dayOfWeekFromJSON(object: any): DayOfWeek {
  switch (object) {
    case 0:
    case "SUN":
      return DayOfWeek.SUN;
    case 1:
    case "MON":
      return DayOfWeek.MON;
    case 2:
    case "TUE":
      return DayOfWeek.TUE;
    case 3:
    case "WED":
      return DayOfWeek.WED;
    case 4:
    case "THU":
      return DayOfWeek.THU;
    case 5:
    case "FRI":
      return DayOfWeek.FRI;
    case 6:
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

export enum Gender {
  MALE = 0,
  FEMALE = 1,
  NOT_SPECIFIED = 2,
  UNRECOGNIZED = -1,
}

export function genderFromJSON(object: any): Gender {
  switch (object) {
    case 0:
    case "MALE":
      return Gender.MALE;
    case 1:
    case "FEMALE":
      return Gender.FEMALE;
    case 2:
    case "NOT_SPECIFIED":
      return Gender.NOT_SPECIFIED;
    case -1:
    case "UNRECOGNIZED":
    default:
      return Gender.UNRECOGNIZED;
  }
}

export function genderToJSON(object: Gender): string {
  switch (object) {
    case Gender.MALE:
      return "MALE";
    case Gender.FEMALE:
      return "FEMALE";
    case Gender.NOT_SPECIFIED:
      return "NOT_SPECIFIED";
    default:
      return "UNKNOWN";
  }
}

export enum Status {
  PENDING = 0,
  APPROVED = 1,
  REJECTED = 2,
  UNRECOGNIZED = -1,
}

export function statusFromJSON(object: any): Status {
  switch (object) {
    case 0:
    case "PENDING":
      return Status.PENDING;
    case 1:
    case "APPROVED":
      return Status.APPROVED;
    case 2:
    case "REJECTED":
      return Status.REJECTED;
    case -1:
    case "UNRECOGNIZED":
    default:
      return Status.UNRECOGNIZED;
  }
}

export function statusToJSON(object: Status): string {
  switch (object) {
    case Status.PENDING:
      return "PENDING";
    case Status.APPROVED:
      return "APPROVED";
    case Status.REJECTED:
      return "REJECTED";
    default:
      return "UNKNOWN";
  }
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

export function permissionFromJSON(object: any): Permission {
  switch (object) {
    case 0:
    case "CREATE_ORGANIZATION":
      return Permission.CREATE_ORGANIZATION;
    case 1:
    case "READ_ORGANIZATION":
      return Permission.READ_ORGANIZATION;
    case 2:
    case "UPDATE_ORGANIZATION":
      return Permission.UPDATE_ORGANIZATION;
    case 3:
    case "DELETE_ORGANIZATION":
      return Permission.DELETE_ORGANIZATION;
    case 4:
    case "ADD_MEMBERS_TO_ORGANIZATION":
      return Permission.ADD_MEMBERS_TO_ORGANIZATION;
    case 5:
    case "REMOVE_MEMBERS_FROM_ORGANIZATION":
      return Permission.REMOVE_MEMBERS_FROM_ORGANIZATION;
    case 6:
    case "CREATE_EVENT":
      return Permission.CREATE_EVENT;
    case 7:
    case "READ_EVENT":
      return Permission.READ_EVENT;
    case 8:
    case "UPDATE_EVENT":
      return Permission.UPDATE_EVENT;
    case 9:
    case "DELETE_EVENT":
      return Permission.DELETE_EVENT;
    case 10:
    case "CREATE_TAG":
      return Permission.CREATE_TAG;
    case 11:
    case "READ_TAG":
      return Permission.READ_TAG;
    case 12:
    case "UPDATE_TAG":
      return Permission.UPDATE_TAG;
    case 13:
    case "DELETE_TAG":
      return Permission.DELETE_TAG;
    case 14:
    case "ADD_TAGS_TO_EVENT":
      return Permission.ADD_TAGS_TO_EVENT;
    case 15:
    case "REMOVE_TAGS_FROM_EVENT":
      return Permission.REMOVE_TAGS_FROM_EVENT;
    case 16:
    case "CREATE_FACILITY":
      return Permission.CREATE_FACILITY;
    case 17:
    case "READ_FACILITY":
      return Permission.READ_FACILITY;
    case 18:
    case "UPDATE_FACILITY":
      return Permission.UPDATE_FACILITY;
    case 19:
    case "DELETE_FACILITY":
      return Permission.DELETE_FACILITY;
    case -1:
    case "UNRECOGNIZED":
    default:
      return Permission.UNRECOGNIZED;
  }
}

export function permissionToJSON(object: Permission): string {
  switch (object) {
    case Permission.CREATE_ORGANIZATION:
      return "CREATE_ORGANIZATION";
    case Permission.READ_ORGANIZATION:
      return "READ_ORGANIZATION";
    case Permission.UPDATE_ORGANIZATION:
      return "UPDATE_ORGANIZATION";
    case Permission.DELETE_ORGANIZATION:
      return "DELETE_ORGANIZATION";
    case Permission.ADD_MEMBERS_TO_ORGANIZATION:
      return "ADD_MEMBERS_TO_ORGANIZATION";
    case Permission.REMOVE_MEMBERS_FROM_ORGANIZATION:
      return "REMOVE_MEMBERS_FROM_ORGANIZATION";
    case Permission.CREATE_EVENT:
      return "CREATE_EVENT";
    case Permission.READ_EVENT:
      return "READ_EVENT";
    case Permission.UPDATE_EVENT:
      return "UPDATE_EVENT";
    case Permission.DELETE_EVENT:
      return "DELETE_EVENT";
    case Permission.CREATE_TAG:
      return "CREATE_TAG";
    case Permission.READ_TAG:
      return "READ_TAG";
    case Permission.UPDATE_TAG:
      return "UPDATE_TAG";
    case Permission.DELETE_TAG:
      return "DELETE_TAG";
    case Permission.ADD_TAGS_TO_EVENT:
      return "ADD_TAGS_TO_EVENT";
    case Permission.REMOVE_TAGS_FROM_EVENT:
      return "REMOVE_TAGS_FROM_EVENT";
    case Permission.CREATE_FACILITY:
      return "CREATE_FACILITY";
    case Permission.READ_FACILITY:
      return "READ_FACILITY";
    case Permission.UPDATE_FACILITY:
      return "UPDATE_FACILITY";
    case Permission.DELETE_FACILITY:
      return "DELETE_FACILITY";
    default:
      return "UNKNOWN";
  }
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
  start: Date | undefined;
  finish: Date | undefined;
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

const baseOperatingHour: object = { startHour: 0, finishHour: 0, day: 0 };

export const OperatingHour = {
  encode(message: OperatingHour, writer: Writer = Writer.create()): Writer {
    if (message.startHour !== 0) {
      writer.uint32(8).int64(message.startHour);
    }
    if (message.finishHour !== 0) {
      writer.uint32(16).int64(message.finishHour);
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
          message.startHour = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.finishHour = longToNumber(reader.int64() as Long);
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

const baseResult: object = { isOk: false, description: "" };

export const Result = {
  encode(message: Result, writer: Writer = Writer.create()): Writer {
    if (message.isOk === true) {
      writer.uint32(8).bool(message.isOk);
    }
    if (message.description !== "") {
      writer.uint32(18).string(message.description);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): Result {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseResult } as Result;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.isOk = reader.bool();
          break;
        case 2:
          message.description = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Result {
    const message = { ...baseResult } as Result;
    if (object.isOk !== undefined && object.isOk !== null) {
      message.isOk = Boolean(object.isOk);
    } else {
      message.isOk = false;
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = String(object.description);
    } else {
      message.description = "";
    }
    return message;
  },

  toJSON(message: Result): unknown {
    const obj: any = {};
    message.isOk !== undefined && (obj.isOk = message.isOk);
    message.description !== undefined &&
      (obj.description = message.description);
    return obj;
  },

  fromPartial(object: DeepPartial<Result>): Result {
    const message = { ...baseResult } as Result;
    if (object.isOk !== undefined && object.isOk !== null) {
      message.isOk = object.isOk;
    } else {
      message.isOk = false;
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = object.description;
    } else {
      message.description = "";
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
};

export const User = {
  encode(message: User, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
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
      StringValue.encode(message.nickname, writer.uint32(42).fork()).ldelim();
    }
    if (message.chulaId !== undefined) {
      StringValue.encode(message.chulaId, writer.uint32(50).fork()).ldelim();
    }
    if (message.isChulaStudent === true) {
      writer.uint32(56).bool(message.isChulaStudent);
    }
    if (message.gender !== 0) {
      writer.uint32(64).int32(message.gender);
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
          message.id = longToNumber(reader.int64() as Long);
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
          message.nickname = StringValue.decode(reader, reader.uint32());
          break;
        case 6:
          message.chulaId = StringValue.decode(reader, reader.uint32());
          break;
        case 7:
          message.isChulaStudent = reader.bool();
          break;
        case 8:
          message.gender = reader.int32() as any;
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
      message.nickname = StringValue.fromPartial(object.nickname);
    } else {
      message.nickname = undefined;
    }
    if (object.chulaId !== undefined && object.chulaId !== null) {
      message.chulaId = StringValue.fromPartial(object.chulaId);
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
    return message;
  },
};

const baseOrganization: object = { id: 0, name: "", isVerified: false };

export const Organization = {
  encode(message: Organization, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
    }
    if (message.name !== "") {
      writer.uint32(18).string(message.name);
    }
    if (message.isVerified === true) {
      writer.uint32(24).bool(message.isVerified);
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
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.name = reader.string();
          break;
        case 3:
          message.isVerified = reader.bool();
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
    return message;
  },

  toJSON(message: Organization): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.name !== undefined && (obj.name = message.name);
    message.isVerified !== undefined && (obj.isVerified = message.isVerified);
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
    return message;
  },
};

const baseUserOrganization: object = { id: 0, userId: 0, organizationId: 0 };

export const UserOrganization = {
  encode(message: UserOrganization, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
    }
    if (message.userId !== 0) {
      writer.uint32(16).int64(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(24).int64(message.organizationId);
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
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.organizationId = longToNumber(reader.int64() as Long);
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
  contact: "",
};

export const Event = {
  encode(message: Event, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int64(message.organizationId);
    }
    if (message.eventLocationId !== undefined) {
      Int64Value.encode(
        message.eventLocationId,
        writer.uint32(26).fork()
      ).ldelim();
    }
    if (message.description !== "") {
      writer.uint32(34).string(message.description);
    }
    if (message.name !== "") {
      writer.uint32(42).string(message.name);
    }
    if (message.coverImage !== undefined) {
      StringValue.encode(message.coverImage, writer.uint32(50).fork()).ldelim();
    }
    if (message.coverImageHash !== undefined) {
      StringValue.encode(
        message.coverImageHash,
        writer.uint32(58).fork()
      ).ldelim();
    }
    if (message.posterImage !== undefined) {
      StringValue.encode(
        message.posterImage,
        writer.uint32(66).fork()
      ).ldelim();
    }
    if (message.posterImageHash !== undefined) {
      StringValue.encode(
        message.posterImageHash,
        writer.uint32(74).fork()
      ).ldelim();
    }
    if (message.contact !== "") {
      writer.uint32(82).string(message.contact);
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
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.organizationId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.eventLocationId = Int64Value.decode(reader, reader.uint32());
          break;
        case 4:
          message.description = reader.string();
          break;
        case 5:
          message.name = reader.string();
          break;
        case 6:
          message.coverImage = StringValue.decode(reader, reader.uint32());
          break;
        case 7:
          message.coverImageHash = StringValue.decode(reader, reader.uint32());
          break;
        case 8:
          message.posterImage = StringValue.decode(reader, reader.uint32());
          break;
        case 9:
          message.posterImageHash = StringValue.decode(reader, reader.uint32());
          break;
        case 10:
          message.contact = reader.string();
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
    if (
      object.eventLocationId !== undefined &&
      object.eventLocationId !== null
    ) {
      message.eventLocationId = Int64Value.fromJSON(object.eventLocationId);
    } else {
      message.eventLocationId = undefined;
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
    if (object.coverImage !== undefined && object.coverImage !== null) {
      message.coverImage = StringValue.fromJSON(object.coverImage);
    } else {
      message.coverImage = undefined;
    }
    if (object.coverImageHash !== undefined && object.coverImageHash !== null) {
      message.coverImageHash = StringValue.fromJSON(object.coverImageHash);
    } else {
      message.coverImageHash = undefined;
    }
    if (object.posterImage !== undefined && object.posterImage !== null) {
      message.posterImage = StringValue.fromJSON(object.posterImage);
    } else {
      message.posterImage = undefined;
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
      message.contact = String(object.contact);
    } else {
      message.contact = "";
    }
    return message;
  },

  toJSON(message: Event): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.eventLocationId !== undefined &&
      (obj.eventLocationId = message.eventLocationId
        ? Int64Value.toJSON(message.eventLocationId)
        : undefined);
    message.description !== undefined &&
      (obj.description = message.description);
    message.name !== undefined && (obj.name = message.name);
    message.coverImage !== undefined &&
      (obj.coverImage = message.coverImage
        ? StringValue.toJSON(message.coverImage)
        : undefined);
    message.coverImageHash !== undefined &&
      (obj.coverImageHash = message.coverImageHash
        ? StringValue.toJSON(message.coverImageHash)
        : undefined);
    message.posterImage !== undefined &&
      (obj.posterImage = message.posterImage
        ? StringValue.toJSON(message.posterImage)
        : undefined);
    message.posterImageHash !== undefined &&
      (obj.posterImageHash = message.posterImageHash
        ? StringValue.toJSON(message.posterImageHash)
        : undefined);
    message.contact !== undefined && (obj.contact = message.contact);
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
    if (
      object.eventLocationId !== undefined &&
      object.eventLocationId !== null
    ) {
      message.eventLocationId = Int64Value.fromPartial(object.eventLocationId);
    } else {
      message.eventLocationId = undefined;
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
    if (object.coverImage !== undefined && object.coverImage !== null) {
      message.coverImage = StringValue.fromPartial(object.coverImage);
    } else {
      message.coverImage = undefined;
    }
    if (object.coverImageHash !== undefined && object.coverImageHash !== null) {
      message.coverImageHash = StringValue.fromPartial(object.coverImageHash);
    } else {
      message.coverImageHash = undefined;
    }
    if (object.posterImage !== undefined && object.posterImage !== null) {
      message.posterImage = StringValue.fromPartial(object.posterImage);
    } else {
      message.posterImage = undefined;
    }
    if (
      object.posterImageHash !== undefined &&
      object.posterImageHash !== null
    ) {
      message.posterImageHash = StringValue.fromPartial(object.posterImageHash);
    } else {
      message.posterImageHash = undefined;
    }
    if (object.contact !== undefined && object.contact !== null) {
      message.contact = object.contact;
    } else {
      message.contact = "";
    }
    return message;
  },
};

const baseUserEventFeedback: object = { id: 0, userId: 0, eventFeedbackId: 0 };

export const UserEventFeedback = {
  encode(message: UserEventFeedback, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
    }
    if (message.userId !== 0) {
      writer.uint32(16).int64(message.userId);
    }
    if (message.eventFeedbackId !== 0) {
      writer.uint32(24).int64(message.eventFeedbackId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UserEventFeedback {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserEventFeedback } as UserEventFeedback;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.eventFeedbackId = longToNumber(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UserEventFeedback {
    const message = { ...baseUserEventFeedback } as UserEventFeedback;
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
    if (
      object.eventFeedbackId !== undefined &&
      object.eventFeedbackId !== null
    ) {
      message.eventFeedbackId = Number(object.eventFeedbackId);
    } else {
      message.eventFeedbackId = 0;
    }
    return message;
  },

  toJSON(message: UserEventFeedback): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventFeedbackId !== undefined &&
      (obj.eventFeedbackId = message.eventFeedbackId);
    return obj;
  },

  fromPartial(object: DeepPartial<UserEventFeedback>): UserEventFeedback {
    const message = { ...baseUserEventFeedback } as UserEventFeedback;
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
    if (
      object.eventFeedbackId !== undefined &&
      object.eventFeedbackId !== null
    ) {
      message.eventFeedbackId = object.eventFeedbackId;
    } else {
      message.eventFeedbackId = 0;
    }
    return message;
  },
};

const baseEventFeedback: object = { id: 0, eventId: 0, feedback: "" };

export const EventFeedback = {
  encode(message: EventFeedback, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int64(message.eventId);
    }
    if (message.feedback !== "") {
      writer.uint32(26).string(message.feedback);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): EventFeedback {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseEventFeedback } as EventFeedback;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.eventId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.feedback = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventFeedback {
    const message = { ...baseEventFeedback } as EventFeedback;
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
    if (object.feedback !== undefined && object.feedback !== null) {
      message.feedback = String(object.feedback);
    } else {
      message.feedback = "";
    }
    return message;
  },

  toJSON(message: EventFeedback): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    message.feedback !== undefined && (obj.feedback = message.feedback);
    return obj;
  },

  fromPartial(object: DeepPartial<EventFeedback>): EventFeedback {
    const message = { ...baseEventFeedback } as EventFeedback;
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
    if (object.feedback !== undefined && object.feedback !== null) {
      message.feedback = object.feedback;
    } else {
      message.feedback = "";
    }
    return message;
  },
};

const baseEventLocation: object = {
  id: 0,
  name: "",
  latitude: 0,
  longitude: 0,
};

export const EventLocation = {
  encode(message: EventLocation, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
    }
    if (message.name !== "") {
      writer.uint32(18).string(message.name);
    }
    if (message.latitude !== 0) {
      writer.uint32(25).double(message.latitude);
    }
    if (message.longitude !== 0) {
      writer.uint32(33).double(message.longitude);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): EventLocation {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseEventLocation } as EventLocation;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.name = reader.string();
          break;
        case 3:
          message.latitude = reader.double();
          break;
        case 4:
          message.longitude = reader.double();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventLocation {
    const message = { ...baseEventLocation } as EventLocation;
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
    return message;
  },

  toJSON(message: EventLocation): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.name !== undefined && (obj.name = message.name);
    message.latitude !== undefined && (obj.latitude = message.latitude);
    message.longitude !== undefined && (obj.longitude = message.longitude);
    return obj;
  },

  fromPartial(object: DeepPartial<EventLocation>): EventLocation {
    const message = { ...baseEventLocation } as EventLocation;
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
    return message;
  },
};

const baseUserEvent: object = { id: 0, userId: 0, eventId: 0 };

export const UserEvent = {
  encode(message: UserEvent, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
    }
    if (message.userId !== 0) {
      writer.uint32(16).int64(message.userId);
    }
    if (message.eventId !== 0) {
      writer.uint32(24).int64(message.eventId);
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
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.eventId = longToNumber(reader.int64() as Long);
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
    return message;
  },

  toJSON(message: UserEvent): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.userId !== undefined && (obj.userId = message.userId);
    message.eventId !== undefined && (obj.eventId = message.eventId);
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
    return message;
  },
};

const baseEventDuration: object = { id: 0, eventId: 0 };

export const EventDuration = {
  encode(message: EventDuration, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int64(message.eventId);
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
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.eventId = longToNumber(reader.int64() as Long);
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

const baseEventRegistration: object = {
  id: 0,
  eventId: 0,
  userId: 0,
  status: 0,
};

export const EventRegistration = {
  encode(message: EventRegistration, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int64(message.eventId);
    }
    if (message.userId !== 0) {
      writer.uint32(24).int64(message.userId);
    }
    if (message.status !== 0) {
      writer.uint32(32).int32(message.status);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): EventRegistration {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseEventRegistration } as EventRegistration;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.eventId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 4:
          message.status = reader.int32() as any;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventRegistration {
    const message = { ...baseEventRegistration } as EventRegistration;
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
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = statusFromJSON(object.status);
    } else {
      message.status = 0;
    }
    return message;
  },

  toJSON(message: EventRegistration): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.eventId !== undefined && (obj.eventId = message.eventId);
    message.userId !== undefined && (obj.userId = message.userId);
    message.status !== undefined && (obj.status = statusToJSON(message.status));
    return obj;
  },

  fromPartial(object: DeepPartial<EventRegistration>): EventRegistration {
    const message = { ...baseEventRegistration } as EventRegistration;
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
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.status !== undefined && object.status !== null) {
      message.status = object.status;
    } else {
      message.status = 0;
    }
    return message;
  },
};

const baseTag: object = { id: 0, name: "" };

export const Tag = {
  encode(message: Tag, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
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
          message.id = longToNumber(reader.int64() as Long);
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
      writer.uint32(8).int64(message.id);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int64(message.eventId);
    }
    if (message.tagId !== 0) {
      writer.uint32(24).int64(message.tagId);
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
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.eventId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.tagId = longToNumber(reader.int64() as Long);
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
      writer.uint32(8).int64(message.id);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int64(message.organizationId);
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
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.organizationId = longToNumber(reader.int64() as Long);
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

const baseUserPermission: object = {
  id: 0,
  userId: 0,
  organizationPermissionId: 0,
};

export const UserPermission = {
  encode(message: UserPermission, writer: Writer = Writer.create()): Writer {
    if (message.id !== 0) {
      writer.uint32(8).int64(message.id);
    }
    if (message.userId !== 0) {
      writer.uint32(16).int64(message.userId);
    }
    if (message.organizationPermissionId !== 0) {
      writer.uint32(24).int64(message.organizationPermissionId);
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
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.organizationPermissionId = longToNumber(
            reader.int64() as Long
          );
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
    if (
      object.organizationPermissionId !== undefined &&
      object.organizationPermissionId !== null
    ) {
      message.organizationPermissionId = Number(
        object.organizationPermissionId
      );
    } else {
      message.organizationPermissionId = 0;
    }
    return message;
  },

  toJSON(message: UserPermission): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationPermissionId !== undefined &&
      (obj.organizationPermissionId = message.organizationPermissionId);
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
    if (
      object.organizationPermissionId !== undefined &&
      object.organizationPermissionId !== null
    ) {
      message.organizationPermissionId = object.organizationPermissionId;
    } else {
      message.organizationPermissionId = 0;
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
      writer.uint32(8).int64(message.id);
    }
    if (message.eventId !== 0) {
      writer.uint32(16).int64(message.eventId);
    }
    if (message.facilityId !== 0) {
      writer.uint32(24).int64(message.facilityId);
    }
    if (message.status !== 0) {
      writer.uint32(32).int32(message.status);
    }
    if (message.rejectReason !== undefined) {
      StringValue.encode(
        message.rejectReason,
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
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.eventId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.facilityId = longToNumber(reader.int64() as Long);
          break;
        case 4:
          message.status = reader.int32() as any;
          break;
        case 5:
          message.rejectReason = StringValue.decode(reader, reader.uint32());
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
      message.status = statusFromJSON(object.status);
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
    message.status !== undefined && (obj.status = statusToJSON(message.status));
    message.rejectReason !== undefined &&
      (obj.rejectReason = message.rejectReason
        ? StringValue.toJSON(message.rejectReason)
        : undefined);
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
      message.rejectReason = StringValue.fromPartial(object.rejectReason);
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
      writer.uint32(8).int64(message.id);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int64(message.organizationId);
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
          message.id = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.organizationId = longToNumber(reader.int64() as Long);
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

declare var self: any | undefined;
declare var window: any | undefined;
var globalThis: any = (() => {
  if (typeof globalThis !== "undefined") return globalThis;
  if (typeof self !== "undefined") return self;
  if (typeof window !== "undefined") return window;
  if (typeof global !== "undefined") return global;
  throw "Unable to locate global object";
})();

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

function longToNumber(long: Long): number {
  if (long.gt(Number.MAX_SAFE_INTEGER)) {
    throw new globalThis.Error("Value is larger than Number.MAX_SAFE_INTEGER");
  }
  return long.toNumber();
}

// If you get a compile-error about 'Constructor<Long> and ... have no overlap',
// add '--ts_proto_opt=esModuleInterop=true' as a flag when calling 'protoc'.
if (util.Long !== Long) {
  util.Long = Long as any;
  configure();
}

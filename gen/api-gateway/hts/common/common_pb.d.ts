// package: hts.common
// file: hts/common/common.proto

import * as jspb from "google-protobuf";
import * as google_protobuf_timestamp_pb from "google-protobuf/google/protobuf/timestamp_pb";
import * as google_protobuf_wrappers_pb from "google-protobuf/google/protobuf/wrappers_pb";

export class OperatingHour extends jspb.Message {
  getStartHour(): number;
  setStartHour(value: number): void;

  getFinishHour(): number;
  setFinishHour(value: number): void;

  getDay(): DayOfWeekMap[keyof DayOfWeekMap];
  setDay(value: DayOfWeekMap[keyof DayOfWeekMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OperatingHour.AsObject;
  static toObject(includeInstance: boolean, msg: OperatingHour): OperatingHour.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: OperatingHour, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OperatingHour;
  static deserializeBinaryFromReader(message: OperatingHour, reader: jspb.BinaryReader): OperatingHour;
}

export namespace OperatingHour {
  export type AsObject = {
    startHour: number,
    finishHour: number,
    day: DayOfWeekMap[keyof DayOfWeekMap],
  }
}

export class Result extends jspb.Message {
  getIsOk(): boolean;
  setIsOk(value: boolean): void;

  getDescription(): string;
  setDescription(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Result.AsObject;
  static toObject(includeInstance: boolean, msg: Result): Result.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Result, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Result;
  static deserializeBinaryFromReader(message: Result, reader: jspb.BinaryReader): Result;
}

export namespace Result {
  export type AsObject = {
    isOk: boolean,
    description: string,
  }
}

export class User extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getFirstName(): string;
  setFirstName(value: string): void;

  getLastName(): string;
  setLastName(value: string): void;

  getEmail(): string;
  setEmail(value: string): void;

  hasNickname(): boolean;
  clearNickname(): void;
  getNickname(): google_protobuf_wrappers_pb.StringValue | undefined;
  setNickname(value?: google_protobuf_wrappers_pb.StringValue): void;

  hasChulaId(): boolean;
  clearChulaId(): void;
  getChulaId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setChulaId(value?: google_protobuf_wrappers_pb.StringValue): void;

  getIsChulaStudent(): boolean;
  setIsChulaStudent(value: boolean): void;

  getGender(): GenderMap[keyof GenderMap];
  setGender(value: GenderMap[keyof GenderMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): User.AsObject;
  static toObject(includeInstance: boolean, msg: User): User.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: User, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): User;
  static deserializeBinaryFromReader(message: User, reader: jspb.BinaryReader): User;
}

export namespace User {
  export type AsObject = {
    id: number,
    firstName: string,
    lastName: string,
    email: string,
    nickname?: google_protobuf_wrappers_pb.StringValue.AsObject,
    chulaId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    isChulaStudent: boolean,
    gender: GenderMap[keyof GenderMap],
  }
}

export class Organization extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getName(): string;
  setName(value: string): void;

  getIsVerified(): boolean;
  setIsVerified(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Organization.AsObject;
  static toObject(includeInstance: boolean, msg: Organization): Organization.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Organization, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Organization;
  static deserializeBinaryFromReader(message: Organization, reader: jspb.BinaryReader): Organization;
}

export namespace Organization {
  export type AsObject = {
    id: number,
    name: string,
    isVerified: boolean,
  }
}

export class UserOrganization extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getUserId(): number;
  setUserId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserOrganization.AsObject;
  static toObject(includeInstance: boolean, msg: UserOrganization): UserOrganization.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserOrganization, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserOrganization;
  static deserializeBinaryFromReader(message: UserOrganization, reader: jspb.BinaryReader): UserOrganization;
}

export namespace UserOrganization {
  export type AsObject = {
    id: number,
    userId: number,
    organizationId: number,
  }
}

export class Event extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  hasEventLocationId(): boolean;
  clearEventLocationId(): void;
  getEventLocationId(): google_protobuf_wrappers_pb.Int64Value | undefined;
  setEventLocationId(value?: google_protobuf_wrappers_pb.Int64Value): void;

  getDescription(): string;
  setDescription(value: string): void;

  getName(): string;
  setName(value: string): void;

  hasCoverImage(): boolean;
  clearCoverImage(): void;
  getCoverImage(): google_protobuf_wrappers_pb.StringValue | undefined;
  setCoverImage(value?: google_protobuf_wrappers_pb.StringValue): void;

  hasCoverImageHash(): boolean;
  clearCoverImageHash(): void;
  getCoverImageHash(): google_protobuf_wrappers_pb.StringValue | undefined;
  setCoverImageHash(value?: google_protobuf_wrappers_pb.StringValue): void;

  hasPosterImage(): boolean;
  clearPosterImage(): void;
  getPosterImage(): google_protobuf_wrappers_pb.StringValue | undefined;
  setPosterImage(value?: google_protobuf_wrappers_pb.StringValue): void;

  hasPosterImageHash(): boolean;
  clearPosterImageHash(): void;
  getPosterImageHash(): google_protobuf_wrappers_pb.StringValue | undefined;
  setPosterImageHash(value?: google_protobuf_wrappers_pb.StringValue): void;

  getContact(): string;
  setContact(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Event.AsObject;
  static toObject(includeInstance: boolean, msg: Event): Event.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Event, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Event;
  static deserializeBinaryFromReader(message: Event, reader: jspb.BinaryReader): Event;
}

export namespace Event {
  export type AsObject = {
    id: number,
    organizationId: number,
    eventLocationId?: google_protobuf_wrappers_pb.Int64Value.AsObject,
    description: string,
    name: string,
    coverImage?: google_protobuf_wrappers_pb.StringValue.AsObject,
    coverImageHash?: google_protobuf_wrappers_pb.StringValue.AsObject,
    posterImage?: google_protobuf_wrappers_pb.StringValue.AsObject,
    posterImageHash?: google_protobuf_wrappers_pb.StringValue.AsObject,
    contact: string,
  }
}

export class UserEventFeedback extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getUserId(): number;
  setUserId(value: number): void;

  getEventFeedbackId(): number;
  setEventFeedbackId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserEventFeedback.AsObject;
  static toObject(includeInstance: boolean, msg: UserEventFeedback): UserEventFeedback.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserEventFeedback, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserEventFeedback;
  static deserializeBinaryFromReader(message: UserEventFeedback, reader: jspb.BinaryReader): UserEventFeedback;
}

export namespace UserEventFeedback {
  export type AsObject = {
    id: number,
    userId: number,
    eventFeedbackId: number,
  }
}

export class EventFeedback extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  getFeedback(): string;
  setFeedback(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EventFeedback.AsObject;
  static toObject(includeInstance: boolean, msg: EventFeedback): EventFeedback.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EventFeedback, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EventFeedback;
  static deserializeBinaryFromReader(message: EventFeedback, reader: jspb.BinaryReader): EventFeedback;
}

export namespace EventFeedback {
  export type AsObject = {
    id: number,
    eventId: number,
    feedback: string,
  }
}

export class EventLocation extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getName(): string;
  setName(value: string): void;

  getLatitude(): number;
  setLatitude(value: number): void;

  getLongitude(): number;
  setLongitude(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EventLocation.AsObject;
  static toObject(includeInstance: boolean, msg: EventLocation): EventLocation.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EventLocation, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EventLocation;
  static deserializeBinaryFromReader(message: EventLocation, reader: jspb.BinaryReader): EventLocation;
}

export namespace EventLocation {
  export type AsObject = {
    id: number,
    name: string,
    latitude: number,
    longitude: number,
  }
}

export class UserEvent extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getUserId(): number;
  setUserId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserEvent.AsObject;
  static toObject(includeInstance: boolean, msg: UserEvent): UserEvent.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserEvent, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserEvent;
  static deserializeBinaryFromReader(message: UserEvent, reader: jspb.BinaryReader): UserEvent;
}

export namespace UserEvent {
  export type AsObject = {
    id: number,
    userId: number,
    eventId: number,
  }
}

export class EventDuration extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  hasStart(): boolean;
  clearStart(): void;
  getStart(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setStart(value?: google_protobuf_timestamp_pb.Timestamp): void;

  hasFinish(): boolean;
  clearFinish(): void;
  getFinish(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setFinish(value?: google_protobuf_timestamp_pb.Timestamp): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EventDuration.AsObject;
  static toObject(includeInstance: boolean, msg: EventDuration): EventDuration.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EventDuration, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EventDuration;
  static deserializeBinaryFromReader(message: EventDuration, reader: jspb.BinaryReader): EventDuration;
}

export namespace EventDuration {
  export type AsObject = {
    id: number,
    eventId: number,
    start?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    finish?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

export class EventRegistration extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  getUserId(): number;
  setUserId(value: number): void;

  getStatus(): StatusMap[keyof StatusMap];
  setStatus(value: StatusMap[keyof StatusMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EventRegistration.AsObject;
  static toObject(includeInstance: boolean, msg: EventRegistration): EventRegistration.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EventRegistration, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EventRegistration;
  static deserializeBinaryFromReader(message: EventRegistration, reader: jspb.BinaryReader): EventRegistration;
}

export namespace EventRegistration {
  export type AsObject = {
    id: number,
    eventId: number,
    userId: number,
    status: StatusMap[keyof StatusMap],
  }
}

export class Tag extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Tag.AsObject;
  static toObject(includeInstance: boolean, msg: Tag): Tag.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Tag, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Tag;
  static deserializeBinaryFromReader(message: Tag, reader: jspb.BinaryReader): Tag;
}

export namespace Tag {
  export type AsObject = {
    id: number,
    name: string,
  }
}

export class EventTag extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  getTagId(): number;
  setTagId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EventTag.AsObject;
  static toObject(includeInstance: boolean, msg: EventTag): EventTag.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EventTag, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EventTag;
  static deserializeBinaryFromReader(message: EventTag, reader: jspb.BinaryReader): EventTag;
}

export namespace EventTag {
  export type AsObject = {
    id: number,
    eventId: number,
    tagId: number,
  }
}

export class OrganizationPermission extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  getPermission(): PermissionMap[keyof PermissionMap];
  setPermission(value: PermissionMap[keyof PermissionMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OrganizationPermission.AsObject;
  static toObject(includeInstance: boolean, msg: OrganizationPermission): OrganizationPermission.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: OrganizationPermission, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OrganizationPermission;
  static deserializeBinaryFromReader(message: OrganizationPermission, reader: jspb.BinaryReader): OrganizationPermission;
}

export namespace OrganizationPermission {
  export type AsObject = {
    id: number,
    organizationId: number,
    permission: PermissionMap[keyof PermissionMap],
  }
}

export class UserPermission extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getUserId(): number;
  setUserId(value: number): void;

  getOrganizationPermissionId(): number;
  setOrganizationPermissionId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserPermission.AsObject;
  static toObject(includeInstance: boolean, msg: UserPermission): UserPermission.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserPermission, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserPermission;
  static deserializeBinaryFromReader(message: UserPermission, reader: jspb.BinaryReader): UserPermission;
}

export namespace UserPermission {
  export type AsObject = {
    id: number,
    userId: number,
    organizationPermissionId: number,
  }
}

export class FacilityRequest extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  getFacilityId(): number;
  setFacilityId(value: number): void;

  getStatus(): StatusMap[keyof StatusMap];
  setStatus(value: StatusMap[keyof StatusMap]): void;

  hasRejectReason(): boolean;
  clearRejectReason(): void;
  getRejectReason(): google_protobuf_wrappers_pb.StringValue | undefined;
  setRejectReason(value?: google_protobuf_wrappers_pb.StringValue): void;

  hasStart(): boolean;
  clearStart(): void;
  getStart(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setStart(value?: google_protobuf_timestamp_pb.Timestamp): void;

  hasFinish(): boolean;
  clearFinish(): void;
  getFinish(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setFinish(value?: google_protobuf_timestamp_pb.Timestamp): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FacilityRequest.AsObject;
  static toObject(includeInstance: boolean, msg: FacilityRequest): FacilityRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FacilityRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FacilityRequest;
  static deserializeBinaryFromReader(message: FacilityRequest, reader: jspb.BinaryReader): FacilityRequest;
}

export namespace FacilityRequest {
  export type AsObject = {
    id: number,
    eventId: number,
    facilityId: number,
    status: StatusMap[keyof StatusMap],
    rejectReason?: google_protobuf_wrappers_pb.StringValue.AsObject,
    start?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    finish?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

export class Facility extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  getName(): string;
  setName(value: string): void;

  getLatitude(): number;
  setLatitude(value: number): void;

  getLongitude(): number;
  setLongitude(value: number): void;

  clearOperatingHoursList(): void;
  getOperatingHoursList(): Array<OperatingHour>;
  setOperatingHoursList(value: Array<OperatingHour>): void;
  addOperatingHours(value?: OperatingHour, index?: number): OperatingHour;

  getDescription(): string;
  setDescription(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Facility.AsObject;
  static toObject(includeInstance: boolean, msg: Facility): Facility.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Facility, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Facility;
  static deserializeBinaryFromReader(message: Facility, reader: jspb.BinaryReader): Facility;
}

export namespace Facility {
  export type AsObject = {
    id: number,
    organizationId: number,
    name: string,
    latitude: number,
    longitude: number,
    operatingHoursList: Array<OperatingHour.AsObject>,
    description: string,
  }
}

export interface DayOfWeekMap {
  SUN: 0;
  MON: 1;
  TUE: 2;
  WED: 3;
  THU: 4;
  FRI: 5;
  SAT: 6;
}

export const DayOfWeek: DayOfWeekMap;

export interface GenderMap {
  MALE: 0;
  FEMALE: 1;
  NOT_SPECIFIED: 2;
}

export const Gender: GenderMap;

export interface StatusMap {
  PENDING: 0;
  APPROVED: 1;
  REJECTED: 2;
}

export const Status: StatusMap;

export interface PermissionMap {
  CREATE_ORGANIZATION: 0;
  READ_ORGANIZATION: 1;
  UPDATE_ORGANIZATION: 2;
  DELETE_ORGANIZATION: 3;
  ADD_MEMBERS_TO_ORGANIZATION: 4;
  REMOVE_MEMBERS_FROM_ORGANIZATION: 5;
  CREATE_EVENT: 6;
  READ_EVENT: 7;
  UPDATE_EVENT: 8;
  DELETE_EVENT: 9;
  CREATE_TAG: 10;
  READ_TAG: 11;
  UPDATE_TAG: 12;
  DELETE_TAG: 13;
  ADD_TAGS_TO_EVENT: 14;
  REMOVE_TAGS_FROM_EVENT: 15;
  CREATE_FACILITY: 16;
  READ_FACILITY: 17;
  UPDATE_FACILITY: 18;
  DELETE_FACILITY: 19;
}

export const Permission: PermissionMap;


// package: hts.organizer
// file: hts/organizer/service.proto

import * as jspb from "google-protobuf";
import * as hts_common_common_pb from "../../hts/common/common_pb";
import * as google_protobuf_timestamp_pb from "google-protobuf/google/protobuf/timestamp_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";

export class UserRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UserRequest): UserRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserRequest;
  static deserializeBinaryFromReader(message: UserRequest, reader: jspb.BinaryReader): UserRequest;
}

export namespace UserRequest {
  export type AsObject = {
    userId: number,
  }
}

export class GetByIdRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getReadId(): number;
  setReadId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetByIdRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetByIdRequest): GetByIdRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetByIdRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetByIdRequest;
  static deserializeBinaryFromReader(message: GetByIdRequest, reader: jspb.BinaryReader): GetByIdRequest;
}

export namespace GetByIdRequest {
  export type AsObject = {
    userId: number,
    readId: number,
  }
}

export class Duration extends jspb.Message {
  hasStart(): boolean;
  clearStart(): void;
  getStart(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setStart(value?: google_protobuf_timestamp_pb.Timestamp): void;

  hasFinish(): boolean;
  clearFinish(): void;
  getFinish(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setFinish(value?: google_protobuf_timestamp_pb.Timestamp): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Duration.AsObject;
  static toObject(includeInstance: boolean, msg: Duration): Duration.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Duration, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Duration;
  static deserializeBinaryFromReader(message: Duration, reader: jspb.BinaryReader): Duration;
}

export namespace Duration {
  export type AsObject = {
    start?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    finish?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

export class CreateOrganizationRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  hasOrganization(): boolean;
  clearOrganization(): void;
  getOrganization(): hts_common_common_pb.Organization | undefined;
  setOrganization(value?: hts_common_common_pb.Organization): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateOrganizationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CreateOrganizationRequest): CreateOrganizationRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CreateOrganizationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateOrganizationRequest;
  static deserializeBinaryFromReader(message: CreateOrganizationRequest, reader: jspb.BinaryReader): CreateOrganizationRequest;
}

export namespace CreateOrganizationRequest {
  export type AsObject = {
    userId: number,
    organization?: hts_common_common_pb.Organization.AsObject,
  }
}

export class UpdateOrganizationRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  hasOrganization(): boolean;
  clearOrganization(): void;
  getOrganization(): hts_common_common_pb.Organization | undefined;
  setOrganization(value?: hts_common_common_pb.Organization): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateOrganizationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateOrganizationRequest): UpdateOrganizationRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateOrganizationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateOrganizationRequest;
  static deserializeBinaryFromReader(message: UpdateOrganizationRequest, reader: jspb.BinaryReader): UpdateOrganizationRequest;
}

export namespace UpdateOrganizationRequest {
  export type AsObject = {
    userId: number,
    organizationId: number,
    organization?: hts_common_common_pb.Organization.AsObject,
  }
}

export class RemoveOrganizationRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RemoveOrganizationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RemoveOrganizationRequest): RemoveOrganizationRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RemoveOrganizationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RemoveOrganizationRequest;
  static deserializeBinaryFromReader(message: RemoveOrganizationRequest, reader: jspb.BinaryReader): RemoveOrganizationRequest;
}

export namespace RemoveOrganizationRequest {
  export type AsObject = {
    userId: number,
    organizationId: number,
  }
}

export class UpdateUsersInOrganizationRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  clearUserIdsList(): void;
  getUserIdsList(): Array<number>;
  setUserIdsList(value: Array<number>): void;
  addUserIds(value: number, index?: number): number;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateUsersInOrganizationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateUsersInOrganizationRequest): UpdateUsersInOrganizationRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateUsersInOrganizationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateUsersInOrganizationRequest;
  static deserializeBinaryFromReader(message: UpdateUsersInOrganizationRequest, reader: jspb.BinaryReader): UpdateUsersInOrganizationRequest;
}

export namespace UpdateUsersInOrganizationRequest {
  export type AsObject = {
    userId: number,
    userIdsList: Array<number>,
    organizationId: number,
  }
}

export class CreateEventRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  hasEvent(): boolean;
  clearEvent(): void;
  getEvent(): hts_common_common_pb.Event | undefined;
  setEvent(value?: hts_common_common_pb.Event): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateEventRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CreateEventRequest): CreateEventRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CreateEventRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateEventRequest;
  static deserializeBinaryFromReader(message: CreateEventRequest, reader: jspb.BinaryReader): CreateEventRequest;
}

export namespace CreateEventRequest {
  export type AsObject = {
    userId: number,
    event?: hts_common_common_pb.Event.AsObject,
  }
}

export class UpdateEventInfoRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  hasEvent(): boolean;
  clearEvent(): void;
  getEvent(): hts_common_common_pb.Event | undefined;
  setEvent(value?: hts_common_common_pb.Event): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateEventInfoRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateEventInfoRequest): UpdateEventInfoRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateEventInfoRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateEventInfoRequest;
  static deserializeBinaryFromReader(message: UpdateEventInfoRequest, reader: jspb.BinaryReader): UpdateEventInfoRequest;
}

export namespace UpdateEventInfoRequest {
  export type AsObject = {
    userId: number,
    event?: hts_common_common_pb.Event.AsObject,
  }
}

export class UpdateEventFacilityRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  hasFacility(): boolean;
  clearFacility(): void;
  getFacility(): hts_common_common_pb.Facility | undefined;
  setFacility(value?: hts_common_common_pb.Facility): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateEventFacilityRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateEventFacilityRequest): UpdateEventFacilityRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateEventFacilityRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateEventFacilityRequest;
  static deserializeBinaryFromReader(message: UpdateEventFacilityRequest, reader: jspb.BinaryReader): UpdateEventFacilityRequest;
}

export namespace UpdateEventFacilityRequest {
  export type AsObject = {
    userId: number,
    facility?: hts_common_common_pb.Facility.AsObject,
  }
}

export class UpdateEventDurationRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  clearDurationList(): void;
  getDurationList(): Array<Duration>;
  setDurationList(value: Array<Duration>): void;
  addDuration(value?: Duration, index?: number): Duration;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateEventDurationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateEventDurationRequest): UpdateEventDurationRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateEventDurationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateEventDurationRequest;
  static deserializeBinaryFromReader(message: UpdateEventDurationRequest, reader: jspb.BinaryReader): UpdateEventDurationRequest;
}

export namespace UpdateEventDurationRequest {
  export type AsObject = {
    userId: number,
    eventId: number,
    durationList: Array<Duration.AsObject>,
  }
}

export class RemoveEventRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RemoveEventRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RemoveEventRequest): RemoveEventRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RemoveEventRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RemoveEventRequest;
  static deserializeBinaryFromReader(message: RemoveEventRequest, reader: jspb.BinaryReader): RemoveEventRequest;
}

export namespace RemoveEventRequest {
  export type AsObject = {
    userId: number,
    eventId: number,
  }
}

export class UpdateRegistrationRequestRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getRegisteredUserId(): number;
  setRegisteredUserId(value: number): void;

  getRegisteredEventId(): number;
  setRegisteredEventId(value: number): void;

  getStatus(): hts_common_common_pb.StatusMap[keyof hts_common_common_pb.StatusMap];
  setStatus(value: hts_common_common_pb.StatusMap[keyof hts_common_common_pb.StatusMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateRegistrationRequestRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateRegistrationRequestRequest): UpdateRegistrationRequestRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateRegistrationRequestRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateRegistrationRequestRequest;
  static deserializeBinaryFromReader(message: UpdateRegistrationRequestRequest, reader: jspb.BinaryReader): UpdateRegistrationRequestRequest;
}

export namespace UpdateRegistrationRequestRequest {
  export type AsObject = {
    userId: number,
    registeredUserId: number,
    registeredEventId: number,
    status: hts_common_common_pb.StatusMap[keyof hts_common_common_pb.StatusMap],
  }
}

export class CreateTagRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  hasTag(): boolean;
  clearTag(): void;
  getTag(): hts_common_common_pb.Tag | undefined;
  setTag(value?: hts_common_common_pb.Tag): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateTagRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CreateTagRequest): CreateTagRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CreateTagRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateTagRequest;
  static deserializeBinaryFromReader(message: CreateTagRequest, reader: jspb.BinaryReader): CreateTagRequest;
}

export namespace CreateTagRequest {
  export type AsObject = {
    userId: number,
    tag?: hts_common_common_pb.Tag.AsObject,
  }
}

export class UpdateTagRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  clearTagIdsList(): void;
  getTagIdsList(): Array<number>;
  setTagIdsList(value: Array<number>): void;
  addTagIds(value: number, index?: number): number;

  getEventId(): number;
  setEventId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateTagRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateTagRequest): UpdateTagRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateTagRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateTagRequest;
  static deserializeBinaryFromReader(message: UpdateTagRequest, reader: jspb.BinaryReader): UpdateTagRequest;
}

export namespace UpdateTagRequest {
  export type AsObject = {
    userId: number,
    tagIdsList: Array<number>,
    eventId: number,
  }
}

export class HasEventRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  getEventId(): number;
  setEventId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): HasEventRequest.AsObject;
  static toObject(includeInstance: boolean, msg: HasEventRequest): HasEventRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: HasEventRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): HasEventRequest;
  static deserializeBinaryFromReader(message: HasEventRequest, reader: jspb.BinaryReader): HasEventRequest;
}

export namespace HasEventRequest {
  export type AsObject = {
    userId: number,
    organizationId: number,
    eventId: number,
  }
}

export class GetOrganizationResponse extends jspb.Message {
  clearOrganizationsList(): void;
  getOrganizationsList(): Array<hts_common_common_pb.Organization>;
  setOrganizationsList(value: Array<hts_common_common_pb.Organization>): void;
  addOrganizations(value?: hts_common_common_pb.Organization, index?: number): hts_common_common_pb.Organization;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetOrganizationResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetOrganizationResponse): GetOrganizationResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetOrganizationResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetOrganizationResponse;
  static deserializeBinaryFromReader(message: GetOrganizationResponse, reader: jspb.BinaryReader): GetOrganizationResponse;
}

export namespace GetOrganizationResponse {
  export type AsObject = {
    organizationsList: Array<hts_common_common_pb.Organization.AsObject>,
  }
}

export class GetOrganizationByIdResponse extends jspb.Message {
  hasOrganization(): boolean;
  clearOrganization(): void;
  getOrganization(): hts_common_common_pb.Organization | undefined;
  setOrganization(value?: hts_common_common_pb.Organization): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetOrganizationByIdResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetOrganizationByIdResponse): GetOrganizationByIdResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetOrganizationByIdResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetOrganizationByIdResponse;
  static deserializeBinaryFromReader(message: GetOrganizationByIdResponse, reader: jspb.BinaryReader): GetOrganizationByIdResponse;
}

export namespace GetOrganizationByIdResponse {
  export type AsObject = {
    organization?: hts_common_common_pb.Organization.AsObject,
  }
}

export class GetEventResponse extends jspb.Message {
  clearEventsList(): void;
  getEventsList(): Array<hts_common_common_pb.Event>;
  setEventsList(value: Array<hts_common_common_pb.Event>): void;
  addEvents(value?: hts_common_common_pb.Event, index?: number): hts_common_common_pb.Event;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetEventResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetEventResponse): GetEventResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetEventResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetEventResponse;
  static deserializeBinaryFromReader(message: GetEventResponse, reader: jspb.BinaryReader): GetEventResponse;
}

export namespace GetEventResponse {
  export type AsObject = {
    eventsList: Array<hts_common_common_pb.Event.AsObject>,
  }
}

export class GetEventByIdResponse extends jspb.Message {
  hasEvent(): boolean;
  clearEvent(): void;
  getEvent(): hts_common_common_pb.Event | undefined;
  setEvent(value?: hts_common_common_pb.Event): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetEventByIdResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetEventByIdResponse): GetEventByIdResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetEventByIdResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetEventByIdResponse;
  static deserializeBinaryFromReader(message: GetEventByIdResponse, reader: jspb.BinaryReader): GetEventByIdResponse;
}

export namespace GetEventByIdResponse {
  export type AsObject = {
    event?: hts_common_common_pb.Event.AsObject,
  }
}

export class GetTagResponse extends jspb.Message {
  clearTagsList(): void;
  getTagsList(): Array<hts_common_common_pb.Tag>;
  setTagsList(value: Array<hts_common_common_pb.Tag>): void;
  addTags(value?: hts_common_common_pb.Tag, index?: number): hts_common_common_pb.Tag;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetTagResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetTagResponse): GetTagResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetTagResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetTagResponse;
  static deserializeBinaryFromReader(message: GetTagResponse, reader: jspb.BinaryReader): GetTagResponse;
}

export namespace GetTagResponse {
  export type AsObject = {
    tagsList: Array<hts_common_common_pb.Tag.AsObject>,
  }
}

export class GetTagByIdResponse extends jspb.Message {
  hasTag(): boolean;
  clearTag(): void;
  getTag(): hts_common_common_pb.Tag | undefined;
  setTag(value?: hts_common_common_pb.Tag): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetTagByIdResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetTagByIdResponse): GetTagByIdResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetTagByIdResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetTagByIdResponse;
  static deserializeBinaryFromReader(message: GetTagByIdResponse, reader: jspb.BinaryReader): GetTagByIdResponse;
}

export namespace GetTagByIdResponse {
  export type AsObject = {
    tag?: hts_common_common_pb.Tag.AsObject,
  }
}


// package: hts.participant
// file: hts/participant/service.proto

import * as jspb from "google-protobuf";
import * as hts_common_common_pb from "../../hts/common/common_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";
import * as google_protobuf_timestamp_pb from "google-protobuf/google/protobuf/timestamp_pb";

export class GenerateQRRequest extends jspb.Message {
  hasUserEvent(): boolean;
  clearUserEvent(): void;
  getUserEvent(): hts_common_common_pb.UserEvent | undefined;
  setUserEvent(value?: hts_common_common_pb.UserEvent): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GenerateQRRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GenerateQRRequest): GenerateQRRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GenerateQRRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GenerateQRRequest;
  static deserializeBinaryFromReader(message: GenerateQRRequest, reader: jspb.BinaryReader): GenerateQRRequest;
}

export namespace GenerateQRRequest {
  export type AsObject = {
    userEvent?: hts_common_common_pb.UserEvent.AsObject,
  }
}

export class GetEventRequest extends jspb.Message {
  getEventId(): number;
  setEventId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetEventRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetEventRequest): GetEventRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetEventRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetEventRequest;
  static deserializeBinaryFromReader(message: GetEventRequest, reader: jspb.BinaryReader): GetEventRequest;
}

export namespace GetEventRequest {
  export type AsObject = {
    eventId: number,
  }
}

export class StringInputRequest extends jspb.Message {
  getText(): string;
  setText(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StringInputRequest.AsObject;
  static toObject(includeInstance: boolean, msg: StringInputRequest): StringInputRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StringInputRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StringInputRequest;
  static deserializeBinaryFromReader(message: StringInputRequest, reader: jspb.BinaryReader): StringInputRequest;
}

export namespace StringInputRequest {
  export type AsObject = {
    text: string,
  }
}

export class UserWithEventRequest extends jspb.Message {
  hasUser(): boolean;
  clearUser(): void;
  getUser(): hts_common_common_pb.User | undefined;
  setUser(value?: hts_common_common_pb.User): void;

  hasEvent(): boolean;
  clearEvent(): void;
  getEvent(): hts_common_common_pb.Event | undefined;
  setEvent(value?: hts_common_common_pb.Event): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UserWithEventRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UserWithEventRequest): UserWithEventRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UserWithEventRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UserWithEventRequest;
  static deserializeBinaryFromReader(message: UserWithEventRequest, reader: jspb.BinaryReader): UserWithEventRequest;
}

export namespace UserWithEventRequest {
  export type AsObject = {
    user?: hts_common_common_pb.User.AsObject,
    event?: hts_common_common_pb.Event.AsObject,
  }
}

export class CreateFeedbackRequest extends jspb.Message {
  hasUser(): boolean;
  clearUser(): void;
  getUser(): hts_common_common_pb.User | undefined;
  setUser(value?: hts_common_common_pb.User): void;

  hasFeedback(): boolean;
  clearFeedback(): void;
  getFeedback(): hts_common_common_pb.EventFeedback | undefined;
  setFeedback(value?: hts_common_common_pb.EventFeedback): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateFeedbackRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CreateFeedbackRequest): CreateFeedbackRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CreateFeedbackRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateFeedbackRequest;
  static deserializeBinaryFromReader(message: CreateFeedbackRequest, reader: jspb.BinaryReader): CreateFeedbackRequest;
}

export namespace CreateFeedbackRequest {
  export type AsObject = {
    user?: hts_common_common_pb.User.AsObject,
    feedback?: hts_common_common_pb.EventFeedback.AsObject,
  }
}

export class GenerateQRResponse extends jspb.Message {
  getData(): string;
  setData(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GenerateQRResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GenerateQRResponse): GenerateQRResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GenerateQRResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GenerateQRResponse;
  static deserializeBinaryFromReader(message: GenerateQRResponse, reader: jspb.BinaryReader): GenerateQRResponse;
}

export namespace GenerateQRResponse {
  export type AsObject = {
    data: string,
  }
}

export class GetFeedbacksFromEventResponse extends jspb.Message {
  clearEventFeedbackList(): void;
  getEventFeedbackList(): Array<hts_common_common_pb.EventFeedback>;
  setEventFeedbackList(value: Array<hts_common_common_pb.EventFeedback>): void;
  addEventFeedback(value?: hts_common_common_pb.EventFeedback, index?: number): hts_common_common_pb.EventFeedback;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetFeedbacksFromEventResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetFeedbacksFromEventResponse): GetFeedbacksFromEventResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetFeedbacksFromEventResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetFeedbacksFromEventResponse;
  static deserializeBinaryFromReader(message: GetFeedbacksFromEventResponse, reader: jspb.BinaryReader): GetFeedbacksFromEventResponse;
}

export namespace GetFeedbacksFromEventResponse {
  export type AsObject = {
    eventFeedbackList: Array<hts_common_common_pb.EventFeedback.AsObject>,
  }
}

export class EventsResponse extends jspb.Message {
  clearEventList(): void;
  getEventList(): Array<hts_common_common_pb.Event>;
  setEventList(value: Array<hts_common_common_pb.Event>): void;
  addEvent(value?: hts_common_common_pb.Event, index?: number): hts_common_common_pb.Event;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EventsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: EventsResponse): EventsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EventsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EventsResponse;
  static deserializeBinaryFromReader(message: EventsResponse, reader: jspb.BinaryReader): EventsResponse;
}

export namespace EventsResponse {
  export type AsObject = {
    eventList: Array<hts_common_common_pb.Event.AsObject>,
  }
}

export class IsEventAvailableRequest extends jspb.Message {
  hasEvent(): boolean;
  clearEvent(): void;
  getEvent(): hts_common_common_pb.Event | undefined;
  setEvent(value?: hts_common_common_pb.Event): void;

  hasDate(): boolean;
  clearDate(): void;
  getDate(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setDate(value?: google_protobuf_timestamp_pb.Timestamp): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): IsEventAvailableRequest.AsObject;
  static toObject(includeInstance: boolean, msg: IsEventAvailableRequest): IsEventAvailableRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: IsEventAvailableRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): IsEventAvailableRequest;
  static deserializeBinaryFromReader(message: IsEventAvailableRequest, reader: jspb.BinaryReader): IsEventAvailableRequest;
}

export namespace IsEventAvailableRequest {
  export type AsObject = {
    event?: hts_common_common_pb.Event.AsObject,
    date?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}


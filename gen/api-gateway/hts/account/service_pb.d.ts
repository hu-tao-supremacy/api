// package: hts.account
// file: hts/account/service.proto

import * as jspb from "google-protobuf";
import * as hts_common_common_pb from "../../hts/common/common_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";

export class IsAuthenticatedRequest extends jspb.Message {
  getAccessToken(): string;
  setAccessToken(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): IsAuthenticatedRequest.AsObject;
  static toObject(includeInstance: boolean, msg: IsAuthenticatedRequest): IsAuthenticatedRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: IsAuthenticatedRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): IsAuthenticatedRequest;
  static deserializeBinaryFromReader(message: IsAuthenticatedRequest, reader: jspb.BinaryReader): IsAuthenticatedRequest;
}

export namespace IsAuthenticatedRequest {
  export type AsObject = {
    accessToken: string,
  }
}

export class UpdateAccountInfoRequest extends jspb.Message {
  hasUser(): boolean;
  clearUser(): void;
  getUser(): hts_common_common_pb.User | undefined;
  setUser(value?: hts_common_common_pb.User): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateAccountInfoRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateAccountInfoRequest): UpdateAccountInfoRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateAccountInfoRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateAccountInfoRequest;
  static deserializeBinaryFromReader(message: UpdateAccountInfoRequest, reader: jspb.BinaryReader): UpdateAccountInfoRequest;
}

export namespace UpdateAccountInfoRequest {
  export type AsObject = {
    user?: hts_common_common_pb.User.AsObject,
  }
}

export class UpdateAccountInfoResponse extends jspb.Message {
  hasUser(): boolean;
  clearUser(): void;
  getUser(): hts_common_common_pb.User | undefined;
  setUser(value?: hts_common_common_pb.User): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateAccountInfoResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateAccountInfoResponse): UpdateAccountInfoResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateAccountInfoResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateAccountInfoResponse;
  static deserializeBinaryFromReader(message: UpdateAccountInfoResponse, reader: jspb.BinaryReader): UpdateAccountInfoResponse;
}

export namespace UpdateAccountInfoResponse {
  export type AsObject = {
    user?: hts_common_common_pb.User.AsObject,
  }
}

export class GenerateJWTRequest extends jspb.Message {
  hasUser(): boolean;
  clearUser(): void;
  getUser(): hts_common_common_pb.User | undefined;
  setUser(value?: hts_common_common_pb.User): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GenerateJWTRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GenerateJWTRequest): GenerateJWTRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GenerateJWTRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GenerateJWTRequest;
  static deserializeBinaryFromReader(message: GenerateJWTRequest, reader: jspb.BinaryReader): GenerateJWTRequest;
}

export namespace GenerateJWTRequest {
  export type AsObject = {
    user?: hts_common_common_pb.User.AsObject,
  }
}

export class InvalidateJWTRequest extends jspb.Message {
  getAccessToken(): string;
  setAccessToken(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InvalidateJWTRequest.AsObject;
  static toObject(includeInstance: boolean, msg: InvalidateJWTRequest): InvalidateJWTRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: InvalidateJWTRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InvalidateJWTRequest;
  static deserializeBinaryFromReader(message: InvalidateJWTRequest, reader: jspb.BinaryReader): InvalidateJWTRequest;
}

export namespace InvalidateJWTRequest {
  export type AsObject = {
    accessToken: string,
  }
}

export class HasPermissionRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  getPermissionName(): hts_common_common_pb.PermissionMap[keyof hts_common_common_pb.PermissionMap];
  setPermissionName(value: hts_common_common_pb.PermissionMap[keyof hts_common_common_pb.PermissionMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): HasPermissionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: HasPermissionRequest): HasPermissionRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: HasPermissionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): HasPermissionRequest;
  static deserializeBinaryFromReader(message: HasPermissionRequest, reader: jspb.BinaryReader): HasPermissionRequest;
}

export namespace HasPermissionRequest {
  export type AsObject = {
    userId: number,
    organizationId: number,
    permissionName: hts_common_common_pb.PermissionMap[keyof hts_common_common_pb.PermissionMap],
  }
}


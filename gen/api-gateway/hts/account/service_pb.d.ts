// package: hts.account
// file: hts/account/service.proto

import * as jspb from "google-protobuf";
import * as hts_common_common_pb from "../../hts/common/common_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";

export class IsAuthenticatedInput extends jspb.Message {
  getAccessToken(): string;
  setAccessToken(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): IsAuthenticatedInput.AsObject;
  static toObject(includeInstance: boolean, msg: IsAuthenticatedInput): IsAuthenticatedInput.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: IsAuthenticatedInput, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): IsAuthenticatedInput;
  static deserializeBinaryFromReader(message: IsAuthenticatedInput, reader: jspb.BinaryReader): IsAuthenticatedInput;
}

export namespace IsAuthenticatedInput {
  export type AsObject = {
    accessToken: string,
  }
}

export class UpdateAccountInfoInput extends jspb.Message {
  hasUser(): boolean;
  clearUser(): void;
  getUser(): hts_common_common_pb.User | undefined;
  setUser(value?: hts_common_common_pb.User): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateAccountInfoInput.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateAccountInfoInput): UpdateAccountInfoInput.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateAccountInfoInput, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateAccountInfoInput;
  static deserializeBinaryFromReader(message: UpdateAccountInfoInput, reader: jspb.BinaryReader): UpdateAccountInfoInput;
}

export namespace UpdateAccountInfoInput {
  export type AsObject = {
    user?: hts_common_common_pb.User.AsObject,
  }
}

export class UpdateAccountInfoOutput extends jspb.Message {
  hasUser(): boolean;
  clearUser(): void;
  getUser(): hts_common_common_pb.User | undefined;
  setUser(value?: hts_common_common_pb.User): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateAccountInfoOutput.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateAccountInfoOutput): UpdateAccountInfoOutput.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateAccountInfoOutput, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateAccountInfoOutput;
  static deserializeBinaryFromReader(message: UpdateAccountInfoOutput, reader: jspb.BinaryReader): UpdateAccountInfoOutput;
}

export namespace UpdateAccountInfoOutput {
  export type AsObject = {
    user?: hts_common_common_pb.User.AsObject,
  }
}

export class GenerateJWTInput extends jspb.Message {
  hasUser(): boolean;
  clearUser(): void;
  getUser(): hts_common_common_pb.User | undefined;
  setUser(value?: hts_common_common_pb.User): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GenerateJWTInput.AsObject;
  static toObject(includeInstance: boolean, msg: GenerateJWTInput): GenerateJWTInput.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GenerateJWTInput, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GenerateJWTInput;
  static deserializeBinaryFromReader(message: GenerateJWTInput, reader: jspb.BinaryReader): GenerateJWTInput;
}

export namespace GenerateJWTInput {
  export type AsObject = {
    user?: hts_common_common_pb.User.AsObject,
  }
}

export class InvalidateJWTInput extends jspb.Message {
  getAccessToken(): string;
  setAccessToken(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InvalidateJWTInput.AsObject;
  static toObject(includeInstance: boolean, msg: InvalidateJWTInput): InvalidateJWTInput.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: InvalidateJWTInput, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InvalidateJWTInput;
  static deserializeBinaryFromReader(message: InvalidateJWTInput, reader: jspb.BinaryReader): InvalidateJWTInput;
}

export namespace InvalidateJWTInput {
  export type AsObject = {
    accessToken: string,
  }
}

export class HasPermissionInput extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): void;

  getOrganizationId(): number;
  setOrganizationId(value: number): void;

  getPermissionName(): hts_common_common_pb.PermissionMap[keyof hts_common_common_pb.PermissionMap];
  setPermissionName(value: hts_common_common_pb.PermissionMap[keyof hts_common_common_pb.PermissionMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): HasPermissionInput.AsObject;
  static toObject(includeInstance: boolean, msg: HasPermissionInput): HasPermissionInput.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: HasPermissionInput, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): HasPermissionInput;
  static deserializeBinaryFromReader(message: HasPermissionInput, reader: jspb.BinaryReader): HasPermissionInput;
}

export namespace HasPermissionInput {
  export type AsObject = {
    userId: number,
    organizationId: number,
    permissionName: hts_common_common_pb.PermissionMap[keyof hts_common_common_pb.PermissionMap],
  }
}


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

export class GenerateJWTOutput extends jspb.Message {
  getAccessToken(): string;
  setAccessToken(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GenerateJWTOutput.AsObject;
  static toObject(includeInstance: boolean, msg: GenerateJWTOutput): GenerateJWTOutput.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GenerateJWTOutput, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GenerateJWTOutput;
  static deserializeBinaryFromReader(message: GenerateJWTOutput, reader: jspb.BinaryReader): GenerateJWTOutput;
}

export namespace GenerateJWTOutput {
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


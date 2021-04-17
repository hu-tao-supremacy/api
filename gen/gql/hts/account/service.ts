/* eslint-disable */
import {
  Permission,
  UserOrganization,
  User,
  permissionFromJSON,
  permissionToJSON,
  GetObjectByIdRequest,
} from "../../hts/common/common";
import { Writer, Reader } from "protobufjs/minimal";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.account";

export enum Role {
  ROLE_UNSPECIFIED = 0,
  ORGANIZATION_OWNER = 1,
  ORGANIZATION_EDITOR = 2,
  ORGANIZATION_MEMBER = 3,
  UNRECOGNIZED = -1,
}

export function roleFromJSON(object: any): Role {
  switch (object) {
    case 0:
    case "ROLE_UNSPECIFIED":
      return Role.ROLE_UNSPECIFIED;
    case 1:
    case "ORGANIZATION_OWNER":
      return Role.ORGANIZATION_OWNER;
    case 2:
    case "ORGANIZATION_EDITOR":
      return Role.ORGANIZATION_EDITOR;
    case 3:
    case "ORGANIZATION_MEMBER":
      return Role.ORGANIZATION_MEMBER;
    case -1:
    case "UNRECOGNIZED":
    default:
      return Role.UNRECOGNIZED;
  }
}

export function roleToJSON(object: Role): string {
  switch (object) {
    case Role.ROLE_UNSPECIFIED:
      return "ROLE_UNSPECIFIED";
    case Role.ORGANIZATION_OWNER:
      return "ORGANIZATION_OWNER";
    case Role.ORGANIZATION_EDITOR:
      return "ORGANIZATION_EDITOR";
    case Role.ORGANIZATION_MEMBER:
      return "ORGANIZATION_MEMBER";
    default:
      return "UNKNOWN";
  }
}

export interface AccessTokenPayload {
  userId: number;
}

export interface IsAuthenticatedRequest {
  accessToken: string;
}

export interface GenerateAccessTokenRequest {
  userId: number;
}

export interface GenerateAccessTokenResponse {
  accessToken: string;
}

export interface HasPermissionRequest {
  userId: number;
  organizationId: number;
  permissionName: Permission;
}

export interface CreateUserRequest {
  firstName: string;
  lastName: string;
  chulaId: string;
  email: string;
  isChulaStudent: boolean;
}

export interface GetUserByChulaIdRequest {
  id: string;
}

export interface GetUserByEmailRequest {
  email: string;
}

export interface AssignRoleRequest {
  userId: number;
  organizationId: number;
  role: Role;
}

export interface RemoveRoleRequest {
  userId: number;
  organizationId: number;
  role: Role;
}

export interface SetInterestedTagsRequest {
  userId: number;
  tagIds: number[];
}

export interface SetInterestedEventsRequest {
  userId: number;
  eventIds: number[];
}

export interface GetUserOrganizationsByUserIdResponse {
  userOrganizations: UserOrganization[];
}

export interface GetUserOrganizationsByOrganizationIdResponse {
  userOrganizations: UserOrganization[];
}

export interface SearchUserRequest {
  keyword: string;
}

export interface SearchUserResponse {
  users: User[];
}

const baseAccessTokenPayload: object = { userId: 0 };

export const AccessTokenPayload = {
  encode(
    message: AccessTokenPayload,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): AccessTokenPayload {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseAccessTokenPayload } as AccessTokenPayload;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): AccessTokenPayload {
    const message = { ...baseAccessTokenPayload } as AccessTokenPayload;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    return message;
  },

  toJSON(message: AccessTokenPayload): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    return obj;
  },

  fromPartial(object: DeepPartial<AccessTokenPayload>): AccessTokenPayload {
    const message = { ...baseAccessTokenPayload } as AccessTokenPayload;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    return message;
  },
};

const baseIsAuthenticatedRequest: object = { accessToken: "" };

export const IsAuthenticatedRequest = {
  encode(
    message: IsAuthenticatedRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.accessToken !== "") {
      writer.uint32(10).string(message.accessToken);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): IsAuthenticatedRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseIsAuthenticatedRequest } as IsAuthenticatedRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.accessToken = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): IsAuthenticatedRequest {
    const message = { ...baseIsAuthenticatedRequest } as IsAuthenticatedRequest;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = String(object.accessToken);
    } else {
      message.accessToken = "";
    }
    return message;
  },

  toJSON(message: IsAuthenticatedRequest): unknown {
    const obj: any = {};
    message.accessToken !== undefined &&
      (obj.accessToken = message.accessToken);
    return obj;
  },

  fromPartial(
    object: DeepPartial<IsAuthenticatedRequest>
  ): IsAuthenticatedRequest {
    const message = { ...baseIsAuthenticatedRequest } as IsAuthenticatedRequest;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = object.accessToken;
    } else {
      message.accessToken = "";
    }
    return message;
  },
};

const baseGenerateAccessTokenRequest: object = { userId: 0 };

export const GenerateAccessTokenRequest = {
  encode(
    message: GenerateAccessTokenRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GenerateAccessTokenRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGenerateAccessTokenRequest,
    } as GenerateAccessTokenRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GenerateAccessTokenRequest {
    const message = {
      ...baseGenerateAccessTokenRequest,
    } as GenerateAccessTokenRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    return message;
  },

  toJSON(message: GenerateAccessTokenRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GenerateAccessTokenRequest>
  ): GenerateAccessTokenRequest {
    const message = {
      ...baseGenerateAccessTokenRequest,
    } as GenerateAccessTokenRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    return message;
  },
};

const baseGenerateAccessTokenResponse: object = { accessToken: "" };

export const GenerateAccessTokenResponse = {
  encode(
    message: GenerateAccessTokenResponse,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.accessToken !== "") {
      writer.uint32(10).string(message.accessToken);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GenerateAccessTokenResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGenerateAccessTokenResponse,
    } as GenerateAccessTokenResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.accessToken = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GenerateAccessTokenResponse {
    const message = {
      ...baseGenerateAccessTokenResponse,
    } as GenerateAccessTokenResponse;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = String(object.accessToken);
    } else {
      message.accessToken = "";
    }
    return message;
  },

  toJSON(message: GenerateAccessTokenResponse): unknown {
    const obj: any = {};
    message.accessToken !== undefined &&
      (obj.accessToken = message.accessToken);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GenerateAccessTokenResponse>
  ): GenerateAccessTokenResponse {
    const message = {
      ...baseGenerateAccessTokenResponse,
    } as GenerateAccessTokenResponse;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = object.accessToken;
    } else {
      message.accessToken = "";
    }
    return message;
  },
};

const baseHasPermissionRequest: object = {
  userId: 0,
  organizationId: 0,
  permissionName: 0,
};

export const HasPermissionRequest = {
  encode(
    message: HasPermissionRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int32(message.organizationId);
    }
    if (message.permissionName !== 0) {
      writer.uint32(24).int32(message.permissionName);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): HasPermissionRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseHasPermissionRequest } as HasPermissionRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.organizationId = reader.int32();
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

  fromJSON(object: any): HasPermissionRequest {
    const message = { ...baseHasPermissionRequest } as HasPermissionRequest;
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
    if (object.permissionName !== undefined && object.permissionName !== null) {
      message.permissionName = permissionFromJSON(object.permissionName);
    } else {
      message.permissionName = 0;
    }
    return message;
  },

  toJSON(message: HasPermissionRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.permissionName !== undefined &&
      (obj.permissionName = permissionToJSON(message.permissionName));
    return obj;
  },

  fromPartial(object: DeepPartial<HasPermissionRequest>): HasPermissionRequest {
    const message = { ...baseHasPermissionRequest } as HasPermissionRequest;
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
    if (object.permissionName !== undefined && object.permissionName !== null) {
      message.permissionName = object.permissionName;
    } else {
      message.permissionName = 0;
    }
    return message;
  },
};

const baseCreateUserRequest: object = {
  firstName: "",
  lastName: "",
  chulaId: "",
  email: "",
  isChulaStudent: false,
};

export const CreateUserRequest = {
  encode(message: CreateUserRequest, writer: Writer = Writer.create()): Writer {
    if (message.firstName !== "") {
      writer.uint32(10).string(message.firstName);
    }
    if (message.lastName !== "") {
      writer.uint32(18).string(message.lastName);
    }
    if (message.chulaId !== "") {
      writer.uint32(26).string(message.chulaId);
    }
    if (message.email !== "") {
      writer.uint32(34).string(message.email);
    }
    if (message.isChulaStudent === true) {
      writer.uint32(40).bool(message.isChulaStudent);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): CreateUserRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseCreateUserRequest } as CreateUserRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.firstName = reader.string();
          break;
        case 2:
          message.lastName = reader.string();
          break;
        case 3:
          message.chulaId = reader.string();
          break;
        case 4:
          message.email = reader.string();
          break;
        case 5:
          message.isChulaStudent = reader.bool();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateUserRequest {
    const message = { ...baseCreateUserRequest } as CreateUserRequest;
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
    if (object.chulaId !== undefined && object.chulaId !== null) {
      message.chulaId = String(object.chulaId);
    } else {
      message.chulaId = "";
    }
    if (object.email !== undefined && object.email !== null) {
      message.email = String(object.email);
    } else {
      message.email = "";
    }
    if (object.isChulaStudent !== undefined && object.isChulaStudent !== null) {
      message.isChulaStudent = Boolean(object.isChulaStudent);
    } else {
      message.isChulaStudent = false;
    }
    return message;
  },

  toJSON(message: CreateUserRequest): unknown {
    const obj: any = {};
    message.firstName !== undefined && (obj.firstName = message.firstName);
    message.lastName !== undefined && (obj.lastName = message.lastName);
    message.chulaId !== undefined && (obj.chulaId = message.chulaId);
    message.email !== undefined && (obj.email = message.email);
    message.isChulaStudent !== undefined &&
      (obj.isChulaStudent = message.isChulaStudent);
    return obj;
  },

  fromPartial(object: DeepPartial<CreateUserRequest>): CreateUserRequest {
    const message = { ...baseCreateUserRequest } as CreateUserRequest;
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
    if (object.chulaId !== undefined && object.chulaId !== null) {
      message.chulaId = object.chulaId;
    } else {
      message.chulaId = "";
    }
    if (object.email !== undefined && object.email !== null) {
      message.email = object.email;
    } else {
      message.email = "";
    }
    if (object.isChulaStudent !== undefined && object.isChulaStudent !== null) {
      message.isChulaStudent = object.isChulaStudent;
    } else {
      message.isChulaStudent = false;
    }
    return message;
  },
};

const baseGetUserByChulaIdRequest: object = { id: "" };

export const GetUserByChulaIdRequest = {
  encode(
    message: GetUserByChulaIdRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.id !== "") {
      writer.uint32(10).string(message.id);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetUserByChulaIdRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetUserByChulaIdRequest,
    } as GetUserByChulaIdRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUserByChulaIdRequest {
    const message = {
      ...baseGetUserByChulaIdRequest,
    } as GetUserByChulaIdRequest;
    if (object.id !== undefined && object.id !== null) {
      message.id = String(object.id);
    } else {
      message.id = "";
    }
    return message;
  },

  toJSON(message: GetUserByChulaIdRequest): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetUserByChulaIdRequest>
  ): GetUserByChulaIdRequest {
    const message = {
      ...baseGetUserByChulaIdRequest,
    } as GetUserByChulaIdRequest;
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = "";
    }
    return message;
  },
};

const baseGetUserByEmailRequest: object = { email: "" };

export const GetUserByEmailRequest = {
  encode(
    message: GetUserByEmailRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.email !== "") {
      writer.uint32(10).string(message.email);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetUserByEmailRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetUserByEmailRequest } as GetUserByEmailRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.email = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUserByEmailRequest {
    const message = { ...baseGetUserByEmailRequest } as GetUserByEmailRequest;
    if (object.email !== undefined && object.email !== null) {
      message.email = String(object.email);
    } else {
      message.email = "";
    }
    return message;
  },

  toJSON(message: GetUserByEmailRequest): unknown {
    const obj: any = {};
    message.email !== undefined && (obj.email = message.email);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetUserByEmailRequest>
  ): GetUserByEmailRequest {
    const message = { ...baseGetUserByEmailRequest } as GetUserByEmailRequest;
    if (object.email !== undefined && object.email !== null) {
      message.email = object.email;
    } else {
      message.email = "";
    }
    return message;
  },
};

const baseAssignRoleRequest: object = { userId: 0, organizationId: 0, role: 0 };

export const AssignRoleRequest = {
  encode(message: AssignRoleRequest, writer: Writer = Writer.create()): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int32(message.organizationId);
    }
    if (message.role !== 0) {
      writer.uint32(24).int32(message.role);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): AssignRoleRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseAssignRoleRequest } as AssignRoleRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.organizationId = reader.int32();
          break;
        case 3:
          message.role = reader.int32() as any;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): AssignRoleRequest {
    const message = { ...baseAssignRoleRequest } as AssignRoleRequest;
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
    if (object.role !== undefined && object.role !== null) {
      message.role = roleFromJSON(object.role);
    } else {
      message.role = 0;
    }
    return message;
  },

  toJSON(message: AssignRoleRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.role !== undefined && (obj.role = roleToJSON(message.role));
    return obj;
  },

  fromPartial(object: DeepPartial<AssignRoleRequest>): AssignRoleRequest {
    const message = { ...baseAssignRoleRequest } as AssignRoleRequest;
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
    if (object.role !== undefined && object.role !== null) {
      message.role = object.role;
    } else {
      message.role = 0;
    }
    return message;
  },
};

const baseRemoveRoleRequest: object = { userId: 0, organizationId: 0, role: 0 };

export const RemoveRoleRequest = {
  encode(message: RemoveRoleRequest, writer: Writer = Writer.create()): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int32(message.organizationId);
    }
    if (message.role !== 0) {
      writer.uint32(24).int32(message.role);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): RemoveRoleRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseRemoveRoleRequest } as RemoveRoleRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          message.organizationId = reader.int32();
          break;
        case 3:
          message.role = reader.int32() as any;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): RemoveRoleRequest {
    const message = { ...baseRemoveRoleRequest } as RemoveRoleRequest;
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
    if (object.role !== undefined && object.role !== null) {
      message.role = roleFromJSON(object.role);
    } else {
      message.role = 0;
    }
    return message;
  },

  toJSON(message: RemoveRoleRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.role !== undefined && (obj.role = roleToJSON(message.role));
    return obj;
  },

  fromPartial(object: DeepPartial<RemoveRoleRequest>): RemoveRoleRequest {
    const message = { ...baseRemoveRoleRequest } as RemoveRoleRequest;
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
    if (object.role !== undefined && object.role !== null) {
      message.role = object.role;
    } else {
      message.role = 0;
    }
    return message;
  },
};

const baseSetInterestedTagsRequest: object = { userId: 0, tagIds: 0 };

export const SetInterestedTagsRequest = {
  encode(
    message: SetInterestedTagsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    writer.uint32(18).fork();
    for (const v of message.tagIds) {
      writer.int32(v);
    }
    writer.ldelim();
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): SetInterestedTagsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseSetInterestedTagsRequest,
    } as SetInterestedTagsRequest;
    message.tagIds = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.tagIds.push(reader.int32());
            }
          } else {
            message.tagIds.push(reader.int32());
          }
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SetInterestedTagsRequest {
    const message = {
      ...baseSetInterestedTagsRequest,
    } as SetInterestedTagsRequest;
    message.tagIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.tagIds !== undefined && object.tagIds !== null) {
      for (const e of object.tagIds) {
        message.tagIds.push(Number(e));
      }
    }
    return message;
  },

  toJSON(message: SetInterestedTagsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.tagIds) {
      obj.tagIds = message.tagIds.map((e) => e);
    } else {
      obj.tagIds = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<SetInterestedTagsRequest>
  ): SetInterestedTagsRequest {
    const message = {
      ...baseSetInterestedTagsRequest,
    } as SetInterestedTagsRequest;
    message.tagIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.tagIds !== undefined && object.tagIds !== null) {
      for (const e of object.tagIds) {
        message.tagIds.push(e);
      }
    }
    return message;
  },
};

const baseSetInterestedEventsRequest: object = { userId: 0, eventIds: 0 };

export const SetInterestedEventsRequest = {
  encode(
    message: SetInterestedEventsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    writer.uint32(18).fork();
    for (const v of message.eventIds) {
      writer.int32(v);
    }
    writer.ldelim();
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): SetInterestedEventsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseSetInterestedEventsRequest,
    } as SetInterestedEventsRequest;
    message.eventIds = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        case 2:
          if ((tag & 7) === 2) {
            const end2 = reader.uint32() + reader.pos;
            while (reader.pos < end2) {
              message.eventIds.push(reader.int32());
            }
          } else {
            message.eventIds.push(reader.int32());
          }
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SetInterestedEventsRequest {
    const message = {
      ...baseSetInterestedEventsRequest,
    } as SetInterestedEventsRequest;
    message.eventIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.eventIds !== undefined && object.eventIds !== null) {
      for (const e of object.eventIds) {
        message.eventIds.push(Number(e));
      }
    }
    return message;
  },

  toJSON(message: SetInterestedEventsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    if (message.eventIds) {
      obj.eventIds = message.eventIds.map((e) => e);
    } else {
      obj.eventIds = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<SetInterestedEventsRequest>
  ): SetInterestedEventsRequest {
    const message = {
      ...baseSetInterestedEventsRequest,
    } as SetInterestedEventsRequest;
    message.eventIds = [];
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.eventIds !== undefined && object.eventIds !== null) {
      for (const e of object.eventIds) {
        message.eventIds.push(e);
      }
    }
    return message;
  },
};

const baseGetUserOrganizationsByUserIdResponse: object = {};

export const GetUserOrganizationsByUserIdResponse = {
  encode(
    message: GetUserOrganizationsByUserIdResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.userOrganizations) {
      UserOrganization.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetUserOrganizationsByUserIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetUserOrganizationsByUserIdResponse,
    } as GetUserOrganizationsByUserIdResponse;
    message.userOrganizations = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userOrganizations.push(
            UserOrganization.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUserOrganizationsByUserIdResponse {
    const message = {
      ...baseGetUserOrganizationsByUserIdResponse,
    } as GetUserOrganizationsByUserIdResponse;
    message.userOrganizations = [];
    if (
      object.userOrganizations !== undefined &&
      object.userOrganizations !== null
    ) {
      for (const e of object.userOrganizations) {
        message.userOrganizations.push(UserOrganization.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetUserOrganizationsByUserIdResponse): unknown {
    const obj: any = {};
    if (message.userOrganizations) {
      obj.userOrganizations = message.userOrganizations.map((e) =>
        e ? UserOrganization.toJSON(e) : undefined
      );
    } else {
      obj.userOrganizations = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetUserOrganizationsByUserIdResponse>
  ): GetUserOrganizationsByUserIdResponse {
    const message = {
      ...baseGetUserOrganizationsByUserIdResponse,
    } as GetUserOrganizationsByUserIdResponse;
    message.userOrganizations = [];
    if (
      object.userOrganizations !== undefined &&
      object.userOrganizations !== null
    ) {
      for (const e of object.userOrganizations) {
        message.userOrganizations.push(UserOrganization.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetUserOrganizationsByOrganizationIdResponse: object = {};

export const GetUserOrganizationsByOrganizationIdResponse = {
  encode(
    message: GetUserOrganizationsByOrganizationIdResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.userOrganizations) {
      UserOrganization.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetUserOrganizationsByOrganizationIdResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetUserOrganizationsByOrganizationIdResponse,
    } as GetUserOrganizationsByOrganizationIdResponse;
    message.userOrganizations = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userOrganizations.push(
            UserOrganization.decode(reader, reader.uint32())
          );
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUserOrganizationsByOrganizationIdResponse {
    const message = {
      ...baseGetUserOrganizationsByOrganizationIdResponse,
    } as GetUserOrganizationsByOrganizationIdResponse;
    message.userOrganizations = [];
    if (
      object.userOrganizations !== undefined &&
      object.userOrganizations !== null
    ) {
      for (const e of object.userOrganizations) {
        message.userOrganizations.push(UserOrganization.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetUserOrganizationsByOrganizationIdResponse): unknown {
    const obj: any = {};
    if (message.userOrganizations) {
      obj.userOrganizations = message.userOrganizations.map((e) =>
        e ? UserOrganization.toJSON(e) : undefined
      );
    } else {
      obj.userOrganizations = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetUserOrganizationsByOrganizationIdResponse>
  ): GetUserOrganizationsByOrganizationIdResponse {
    const message = {
      ...baseGetUserOrganizationsByOrganizationIdResponse,
    } as GetUserOrganizationsByOrganizationIdResponse;
    message.userOrganizations = [];
    if (
      object.userOrganizations !== undefined &&
      object.userOrganizations !== null
    ) {
      for (const e of object.userOrganizations) {
        message.userOrganizations.push(UserOrganization.fromPartial(e));
      }
    }
    return message;
  },
};

const baseSearchUserRequest: object = { keyword: "" };

export const SearchUserRequest = {
  encode(message: SearchUserRequest, writer: Writer = Writer.create()): Writer {
    if (message.keyword !== "") {
      writer.uint32(10).string(message.keyword);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): SearchUserRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseSearchUserRequest } as SearchUserRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.keyword = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SearchUserRequest {
    const message = { ...baseSearchUserRequest } as SearchUserRequest;
    if (object.keyword !== undefined && object.keyword !== null) {
      message.keyword = String(object.keyword);
    } else {
      message.keyword = "";
    }
    return message;
  },

  toJSON(message: SearchUserRequest): unknown {
    const obj: any = {};
    message.keyword !== undefined && (obj.keyword = message.keyword);
    return obj;
  },

  fromPartial(object: DeepPartial<SearchUserRequest>): SearchUserRequest {
    const message = { ...baseSearchUserRequest } as SearchUserRequest;
    if (object.keyword !== undefined && object.keyword !== null) {
      message.keyword = object.keyword;
    } else {
      message.keyword = "";
    }
    return message;
  },
};

const baseSearchUserResponse: object = {};

export const SearchUserResponse = {
  encode(
    message: SearchUserResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.users) {
      User.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): SearchUserResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseSearchUserResponse } as SearchUserResponse;
    message.users = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.users.push(User.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SearchUserResponse {
    const message = { ...baseSearchUserResponse } as SearchUserResponse;
    message.users = [];
    if (object.users !== undefined && object.users !== null) {
      for (const e of object.users) {
        message.users.push(User.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: SearchUserResponse): unknown {
    const obj: any = {};
    if (message.users) {
      obj.users = message.users.map((e) => (e ? User.toJSON(e) : undefined));
    } else {
      obj.users = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<SearchUserResponse>): SearchUserResponse {
    const message = { ...baseSearchUserResponse } as SearchUserResponse;
    message.users = [];
    if (object.users !== undefined && object.users !== null) {
      for (const e of object.users) {
        message.users.push(User.fromPartial(e));
      }
    }
    return message;
  },
};

export interface AccountService {
  CreateUser(request: CreateUserRequest): Promise<User>;
  SearchUser(request: SearchUserRequest): Promise<SearchUserResponse>;
  GetUserByChulaId(request: GetUserByChulaIdRequest): Promise<User>;
  GetUserByEmail(request: GetUserByEmailRequest): Promise<User>;
  IsAuthenticated(
    request: IsAuthenticatedRequest
  ): Promise<boolean | undefined>;
  UpdateAccountInfo(request: User): Promise<User>;
  SetInterestedTags(request: SetInterestedTagsRequest): Promise<User>;
  SetInterestedEvents(request: SetInterestedEventsRequest): Promise<User>;
  GetUserById(request: GetObjectByIdRequest): Promise<User>;
  GenerateAccessToken(
    request: GenerateAccessTokenRequest
  ): Promise<GenerateAccessTokenResponse>;
  HasPermission(request: HasPermissionRequest): Promise<boolean | undefined>;
  AssignRole(request: AssignRoleRequest): Promise<boolean | undefined>;
  RemoveRole(request: RemoveRoleRequest): Promise<boolean | undefined>;
  GetUserOrganizationsByUserId(
    request: GetObjectByIdRequest
  ): Promise<GetUserOrganizationsByUserIdResponse>;
  GetUserOrganizationsByOrganizationId(
    request: GetObjectByIdRequest
  ): Promise<GetUserOrganizationsByOrganizationIdResponse>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

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

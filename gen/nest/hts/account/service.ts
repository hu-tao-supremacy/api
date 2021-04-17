/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
  Permission,
  UserOrganization,
  User,
  permissionFromJSON,
  permissionToJSON,
  GetObjectByIdRequest,
} from "../../hts/common/common";
import { Observable } from "rxjs";
import { BoolValue } from "../../google/protobuf/wrappers";
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

export const HTS_ACCOUNT_PACKAGE_NAME = "hts.account";

const baseAccessTokenPayload: object = { userId: 0 };

export const AccessTokenPayload = {
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
};

const baseIsAuthenticatedRequest: object = { accessToken: "" };

export const IsAuthenticatedRequest = {
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
};

const baseGenerateAccessTokenRequest: object = { userId: 0 };

export const GenerateAccessTokenRequest = {
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
};

const baseGenerateAccessTokenResponse: object = { accessToken: "" };

export const GenerateAccessTokenResponse = {
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
};

const baseHasPermissionRequest: object = {
  userId: 0,
  organizationId: 0,
  permissionName: 0,
};

export const HasPermissionRequest = {
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
};

const baseCreateUserRequest: object = {
  firstName: "",
  lastName: "",
  chulaId: "",
  email: "",
  isChulaStudent: false,
};

export const CreateUserRequest = {
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
};

const baseGetUserByChulaIdRequest: object = { id: "" };

export const GetUserByChulaIdRequest = {
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
};

const baseGetUserByEmailRequest: object = { email: "" };

export const GetUserByEmailRequest = {
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
};

const baseAssignRoleRequest: object = { userId: 0, organizationId: 0, role: 0 };

export const AssignRoleRequest = {
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
};

const baseRemoveRoleRequest: object = { userId: 0, organizationId: 0, role: 0 };

export const RemoveRoleRequest = {
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
};

const baseSetInterestedTagsRequest: object = { userId: 0, tagIds: 0 };

export const SetInterestedTagsRequest = {
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
};

const baseSetInterestedEventsRequest: object = { userId: 0, eventIds: 0 };

export const SetInterestedEventsRequest = {
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
};

const baseGetUserOrganizationsByUserIdResponse: object = {};

export const GetUserOrganizationsByUserIdResponse = {
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
};

const baseGetUserOrganizationsByOrganizationIdResponse: object = {};

export const GetUserOrganizationsByOrganizationIdResponse = {
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
};

const baseSearchUserRequest: object = { keyword: "" };

export const SearchUserRequest = {
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
};

const baseSearchUserResponse: object = {};

export const SearchUserResponse = {
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
};

export interface AccountServiceClient {
  createUser(request: CreateUserRequest): Observable<User>;

  searchUser(request: SearchUserRequest): Observable<SearchUserResponse>;

  getUserByChulaId(request: GetUserByChulaIdRequest): Observable<User>;

  getUserByEmail(request: GetUserByEmailRequest): Observable<User>;

  isAuthenticated(request: IsAuthenticatedRequest): Observable<BoolValue>;

  updateAccountInfo(request: User): Observable<User>;

  setInterestedTags(request: SetInterestedTagsRequest): Observable<User>;

  setInterestedEvents(request: SetInterestedEventsRequest): Observable<User>;

  getUserById(request: GetObjectByIdRequest): Observable<User>;

  generateAccessToken(
    request: GenerateAccessTokenRequest
  ): Observable<GenerateAccessTokenResponse>;

  hasPermission(request: HasPermissionRequest): Observable<BoolValue>;

  assignRole(request: AssignRoleRequest): Observable<BoolValue>;

  removeRole(request: RemoveRoleRequest): Observable<BoolValue>;

  getUserOrganizationsByUserId(
    request: GetObjectByIdRequest
  ): Observable<GetUserOrganizationsByUserIdResponse>;

  getUserOrganizationsByOrganizationId(
    request: GetObjectByIdRequest
  ): Observable<GetUserOrganizationsByOrganizationIdResponse>;

  ping(request: Empty): Observable<BoolValue>;
}

export interface AccountServiceController {
  createUser(
    request: CreateUserRequest
  ): Promise<User> | Observable<User> | User;

  searchUser(
    request: SearchUserRequest
  ):
    | Promise<SearchUserResponse>
    | Observable<SearchUserResponse>
    | SearchUserResponse;

  getUserByChulaId(
    request: GetUserByChulaIdRequest
  ): Promise<User> | Observable<User> | User;

  getUserByEmail(
    request: GetUserByEmailRequest
  ): Promise<User> | Observable<User> | User;

  isAuthenticated(
    request: IsAuthenticatedRequest
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  updateAccountInfo(request: User): Promise<User> | Observable<User> | User;

  setInterestedTags(
    request: SetInterestedTagsRequest
  ): Promise<User> | Observable<User> | User;

  setInterestedEvents(
    request: SetInterestedEventsRequest
  ): Promise<User> | Observable<User> | User;

  getUserById(
    request: GetObjectByIdRequest
  ): Promise<User> | Observable<User> | User;

  generateAccessToken(
    request: GenerateAccessTokenRequest
  ):
    | Promise<GenerateAccessTokenResponse>
    | Observable<GenerateAccessTokenResponse>
    | GenerateAccessTokenResponse;

  hasPermission(
    request: HasPermissionRequest
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  assignRole(
    request: AssignRoleRequest
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  removeRole(
    request: RemoveRoleRequest
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  getUserOrganizationsByUserId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetUserOrganizationsByUserIdResponse>
    | Observable<GetUserOrganizationsByUserIdResponse>
    | GetUserOrganizationsByUserIdResponse;

  getUserOrganizationsByOrganizationId(
    request: GetObjectByIdRequest
  ):
    | Promise<GetUserOrganizationsByOrganizationIdResponse>
    | Observable<GetUserOrganizationsByOrganizationIdResponse>
    | GetUserOrganizationsByOrganizationIdResponse;

  ping(request: Empty): Promise<BoolValue> | Observable<BoolValue> | BoolValue;
}

export function AccountServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "createUser",
      "searchUser",
      "getUserByChulaId",
      "getUserByEmail",
      "isAuthenticated",
      "updateAccountInfo",
      "setInterestedTags",
      "setInterestedEvents",
      "getUserById",
      "generateAccessToken",
      "hasPermission",
      "assignRole",
      "removeRole",
      "getUserOrganizationsByUserId",
      "getUserOrganizationsByOrganizationId",
      "ping",
    ];
    for (const method of grpcMethods) {
      const descriptor: any = Reflect.getOwnPropertyDescriptor(
        constructor.prototype,
        method
      );
      GrpcMethod("AccountService", method)(
        constructor.prototype[method],
        method,
        descriptor
      );
    }
    const grpcStreamMethods: string[] = [];
    for (const method of grpcStreamMethods) {
      const descriptor: any = Reflect.getOwnPropertyDescriptor(
        constructor.prototype,
        method
      );
      GrpcStreamMethod("AccountService", method)(
        constructor.prototype[method],
        method,
        descriptor
      );
    }
  };
}

export const ACCOUNT_SERVICE_NAME = "AccountService";

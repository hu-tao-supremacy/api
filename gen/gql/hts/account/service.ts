/* eslint-disable */
import {
  Permission,
  User,
  GetObjectByIdRequest,
} from "../../hts/common/common";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.account";

export enum Role {
  ROLE_UNSPECIFIED = 0,
  ORGANIZATION_OWNER = 1,
  ORGANIZATION_EDITOR = 2,
  ORGANIZATION_MEMBER = 3,
  UNRECOGNIZED = -1,
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

export interface UpdateUserInterestsRequest {
  userId: number;
  tagIds: number[];
}

export interface AccountService {
  CreateUser(request: CreateUserRequest): Promise<User>;
  GetUserByChulaId(request: GetUserByChulaIdRequest): Promise<User>;
  GetUserByEmail(request: GetUserByEmailRequest): Promise<User>;
  IsAuthenticated(
    request: IsAuthenticatedRequest
  ): Promise<boolean | undefined>;
  UpdateAccountInfo(request: User): Promise<User>;
  UpdateUserInterests(request: UpdateUserInterestsRequest): Promise<User>;
  GetUserById(request: GetObjectByIdRequest): Promise<User>;
  GenerateAccessToken(
    request: GenerateAccessTokenRequest
  ): Promise<GenerateAccessTokenResponse>;
  HasPermission(request: HasPermissionRequest): Promise<boolean | undefined>;
  AssignRole(request: AssignRoleRequest): Promise<boolean | undefined>;
  RemoveRole(request: RemoveRoleRequest): Promise<boolean | undefined>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

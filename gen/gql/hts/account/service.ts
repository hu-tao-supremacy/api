/* eslint-disable */
import {
  Permission,
  User,
  GetObjectByIdRequest,
} from "../../hts/common/common";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.account";

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

export interface AccountService {
  CreateUser(request: CreateUserRequest): Promise<User>;
  GetUserByChulaId(request: GetUserByChulaIdRequest): Promise<User>;
  IsAuthenticated(
    request: IsAuthenticatedRequest
  ): Promise<boolean | undefined>;
  UpdateAccountInfo(request: User): Promise<User>;
  GetUserById(request: GetObjectByIdRequest): Promise<User>;
  GenerateAccessToken(
    request: GenerateAccessTokenRequest
  ): Promise<GenerateAccessTokenResponse>;
  HasPermission(request: HasPermissionRequest): Promise<boolean | undefined>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

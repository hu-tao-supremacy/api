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
  email: string;
}

export interface IsAuthenticatedRequest {
  accessToken: string;
}

export interface GenerateAccessTokenResponse {
  accessToken: string;
}

export interface HasPermissionRequest {
  userId: number;
  organizationId: number;
  permissionName: Permission;
}

export interface AccountService {
  GetUserByChulaId(request: GetObjectByIdRequest): Promise<User>;
  IsAuthenticated(
    request: IsAuthenticatedRequest
  ): Promise<boolean | undefined>;
  UpdateAccountInfo(request: User): Promise<User>;
  GenerateAccessToken(request: User): Promise<GenerateAccessTokenResponse>;
  HasPermission(request: HasPermissionRequest): Promise<boolean | undefined>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

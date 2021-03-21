/* eslint-disable */
import { Permission, User } from "../../hts/common/common";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.account";

export interface IsAuthenticatedRequest {
  accessToken: string;
}

export interface GenerateJWTResponse {
  accessToken: string;
}

export interface HasPermissionRequest {
  userId: number;
  organizationId: number;
  permissionName: Permission;
}

export interface AccountService {
  IsAuthenticated(
    request: IsAuthenticatedRequest
  ): Promise<boolean | undefined>;
  UpdateAccountInfo(request: User): Promise<User>;
  GenerateJWT(request: User): Promise<GenerateJWTResponse>;
  HasPermission(request: HasPermissionRequest): Promise<boolean | undefined>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

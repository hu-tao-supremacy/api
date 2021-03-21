/* eslint-disable */
import { Permission, User } from "../../hts/common/common";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.account";

export interface IsAuthenticatedRequest {
  accessToken: string;
}

export interface GenerateAuthTokenResponse {
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
  GenerateAuthToken(request: User): Promise<GenerateAuthTokenResponse>;
  HasPermission(request: HasPermissionRequest): Promise<boolean | undefined>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

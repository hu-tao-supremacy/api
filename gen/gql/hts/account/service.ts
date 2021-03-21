/* eslint-disable */
import { Permission, User } from "../../hts/common/common";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.account";

export interface IsAuthenticatedInput {
  accessToken: string;
}

export interface GenerateJWTOutput {
  accessToken: string;
}

export interface HasPermissionInput {
  userId: number;
  organizationId: number;
  permissionName: Permission;
}

export interface AccountService {
  IsAuthenticated(request: IsAuthenticatedInput): Promise<Empty>;
  UpdateAccountInfo(request: User): Promise<User>;
  GenerateJWT(request: User): Promise<GenerateJWTOutput>;
  HasPermission(request: HasPermissionInput): Promise<Empty>;
  Ping(request: Empty): Promise<boolean | undefined>;
}

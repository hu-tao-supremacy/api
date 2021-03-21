/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import { Permission, User } from "../../hts/common/common";
import { Observable } from "rxjs";
import { BoolValue } from "../../google/protobuf/wrappers";
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

export const HTS_ACCOUNT_PACKAGE_NAME = "hts.account";

export interface AccountServiceClient {
  isAuthenticated(request: IsAuthenticatedRequest): Observable<BoolValue>;

  updateAccountInfo(request: User): Observable<User>;

  generateAuthToken(request: User): Observable<GenerateAuthTokenResponse>;

  hasPermission(request: HasPermissionRequest): Observable<BoolValue>;

  ping(request: Empty): Observable<BoolValue>;
}

export interface AccountServiceController {
  isAuthenticated(
    request: IsAuthenticatedRequest
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  updateAccountInfo(request: User): Promise<User> | Observable<User> | User;

  generateAuthToken(
    request: User
  ):
    | Promise<GenerateAuthTokenResponse>
    | Observable<GenerateAuthTokenResponse>
    | GenerateAuthTokenResponse;

  hasPermission(
    request: HasPermissionRequest
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  ping(request: Empty): Promise<BoolValue> | Observable<BoolValue> | BoolValue;
}

export function AccountServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "isAuthenticated",
      "updateAccountInfo",
      "generateAuthToken",
      "hasPermission",
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

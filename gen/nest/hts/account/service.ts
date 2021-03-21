/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import { Permission, User } from "../../hts/common/common";
import { Observable } from "rxjs";
import { Empty } from "../../google/protobuf/empty";
import { BoolValue } from "../../google/protobuf/wrappers";

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

export const HTS_ACCOUNT_PACKAGE_NAME = "hts.account";

export interface AccountServiceClient {
  isAuthenticated(request: IsAuthenticatedRequest): Observable<Empty>;

  updateAccountInfo(request: User): Observable<User>;

  generateJWT(request: User): Observable<GenerateJWTResponse>;

  hasPermission(request: HasPermissionRequest): Observable<Empty>;

  ping(request: Empty): Observable<BoolValue>;
}

export interface AccountServiceController {
  isAuthenticated(request: IsAuthenticatedRequest): void;

  updateAccountInfo(request: User): Promise<User> | Observable<User> | User;

  generateJWT(
    request: User
  ):
    | Promise<GenerateJWTResponse>
    | Observable<GenerateJWTResponse>
    | GenerateJWTResponse;

  hasPermission(request: HasPermissionRequest): void;

  ping(request: Empty): Promise<BoolValue> | Observable<BoolValue> | BoolValue;
}

export function AccountServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "isAuthenticated",
      "updateAccountInfo",
      "generateJWT",
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

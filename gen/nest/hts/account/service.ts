/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import { Permission, Result, User } from "../../hts/common/common";
import { Observable } from "rxjs";
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

export const HTS_ACCOUNT_PACKAGE_NAME = "hts.account";

export interface AccountServiceClient {
  isAuthenticated(request: IsAuthenticatedInput): Observable<Result>;

  updateAccountInfo(request: User): Observable<User>;

  generateJWT(request: User): Observable<GenerateJWTOutput>;

  hasPermission(request: HasPermissionInput): Observable<Result>;

  validatePermission(request: HasPermissionInput): Observable<Empty>;

  ping(request: Empty): Observable<Result>;
}

export interface AccountServiceController {
  isAuthenticated(
    request: IsAuthenticatedInput
  ): Promise<Result> | Observable<Result> | Result;

  updateAccountInfo(request: User): Promise<User> | Observable<User> | User;

  generateJWT(
    request: User
  ):
    | Promise<GenerateJWTOutput>
    | Observable<GenerateJWTOutput>
    | GenerateJWTOutput;

  hasPermission(
    request: HasPermissionInput
  ): Promise<Result> | Observable<Result> | Result;

  validatePermission(request: HasPermissionInput): void;

  ping(request: Empty): Promise<Result> | Observable<Result> | Result;
}

export function AccountServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "isAuthenticated",
      "updateAccountInfo",
      "generateJWT",
      "hasPermission",
      "validatePermission",
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

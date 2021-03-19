/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import { Permission, User, Result } from "../../hts/common/common";
import { Observable } from "rxjs";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.account";

export interface IsAuthenticatedInput {
  accessToken: string;
}

export interface UpdateAccountInfoInput {
  user: User | undefined;
}

export interface UpdateAccountInfoOutput {
  user: User | undefined;
}

export interface GenerateJWTInput {
  user: User | undefined;
}

export interface InvalidateJWTInput {
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

  updateAccountInfo(
    request: UpdateAccountInfoInput
  ): Observable<UpdateAccountInfoOutput>;

  generateJWT(request: GenerateJWTInput): Observable<Result>;

  invalidateJWT(request: InvalidateJWTInput): Observable<Result>;

  hasPermission(request: HasPermissionInput): Observable<Result>;

  validatePermission(request: HasPermissionInput): Observable<Empty>;

  ping(request: Empty): Observable<Result>;
}

export interface AccountServiceController {
  isAuthenticated(
    request: IsAuthenticatedInput
  ): Promise<Result> | Observable<Result> | Result;

  updateAccountInfo(
    request: UpdateAccountInfoInput
  ):
    | Promise<UpdateAccountInfoOutput>
    | Observable<UpdateAccountInfoOutput>
    | UpdateAccountInfoOutput;

  generateJWT(
    request: GenerateJWTInput
  ): Promise<Result> | Observable<Result> | Result;

  invalidateJWT(
    request: InvalidateJWTInput
  ): Promise<Result> | Observable<Result> | Result;

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
      "invalidateJWT",
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

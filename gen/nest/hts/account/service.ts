/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import { Permission, User, Result } from "../../hts/common/common";
import { Observable } from "rxjs";
import { Empty } from "../../google/protobuf/empty";

export const protobufPackage = "hts.account";

export interface IsAuthenticatedRequest {
  accessToken: string;
}

export interface UpdateAccountInfoRequest {
  user: User | undefined;
}

export interface UpdateAccountInfoResponse {
  user: User | undefined;
}

export interface GenerateJWTRequest {
  user: User | undefined;
}

export interface InvalidateJWTRequest {
  accessToken: string;
}

export interface HasPermissionRequest {
  userId: number;
  organizationId: number;
  permissionName: Permission;
}

export const HTS_ACCOUNT_PACKAGE_NAME = "hts.account";

export interface AccountServiceClient {
  isAuthenticated(request: IsAuthenticatedRequest): Observable<Result>;

  updateAccountInfo(
    request: UpdateAccountInfoRequest
  ): Observable<UpdateAccountInfoResponse>;

  generateJWT(request: GenerateJWTRequest): Observable<Result>;

  invalidateJWT(request: InvalidateJWTRequest): Observable<Result>;

  hasPermission(request: HasPermissionRequest): Observable<Result>;

  ping(request: Empty): Observable<Result>;
}

export interface AccountServiceController {
  isAuthenticated(
    request: IsAuthenticatedRequest
  ): Promise<Result> | Observable<Result> | Result;

  updateAccountInfo(
    request: UpdateAccountInfoRequest
  ):
    | Promise<UpdateAccountInfoResponse>
    | Observable<UpdateAccountInfoResponse>
    | UpdateAccountInfoResponse;

  generateJWT(
    request: GenerateJWTRequest
  ): Promise<Result> | Observable<Result> | Result;

  invalidateJWT(
    request: InvalidateJWTRequest
  ): Promise<Result> | Observable<Result> | Result;

  hasPermission(
    request: HasPermissionRequest
  ): Promise<Result> | Observable<Result> | Result;

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

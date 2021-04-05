/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import {
  Permission,
  User,
  GetObjectByIdRequest,
} from "../../hts/common/common";
import { Observable } from "rxjs";
import { BoolValue } from "../../google/protobuf/wrappers";
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

export interface GetUserByEmailRequest {
  email: string;
}

export const HTS_ACCOUNT_PACKAGE_NAME = "hts.account";

export interface AccountServiceClient {
  createUser(request: CreateUserRequest): Observable<User>;

  getUserByChulaId(request: GetUserByChulaIdRequest): Observable<User>;

  getUserByEmail(request: GetUserByEmailRequest): Observable<User>;

  isAuthenticated(request: IsAuthenticatedRequest): Observable<BoolValue>;

  updateAccountInfo(request: User): Observable<User>;

  getUserById(request: GetObjectByIdRequest): Observable<User>;

  generateAccessToken(
    request: GenerateAccessTokenRequest
  ): Observable<GenerateAccessTokenResponse>;

  hasPermission(request: HasPermissionRequest): Observable<BoolValue>;

  ping(request: Empty): Observable<BoolValue>;
}

export interface AccountServiceController {
  createUser(
    request: CreateUserRequest
  ): Promise<User> | Observable<User> | User;

  getUserByChulaId(
    request: GetUserByChulaIdRequest
  ): Promise<User> | Observable<User> | User;

  getUserByEmail(
    request: GetUserByEmailRequest
  ): Promise<User> | Observable<User> | User;

  isAuthenticated(
    request: IsAuthenticatedRequest
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  updateAccountInfo(request: User): Promise<User> | Observable<User> | User;

  getUserById(
    request: GetObjectByIdRequest
  ): Promise<User> | Observable<User> | User;

  generateAccessToken(
    request: GenerateAccessTokenRequest
  ):
    | Promise<GenerateAccessTokenResponse>
    | Observable<GenerateAccessTokenResponse>
    | GenerateAccessTokenResponse;

  hasPermission(
    request: HasPermissionRequest
  ): Promise<BoolValue> | Observable<BoolValue> | BoolValue;

  ping(request: Empty): Promise<BoolValue> | Observable<BoolValue> | BoolValue;
}

export function AccountServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = [
      "createUser",
      "getUserByChulaId",
      "getUserByEmail",
      "isAuthenticated",
      "updateAccountInfo",
      "getUserById",
      "generateAccessToken",
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

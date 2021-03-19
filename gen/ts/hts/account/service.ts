/* eslint-disable */
import {
  Permission,
  User,
  Result,
  permissionFromJSON,
  permissionToJSON,
} from "../../hts/common/common";
import { Reader, util, configure, Writer } from "protobufjs/minimal";
import * as Long from "long";
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

const baseIsAuthenticatedInput: object = { accessToken: "" };

export const IsAuthenticatedInput = {
  encode(
    message: IsAuthenticatedInput,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.accessToken !== "") {
      writer.uint32(10).string(message.accessToken);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): IsAuthenticatedInput {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseIsAuthenticatedInput } as IsAuthenticatedInput;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.accessToken = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): IsAuthenticatedInput {
    const message = { ...baseIsAuthenticatedInput } as IsAuthenticatedInput;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = String(object.accessToken);
    } else {
      message.accessToken = "";
    }
    return message;
  },

  toJSON(message: IsAuthenticatedInput): unknown {
    const obj: any = {};
    message.accessToken !== undefined &&
      (obj.accessToken = message.accessToken);
    return obj;
  },

  fromPartial(object: DeepPartial<IsAuthenticatedInput>): IsAuthenticatedInput {
    const message = { ...baseIsAuthenticatedInput } as IsAuthenticatedInput;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = object.accessToken;
    } else {
      message.accessToken = "";
    }
    return message;
  },
};

const baseUpdateAccountInfoInput: object = {};

export const UpdateAccountInfoInput = {
  encode(
    message: UpdateAccountInfoInput,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.user !== undefined) {
      User.encode(message.user, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UpdateAccountInfoInput {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUpdateAccountInfoInput } as UpdateAccountInfoInput;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.user = User.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateAccountInfoInput {
    const message = { ...baseUpdateAccountInfoInput } as UpdateAccountInfoInput;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromJSON(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },

  toJSON(message: UpdateAccountInfoInput): unknown {
    const obj: any = {};
    message.user !== undefined &&
      (obj.user = message.user ? User.toJSON(message.user) : undefined);
    return obj;
  },

  fromPartial(
    object: DeepPartial<UpdateAccountInfoInput>
  ): UpdateAccountInfoInput {
    const message = { ...baseUpdateAccountInfoInput } as UpdateAccountInfoInput;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromPartial(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },
};

const baseUpdateAccountInfoOutput: object = {};

export const UpdateAccountInfoOutput = {
  encode(
    message: UpdateAccountInfoOutput,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.user !== undefined) {
      User.encode(message.user, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UpdateAccountInfoOutput {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseUpdateAccountInfoOutput,
    } as UpdateAccountInfoOutput;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.user = User.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateAccountInfoOutput {
    const message = {
      ...baseUpdateAccountInfoOutput,
    } as UpdateAccountInfoOutput;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromJSON(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },

  toJSON(message: UpdateAccountInfoOutput): unknown {
    const obj: any = {};
    message.user !== undefined &&
      (obj.user = message.user ? User.toJSON(message.user) : undefined);
    return obj;
  },

  fromPartial(
    object: DeepPartial<UpdateAccountInfoOutput>
  ): UpdateAccountInfoOutput {
    const message = {
      ...baseUpdateAccountInfoOutput,
    } as UpdateAccountInfoOutput;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromPartial(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },
};

const baseGenerateJWTInput: object = {};

export const GenerateJWTInput = {
  encode(message: GenerateJWTInput, writer: Writer = Writer.create()): Writer {
    if (message.user !== undefined) {
      User.encode(message.user, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GenerateJWTInput {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGenerateJWTInput } as GenerateJWTInput;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.user = User.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GenerateJWTInput {
    const message = { ...baseGenerateJWTInput } as GenerateJWTInput;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromJSON(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },

  toJSON(message: GenerateJWTInput): unknown {
    const obj: any = {};
    message.user !== undefined &&
      (obj.user = message.user ? User.toJSON(message.user) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<GenerateJWTInput>): GenerateJWTInput {
    const message = { ...baseGenerateJWTInput } as GenerateJWTInput;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromPartial(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },
};

const baseInvalidateJWTInput: object = { accessToken: "" };

export const InvalidateJWTInput = {
  encode(
    message: InvalidateJWTInput,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.accessToken !== "") {
      writer.uint32(10).string(message.accessToken);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): InvalidateJWTInput {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseInvalidateJWTInput } as InvalidateJWTInput;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.accessToken = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): InvalidateJWTInput {
    const message = { ...baseInvalidateJWTInput } as InvalidateJWTInput;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = String(object.accessToken);
    } else {
      message.accessToken = "";
    }
    return message;
  },

  toJSON(message: InvalidateJWTInput): unknown {
    const obj: any = {};
    message.accessToken !== undefined &&
      (obj.accessToken = message.accessToken);
    return obj;
  },

  fromPartial(object: DeepPartial<InvalidateJWTInput>): InvalidateJWTInput {
    const message = { ...baseInvalidateJWTInput } as InvalidateJWTInput;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = object.accessToken;
    } else {
      message.accessToken = "";
    }
    return message;
  },
};

const baseHasPermissionInput: object = {
  userId: 0,
  organizationId: 0,
  permissionName: 0,
};

export const HasPermissionInput = {
  encode(
    message: HasPermissionInput,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int64(message.userId);
    }
    if (message.organizationId !== 0) {
      writer.uint32(16).int64(message.organizationId);
    }
    if (message.permissionName !== 0) {
      writer.uint32(24).int32(message.permissionName);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): HasPermissionInput {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseHasPermissionInput } as HasPermissionInput;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.organizationId = longToNumber(reader.int64() as Long);
          break;
        case 3:
          message.permissionName = reader.int32() as any;
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): HasPermissionInput {
    const message = { ...baseHasPermissionInput } as HasPermissionInput;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = Number(object.organizationId);
    } else {
      message.organizationId = 0;
    }
    if (object.permissionName !== undefined && object.permissionName !== null) {
      message.permissionName = permissionFromJSON(object.permissionName);
    } else {
      message.permissionName = 0;
    }
    return message;
  },

  toJSON(message: HasPermissionInput): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.organizationId !== undefined &&
      (obj.organizationId = message.organizationId);
    message.permissionName !== undefined &&
      (obj.permissionName = permissionToJSON(message.permissionName));
    return obj;
  },

  fromPartial(object: DeepPartial<HasPermissionInput>): HasPermissionInput {
    const message = { ...baseHasPermissionInput } as HasPermissionInput;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    if (object.organizationId !== undefined && object.organizationId !== null) {
      message.organizationId = object.organizationId;
    } else {
      message.organizationId = 0;
    }
    if (object.permissionName !== undefined && object.permissionName !== null) {
      message.permissionName = object.permissionName;
    } else {
      message.permissionName = 0;
    }
    return message;
  },
};

export interface AccountService {
  IsAuthenticated(request: IsAuthenticatedInput): Promise<Result>;
  UpdateAccountInfo(
    request: UpdateAccountInfoInput
  ): Promise<UpdateAccountInfoOutput>;
  GenerateJWT(request: GenerateJWTInput): Promise<Result>;
  InvalidateJWT(request: InvalidateJWTInput): Promise<Result>;
  HasPermission(request: HasPermissionInput): Promise<Result>;
  ValidatePermission(request: HasPermissionInput): Promise<Empty>;
  Ping(request: Empty): Promise<Result>;
}

export class AccountServiceClientImpl implements AccountService {
  private readonly rpc: Rpc;
  constructor(rpc: Rpc) {
    this.rpc = rpc;
  }
  IsAuthenticated(request: IsAuthenticatedInput): Promise<Result> {
    const data = IsAuthenticatedInput.encode(request).finish();
    const promise = this.rpc.request(
      "hts.account.AccountService",
      "IsAuthenticated",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  UpdateAccountInfo(
    request: UpdateAccountInfoInput
  ): Promise<UpdateAccountInfoOutput> {
    const data = UpdateAccountInfoInput.encode(request).finish();
    const promise = this.rpc.request(
      "hts.account.AccountService",
      "UpdateAccountInfo",
      data
    );
    return promise.then((data) =>
      UpdateAccountInfoOutput.decode(new Reader(data))
    );
  }

  GenerateJWT(request: GenerateJWTInput): Promise<Result> {
    const data = GenerateJWTInput.encode(request).finish();
    const promise = this.rpc.request(
      "hts.account.AccountService",
      "GenerateJWT",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  InvalidateJWT(request: InvalidateJWTInput): Promise<Result> {
    const data = InvalidateJWTInput.encode(request).finish();
    const promise = this.rpc.request(
      "hts.account.AccountService",
      "InvalidateJWT",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  HasPermission(request: HasPermissionInput): Promise<Result> {
    const data = HasPermissionInput.encode(request).finish();
    const promise = this.rpc.request(
      "hts.account.AccountService",
      "HasPermission",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }

  ValidatePermission(request: HasPermissionInput): Promise<Empty> {
    const data = HasPermissionInput.encode(request).finish();
    const promise = this.rpc.request(
      "hts.account.AccountService",
      "ValidatePermission",
      data
    );
    return promise.then((data) => Empty.decode(new Reader(data)));
  }

  Ping(request: Empty): Promise<Result> {
    const data = Empty.encode(request).finish();
    const promise = this.rpc.request(
      "hts.account.AccountService",
      "Ping",
      data
    );
    return promise.then((data) => Result.decode(new Reader(data)));
  }
}

interface Rpc {
  request(
    service: string,
    method: string,
    data: Uint8Array
  ): Promise<Uint8Array>;
}

declare var self: any | undefined;
declare var window: any | undefined;
var globalThis: any = (() => {
  if (typeof globalThis !== "undefined") return globalThis;
  if (typeof self !== "undefined") return self;
  if (typeof window !== "undefined") return window;
  if (typeof global !== "undefined") return global;
  throw "Unable to locate global object";
})();

type Builtin = Date | Function | Uint8Array | string | number | undefined;
export type DeepPartial<T> = T extends Builtin
  ? T
  : T extends Array<infer U>
  ? Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U>
  ? ReadonlyArray<DeepPartial<U>>
  : T extends {}
  ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

function longToNumber(long: Long): number {
  if (long.gt(Number.MAX_SAFE_INTEGER)) {
    throw new globalThis.Error("Value is larger than Number.MAX_SAFE_INTEGER");
  }
  return long.toNumber();
}

if (util.Long !== Long) {
  util.Long = Long as any;
  configure();
}

/* eslint-disable */
import * as Long from "long";
import { util, configure, Writer, Reader } from "protobufjs/minimal";

export const protobufPackage = "google.protobuf";

export interface Timestamp {
  seconds: number;
  nanos: number;
}

const baseTimestamp: object = { seconds: 0, nanos: 0 };

export const Timestamp = {
  encode(message: Timestamp, writer: Writer = Writer.create()): Writer {
    if (message.seconds !== 0) {
      writer.uint32(8).int64(message.seconds);
    }
    if (message.nanos !== 0) {
      writer.uint32(16).int32(message.nanos);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): Timestamp {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseTimestamp } as Timestamp;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.seconds = longToNumber(reader.int64() as Long);
          break;
        case 2:
          message.nanos = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Timestamp {
    const message = { ...baseTimestamp } as Timestamp;
    if (object.seconds !== undefined && object.seconds !== null) {
      message.seconds = Number(object.seconds);
    } else {
      message.seconds = 0;
    }
    if (object.nanos !== undefined && object.nanos !== null) {
      message.nanos = Number(object.nanos);
    } else {
      message.nanos = 0;
    }
    return message;
  },

  toJSON(message: Timestamp): unknown {
    const obj: any = {};
    message.seconds !== undefined && (obj.seconds = message.seconds);
    message.nanos !== undefined && (obj.nanos = message.nanos);
    return obj;
  },

  fromPartial(object: DeepPartial<Timestamp>): Timestamp {
    const message = { ...baseTimestamp } as Timestamp;
    if (object.seconds !== undefined && object.seconds !== null) {
      message.seconds = object.seconds;
    } else {
      message.seconds = 0;
    }
    if (object.nanos !== undefined && object.nanos !== null) {
      message.nanos = object.nanos;
    } else {
      message.nanos = 0;
    }
    return message;
  },
};

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

// If you get a compile-error about 'Constructor<Long> and ... have no overlap',
// add '--ts_proto_opt=esModuleInterop=true' as a flag when calling 'protoc'.
if (util.Long !== Long) {
  util.Long = Long as any;
  configure();
}

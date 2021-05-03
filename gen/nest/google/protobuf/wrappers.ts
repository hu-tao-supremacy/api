/* eslint-disable */
export const protobufPackage = "google.protobuf";

export interface DoubleValue {
  value: number;
}

export interface FloatValue {
  value: number;
}

export interface Int64Value {
  value: number;
}

export interface UInt64Value {
  value: number;
}

export interface Int32Value {
  value: number;
}

export interface UInt32Value {
  value: number;
}

export interface BoolValue {
  value: boolean;
}

export interface StringValue {
  value: string;
}

export interface BytesValue {
  value: Uint8Array;
}

export const GOOGLE_PROTOBUF_PACKAGE_NAME = "google.protobuf";

const baseDoubleValue: object = { value: 0 };

export const DoubleValue = {
  fromJSON(object: any): DoubleValue {
    const message = { ...baseDoubleValue } as DoubleValue;
    if (object.value !== undefined && object.value !== null) {
      message.value = Number(object.value);
    } else {
      message.value = 0;
    }
    return message;
  },

  toJSON(message: DoubleValue): unknown {
    const obj: any = {};
    message.value !== undefined && (obj.value = message.value);
    return obj;
  },
};

const baseFloatValue: object = { value: 0 };

export const FloatValue = {
  fromJSON(object: any): FloatValue {
    const message = { ...baseFloatValue } as FloatValue;
    if (object.value !== undefined && object.value !== null) {
      message.value = Number(object.value);
    } else {
      message.value = 0;
    }
    return message;
  },

  toJSON(message: FloatValue): unknown {
    const obj: any = {};
    message.value !== undefined && (obj.value = message.value);
    return obj;
  },
};

const baseInt64Value: object = { value: 0 };

export const Int64Value = {
  fromJSON(object: any): Int64Value {
    const message = { ...baseInt64Value } as Int64Value;
    if (object.value !== undefined && object.value !== null) {
      message.value = Number(object.value);
    } else {
      message.value = 0;
    }
    return message;
  },

  toJSON(message: Int64Value): unknown {
    const obj: any = {};
    message.value !== undefined && (obj.value = message.value);
    return obj;
  },
};

const baseUInt64Value: object = { value: 0 };

export const UInt64Value = {
  fromJSON(object: any): UInt64Value {
    const message = { ...baseUInt64Value } as UInt64Value;
    if (object.value !== undefined && object.value !== null) {
      message.value = Number(object.value);
    } else {
      message.value = 0;
    }
    return message;
  },

  toJSON(message: UInt64Value): unknown {
    const obj: any = {};
    message.value !== undefined && (obj.value = message.value);
    return obj;
  },
};

const baseInt32Value: object = { value: 0 };

export const Int32Value = {
  fromJSON(object: any): Int32Value {
    const message = { ...baseInt32Value } as Int32Value;
    if (object.value !== undefined && object.value !== null) {
      message.value = Number(object.value);
    } else {
      message.value = 0;
    }
    return message;
  },

  toJSON(message: Int32Value): unknown {
    const obj: any = {};
    message.value !== undefined && (obj.value = message.value);
    return obj;
  },
};

const baseUInt32Value: object = { value: 0 };

export const UInt32Value = {
  fromJSON(object: any): UInt32Value {
    const message = { ...baseUInt32Value } as UInt32Value;
    if (object.value !== undefined && object.value !== null) {
      message.value = Number(object.value);
    } else {
      message.value = 0;
    }
    return message;
  },

  toJSON(message: UInt32Value): unknown {
    const obj: any = {};
    message.value !== undefined && (obj.value = message.value);
    return obj;
  },
};

const baseBoolValue: object = { value: false };

export const BoolValue = {
  fromJSON(object: any): BoolValue {
    const message = { ...baseBoolValue } as BoolValue;
    if (object.value !== undefined && object.value !== null) {
      message.value = Boolean(object.value);
    } else {
      message.value = false;
    }
    return message;
  },

  toJSON(message: BoolValue): unknown {
    const obj: any = {};
    message.value !== undefined && (obj.value = message.value);
    return obj;
  },
};

const baseStringValue: object = { value: "" };

export const StringValue = {
  fromJSON(object: any): StringValue {
    const message = { ...baseStringValue } as StringValue;
    if (object.value !== undefined && object.value !== null) {
      message.value = String(object.value);
    } else {
      message.value = "";
    }
    return message;
  },

  toJSON(message: StringValue): unknown {
    const obj: any = {};
    message.value !== undefined && (obj.value = message.value);
    return obj;
  },
};

const baseBytesValue: object = {};

export const BytesValue = {
  fromJSON(object: any): BytesValue {
    const message = { ...baseBytesValue } as BytesValue;
    if (object.value !== undefined && object.value !== null) {
      message.value = bytesFromBase64(object.value);
    }
    return message;
  },

  toJSON(message: BytesValue): unknown {
    const obj: any = {};
    message.value !== undefined &&
      (obj.value = base64FromBytes(
        message.value !== undefined ? message.value : new Uint8Array()
      ));
    return obj;
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

const atob: (b64: string) => string =
  globalThis.atob ||
  ((b64) => globalThis.Buffer.from(b64, "base64").toString("binary"));
function bytesFromBase64(b64: string): Uint8Array {
  const bin = atob(b64);
  const arr = new Uint8Array(bin.length);
  for (let i = 0; i < bin.length; ++i) {
    arr[i] = bin.charCodeAt(i);
  }
  return arr;
}

const btoa: (bin: string) => string =
  globalThis.btoa ||
  ((bin) => globalThis.Buffer.from(bin, "binary").toString("base64"));
function base64FromBytes(arr: Uint8Array): string {
  const bin: string[] = [];
  for (let i = 0; i < arr.byteLength; ++i) {
    bin.push(String.fromCharCode(arr[i]));
  }
  return btoa(bin.join(""));
}

/* eslint-disable */
export const protobufPackage = "google.protobuf";

export interface Empty {}

export const GOOGLE_PROTOBUF_PACKAGE_NAME = "google.protobuf";

const baseEmpty: object = {};

export const Empty = {
  fromJSON(_: any): Empty {
    const message = { ...baseEmpty } as Empty;
    return message;
  },

  toJSON(_: Empty): unknown {
    const obj: any = {};
    return obj;
  },
};

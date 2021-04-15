/* eslint-disable */
export const protobufPackage = "google.protobuf";

export interface Timestamp {
  seconds: number;
  nanos: number;
}

export const GOOGLE_PROTOBUF_PACKAGE_NAME = "google.protobuf";

const baseTimestamp: object = { seconds: 0, nanos: 0 };

export const Timestamp = {
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
};

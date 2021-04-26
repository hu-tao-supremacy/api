/* eslint-disable */
import { Event } from "../../hts/common/common";
import { Writer, Reader } from "protobufjs/minimal";

export const protobufPackage = "hts.personalization";

export interface GetRecommendedEventsRequest {
  userId: number;
}

export interface GetRecommendedEventsResponse {
  eventCollection: Event[];
}

const baseGetRecommendedEventsRequest: object = { userId: 0 };

export const GetRecommendedEventsRequest = {
  encode(
    message: GetRecommendedEventsRequest,
    writer: Writer = Writer.create()
  ): Writer {
    if (message.userId !== 0) {
      writer.uint32(8).int32(message.userId);
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetRecommendedEventsRequest {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetRecommendedEventsRequest,
    } as GetRecommendedEventsRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetRecommendedEventsRequest {
    const message = {
      ...baseGetRecommendedEventsRequest,
    } as GetRecommendedEventsRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = Number(object.userId);
    } else {
      message.userId = 0;
    }
    return message;
  },

  toJSON(message: GetRecommendedEventsRequest): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetRecommendedEventsRequest>
  ): GetRecommendedEventsRequest {
    const message = {
      ...baseGetRecommendedEventsRequest,
    } as GetRecommendedEventsRequest;
    if (object.userId !== undefined && object.userId !== null) {
      message.userId = object.userId;
    } else {
      message.userId = 0;
    }
    return message;
  },
};

const baseGetRecommendedEventsResponse: object = {};

export const GetRecommendedEventsResponse = {
  encode(
    message: GetRecommendedEventsResponse,
    writer: Writer = Writer.create()
  ): Writer {
    for (const v of message.eventCollection) {
      Event.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(
    input: Reader | Uint8Array,
    length?: number
  ): GetRecommendedEventsResponse {
    const reader = input instanceof Uint8Array ? new Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseGetRecommendedEventsResponse,
    } as GetRecommendedEventsResponse;
    message.eventCollection = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.eventCollection.push(Event.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetRecommendedEventsResponse {
    const message = {
      ...baseGetRecommendedEventsResponse,
    } as GetRecommendedEventsResponse;
    message.eventCollection = [];
    if (
      object.eventCollection !== undefined &&
      object.eventCollection !== null
    ) {
      for (const e of object.eventCollection) {
        message.eventCollection.push(Event.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: GetRecommendedEventsResponse): unknown {
    const obj: any = {};
    if (message.eventCollection) {
      obj.eventCollection = message.eventCollection.map((e) =>
        e ? Event.toJSON(e) : undefined
      );
    } else {
      obj.eventCollection = [];
    }
    return obj;
  },

  fromPartial(
    object: DeepPartial<GetRecommendedEventsResponse>
  ): GetRecommendedEventsResponse {
    const message = {
      ...baseGetRecommendedEventsResponse,
    } as GetRecommendedEventsResponse;
    message.eventCollection = [];
    if (
      object.eventCollection !== undefined &&
      object.eventCollection !== null
    ) {
      for (const e of object.eventCollection) {
        message.eventCollection.push(Event.fromPartial(e));
      }
    }
    return message;
  },
};

export interface PersonalizationService {
  GetRecommendedEvents(
    request: GetRecommendedEventsRequest
  ): Promise<GetRecommendedEventsResponse>;
}

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

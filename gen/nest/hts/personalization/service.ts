/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import { Observable } from "rxjs";
import { Event } from "../../hts/common/common";

export const protobufPackage = "hts.personalization";

export interface GetRecommendedEventsRequest {
  userId: number;
}

export interface GetRecommendedEventsResponse {
  eventCollection: Event[];
}

export const HTS_PERSONALIZATION_PACKAGE_NAME = "hts.personalization";

const baseGetRecommendedEventsRequest: object = { userId: 0 };

export const GetRecommendedEventsRequest = {
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
};

const baseGetRecommendedEventsResponse: object = {};

export const GetRecommendedEventsResponse = {
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
};

export interface PersonalizationServiceClient {
  getRecommendedEvents(
    request: GetRecommendedEventsRequest
  ): Observable<GetRecommendedEventsResponse>;
}

export interface PersonalizationServiceController {
  getRecommendedEvents(
    request: GetRecommendedEventsRequest
  ):
    | Promise<GetRecommendedEventsResponse>
    | Observable<GetRecommendedEventsResponse>
    | GetRecommendedEventsResponse;
}

export function PersonalizationServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = ["getRecommendedEvents"];
    for (const method of grpcMethods) {
      const descriptor: any = Reflect.getOwnPropertyDescriptor(
        constructor.prototype,
        method
      );
      GrpcMethod("PersonalizationService", method)(
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
      GrpcStreamMethod("PersonalizationService", method)(
        constructor.prototype[method],
        method,
        descriptor
      );
    }
  };
}

export const PERSONALIZATION_SERVICE_NAME = "PersonalizationService";

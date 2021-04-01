/* eslint-disable */
import { GrpcMethod, GrpcStreamMethod } from "@nestjs/microservices";
import { Observable } from "rxjs";

export const protobufPackage = "hts.personalization";

export interface FibonacciRequest {
  index: number;
}

export interface FibonacciResponse {
  result: number;
}

export const HTS_PERSONALIZATION_PACKAGE_NAME = "hts.personalization";

export interface PersonalizationServiceClient {
  fibonacci(request: FibonacciRequest): Observable<FibonacciResponse>;
}

export interface PersonalizationServiceController {
  fibonacci(
    request: FibonacciRequest
  ):
    | Promise<FibonacciResponse>
    | Observable<FibonacciResponse>
    | FibonacciResponse;
}

export function PersonalizationServiceControllerMethods() {
  return function (constructor: Function) {
    const grpcMethods: string[] = ["fibonacci"];
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

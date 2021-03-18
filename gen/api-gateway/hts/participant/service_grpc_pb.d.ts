// GENERATED CODE -- DO NOT EDIT!

// package: hts.participant
// file: hts/participant/service.proto

import * as hts_participant_service_pb from "../../hts/participant/service_pb";
import * as hts_common_common_pb from "../../hts/common/common_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";
import * as grpc from "grpc";

interface IParticipantServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  isEventAvailable: grpc.MethodDefinition<hts_participant_service_pb.IsEventAvailableRequest, hts_common_common_pb.Result>;
  joinEvent: grpc.MethodDefinition<hts_participant_service_pb.UserWithEventRequest, hts_common_common_pb.Event>;
  cancelEvent: grpc.MethodDefinition<hts_participant_service_pb.UserWithEventRequest, hts_common_common_pb.Event>;
  createFeedback: grpc.MethodDefinition<hts_participant_service_pb.CreateFeedbackRequest, hts_common_common_pb.EventFeedback>;
  hasSubmitFeedback: grpc.MethodDefinition<hts_participant_service_pb.UserWithEventRequest, hts_common_common_pb.EventFeedback>;
  removeFeedback: grpc.MethodDefinition<hts_common_common_pb.EventFeedback, hts_common_common_pb.EventFeedback>;
  getFeedbacksFromEvent: grpc.MethodDefinition<hts_common_common_pb.Event, hts_participant_service_pb.GetFeedbacksFromEventResponse>;
  getUserFeedbackFromEvent: grpc.MethodDefinition<hts_participant_service_pb.UserWithEventRequest, hts_common_common_pb.EventFeedback>;
  getEvent: grpc.MethodDefinition<hts_participant_service_pb.GetEventRequest, hts_common_common_pb.Event>;
  getAllEvents: grpc.MethodDefinition<google_protobuf_empty_pb.Empty, hts_participant_service_pb.EventsResponse>;
  getSuggestedEvents: grpc.MethodDefinition<google_protobuf_empty_pb.Empty, hts_participant_service_pb.EventsResponse>;
  getEventsByStringOfName: grpc.MethodDefinition<hts_participant_service_pb.StringInputRequest, hts_participant_service_pb.EventsResponse>;
  getEventsByTag: grpc.MethodDefinition<hts_common_common_pb.Tag, hts_participant_service_pb.EventsResponse>;
  getEventsByOrganization: grpc.MethodDefinition<hts_common_common_pb.Organization, hts_participant_service_pb.EventsResponse>;
  getEventsByFacility: grpc.MethodDefinition<hts_common_common_pb.Facility, hts_participant_service_pb.EventsResponse>;
  getEventsByDate: grpc.MethodDefinition<hts_participant_service_pb.StringInputRequest, hts_participant_service_pb.EventsResponse>;
  generateQR: grpc.MethodDefinition<hts_common_common_pb.UserEvent, hts_participant_service_pb.GenerateQRResponse>;
  ping: grpc.MethodDefinition<google_protobuf_empty_pb.Empty, hts_common_common_pb.Result>;
}

export const ParticipantServiceService: IParticipantServiceService;

export interface IParticipantServiceServer extends grpc.UntypedServiceImplementation {
  isEventAvailable: grpc.handleUnaryCall<hts_participant_service_pb.IsEventAvailableRequest, hts_common_common_pb.Result>;
  joinEvent: grpc.handleUnaryCall<hts_participant_service_pb.UserWithEventRequest, hts_common_common_pb.Event>;
  cancelEvent: grpc.handleUnaryCall<hts_participant_service_pb.UserWithEventRequest, hts_common_common_pb.Event>;
  createFeedback: grpc.handleUnaryCall<hts_participant_service_pb.CreateFeedbackRequest, hts_common_common_pb.EventFeedback>;
  hasSubmitFeedback: grpc.handleUnaryCall<hts_participant_service_pb.UserWithEventRequest, hts_common_common_pb.EventFeedback>;
  removeFeedback: grpc.handleUnaryCall<hts_common_common_pb.EventFeedback, hts_common_common_pb.EventFeedback>;
  getFeedbacksFromEvent: grpc.handleUnaryCall<hts_common_common_pb.Event, hts_participant_service_pb.GetFeedbacksFromEventResponse>;
  getUserFeedbackFromEvent: grpc.handleUnaryCall<hts_participant_service_pb.UserWithEventRequest, hts_common_common_pb.EventFeedback>;
  getEvent: grpc.handleUnaryCall<hts_participant_service_pb.GetEventRequest, hts_common_common_pb.Event>;
  getAllEvents: grpc.handleUnaryCall<google_protobuf_empty_pb.Empty, hts_participant_service_pb.EventsResponse>;
  getSuggestedEvents: grpc.handleUnaryCall<google_protobuf_empty_pb.Empty, hts_participant_service_pb.EventsResponse>;
  getEventsByStringOfName: grpc.handleUnaryCall<hts_participant_service_pb.StringInputRequest, hts_participant_service_pb.EventsResponse>;
  getEventsByTag: grpc.handleUnaryCall<hts_common_common_pb.Tag, hts_participant_service_pb.EventsResponse>;
  getEventsByOrganization: grpc.handleUnaryCall<hts_common_common_pb.Organization, hts_participant_service_pb.EventsResponse>;
  getEventsByFacility: grpc.handleUnaryCall<hts_common_common_pb.Facility, hts_participant_service_pb.EventsResponse>;
  getEventsByDate: grpc.handleUnaryCall<hts_participant_service_pb.StringInputRequest, hts_participant_service_pb.EventsResponse>;
  generateQR: grpc.handleUnaryCall<hts_common_common_pb.UserEvent, hts_participant_service_pb.GenerateQRResponse>;
  ping: grpc.handleUnaryCall<google_protobuf_empty_pb.Empty, hts_common_common_pb.Result>;
}

export class ParticipantServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  isEventAvailable(argument: hts_participant_service_pb.IsEventAvailableRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  isEventAvailable(argument: hts_participant_service_pb.IsEventAvailableRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  isEventAvailable(argument: hts_participant_service_pb.IsEventAvailableRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  joinEvent(argument: hts_participant_service_pb.UserWithEventRequest, callback: grpc.requestCallback<hts_common_common_pb.Event>): grpc.ClientUnaryCall;
  joinEvent(argument: hts_participant_service_pb.UserWithEventRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Event>): grpc.ClientUnaryCall;
  joinEvent(argument: hts_participant_service_pb.UserWithEventRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Event>): grpc.ClientUnaryCall;
  cancelEvent(argument: hts_participant_service_pb.UserWithEventRequest, callback: grpc.requestCallback<hts_common_common_pb.Event>): grpc.ClientUnaryCall;
  cancelEvent(argument: hts_participant_service_pb.UserWithEventRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Event>): grpc.ClientUnaryCall;
  cancelEvent(argument: hts_participant_service_pb.UserWithEventRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Event>): grpc.ClientUnaryCall;
  createFeedback(argument: hts_participant_service_pb.CreateFeedbackRequest, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  createFeedback(argument: hts_participant_service_pb.CreateFeedbackRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  createFeedback(argument: hts_participant_service_pb.CreateFeedbackRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  hasSubmitFeedback(argument: hts_participant_service_pb.UserWithEventRequest, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  hasSubmitFeedback(argument: hts_participant_service_pb.UserWithEventRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  hasSubmitFeedback(argument: hts_participant_service_pb.UserWithEventRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  removeFeedback(argument: hts_common_common_pb.EventFeedback, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  removeFeedback(argument: hts_common_common_pb.EventFeedback, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  removeFeedback(argument: hts_common_common_pb.EventFeedback, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  getFeedbacksFromEvent(argument: hts_common_common_pb.Event, callback: grpc.requestCallback<hts_participant_service_pb.GetFeedbacksFromEventResponse>): grpc.ClientUnaryCall;
  getFeedbacksFromEvent(argument: hts_common_common_pb.Event, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.GetFeedbacksFromEventResponse>): grpc.ClientUnaryCall;
  getFeedbacksFromEvent(argument: hts_common_common_pb.Event, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.GetFeedbacksFromEventResponse>): grpc.ClientUnaryCall;
  getUserFeedbackFromEvent(argument: hts_participant_service_pb.UserWithEventRequest, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  getUserFeedbackFromEvent(argument: hts_participant_service_pb.UserWithEventRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  getUserFeedbackFromEvent(argument: hts_participant_service_pb.UserWithEventRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.EventFeedback>): grpc.ClientUnaryCall;
  getEvent(argument: hts_participant_service_pb.GetEventRequest, callback: grpc.requestCallback<hts_common_common_pb.Event>): grpc.ClientUnaryCall;
  getEvent(argument: hts_participant_service_pb.GetEventRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Event>): grpc.ClientUnaryCall;
  getEvent(argument: hts_participant_service_pb.GetEventRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Event>): grpc.ClientUnaryCall;
  getAllEvents(argument: google_protobuf_empty_pb.Empty, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getAllEvents(argument: google_protobuf_empty_pb.Empty, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getAllEvents(argument: google_protobuf_empty_pb.Empty, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getSuggestedEvents(argument: google_protobuf_empty_pb.Empty, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getSuggestedEvents(argument: google_protobuf_empty_pb.Empty, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getSuggestedEvents(argument: google_protobuf_empty_pb.Empty, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByStringOfName(argument: hts_participant_service_pb.StringInputRequest, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByStringOfName(argument: hts_participant_service_pb.StringInputRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByStringOfName(argument: hts_participant_service_pb.StringInputRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByTag(argument: hts_common_common_pb.Tag, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByTag(argument: hts_common_common_pb.Tag, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByTag(argument: hts_common_common_pb.Tag, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByOrganization(argument: hts_common_common_pb.Organization, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByOrganization(argument: hts_common_common_pb.Organization, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByOrganization(argument: hts_common_common_pb.Organization, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByFacility(argument: hts_common_common_pb.Facility, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByFacility(argument: hts_common_common_pb.Facility, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByFacility(argument: hts_common_common_pb.Facility, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByDate(argument: hts_participant_service_pb.StringInputRequest, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByDate(argument: hts_participant_service_pb.StringInputRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  getEventsByDate(argument: hts_participant_service_pb.StringInputRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.EventsResponse>): grpc.ClientUnaryCall;
  generateQR(argument: hts_common_common_pb.UserEvent, callback: grpc.requestCallback<hts_participant_service_pb.GenerateQRResponse>): grpc.ClientUnaryCall;
  generateQR(argument: hts_common_common_pb.UserEvent, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.GenerateQRResponse>): grpc.ClientUnaryCall;
  generateQR(argument: hts_common_common_pb.UserEvent, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_participant_service_pb.GenerateQRResponse>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
}

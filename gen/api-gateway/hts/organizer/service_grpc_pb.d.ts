// GENERATED CODE -- DO NOT EDIT!

// package: hts.organizer
// file: hts/organizer/service.proto

import * as hts_organizer_service_pb from "../../hts/organizer/service_pb";
import * as hts_common_common_pb from "../../hts/common/common_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";
import * as grpc from "grpc";

interface IOrganizerServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  createOrganization: grpc.MethodDefinition<hts_organizer_service_pb.CreateOrganizationRequest, hts_common_common_pb.Result>;
  getOrganization: grpc.MethodDefinition<hts_organizer_service_pb.UserRequest, hts_organizer_service_pb.GetOrganizationResponse>;
  getOrganizationById: grpc.MethodDefinition<hts_organizer_service_pb.GetByIdRequest, hts_organizer_service_pb.GetOrganizationByIdResponse>;
  updateOrganization: grpc.MethodDefinition<hts_organizer_service_pb.UpdateOrganizationRequest, hts_common_common_pb.Result>;
  removeOrganization: grpc.MethodDefinition<hts_organizer_service_pb.RemoveOrganizationRequest, hts_common_common_pb.Result>;
  addUsersToOrganization: grpc.MethodDefinition<hts_organizer_service_pb.UpdateUsersInOrganizationRequest, hts_common_common_pb.Result>;
  removeUsersFromOrganization: grpc.MethodDefinition<hts_organizer_service_pb.UpdateUsersInOrganizationRequest, hts_common_common_pb.Result>;
  createEvent: grpc.MethodDefinition<hts_organizer_service_pb.CreateEventRequest, hts_common_common_pb.Result>;
  getEvent: grpc.MethodDefinition<hts_organizer_service_pb.UserRequest, hts_organizer_service_pb.GetEventResponse>;
  getEventById: grpc.MethodDefinition<hts_organizer_service_pb.GetByIdRequest, hts_organizer_service_pb.GetEventByIdResponse>;
  updateEventInfo: grpc.MethodDefinition<hts_organizer_service_pb.UpdateEventInfoRequest, hts_common_common_pb.Result>;
  updateEventFacility: grpc.MethodDefinition<hts_organizer_service_pb.UpdateEventFacilityRequest, hts_common_common_pb.Result>;
  updateEventDuration: grpc.MethodDefinition<hts_organizer_service_pb.UpdateEventDurationRequest, hts_common_common_pb.Result>;
  removeEvent: grpc.MethodDefinition<hts_organizer_service_pb.RemoveEventRequest, hts_common_common_pb.Result>;
  updateRegistrationRequest: grpc.MethodDefinition<hts_organizer_service_pb.UpdateRegistrationRequestRequest, hts_common_common_pb.Result>;
  createTag: grpc.MethodDefinition<hts_organizer_service_pb.CreateTagRequest, hts_common_common_pb.Result>;
  addTag: grpc.MethodDefinition<hts_organizer_service_pb.UpdateTagRequest, hts_common_common_pb.Result>;
  removeTag: grpc.MethodDefinition<hts_organizer_service_pb.UpdateTagRequest, hts_common_common_pb.Result>;
  getTag: grpc.MethodDefinition<hts_organizer_service_pb.UserRequest, hts_organizer_service_pb.GetTagResponse>;
  getTagById: grpc.MethodDefinition<hts_organizer_service_pb.GetByIdRequest, hts_organizer_service_pb.GetTagByIdResponse>;
  hasEvent: grpc.MethodDefinition<hts_organizer_service_pb.HasEventRequest, hts_common_common_pb.Result>;
  ping: grpc.MethodDefinition<google_protobuf_empty_pb.Empty, hts_common_common_pb.Result>;
}

export const OrganizerServiceService: IOrganizerServiceService;

export interface IOrganizerServiceServer extends grpc.UntypedServiceImplementation {
  createOrganization: grpc.handleUnaryCall<hts_organizer_service_pb.CreateOrganizationRequest, hts_common_common_pb.Result>;
  getOrganization: grpc.handleUnaryCall<hts_organizer_service_pb.UserRequest, hts_organizer_service_pb.GetOrganizationResponse>;
  getOrganizationById: grpc.handleUnaryCall<hts_organizer_service_pb.GetByIdRequest, hts_organizer_service_pb.GetOrganizationByIdResponse>;
  updateOrganization: grpc.handleUnaryCall<hts_organizer_service_pb.UpdateOrganizationRequest, hts_common_common_pb.Result>;
  removeOrganization: grpc.handleUnaryCall<hts_organizer_service_pb.RemoveOrganizationRequest, hts_common_common_pb.Result>;
  addUsersToOrganization: grpc.handleUnaryCall<hts_organizer_service_pb.UpdateUsersInOrganizationRequest, hts_common_common_pb.Result>;
  removeUsersFromOrganization: grpc.handleUnaryCall<hts_organizer_service_pb.UpdateUsersInOrganizationRequest, hts_common_common_pb.Result>;
  createEvent: grpc.handleUnaryCall<hts_organizer_service_pb.CreateEventRequest, hts_common_common_pb.Result>;
  getEvent: grpc.handleUnaryCall<hts_organizer_service_pb.UserRequest, hts_organizer_service_pb.GetEventResponse>;
  getEventById: grpc.handleUnaryCall<hts_organizer_service_pb.GetByIdRequest, hts_organizer_service_pb.GetEventByIdResponse>;
  updateEventInfo: grpc.handleUnaryCall<hts_organizer_service_pb.UpdateEventInfoRequest, hts_common_common_pb.Result>;
  updateEventFacility: grpc.handleUnaryCall<hts_organizer_service_pb.UpdateEventFacilityRequest, hts_common_common_pb.Result>;
  updateEventDuration: grpc.handleUnaryCall<hts_organizer_service_pb.UpdateEventDurationRequest, hts_common_common_pb.Result>;
  removeEvent: grpc.handleUnaryCall<hts_organizer_service_pb.RemoveEventRequest, hts_common_common_pb.Result>;
  updateRegistrationRequest: grpc.handleUnaryCall<hts_organizer_service_pb.UpdateRegistrationRequestRequest, hts_common_common_pb.Result>;
  createTag: grpc.handleUnaryCall<hts_organizer_service_pb.CreateTagRequest, hts_common_common_pb.Result>;
  addTag: grpc.handleUnaryCall<hts_organizer_service_pb.UpdateTagRequest, hts_common_common_pb.Result>;
  removeTag: grpc.handleUnaryCall<hts_organizer_service_pb.UpdateTagRequest, hts_common_common_pb.Result>;
  getTag: grpc.handleUnaryCall<hts_organizer_service_pb.UserRequest, hts_organizer_service_pb.GetTagResponse>;
  getTagById: grpc.handleUnaryCall<hts_organizer_service_pb.GetByIdRequest, hts_organizer_service_pb.GetTagByIdResponse>;
  hasEvent: grpc.handleUnaryCall<hts_organizer_service_pb.HasEventRequest, hts_common_common_pb.Result>;
  ping: grpc.handleUnaryCall<google_protobuf_empty_pb.Empty, hts_common_common_pb.Result>;
}

export class OrganizerServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  createOrganization(argument: hts_organizer_service_pb.CreateOrganizationRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  createOrganization(argument: hts_organizer_service_pb.CreateOrganizationRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  createOrganization(argument: hts_organizer_service_pb.CreateOrganizationRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  getOrganization(argument: hts_organizer_service_pb.UserRequest, callback: grpc.requestCallback<hts_organizer_service_pb.GetOrganizationResponse>): grpc.ClientUnaryCall;
  getOrganization(argument: hts_organizer_service_pb.UserRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetOrganizationResponse>): grpc.ClientUnaryCall;
  getOrganization(argument: hts_organizer_service_pb.UserRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetOrganizationResponse>): grpc.ClientUnaryCall;
  getOrganizationById(argument: hts_organizer_service_pb.GetByIdRequest, callback: grpc.requestCallback<hts_organizer_service_pb.GetOrganizationByIdResponse>): grpc.ClientUnaryCall;
  getOrganizationById(argument: hts_organizer_service_pb.GetByIdRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetOrganizationByIdResponse>): grpc.ClientUnaryCall;
  getOrganizationById(argument: hts_organizer_service_pb.GetByIdRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetOrganizationByIdResponse>): grpc.ClientUnaryCall;
  updateOrganization(argument: hts_organizer_service_pb.UpdateOrganizationRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateOrganization(argument: hts_organizer_service_pb.UpdateOrganizationRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateOrganization(argument: hts_organizer_service_pb.UpdateOrganizationRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeOrganization(argument: hts_organizer_service_pb.RemoveOrganizationRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeOrganization(argument: hts_organizer_service_pb.RemoveOrganizationRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeOrganization(argument: hts_organizer_service_pb.RemoveOrganizationRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  addUsersToOrganization(argument: hts_organizer_service_pb.UpdateUsersInOrganizationRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  addUsersToOrganization(argument: hts_organizer_service_pb.UpdateUsersInOrganizationRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  addUsersToOrganization(argument: hts_organizer_service_pb.UpdateUsersInOrganizationRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeUsersFromOrganization(argument: hts_organizer_service_pb.UpdateUsersInOrganizationRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeUsersFromOrganization(argument: hts_organizer_service_pb.UpdateUsersInOrganizationRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeUsersFromOrganization(argument: hts_organizer_service_pb.UpdateUsersInOrganizationRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  createEvent(argument: hts_organizer_service_pb.CreateEventRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  createEvent(argument: hts_organizer_service_pb.CreateEventRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  createEvent(argument: hts_organizer_service_pb.CreateEventRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  getEvent(argument: hts_organizer_service_pb.UserRequest, callback: grpc.requestCallback<hts_organizer_service_pb.GetEventResponse>): grpc.ClientUnaryCall;
  getEvent(argument: hts_organizer_service_pb.UserRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetEventResponse>): grpc.ClientUnaryCall;
  getEvent(argument: hts_organizer_service_pb.UserRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetEventResponse>): grpc.ClientUnaryCall;
  getEventById(argument: hts_organizer_service_pb.GetByIdRequest, callback: grpc.requestCallback<hts_organizer_service_pb.GetEventByIdResponse>): grpc.ClientUnaryCall;
  getEventById(argument: hts_organizer_service_pb.GetByIdRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetEventByIdResponse>): grpc.ClientUnaryCall;
  getEventById(argument: hts_organizer_service_pb.GetByIdRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetEventByIdResponse>): grpc.ClientUnaryCall;
  updateEventInfo(argument: hts_organizer_service_pb.UpdateEventInfoRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateEventInfo(argument: hts_organizer_service_pb.UpdateEventInfoRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateEventInfo(argument: hts_organizer_service_pb.UpdateEventInfoRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateEventFacility(argument: hts_organizer_service_pb.UpdateEventFacilityRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateEventFacility(argument: hts_organizer_service_pb.UpdateEventFacilityRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateEventFacility(argument: hts_organizer_service_pb.UpdateEventFacilityRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateEventDuration(argument: hts_organizer_service_pb.UpdateEventDurationRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateEventDuration(argument: hts_organizer_service_pb.UpdateEventDurationRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateEventDuration(argument: hts_organizer_service_pb.UpdateEventDurationRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeEvent(argument: hts_organizer_service_pb.RemoveEventRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeEvent(argument: hts_organizer_service_pb.RemoveEventRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeEvent(argument: hts_organizer_service_pb.RemoveEventRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateRegistrationRequest(argument: hts_organizer_service_pb.UpdateRegistrationRequestRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateRegistrationRequest(argument: hts_organizer_service_pb.UpdateRegistrationRequestRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  updateRegistrationRequest(argument: hts_organizer_service_pb.UpdateRegistrationRequestRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  createTag(argument: hts_organizer_service_pb.CreateTagRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  createTag(argument: hts_organizer_service_pb.CreateTagRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  createTag(argument: hts_organizer_service_pb.CreateTagRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  addTag(argument: hts_organizer_service_pb.UpdateTagRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  addTag(argument: hts_organizer_service_pb.UpdateTagRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  addTag(argument: hts_organizer_service_pb.UpdateTagRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeTag(argument: hts_organizer_service_pb.UpdateTagRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeTag(argument: hts_organizer_service_pb.UpdateTagRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  removeTag(argument: hts_organizer_service_pb.UpdateTagRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  getTag(argument: hts_organizer_service_pb.UserRequest, callback: grpc.requestCallback<hts_organizer_service_pb.GetTagResponse>): grpc.ClientUnaryCall;
  getTag(argument: hts_organizer_service_pb.UserRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetTagResponse>): grpc.ClientUnaryCall;
  getTag(argument: hts_organizer_service_pb.UserRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetTagResponse>): grpc.ClientUnaryCall;
  getTagById(argument: hts_organizer_service_pb.GetByIdRequest, callback: grpc.requestCallback<hts_organizer_service_pb.GetTagByIdResponse>): grpc.ClientUnaryCall;
  getTagById(argument: hts_organizer_service_pb.GetByIdRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetTagByIdResponse>): grpc.ClientUnaryCall;
  getTagById(argument: hts_organizer_service_pb.GetByIdRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_organizer_service_pb.GetTagByIdResponse>): grpc.ClientUnaryCall;
  hasEvent(argument: hts_organizer_service_pb.HasEventRequest, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  hasEvent(argument: hts_organizer_service_pb.HasEventRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  hasEvent(argument: hts_organizer_service_pb.HasEventRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
  ping(argument: google_protobuf_empty_pb.Empty, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<hts_common_common_pb.Result>): grpc.ClientUnaryCall;
}

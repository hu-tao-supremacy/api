# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from hts.common import common_pb2 as hts_dot_common_dot_common__pb2
from hts.organizer import service_pb2 as hts_dot_organizer_dot_service__pb2


class OrganizerServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateOrganization = channel.unary_unary(
                '/hts.organizer.OrganizerService/CreateOrganization',
                request_serializer=hts_dot_organizer_dot_service__pb2.CreateOrganizationRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.GetOrganization = channel.unary_unary(
                '/hts.organizer.OrganizerService/GetOrganization',
                request_serializer=hts_dot_organizer_dot_service__pb2.UserRequest.SerializeToString,
                response_deserializer=hts_dot_organizer_dot_service__pb2.GetOrganizationResponse.FromString,
                )
        self.GetOrganizationById = channel.unary_unary(
                '/hts.organizer.OrganizerService/GetOrganizationById',
                request_serializer=hts_dot_organizer_dot_service__pb2.GetByIdRequest.SerializeToString,
                response_deserializer=hts_dot_organizer_dot_service__pb2.GetOrganizationByIdResponse.FromString,
                )
        self.UpdateOrganization = channel.unary_unary(
                '/hts.organizer.OrganizerService/UpdateOrganization',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateOrganizationRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.RemoveOrganization = channel.unary_unary(
                '/hts.organizer.OrganizerService/RemoveOrganization',
                request_serializer=hts_dot_organizer_dot_service__pb2.RemoveOrganizationRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.AddUsersToOrganization = channel.unary_unary(
                '/hts.organizer.OrganizerService/AddUsersToOrganization',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateUsersInOrganizationRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.RemoveUsersFromOrganization = channel.unary_unary(
                '/hts.organizer.OrganizerService/RemoveUsersFromOrganization',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateUsersInOrganizationRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.CreateEvent = channel.unary_unary(
                '/hts.organizer.OrganizerService/CreateEvent',
                request_serializer=hts_dot_organizer_dot_service__pb2.CreateEventRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.GetEvent = channel.unary_unary(
                '/hts.organizer.OrganizerService/GetEvent',
                request_serializer=hts_dot_organizer_dot_service__pb2.UserRequest.SerializeToString,
                response_deserializer=hts_dot_organizer_dot_service__pb2.GetEventResponse.FromString,
                )
        self.GetEventById = channel.unary_unary(
                '/hts.organizer.OrganizerService/GetEventById',
                request_serializer=hts_dot_organizer_dot_service__pb2.GetByIdRequest.SerializeToString,
                response_deserializer=hts_dot_organizer_dot_service__pb2.GetEventByIdResponse.FromString,
                )
        self.UpdateEventInfo = channel.unary_unary(
                '/hts.organizer.OrganizerService/UpdateEventInfo',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateEventInfoRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.UpdateEventFacility = channel.unary_unary(
                '/hts.organizer.OrganizerService/UpdateEventFacility',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateEventFacilityRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.UpdateEventDuration = channel.unary_unary(
                '/hts.organizer.OrganizerService/UpdateEventDuration',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateEventDurationRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.RemoveEvent = channel.unary_unary(
                '/hts.organizer.OrganizerService/RemoveEvent',
                request_serializer=hts_dot_organizer_dot_service__pb2.RemoveEventRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.UpdateRegistrationRequest = channel.unary_unary(
                '/hts.organizer.OrganizerService/UpdateRegistrationRequest',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateRegistrationRequestRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.CreateTag = channel.unary_unary(
                '/hts.organizer.OrganizerService/CreateTag',
                request_serializer=hts_dot_organizer_dot_service__pb2.CreateTagRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.AddTag = channel.unary_unary(
                '/hts.organizer.OrganizerService/AddTag',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateTagRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.RemoveTag = channel.unary_unary(
                '/hts.organizer.OrganizerService/RemoveTag',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateTagRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.GetTag = channel.unary_unary(
                '/hts.organizer.OrganizerService/GetTag',
                request_serializer=hts_dot_organizer_dot_service__pb2.UserRequest.SerializeToString,
                response_deserializer=hts_dot_organizer_dot_service__pb2.GetTagResponse.FromString,
                )
        self.GetTagById = channel.unary_unary(
                '/hts.organizer.OrganizerService/GetTagById',
                request_serializer=hts_dot_organizer_dot_service__pb2.GetByIdRequest.SerializeToString,
                response_deserializer=hts_dot_organizer_dot_service__pb2.GetTagByIdResponse.FromString,
                )
        self.HasEvent = channel.unary_unary(
                '/hts.organizer.OrganizerService/HasEvent',
                request_serializer=hts_dot_organizer_dot_service__pb2.HasEventRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.Ping = channel.unary_unary(
                '/hts.organizer.OrganizerService/Ping',
                request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )


class OrganizerServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def CreateOrganization(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetOrganization(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetOrganizationById(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateOrganization(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RemoveOrganization(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AddUsersToOrganization(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RemoveUsersFromOrganization(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateEvent(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetEvent(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetEventById(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateEventInfo(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateEventFacility(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateEventDuration(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RemoveEvent(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateRegistrationRequest(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateTag(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AddTag(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RemoveTag(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetTag(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetTagById(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def HasEvent(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Ping(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_OrganizerServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateOrganization': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateOrganization,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.CreateOrganizationRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'GetOrganization': grpc.unary_unary_rpc_method_handler(
                    servicer.GetOrganization,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UserRequest.FromString,
                    response_serializer=hts_dot_organizer_dot_service__pb2.GetOrganizationResponse.SerializeToString,
            ),
            'GetOrganizationById': grpc.unary_unary_rpc_method_handler(
                    servicer.GetOrganizationById,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.GetByIdRequest.FromString,
                    response_serializer=hts_dot_organizer_dot_service__pb2.GetOrganizationByIdResponse.SerializeToString,
            ),
            'UpdateOrganization': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateOrganization,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateOrganizationRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'RemoveOrganization': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveOrganization,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.RemoveOrganizationRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'AddUsersToOrganization': grpc.unary_unary_rpc_method_handler(
                    servicer.AddUsersToOrganization,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateUsersInOrganizationRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'RemoveUsersFromOrganization': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveUsersFromOrganization,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateUsersInOrganizationRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'CreateEvent': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateEvent,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.CreateEventRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'GetEvent': grpc.unary_unary_rpc_method_handler(
                    servicer.GetEvent,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UserRequest.FromString,
                    response_serializer=hts_dot_organizer_dot_service__pb2.GetEventResponse.SerializeToString,
            ),
            'GetEventById': grpc.unary_unary_rpc_method_handler(
                    servicer.GetEventById,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.GetByIdRequest.FromString,
                    response_serializer=hts_dot_organizer_dot_service__pb2.GetEventByIdResponse.SerializeToString,
            ),
            'UpdateEventInfo': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateEventInfo,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateEventInfoRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'UpdateEventFacility': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateEventFacility,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateEventFacilityRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'UpdateEventDuration': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateEventDuration,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateEventDurationRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'RemoveEvent': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveEvent,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.RemoveEventRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'UpdateRegistrationRequest': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateRegistrationRequest,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateRegistrationRequestRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'CreateTag': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateTag,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.CreateTagRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'AddTag': grpc.unary_unary_rpc_method_handler(
                    servicer.AddTag,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateTagRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'RemoveTag': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveTag,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateTagRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'GetTag': grpc.unary_unary_rpc_method_handler(
                    servicer.GetTag,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UserRequest.FromString,
                    response_serializer=hts_dot_organizer_dot_service__pb2.GetTagResponse.SerializeToString,
            ),
            'GetTagById': grpc.unary_unary_rpc_method_handler(
                    servicer.GetTagById,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.GetByIdRequest.FromString,
                    response_serializer=hts_dot_organizer_dot_service__pb2.GetTagByIdResponse.SerializeToString,
            ),
            'HasEvent': grpc.unary_unary_rpc_method_handler(
                    servicer.HasEvent,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.HasEventRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'Ping': grpc.unary_unary_rpc_method_handler(
                    servicer.Ping,
                    request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'hts.organizer.OrganizerService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class OrganizerService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def CreateOrganization(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/CreateOrganization',
            hts_dot_organizer_dot_service__pb2.CreateOrganizationRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetOrganization(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/GetOrganization',
            hts_dot_organizer_dot_service__pb2.UserRequest.SerializeToString,
            hts_dot_organizer_dot_service__pb2.GetOrganizationResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetOrganizationById(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/GetOrganizationById',
            hts_dot_organizer_dot_service__pb2.GetByIdRequest.SerializeToString,
            hts_dot_organizer_dot_service__pb2.GetOrganizationByIdResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateOrganization(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/UpdateOrganization',
            hts_dot_organizer_dot_service__pb2.UpdateOrganizationRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RemoveOrganization(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/RemoveOrganization',
            hts_dot_organizer_dot_service__pb2.RemoveOrganizationRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddUsersToOrganization(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/AddUsersToOrganization',
            hts_dot_organizer_dot_service__pb2.UpdateUsersInOrganizationRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RemoveUsersFromOrganization(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/RemoveUsersFromOrganization',
            hts_dot_organizer_dot_service__pb2.UpdateUsersInOrganizationRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateEvent(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/CreateEvent',
            hts_dot_organizer_dot_service__pb2.CreateEventRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetEvent(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/GetEvent',
            hts_dot_organizer_dot_service__pb2.UserRequest.SerializeToString,
            hts_dot_organizer_dot_service__pb2.GetEventResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetEventById(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/GetEventById',
            hts_dot_organizer_dot_service__pb2.GetByIdRequest.SerializeToString,
            hts_dot_organizer_dot_service__pb2.GetEventByIdResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateEventInfo(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/UpdateEventInfo',
            hts_dot_organizer_dot_service__pb2.UpdateEventInfoRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateEventFacility(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/UpdateEventFacility',
            hts_dot_organizer_dot_service__pb2.UpdateEventFacilityRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateEventDuration(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/UpdateEventDuration',
            hts_dot_organizer_dot_service__pb2.UpdateEventDurationRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RemoveEvent(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/RemoveEvent',
            hts_dot_organizer_dot_service__pb2.RemoveEventRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateRegistrationRequest(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/UpdateRegistrationRequest',
            hts_dot_organizer_dot_service__pb2.UpdateRegistrationRequestRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateTag(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/CreateTag',
            hts_dot_organizer_dot_service__pb2.CreateTagRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddTag(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/AddTag',
            hts_dot_organizer_dot_service__pb2.UpdateTagRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RemoveTag(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/RemoveTag',
            hts_dot_organizer_dot_service__pb2.UpdateTagRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetTag(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/GetTag',
            hts_dot_organizer_dot_service__pb2.UserRequest.SerializeToString,
            hts_dot_organizer_dot_service__pb2.GetTagResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetTagById(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/GetTagById',
            hts_dot_organizer_dot_service__pb2.GetByIdRequest.SerializeToString,
            hts_dot_organizer_dot_service__pb2.GetTagByIdResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def HasEvent(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/HasEvent',
            hts_dot_organizer_dot_service__pb2.HasEventRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Ping(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/Ping',
            google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

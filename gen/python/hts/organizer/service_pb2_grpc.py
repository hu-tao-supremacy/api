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
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.GetOrganization = channel.unary_unary(
                '/hts.organizer.OrganizerService/GetOrganization',
                request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
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
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.RemoveOrganization = channel.unary_unary(
                '/hts.organizer.OrganizerService/RemoveOrganization',
                request_serializer=hts_dot_organizer_dot_service__pb2.RemoveOrganizationRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.AddUsersToOrganization = channel.unary_unary(
                '/hts.organizer.OrganizerService/AddUsersToOrganization',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateUsersInOrganizationRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.RemoveUsersFromOrganization = channel.unary_unary(
                '/hts.organizer.OrganizerService/RemoveUsersFromOrganization',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateUsersInOrganizationRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.CreateEvent = channel.unary_unary(
                '/hts.organizer.OrganizerService/CreateEvent',
                request_serializer=hts_dot_organizer_dot_service__pb2.CreateEventRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.UpdateEvent = channel.unary_unary(
                '/hts.organizer.OrganizerService/UpdateEvent',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateEventRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.UpdateEventDuration = channel.unary_unary(
                '/hts.organizer.OrganizerService/UpdateEventDuration',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateEventDurationRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.RemoveEvent = channel.unary_unary(
                '/hts.organizer.OrganizerService/RemoveEvent',
                request_serializer=hts_dot_organizer_dot_service__pb2.RemoveEventRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.UpdateRegistrationRequest = channel.unary_unary(
                '/hts.organizer.OrganizerService/UpdateRegistrationRequest',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateRegistrationRequestRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.CreateTag = channel.unary_unary(
                '/hts.organizer.OrganizerService/CreateTag',
                request_serializer=hts_dot_organizer_dot_service__pb2.CreateTagRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.AddTag = channel.unary_unary(
                '/hts.organizer.OrganizerService/AddTag',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateTagRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.RemoveTag = channel.unary_unary(
                '/hts.organizer.OrganizerService/RemoveTag',
                request_serializer=hts_dot_organizer_dot_service__pb2.UpdateTagRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.GetTag = channel.unary_unary(
                '/hts.organizer.OrganizerService/GetTag',
                request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
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
                response_deserializer=hts_dot_common_dot_common__pb2.Event.FromString,
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

    def UpdateEvent(self, request, context):
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
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'GetOrganization': grpc.unary_unary_rpc_method_handler(
                    servicer.GetOrganization,
                    request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'RemoveOrganization': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveOrganization,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.RemoveOrganizationRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'AddUsersToOrganization': grpc.unary_unary_rpc_method_handler(
                    servicer.AddUsersToOrganization,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateUsersInOrganizationRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'RemoveUsersFromOrganization': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveUsersFromOrganization,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateUsersInOrganizationRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'CreateEvent': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateEvent,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.CreateEventRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateEvent': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateEvent,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateEventRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateEventDuration': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateEventDuration,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateEventDurationRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'RemoveEvent': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveEvent,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.RemoveEventRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateRegistrationRequest': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateRegistrationRequest,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateRegistrationRequestRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'CreateTag': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateTag,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.CreateTagRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'AddTag': grpc.unary_unary_rpc_method_handler(
                    servicer.AddTag,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateTagRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'RemoveTag': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveTag,
                    request_deserializer=hts_dot_organizer_dot_service__pb2.UpdateTagRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'GetTag': grpc.unary_unary_rpc_method_handler(
                    servicer.GetTag,
                    request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
                    response_serializer=hts_dot_common_dot_common__pb2.Event.SerializeToString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateEvent(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.organizer.OrganizerService/UpdateEvent',
            hts_dot_organizer_dot_service__pb2.UpdateEventRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
            google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
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
            hts_dot_common_dot_common__pb2.Event.FromString,
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

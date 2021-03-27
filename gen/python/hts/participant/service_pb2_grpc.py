# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from hts.common import common_pb2 as hts_dot_common_dot_common__pb2
from hts.participant import service_pb2 as hts_dot_participant_dot_service__pb2


class ParticipantServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.IsEventAvailable = channel.unary_unary(
                '/hts.participant.ParticipantService/IsEventAvailable',
                request_serializer=hts_dot_participant_dot_service__pb2.IsEventAvailableRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
                )
        self.JoinEvent = channel.unary_unary(
                '/hts.participant.ParticipantService/JoinEvent',
                request_serializer=hts_dot_participant_dot_service__pb2.UserWithEventRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.UserEvent.FromString,
                )
        self.CancelEvent = channel.unary_unary(
                '/hts.participant.ParticipantService/CancelEvent',
                request_serializer=hts_dot_participant_dot_service__pb2.UserWithEventRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Event.FromString,
                )
        self.SubmitAnswerForPostEventQuestion = channel.unary_unary(
                '/hts.participant.ParticipantService/SubmitAnswerForPostEventQuestion',
                request_serializer=hts_dot_participant_dot_service__pb2.SubmitAnswerForPostEventQuestionRequest.SerializeToString,
                response_deserializer=hts_dot_participant_dot_service__pb2.SubmitAnswerForPostEventQuestionResponse.FromString,
                )
        self.GetEventById = channel.unary_unary(
                '/hts.participant.ParticipantService/GetEventById',
                request_serializer=hts_dot_participant_dot_service__pb2.GetEventByIdRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Event.FromString,
                )
        self.GetAllEvents = channel.unary_unary(
                '/hts.participant.ParticipantService/GetAllEvents',
                request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
                response_deserializer=hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
                )
        self.GetSuggestedEvents = channel.unary_unary(
                '/hts.participant.ParticipantService/GetSuggestedEvents',
                request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
                response_deserializer=hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
                )
        self.GetUpcomingEvents = channel.unary_unary(
                '/hts.participant.ParticipantService/GetUpcomingEvents',
                request_serializer=hts_dot_participant_dot_service__pb2.GetUpcomingEventsRequest.SerializeToString,
                response_deserializer=hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
                )
        self.GetEventsByStringOfName = channel.unary_unary(
                '/hts.participant.ParticipantService/GetEventsByStringOfName',
                request_serializer=hts_dot_participant_dot_service__pb2.StringInputRequest.SerializeToString,
                response_deserializer=hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
                )
        self.GetEventsByTagId = channel.unary_unary(
                '/hts.participant.ParticipantService/GetEventsByTagId',
                request_serializer=hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.SerializeToString,
                response_deserializer=hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
                )
        self.GetEventsByOrganizationId = channel.unary_unary(
                '/hts.participant.ParticipantService/GetEventsByOrganizationId',
                request_serializer=hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.SerializeToString,
                response_deserializer=hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
                )
        self.GetEventsByFacilityId = channel.unary_unary(
                '/hts.participant.ParticipantService/GetEventsByFacilityId',
                request_serializer=hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.SerializeToString,
                response_deserializer=hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
                )
        self.GetEventsByDate = channel.unary_unary(
                '/hts.participant.ParticipantService/GetEventsByDate',
                request_serializer=google_dot_protobuf_dot_timestamp__pb2.Timestamp.SerializeToString,
                response_deserializer=hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
                )
        self.GetLocationById = channel.unary_unary(
                '/hts.participant.ParticipantService/GetLocationById',
                request_serializer=hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Location.FromString,
                )
        self.GenerateQR = channel.unary_unary(
                '/hts.participant.ParticipantService/GenerateQR',
                request_serializer=hts_dot_participant_dot_service__pb2.GenerateQRRequest.SerializeToString,
                response_deserializer=hts_dot_participant_dot_service__pb2.GenerateQRResponse.FromString,
                )
        self.Ping = channel.unary_unary(
                '/hts.participant.ParticipantService/Ping',
                request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
                )


class ParticipantServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def IsEventAvailable(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def JoinEvent(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CancelEvent(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SubmitAnswerForPostEventQuestion(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetEventById(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetAllEvents(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetSuggestedEvents(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetUpcomingEvents(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetEventsByStringOfName(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetEventsByTagId(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetEventsByOrganizationId(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetEventsByFacilityId(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetEventsByDate(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetLocationById(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GenerateQR(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Ping(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ParticipantServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'IsEventAvailable': grpc.unary_unary_rpc_method_handler(
                    servicer.IsEventAvailable,
                    request_deserializer=hts_dot_participant_dot_service__pb2.IsEventAvailableRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.SerializeToString,
            ),
            'JoinEvent': grpc.unary_unary_rpc_method_handler(
                    servicer.JoinEvent,
                    request_deserializer=hts_dot_participant_dot_service__pb2.UserWithEventRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.UserEvent.SerializeToString,
            ),
            'CancelEvent': grpc.unary_unary_rpc_method_handler(
                    servicer.CancelEvent,
                    request_deserializer=hts_dot_participant_dot_service__pb2.UserWithEventRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Event.SerializeToString,
            ),
            'SubmitAnswerForPostEventQuestion': grpc.unary_unary_rpc_method_handler(
                    servicer.SubmitAnswerForPostEventQuestion,
                    request_deserializer=hts_dot_participant_dot_service__pb2.SubmitAnswerForPostEventQuestionRequest.FromString,
                    response_serializer=hts_dot_participant_dot_service__pb2.SubmitAnswerForPostEventQuestionResponse.SerializeToString,
            ),
            'GetEventById': grpc.unary_unary_rpc_method_handler(
                    servicer.GetEventById,
                    request_deserializer=hts_dot_participant_dot_service__pb2.GetEventByIdRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Event.SerializeToString,
            ),
            'GetAllEvents': grpc.unary_unary_rpc_method_handler(
                    servicer.GetAllEvents,
                    request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                    response_serializer=hts_dot_participant_dot_service__pb2.EventsResponse.SerializeToString,
            ),
            'GetSuggestedEvents': grpc.unary_unary_rpc_method_handler(
                    servicer.GetSuggestedEvents,
                    request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                    response_serializer=hts_dot_participant_dot_service__pb2.EventsResponse.SerializeToString,
            ),
            'GetUpcomingEvents': grpc.unary_unary_rpc_method_handler(
                    servicer.GetUpcomingEvents,
                    request_deserializer=hts_dot_participant_dot_service__pb2.GetUpcomingEventsRequest.FromString,
                    response_serializer=hts_dot_participant_dot_service__pb2.EventsResponse.SerializeToString,
            ),
            'GetEventsByStringOfName': grpc.unary_unary_rpc_method_handler(
                    servicer.GetEventsByStringOfName,
                    request_deserializer=hts_dot_participant_dot_service__pb2.StringInputRequest.FromString,
                    response_serializer=hts_dot_participant_dot_service__pb2.EventsResponse.SerializeToString,
            ),
            'GetEventsByTagId': grpc.unary_unary_rpc_method_handler(
                    servicer.GetEventsByTagId,
                    request_deserializer=hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.FromString,
                    response_serializer=hts_dot_participant_dot_service__pb2.EventsResponse.SerializeToString,
            ),
            'GetEventsByOrganizationId': grpc.unary_unary_rpc_method_handler(
                    servicer.GetEventsByOrganizationId,
                    request_deserializer=hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.FromString,
                    response_serializer=hts_dot_participant_dot_service__pb2.EventsResponse.SerializeToString,
            ),
            'GetEventsByFacilityId': grpc.unary_unary_rpc_method_handler(
                    servicer.GetEventsByFacilityId,
                    request_deserializer=hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.FromString,
                    response_serializer=hts_dot_participant_dot_service__pb2.EventsResponse.SerializeToString,
            ),
            'GetEventsByDate': grpc.unary_unary_rpc_method_handler(
                    servicer.GetEventsByDate,
                    request_deserializer=google_dot_protobuf_dot_timestamp__pb2.Timestamp.FromString,
                    response_serializer=hts_dot_participant_dot_service__pb2.EventsResponse.SerializeToString,
            ),
            'GetLocationById': grpc.unary_unary_rpc_method_handler(
                    servicer.GetLocationById,
                    request_deserializer=hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Location.SerializeToString,
            ),
            'GenerateQR': grpc.unary_unary_rpc_method_handler(
                    servicer.GenerateQR,
                    request_deserializer=hts_dot_participant_dot_service__pb2.GenerateQRRequest.FromString,
                    response_serializer=hts_dot_participant_dot_service__pb2.GenerateQRResponse.SerializeToString,
            ),
            'Ping': grpc.unary_unary_rpc_method_handler(
                    servicer.Ping,
                    request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                    response_serializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'hts.participant.ParticipantService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class ParticipantService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def IsEventAvailable(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/IsEventAvailable',
            hts_dot_participant_dot_service__pb2.IsEventAvailableRequest.SerializeToString,
            google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def JoinEvent(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/JoinEvent',
            hts_dot_participant_dot_service__pb2.UserWithEventRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.UserEvent.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CancelEvent(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/CancelEvent',
            hts_dot_participant_dot_service__pb2.UserWithEventRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Event.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SubmitAnswerForPostEventQuestion(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/SubmitAnswerForPostEventQuestion',
            hts_dot_participant_dot_service__pb2.SubmitAnswerForPostEventQuestionRequest.SerializeToString,
            hts_dot_participant_dot_service__pb2.SubmitAnswerForPostEventQuestionResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GetEventById',
            hts_dot_participant_dot_service__pb2.GetEventByIdRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Event.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetAllEvents(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GetAllEvents',
            google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetSuggestedEvents(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GetSuggestedEvents',
            google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetUpcomingEvents(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GetUpcomingEvents',
            hts_dot_participant_dot_service__pb2.GetUpcomingEventsRequest.SerializeToString,
            hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetEventsByStringOfName(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GetEventsByStringOfName',
            hts_dot_participant_dot_service__pb2.StringInputRequest.SerializeToString,
            hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetEventsByTagId(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GetEventsByTagId',
            hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.SerializeToString,
            hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetEventsByOrganizationId(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GetEventsByOrganizationId',
            hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.SerializeToString,
            hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetEventsByFacilityId(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GetEventsByFacilityId',
            hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.SerializeToString,
            hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetEventsByDate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GetEventsByDate',
            google_dot_protobuf_dot_timestamp__pb2.Timestamp.SerializeToString,
            hts_dot_participant_dot_service__pb2.EventsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetLocationById(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GetLocationById',
            hts_dot_participant_dot_service__pb2.GetObjectByIdRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.Location.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GenerateQR(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/GenerateQR',
            hts_dot_participant_dot_service__pb2.GenerateQRRequest.SerializeToString,
            hts_dot_participant_dot_service__pb2.GenerateQRResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/hts.participant.ParticipantService/Ping',
            google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

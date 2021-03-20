# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from hts.account import service_pb2 as hts_dot_account_dot_service__pb2
from hts.common import common_pb2 as hts_dot_common_dot_common__pb2


class AccountServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.IsAuthenticated = channel.unary_unary(
                '/hts.account.AccountService/IsAuthenticated',
                request_serializer=hts_dot_account_dot_service__pb2.IsAuthenticatedInput.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.UpdateAccountInfo = channel.unary_unary(
                '/hts.account.AccountService/UpdateAccountInfo',
                request_serializer=hts_dot_common_dot_common__pb2.User.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.User.FromString,
                )
        self.GenerateJWT = channel.unary_unary(
                '/hts.account.AccountService/GenerateJWT',
                request_serializer=hts_dot_common_dot_common__pb2.User.SerializeToString,
                response_deserializer=hts_dot_account_dot_service__pb2.GenerateJWTOutput.FromString,
                )
        self.HasPermission = channel.unary_unary(
                '/hts.account.AccountService/HasPermission',
                request_serializer=hts_dot_account_dot_service__pb2.HasPermissionInput.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )
        self.ValidatePermission = channel.unary_unary(
                '/hts.account.AccountService/ValidatePermission',
                request_serializer=hts_dot_account_dot_service__pb2.HasPermissionInput.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.Ping = channel.unary_unary(
                '/hts.account.AccountService/Ping',
                request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.Result.FromString,
                )


class AccountServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def IsAuthenticated(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateAccountInfo(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GenerateJWT(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def HasPermission(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ValidatePermission(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Ping(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_AccountServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'IsAuthenticated': grpc.unary_unary_rpc_method_handler(
                    servicer.IsAuthenticated,
                    request_deserializer=hts_dot_account_dot_service__pb2.IsAuthenticatedInput.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'UpdateAccountInfo': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateAccountInfo,
                    request_deserializer=hts_dot_common_dot_common__pb2.User.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.User.SerializeToString,
            ),
            'GenerateJWT': grpc.unary_unary_rpc_method_handler(
                    servicer.GenerateJWT,
                    request_deserializer=hts_dot_common_dot_common__pb2.User.FromString,
                    response_serializer=hts_dot_account_dot_service__pb2.GenerateJWTOutput.SerializeToString,
            ),
            'HasPermission': grpc.unary_unary_rpc_method_handler(
                    servicer.HasPermission,
                    request_deserializer=hts_dot_account_dot_service__pb2.HasPermissionInput.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
            'ValidatePermission': grpc.unary_unary_rpc_method_handler(
                    servicer.ValidatePermission,
                    request_deserializer=hts_dot_account_dot_service__pb2.HasPermissionInput.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'Ping': grpc.unary_unary_rpc_method_handler(
                    servicer.Ping,
                    request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.Result.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'hts.account.AccountService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class AccountService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def IsAuthenticated(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/IsAuthenticated',
            hts_dot_account_dot_service__pb2.IsAuthenticatedInput.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateAccountInfo(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/UpdateAccountInfo',
            hts_dot_common_dot_common__pb2.User.SerializeToString,
            hts_dot_common_dot_common__pb2.User.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GenerateJWT(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/GenerateJWT',
            hts_dot_common_dot_common__pb2.User.SerializeToString,
            hts_dot_account_dot_service__pb2.GenerateJWTOutput.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def HasPermission(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/HasPermission',
            hts_dot_account_dot_service__pb2.HasPermissionInput.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ValidatePermission(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/ValidatePermission',
            hts_dot_account_dot_service__pb2.HasPermissionInput.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/Ping',
            google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            hts_dot_common_dot_common__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from hts.account import service_pb2 as hts_dot_account_dot_service__pb2
from hts.common import common_pb2 as hts_dot_common_dot_common__pb2


class AccountServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateUser = channel.unary_unary(
                '/hts.account.AccountService/CreateUser',
                request_serializer=hts_dot_account_dot_service__pb2.CreateUserRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.User.FromString,
                )
        self.GetUserByChulaId = channel.unary_unary(
                '/hts.account.AccountService/GetUserByChulaId',
                request_serializer=hts_dot_account_dot_service__pb2.GetUserByChulaIdRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.User.FromString,
                )
        self.GetUserByEmail = channel.unary_unary(
                '/hts.account.AccountService/GetUserByEmail',
                request_serializer=hts_dot_account_dot_service__pb2.GetUserByEmailRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.User.FromString,
                )
        self.IsAuthenticated = channel.unary_unary(
                '/hts.account.AccountService/IsAuthenticated',
                request_serializer=hts_dot_account_dot_service__pb2.IsAuthenticatedRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
                )
        self.UpdateAccountInfo = channel.unary_unary(
                '/hts.account.AccountService/UpdateAccountInfo',
                request_serializer=hts_dot_common_dot_common__pb2.User.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.User.FromString,
                )
        self.GetUserById = channel.unary_unary(
                '/hts.account.AccountService/GetUserById',
                request_serializer=hts_dot_common_dot_common__pb2.GetObjectByIdRequest.SerializeToString,
                response_deserializer=hts_dot_common_dot_common__pb2.User.FromString,
                )
        self.GenerateAccessToken = channel.unary_unary(
                '/hts.account.AccountService/GenerateAccessToken',
                request_serializer=hts_dot_account_dot_service__pb2.GenerateAccessTokenRequest.SerializeToString,
                response_deserializer=hts_dot_account_dot_service__pb2.GenerateAccessTokenResponse.FromString,
                )
        self.HasPermission = channel.unary_unary(
                '/hts.account.AccountService/HasPermission',
                request_serializer=hts_dot_account_dot_service__pb2.HasPermissionRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
                )
        self.AssignRole = channel.unary_unary(
                '/hts.account.AccountService/AssignRole',
                request_serializer=hts_dot_account_dot_service__pb2.AssignRoleRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
                )
        self.RemoveRole = channel.unary_unary(
                '/hts.account.AccountService/RemoveRole',
                request_serializer=hts_dot_account_dot_service__pb2.RemoveRoleRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
                )
        self.Ping = channel.unary_unary(
                '/hts.account.AccountService/Ping',
                request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
                )


class AccountServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def CreateUser(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetUserByChulaId(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetUserByEmail(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

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

    def GetUserById(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GenerateAccessToken(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def HasPermission(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AssignRole(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RemoveRole(self, request, context):
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
            'CreateUser': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateUser,
                    request_deserializer=hts_dot_account_dot_service__pb2.CreateUserRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.User.SerializeToString,
            ),
            'GetUserByChulaId': grpc.unary_unary_rpc_method_handler(
                    servicer.GetUserByChulaId,
                    request_deserializer=hts_dot_account_dot_service__pb2.GetUserByChulaIdRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.User.SerializeToString,
            ),
            'GetUserByEmail': grpc.unary_unary_rpc_method_handler(
                    servicer.GetUserByEmail,
                    request_deserializer=hts_dot_account_dot_service__pb2.GetUserByEmailRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.User.SerializeToString,
            ),
            'IsAuthenticated': grpc.unary_unary_rpc_method_handler(
                    servicer.IsAuthenticated,
                    request_deserializer=hts_dot_account_dot_service__pb2.IsAuthenticatedRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.SerializeToString,
            ),
            'UpdateAccountInfo': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateAccountInfo,
                    request_deserializer=hts_dot_common_dot_common__pb2.User.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.User.SerializeToString,
            ),
            'GetUserById': grpc.unary_unary_rpc_method_handler(
                    servicer.GetUserById,
                    request_deserializer=hts_dot_common_dot_common__pb2.GetObjectByIdRequest.FromString,
                    response_serializer=hts_dot_common_dot_common__pb2.User.SerializeToString,
            ),
            'GenerateAccessToken': grpc.unary_unary_rpc_method_handler(
                    servicer.GenerateAccessToken,
                    request_deserializer=hts_dot_account_dot_service__pb2.GenerateAccessTokenRequest.FromString,
                    response_serializer=hts_dot_account_dot_service__pb2.GenerateAccessTokenResponse.SerializeToString,
            ),
            'HasPermission': grpc.unary_unary_rpc_method_handler(
                    servicer.HasPermission,
                    request_deserializer=hts_dot_account_dot_service__pb2.HasPermissionRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.SerializeToString,
            ),
            'AssignRole': grpc.unary_unary_rpc_method_handler(
                    servicer.AssignRole,
                    request_deserializer=hts_dot_account_dot_service__pb2.AssignRoleRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.SerializeToString,
            ),
            'RemoveRole': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveRole,
                    request_deserializer=hts_dot_account_dot_service__pb2.RemoveRoleRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.SerializeToString,
            ),
            'Ping': grpc.unary_unary_rpc_method_handler(
                    servicer.Ping,
                    request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                    response_serializer=google_dot_protobuf_dot_wrappers__pb2.BoolValue.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'hts.account.AccountService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class AccountService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def CreateUser(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/CreateUser',
            hts_dot_account_dot_service__pb2.CreateUserRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.User.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetUserByChulaId(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/GetUserByChulaId',
            hts_dot_account_dot_service__pb2.GetUserByChulaIdRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.User.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetUserByEmail(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/GetUserByEmail',
            hts_dot_account_dot_service__pb2.GetUserByEmailRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.User.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

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
            hts_dot_account_dot_service__pb2.IsAuthenticatedRequest.SerializeToString,
            google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
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
    def GetUserById(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/GetUserById',
            hts_dot_common_dot_common__pb2.GetObjectByIdRequest.SerializeToString,
            hts_dot_common_dot_common__pb2.User.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GenerateAccessToken(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/GenerateAccessToken',
            hts_dot_account_dot_service__pb2.GenerateAccessTokenRequest.SerializeToString,
            hts_dot_account_dot_service__pb2.GenerateAccessTokenResponse.FromString,
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
            hts_dot_account_dot_service__pb2.HasPermissionRequest.SerializeToString,
            google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AssignRole(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/AssignRole',
            hts_dot_account_dot_service__pb2.AssignRoleRequest.SerializeToString,
            google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RemoveRole(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/hts.account.AccountService/RemoveRole',
            hts_dot_account_dot_service__pb2.RemoveRoleRequest.SerializeToString,
            google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
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
            google_dot_protobuf_dot_wrappers__pb2.BoolValue.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

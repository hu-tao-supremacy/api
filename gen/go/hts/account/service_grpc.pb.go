// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package account

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	wrapperspb "google.golang.org/protobuf/types/known/wrapperspb"
	common "onepass.app/facility/hts/common"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// AccountServiceClient is the client API for AccountService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type AccountServiceClient interface {
	CreateUser(ctx context.Context, in *CreateUserRequest, opts ...grpc.CallOption) (*common.User, error)
	GetUserByChulaId(ctx context.Context, in *GetUserByChulaIdRequest, opts ...grpc.CallOption) (*common.User, error)
	GetUserByEmail(ctx context.Context, in *GetUserByEmailRequest, opts ...grpc.CallOption) (*common.User, error)
	IsAuthenticated(ctx context.Context, in *IsAuthenticatedRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
	UpdateAccountInfo(ctx context.Context, in *common.User, opts ...grpc.CallOption) (*common.User, error)
	UpdateUserInterests(ctx context.Context, in *UpdateUserInterestsRequest, opts ...grpc.CallOption) (*common.User, error)
	GetUserById(ctx context.Context, in *common.GetObjectByIdRequest, opts ...grpc.CallOption) (*common.User, error)
	GenerateAccessToken(ctx context.Context, in *GenerateAccessTokenRequest, opts ...grpc.CallOption) (*GenerateAccessTokenResponse, error)
	HasPermission(ctx context.Context, in *HasPermissionRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
	AssignRole(ctx context.Context, in *AssignRoleRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
	RemoveRole(ctx context.Context, in *RemoveRoleRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
	Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
}

type accountServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewAccountServiceClient(cc grpc.ClientConnInterface) AccountServiceClient {
	return &accountServiceClient{cc}
}

func (c *accountServiceClient) CreateUser(ctx context.Context, in *CreateUserRequest, opts ...grpc.CallOption) (*common.User, error) {
	out := new(common.User)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/CreateUser", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) GetUserByChulaId(ctx context.Context, in *GetUserByChulaIdRequest, opts ...grpc.CallOption) (*common.User, error) {
	out := new(common.User)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/GetUserByChulaId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) GetUserByEmail(ctx context.Context, in *GetUserByEmailRequest, opts ...grpc.CallOption) (*common.User, error) {
	out := new(common.User)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/GetUserByEmail", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) IsAuthenticated(ctx context.Context, in *IsAuthenticatedRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/IsAuthenticated", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) UpdateAccountInfo(ctx context.Context, in *common.User, opts ...grpc.CallOption) (*common.User, error) {
	out := new(common.User)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/UpdateAccountInfo", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) UpdateUserInterests(ctx context.Context, in *UpdateUserInterestsRequest, opts ...grpc.CallOption) (*common.User, error) {
	out := new(common.User)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/UpdateUserInterests", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) GetUserById(ctx context.Context, in *common.GetObjectByIdRequest, opts ...grpc.CallOption) (*common.User, error) {
	out := new(common.User)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/GetUserById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) GenerateAccessToken(ctx context.Context, in *GenerateAccessTokenRequest, opts ...grpc.CallOption) (*GenerateAccessTokenResponse, error) {
	out := new(GenerateAccessTokenResponse)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/GenerateAccessToken", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) HasPermission(ctx context.Context, in *HasPermissionRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/HasPermission", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) AssignRole(ctx context.Context, in *AssignRoleRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/AssignRole", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) RemoveRole(ctx context.Context, in *RemoveRoleRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/RemoveRole", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/Ping", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AccountServiceServer is the server API for AccountService service.
// All implementations must embed UnimplementedAccountServiceServer
// for forward compatibility
type AccountServiceServer interface {
	CreateUser(context.Context, *CreateUserRequest) (*common.User, error)
	GetUserByChulaId(context.Context, *GetUserByChulaIdRequest) (*common.User, error)
	GetUserByEmail(context.Context, *GetUserByEmailRequest) (*common.User, error)
	IsAuthenticated(context.Context, *IsAuthenticatedRequest) (*wrapperspb.BoolValue, error)
	UpdateAccountInfo(context.Context, *common.User) (*common.User, error)
	UpdateUserInterests(context.Context, *UpdateUserInterestsRequest) (*common.User, error)
	GetUserById(context.Context, *common.GetObjectByIdRequest) (*common.User, error)
	GenerateAccessToken(context.Context, *GenerateAccessTokenRequest) (*GenerateAccessTokenResponse, error)
	HasPermission(context.Context, *HasPermissionRequest) (*wrapperspb.BoolValue, error)
	AssignRole(context.Context, *AssignRoleRequest) (*wrapperspb.BoolValue, error)
	RemoveRole(context.Context, *RemoveRoleRequest) (*wrapperspb.BoolValue, error)
	Ping(context.Context, *emptypb.Empty) (*wrapperspb.BoolValue, error)
	mustEmbedUnimplementedAccountServiceServer()
}

// UnimplementedAccountServiceServer must be embedded to have forward compatible implementations.
type UnimplementedAccountServiceServer struct {
}

func (UnimplementedAccountServiceServer) CreateUser(context.Context, *CreateUserRequest) (*common.User, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateUser not implemented")
}
func (UnimplementedAccountServiceServer) GetUserByChulaId(context.Context, *GetUserByChulaIdRequest) (*common.User, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetUserByChulaId not implemented")
}
func (UnimplementedAccountServiceServer) GetUserByEmail(context.Context, *GetUserByEmailRequest) (*common.User, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetUserByEmail not implemented")
}
func (UnimplementedAccountServiceServer) IsAuthenticated(context.Context, *IsAuthenticatedRequest) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IsAuthenticated not implemented")
}
func (UnimplementedAccountServiceServer) UpdateAccountInfo(context.Context, *common.User) (*common.User, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateAccountInfo not implemented")
}
func (UnimplementedAccountServiceServer) UpdateUserInterests(context.Context, *UpdateUserInterestsRequest) (*common.User, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateUserInterests not implemented")
}
func (UnimplementedAccountServiceServer) GetUserById(context.Context, *common.GetObjectByIdRequest) (*common.User, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetUserById not implemented")
}
func (UnimplementedAccountServiceServer) GenerateAccessToken(context.Context, *GenerateAccessTokenRequest) (*GenerateAccessTokenResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GenerateAccessToken not implemented")
}
func (UnimplementedAccountServiceServer) HasPermission(context.Context, *HasPermissionRequest) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method HasPermission not implemented")
}
func (UnimplementedAccountServiceServer) AssignRole(context.Context, *AssignRoleRequest) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AssignRole not implemented")
}
func (UnimplementedAccountServiceServer) RemoveRole(context.Context, *RemoveRoleRequest) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveRole not implemented")
}
func (UnimplementedAccountServiceServer) Ping(context.Context, *emptypb.Empty) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Ping not implemented")
}
func (UnimplementedAccountServiceServer) mustEmbedUnimplementedAccountServiceServer() {}

// UnsafeAccountServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to AccountServiceServer will
// result in compilation errors.
type UnsafeAccountServiceServer interface {
	mustEmbedUnimplementedAccountServiceServer()
}

func RegisterAccountServiceServer(s grpc.ServiceRegistrar, srv AccountServiceServer) {
	s.RegisterService(&AccountService_ServiceDesc, srv)
}

func _AccountService_CreateUser_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateUserRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).CreateUser(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/CreateUser",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).CreateUser(ctx, req.(*CreateUserRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_GetUserByChulaId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetUserByChulaIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).GetUserByChulaId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/GetUserByChulaId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).GetUserByChulaId(ctx, req.(*GetUserByChulaIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_GetUserByEmail_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetUserByEmailRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).GetUserByEmail(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/GetUserByEmail",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).GetUserByEmail(ctx, req.(*GetUserByEmailRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_IsAuthenticated_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IsAuthenticatedRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).IsAuthenticated(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/IsAuthenticated",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).IsAuthenticated(ctx, req.(*IsAuthenticatedRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_UpdateAccountInfo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.User)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).UpdateAccountInfo(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/UpdateAccountInfo",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).UpdateAccountInfo(ctx, req.(*common.User))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_UpdateUserInterests_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateUserInterestsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).UpdateUserInterests(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/UpdateUserInterests",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).UpdateUserInterests(ctx, req.(*UpdateUserInterestsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_GetUserById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.GetObjectByIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).GetUserById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/GetUserById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).GetUserById(ctx, req.(*common.GetObjectByIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_GenerateAccessToken_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GenerateAccessTokenRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).GenerateAccessToken(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/GenerateAccessToken",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).GenerateAccessToken(ctx, req.(*GenerateAccessTokenRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_HasPermission_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(HasPermissionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).HasPermission(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/HasPermission",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).HasPermission(ctx, req.(*HasPermissionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_AssignRole_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AssignRoleRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).AssignRole(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/AssignRole",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).AssignRole(ctx, req.(*AssignRoleRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_RemoveRole_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RemoveRoleRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).RemoveRole(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/RemoveRole",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).RemoveRole(ctx, req.(*RemoveRoleRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_Ping_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(emptypb.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).Ping(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/Ping",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).Ping(ctx, req.(*emptypb.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

// AccountService_ServiceDesc is the grpc.ServiceDesc for AccountService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var AccountService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "hts.account.AccountService",
	HandlerType: (*AccountServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateUser",
			Handler:    _AccountService_CreateUser_Handler,
		},
		{
			MethodName: "GetUserByChulaId",
			Handler:    _AccountService_GetUserByChulaId_Handler,
		},
		{
			MethodName: "GetUserByEmail",
			Handler:    _AccountService_GetUserByEmail_Handler,
		},
		{
			MethodName: "IsAuthenticated",
			Handler:    _AccountService_IsAuthenticated_Handler,
		},
		{
			MethodName: "UpdateAccountInfo",
			Handler:    _AccountService_UpdateAccountInfo_Handler,
		},
		{
			MethodName: "UpdateUserInterests",
			Handler:    _AccountService_UpdateUserInterests_Handler,
		},
		{
			MethodName: "GetUserById",
			Handler:    _AccountService_GetUserById_Handler,
		},
		{
			MethodName: "GenerateAccessToken",
			Handler:    _AccountService_GenerateAccessToken_Handler,
		},
		{
			MethodName: "HasPermission",
			Handler:    _AccountService_HasPermission_Handler,
		},
		{
			MethodName: "AssignRole",
			Handler:    _AccountService_AssignRole_Handler,
		},
		{
			MethodName: "RemoveRole",
			Handler:    _AccountService_RemoveRole_Handler,
		},
		{
			MethodName: "Ping",
			Handler:    _AccountService_Ping_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "hts/account/service.proto",
}

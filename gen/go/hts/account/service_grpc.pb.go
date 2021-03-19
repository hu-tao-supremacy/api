// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package account

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
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
	IsAuthenticated(ctx context.Context, in *IsAuthenticatedInput, opts ...grpc.CallOption) (*common.Result, error)
	UpdateAccountInfo(ctx context.Context, in *UpdateAccountInfoInput, opts ...grpc.CallOption) (*UpdateAccountInfoOutput, error)
	GenerateJWT(ctx context.Context, in *GenerateJWTInput, opts ...grpc.CallOption) (*common.Result, error)
	InvalidateJWT(ctx context.Context, in *InvalidateJWTInput, opts ...grpc.CallOption) (*common.Result, error)
	HasPermission(ctx context.Context, in *HasPermissionInput, opts ...grpc.CallOption) (*common.Result, error)
	ValidatePermission(ctx context.Context, in *HasPermissionInput, opts ...grpc.CallOption) (*emptypb.Empty, error)
	Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*common.Result, error)
}

type accountServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewAccountServiceClient(cc grpc.ClientConnInterface) AccountServiceClient {
	return &accountServiceClient{cc}
}

func (c *accountServiceClient) IsAuthenticated(ctx context.Context, in *IsAuthenticatedInput, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/IsAuthenticated", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) UpdateAccountInfo(ctx context.Context, in *UpdateAccountInfoInput, opts ...grpc.CallOption) (*UpdateAccountInfoOutput, error) {
	out := new(UpdateAccountInfoOutput)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/UpdateAccountInfo", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) GenerateJWT(ctx context.Context, in *GenerateJWTInput, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/GenerateJWT", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) InvalidateJWT(ctx context.Context, in *InvalidateJWTInput, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/InvalidateJWT", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) HasPermission(ctx context.Context, in *HasPermissionInput, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/HasPermission", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) ValidatePermission(ctx context.Context, in *HasPermissionInput, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.account.AccountService/ValidatePermission", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
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
	IsAuthenticated(context.Context, *IsAuthenticatedInput) (*common.Result, error)
	UpdateAccountInfo(context.Context, *UpdateAccountInfoInput) (*UpdateAccountInfoOutput, error)
	GenerateJWT(context.Context, *GenerateJWTInput) (*common.Result, error)
	InvalidateJWT(context.Context, *InvalidateJWTInput) (*common.Result, error)
	HasPermission(context.Context, *HasPermissionInput) (*common.Result, error)
	ValidatePermission(context.Context, *HasPermissionInput) (*emptypb.Empty, error)
	Ping(context.Context, *emptypb.Empty) (*common.Result, error)
	mustEmbedUnimplementedAccountServiceServer()
}

// UnimplementedAccountServiceServer must be embedded to have forward compatible implementations.
type UnimplementedAccountServiceServer struct {
}

func (UnimplementedAccountServiceServer) IsAuthenticated(context.Context, *IsAuthenticatedInput) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IsAuthenticated not implemented")
}
func (UnimplementedAccountServiceServer) UpdateAccountInfo(context.Context, *UpdateAccountInfoInput) (*UpdateAccountInfoOutput, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateAccountInfo not implemented")
}
func (UnimplementedAccountServiceServer) GenerateJWT(context.Context, *GenerateJWTInput) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GenerateJWT not implemented")
}
func (UnimplementedAccountServiceServer) InvalidateJWT(context.Context, *InvalidateJWTInput) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method InvalidateJWT not implemented")
}
func (UnimplementedAccountServiceServer) HasPermission(context.Context, *HasPermissionInput) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method HasPermission not implemented")
}
func (UnimplementedAccountServiceServer) ValidatePermission(context.Context, *HasPermissionInput) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ValidatePermission not implemented")
}
func (UnimplementedAccountServiceServer) Ping(context.Context, *emptypb.Empty) (*common.Result, error) {
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

func _AccountService_IsAuthenticated_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IsAuthenticatedInput)
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
		return srv.(AccountServiceServer).IsAuthenticated(ctx, req.(*IsAuthenticatedInput))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_UpdateAccountInfo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateAccountInfoInput)
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
		return srv.(AccountServiceServer).UpdateAccountInfo(ctx, req.(*UpdateAccountInfoInput))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_GenerateJWT_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GenerateJWTInput)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).GenerateJWT(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/GenerateJWT",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).GenerateJWT(ctx, req.(*GenerateJWTInput))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_InvalidateJWT_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(InvalidateJWTInput)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).InvalidateJWT(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/InvalidateJWT",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).InvalidateJWT(ctx, req.(*InvalidateJWTInput))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_HasPermission_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(HasPermissionInput)
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
		return srv.(AccountServiceServer).HasPermission(ctx, req.(*HasPermissionInput))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_ValidatePermission_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(HasPermissionInput)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).ValidatePermission(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.account.AccountService/ValidatePermission",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).ValidatePermission(ctx, req.(*HasPermissionInput))
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
			MethodName: "IsAuthenticated",
			Handler:    _AccountService_IsAuthenticated_Handler,
		},
		{
			MethodName: "UpdateAccountInfo",
			Handler:    _AccountService_UpdateAccountInfo_Handler,
		},
		{
			MethodName: "GenerateJWT",
			Handler:    _AccountService_GenerateJWT_Handler,
		},
		{
			MethodName: "InvalidateJWT",
			Handler:    _AccountService_InvalidateJWT_Handler,
		},
		{
			MethodName: "HasPermission",
			Handler:    _AccountService_HasPermission_Handler,
		},
		{
			MethodName: "ValidatePermission",
			Handler:    _AccountService_ValidatePermission_Handler,
		},
		{
			MethodName: "Ping",
			Handler:    _AccountService_Ping_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "hts/account/service.proto",
}

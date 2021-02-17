// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.23.0
// 	protoc        v3.13.0
// source: hts/account/service.proto

package account

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	common "onepass.app/organizer/hts/common"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

type IsAuthenticatedRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	AccessToken string `protobuf:"bytes,1,opt,name=access_token,json=accessToken,proto3" json:"access_token,omitempty"`
}

func (x *IsAuthenticatedRequest) Reset() {
	*x = IsAuthenticatedRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IsAuthenticatedRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IsAuthenticatedRequest) ProtoMessage() {}

func (x *IsAuthenticatedRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IsAuthenticatedRequest.ProtoReflect.Descriptor instead.
func (*IsAuthenticatedRequest) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{0}
}

func (x *IsAuthenticatedRequest) GetAccessToken() string {
	if x != nil {
		return x.AccessToken
	}
	return ""
}

type UpdateAccountInfoRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	User *common.User `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
}

func (x *UpdateAccountInfoRequest) Reset() {
	*x = UpdateAccountInfoRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateAccountInfoRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateAccountInfoRequest) ProtoMessage() {}

func (x *UpdateAccountInfoRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateAccountInfoRequest.ProtoReflect.Descriptor instead.
func (*UpdateAccountInfoRequest) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{1}
}

func (x *UpdateAccountInfoRequest) GetUser() *common.User {
	if x != nil {
		return x.User
	}
	return nil
}

type UpdateAccountInfoResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	User *common.User `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
}

func (x *UpdateAccountInfoResponse) Reset() {
	*x = UpdateAccountInfoResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateAccountInfoResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateAccountInfoResponse) ProtoMessage() {}

func (x *UpdateAccountInfoResponse) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateAccountInfoResponse.ProtoReflect.Descriptor instead.
func (*UpdateAccountInfoResponse) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{2}
}

func (x *UpdateAccountInfoResponse) GetUser() *common.User {
	if x != nil {
		return x.User
	}
	return nil
}

type GenerateJWTRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	User *common.User `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
}

func (x *GenerateJWTRequest) Reset() {
	*x = GenerateJWTRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateJWTRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateJWTRequest) ProtoMessage() {}

func (x *GenerateJWTRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateJWTRequest.ProtoReflect.Descriptor instead.
func (*GenerateJWTRequest) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{3}
}

func (x *GenerateJWTRequest) GetUser() *common.User {
	if x != nil {
		return x.User
	}
	return nil
}

type InvalidateJWTRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	AccessToken string `protobuf:"bytes,1,opt,name=access_token,json=accessToken,proto3" json:"access_token,omitempty"`
}

func (x *InvalidateJWTRequest) Reset() {
	*x = InvalidateJWTRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InvalidateJWTRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InvalidateJWTRequest) ProtoMessage() {}

func (x *InvalidateJWTRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InvalidateJWTRequest.ProtoReflect.Descriptor instead.
func (*InvalidateJWTRequest) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{4}
}

func (x *InvalidateJWTRequest) GetAccessToken() string {
	if x != nil {
		return x.AccessToken
	}
	return ""
}

type HasPermissionRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId         int64  `protobuf:"varint,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	OrganizationId int64  `protobuf:"varint,2,opt,name=organization_id,json=organizationId,proto3" json:"organization_id,omitempty"`
	PermissionName string `protobuf:"bytes,3,opt,name=permission_name,json=permissionName,proto3" json:"permission_name,omitempty"`
}

func (x *HasPermissionRequest) Reset() {
	*x = HasPermissionRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *HasPermissionRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*HasPermissionRequest) ProtoMessage() {}

func (x *HasPermissionRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use HasPermissionRequest.ProtoReflect.Descriptor instead.
func (*HasPermissionRequest) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{5}
}

func (x *HasPermissionRequest) GetUserId() int64 {
	if x != nil {
		return x.UserId
	}
	return 0
}

func (x *HasPermissionRequest) GetOrganizationId() int64 {
	if x != nil {
		return x.OrganizationId
	}
	return 0
}

func (x *HasPermissionRequest) GetPermissionName() string {
	if x != nil {
		return x.PermissionName
	}
	return ""
}

var File_hts_account_service_proto protoreflect.FileDescriptor

var file_hts_account_service_proto_rawDesc = []byte{
	0x0a, 0x19, 0x68, 0x74, 0x73, 0x2f, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2f, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x68, 0x74, 0x73,
	0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x1a, 0x17, 0x68, 0x74, 0x73, 0x2f, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0x3b, 0x0a, 0x16, 0x49, 0x73, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63,
	0x61, 0x74, 0x65, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x21, 0x0a, 0x0c, 0x61,
	0x63, 0x63, 0x65, 0x73, 0x73, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0b, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x22, 0x40,
	0x0a, 0x18, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x49,
	0x6e, 0x66, 0x6f, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x24, 0x0a, 0x04, 0x75, 0x73,
	0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72,
	0x22, 0x41, 0x0a, 0x19, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e,
	0x74, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x24, 0x0a,
	0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x68, 0x74,
	0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x04, 0x75,
	0x73, 0x65, 0x72, 0x22, 0x3a, 0x0a, 0x12, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x4a,
	0x57, 0x54, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x24, 0x0a, 0x04, 0x75, 0x73, 0x65,
	0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x22,
	0x39, 0x0a, 0x14, 0x49, 0x6e, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4a, 0x57, 0x54,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x21, 0x0a, 0x0c, 0x61, 0x63, 0x63, 0x65, 0x73,
	0x73, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x61,
	0x63, 0x63, 0x65, 0x73, 0x73, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x22, 0x81, 0x01, 0x0a, 0x14, 0x48,
	0x61, 0x73, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x17, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x27, 0x0a, 0x0f,
	0x6f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x7a, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0e, 0x6f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x7a, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x49, 0x64, 0x12, 0x27, 0x0a, 0x0f, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73,
	0x69, 0x6f, 0x6e, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e,
	0x70, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x4e, 0x61, 0x6d, 0x65, 0x32, 0x94,
	0x03, 0x0a, 0x0e, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x12, 0x4a, 0x0a, 0x0f, 0x49, 0x73, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63,
	0x61, 0x74, 0x65, 0x64, 0x12, 0x23, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75,
	0x6e, 0x74, 0x2e, 0x49, 0x73, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74,
	0x65, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x62, 0x0a,
	0x11, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x49, 0x6e,
	0x66, 0x6f, 0x12, 0x25, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74,
	0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x49, 0x6e,
	0x66, 0x6f, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x26, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41, 0x63,
	0x63, 0x6f, 0x75, 0x6e, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x12, 0x42, 0x0a, 0x0b, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x4a, 0x57, 0x54,
	0x12, 0x1f, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x47,
	0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x4a, 0x57, 0x54, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x12, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52,
	0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x46, 0x0a, 0x0d, 0x49, 0x6e, 0x76, 0x61, 0x6c, 0x69, 0x64,
	0x61, 0x74, 0x65, 0x4a, 0x57, 0x54, 0x12, 0x21, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x61, 0x63, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x49, 0x6e, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4a,
	0x57, 0x54, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x46, 0x0a,
	0x0d, 0x48, 0x61, 0x73, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x21,
	0x2e, 0x68, 0x74, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x48, 0x61, 0x73,
	0x50, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x12, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52,
	0x65, 0x73, 0x75, 0x6c, 0x74, 0x42, 0x45, 0x0a, 0x10, 0x61, 0x70, 0x70, 0x2e, 0x6f, 0x6e, 0x65,
	0x70, 0x61, 0x73, 0x73, 0x2e, 0x61, 0x70, 0x69, 0x73, 0x42, 0x0c, 0x41, 0x63, 0x63, 0x6f, 0x75,
	0x6e, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x21, 0x6f, 0x6e, 0x65, 0x70, 0x61,
	0x73, 0x73, 0x2e, 0x61, 0x70, 0x70, 0x2f, 0x6f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x7a, 0x65, 0x72,
	0x2f, 0x68, 0x74, 0x73, 0x2f, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_hts_account_service_proto_rawDescOnce sync.Once
	file_hts_account_service_proto_rawDescData = file_hts_account_service_proto_rawDesc
)

func file_hts_account_service_proto_rawDescGZIP() []byte {
	file_hts_account_service_proto_rawDescOnce.Do(func() {
		file_hts_account_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_hts_account_service_proto_rawDescData)
	})
	return file_hts_account_service_proto_rawDescData
}

var file_hts_account_service_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_hts_account_service_proto_goTypes = []interface{}{
	(*IsAuthenticatedRequest)(nil),    // 0: hts.account.IsAuthenticatedRequest
	(*UpdateAccountInfoRequest)(nil),  // 1: hts.account.UpdateAccountInfoRequest
	(*UpdateAccountInfoResponse)(nil), // 2: hts.account.UpdateAccountInfoResponse
	(*GenerateJWTRequest)(nil),        // 3: hts.account.GenerateJWTRequest
	(*InvalidateJWTRequest)(nil),      // 4: hts.account.InvalidateJWTRequest
	(*HasPermissionRequest)(nil),      // 5: hts.account.HasPermissionRequest
	(*common.User)(nil),               // 6: hts.common.User
	(*common.Result)(nil),             // 7: hts.common.Result
}
var file_hts_account_service_proto_depIdxs = []int32{
	6, // 0: hts.account.UpdateAccountInfoRequest.user:type_name -> hts.common.User
	6, // 1: hts.account.UpdateAccountInfoResponse.user:type_name -> hts.common.User
	6, // 2: hts.account.GenerateJWTRequest.user:type_name -> hts.common.User
	0, // 3: hts.account.AccountService.IsAuthenticated:input_type -> hts.account.IsAuthenticatedRequest
	1, // 4: hts.account.AccountService.UpdateAccountInfo:input_type -> hts.account.UpdateAccountInfoRequest
	3, // 5: hts.account.AccountService.GenerateJWT:input_type -> hts.account.GenerateJWTRequest
	4, // 6: hts.account.AccountService.InvalidateJWT:input_type -> hts.account.InvalidateJWTRequest
	5, // 7: hts.account.AccountService.HasPermission:input_type -> hts.account.HasPermissionRequest
	7, // 8: hts.account.AccountService.IsAuthenticated:output_type -> hts.common.Result
	2, // 9: hts.account.AccountService.UpdateAccountInfo:output_type -> hts.account.UpdateAccountInfoResponse
	7, // 10: hts.account.AccountService.GenerateJWT:output_type -> hts.common.Result
	7, // 11: hts.account.AccountService.InvalidateJWT:output_type -> hts.common.Result
	7, // 12: hts.account.AccountService.HasPermission:output_type -> hts.common.Result
	8, // [8:13] is the sub-list for method output_type
	3, // [3:8] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_hts_account_service_proto_init() }
func file_hts_account_service_proto_init() {
	if File_hts_account_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_hts_account_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IsAuthenticatedRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateAccountInfoRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateAccountInfoResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateJWTRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InvalidateJWTRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*HasPermissionRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_hts_account_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_hts_account_service_proto_goTypes,
		DependencyIndexes: file_hts_account_service_proto_depIdxs,
		MessageInfos:      file_hts_account_service_proto_msgTypes,
	}.Build()
	File_hts_account_service_proto = out.File
	file_hts_account_service_proto_rawDesc = nil
	file_hts_account_service_proto_goTypes = nil
	file_hts_account_service_proto_depIdxs = nil
}

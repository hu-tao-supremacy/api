// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.15.3
// source: hts/participant/service.proto

package participant

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
	common "onepass.app/facility/hts/common"
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

type GenerateQRRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserEvent *common.UserEvent `protobuf:"bytes,1,opt,name=user_event,json=userEvent,proto3" json:"user_event,omitempty"`
}

func (x *GenerateQRRequest) Reset() {
	*x = GenerateQRRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateQRRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateQRRequest) ProtoMessage() {}

func (x *GenerateQRRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateQRRequest.ProtoReflect.Descriptor instead.
func (*GenerateQRRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{0}
}

func (x *GenerateQRRequest) GetUserEvent() *common.UserEvent {
	if x != nil {
		return x.UserEvent
	}
	return nil
}

type GetEventRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	EventId int64 `protobuf:"varint,1,opt,name=event_id,json=eventId,proto3" json:"event_id,omitempty"`
}

func (x *GetEventRequest) Reset() {
	*x = GetEventRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetEventRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetEventRequest) ProtoMessage() {}

func (x *GetEventRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetEventRequest.ProtoReflect.Descriptor instead.
func (*GetEventRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{1}
}

func (x *GetEventRequest) GetEventId() int64 {
	if x != nil {
		return x.EventId
	}
	return 0
}

type StringInputRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Text string `protobuf:"bytes,1,opt,name=text,proto3" json:"text,omitempty"`
}

func (x *StringInputRequest) Reset() {
	*x = StringInputRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StringInputRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StringInputRequest) ProtoMessage() {}

func (x *StringInputRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StringInputRequest.ProtoReflect.Descriptor instead.
func (*StringInputRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{2}
}

func (x *StringInputRequest) GetText() string {
	if x != nil {
		return x.Text
	}
	return ""
}

type UserWithEventRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	User  *common.User  `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
	Event *common.Event `protobuf:"bytes,2,opt,name=event,proto3" json:"event,omitempty"`
}

func (x *UserWithEventRequest) Reset() {
	*x = UserWithEventRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserWithEventRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserWithEventRequest) ProtoMessage() {}

func (x *UserWithEventRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserWithEventRequest.ProtoReflect.Descriptor instead.
func (*UserWithEventRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{3}
}

func (x *UserWithEventRequest) GetUser() *common.User {
	if x != nil {
		return x.User
	}
	return nil
}

func (x *UserWithEventRequest) GetEvent() *common.Event {
	if x != nil {
		return x.Event
	}
	return nil
}

type CreateFeedbackRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	User     *common.User          `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
	Feedback *common.EventFeedback `protobuf:"bytes,2,opt,name=feedback,proto3" json:"feedback,omitempty"`
}

func (x *CreateFeedbackRequest) Reset() {
	*x = CreateFeedbackRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateFeedbackRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateFeedbackRequest) ProtoMessage() {}

func (x *CreateFeedbackRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateFeedbackRequest.ProtoReflect.Descriptor instead.
func (*CreateFeedbackRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{4}
}

func (x *CreateFeedbackRequest) GetUser() *common.User {
	if x != nil {
		return x.User
	}
	return nil
}

func (x *CreateFeedbackRequest) GetFeedback() *common.EventFeedback {
	if x != nil {
		return x.Feedback
	}
	return nil
}

type GenerateQRResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Data string `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *GenerateQRResponse) Reset() {
	*x = GenerateQRResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateQRResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateQRResponse) ProtoMessage() {}

func (x *GenerateQRResponse) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateQRResponse.ProtoReflect.Descriptor instead.
func (*GenerateQRResponse) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{5}
}

func (x *GenerateQRResponse) GetData() string {
	if x != nil {
		return x.Data
	}
	return ""
}

type GetFeedbacksFromEventResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	EventFeedback []*common.EventFeedback `protobuf:"bytes,1,rep,name=event_feedback,json=eventFeedback,proto3" json:"event_feedback,omitempty"`
}

func (x *GetFeedbacksFromEventResponse) Reset() {
	*x = GetFeedbacksFromEventResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetFeedbacksFromEventResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetFeedbacksFromEventResponse) ProtoMessage() {}

func (x *GetFeedbacksFromEventResponse) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetFeedbacksFromEventResponse.ProtoReflect.Descriptor instead.
func (*GetFeedbacksFromEventResponse) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{6}
}

func (x *GetFeedbacksFromEventResponse) GetEventFeedback() []*common.EventFeedback {
	if x != nil {
		return x.EventFeedback
	}
	return nil
}

type EventsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Event []*common.Event `protobuf:"bytes,1,rep,name=event,proto3" json:"event,omitempty"`
}

func (x *EventsResponse) Reset() {
	*x = EventsResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *EventsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*EventsResponse) ProtoMessage() {}

func (x *EventsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use EventsResponse.ProtoReflect.Descriptor instead.
func (*EventsResponse) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{7}
}

func (x *EventsResponse) GetEvent() []*common.Event {
	if x != nil {
		return x.Event
	}
	return nil
}

type IsEventAvailableRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Event *common.Event          `protobuf:"bytes,1,opt,name=event,proto3" json:"event,omitempty"`
	Date  *timestamppb.Timestamp `protobuf:"bytes,2,opt,name=date,proto3" json:"date,omitempty"`
}

func (x *IsEventAvailableRequest) Reset() {
	*x = IsEventAvailableRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IsEventAvailableRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IsEventAvailableRequest) ProtoMessage() {}

func (x *IsEventAvailableRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IsEventAvailableRequest.ProtoReflect.Descriptor instead.
func (*IsEventAvailableRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{8}
}

func (x *IsEventAvailableRequest) GetEvent() *common.Event {
	if x != nil {
		return x.Event
	}
	return nil
}

func (x *IsEventAvailableRequest) GetDate() *timestamppb.Timestamp {
	if x != nil {
		return x.Date
	}
	return nil
}

var File_hts_participant_service_proto protoreflect.FileDescriptor

var file_hts_participant_service_proto_rawDesc = []byte{
	0x0a, 0x1d, 0x68, 0x74, 0x73, 0x2f, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e,
	0x74, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x0f, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74,
	0x1a, 0x17, 0x68, 0x74, 0x73, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d,
	0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x49, 0x0a, 0x11, 0x47, 0x65, 0x6e, 0x65, 0x72,
	0x61, 0x74, 0x65, 0x51, 0x52, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x34, 0x0a, 0x0a,
	0x75, 0x73, 0x65, 0x72, 0x5f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x15, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73,
	0x65, 0x72, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x09, 0x75, 0x73, 0x65, 0x72, 0x45, 0x76, 0x65,
	0x6e, 0x74, 0x22, 0x2c, 0x0a, 0x0f, 0x47, 0x65, 0x74, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x19, 0x0a, 0x08, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x69,
	0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x07, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x49, 0x64,
	0x22, 0x28, 0x0a, 0x12, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x49, 0x6e, 0x70, 0x75, 0x74, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x65, 0x78, 0x74, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x65, 0x78, 0x74, 0x22, 0x65, 0x0a, 0x14, 0x55, 0x73,
	0x65, 0x72, 0x57, 0x69, 0x74, 0x68, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x12, 0x24, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73,
	0x65, 0x72, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x27, 0x0a, 0x05, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x05, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x22, 0x74, 0x0a, 0x15, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64, 0x62,
	0x61, 0x63, 0x6b, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x24, 0x0a, 0x04, 0x75, 0x73,
	0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72,
	0x12, 0x35, 0x0a, 0x08, 0x66, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x19, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e,
	0x45, 0x76, 0x65, 0x6e, 0x74, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x52, 0x08, 0x66,
	0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x22, 0x28, 0x0a, 0x12, 0x47, 0x65, 0x6e, 0x65, 0x72,
	0x61, 0x74, 0x65, 0x51, 0x52, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x12, 0x0a,
	0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x64, 0x61, 0x74,
	0x61, 0x22, 0x61, 0x0a, 0x1d, 0x47, 0x65, 0x74, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b,
	0x73, 0x46, 0x72, 0x6f, 0x6d, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x12, 0x40, 0x0a, 0x0e, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x66, 0x65, 0x65, 0x64,
	0x62, 0x61, 0x63, 0x6b, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x68, 0x74, 0x73,
	0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x46, 0x65, 0x65,
	0x64, 0x62, 0x61, 0x63, 0x6b, 0x52, 0x0d, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x46, 0x65, 0x65, 0x64,
	0x62, 0x61, 0x63, 0x6b, 0x22, 0x39, 0x0a, 0x0e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x27, 0x0a, 0x05, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x18,
	0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x05, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x22,
	0x72, 0x0a, 0x17, 0x49, 0x73, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61,
	0x62, 0x6c, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x27, 0x0a, 0x05, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x05, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x12, 0x2e, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x04, 0x64,
	0x61, 0x74, 0x65, 0x32, 0x9d, 0x0b, 0x0a, 0x12, 0x50, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70,
	0x61, 0x6e, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x50, 0x0a, 0x10, 0x49, 0x73,
	0x45, 0x76, 0x65, 0x6e, 0x74, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x6c, 0x65, 0x12, 0x28,
	0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74,
	0x2e, 0x49, 0x73, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x6c,
	0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x45, 0x0a, 0x09,
	0x4a, 0x6f, 0x69, 0x6e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x25, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x55, 0x73, 0x65, 0x72,
	0x57, 0x69, 0x74, 0x68, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x11, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76,
	0x65, 0x6e, 0x74, 0x12, 0x47, 0x0a, 0x0b, 0x43, 0x61, 0x6e, 0x63, 0x65, 0x6c, 0x45, 0x76, 0x65,
	0x6e, 0x74, 0x12, 0x25, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69,
	0x70, 0x61, 0x6e, 0x74, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x57, 0x69, 0x74, 0x68, 0x45, 0x76, 0x65,
	0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x11, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x53, 0x0a, 0x0e,
	0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x12, 0x26,
	0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74,
	0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x19, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63,
	0x6b, 0x12, 0x55, 0x0a, 0x11, 0x48, 0x61, 0x73, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x46, 0x65,
	0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x12, 0x25, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72,
	0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x57, 0x69, 0x74,
	0x68, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x19, 0x2e,
	0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74,
	0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x12, 0x46, 0x0a, 0x0e, 0x52, 0x65, 0x6d, 0x6f,
	0x76, 0x65, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x12, 0x19, 0x2e, 0x68, 0x74, 0x73,
	0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x46, 0x65, 0x65,
	0x64, 0x62, 0x61, 0x63, 0x6b, 0x1a, 0x19, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b,
	0x12, 0x5a, 0x0a, 0x15, 0x47, 0x65, 0x74, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x73,
	0x46, 0x72, 0x6f, 0x6d, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x11, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x1a, 0x2e, 0x2e, 0x68,
	0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x47,
	0x65, 0x74, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x73, 0x46, 0x72, 0x6f, 0x6d, 0x45,
	0x76, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x5c, 0x0a, 0x18,
	0x47, 0x65, 0x74, 0x55, 0x73, 0x65, 0x72, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x46,
	0x72, 0x6f, 0x6d, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x25, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70,
	0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x57,
	0x69, 0x74, 0x68, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x19, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65,
	0x6e, 0x74, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x12, 0x3f, 0x0a, 0x08, 0x47, 0x65,
	0x74, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x20, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72,
	0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x47, 0x65, 0x74, 0x45, 0x76, 0x65, 0x6e,
	0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x11, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x47, 0x0a, 0x0c, 0x47,
	0x65, 0x74, 0x41, 0x6c, 0x6c, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x12, 0x16, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d,
	0x70, 0x74, 0x79, 0x1a, 0x1f, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63,
	0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x4d, 0x0a, 0x12, 0x47, 0x65, 0x74, 0x53, 0x75, 0x67, 0x67, 0x65,
	0x73, 0x74, 0x65, 0x64, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x12, 0x16, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70,
	0x74, 0x79, 0x1a, 0x1f, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69,
	0x70, 0x61, 0x6e, 0x74, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x12, 0x5f, 0x0a, 0x17, 0x47, 0x65, 0x74, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73,
	0x42, 0x79, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x4f, 0x66, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x23,
	0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74,
	0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x49, 0x6e, 0x70, 0x75, 0x74, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x1a, 0x1f, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63,
	0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x42, 0x0a, 0x0e, 0x47, 0x65, 0x74, 0x45, 0x76, 0x65, 0x6e, 0x74,
	0x73, 0x42, 0x79, 0x54, 0x61, 0x67, 0x12, 0x0f, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x54, 0x61, 0x67, 0x1a, 0x1f, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61,
	0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x54, 0x0a, 0x17, 0x47, 0x65, 0x74, 0x45,
	0x76, 0x65, 0x6e, 0x74, 0x73, 0x42, 0x79, 0x4f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x7a, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x12, 0x18, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2e, 0x4f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x7a, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x1a, 0x1f, 0x2e,
	0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e,
	0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x4c,
	0x0a, 0x13, 0x47, 0x65, 0x74, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x42, 0x79, 0x46, 0x61, 0x63,
	0x69, 0x6c, 0x69, 0x74, 0x79, 0x12, 0x14, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x2e, 0x46, 0x61, 0x63, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x1a, 0x1f, 0x2e, 0x68, 0x74,
	0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x45, 0x76,
	0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x57, 0x0a, 0x0f,
	0x47, 0x65, 0x74, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x42, 0x79, 0x44, 0x61, 0x74, 0x65, 0x12,
	0x23, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e,
	0x74, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x49, 0x6e, 0x70, 0x75, 0x74, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x1f, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69,
	0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x48, 0x0a, 0x0a, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74,
	0x65, 0x51, 0x52, 0x12, 0x15, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2e, 0x55, 0x73, 0x65, 0x72, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x1a, 0x23, 0x2e, 0x68, 0x74, 0x73,
	0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x47, 0x65, 0x6e,
	0x65, 0x72, 0x61, 0x74, 0x65, 0x51, 0x52, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12,
	0x32, 0x0a, 0x04, 0x50, 0x69, 0x6e, 0x67, 0x12, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x1a,
	0x12, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52, 0x65, 0x73,
	0x75, 0x6c, 0x74, 0x42, 0x4c, 0x0a, 0x10, 0x61, 0x70, 0x70, 0x2e, 0x6f, 0x6e, 0x65, 0x70, 0x61,
	0x73, 0x73, 0x2e, 0x61, 0x70, 0x69, 0x73, 0x42, 0x10, 0x50, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69,
	0x70, 0x61, 0x6e, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x24, 0x6f, 0x6e, 0x65,
	0x70, 0x61, 0x73, 0x73, 0x2e, 0x61, 0x70, 0x70, 0x2f, 0x66, 0x61, 0x63, 0x69, 0x6c, 0x69, 0x74,
	0x79, 0x2f, 0x68, 0x74, 0x73, 0x2f, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e,
	0x74, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_hts_participant_service_proto_rawDescOnce sync.Once
	file_hts_participant_service_proto_rawDescData = file_hts_participant_service_proto_rawDesc
)

func file_hts_participant_service_proto_rawDescGZIP() []byte {
	file_hts_participant_service_proto_rawDescOnce.Do(func() {
		file_hts_participant_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_hts_participant_service_proto_rawDescData)
	})
	return file_hts_participant_service_proto_rawDescData
}

var file_hts_participant_service_proto_msgTypes = make([]protoimpl.MessageInfo, 9)
var file_hts_participant_service_proto_goTypes = []interface{}{
	(*GenerateQRRequest)(nil),             // 0: hts.participant.GenerateQRRequest
	(*GetEventRequest)(nil),               // 1: hts.participant.GetEventRequest
	(*StringInputRequest)(nil),            // 2: hts.participant.StringInputRequest
	(*UserWithEventRequest)(nil),          // 3: hts.participant.UserWithEventRequest
	(*CreateFeedbackRequest)(nil),         // 4: hts.participant.CreateFeedbackRequest
	(*GenerateQRResponse)(nil),            // 5: hts.participant.GenerateQRResponse
	(*GetFeedbacksFromEventResponse)(nil), // 6: hts.participant.GetFeedbacksFromEventResponse
	(*EventsResponse)(nil),                // 7: hts.participant.EventsResponse
	(*IsEventAvailableRequest)(nil),       // 8: hts.participant.IsEventAvailableRequest
	(*common.UserEvent)(nil),              // 9: hts.common.UserEvent
	(*common.User)(nil),                   // 10: hts.common.User
	(*common.Event)(nil),                  // 11: hts.common.Event
	(*common.EventFeedback)(nil),          // 12: hts.common.EventFeedback
	(*timestamppb.Timestamp)(nil),         // 13: google.protobuf.Timestamp
	(*emptypb.Empty)(nil),                 // 14: google.protobuf.Empty
	(*common.Tag)(nil),                    // 15: hts.common.Tag
	(*common.Organization)(nil),           // 16: hts.common.Organization
	(*common.Facility)(nil),               // 17: hts.common.Facility
	(*common.Result)(nil),                 // 18: hts.common.Result
}
var file_hts_participant_service_proto_depIdxs = []int32{
	9,  // 0: hts.participant.GenerateQRRequest.user_event:type_name -> hts.common.UserEvent
	10, // 1: hts.participant.UserWithEventRequest.user:type_name -> hts.common.User
	11, // 2: hts.participant.UserWithEventRequest.event:type_name -> hts.common.Event
	10, // 3: hts.participant.CreateFeedbackRequest.user:type_name -> hts.common.User
	12, // 4: hts.participant.CreateFeedbackRequest.feedback:type_name -> hts.common.EventFeedback
	12, // 5: hts.participant.GetFeedbacksFromEventResponse.event_feedback:type_name -> hts.common.EventFeedback
	11, // 6: hts.participant.EventsResponse.event:type_name -> hts.common.Event
	11, // 7: hts.participant.IsEventAvailableRequest.event:type_name -> hts.common.Event
	13, // 8: hts.participant.IsEventAvailableRequest.date:type_name -> google.protobuf.Timestamp
	8,  // 9: hts.participant.ParticipantService.IsEventAvailable:input_type -> hts.participant.IsEventAvailableRequest
	3,  // 10: hts.participant.ParticipantService.JoinEvent:input_type -> hts.participant.UserWithEventRequest
	3,  // 11: hts.participant.ParticipantService.CancelEvent:input_type -> hts.participant.UserWithEventRequest
	4,  // 12: hts.participant.ParticipantService.CreateFeedback:input_type -> hts.participant.CreateFeedbackRequest
	3,  // 13: hts.participant.ParticipantService.HasSubmitFeedback:input_type -> hts.participant.UserWithEventRequest
	12, // 14: hts.participant.ParticipantService.RemoveFeedback:input_type -> hts.common.EventFeedback
	11, // 15: hts.participant.ParticipantService.GetFeedbacksFromEvent:input_type -> hts.common.Event
	3,  // 16: hts.participant.ParticipantService.GetUserFeedbackFromEvent:input_type -> hts.participant.UserWithEventRequest
	1,  // 17: hts.participant.ParticipantService.GetEvent:input_type -> hts.participant.GetEventRequest
	14, // 18: hts.participant.ParticipantService.GetAllEvents:input_type -> google.protobuf.Empty
	14, // 19: hts.participant.ParticipantService.GetSuggestedEvents:input_type -> google.protobuf.Empty
	2,  // 20: hts.participant.ParticipantService.GetEventsByStringOfName:input_type -> hts.participant.StringInputRequest
	15, // 21: hts.participant.ParticipantService.GetEventsByTag:input_type -> hts.common.Tag
	16, // 22: hts.participant.ParticipantService.GetEventsByOrganization:input_type -> hts.common.Organization
	17, // 23: hts.participant.ParticipantService.GetEventsByFacility:input_type -> hts.common.Facility
	2,  // 24: hts.participant.ParticipantService.GetEventsByDate:input_type -> hts.participant.StringInputRequest
	9,  // 25: hts.participant.ParticipantService.GenerateQR:input_type -> hts.common.UserEvent
	14, // 26: hts.participant.ParticipantService.Ping:input_type -> google.protobuf.Empty
	18, // 27: hts.participant.ParticipantService.IsEventAvailable:output_type -> hts.common.Result
	11, // 28: hts.participant.ParticipantService.JoinEvent:output_type -> hts.common.Event
	11, // 29: hts.participant.ParticipantService.CancelEvent:output_type -> hts.common.Event
	12, // 30: hts.participant.ParticipantService.CreateFeedback:output_type -> hts.common.EventFeedback
	12, // 31: hts.participant.ParticipantService.HasSubmitFeedback:output_type -> hts.common.EventFeedback
	12, // 32: hts.participant.ParticipantService.RemoveFeedback:output_type -> hts.common.EventFeedback
	6,  // 33: hts.participant.ParticipantService.GetFeedbacksFromEvent:output_type -> hts.participant.GetFeedbacksFromEventResponse
	12, // 34: hts.participant.ParticipantService.GetUserFeedbackFromEvent:output_type -> hts.common.EventFeedback
	11, // 35: hts.participant.ParticipantService.GetEvent:output_type -> hts.common.Event
	7,  // 36: hts.participant.ParticipantService.GetAllEvents:output_type -> hts.participant.EventsResponse
	7,  // 37: hts.participant.ParticipantService.GetSuggestedEvents:output_type -> hts.participant.EventsResponse
	7,  // 38: hts.participant.ParticipantService.GetEventsByStringOfName:output_type -> hts.participant.EventsResponse
	7,  // 39: hts.participant.ParticipantService.GetEventsByTag:output_type -> hts.participant.EventsResponse
	7,  // 40: hts.participant.ParticipantService.GetEventsByOrganization:output_type -> hts.participant.EventsResponse
	7,  // 41: hts.participant.ParticipantService.GetEventsByFacility:output_type -> hts.participant.EventsResponse
	7,  // 42: hts.participant.ParticipantService.GetEventsByDate:output_type -> hts.participant.EventsResponse
	5,  // 43: hts.participant.ParticipantService.GenerateQR:output_type -> hts.participant.GenerateQRResponse
	18, // 44: hts.participant.ParticipantService.Ping:output_type -> hts.common.Result
	27, // [27:45] is the sub-list for method output_type
	9,  // [9:27] is the sub-list for method input_type
	9,  // [9:9] is the sub-list for extension type_name
	9,  // [9:9] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_hts_participant_service_proto_init() }
func file_hts_participant_service_proto_init() {
	if File_hts_participant_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_hts_participant_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateQRRequest); i {
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
		file_hts_participant_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetEventRequest); i {
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
		file_hts_participant_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StringInputRequest); i {
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
		file_hts_participant_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserWithEventRequest); i {
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
		file_hts_participant_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateFeedbackRequest); i {
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
		file_hts_participant_service_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateQRResponse); i {
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
		file_hts_participant_service_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetFeedbacksFromEventResponse); i {
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
		file_hts_participant_service_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*EventsResponse); i {
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
		file_hts_participant_service_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IsEventAvailableRequest); i {
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
			RawDescriptor: file_hts_participant_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   9,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_hts_participant_service_proto_goTypes,
		DependencyIndexes: file_hts_participant_service_proto_depIdxs,
		MessageInfos:      file_hts_participant_service_proto_msgTypes,
	}.Build()
	File_hts_participant_service_proto = out.File
	file_hts_participant_service_proto_rawDesc = nil
	file_hts_participant_service_proto_goTypes = nil
	file_hts_participant_service_proto_depIdxs = nil
}

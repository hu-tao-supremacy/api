proto_library(
    name = "common_proto",
    srcs = ["proto/hts/common/common.proto"],
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
    ],
)

proto_library(
    name = "account_proto",
    srcs = ["proto/hts/account/service.proto"],
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

proto_library(
    name = "facility_proto",
    srcs = ["proto/hts/facility/service.proto"],
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

proto_library(
    name = "organizer_proto",
    srcs = ["proto/hts/organizer/service.proto"],
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

proto_library(
    name = "participant_proto",
    srcs = ["proto/hts/participant/service.proto"],
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

load("@rules_proto_grpc//go:defs.bzl", "go_grpc_compile")

go_grpc_compile(
    name = "go",
    prefix_path = "bzl-gen",
    deps = [
        ":common_proto",
        ":account_proto",
        ":facility_proto",
        ":organizer_proto",
        ":participant_proto",
    ],
)

load("@rules_proto_grpc//js:defs.bzl", "js_grpc_node_compile")

js_grpc_node_compile(
    name = "api-gateway",
    prefix_path = "bzl-gen",
    protos = [
        ":common_proto",
        ":account_proto"
    ],
)

load("@rules_proto_grpc//java:defs.bzl", "java_grpc_compile")

java_grpc_compile(
    name = "java",
    prefix_path = "bzl-gen",
    protos = [
        ":common_proto",
        ":account_proto"
    ],
)

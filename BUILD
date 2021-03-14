proto_library(
    name = "api_proto",
    src = [
        "proto/hts/common/common.proto",
        "proto/hts/account/service.proto",
        "proto/hts/facility/service.proto",
        "proto/hts/organizer/service.proto",
        "proto/hts/participant/service.proto"
    ],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
    ],
)


load("@build_stack_rules_proto//go:go_grpc_compile.bzl", "go_grpc_compile")

go_grpc_compile(
    name = "go",
    deps = [":api_proto"],
)

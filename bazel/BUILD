load("@rules_proto//:defs.bzl", "proto_plugin")

proto_plugin(
    name = "ts_plugin",
    outputs = ["{protopath}_pb.d.ts"],
    tool = "@npm//ts-proto/bin:protoc-gen-ts_proto",
    visibility = ["//visibility:public"],
)

proto_plugin(
    name = "grpc_ts_plugin",
    empty_template = "empty.template",
    options = [
        "service=grpc-node",
    ],
    outputs = ["{protopath}_grpc_pb.d.ts"],
    tool = "@npm//ts-proto/bin:protoc-gen-ts_proto",
    visibility = ["//visibility:public"],
)

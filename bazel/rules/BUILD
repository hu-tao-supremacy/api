load("@rules_proto_grpc//:defs.bzl", "proto_plugin")

proto_plugin(
    name = "ts_plugin",
    output_directory = True,
    tool = "@npm_nest//ts-proto/bin:protoc-gen-ts_proto",
    visibility = ["//visibility:public"],
)

proto_plugin(
    name = "nest_plugin",
    output_directory = True,
    options = ["nestJs=true", "stringEnums=true"],
    tool = "@npm_nest//ts-proto/bin:protoc-gen-ts_proto",
    visibility = ["//visibility:public"],
)

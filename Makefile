generate:
	@cd $(dirname $0)
	bazel build //:go
	bazel build //:python
	bazel build //:api-gateway
	bazel build //:java
	bazel build //:nest

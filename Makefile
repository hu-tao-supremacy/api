generate:
	@cd $(dirname $0)
	bazel build //:go
	bazel build //:python
	bazel build //:api-gateway
	bazel build //:java
	# bazel build //:nest

	rm -rf gen
	mkdir -p gen/go
	mkdir -p gen/java
	mkdir -p gen/nest
	mkdir -p gen/api-gateway
	mkdir -p gen/python

	mv bazel-bin/go/gen/hts gen/go/.
	mv bazel-bin/java/gen/java.srcjar gen/java/.
	# mv bazel-bin/nest/gen/hts gen/nest/.
	mv bazel-bin/api-gateway/gen/hts gen/api-gateway/.
	mv bazel-bin/python/gen/hts gen/python/.

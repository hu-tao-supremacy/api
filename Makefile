setup:
	@cd $(dirname $0)
	ln -s proto/hts hts

generate:
	@cd $(dirname $0)
	bazel build //:go
	bazel build //:python
	bazel build //:java
	bazel build //:nest
	bazel build //:gql

	rm -rf gen
	mkdir -p gen/go
	mkdir -p gen/java
	mkdir -p gen/nest
	mkdir -p gen/gql
	mkdir -p gen/python

	mv bazel-bin/go/gen/hts gen/go/.
	mv bazel-bin/python/gen/hts gen/python/.

	cp -LR bazel-bin/java/gen/java.srcjar gen/java/.
	cp -LR bazel-bin/java/gen/java_grpc.srcjar gen/java/.
	mv gen/java/java.srcjar gen/java/java.zip
	mv gen/java/java_grpc.srcjar gen/java/java_grpc.zip
	ditto -xk gen/java/java.zip gen/java
	ditto -xk gen/java/java_grpc.zip gen/java
	rm -rf gen/java/java.zip
	rm -rf gen/java/java_grpc.zip
	rm -rf gen/java/META-INF

	cp -LR bazel-bin/nest/gen/hts gen/nest/.
	cp -LR bazel-bin/gql/gen/hts gen/gql/.
	cp -LR bazel-bin/nest/gen/google gen/nest/.
	cp -LR bazel-bin/gql/gen/google gen/gql/.


generate-linux:
	@cd $(dirname $0)
	make build-go
	make build-java
	make build-python
	make build-ts

build-go:
	@cd $(dirname $0)
	bazel build //:go
	rm -rf gen/go
	mkdir -p gen/go
	mv bazel-bin/go/gen/hts gen/go/.
	git add -f gen/go

build-python:
	@cd $(dirname $0)
	bazel build //:python
	rm -rf gen/python
	mkdir -p gen/python
	mv bazel-bin/python/gen/hts gen/python/.
	git add -f gen/python

build-java:
	@cd $(dirname $0)
	bazel build //:java
	rm -rf gen/java
	mkdir -p gen/java
	cp -LR bazel-bin/java/gen/java.srcjar gen/java/.
	cp -LR bazel-bin/java/gen/java_grpc.srcjar gen/java/.
	mv gen/java/java.srcjar gen/java/java.zip
	mv gen/java/java_grpc.srcjar gen/java/java_grpc.zip
	unzip -n gen/java/java.zip -d gen/java
	unzip -n gen/java/java_grpc.zip -d gen/java
	rm -rf gen/java/java.zip
	rm -rf gen/java/java_grpc.zip
	rm -rf gen/java/META-INF
	git add -f gen/java

build-ts:
	@cd $(dirname $0)
	bazel build //:nest
	bazel build //:gql
	rm -rf gen/nest && mkdir -p gen/nest
	rm -rf gen/gql && mkdir -p gen/gql
	cp -LR bazel-bin/nest/gen/hts gen/nest/.
	cp -LR bazel-bin/gql/gen/hts gen/gql/.
	cp -LR bazel-bin/nest/gen/google gen/nest/.
	cp -LR bazel-bin/gql/gen/google gen/gql/.
	git add -f gen/nest
	git add -f gen/gql

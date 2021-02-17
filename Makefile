/gen/nest:
	@cd $(dirname $0)
	@mkdir -p ./gen/nest
	protoc -I ./proto --plugin=./node_modules/.bin/protoc-gen-ts_proto --ts_proto_out=./gen/nest --ts_proto_opt=nestJs=true \
		./proto/hts/common/common.proto \
		./proto/hts/account/service.proto

/gen/python:
	@cd $(dirname $0)
	@mkdir -p ./gen/python
	python3 -m grpc_tools.protoc -I ./proto --python_out=./gen/python --grpc_python_out=./gen/python \
		./proto/hts/common/common.proto \
		./proto/hts/account/service.proto

generate: /gen/nest /gen/python
	@cd $(dirname $0)
	buf generate

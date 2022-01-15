package com.example.cloudbedstest.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.examples.lib.HelloReply;
import net.devh.boot.grpc.examples.lib.HelloRequest;
import net.devh.boot.grpc.examples.lib.MyServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyServiceImpl.class);

	// this example copied from https://yidongnan.github.io/grpc-spring-boot-starter/en/server/getting-started.html

	// TODO JM - this is an example of grpc capability, remove:
	//           * example proto file
	//           * example generated code
	//           * this class MyService

	// use grpcurl when the server is running to see examples:
	/*
		grpcurl --plaintext localhost:9090 list
		grpcurl --plaintext localhost:9090 list net.devh.boot.grpc.example.MyService
		grpcurl --plaintext -d '{"name": "test"}' localhost:9090 net.devh.boot.grpc.example.MyService/SayHello
	 */

	@Override
	public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
		LOGGER.info("grcp is working!!");
		HelloReply reply = HelloReply.newBuilder()
			.setMessage("Hello ==> " + request.getName())
			.build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
		LOGGER.info("reply = {}", reply.getMessage());
	}

}

package com.example.cloudbedstest.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudbeds.user.lib.NameRequest;
import com.cloudbeds.user.lib.User;
import com.cloudbeds.user.lib.UserResponse;
import com.cloudbeds.user.lib.UserServiceGrpc;
import com.example.cloudbedstest.repository.UserEntityRepository;

@GrpcService
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

	/*
		grpcurl --plaintext localhost:9090 list
		grpcurl --plaintext localhost:9090 list com.cloudbeds.user.UserService
		grpcurl --plaintext -d '{"firstName": "James"}' localhost:9090 com.cloudbeds.user.UserService/GetUsersByFirstName
	 */

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired private UserEntityRepository userEntityRepository;

	@Override
	public void getUsersByFirstName(NameRequest request, StreamObserver<UserResponse> responseObserver) {

		// this lacks input validation, unclear at this time if these values can even be null

		String targetFirstName = request.getFirstName();

		LOGGER.info("grcp request for user by first name: {}", targetFirstName);

		List<User> users = userEntityRepository.findByFirstName(targetFirstName)
			.stream()
			.map(userEntity -> User.newBuilder()
				.setFirstName(userEntity.getFirstName())
				.setLastName(userEntity.getLastName())
				.setEmail(userEntity.getEmail())
				.build())
			.collect(Collectors.toList());

		UserResponse response = UserResponse.newBuilder()
			.addAllUsers(users)
			.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}

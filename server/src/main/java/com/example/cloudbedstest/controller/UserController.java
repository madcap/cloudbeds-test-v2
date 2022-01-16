package com.example.cloudbedstest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.cloudbedstest.entity.AddressEntity;
import com.example.cloudbedstest.entity.UserEntity;
import com.example.cloudbedstest.model.Address;
import com.example.cloudbedstest.model.User;
import com.example.cloudbedstest.model.UserCreationRequest;
import com.example.cloudbedstest.repository.UserEntityRepository;

@RestController
public class UserController {

	@Autowired private UserEntityRepository userEntityRepository;

	@RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody Map<String, String> createUser(@RequestBody UserCreationRequest userCreationRequest) {

		UserEntity userEntity = new UserEntity();
		AddressEntity addressEntity = new AddressEntity();

		userEntity.setFirstName(userCreationRequest.getFirstName());
		userEntity.setLastName(userCreationRequest.getLastName());
		userEntity.setEmail(userCreationRequest.getEmail());
		userEntity.setPassword(userCreationRequest.getPassword());

		addressEntity.setAddressLine1(userCreationRequest.getAddressLine1());
		addressEntity.setAddressLine2(userCreationRequest.getAddressLine2());
		addressEntity.setCity(userCreationRequest.getCity());
		addressEntity.setState(userCreationRequest.getState());
		addressEntity.setZip(userCreationRequest.getZip());
		addressEntity.setCountry(userCreationRequest.getCountry());

		userEntity.setAddress(addressEntity);
		userEntityRepository.save(userEntity);

		return Map.of("status", "success", "message", "user saved successfully");
	}

	@RequestMapping(value = "/user/country/{country}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<User> getUsersByCountry(@PathVariable("country") String country) {
		Set<UserEntity> userEntities = userEntityRepository.findByCountry(country);
		List<User> results = new ArrayList<>();
		userEntities.forEach(userEntity -> {
			User user = new User();
			Address address = new Address();
			user.setAddress(address);

			user.setFirstName(userEntity.getFirstName());
			user.setLastName(userEntity.getLastName());
			user.setEmail(userEntity.getEmail());
			user.setPassword(userEntity.getPassword());

			if(userEntity.getAddress() != null) {
				AddressEntity addressEntity = userEntity.getAddress();
				address.setAddressLine1(addressEntity.getAddressLine1());
				address.setAddressLine2(addressEntity.getAddressLine2());
				address.setCity(addressEntity.getCity());
				address.setState(addressEntity.getState());
				address.setZip(addressEntity.getZip());
				address.setCountry(addressEntity.getCountry());
			}

			results.add(user);
		});

		return results;
	}
}

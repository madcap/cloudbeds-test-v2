package com.example.cloudbedstest.controller

import spock.lang.Specification

import com.example.cloudbedstest.entity.AddressEntity
import com.example.cloudbedstest.entity.UserEntity
import com.example.cloudbedstest.model.Address
import com.example.cloudbedstest.model.User
import com.example.cloudbedstest.model.UserCreationRequest
import com.example.cloudbedstest.repository.UserEntityRepository

class UserControllerSpec extends Specification {

    private UserEntityRepository mockUserEntityRepository = Mock()

    private UserController controller = new UserController(userEntityRepository: mockUserEntityRepository)

    private UserCreationRequest userCreationRequest = new UserCreationRequest(
        firstName: 'firstName',
        lastName: 'lastName',
        email: 'email',
        password: 'password',
        addressLine1: 'addressLine1',
        addressLine2: 'addressLine2',
        city: 'city',
        state: 'state',
        zip: 'zip',
        country: 'country',
    )

    private Address address = new Address(
        addressLine1: 'addressLine1',
        addressLine2: 'addressLine2',
        city: 'city',
        state: 'state',
        zip: 'zip',
        country: 'country',
    )

    private User user = new User(
        firstName: 'firstName',
        lastName: 'lastName',
        email: 'email',
        password: 'password',
        address: address,
    )

    private AddressEntity addressEntity = new AddressEntity(
        addressLine1: 'addressLine1',
        addressLine2: 'addressLine2',
        city: 'city',
        state: 'state',
        zip: 'zip',
        country: 'country',
    )

    private UserEntity userEntity = new UserEntity(
        firstName: 'firstName',
        lastName: 'lastName',
        email: 'email',
        password: 'password',
        address: addressEntity,
        )



    def 'test - createUser'() {
        when:
        def result = controller.createUser(userCreationRequest)

        then:
        result == [
            message: 'user saved successfully',
            status: 'success',
        ]

        and:
        1 * mockUserEntityRepository.save(userEntity)
        0 * _
    }

    def 'test - getUsersByCountry - none'() {
        when:
        def results = controller.getUsersByCountry('foo')

        then:
        results == []

        and:
        1 * mockUserEntityRepository.findByCountry('foo') >> [].toSet()
        0 * _
    }

    def 'test - getUsersByCountry - has address'() {
        when:
        def results = controller.getUsersByCountry('foo')

        then:
        results == [user]

        and:
        1 * mockUserEntityRepository.findByCountry('foo') >> [userEntity].toSet()
        0 * _
    }

    def 'test - getUsersByCountry - has no address'() {
        given:
        userEntity.address = null
        user.address = new Address()

        when:
        def results = controller.getUsersByCountry('foo')

        then:
        results == [user]

        and:
        1 * mockUserEntityRepository.findByCountry('foo') >> [userEntity].toSet()
        0 * _
    }

}

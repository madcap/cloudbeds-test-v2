package com.example.cloudbedstest.repository

import spock.lang.Specification
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import com.example.cloudbedstest.CloudbedsTestApplication
import com.example.cloudbedstest.entity.AddressEntity
import com.example.cloudbedstest.entity.UserEntity

@SpringBootTest(classes = CloudbedsTestApplication)
class RelationshipIntegrationSpec extends Specification {

    // test that repositories are working and the 1:1 relationship behaves as expected

    @Autowired private UserEntityRepository userEntityRepository
    @Autowired private AddressEntityRepository addressEntityRepository

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
        )

    def setup() {
        addressEntityRepository.deleteAll()
        userEntityRepository.deleteAll()
    }

    def cleanup() {
        addressEntityRepository.deleteAll()
        userEntityRepository.deleteAll()
    }

    def 'test - save individual entities with no relationship'() {
        given:
        userEntityRepository.save(userEntity)
        addressEntityRepository.save(addressEntity)

        when:
        def addresses = addressEntityRepository.findAll()
        def users = userEntityRepository.findAll()

        then:
        //println addresses
        //println users
        addresses.size() == 1
        users.size() == 1
        addresses[0].addressId
        users[0].userId
        users[0].getAddress() == null
    }

    def 'test - save entities with relationship already defined, cascading save from user only'() {
        given:
        userEntity.setAddress(addressEntity)
        userEntityRepository.save(userEntity)

        when:
        def addresses = addressEntityRepository.findAll()
        def users = userEntityRepository.findAll()

        then:
        //println addresses
        //println users
        addresses.size() == 1
        users.size() == 1
        addresses[0].addressId
        users[0].userId
        users[0].getAddress() == addresses[0]
        addresses[0].getUser() == users[0]
    }

    def 'test - save individual entities with no relationship, link them afterwards'() {
        given:
        def savedUserEntity = userEntityRepository.save(userEntity)
        def savedAddressEntity = addressEntityRepository.save(addressEntity)
        savedUserEntity.address = savedAddressEntity


        when:
        userEntityRepository.save(savedUserEntity)
        def addresses = addressEntityRepository.findAll()
        def users = userEntityRepository.findAll()

        then:
        //println addresses
        //println users
        addresses.size() == 1
        users.size() == 1
        addresses[0].addressId
        users[0].userId
        users[0].getAddress() == addresses[0]
        addresses[0].getUser() == users[0]
    }

    def 'test - cascading delete works'() {
        given:
        userEntity.setAddress(addressEntity)
        def savedUserEntity = userEntityRepository.save(userEntity)

        when:
        userEntityRepository.delete(savedUserEntity)
        def addresses = addressEntityRepository.findAll()
        def users = userEntityRepository.findAll()

        then:
        //println addresses
        //println users
        addresses.size() == 0
        users.size() == 0
    }

}

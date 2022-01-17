package com.example.cloudbedstest.repository

import spock.lang.Specification

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import com.example.cloudbedstest.CloudbedsTestApplication
import com.example.cloudbedstest.entity.AddressEntity
import com.example.cloudbedstest.entity.UserEntity

@SpringBootTest(classes = CloudbedsTestApplication)
class UserEntityRepositoryIntegrationSpec extends Specification {

    @Autowired private UserEntityRepository repository

    def setup() {
        repository.deleteAll()
    }

    def cleanup() {
        repository.deleteAll()
    }

    def 'test - findUsersByCountry - none'() {
        when:
        def results = repository.findByCountry('foo')

        then:
        results.isEmpty()
    }

    def 'test - findUsersByCountry - happy path'() {
        given:
        def user1 = new UserEntity(
            firstName: 'firstName1',
            )
        def user2 = new UserEntity(
            firstName: 'firstName2',
            address: new AddressEntity(
                country: 'countryFoo'
            ))
        def user3 = new UserEntity(
            firstName: 'firstName3',
            address: new AddressEntity(
                country: 'countryBar'
            ))
        def user4 = new UserEntity(
            firstName: 'firstName4',
            address: new AddressEntity(
                country: 'countryBar'
            ))
        repository.saveAll([user1, user2, user3, user4,])

        when:
        def results = repository.findByCountry('countryBar')

        then:
        //println results
        results.size() == 2
        def names = results.collect {
            it.firstName
        } as Set
        names == [user3.firstName, user4.firstName] as Set
    }

    def 'test - findByFirstName'() {
        given:
        def user1 = new UserEntity(
            firstName: 'foo',
            lastName: 'user1',
            )
        def user2 = new UserEntity(
            firstName: 'bar',
            )
        def user3 = new UserEntity(
            firstName: 'foo',
            lastName: 'user3',
            )
        def user4 = new UserEntity(
            firstName: 'fizz',
            )
        repository.saveAll([user1, user2, user3, user4,])

        when:
        def results = repository.findByFirstName('foo')

        then:
        //println results
        results.size() == 2
    }
}

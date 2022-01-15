package com.example.cloudbedstest.controller

import spock.lang.Specification

class HomeControllerSpec extends Specification {

    private HomeController controller = new HomeController()

    def 'test - getHome'() {
        when:
        def result = controller.getHome()

        then:
        result == 'Cloudbeds Test V2 is running successfully.'
    }
}

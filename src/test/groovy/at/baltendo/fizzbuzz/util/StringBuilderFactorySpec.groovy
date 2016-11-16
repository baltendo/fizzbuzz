package at.baltendo.fizzbuzz.util

import spock.lang.Specification

class StringBuilderFactorySpec extends Specification {

    final TEST_STRING = "aaaaaaaaaa"

    def "should perform default capacity estimation"() {
        when:
        def estimatedCapacity = StringBuilderFactory.defaultCapacityEstimation(TEST_STRING);

        then:
        estimatedCapacity == 12
    }

    def "should create StringBuilder with default capacity estimation"() {
        when:
        def builder = StringBuilderFactory.withEstimatedCapacity(TEST_STRING);

        then:
        builder != null
    }
}

package at.baltendo.fizzbuzz

import spock.lang.Specification

class FizzBuzzSpec extends Specification {

    def fb = new FizzBuzz()

    def "should replace every third word with 'fizz' and every fifth word by 'buzz' - StringBuilder approach"() {
        when:
        def output = fb.transform(input)

        then:
        output == expected

        where:
        input                      | expected
        null                       | null
        ""                         | ""
        "test test test test test" | "test test fizz test buzz"
    }

    def "should replace every third word with 'fizz' and every fifth word by 'buzz' - string concatenation approach"() {
        when:
        def output = fb.transformWithStringConcatenation(input)

        then:
        output == expected

        where:
        input                      | expected
        null                       | null
        ""                         | ""
        "test test test test test" | "test test fizz test buzz"
    }
}

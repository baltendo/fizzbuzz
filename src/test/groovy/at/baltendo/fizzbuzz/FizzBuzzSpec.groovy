package at.baltendo.fizzbuzz

import spock.lang.Specification

class FizzBuzzSpec extends Specification{

    def "should replace every third word with 'fizz' with string concatenation"() {
        def fb = new FizzBuzz()

        when:
        def output = fb.transform(input)

        then:
        output == expected

        where:
        input | expected
        null | null
        ""   | ""
        "test test test" | "test test fizz"
    }

    def "should estimate length of output sentence"() {
        def fb = new FizzBuzz()

        when:
        def estimated = fb.estimateTransformedLength("aaaaaaaaaa");

        then:
        estimated == 12
    }
}

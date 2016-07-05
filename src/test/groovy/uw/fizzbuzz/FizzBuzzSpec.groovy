package uw.fizzbuzz

import spock.lang.Specification

class FizzBuzzSpec extends Specification {

    def "returns result of fizzbuzz"() {

        expect:
            new FizzBuzz().calculate(15) == ['1', '2', 'Fizz', '4', 'Buzz', 'Fizz', '7', '8', 'Fizz', 'Buzz', '11', 'Fizz', '13', '14', 'FizzBuzz']

    }
}

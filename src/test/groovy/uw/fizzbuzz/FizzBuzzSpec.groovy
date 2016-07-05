package uw.fizzbuzz

import spock.lang.Specification

class FizzBuzzSpec extends Specification {

    def "returns result of fizzbuzz"() {

        expect:
            new FizzBuzz().calculate() == ['1','2','Fizz','4','5','Fizz','7','8','Fizz','10']

    }
}

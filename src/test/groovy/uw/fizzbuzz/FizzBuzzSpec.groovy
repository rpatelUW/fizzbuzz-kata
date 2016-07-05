package uw.fizzbuzz

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzSpec extends Specification {

    def "returns result of fizzbuzz for 15"() {

        expect:
            new FizzBuzz().calculate(15) == ['1', '2', 'Fizz', '4', 'Buzz', 'Fizz', '7', '8', 'Fizz', 'Buzz', '11', 'Fizz', '13', '14', 'FizzBuzz']

    }

    def "mapping of numbers to replacements is configurable"() {

        def map = [(2): 'Foo', (7): 'Bar']
        expect:
            new FizzBuzz(map).calculate(14) == ['1', 'Foo', '3', 'Foo', '5', 'Foo', 'Bar', 'Foo', '9', 'Foo', '11', 'Foo', '13', 'FooBar']

    }

    @Unroll
    def 'stringsFor returns #expected for #number'() {

        given:
            def fizzBuzz = new FizzBuzz([(3): 'Fizz', (5): 'Buzz'])

        expect:
            fizzBuzz.transform(number) == expected

        where:
            number || expected
            1      || '1'
            2      || '2'
            3      || 'Fizz'
            5      || 'Buzz'
            6      || 'Fizz'
            15     || 'FizzBuzz'

    }
}

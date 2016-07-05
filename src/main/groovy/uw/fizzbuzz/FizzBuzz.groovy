package uw.fizzbuzz

import groovy.transform.CompileStatic

@CompileStatic
class FizzBuzz {

    static void main(String[] args) {

        def lastNumber = defaulted(args)

        new FizzBuzz().calculate(lastNumber).each {
            println(it)
        }
    }

    static Integer defaulted(String[] args) {
        if (args) {
            args[0].toInteger()
        } else {
            100
        }
    }

    List<String> calculate(Integer end) {

        (1..end).collect { number ->
            transform(number)
        }
    }

    private String transform(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            'FizzBuzz'
        } else if (number % 3 == 0) {
            'Fizz'
        } else if (number % 5 == 0) {
            'Buzz'
        } else {
            number.toString()
        }
    }
}

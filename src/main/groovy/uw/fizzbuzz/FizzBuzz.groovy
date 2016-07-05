package uw.fizzbuzz

import groovy.transform.CompileStatic

@CompileStatic
class FizzBuzz {

    private final LinkedHashMap<Integer, String> mappings

    FizzBuzz(LinkedHashMap<Integer, String> mappings = [(3): 'Fizz', (5): 'Buzz']) {
        this.mappings = mappings
    }

    List<String> calculate(Integer end) {

        (1..end).collect { transform(it) }
    }

    String transform(int number) {
        stringFor(number) ?: number.toString()
    }

    private String stringFor(int number) {
        mappings
            .findAll { divisor, stringReplacement ->
                number % divisor == 0
            }
            .values()
            .join('')
    }

    static void main(String[] args) {

        def lastNumber = defaulted(args)

        new FizzBuzz().calculate(lastNumber).each {
            println(it)
        }
    }

    static Integer defaulted(String[] args) {
        try {
            args[0].toInteger()
        } catch (Exception ignored) {
            100
        }
    }
}

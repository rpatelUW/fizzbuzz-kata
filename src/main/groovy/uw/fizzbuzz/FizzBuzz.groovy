package uw.fizzbuzz

import groovy.transform.CompileStatic

@CompileStatic
class FizzBuzz {
    List<String> calculate() {
        def result = []
        for (int x = 1; x < 11; x++) {
            if (x % 3 == 0) {
                result.add('Fizz')
            } else {
                result.add(x.toString())
            }
        }
        return result
    }
}

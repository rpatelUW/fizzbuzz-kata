package uw.fizzbuzz

import org.junit.Rule
import spock.lang.Specification
import spock.lang.Unroll
import uk.org.lidalia.test.SystemOutputRule

class FizzBuzzAcceptanceSpec extends Specification {

    @Rule
    SystemOutputRule console = new SystemOutputRule()

    def 'prints result to console'() {

        when:
            FizzBuzz.main(['2'] as String[])

        then:
            console.systemOut == '1\n2\n'
    }

    @Unroll
    def 'defaults to printing 100 lines when args are #args'() {

        when:
            FizzBuzz.main(args as String[])

        then:
            console.systemOut.readLines().size() == 100

        where:
            args << [null, [], ['not a number']]
    }
}

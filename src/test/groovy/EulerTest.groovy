import spock.lang.Specification

class EulerTest extends Specification {
    def "problem 1"() {
        expect:
        Euler.sumMultiplesOfThreeAndFive(1000) == 233168
    }

    def "problem 2"() {
        expect:
        Euler.sumOfEvenFibonacciNumbers(4000000) == 4613732
    }

    def "problem 3"() {
        expect:
        Euler.largestPrimeFactor(600851475143) == 0
    }
}

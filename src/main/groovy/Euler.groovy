class Euler {
    static int sumMultiplesOfThreeAndFive(int max) {
        (0 .. max - 1).findAll {
            it % 3 == 0 || it % 5 == 0
        }.sum()
    }

    static int sumOfEvenFibonacciNumbers(int max) {
        Queue<Integer> fibonacci = [1, 2] as Queue
        int total = 2
        int nextVal

        while ((nextVal = fibonacci.sum()) <= max) {
            if (nextVal % 2 == 0) {
                total += nextVal
            }
            fibonacci.poll()
            fibonacci.offer(nextVal)
        }

        total
    }

    static boolean isPrime(long value) {
        if (value <= 0) {
            false
        } else if (value <= 3) {
            true
        } else if (value % 2 == 0) {
            false
        } else {
            for (long i = 4; i <= value; i++) {
                if (value % i == 0) {
                    return false
                }
            }

            true
        }
    }

    static int largestPrimeFactor(long of) {
        for (long i = of; i > 0; i--) {
            if (i % of == 0 && isPrime(i)) {
                return i
            }
        }
    }
}

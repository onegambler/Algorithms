package maths;

/**
 *
 * Computes and prints the first n Fibonacci numbers.
 *
 */
public class FibonacciSequence {

    public long getValue(int index) {
        return fibonacci(index);
    }

    private long fibonacci(int index) {
        if (index < 2) {
            return 1;
        }

        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}

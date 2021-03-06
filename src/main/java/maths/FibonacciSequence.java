package maths;

import java.util.HashMap;

/**
 * Computes and prints the first n Fibonacci numbers.
 */
public class FibonacciSequence {

    /**
     * Iterative version
     *
     * Time Complexity O(2^n)
     */
    public long getFibonacciValue(int index) {
        return fibonacci(index);
    }


    private long fibonacci(int index) {
        if (index < 2) {
            return 1;
        }

        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    /**
     * Dynamic programming version
     *
     * Time Complexity O(n)
     *
     * Space Complexity O(n)
     */
    public long getFibonacciDynamicProgramming(int index) {
        HashMap<Integer, Long> map = new HashMap<>();
        if (index < 2) {
            return 1;
        }
        map.put(0, 1L);
        map.put(1, 1L);

        for (int i = 2; i <= index; i++) {
            long oneBefore = map.get(i - 1);
            long twoBefore = map.get(i - 2);
            map.put(i, oneBefore + twoBefore);
        }

        return map.get(index);
    }

    /**
     * Iterative version
     *
     * Time Complexity O(n)
     *
     * Space Complexity O(1)
     */
    public long getFibonacciIterative(int n) {
        if (n < 2) return 1;

        long prevPrev = 1;
        long prev = 1;
        long result = 0;

        for (int i = 2; i <= n; i++) {
            result = prev + prevPrev;
            prevPrev = prev;
            prev = result;
        }
        return result;
    }
}

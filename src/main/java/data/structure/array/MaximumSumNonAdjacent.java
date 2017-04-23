package data.structure.array;

/**
 * Given an array of positive numbers, find the maximum sum of a subsequence with the constraint that no 2 numbers in
 * the sequence should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 should
 * return 15 (sum of 3, 5 and 7).
 * <p>
 * Answer the question in most efficient way.
 */
public class MaximumSumNonAdjacent {

    /**
     * Complexity O(n*k)
     *
     * It destroys the array
     */
    public int sum(int[] array) {

        int sum = 0;

        int maxIdx;
        while ((maxIdx = max(array)) > -1) {

            sum += array[maxIdx];

            array[maxIdx] = -1;
            if (maxIdx + 1 < array.length) {
                array[maxIdx + 1] = -1;
            }

            if (maxIdx - 1 >= 0) {
                array[maxIdx - 1] = -1;
            }
        }

        return sum;

    }

    private int max(int... array) {
        int max = -1;
        int idx = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                idx = i;
            }
        }
        return idx;
    }

    /**
     * Time Complexity O(n)
     * Space Complexity O(n)
     */

    public int sumWithDynamicProgramming(int[] array) {

        int [] helper = new int[array.length];

        helper[0] = array[0];
        helper[1] = Math.max(array[0], array[1]);

        for(int i = 2; i < array.length; i++) {
            helper[i] = Math.max(helper[i-1], helper[i-2] + array[i]);
        }

        return helper[array.length - 1];
    }

    /**
     * Time Complexity O(n)
     * Space Complexity O(1)
     */

    public int sumWithDynamicProgrammingImproved(int[] array) {

        int twoPrevious = array[0];
        int previous = Math.max(array[0], array[1]);

        int current = 0;
        for(int i = 2; i < array.length; i++) {
            current = Math.max(previous, twoPrevious + array[i]);
            twoPrevious = previous;
            previous = current;
        }

        return current;
    }
}

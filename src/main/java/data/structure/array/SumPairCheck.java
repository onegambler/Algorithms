package data.structure.array;

import java.util.Arrays;

/**
 * Given an array A[] and a number x, check for pair in A[] with sum as x.
 *
 * Write an algorithm that, given an array A[] of n numbers and another number x, determines whether or not there exist
 * two elements in S whose sum is exactly x.
 */
public class SumPairCheck {

    /**
     * Time complexity O(n)
     * Space complexity O(k)
     */
    public boolean containsSumPair(int[] array, int sum) {
        boolean[] helper = new boolean[sum];
        for (int value : array) {
            if (helper[value]) {
                return true;
            }
            int remainer = sum - value;
            helper[remainer] = true;
        }

        return false;
    }

    /**
     * Time complexity O(n^2)
     * Space complexity O(1)
     */
    public boolean containsSumPairBruteForce(int[] array, int sum) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Time complexity O(nlong)
     * Space complexity O(1)
     */
    public boolean containsSumPairSorting(int[] array, int sum) {
        int i = 0;
        int j = array.length - 1;
        Arrays.sort(array);
        while (i < j) {
            int currentSum = array[i] + array[j];
            if (currentSum == sum) {
                return true;
            }

            if (currentSum > sum) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}

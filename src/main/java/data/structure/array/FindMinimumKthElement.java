package data.structure.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * In an integer array with N elements (N is large), find the minimum k elements (k << N).
 */
public class FindMinimumKthElement {

    //Complexity O(n*logn)
    public int findBySorting(int[] array, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("Kth value must be an integer starting from 1");
        }
        Arrays.sort(array);
        return array[k - 1];
    }

    public int findWithHeap(int[] array, int k) {
        return 3;
    }
}

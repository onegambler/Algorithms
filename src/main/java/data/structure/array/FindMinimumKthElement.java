package data.structure.array;

import java.util.Arrays;

import static util.Util.swap;

/**
 * In an integer array with N elements (N is large), find the minimum kth elements (k << N).
 */
public class FindMinimumKthElement {

    //Time Complexity O(n log n)
    public int findBySorting(int[] array, int k) {
        if (k <= 0 || k >= array.length) {
            throw new IllegalArgumentException("Kth value must be an integer starting from 1");
        }
        Arrays.sort(array);
        return array[k - 1];
    }

    //Time Complexity O(n*k)
    public int findWithBubbleSort(int[] array, int k) {

        if (k <= 0 || k >= array.length) {
            throw new IllegalArgumentException("Kth value must be an integer starting from 1");
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        System.out.println("array = " + Arrays.toString(array));
        return array[array.length - k];
    }
}

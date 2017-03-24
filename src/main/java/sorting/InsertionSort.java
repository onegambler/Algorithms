package sorting;

import java.util.Arrays;

/**
 * Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
 * It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
 * However, insertion sort provides several advantages:
 * <ul>
 * <li>Simple implementation: Jon Bentley shows a three-line C version, and a five-line optimized version</li>
 * <li>Efficient for (quite) small data sets, much like other quadratic sorting algorithms</li>
 * <li>Milk</li>
 * <li>Adaptive, i.e., efficient for data sets that are already substantially sorted: the time complexity is O(nk) when each element in the input is no more than k places away from its sorted position</li>
 * <li>Stable; i.e., does not change the relative order of elements with equal keys</li>
 * <li>In-place; i.e., only requires a constant amount O(1) of additional memory space</li>
 * <li>Online; i.e., can sort a list as it receives it</li>
 * </ul>
 *
 * Example:  The following table shows the steps for sorting the sequence 5 7 0 3 4 2 6 1. On the left side the sorted
 * part of the sequence is shown in square brackets.
 * For each iteration, the number of positions the inserted element has moved is shown in brackets.
 * Altogether this amounts to 17 steps.
 *
 * [5] 7	0	3	4	2	6	1	 	(0)
 * [5  7]	0	3	4	2	6	1	 	(0)
 * [0	 5	7]	3	4	2	6	1	 	(2)
 * [0	 3	5	7]	4	2	6	1	 	(2)
 * [0	3	4	5	7]	2	6	1	 	(2)
 * [0	2	3	4	5	7]	6	1	 	(4)
 * [0	2	3	4	5	6	7]	1	 	(1)
 * [0	1	2	3	4	5	6	7]	 	(6)
 *
 * <a href="https://www.tutorialspoint.com/data_structures_algorithms/insertion_sort_algorithm.htm">Link</a>
 */
public class InsertionSort {

    public int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j);
                j--;
                System.out.println(Arrays.toString(array));
            }
        }

        return array;
    }

    private void swap(int[] array, int j) {
        int temp;
        temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
    }
}

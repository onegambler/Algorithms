package data.structure.array;

/**
 * Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number
 * of times. Find these repeating numbers in O(n) and using only constant memory space.
 *
 * For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.
 */
public class DuplicatesFinder {

    void printRepeating(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            if (arr[Math.abs(arr[i])] >= 0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            } else {
                System.out.print(Math.abs(arr[i]) + " ");
            }
        }
    }

}

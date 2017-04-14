package data.structure.array;

/**
 * Find sub-array with given sum.
 *
 * Given an unsorted array of non-negative integers, find a continuous sub-array which adds to a given number.
 */
public class SubarrayOfSum {

    /**
     * Complexity O(n^2)
     */
    public void find(int[] array, int n) {

        for (int i = 0; i < array.length; i++) {
            int sum = array[i];
            int j = i;
            while (sum < n && j < array.length) {
                sum += array[++j];
            }
            if (sum == n) {
                System.out.println(i + " " + j);
                return;
            }
        }
        System.out.println("No sub-array found");
    }
}

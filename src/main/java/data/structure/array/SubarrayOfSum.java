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


    /**
     * Time Complexity O(n)
     */
    public void findOptimised(int[] array, int count) {

        int start = 0;
        int end = 0;
        int currentSum = 0;

        while (end < array.length) {

            int newSum = currentSum + array[end];
            if (currentSum == count) {
                System.out.println(start + " " + end);
                return;
            }

            if (newSum > count) {
                currentSum = newSum - array[start];
                start++;
                if (currentSum == count) {
                    System.out.println(start + " " + end);
                    return;
                }
                end = Math.max(start, end);
            } else {
                currentSum = newSum;
                end++;
            }
        }

        System.out.println("No sub-array found");
    }
}

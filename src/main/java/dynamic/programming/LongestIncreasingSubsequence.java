package dynamic.programming;

/**
 * Find the length of the longest strictly increasing sub-sequence of the given sequence.
 * In a single line, output the length of the longest increasing sub-sequence.
 *
 * For example,
 * the length of the LIS for { 15, 27, 14, 38, 26, 55, 46, 65, 85 } is 6 and the longest increasing sub-sequence is
 * {15, 27, 38, 55, 65, 85}.
 */
public class LongestIncreasingSubsequence {

    /**
     * Complexity O(n^2)
     */
    public int getLongestIncreasingSubsequence(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array.length;
        }

        int[] helper = new int[array.length];
        helper[0] = 1;
        int lis = 0;

        int max = 0;
        for (int i = 1; i < array.length; i++) {

            for (int j = 0; j < i; j++) {
                if (array[j] < array[i]) {
                    max = Math.max(max, helper[j]);
                }
            }

            helper[i] = max + 1;
            lis = Math.max(helper[i], lis);
        }

        return lis;
    }
}

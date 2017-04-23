package data.structure.array;

import java.util.Arrays;

import static java.lang.Math.abs;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class Find3SumClosest {

    /**
     * Time Complexity O(n log n)
     */
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int diff = Integer.MAX_VALUE;
        int result = 0;
        int lastIndex = num.length - 2;
        int j;
        int k;
        for (int i = 0; i < lastIndex; ++i) {
            j = i + 1;
            k = lastIndex + 1;
            while (j < k) {
                int threeSum = num[i] + num[j] + num[k];
                int tmpDiff = threeSum - target;
                if (tmpDiff == 0) return target;
                if (abs(tmpDiff) < diff) {
                    diff = abs(tmpDiff);
                    result = threeSum;
                }
                if (tmpDiff < 0) {
                    j++;
                } else {
                    k--;
                }

            }
        }
        return result;
    }

}

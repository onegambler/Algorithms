package data.structure.array;

import java.util.Arrays;

/**
 * Given an array S of n integers, find two integers in S such that the sum is equals to a given number, target.
 * Return true or false.
 * For example, given array S = {-1 2 1 -4}, and target = 1. The solution is True [-1, 2].
 */
public class Find2Sum {

    public boolean exist(int[] num, int target) {
        Arrays.sort(num);
        int min = 0;
        int max = num.length - 1;

        while (min < max) {

            final int sum = num[min] + num[max];
            if (sum == target) {
                return true;
            }

            if (sum < target) {
                min++;
            } else {
                max++;
            }
        }

        return false;
    }

}

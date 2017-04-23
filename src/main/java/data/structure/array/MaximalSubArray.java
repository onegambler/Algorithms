package data.structure.array;

import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Math.max;

/**
 * Given  an  array,  describe  an  algorithm  to  identify  the  subarray  with  the  maximum  sum.
 *
 *  For  example,  if  the  input  is  [1, ‐3, 5, ‐2, 9, ‐8, ‐6, 4],  the  output  would  be  [5, ‐2, 9].
 */
public class MaximalSubArray {

    /**
     * Time Complexity O(n^2)
     */
    public int findSubArray(int[] array) {
        int minIdx = 0;
        int maxIdx = 0;
        int sum = MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            int currentMax = 0;
            for (int j = i; j < array.length; j++) {
                currentMax += array[j];
                if (currentMax > sum) {
                    sum = currentMax;
                    minIdx = i;
                    maxIdx = j;
                }
            }
        }
        System.out.println("Array = " + Arrays.toString(Arrays.copyOfRange(array, minIdx, maxIdx + 1)));
        return sum;
    }

    /**
     * Time Complexity O(n)
     */
    public int findSubArrayDynamicProgramming(int[] array) {

        int maxSoFar = array[0];
        int currentMax = array[0];

        for (int i = 1; i < array.length; i++) {

            currentMax = max(array[i], currentMax + array[i]);
            maxSoFar = max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}

package data.structure.array;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.MIN_VALUE;

/**
 * Leaders in an array.
 *
 * Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements
 * to its right side. And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2},
 * leaders are 17, 5 and 2.
 */
public class ArrayLeaders {

    /**
     * Complexity O(n)
     */
    public Set<Integer> getLeadersWithDoubleLoop(int[] array) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            boolean leader = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                result.add(array[i]);
            }
        }

        result.add(array[array.length - 1]);
        return result;
    }

    /**
     * Complexity O(n)
     */
    public Set<Integer> getLeadersScanningFromRight(int[] array) {
        Set<Integer> result = new HashSet<>();
        int max = MIN_VALUE;
        for (int i = array.length - 1; i >= 0; i++) {
            if (array[i] > max) {
                max = array[i];
                result.add(max);
            }
        }
        return result;
    }
}

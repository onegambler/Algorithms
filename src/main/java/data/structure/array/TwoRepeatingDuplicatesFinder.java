package data.structure.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the two repeating elements in a given data.structure.array.
 * You are given an data.structure.array of n+2 elements. All elements of the data.structure.array are in range 1 to n.
 * And all elements occur once except two numbers which occur twice. Find the two repeating numbers.
 *
 * For example, data.structure.array = {4, 2, 4, 5, 2, 3, 1} and n = 5
 * The above data.structure.array has n + 2 = 7 elements with all elements occurring once except 2 and 4 which occur twice.
 * So the output should be 4 2.
 */
public class TwoRepeatingDuplicatesFinder {

    /**
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public void findRepeatingElementsBruteForce(int[] array) {
        int i, j;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < array.length; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public void findRepeatingElementsWithSet(int[] array) {
        Set<Integer> helper = new HashSet<>();
        int i;

        System.out.println("Repeated elements are : ");
        for (i = 0; i < array.length; i++) {
            if (helper.contains(array[i]))
                System.out.print(array[i] + " ");
            else
                helper.add(array[i]);
        }
    }
}

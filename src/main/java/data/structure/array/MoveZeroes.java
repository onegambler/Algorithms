package data.structure.array;

import static util.Util.swap;

/**
 * Move Zeroes
 * Modify the array by moving all the zeros to the end (right side). The order of other elements doesn’t matter.
 *
 * Example.
 * For array [1, 2, 0, 3, 0, 1, 2], the program can output [1, 2, 3, 1, 2, 0, 0].
 */
public class MoveZeroes {

    /**
     * Time Complexity O(n)
     * Space complexity O(1)
     */
    public void move(int[] array) {

        int zeroIdx = array.length - 1;

        while (array[zeroIdx] == 0) {
            zeroIdx--;
        }

        for (int i = 0; i < zeroIdx; i++) {
            if (array[i] == 0) {
                swap(array, i, zeroIdx);
                zeroIdx--;
                while (array[zeroIdx] == 0) {
                    zeroIdx--;
                }
            }
        }
    }
}

package data.structure.array;

/**
 * Given value T, find the index of the first number in a sorted data.structure.array greater than T.
 *
 * Assume there are no duplicate numbers.
 */
public class OptimisedIndexedArraySearch {

    /**
     * Overall complexity O(logn)
     */
    public int findIndex(int[] ints, int value) {
        return find(ints, value, 0, ints.length - 1);
    }

    private int find(int[] ints, int value, int minIndex, int maxIndex) {
        if (ints[minIndex] >= value) {
            return minIndex;
        }

        if (ints[maxIndex] < value) {
            return -1;
        }

        int splitIndex = (maxIndex + minIndex) / 2;
        int result;
        if (ints[splitIndex] >= value) {
            result = find(ints, value, minIndex, splitIndex);
        } else {
            result = find(ints, value, splitIndex + 1, maxIndex);
        }

        return result;
    }
}

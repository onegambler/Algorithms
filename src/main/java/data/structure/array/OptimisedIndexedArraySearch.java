package data.structure.array;

/**
 * Given value T, find the index of the first number in a sorted data.structure.array greater than T.
 *
 * Assume there are no duplicate numbers.
 */
public class OptimisedIndexedArraySearch {

    /**
     * Overall complexity O(nlogn)
     */
    public int findIndex(int t, int[] ints) {
        return find(t, 0, ints.length - 1, ints); //O(logn)
    }

    private int find(int t, int minIndex, int maxIndex, int[] ints) {
        if (ints[minIndex] >= t) {
            return minIndex;
        }

        if (ints[maxIndex] < t) {
            return -1;
        }

        int splitIndex = (maxIndex - minIndex) / 2 + minIndex;
        int min = find(t, minIndex, splitIndex, ints);
        int max = find(t, splitIndex + 1, maxIndex, ints);

        return min == -1 ? max : Math.min(min, max);
    }
}

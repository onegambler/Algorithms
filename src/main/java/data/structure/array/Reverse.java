package data.structure.array;

/**
 * Write a program to reverse an array.
 */
public class Reverse {

    /**
     * Time complexity O(logn)
     */
    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - 1 - i);
        }
    }

    private void swap(int[] array, int j, int i) {
        int temp;
        temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}

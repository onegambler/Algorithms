package sorting;

import static java.lang.System.arraycopy;

/**
 *
 */

public class MergeSort {

    public int[] sort(int[] array) {
        int arrayLength = array.length;
        mergeSort(array, new int[arrayLength], 0, arrayLength - 1);
        return array;
    }

    private void mergeSort(int[] array, int[] helper, int low, int high) {
        // if low is not smaller than high index, then data.structure.array is already sorted
        if (low < high) {
            int middle = low + (high - low) / 2;
            //divide
            mergeSort(array, helper, low, middle);
            mergeSort(array, helper, middle + 1, high);
            //merge back
            merge(array, helper, low, middle, high);
        }
    }

    private void merge(int[] array, int[] helper, int low, int middle, int high) {

        // Copy sub array elements into the helper array
        arraycopy(array, low, helper, low, high - low + 1);

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy values from either the left or the right side back
        // to the original array in ascending order (e.g. smaller values first).
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the helper data.structure.array into the original one
        while (i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }
    }
}

package sorting;

public class MergeSort {

    public int[] sort(int[] array) {
        int arrayLength = array.length;
        mergeSort(array, new int[arrayLength], 0, arrayLength - 1);
        return array;
    }

    private void mergeSort(int[] array, int[] helper, int low, int high) {
        // check if low is smaller then high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergeSort(array, helper, low, middle);
            // Sort the right side of the array
            mergeSort(array, helper, middle + 1, high);
            // Combine them both
            merge(array, helper, low, middle, high);
        }
    }

    private void merge(int[] array, int[] helper, int low, int middle, int high) {

        // Copy sub array elements into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

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
        // Copy the rest of the left side of the helper array into the original one
        while (i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }

    }
}

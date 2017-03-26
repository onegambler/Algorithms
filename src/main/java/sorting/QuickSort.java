package sorting;

public class QuickSort {

    public void sort(int[] array) {
        quickSort(array, 0, array.length);
    }

    private void quickSort(int arr[], int low, int high) {
        int index = partition(arr, low, high);
        if (low < index)
            quickSort(arr, low, index);
        if (index < high)
            quickSort(arr, index + 1, high);
    }

    private int partition(int arr[], int left, int right) {
        int i = left;
        int j = right;

        int pivot = (left + right) / 2;

        while (i <= j) {
            while (arr[i] < arr[pivot])
                i++;
            while (arr[j] > arr[pivot])
                j--;
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

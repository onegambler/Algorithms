package sorting;

public class BubbleSort {

    public int[] sort(int[] array) {

        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return array;
    }

    private void swap(int[] array, int j, int i) {
        int temp;
        temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}

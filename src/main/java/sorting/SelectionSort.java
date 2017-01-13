package sorting;

public class SelectionSort {

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(array, min, i);
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

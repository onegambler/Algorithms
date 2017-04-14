package util;

public class Util {

    public static void swap(int[] array, int i, int j) {
        int temp;
        temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
    }
}

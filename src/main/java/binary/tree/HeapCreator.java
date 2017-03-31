package binary.tree;

public class HeapCreator<T extends Comparable<T>> {

    public void create(T[] array) {
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            heapify(array);
        }
    }

    private void heapify(T[] array) {

    }
}

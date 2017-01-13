package sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    private SelectionSort sort = new SelectionSort();

    @Test
    public void shouldSortAnArray() {
        int[] array = {2, 1, 5, 4, 3};
        assertArrayEquals(sort.sort(array), new int[]{1, 2, 3, 4, 5});
    }

    @Test
    public void shouldReturnEmptyArrayIfInputEmpty() {
        int[] array = {};
        assertArrayEquals(sort.sort(array), new int[]{});
    }

    @Test
    public void shouldSortArrayWithRepetitions() {
        int[] array = {2, 6, 7, 2, 1, 9, 8, 6, 5, 4, 2, 2};
        assertArrayEquals(sort.sort(array), new int[]{1, 2, 2, 2, 2, 4, 5, 6, 6, 7, 8, 9});
    }
}
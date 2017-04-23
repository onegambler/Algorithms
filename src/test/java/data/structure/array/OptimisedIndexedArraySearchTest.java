package data.structure.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptimisedIndexedArraySearchTest {

    private OptimisedIndexedArraySearch search = new OptimisedIndexedArraySearch();

    @Test
    public void whenInputIsSingleElementAndTIsSmallerThenReturnMinusOne() {
        int index = search.findIndex(new int[]{6}, 5);
        assertEquals(0, index);
    }

    @Test
    public void whenInputIsSingleElementAndTIsBiggerThenReturnZeroIndex() {
        int index = search.findIndex(new int[]{4}, 5);
        assertEquals(-1, index);
    }

    @Test
    public void findFirstIndexBiggerThanInputT() {
        int index = search.findIndex(new int[]{1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100}, 13);
        assertEquals(4, index);

        index = search.findIndex(new int[]{1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100}, 0);
        assertEquals(0, index);

        index = search.findIndex(new int[]{1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100}, 101);
        assertEquals(-1, index);

        index = search.findIndex(new int[]{1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100}, 51);
        assertEquals(6, index);

        index = search.findIndex(new int[]{1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100}, 1);
        assertEquals(0, index);

        index = search.findIndex(new int[]{1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100}, 100);
        assertEquals(10, index);

        index = search.findIndex(new int[]{1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100}, 77);
        assertEquals(8, index);
    }
}
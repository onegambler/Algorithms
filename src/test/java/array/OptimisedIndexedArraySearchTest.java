package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptimisedIndexedArraySearchTest {

    private OptimisedIndexedArraySearch search = new OptimisedIndexedArraySearch();

    @Test
    public void whenInputIsSingleElementAndTIsSmallerThenReturnMinusOne() {
        int index = search.findIndex(5, new int[]{6});
        assertEquals(0, index);
    }

    @Test
    public void whenInputIsSingleElementAndTIsBiggerThenReturnZeroIndex() {
        int index = search.findIndex(5, new int[]{4});
        assertEquals(-1, index);
    }

    @Test
    public void findFirstIndexBiggerThanInputT() {
        int index = search.findIndex(13, new int[]{ 1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100 });
        assertEquals(4, index);

        index = search.findIndex(0, new int[]{ 1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100 });
        assertEquals(0, index);

        index = search.findIndex(101, new int[]{ 1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100 });
        assertEquals(-1, index);

        index = search.findIndex(51, new int[]{ 1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100 });
        assertEquals(6, index);

        index = search.findIndex(1, new int[]{ 1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100 });
        assertEquals(0, index);

        index = search.findIndex(100, new int[]{ 1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100 });
        assertEquals(10, index);

        index = search.findIndex(77, new int[]{ 1, 5, 11, 12, 28, 50, 51, 75, 89, 99, 100 });
        assertEquals(8, index);

    }
}
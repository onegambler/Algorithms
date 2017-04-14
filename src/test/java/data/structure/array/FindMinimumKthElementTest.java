package data.structure.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumKthElementTest {

    FindMinimumKthElement findMinimumKthElement = new FindMinimumKthElement();

    @Test
    public void getKthBySorting() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(1, findMinimumKthElement.findBySorting(array, 1));
        assertEquals(2, findMinimumKthElement.findBySorting(array, 2));
        assertEquals(3, findMinimumKthElement.findBySorting(array, 3));
        assertEquals(4, findMinimumKthElement.findBySorting(array, 4));
        assertEquals(5, findMinimumKthElement.findBySorting(array, 5));
    }

    @Test
    public void getKthByBubbleSort() {
        int[] array = {10, 9, 4, 3, 5, 6, 7, 8, 2, 1};
        assertEquals(1, findMinimumKthElement.findWithBubbleSort(array, 1));
        assertEquals(2, findMinimumKthElement.findWithBubbleSort(array, 2));
        assertEquals(3, findMinimumKthElement.findWithBubbleSort(array, 3));
        assertEquals(4, findMinimumKthElement.findWithBubbleSort(array, 4));
        assertEquals(5, findMinimumKthElement.findWithBubbleSort(array, 5));
    }
}
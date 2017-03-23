package sorting;

/**
 * Bubble Sort  is a simple sorting algorithm that repeatedly steps through the list to be sorted, compares each pair
 * of adjacent items and swaps them if they are in the wrong order. The pass through the list is repeated until no
 * swaps are needed, which indicates that the list is sorted. The algorithm, which is a comparison sort, is named for
 * the way smaller or larger elements "bubble" to the top of the list. Although the algorithm is simple, it is too slow
 * and impractical for most problems even when compared to insertion sort.[2] It can be practical if the input is
 * usually in sorted order but may occasionally have some out-of-order elements nearly in position.
 *
 * Example:
 *
 * First Pass:
 *  ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
 *  ( 1 5 4 2 8 ) –> ( 1 4 5 2 8 ), Swap since 5 > 4
 *  ( 1 4 5 2 8 ) –> ( 1 4 2 5 8 ), Swap since 5 > 2
 *  ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
 *
 * Second Pass:
 *  ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
 *  ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
 *  ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 *  ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 *
 * Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole
 * pass without any swap to know it is sorted.
 *
 * Third Pass:
 *  ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 *  ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 *  ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 *  ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 *
 * <a href="https://www.tutorialspoint.com/data_structures_algorithms/bubble_sort_algorithm.htm">Link</a>
 */
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

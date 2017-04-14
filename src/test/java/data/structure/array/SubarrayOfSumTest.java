package data.structure.array;

import org.junit.Test;

public class SubarrayOfSumTest {

    private SubarrayOfSum subarrayOfSum = new SubarrayOfSum();

    @Test
    public void shouldFindSubarray() {
        int[] array = {1, 4, 20, 3, 10, 5};
        subarrayOfSum.find(array, 33);
        array = new int [] {1, 4, 0, 0, 3, 10, 5};
        subarrayOfSum.find(array, 7);
        array = new int [] {1, 4};
        subarrayOfSum.find(array, 0);
    }
}
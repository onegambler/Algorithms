package data.structure.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximalSubArrayTest {

    private MaximalSubArray maximalSubArray = new MaximalSubArray();

    @Test
    public void shouldPrintSum() {
        int sum = maximalSubArray.findSubArray(new int[]{1, -3, 5, -2, 9, -8, -6, 4});
        assertThat(sum).isEqualTo(12);
    }

    @Test
    public void shouldPrintSumDynamicProgramming() {
        int sum = maximalSubArray.findSubArrayDynamicProgramming(new int[]{1, -3, 5, -2, 9, -8, -6, 4});
        assertThat(sum).isEqualTo(12);
    }
}
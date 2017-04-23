package data.structure.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumSumNonAdjacentTest {

    private MaximumSumNonAdjacent m = new MaximumSumNonAdjacent();

    @Test
    public void shouldWorkCorrectly() {
        int[] ints = {5, 5, 10, 100, 10, 5};
        int sum = m.sum(ints);
        assertThat(sum).isEqualTo(110);

        ints = new int[]{1, 2, 3};
        sum = m.sum(ints);
        assertThat(sum).isEqualTo(4);

        ints = new int[]{1, 20, 3};
        sum = m.sum(ints);
        assertThat(sum).isEqualTo(20);
    }

    @Test
    public void shouldWorkCorrectlyWithDynamicProgramming() {
        int[] ints = {5, 5, 10, 100, 10, 5};
        int sum = m.sumWithDynamicProgramming(ints);
        assertThat(sum).isEqualTo(110);

        ints = new int[]{1, 2, 3};
        sum = m.sumWithDynamicProgramming(ints);
        assertThat(sum).isEqualTo(4);

        ints = new int[]{1, 20, 3};
        sum = m.sumWithDynamicProgramming(ints);
        assertThat(sum).isEqualTo(20);
    }


    @Test
    public void shouldWorkCorrectlyWithDynamicProgrammingImproved() {
        int[] ints = {5, 5, 10, 100, 10, 5};
        int sum = m.sumWithDynamicProgrammingImproved(ints);
        assertThat(sum).isEqualTo(110);

        ints = new int[]{1, 2, 3};
        sum = m.sumWithDynamicProgrammingImproved(ints);
        assertThat(sum).isEqualTo(4);

        ints = new int[]{1, 20, 3};
        sum = m.sumWithDynamicProgrammingImproved(ints);
        assertThat(sum).isEqualTo(20);
    }
}

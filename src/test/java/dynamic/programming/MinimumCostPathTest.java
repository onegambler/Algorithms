package dynamic.programming;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumCostPathTest {

    private MinimumCostPath minimumCostPath = new MinimumCostPath();

    @Test
    public void findCostShouldFindMinimumCostPath() {
        int[][] input =
                {
                        {1, 2, 3},
                        {4, 8, 2},
                        {1, 5, 3}
                };

        int minimum = minimumCostPath.findCost(input, 2, 2);
        assertThat(minimum).isEqualTo(8);
    }

    @Test
    public void findCostDynamicProgrammingShouldFindMinimumCostPath() {
        int[][] input =
                {
                        {1, 2, 3},
                        {4, 8, 2},
                        {1, 5, 3}
                };

        int minimum = minimumCostPath.findCostDynamicProgramming(input, 2, 2);
        assertThat(minimum).isEqualTo(8);
    }
}
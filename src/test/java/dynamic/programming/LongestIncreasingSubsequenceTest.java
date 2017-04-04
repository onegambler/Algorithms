package dynamic.programming;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestIncreasingSubsequenceTest {

    private LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();

    @Test
    public void shouldReturnCorrectValue() {
        int[] array = {15, 27, 14, 38, 26, 55, 46, 65, 85};
        assertThat(lis.getLongestIncreasingSubsequence(array)).isEqualTo(6);
    }
}
package data.structure.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Find2SumTest {

    private Find2Sum find2Sum = new Find2Sum();

    @Test
    public void shouldWork() {

        assertThat(find2Sum.exist(new int[]{1, 2, 3, 4}, 7)).isTrue();
        assertThat(find2Sum.exist(new int[]{1, 2, 3, 4}, 8)).isFalse();
        assertThat(find2Sum.exist(new int[]{1, 2, 7, 10, 20, 30, 40}, 8)).isTrue();
    }
}
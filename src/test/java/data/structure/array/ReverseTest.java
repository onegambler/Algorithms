package data.structure.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseTest {
    Reverse reverse = new Reverse();

    @Test
    public void shouldReverse() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        reverse.reverse(array);
        assertThat(array).isEqualTo(new int[]{7, 6, 5, 4, 3, 2, 1});
    }
}
package data.structure.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MoveZeroesTest {

    private MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void shouldMoveZeroesAtTheEndOfArray() {
        final int[] array = {1, 2, 0, 3, 0, 1, 2};
        moveZeroes.move(array);
        assertThat(array).isEqualTo(new int[]{1, 2, 2, 3, 1, 0, 0});
    }
}
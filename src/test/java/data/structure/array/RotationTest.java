package data.structure.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotationTest {

    Rotation rotation = new Rotation();

    @Test
    public void shouldRotate() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        rotation.rotate(array, 2);
        assertThat(array).isEqualTo(new int[]{3, 4, 5, 6, 7, 1, 2});
    }

    @Test
    public void shouldRotateOneByOne() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        rotation.rotateOneByOne(array, 2);
        assertThat(array).isEqualTo(new int[]{3, 4, 5, 6, 7, 1, 2});
    }
}
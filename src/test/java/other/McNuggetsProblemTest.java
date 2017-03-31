package other;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class McNuggetsProblemTest {

    private McNuggetsProblem mcNuggetsProblem = new McNuggetsProblem();

    @Test
    public void shouldReturnCorrectValue() {
        assertThat(mcNuggetsProblem.solveForNumber(5)).isFalse();
        assertThat(mcNuggetsProblem.solveForNumber(6)).isTrue();
        assertThat(mcNuggetsProblem.solveForNumber(7)).isFalse();
        assertThat(mcNuggetsProblem.solveForNumber(12)).isTrue();
        assertThat(mcNuggetsProblem.solveForNumber(21)).isTrue();
        assertThat(mcNuggetsProblem.solveForNumber(23)).isFalse();
        assertThat(mcNuggetsProblem.solveForNumber(43)).isFalse();
        assertThat(mcNuggetsProblem.solveForNumber(100)).isTrue();
    }
}
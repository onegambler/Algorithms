package other;

import org.junit.Test;
import other.ClockAngleAlgorithm.ClockTime;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ClockAngleAlgorithmTest {
    private ClockAngleAlgorithm problem = new ClockAngleAlgorithm();

    @Test
    public void whenMiddayThenReturnZeroAngle() {
        ClockTime time = new ClockTime(0, 0);
        double angle = problem.getAngle(time);
        assertThat(angle, equalTo(0D));
    }

    @Test
    public void whenThreeOClockThenReturnRightAngle() {
        ClockTime time = new ClockTime(3, 0);
        double angle = problem.getAngle(time);
        assertThat(angle, equalTo(90D));
    }

    @Test
    public void whenFourFifteenThenReturnRightAngle() {
        ClockTime time = new ClockTime(4, 15);
        double angle = problem.getAngle(time);
        assertThat(angle, equalTo(37.5));
    }

    @Test
    public void whenThreeFifteenThenReturnRightAngle() {
        ClockTime time = new ClockTime(3, 15);
        double angle = problem.getAngle(time);
        assertThat(angle, equalTo(7.5));
    }

}

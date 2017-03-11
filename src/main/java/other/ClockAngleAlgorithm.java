package other;

/**
 * <a href="https://en.wikipedia.org/wiki/Clock_angle_problem">Clock Angle Problem</a>
 *
 * Clock angle problems are a type of mathematical problem which involve finding the angles between the hands of an
 * analog clock. By “clock angle” we mean the measurement of angle θ whose region does not include the 12 o'clock
 * position; θ is not necessarily an acute angle.
 */
public class ClockAngleAlgorithm {

    public double getAngle(ClockTime time) {
        double minutesAngle = 5.5 * time.minutes;
        double hoursAngle = 30 * time.hours;

        return Math.abs(hoursAngle - minutesAngle);
    }

    public static class ClockTime {
        private int minutes;
        private int hours;

        public ClockTime(int hours, int minutes) {
            this.hours = hours;
            this.minutes = minutes;
        }
    }
}

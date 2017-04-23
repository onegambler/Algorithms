package maths;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FindNumberTest {

    private FindNumber findNumber = new FindNumber();

    @Test
    public void shouldFindBiggestNumber() {
        int biggestNumber = findNumber.findBiggestNumber(23456);
        Assertions.assertThat(biggestNumber).isEqualTo(65432);

        biggestNumber = findNumber.findBiggestNumber(827346823);
        Assertions.assertThat(biggestNumber).isEqualTo(887643322);
    }

    @Test
    public void shouldFindBiggerNumber() {
        int biggestNumber = findNumber.findNextBiggerNumber(23456);
        Assertions.assertThat(biggestNumber).isEqualTo(23465);

        biggestNumber = findNumber.findBiggestNumber(218765);
        Assertions.assertThat(biggestNumber).isEqualTo(251678);
    }
}
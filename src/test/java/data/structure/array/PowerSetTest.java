package data.structure.array;

import org.junit.Test;

import java.util.List;
import java.util.Set;

public class PowerSetTest {

    private PowerSet powerSet = new PowerSet();

    @Test
    public void test() {
        List<Set<Integer>> powerSet = this.powerSet.findPowerSet(new int[]{1, 2, 3, 4});
        System.out.println("powerSet = " + powerSet);
    }
}
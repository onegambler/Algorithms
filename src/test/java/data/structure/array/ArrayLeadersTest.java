package data.structure.array;

import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayLeadersTest {

    private ArrayLeaders arrayLeaders = new ArrayLeaders();

    @Test
    public void shouldPrintLeadersWithDoubleLoop() {
        int[] array = {16, 17, 4, 3, 5, 2};
        Set<Integer> leadersWithDoubleLoop = arrayLeaders.getLeadersWithDoubleLoop(array);
        assertThat(leadersWithDoubleLoop).containsOnly(17, 5, 2);
    }
    @Test
    public void shouldPrintLeadersWithScanningFromRight() {
        int[] array = {16, 17, 4, 3, 5, 2};
        Set<Integer> leadersWithDoubleLoop = arrayLeaders.getLeadersScanningFromRight(array);
        assertThat(leadersWithDoubleLoop).containsOnly(17, 5, 2);
    }
}
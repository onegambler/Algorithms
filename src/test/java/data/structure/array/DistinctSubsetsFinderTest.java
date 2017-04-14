package data.structure.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class DistinctSubsetsFinderTest {

    private DistinctSubsetsFinder subsetsFinder = new DistinctSubsetsFinder();

    @Test
    public void test() {
        List<Set<Integer>> subsets = subsetsFinder.findSubsets(3, 2);
        Set<Integer> first = new HashSet<>(Arrays.asList(0, 1));
        Set<Integer> second = new HashSet<>(Arrays.asList(0, 2));
        Set<Integer> third = new HashSet<>(Arrays.asList(1, 2));
        assertThat(subsets).hasSize(3)
                .containsOnly(first, second, third);
    }
}
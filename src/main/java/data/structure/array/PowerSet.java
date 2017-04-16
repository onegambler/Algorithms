package data.structure.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Power Set Power set P(S) of a set S is the set of all subsets of S. For example S = {a, b, c} then
 * P(s) = {{}, {a}, {b}, {c}, {a,b}, {a, c}, {b, c}, {a, b, c}}.
 *
 * If S has n elements in it then P(s) will have 2^n elements
 */
public class PowerSet {

    /**
     * Time Complexity O(n*2^n)
     */
    public List<Set<Integer>> findPowerSet(int[] array) {

        List<Set<Integer>> solution = new ArrayList<>();
        solution.add(new HashSet<>()); // empty solution
        for (int i = 1; i < array.length; i++) {
            powerSet(new HashSet<>(), i, 0, array, solution);
        }

        Set<Integer> collect = IntStream.of(array).boxed().collect(Collectors.toSet());
        solution.add(collect); // full solution

        return solution;
    }

    private void powerSet(Set<Integer> current, int size, int index, int[] array, List<Set<Integer>> solution) {
        if (current.size() == size) {
            solution.add(new HashSet<>(current));
            return;
        }

        if (index == array.length) return;

        current.add(array[index]);
        powerSet(current, size, index + 1, array, solution);

        current.remove(array[index]);
        powerSet(current, size, index + 1, array, solution);
    }

    /**
     * Time Complexity (2^n)
     */
    public List<Set<Integer>> findPowerSetWithoutForCycle(int[] array) {

        Set<Set<Integer>> solution = new HashSet<>();
        solution.add(new HashSet<>());
        powerSetWithoutForCycle(new HashSet<>(), 0, array, solution);
        return new ArrayList<>(solution);
    }

    private void powerSetWithoutForCycle(Set<Integer> current, int index, int[] array, Set<Set<Integer>> solution) {

        if (!solution.contains(current)) {
            solution.add(new HashSet<>(current));
        }

        if (index == array.length) return;

        current.add(array[index]);
        powerSetWithoutForCycle(current, index + 1, array, solution);

        current.remove(array[index]);
        powerSetWithoutForCycle(current, index + 1, array, solution);
    }
}

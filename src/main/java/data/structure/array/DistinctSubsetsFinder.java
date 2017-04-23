package data.structure.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a function which prints out all distinct subsets of length L of a set of integer sequence
 * like 1, 2, 3, 4, 5, 6 (size of this particular set is 6 elements). The function get two parameters
 * S and L (S is set size, L is subset size). For example, for S=3 and L=2 the result should be "1 2",
 * "1 3", "2 3".
 */
public class DistinctSubsetsFinder {

    public List<Set<Integer>> findSubsets(int n, int length) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        ArrayList<Set<Integer>> result = new ArrayList<>();
        find(new HashSet<>(), array, length, 0, result);

        return result;
    }

    private void find(Set<Integer> current, int[] array, int length, int idx, List<Set<Integer>> result) {

        if (current.size() == length) {
            result.add(current);
            return;
        }

        if (idx == array.length) return;

        //case adding the element
        HashSet<Integer> contains = new HashSet<>(current);
        contains.add(array[idx]);
        find(contains, array, length, idx + 1, result);

        //case not adding
        HashSet<Integer> notContains = new HashSet<>(current);
        find(notContains, array, length, idx + 1, result);
    }
}
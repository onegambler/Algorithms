package string;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StringPermutationTest {

    private StringPermutation stringPermutation = new StringPermutation();

    @Test
    public void shouldPrintAllPermutations() {
        List<String> result = stringPermutation.getPermutations("ab");
        assertThat(result).containsExactly("ab", "ba");

        result = stringPermutation.getPermutations("abc");
        assertThat(result).containsExactly("abc", "acb", "bac", "bca", "cab", "cba");

        result = stringPermutation.getPermutations("abcd");
        assertThat(result).containsExactly("abcd", "abdc", "acbd", "acdb", "adbc", "adcb", "bacd",
                "badc", "bcad", "bcda", "bdac", "bdca", "cabd", "cadb", "cbad", "cbda", "cdab", "cdba",
                "dabc", "dacb", "dbac", "dbca", "dcab", "dcba");
    }
}
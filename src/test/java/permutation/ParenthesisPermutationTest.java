package permutation;

import org.junit.Test;

public class ParenthesisPermutationTest {

    private ParenthesisPermutation parenthesisPermutation = new ParenthesisPermutation();

    @Test
    public void shouldPrintPermutations() {
        parenthesisPermutation.printFor(3);
    }
}
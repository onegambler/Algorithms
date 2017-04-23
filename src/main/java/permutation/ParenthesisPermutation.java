package permutation;

import java.util.Collections;

public class ParenthesisPermutation {

    public void printFor(int n) {
        printPermutation("", n, n);
    }

    private void printPermutation(String prefix, int left, int right) {
        if (left == 0) {
            System.out.println(prefix + String.join("", Collections.nCopies(right, ")")));
            return;
        }

        printPermutation(prefix + "(", left - 1, right);
        if (right > left) {
            printPermutation(prefix + ")", left, right - 1);
        }
    }
}

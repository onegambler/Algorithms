package other;

/**
 * A McNugget number is a positive integer that can be obtained by adding together orders of McDonald's®
 * Chicken McNuggetsTM (prior to consuming any), which originally came in boxes of 6, 9, and 20.
 * Given an integer K, determine if it can be represented in a sum of different boxes.
 *
 * Examples
 * 3 -> NO: no boxes can give you only three nuggets
 * 6 -> YES: one box of size 6
 * 12 -> YES: two boxes of size 6
 * 15 -> NO: you ca reach 12 with 2 boxes but you have 3 left
 * 26 -> YES: one box of size 20 and one of size 6
 */
public class McNuggetsProblem {

    /**
     *
     * O(
     */
    public boolean solveForNumber(int withK) {
        return canDo(withK);
    }

    private boolean canDo(int remaining) {

        if (remaining == 0) {
            return true;
        }

        if (remaining < 6) {
            return false;
        }

        int withSix = remaining - 6;
        int withNine = remaining - 9;
        int withTwenty = remaining - 20;

        return canDo(withSix) || canDo(withNine) || canDo(withTwenty);
    }

    /**
     * O(n*k)
     */
    public boolean solveForNumberDynamicProgramming(int withK) {

        int[] helper = new int[withK + 1];
        helper[0] = 1;

        for (int i = 1; i <= withK; i++) {
            for (int j = 0; j < withK; j++) {
                if (helper[j] == 1 && helper[i] == 0) {
                    if (j + 6 == i || j + 9 == i || j + 20 == i) {
                        helper[i] = 1;
                    }
                }
            }
        }

        return helper[withK] == 1;
    }
}

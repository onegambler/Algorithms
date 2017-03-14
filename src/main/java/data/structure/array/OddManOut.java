package data.structure.array;

/**
 * You're  given  an  unsorted  array  of  integers  where  every  integer  appears  exactly  twice,  except
 * for  one  integer  which  appears  only  once.   Write  an  algorithm  that  finds  the  integer  that  appears  only  once.
 */
public class OddManOut {

    /**
     * Complexity O(n) time and O(1) space
     */
    public int findOddMan(int[] array) {
        int odd = 0;
        for (int value : array) {
            odd ^= value;
        }
        return odd;
    }
}

package string;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the longest substring with K unique characters.
 *
 * Take string “aabbccdd” as an example.
 * if K is 1, the longest substring can be “aa”.
 * If K is 2, the longest substring can be “aabb”.
 * If K is 3, the longest substring can be “aabbcc”.
 */
public class LongestSubstringOfKUniqueCharacters {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public String find(String string, int m) {
        String longest = "";
        int i = 0;
        int j = 1;

        char [] stringCharArray = string.toCharArray();
        while(j < stringCharArray.length) {
            Set<Character> charsSet = new HashSet<>();
            for(int k = i ; k < j; k++) {
                charsSet.add(stringCharArray[k]);
            }

            if(charsSet.size() <= m) {
                String newString = new String(stringCharArray, i, j - i);
                longest = longest.length() >= newString.length() ? longest : newString;
                j++;
            } else {
                i++;
            }
        }

        return longest;
    }
}

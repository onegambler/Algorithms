package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) that prints all
 * occurrences of pat[] and its permutations (or anagrams) in txt[]. You may assume that n > m.
 * Expected time complexity is O(n)
 * <p>
 * Examples:
 * <p>
 * 1) Input:  txt[] = "BACDGABCDA"  pat[] = "ABCD"
 *    Output:   Found at Index 0
 *              Found at Index 5
 *              Found at Index 6
 * 2) Input: txt[] =  "AAABABAA" pat[] = "AABA"
 *    Output:   Found at Index 0
 *              Found at Index 1
 *              Found at Index 4
 */
public class AnagramSubstringSearch {

    public void find(String text, String substring) {

        int i = 0;
        int j = substring.length();

        char [] textCharArray = text.toCharArray();
        char [] substringCharArray = substring.toCharArray();

        while(j < text.length() + 1) {

            int [] charCount = new int[52];
            for(int k = i; k < j; k++){
                charCount[textCharArray[k] - 'A']++;
                charCount[substringCharArray[k % substringCharArray.length] - 'A']--;
            }

            boolean found = true;
            for (int aCharCount : charCount) {
                if (aCharCount != 0) {
                    found = false;
                    break;
                }
            }

            if(found) {
                System.out.println("found at index = " + i);
            }


            i++;
            j++;
        }
    }
}

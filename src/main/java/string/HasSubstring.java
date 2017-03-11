package string;

/**
 * Write  a  program  to  determine  whether  an  input  string  x  is  a  substring  of  another  input  string  y.
 *   (For  example,  "bat"  is  a  substring  of  "abate",  but  not  of  "beat".)
 */
public class HasSubstring {

    /**
     * Complexity O(n)
     */
    public boolean hasSubstring(String inputString, String supposedSubstring) {

        char[] inputStringChars = inputString.toCharArray();
        char[] supposedSubstringChars = supposedSubstring.toCharArray();
        for (int i = 0; i < inputStringChars.length; ) {
            if (inputStringChars[i] == supposedSubstringChars[0]) {
                boolean found = true;
                int matchingIndex = i;
                for (char supposedSubstringChar : supposedSubstringChars) {
                    if (inputStringChars[matchingIndex] != supposedSubstringChar) {
                        found = false;
                        i++;
                        break;
                    }
                    matchingIndex++;
                }
                if (found) {
                    return true;
                }
            } else {
                i++;
            }
        }

        return false;
    }
}

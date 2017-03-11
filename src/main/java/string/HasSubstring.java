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
                for (int j = 0; j < supposedSubstringChars.length; j++) {
                    if (inputStringChars[i + j] != supposedSubstringChars[j]) {
                        found = false;
                        i++;
                        break;
                    }
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

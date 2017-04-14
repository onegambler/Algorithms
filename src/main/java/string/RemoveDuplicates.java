package string;

/**
 * Design an algorithm and write code to remove the duplicate characters in a string without using any additional
 * buffer. NOTE: One or two additional variables are fine. An extra copy of the array is not.
 */
public class RemoveDuplicates {

    private static int[] PRIME_NUMBERS = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
            73, 79, 83, 89, 97, 101, 103};

    public String removeDuplicates(String string) {
        char[] stringChars = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int prod = 1;
        for (int i = 0; i < stringChars.length; i++) {
            int prime = PRIME_NUMBERS[stringChars[i] - 'a'];
            if (prod % prime == 0) {
                stringChars[i] = '/';
            } else {
                prod *= prime;
                stringBuilder.append(stringChars[i]);
            }
        }

        return stringBuilder.toString();
    }
}

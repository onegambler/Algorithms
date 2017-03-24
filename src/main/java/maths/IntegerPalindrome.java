package maths;

/**
 * Given an integer, write a function that returns true if the given number is palindrome, else false.
 * For example, 12321 is palindrome, but 1451 is not palindrome.
 */
public class IntegerPalindrome {

    public boolean isPalindrome(int integer) {
        integer = Math.abs(integer);
        while (integer > 9) {
            int left = integer % 10;
            int right = integer;
            int count = 0;
            while (right > 9) {
                right = right / 10;
                count++;
            }
            integer -= right * Math.pow(10, count);
            integer /= 10;
            if (left != right) {
                return false;
            }
        }

        return true;
    }
}
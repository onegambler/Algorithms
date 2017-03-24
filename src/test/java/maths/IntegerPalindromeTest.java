package maths;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerPalindromeTest {

    private IntegerPalindrome palindrome = new IntegerPalindrome();

    @Test
    public void shouldReturnTrueIfNumberIsPalindrome() {
        assertTrue(palindrome.isPalindrome(121));
        assertTrue(palindrome.isPalindrome(1));
        assertTrue(palindrome.isPalindrome(543212345));
        assertTrue(palindrome.isPalindrome(55555));
        assertTrue(palindrome.isPalindrome(1221));
        assertTrue(palindrome.isPalindrome(-1221));
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotPalindrome() {
        assertFalse(palindrome.isPalindrome(122));
        assertFalse(palindrome.isPalindrome(12));
        assertFalse(palindrome.isPalindrome(54312345));
        assertFalse(palindrome.isPalindrome(1234));
        assertFalse(palindrome.isPalindrome(-124));
    }
}
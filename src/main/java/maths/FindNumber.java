package maths;

import java.util.Arrays;


public class FindNumber {

    /**
     * Arrange Given Numbers To Form The Biggest Number Possible
     * Write a function that takes a number as input and outputs the biggest number with the same set of digits.
     * For example, suppose the input is 423865, then the biggest number with these digits is 865432.
     */
    public int findBiggestNumber(int number) {
        int[] digits = getNumberDigitsArray(number);
        Arrays.sort(digits);
        return getNumberFromDigitsArray(digits);
    }

    /**
     * How can you get the next greater number with the same set of digits?
     * For example, suppose the input is 423862, then the biggest number with these digits is 426238.
     */
    public int findNextBiggerNumber(int number) {

        int[] digits = getNumberDigitsArray(number);


        // I) Start from the right most digit and find the first digit that is
        // smaller than the digit next to it.
        int firstSmallerIndex;
        for (firstSmallerIndex = digits.length - 1; firstSmallerIndex > 0; firstSmallerIndex--) {
            if (digits[firstSmallerIndex] > digits[firstSmallerIndex - 1]) {
                break;
            }
        }

        // If no such digit is found, then all digits are in descending order
        // means there cannot be a greater number with same set of digits
        if (firstSmallerIndex == 0) {
            return number;
        }

        int secondBiggerIndex = firstSmallerIndex;
        for (int i = firstSmallerIndex + 1; i < digits.length; i++) {
            if (digits[i] > digits[secondBiggerIndex]) {
                secondBiggerIndex = i;
            }
        }

        swap(digits, firstSmallerIndex, secondBiggerIndex);

        Arrays.sort(digits, 0, firstSmallerIndex);

        return getNumberFromDigitsArray(digits);
    }

    private int[] getNumberDigitsArray(int number) {
        int digitsCount = 0;

        int temp = number;
        while (temp > 0) {
            temp /= 10;
            digitsCount++;
        }

        int[] digits = new int[digitsCount];

        int currentIndex = 0;
        while (number > 0) {
            digits[currentIndex] = number % 10;
            number /= 10;
            currentIndex++;
        }
        return digits;
    }

    private int getNumberFromDigitsArray(int[] digits) {
        int biggestNumber = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            biggestNumber *= 10;
            biggestNumber += digits[i];
        }

        return biggestNumber;
    }

    private void swap(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

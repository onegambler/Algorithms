package maths;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciSequenceTest {

    private FibonacciSequence sequence = new FibonacciSequence();

    @Test
    public void shouldCalculateCorrectValue() {
        assertEquals(1, sequence.getFibonacciValue(0));
        assertEquals(1, sequence.getFibonacciValue(1));
        assertEquals(2, sequence.getFibonacciValue(2));
        assertEquals(3, sequence.getFibonacciValue(3));
        assertEquals(5, sequence.getFibonacciValue(4));
        assertEquals(8, sequence.getFibonacciValue(5));
        assertEquals(13, sequence.getFibonacciValue(6));
    }

    @Test
    public void shouldCalculateCorrectValueWithDynamicProgrammingVersion() {
        assertEquals(1, sequence.getFibonacciDynamicProgramming(0));
        assertEquals(1, sequence.getFibonacciDynamicProgramming(1));
        assertEquals(2, sequence.getFibonacciDynamicProgramming(2));
        assertEquals(3, sequence.getFibonacciDynamicProgramming(3));
        assertEquals(5, sequence.getFibonacciDynamicProgramming(4));
        assertEquals(8, sequence.getFibonacciDynamicProgramming(5));
        assertEquals(13, sequence.getFibonacciDynamicProgramming(6));
    }

    @Test
    public void shouldCalculateCorrectValueWithIterativeVersion() {
        assertEquals(1, sequence.getFibonacciIterative(0));
        assertEquals(1, sequence.getFibonacciIterative(1));
        assertEquals(2, sequence.getFibonacciIterative(2));
        assertEquals(3, sequence.getFibonacciIterative(3));
        assertEquals(5, sequence.getFibonacciIterative(4));
        assertEquals(8, sequence.getFibonacciIterative(5));
        assertEquals(13, sequence.getFibonacciIterative(6));
    }
}
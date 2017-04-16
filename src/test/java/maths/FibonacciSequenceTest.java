package maths;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciSequenceTest {

    FibonacciSequence sequence = new FibonacciSequence();

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
        assertEquals(1, sequence.getFibonaccyDynamicProgramming(0));
        assertEquals(1, sequence.getFibonaccyDynamicProgramming(1));
        assertEquals(2, sequence.getFibonaccyDynamicProgramming(2));
        assertEquals(3, sequence.getFibonaccyDynamicProgramming(3));
        assertEquals(5, sequence.getFibonaccyDynamicProgramming(4));
        assertEquals(8, sequence.getFibonaccyDynamicProgramming(5));
        assertEquals(13, sequence.getFibonaccyDynamicProgramming(6));
    }
}
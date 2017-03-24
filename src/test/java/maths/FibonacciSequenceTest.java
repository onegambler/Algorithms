package maths;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciSequenceTest {

    FibonacciSequence sequence = new FibonacciSequence();

    @Test
    public void shouldCalculateCorrectValue() {
        assertEquals(1, sequence.getValue(0));
        assertEquals(1, sequence.getValue(1));
        assertEquals(2, sequence.getValue(2));
        assertEquals(3, sequence.getValue(3));
        assertEquals(5, sequence.getValue(4));
        assertEquals(8, sequence.getValue(5));
        assertEquals(13, sequence.getValue(6));
    }
}
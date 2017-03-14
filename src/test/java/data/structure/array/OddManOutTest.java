package data.structure.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddManOutTest {

    private OddManOut oddManOut = new OddManOut();

    @Test
    public void getTheIntegerOnlyAppearingOnce() {
        int odd = oddManOut.findOddMan(new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5});
        assertEquals(3, odd);

        odd = oddManOut.findOddMan(new int[]{1, 2, 2, 3, 3, 4, 4, 5, 5});
        assertEquals(1, odd);

        odd = oddManOut.findOddMan(new int[]{1});
        assertEquals(1, odd);
    }
}
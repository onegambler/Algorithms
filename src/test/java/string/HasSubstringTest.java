package string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HasSubstringTest {

    private HasSubstring hasSubstring = new HasSubstring();

    @Test
    public void whenNotSubstringThenReturnFalse() {
        String inputString = "hello";
        String supposedSubstring = "nope";
        boolean result = hasSubstring.hasSubstring(inputString, supposedSubstring);
        assertFalse(result);
    }

    @Test
    public void whenIsSubstringThenReturnTrue() {
        String inputString = "something";
        String supposedSubstring = "ethi";
        boolean result = hasSubstring.hasSubstring(inputString, supposedSubstring);
        assertTrue(result);
    }



    @Test
    public void whenSubstringHasMultipleStartMatchesButStillAMatchReturnTrue() {
        String inputString = "bababaco";
        String supposedSubstring = "babaco";
        boolean result = hasSubstring.hasSubstring(inputString, supposedSubstring);
        assertTrue(result);
    }
}
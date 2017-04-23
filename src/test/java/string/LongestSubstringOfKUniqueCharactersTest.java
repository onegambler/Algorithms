package string;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class LongestSubstringOfKUniqueCharactersTest {

    private LongestSubstringOfKUniqueCharacters longest = new LongestSubstringOfKUniqueCharacters();

    @Test
    public void shouldReturnTheLongestSubstring() {
        String longestString = longest.find("aabbccdd", 1);
        assertThat(longestString).isEqualTo("aa");

        longestString = longest.find("aabbccdd", 2);
        assertThat(longestString).isEqualTo("aabb");

        longestString = longest.find("aabbccdd", 3);
        assertThat(longestString).isEqualTo("aabbcc");
    }
}
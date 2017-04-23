package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramSubstringSearchTest {

    AnagramSubstringSearch anagramSubstringSearch = new AnagramSubstringSearch();

    @Test
    public void shouldFindAnagrams() {
        anagramSubstringSearch.find("BACDGABCDA", "ABCD");
    }
}
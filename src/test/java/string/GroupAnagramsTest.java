package string;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GroupAnagramsTest {

    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void groupAnagramsWorksAsExpected() {
        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams.groupAnagrams(array);
        assertEquals(3, lists.size());
        assertThat(lists.get(0), containsInAnyOrder("tea", "eat", "ate"));
        assertThat(lists.get(1), hasItem("bat"));
        assertThat(lists.get(2), containsInAnyOrder("nat", "tan"));
    }

    @Test
    public void groupAnagramsWithPrimeNumbersWorksAsExpected() {
        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams.groupAnagramsUsingPrimeNumbers(array);
        assertEquals(3, lists.size());
        assertThat(lists.get(0), containsInAnyOrder("tea", "eat", "ate"));
        assertThat(lists.get(1), containsInAnyOrder("nat", "tan"));
        assertThat(lists.get(2), hasItem("bat"));
    }
}
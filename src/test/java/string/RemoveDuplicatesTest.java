package string;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void shouldRemoveDuplicates() {
        String str = removeDuplicates.removeDuplicates("abbaco");
        assertThat(str).isEqualTo("abco");
        str = removeDuplicates.removeDuplicates("cabala");
        assertThat(str).isEqualTo("cabl");
    }
}
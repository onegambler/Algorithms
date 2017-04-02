package other;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeastRecentlyUsedCacheTest {

    private LeastRecentlyUsedCache<String, String> cache;

    @Test
    public void shouldAddItemToCache() {
        cache = new LeastRecentlyUsedCache<>(1);
        cache.add("One", "Two");
        assertThat(cache.get("One")).isEqualTo("Two");
    }

    @Test
    public void whenCacheIsFullRemoveLeastRecentItem() {
        cache = new LeastRecentlyUsedCache<>(1);
        cache.add("One", "Two");
        cache.add("Three", "Four");
        assertThat(cache.get("One")).isNull();
        assertThat(cache.get("Three")).isEqualTo("Four");
    }
}
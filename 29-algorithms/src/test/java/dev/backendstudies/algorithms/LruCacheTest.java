package dev.backendstudies.algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LruCacheTest {

    @Test
    void evictsTheLeastRecentlyUsedEntry() {
        var cache = new LruCache<String, Integer>(2);
        cache.put("a", 1);
        cache.put("b", 2);
        cache.get("a");          // "a" becomes the most recently used
        cache.put("c", 3);       // evicts "b"

        assertThat(cache.get("b")).isNull();
        assertThat(cache.get("a")).isEqualTo(1);
        assertThat(cache.get("c")).isEqualTo(3);
        assertThat(cache.size()).isEqualTo(2);
    }

    @Test
    void rejectsInvalidCapacity() {
        assertThatThrownBy(() -> new LruCache<String, Integer>(0))
                .isInstanceOf(IllegalArgumentException.class);
    }
}

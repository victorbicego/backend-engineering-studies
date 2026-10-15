package dev.backendstudies.algorithms;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Classic interview question. Short version using LinkedHashMap in access order.
 * Exercise: re-implement it with a HashMap and your own doubly linked list.
 */
public final class LruCache<K, V> {

    private final Map<K, V> map;

    public LruCache(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity must be > 0");
        }
        this.map = new LinkedHashMap<>(16, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
    }

    public V get(K key) {
        return map.get(key);
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public int size() {
        return map.size();
    }
}

package data.structure.hashmap;

import java.util.LinkedList;

public class MyHashMap<K, V> {

    private static int TABLE_SIZE = 1024;
    @SuppressWarnings("unchecked")
    private final LinkedList<Entry<K, V>>[] table = new LinkedList[TABLE_SIZE];

    public V get(K key) {
        int hash = key.hashCode() % TABLE_SIZE;
        LinkedList<Entry<K, V>> entries = table[hash];
        if (entries != null) {
            for (Entry<K, V> entry : entries) {
                if (key.equals(entry.key)) {
                    return entry.value;
                }
            }
        }

        return null;
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value);
        int hash = key.hashCode() % TABLE_SIZE;
        if (table[hash] == null) {
            table[hash] = new LinkedList<>();
        }
        table[hash].add(entry);
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        private Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

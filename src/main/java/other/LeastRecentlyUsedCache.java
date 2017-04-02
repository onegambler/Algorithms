package other;

import java.util.HashMap;
import java.util.Map;

public class LeastRecentlyUsedCache<K, T> {

    private final int capacity;
    private int size;
    private Node<K, T> head = new Node<>();
    private Node<K, T> tail = new Node<>();
    private Map<K, T> map = new HashMap<>();

    public LeastRecentlyUsedCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.previous = head;
    }


    public T get(K key) {
        if (map.containsKey(key)) {
            T value = map.get(key);
            removeNode(value);
            addToHead(key, value);
            return value;
        }
        return null;
    }

    public void add(K key, T value) {
        if (size == capacity) {
            removeLast(tail.previous.key);
        }
        addToHead(key, value);
        map.put(key, value);
    }

    private void addToHead(K key, T value) {
        Node<K, T> newNode = new Node<>();
        newNode.value = value;
        newNode.key = key;
        head.next.previous = newNode;
        newNode.next = head.next;
        newNode.previous = head;
        head.next = newNode;
        size++;
    }

    private void removeLast(K key) {
        tail.previous = tail.previous.previous;
        tail.previous.next = tail;
        map.remove(key);
    }

    private void removeNode(T value) {
        Node<K, T> current = head;
        while (current != null) {
            if (current.value == value) {
                current.previous.next = current.next;
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }


    private static class Node<P, J> {
        private Node<P, J> previous;
        private Node<P, J> next;
        private J value;
        private P key;
    }

}

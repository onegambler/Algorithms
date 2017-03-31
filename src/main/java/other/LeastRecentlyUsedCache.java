package other;

import java.util.HashMap;
import java.util.Map;

public class LeastRecentlyUsedCache<T, K> {

    private final int capacity;
    private int size;
    private Node<T> head = new Node<>();
    private Node<T> tail = new Node<>();
    private Map<K, T> map = new HashMap<>();

    public LeastRecentlyUsedCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.previous = head;
    }


    public T get(K key) {
        if (map.containsKey(key)) {
            T t = map.get(key);
            removeNode(t);
            addToHead(t);
            return t;
        }
        return null;
    }

    public void add(K key, T value) {
        if (size == capacity) {
            removeLast(key);
        }
        addToHead(value);
        map.put(key, value);
    }

    private void addToHead(T value) {
        Node lastNode = tail.previous;
        Node newNode = new Node();
        newNode.value = value;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        newNode.next = tail;
        size++;
    }

    private void removeLast(K key) {
        tail.previous = tail.previous.previous;
        tail.previous.next = tail;
        map.remove(key);
    }

    private void removeNode(T value) {
        Node<T> current = head;
        while (current != null) {
            if (current.value == value) {
                current.previous.next = current.next;
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }


    private static class Node<J> {
        private Node<J> previous;
        private Node<J> next;
        private J value;
    }

}

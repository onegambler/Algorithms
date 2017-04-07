package other;

import java.util.HashMap;
import java.util.Map;

public class LeastRecentlyUsedCache<K, T> {

    private final int capacity;
    private Node<K, T> head = new Node<>();
    private Node<K, T> tail = new Node<>();
    private Map<K, Node<K, T>> map = new HashMap<>();

    public LeastRecentlyUsedCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.previous = head;
    }

    public T get(K key) {
        if (map.containsKey(key)) {
            Node<K, T> node = map.get(key);
            removeNode(node);
            addToHead(node);
            return node.value;
        }
        return null;
    }

    public void add(K key, T value) {
        if (map.size() == capacity) {
            removeLast(tail.previous.key);
        }
        Node<K, T> newNode = new Node<>();
        newNode.value = value;
        newNode.key = key;
        addToHead(newNode);
        map.put(key, newNode);
    }

    private void addToHead(Node<K, T> node) {
        head.next.previous = node;
        node.next = head.next;
        node.previous = head;
        head.next = node;
    }

    private void removeLast(K key) {
        tail.previous = tail.previous.previous;
        tail.previous.next = tail;
        map.remove(key);
    }

    private void removeNode(Node<K, T> node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }


    private static class Node<P, J> {
        private Node<P, J> previous;
        private Node<P, J> next;
        private J value;
        private P key;
    }

}

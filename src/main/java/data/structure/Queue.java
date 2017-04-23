package data.structure;

public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    public void enqueue(T value) {
        Node<T> newNode = new Node<T>(value);
        if(tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public T dequeue() {
        if(head == null) {
            return null;
        }

        T result = head.value;
        head = head.next;
        return result;
    }

    private class Node<J> {

        private J value;
        private Node<J> next;

        Node(J value){
            this.value = value;
        }

    }
}

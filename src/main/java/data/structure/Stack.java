package data.structure;

public class Stack<T> {

    private Node<T> top;

    public void push(T value) {
        Node<T> newTop = new Node<>(value);
        newTop.next = top;
        top = newTop;
    }

    public T pop() {
        T result = peek();
        top = top.next;
        return result;
    }

    public T peek() {
        if(top == null) {
            return null;
        }
        return top.value;
    }

    private class Node<J> {

        private J value;
        private Node<J> next;

        Node(J value){
            this.value = value;
        }

    }
}

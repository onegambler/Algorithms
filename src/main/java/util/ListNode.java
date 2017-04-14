package util;

public class ListNode {

    private int value;
    private ListNode next;
    private ListNode previous;

    public int getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public ListNode getPrevious() {
        return previous;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setPrevious(ListNode previous) {
        this.previous = previous;
    }
}

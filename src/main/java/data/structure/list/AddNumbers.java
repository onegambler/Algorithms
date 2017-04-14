package data.structure.list;

import util.ListNode;

/**
 * You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored
 * in reverse order, such that the 1’s digit is at the head of the list. Write a function that adds the two numbers and
 * returns the sum as a linked list.
 *
 * EXAMPLE
 * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 * ___________________
 */
public class AddNumbers {

    public ListNode sum(ListNode first, ListNode second) {
        ListNode result = new ListNode();
        int carry = 0;
        ListNode current = result;
        while (first != null && second != null) {
            int value = first.getValue() + second.getValue() + carry;
            if (value > 9) {
                carry = value / 10;
                value = value % 10;
            } else {
                carry = 0;
            }
            current.setValue(value);
            current.setNext(new ListNode());
            current = current.getNext();
            first = first.getNext();
            second = second.getNext();
        }

        while (first != null) {
            current.setValue(first.getValue());
            current.setNext(new ListNode());
            current = current.getNext();
            first = first.getNext();
        }

        while (second != null) {
            current.setValue(second.getValue());
            current.setNext(new ListNode());
            current = current.getNext();
            second = second.getNext();
        }

        return result;
    }
}

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
        return sumRecursive(first, second, 0);
    }


    private ListNode sumRecursive(ListNode first, ListNode second, int carry) {
        if (first == null && second == null) {
            return null;

        }
        ListNode result = new ListNode();
        int value = carry;
        if (first != null) {
            value += first.getValue();
        }
        if (second != null) {
            value += second.getValue();

        }
        result.setValue(value % 10);
        ListNode more = sumRecursive(first == null ? null : first.getNext(), second == null ? null : second.getNext(),
                value > 9 ? 1 : 0);
        result.setNext(more);
        return result;
    }
}

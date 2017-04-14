package data.structure.list;

import util.ListNode;

/**
 * Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
 *
 * EXAMPLE
 * Input: the node ‘c’ from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 */
public class RemoveNode {

    public void removeNode(ListNode node) {
        if (node.getNext() == null) {
            throw new IllegalArgumentException("Cannot remove last node");
        }

        ListNode next = node.getNext();
        node.setValue(next.getValue());
        node.setNext(next.getNext());
    }
}

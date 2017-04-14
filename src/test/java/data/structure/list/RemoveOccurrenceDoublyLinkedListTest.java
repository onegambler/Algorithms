package data.structure.list;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class RemoveOccurrenceDoublyLinkedListTest {

    private RemoveOccurrenceDoublyLinkedList remover = new RemoveOccurrenceDoublyLinkedList();

    @Test
    public void whenThereIsNoOccurrenceThenDoNothing() {
        ListNode testNode = getTestNode();
        remover.remove(4, testNode);

        assertNotNull(testNode);
        assertNotNull(testNode.getNext());
        assertNotNull(testNode.getNext().getNext());
        assertEquals(5, testNode.getValue());
        assertEquals(8, testNode.getNext().getValue());
        assertEquals(10, testNode.getNext().getNext().getValue());

    }

    @Test
    public void whenThereIsOccurrenceThenRemove() {
        ListNode testNode = getTestNode();
        remover.remove(8, testNode);

        assertNotNull(testNode);
        assertNotNull(testNode.getNext());
        assertNull(testNode.getPrevious());
        assertNull(testNode.getNext().getNext());
        assertEquals(5, testNode.getValue());
        assertEquals(10, testNode.getNext().getValue());
        assertEquals(testNode, testNode.getNext().getPrevious());

    }

    private ListNode getTestNode() {
        ListNode node = new ListNode();
        node.setValue(5);

        node.setNext(new ListNode());
        node.getNext().setValue(8);
        node.getNext().setPrevious(node);
        node.getNext().setNext(new ListNode());
        node.getNext().getNext().setValue(10);
        node.getNext().getNext().setPrevious(node.getNext());
        return node;
    }
}
package data.structure.list;

import util.ListNode;

/**
 * Write  a   function  to  remove  a  single  occurrence  of  an  integer  from  a  doubly  linked  list  if  it  is  present.
 */
public class RemoveOccurrenceDoublyLinkedList {

    public void remove(int i, ListNode testNode) {
        while (testNode != null) {
            if (testNode.getValue() == i) {
                if (testNode.getPrevious() != null) {
                    testNode.getPrevious().setNext(testNode.getNext());
                }

                if (testNode.getNext() != null) {
                    testNode.getNext().setPrevious(testNode.getPrevious());
                }

                return;
            } else {
                testNode = testNode.getNext();
            }
        }
    }
}

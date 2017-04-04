package data.structure.list;

/**
 * Write  a   function  to  remove  a  single  occurrence  of  an  integer  from  a  doubly  linked  list  if  it  is  present.
 */
public class RemoveOccurrenceDoublyLinkedList {

    public void remove(int i, Node testNode) {
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

    public static class Node {
        private int value;
        private Node next;
        private Node previous;

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }
}

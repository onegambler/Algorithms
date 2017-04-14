package data.structure.list;

import org.junit.Test;
import util.ListNode;

public class AddNumbersTest {

    AddNumbers addNumbers = new AddNumbers();

    @Test
    public void shouldAddNumbers() {
        ListNode first = createNode(new int[]{3, 1, 5});
        ListNode second = createNode(new int[]{5, 9, 2});
        ListNode sum = addNumbers.sum(first, second);
        while (sum != null) {
            System.out.println("sum = " + sum.getValue());
            sum = sum.getNext();
        }
    }

    private ListNode createNode(int[] array) {
        ListNode root = new ListNode();
        root.setValue(array[0]);
        ListNode current = root;
        for (int i = 1; i < array.length; i++) {
            ListNode newNode = new ListNode();
            newNode.setValue(array[i]);
            current.setNext(newNode);
            current = newNode;
        }

        return root;
    }
}
package binary.tree.util;

import util.Node;

import java.util.Arrays;

public class BinaryTreeGenerator<T extends Comparable<T>> {

    public Node<T> generateBinaryTree(T[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        Arrays.sort(values);
        return createNode(values, 0, values.length - 1);
    }

    private Node<T> createNode(T values[], int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (int) (Math.floor(start + end) / 2);
        Node<T> node = new Node<>();

        node.setValue(values[mid]);

        node.setLeftNode(createNode(values, start, mid - 1));

        node.setRightNode(createNode(values, mid + 1, end));

        return node;
    }
}

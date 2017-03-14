package binary.tree.util;

import util.Node;

public class BinaryTreeGenerator<T extends Comparable<T>> {

    public Node<T> generateBinaryTree(T rootNodeValue, T[] values) {
        Node<T> rootNode = new Node<T>();
        rootNode.setValue(rootNodeValue);
        for (T value : values) {
            addValueToTree(value, rootNode);
        }

        return rootNode;
    }

    private void addValueToTree(T value, Node<T> tree) {
        if (tree.getValue().compareTo(value) >= 1) {
            if (tree.getLeftNode() == null) {
                tree.setLeftNode(new Node<T>());
                tree.getLeftNode().setValue(value);
            } else {
                addValueToTree(value, tree.getLeftNode());
            }
        } else if (tree.getValue().compareTo(value) <= -1) {
            if (tree.getRightNode() == null) {
                tree.setRightNode(new Node<T>());
                tree.getRightNode().setValue(value);
            } else {
                addValueToTree(value, tree.getRightNode());
            }
        } else {
            throw new RuntimeException("Duplicate value" + value);
        }
    }
}

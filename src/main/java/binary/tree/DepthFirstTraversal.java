package binary.tree;

import util.Node;

public class DepthFirstTraversal {

    public <T extends Comparable<T>> void inOrderTraversal(Node<T> node) {
        if (node == null) return;
        inOrderTraversal(node.getLeftNode());
        visit(node);
        inOrderTraversal(node.getRightNode());
    }

    public <T extends Comparable<T>> void preOrderTraversal(Node<T> node) {
        if (node == null) return;
        visit(node);
        preOrderTraversal(node.getLeftNode());
        preOrderTraversal(node.getRightNode());
    }

    public <T extends Comparable<T>> void postOrderTraversal(Node<T> node) {
        if (node == null) return;
        postOrderTraversal(node.getLeftNode());
        postOrderTraversal(node.getRightNode());
        visit(node);
    }

    private <T extends Comparable<T>> void visit(Node<T> node) {
        System.out.print(" " + node.getValue() + " ");
    }
}

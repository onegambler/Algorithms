package binary.tree;

import util.Node;

import java.util.Stack;

public class BinaryTreeTraversal {

    public <T extends Comparable<T>> void inOrderTraversalRecursive(Node<T> node) {
        if (node == null) return;
        inOrderTraversalRecursive(node.getLeftNode());
        visit(node);
        inOrderTraversalRecursive(node.getRightNode());
    }

    public <T extends Comparable<T>> void inOrderTraversalIterative(Node<T> node) {
        Stack<Node<T>> stack = new Stack<>();
        Node<T> current = node;


        while(!stack.isEmpty() || current != null) {
            while(current != null) {
                stack.push(current);
                current = current.getLeftNode();
            }

            current = stack.pop();
            visit(current);
            current = current.getRightNode();
        }
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
        System.out.print(node.getValue() + " ");
    }
}

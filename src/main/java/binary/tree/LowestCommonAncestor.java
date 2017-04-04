package binary.tree;

import util.Node;

public class LowestCommonAncestor {

    public <T extends Comparable<T>> Node<T> lowestCommonAncestorBinaryTree(Node<T> root, Node<T> p, Node<T> q) {

        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        Node<T> left = lowestCommonAncestorBinaryTree(root.getLeftNode(), p, q);
        Node<T> right = lowestCommonAncestorBinaryTree(root.getRightNode(), p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;
    }

    public <T extends Comparable<T>> Node<T> lowestCommonAncestorSBT(Node<T> root, Node<T> p, Node<T> q) {

        if (root == null) {
            return null;
        }

        if (p.getValue().compareTo(root.getValue()) > 0 && q.getValue().compareTo(root.getValue()) > 0) {
            return lowestCommonAncestorSBT(root.getLeftNode(), p, q);
        }

        if (p.getValue().compareTo(root.getValue()) < 0 && q.getValue().compareTo(root.getValue()) < 0) {
            return lowestCommonAncestorSBT(root.getRightNode(), p, q);
        }

        return root;
    }
}

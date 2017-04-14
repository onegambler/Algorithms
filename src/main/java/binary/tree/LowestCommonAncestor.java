package binary.tree;

import util.TreeNode;

public class LowestCommonAncestor {

    public <T extends Comparable<T>> TreeNode<T> lowestCommonAncestorBinaryTree(TreeNode<T> root, TreeNode<T> p, TreeNode<T> q) {

        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode<T> left = lowestCommonAncestorBinaryTree(root.getLeftTreeNode(), p, q);
        TreeNode<T> right = lowestCommonAncestorBinaryTree(root.getRightTreeNode(), p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;
    }

    public <T extends Comparable<T>> TreeNode<T> lowestCommonAncestorSBT(TreeNode<T> root, TreeNode<T> p, TreeNode<T> q) {

        if (root == null) {
            return null;
        }

        if (p.getValue().compareTo(root.getValue()) > 0 && q.getValue().compareTo(root.getValue()) > 0) {
            return lowestCommonAncestorSBT(root.getLeftTreeNode(), p, q);
        }

        if (p.getValue().compareTo(root.getValue()) < 0 && q.getValue().compareTo(root.getValue()) < 0) {
            return lowestCommonAncestorSBT(root.getRightTreeNode(), p, q);
        }

        return root;
    }
}

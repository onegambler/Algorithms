package binary.tree;

import util.TreeNode;

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 *
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and
 * w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
 */
public class LowestCommonAncestor {

    /**
     * Time Complexity O(n)
     */
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

    /**
     * Time Complexity O(log n)
     */
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

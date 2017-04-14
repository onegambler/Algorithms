package binary.tree;

import util.TreeNode;

public class HeightBinaryTree {

    public <T extends Comparable<T>> boolean isBalanced(TreeNode<T> root) {
        if (root == null) return true;
        int lh = getMaxHeightRecursive(root.getLeftTreeNode());
        int rh = getMaxHeightRecursive(root.getRightTreeNode());
        return isBalanced(root.getLeftTreeNode())
                && isBalanced(root.getRightTreeNode())
                && Math.abs(lh - rh) <= 1;
    }

    public <T extends Comparable<T>> int getMinHeightRecursive(TreeNode<T> treeNode) {
        if (treeNode == null) {
            return 0;
        }

        if (isLeafNode(treeNode)) {
            return 1;
        }

        int left = getMinHeightRecursive(treeNode.getLeftTreeNode());
        int right = getMinHeightRecursive(treeNode.getRightTreeNode());

        return 1 + Math.min(left, right);
    }

    public <T extends Comparable<T>> int getMaxHeightRecursive(TreeNode<T> treeNode) {
        if (treeNode == null) {
            return 0;
        }

        if (isLeafNode(treeNode)) {
            return 1;
        }

        int left = getMaxHeightRecursive(treeNode.getLeftTreeNode());
        ;
        int right = getMaxHeightRecursive(treeNode.getRightTreeNode());

        return 1 + Math.max(left, right);
    }

    private <T extends Comparable<T>> boolean isLeafNode(TreeNode<T> treeNode) {
        return treeNode.getRightTreeNode() == null || treeNode.getLeftTreeNode() == null;
    }
}

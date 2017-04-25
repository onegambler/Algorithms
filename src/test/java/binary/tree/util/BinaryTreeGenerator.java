package binary.tree.util;

import util.TreeNode;

import java.util.Arrays;

public class BinaryTreeGenerator<T extends Comparable<T>> {

    public TreeNode<T> generateBinaryTree(T[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        Arrays.sort(values);
        return createNode(values, 0, values.length - 1);
    }

    private TreeNode<T> createNode(T values[], int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode<T> treeNode = new TreeNode<>(values[mid]);


        treeNode.setLeftTreeNode(createNode(values, start, mid - 1));
        treeNode.setRightTreeNode(createNode(values, mid + 1, end));

        return treeNode;
    }
}

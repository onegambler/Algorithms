package util;

public class TreeNode<T extends Comparable<T>> {
    private TreeNode<T> leftTreeNode;
    private TreeNode<T> rightTreeNode;
    private T value;

    public TreeNode() {
    }

    public TreeNode(T t) {
        this.value = t;
    }

    public TreeNode<T> getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode<T> leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode<T> getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode<T> rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

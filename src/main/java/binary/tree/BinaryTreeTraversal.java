package binary.tree;

import util.TreeNode;

import java.util.Stack;

public class BinaryTreeTraversal {

    public <T extends Comparable<T>> void inOrderTraversalRecursive(TreeNode<T> treeNode) {
        if (treeNode == null) return;
        inOrderTraversalRecursive(treeNode.getLeftTreeNode());
        visit(treeNode);
        inOrderTraversalRecursive(treeNode.getRightTreeNode());
    }

    public <T extends Comparable<T>> void inOrderTraversalIterative(TreeNode<T> treeNode) {
        Stack<TreeNode<T>> stack = new Stack<>();
        TreeNode<T> current = treeNode;


        while(!stack.isEmpty() || current != null) {
            while(current != null) {
                stack.push(current);
                current = current.getLeftTreeNode();
            }

            current = stack.pop();
            visit(current);
            current = current.getRightTreeNode();
        }
    }

    public <T extends Comparable<T>> void preOrderTraversal(TreeNode<T> treeNode) {
        if (treeNode == null) return;
        visit(treeNode);
        preOrderTraversal(treeNode.getLeftTreeNode());
        preOrderTraversal(treeNode.getRightTreeNode());
    }

    public <T extends Comparable<T>> void postOrderTraversal(TreeNode<T> treeNode) {
        if (treeNode == null) return;
        postOrderTraversal(treeNode.getLeftTreeNode());
        postOrderTraversal(treeNode.getRightTreeNode());
        visit(treeNode);
    }

    private <T extends Comparable<T>> void visit(TreeNode<T> treeNode) {
        System.out.print(treeNode.getValue() + " ");
    }
}

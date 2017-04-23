package binary.tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Given a binary tree, printPath all of the paths from the root to leaf nodes.
 */
public class BinaryTreePrintPaths {

    public <T extends Comparable<T>> void print(TreeNode<T> root) {
        printRecursive(root, new ArrayList<>());
    }

    private <T extends Comparable<T>> void printRecursive(TreeNode<T> node, List<TreeNode<T>> path) {

        path.add(node);

        if (isLeaf(node)) {
            printPath(path);
            return;
        }

        if (node.getLeftTreeNode() != null) {
            printRecursive(node.getLeftTreeNode(), new ArrayList<>(path));
        }

        if (node.getRightTreeNode() != null) {
            printRecursive(node.getRightTreeNode(), new ArrayList<>(path));
        }
    }

    private <T extends Comparable<T>> void printPath(Collection<TreeNode<T>> nodes) {
        final List<String> nodeValueList = nodes.stream().map(TreeNode::getValue)
                .map(Object::toString)
                .collect(Collectors.toList());
        System.out.println(String.join(" -> ", nodeValueList));
    }

    private <T extends Comparable<T>> boolean isLeaf(TreeNode<T> node) {
        return node.getLeftTreeNode() == null && node.getRightTreeNode() == null;
    }

    public <T extends Comparable<T>> void printIterative(TreeNode<T> node) {

        Stack<TreeNode<T>> stack = new Stack<>();
        stack.push(node);
        if (node.getLeftTreeNode() != null) {
            stack.push(node.getLeftTreeNode());
        }
        while (!stack.isEmpty()) {
            TreeNode<T> currentNode = stack.pop();
            if (isLeaf(currentNode)) {
                printPath(stack);
            } else {
                if (currentNode.getLeftTreeNode() != null) {
                    stack.push(currentNode.getLeftTreeNode());
                } else {
                    stack.push(currentNode.getRightTreeNode());
                }
            }
        }
    }
}

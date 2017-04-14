package binary.tree;

import binary.tree.util.BinaryTreeGenerator;
import org.junit.Test;
import util.TreeNode;

public class BinaryTreeTraversalTest {

    private BinaryTreeTraversal traversal = new BinaryTreeTraversal();

    @Test
    public void preOrderWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        System.out.println("Pre Order: ");
        TreeNode<Integer> rootTreeNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        traversal.preOrderTraversal(rootTreeNode);
        System.out.println("\n");
    }

    @Test
    public void inOrderIterativeWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        System.out.println("In Order Iterative: ");
        TreeNode<Integer> rootTreeNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        traversal.inOrderTraversalIterative(rootTreeNode);
        System.out.println("\n");
    }

    @Test
    public void inOrderWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        System.out.println("In Order Recursive: ");
        TreeNode<Integer> rootTreeNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        traversal.inOrderTraversalRecursive(rootTreeNode);
        System.out.println("\n");
    }

    @Test
    public void postOrderWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        System.out.println("Post Order: ");
        TreeNode<Integer> rootTreeNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        traversal.postOrderTraversal(rootTreeNode);
        System.out.println("\n");
    }
}
package binary.tree;

import binary.tree.util.BinaryTreeGenerator;
import org.junit.Test;
import util.Node;

public class BinaryTreeTraversalTest {

    private BinaryTreeTraversal traversal = new BinaryTreeTraversal();

    @Test
    public void preOrderWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        System.out.println("Pre Order: ");
        Node<Integer> rootNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        traversal.preOrderTraversal(rootNode);
        System.out.println("\n");
    }

    @Test
    public void inOrderIterativeWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        System.out.println("In Order Iterative: ");
        Node<Integer> rootNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        traversal.inOrderTraversalIterative(rootNode);
        System.out.println("\n");
    }

    @Test
    public void inOrderWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        System.out.println("In Order Recursive: ");
        Node<Integer> rootNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        traversal.inOrderTraversalRecursive(rootNode);
        System.out.println("\n");
    }

    @Test
    public void postOrderWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        System.out.println("Post Order: ");
        Node<Integer> rootNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        traversal.postOrderTraversal(rootNode);
        System.out.println("\n");
    }
}
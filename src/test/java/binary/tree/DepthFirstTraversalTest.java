package binary.tree;

import binary.tree.util.BinaryTreeGenerator;
import org.junit.Test;
import util.Node;

public class DepthFirstTraversalTest {

    private DepthFirstTraversal traversal = new DepthFirstTraversal();

    @Test
    public void preOrderWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        Node<Integer> rootNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println();
        traversal.preOrderTraversal(rootNode);
    }

    @Test
    public void inOrderWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        Node<Integer> rootNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println();
        traversal.inOrderTraversal(rootNode);
    }

    @Test
    public void postOrderWorksAseExpected() {
        BinaryTreeGenerator<Integer> generator = new BinaryTreeGenerator<>();
        Node<Integer> rootNode = generator.generateBinaryTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println();
        traversal.postOrderTraversal(rootNode);
    }
}
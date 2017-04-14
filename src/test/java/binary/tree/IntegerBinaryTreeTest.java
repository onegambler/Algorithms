package binary.tree;

import binary.tree.util.BinaryTreeGenerator;
import org.junit.Test;
import util.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class IntegerBinaryTreeTest {

    private BinaryTreeGenerator<Integer> btGenerator = new BinaryTreeGenerator<>();
    private IntegerBinaryTree integerBinaryTree = new IntegerBinaryTree();

    @Test
    public void whenBinaryTreeIsValidThenReturnTrue() {
        TreeNode<Integer> tree = btGenerator.generateBinaryTree(new Integer[]{1, 6, 5, 7, 9});
        boolean valid = integerBinaryTree.isValid(tree);
        assertTrue(valid);
    }


    @Test
    public void whenBinaryTreeIsNotValidThenReturnFalse() {
        TreeNode<Integer> tree = btGenerator.generateBinaryTree(new Integer[]{1, 6, 5, 7, 9});
        tree.getLeftTreeNode().setValue(100);
        boolean valid = integerBinaryTree.isValid(tree);
        assertFalse(valid);
    }

    @Test
    public void binarySearchWorksAsExpected() {
        int index = integerBinaryTree.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6);
        assertThat(index).isEqualTo(5);
    }
}
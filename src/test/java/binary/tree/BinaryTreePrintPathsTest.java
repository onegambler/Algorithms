package binary.tree;

import binary.tree.util.BinaryTreeGenerator;
import org.junit.Test;
import util.TreeNode;

public class BinaryTreePrintPathsTest {

    private BinaryTreePrintPaths print = new BinaryTreePrintPaths();

    @Test
    public void shouldPrintPaths() {
        TreeNode<Integer> tree = new BinaryTreeGenerator<Integer>().generateBinaryTree(new Integer[]{1, 6, 5, 7, 9});
        print.print(tree);
    }
}
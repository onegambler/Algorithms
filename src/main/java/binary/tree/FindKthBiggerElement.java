package binary.tree;

import util.TreeNode;

public class FindKthBiggerElement {

    public <T extends Comparable<T>> T find(TreeNode<T> root, int k) {
        return find(root, k, 0);
    }

    private <T extends Comparable<T>> T find(TreeNode<T> root, int k, int count) {
        find(root.getRightTreeNode(), k, count);

        count++;

        if(count == k) {
            return root.getValue();
        }

        return find(root.getLeftTreeNode(), k, count);
    }
}

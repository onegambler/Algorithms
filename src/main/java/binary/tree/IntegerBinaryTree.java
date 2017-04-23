package binary.tree;

import util.TreeNode;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;


public class IntegerBinaryTree {


    /**
     * Write  a  function  to  determine  whether  a  given  binary  tree  of  distinct  integers  is  a  valid
     * binary  search  tree.   Assume  that  each  node  contains  a  pointer  to  its  left  child,  a  pointer
     * to  its  right  child,  and  an  integer,  but  not  a  pointer  to  its  parent.   
     *
     * Complexity O(n)
     */
    public boolean isValid(TreeNode<Integer> tree) {
        return checkNode(tree, MIN_VALUE, MAX_VALUE);
    }

    private boolean checkNode(TreeNode<Integer> treeNode, int min, int max) {
        if (treeNode == null) {
            return true;
        }

        if (treeNode.getValue() <= min || treeNode.getValue() >= max) {
            return false;
        }

        return checkNode(treeNode.getLeftTreeNode(), min, treeNode.getValue())
                && checkNode(treeNode.getRightTreeNode(), treeNode.getValue(), max);
    }

    /**
     * Find an element in a binary tree.
     *
     * Time Complexity O(log n)
     */
    public int find(int[] sortedArray, int x) {
        return findRecursive(sortedArray, 0, sortedArray.length - 1, x);
    }

    private int findRecursive(int[] sortedArray, int min, int max, int x) {
        if (min < max) {
            int middle = max + min / 2;
            if (x == sortedArray[middle]) {
                return middle;
            }

            if (x < sortedArray[middle]) {
                return findRecursive(sortedArray, 0, middle - 1, x);
            } else {
                return findRecursive(sortedArray, middle + 1, max, x);
            }
        }

        return -1;
    }
}

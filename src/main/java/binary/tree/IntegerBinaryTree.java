package binary.tree;

import util.Node;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * Write  a  function  to  determine  whether  a  given  binary  tree  of  distinct  integers  is  a  valid
 * binary  search  tree.   Assume  that  each  node  contains  a  pointer  to  its  left  child,  a  pointer
 * to  its  right  child,  and  an  integer,  but  not  a  pointer  to  its  parent.   
 */

public class IntegerBinaryTree {


    /**
     * Complexity O(n)
     */
    public boolean isValid(Node<Integer> tree) {
        return checkNode(tree, MIN_VALUE, MAX_VALUE);
    }

    private boolean checkNode(Node<Integer> node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.getValue() < min || node.getValue() > max) {
            return false;
        }

        return checkNode(node.getLeftNode(), min, node.getValue())
                && checkNode(node.getRightNode(), node.getValue(), max);
    }
}

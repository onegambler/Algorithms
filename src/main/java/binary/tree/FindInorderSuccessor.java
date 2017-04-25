package binary.tree;

/**
 * Write an algorithm to find the ‘next’ node (e.g., in-order successor) of a given node in
 * a binary search tree where each node has a link to its parent.
 */
public class FindInorderSuccessor {


    public Node find(Node node) {

        if (node == null) return null;

        /*
         *  If right subtree of node is not NULL, then successor lies in right subtree:
         *  Go to right subtree and return the "most left node" (i.e. node with minimum key value in right subtree)
         */
        if (node.right != null) {

            node = node.right;

            if (node.left == null) {
                return node.right;
            }

            while (node.left != null) {
                node = node.left;
            }

            return node;
        } else {
            /*
             * If right sbtree of node is NULL, then successor is one of the ancestors:
             * Travel up using the parent pointer until you see a node which is left child of it’s parent.
             * The parent of such a node is the successor.
             */
            Node parent = node.parent;
            while (parent != null && node == parent.right) {
                node = parent;
                parent = parent.parent;
            }

            return parent;
        }
    }

    private boolean isLeaf(Node node) {
        return node.right == null && node.left == null;
    }


    private static class Node {
        private Node left;
        private Node right;
        private Node parent;
        private int value;
    }
}

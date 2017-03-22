package graphs;

import java.util.Collection;

public class GraphNode<K> {

    Collection<GraphNode<K>> children;
    boolean visited;
    K value;
}

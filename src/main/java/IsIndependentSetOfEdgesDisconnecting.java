import ru.leti.wise.task.graph.model.Color;
import ru.leti.wise.task.graph.model.Edge;
import ru.leti.wise.task.graph.model.Graph;
import ru.leti.wise.task.graph.model.Vertex;
import ru.leti.wise.task.plugin.graph.GraphProperty;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Checks if a graph contains an independent edge set of any color, which is a disconnecting set.
 */
public class IsIndependentSetOfEdgesDisconnecting implements GraphProperty {
    @Override
    public boolean run(Graph graph) {
        // Iterate over each color available in the Color enum
        for (Color color : Color.values()) {
            // Collect edges of the current color into a set
            Set<Edge> edges = graph.getEdgeList().stream()
                    .filter(e -> e.getColor() == color)
                    .collect(Collectors.toSet());
            // Check if the set of edges is independent and disconnecting
            if (isIndependent(edges) && isDisconnectingSet(graph, edges)) {
                // If both conditions are met, return true
                return true;
            }
        }
        // Return false if no such set of edges is found
        return false;
    }

    /**
     * Checks if a set of edges is independent.
     * <p>
     * Two edges are independent if they do not share any vertices.
     * <p>
     *
     * @param edges the set of edges to check
     * @return true if the set of edges is independent, false otherwise
     */
    private boolean isIndependent(Set<Edge> edges) {
        // We keep track of used vertices to make sure no vertex is used twice.
        Set<Integer> usedVertices = new HashSet<>();
        for (Edge edge : edges) {
            // If we find a vertex, which is already used, the set is not independent
            if (usedVertices.contains(edge.getSource()) ||
                    usedVertices.contains(edge.getTarget())) {
                return false;
            }
            // Mark the source and target vertices as used
            usedVertices.add(edge.getSource());
            usedVertices.add(edge.getTarget());
        }
        return true;
    }

    /**
     * Checks if a set of edges is a disconnecting set.
     *
     * @param graph         the graph to check
     * @param edgesToRemove the set of edges to remove
     * @return true if the set of edges is a disconnecting set, false otherwise
     */
    private boolean isDisconnectingSet(Graph graph, Set<Edge> edgesToRemove) {
        // Count the number of components in the graph
        int initialComponents = countComponents(graph);

        // Get the list of remaining edges
        List<Edge> remainingEdges = graph.getEdgeList().stream()
                .filter(edge -> !edgesToRemove.contains(edge))
                .collect(Collectors.toList());

        // Create a graph without the edges to remove
        Graph modifiedGraph = new Graph(
                graph.getVertexCount(),
                graph.getEdgeCount() - edgesToRemove.size(),
                graph.isDirect(),
                remainingEdges,
                graph.getVertexList()
        );

        // Count the number of components in the modified graph
        int newComponents = countComponents(modifiedGraph);

        // Return true if the number of components has increased
        return newComponents > initialComponents;
    }

    /**
     * Counts the number of components in a graph.
     *
     * @param graph the graph to check
     * @return the number of components in the graph
     */
    private int countComponents(Graph graph) {
        // Use a set to keep track of visited vertex IDs
        Set<Integer> visitedVertexIds = new HashSet<>();
        int componentsCount = 0;

        // Iterate over all vertices in the graph
        for (Vertex vertex : graph.getVertexList()) {
            int vertexId = vertex.getId();
            // If the vertex has not been visited yet, start a new search
            if (!visitedVertexIds.contains(vertexId)) {
                // Increment the component count
                ++componentsCount;
                // Perform a depth-first search starting from this vertex
                dfs(graph, vertexId, visitedVertexIds);
            }
        }
        return componentsCount;
    }

    /**
     * Performs a depth-first search in a graph.
     *
     * @param graph            the graph to search
     * @param vertexId         the ID of the vertex to start from
     * @param visitedVertexIds the set of visited vertex IDs
     */
    private void dfs(Graph graph, int vertexId, Set<Integer> visitedVertexIds) {
        // Mark the current vertex as visited
        visitedVertexIds.add(vertexId);
        // Iterate over all the edges of the graph
        for (Edge edge : graph.getEdgeList()) {
            // If the edge starts at the current vertex, visit the target vertex
            if (edge.getSource() == vertexId &&
                    !visitedVertexIds.contains(edge.getTarget())) {
                dfs(graph, edge.getTarget(), visitedVertexIds);
            }
            // If the graph is undirected, also visit the source vertex
            if (!graph.isDirect() && edge.getTarget() == vertexId &&
                    !visitedVertexIds.contains(edge.getSource())) {
                dfs(graph, edge.getSource(), visitedVertexIds);
            }
        }
    }
}
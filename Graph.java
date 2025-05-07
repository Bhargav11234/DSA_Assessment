import java.util.*;
// sec4 **Shortest Path in an Unweighted Graph:**


public class Graph {
    int V; 
    LinkedList<Integer>[] adj; 

    
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++ ) {
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); 
    }

    public int[] bfsShortestPath(int source) {
        int[] dist = new int[V]; // Array to store shortest distance
        Arrays.fill(dist, -1); 

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        dist[source] = 0; 

        while (!queue.isEmpty()) {
            int node = queue.poll();

            // Visit all the neighbors of node
            for (Integer neighbor : adj[node]) {
                if (dist[neighbor] == -1) { // If the node is unvisited
                    dist[neighbor] = dist[node] + 1; // Update the shortest distance
                    queue.add(neighbor); // Add the neighbor to the queue
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        int[] shortestPaths = graph.bfsShortestPath(0);

        System.out.println("Shortest distances from  node 0:");
        for (int i = 0; i < shortestPaths.length; i++) {
            System.out.println("Distance to the node " + i + ": " + shortestPaths[i]);
        }
    }
}

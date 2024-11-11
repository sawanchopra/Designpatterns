package LeetCode;
import java.util.*;
public class minimumCost {
            // Class to represent an edge with destination and weight
            static class Edge {
                int destination;
                int weight;

                Edge(int destination, int weight) {
                    this.destination = destination;
                    this.weight = weight;
                }
            }

            // Method to find the minimum cost from source to destination
            public static int dijkstra(int source, int destination, List<Edge>[] graph) {
                int n = graph.length;
                int[] dist = new int[n];
                Arrays.fill(dist, Integer.MAX_VALUE);
                dist[source] = 0;

               // PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
                PriorityQueue <int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
                minHeap.add(new int[]{source, 0});

                while (!minHeap.isEmpty()) {
                    int[] current = minHeap.poll();
                    int u = current[0];
                    int currentDist = current[1];


                    if (u == destination) {
                        return currentDist;
                    }

                    if (currentDist > dist[u]) {
                        continue;
                    }

                    for (Edge edge : graph[u]) {
                        int v = edge.destination;
                        int weight = edge.weight;
                        if (dist[u] + weight < dist[v]) {
                            dist[v] = dist[u] + weight;
                            minHeap.add(new int[]{v, dist[v]});
                        }
                    }
                }

                return -1; // Return -1 if destination is unreachable
            }

            public static void main(String[] args) {
                int n = 6; // Number of nodes
                List<Edge>[] graph = new ArrayList[n];
                for (int i = 0; i < n; i++) {
                    graph[i] = new ArrayList<>();
                }

                // Define the routes
                int[][] routes = {
                        {0, 1, 100},
                        {1, 2, 100},
                        {2, 0, 600},
                        {1, 3, 700},
                        {2, 3, 200},
                        {3, 2, 100}
                };

                // Build the graph
                for (int[] route : routes) {
                    int src = route[0];
                    int dest = route[1];
                    int cost = route[2];
                    graph[src].add(new Edge(dest, cost));
                }


                int source = 0;
                int destination = 3;
                int minCost = dijkstra(source, destination, graph);

                if (minCost != -1) {
                    System.out.println("The minimum cost from node " + source + " to node " + destination + " is: " + minCost);
                } else {
                    System.out.println("There is no path from node " + source + " to node " + destination);
                }
            }
        }




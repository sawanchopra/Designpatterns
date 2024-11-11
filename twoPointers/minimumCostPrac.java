package LeetCode.twoPointers;
import java.util.*;

public class minimumCostPrac {
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
                return -1;

            }

            public static void main(String[] args) {
                int n = 4; // Number of nodes
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
                        {2, 3, 200}
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




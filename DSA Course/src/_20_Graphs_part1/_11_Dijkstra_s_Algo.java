package _20_Graphs_part1;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class _11_Dijkstra_s_Algo {
    static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int dist;  // Corrected field name to 'dist'
        int node;

        public Pair(int dist, int node) {
            this.dist = dist;
            this.node = node;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        int[] dist = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, src));

        while (!pq.isEmpty()) {
            Pair cur = pq.remove();

            if (!vis[cur.node]) {
                vis[cur.node] = true;

                for (Edge e : graph[cur.node]) {
                    int u = e.src;
                    int v = e.des;
                    int wt = e.wt;

                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(dist[v], v));
                    }
                }
            }
        }

        // Printing the distances
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        dijkstra(graph, 0);
    }
}

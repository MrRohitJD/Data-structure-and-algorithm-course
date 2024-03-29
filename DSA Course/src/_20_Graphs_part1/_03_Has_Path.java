package _20_Graphs_part1;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class _03_Has_Path {
    public static void creaetGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i <graph.length ; i++) {
            graph[i] =new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[5].add(new Edge(6,5,1));
    }

    public static Boolean hasPath(ArrayList<Edge>graph[], int src, int des, boolean [] visit){
        visit[src] = true;
        if (src==des){
            return true;
        }
        for (int i = 0; i <graph[src].size() ; i++) {
            Edge e= graph[src].get(i);
            if (!visit[e.des] && hasPath(graph,e.des , des, visit)) return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[] =new ArrayList[V];
        creaetGraph(graph);
        System.out.println(hasPath(graph,0,5, new boolean[V]));
    }
}

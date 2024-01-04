package _20_Graphs_part1;
import _20_Graphs_part1.Edge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _04_Cotected_component {
    public static void creaetGraph(ArrayList<Edge>graph[]){
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

        graph[6].add(new Edge(6,5,1));

        graph[8].add(new Edge(11,10,1));
        graph[9].add(new Edge(10,11,1));

    }
    public static void helperBFS(ArrayList<Edge>graph[], boolean visited[] ){
        Queue<Integer> q =new LinkedList<>();

        q.add(0);
        while (!q.isEmpty()){
            int cur = q.remove();
            if (!visited[cur]) {
                System.out.print(cur+" ");
                visited[cur] =true;
                    for (int i = 0; i < graph[cur].size(); i++) {
                        Edge e= graph[cur].get(i);
                        q.add(e.des);
                    }
            }
        }
    }
    public static void cc(ArrayList<Edge>graph[]){
        boolean vis[] =new boolean[graph.length];
        for (int i = 0; i < graph.length ; i++) {
            if (!vis[i]){
                helperBFS(graph, vis);
            }
        }

    }

    public static void main(String[] args) {
        int V=10;
        ArrayList<Edge>graph[]= new ArrayList[V];
        creaetGraph(graph);
        cc(graph);
    }
}

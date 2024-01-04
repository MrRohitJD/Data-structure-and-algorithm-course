package _20_Graphs_part1;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _02_BSF_trevease {
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

        graph[5].add(new Edge(6,5,1));
    }
    public static void BFS(ArrayList<Edge>[] graph){
        Queue<Integer>q =new LinkedList<>();
        boolean visit[] =new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()){
            int cur = q.remove();

            if (!visit[cur]){
                System.out.print(cur+" ");
                visit[cur] =true;
                for (int i = 0; i <graph[cur].size() ; i++) {
                    Edge e =graph[cur].get(i);
                    q.add(e.des);
                }
            }
        }
    }
    public static void DFS(ArrayList<Edge>[] graph, int cur, boolean[] visit) {
        visit[cur] = true;
        System.out.print(cur + " ");

        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);
            if (!visit[e.des]) {
                DFS(graph, e.des, visit);
            }
        }
    }
    public static void main(String[] args) {
        int V =7;
        ArrayList<Edge> graph[]=new ArrayList[7];
        creaetGraph(graph);
//        BFS(graph);
        DFS(graph,0,new boolean[V]);
    }
}

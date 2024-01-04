package _20_Graphs_part1;

import netscape.security.UserTarget;

import java.util.ArrayList;

public class _07_Cycle_detection_direct_graph {
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] =new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(1,0,1));
        graph[0].add(new Edge(2,3,1));
        graph[1].add(new Edge(3,0,1));
    }
    public static boolean isCycle(ArrayList<Edge>graph[]){
        boolean vis[] =new boolean[graph.length];
        boolean st[] =new boolean[graph.length];
        for (int i = 0; i < graph.length ; i++) {
            if (!vis[i]){
                if (helper(graph, i,vis,st)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean helper(ArrayList<Edge> graph[], int cur, boolean vis[],boolean st[]){
        vis[cur] = true;
        st[cur]= true;

        for (int i = 0; i <graph[cur].size() ; i++) {
            Edge  e = graph[cur].get(i);
            if (st[e.des]){
                return true;
            }
            if (!vis[e.des] && helper(graph, e.des, vis, st)){
                return true;
            }
        }
        st[cur] =false;
        return false;
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge>graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}

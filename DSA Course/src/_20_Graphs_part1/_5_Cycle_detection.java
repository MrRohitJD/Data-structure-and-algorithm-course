package _20_Graphs_part1;

import _20_Graphs_part1.Edge;

import java.util.ArrayList;

public class _5_Cycle_detection {
    public static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] =new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(0,3,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,1,1));

        graph[3].add(new Edge(3,0,1));
        graph[3].add(new Edge(3,4,1));

        graph[4].add(new Edge(4,3,1));
    }
    public static boolean detect(ArrayList<Edge> []graph){
        boolean vis[]= new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i] ){
                if (helper(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean helper(ArrayList<Edge> graph[],boolean vis[],int cur, int par){
        vis[cur] =true;
        for (int i = 0; i <graph[cur].size() ; i++) {
            Edge e =graph[cur].get(i);
            // not perent and new node(nei)
            if (!vis[e.des]){
                if (helper(graph, vis, e.des, cur)) return true;
            }
            else if (vis[e.des] && e.des!=par) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge>graph[]=new ArrayList[5];
        createGraph(graph);
        System.out.println(detect(graph));
    }
}

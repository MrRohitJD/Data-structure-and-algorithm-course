package _20_Graphs_part1;

import java.util.ArrayList;
import java.util.Stack;

public class _08_Topological_sort_DFS {
    public static void  creategraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length ; i++) {
            graph[i] =new ArrayList<>();
        }
        graph[2].add(new Edge(2,3,1));

        graph[3].add(new Edge(3,1,1));

        graph[4].add(new Edge(4,0,1));
        graph[4].add(new Edge(4,1,1));

        graph[5].add(new Edge(5,0,1));
        graph[5].add(new Edge(5,2,1));
    }
    public static void TSort(ArrayList<Edge> graph[]){
        boolean vis[] =new boolean[graph.length];
        Stack<Integer> st =new Stack<>();

        for (int i = 0; i < graph.length ; i++) {
            if (!vis[i]){
                helper(graph,i, st, vis);
            }
        }
        while (!st.isEmpty()){
            System.out.println(st.pop());

        }
    }
    public static void helper(ArrayList<Edge> graph[], int cur,Stack<Integer> st, boolean vis[]){
        vis[cur] =true;

        for (int i = 0; i <graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);
            if (!vis[e.des]){
                helper(graph, e.des, st, vis);
            }
        }
        st.push(cur);
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] =new ArrayList[6];
        creategraph(graph);
        TSort(graph);
    }
}

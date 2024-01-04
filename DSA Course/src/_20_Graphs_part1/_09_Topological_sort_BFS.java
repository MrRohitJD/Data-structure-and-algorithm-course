package _20_Graphs_part1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _09_Topological_sort_BFS {
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
    public static void CalInOrder(ArrayList<Edge> graph[], int indorder[] ){

        for (int i = 0; i <graph.length ; i++) {
            for (int j = 0; j <graph[i].size(); j++) {
                Edge  e= graph[i].get(j);
                indorder[e.des]++;
            }
        }
    }
    public static void TroSortBFS(ArrayList<Edge> graph[]){
        int indorder[] =new int[graph.length];
        CalInOrder(graph ,indorder);
        Queue<Integer> q= new LinkedList<>();

        for (int i = 0; i < indorder.length ; i++) {
            if (indorder[i]==0){
                q.add(i);
            }
        }

        while (!q.isEmpty()){
            int cur = q.remove();
            System.out.println(cur+" ");

            for (int i = 0; i < graph[cur].size() ; i++) {
                Edge e = graph[cur].get(i);
                indorder[e.des]--;
                if (indorder[e.des]==0){
                    q.add(e.des);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] =new ArrayList[6];
        creategraph(graph);
        TroSortBFS(graph);
    }
}

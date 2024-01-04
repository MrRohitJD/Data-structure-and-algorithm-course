package _20_Graphs_part1;

import java.util.ArrayList;

public class _10_All_path_form_src_tar {
    public static void  creategraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length ; i++) {
            graph[i] =new ArrayList<>();
        }
        graph[0].add(new Edge(0,3,1));
        graph[2].add(new Edge(2,3,1));

        graph[3].add(new Edge(3,1,1));

        graph[4].add(new Edge(4,0,1));
        graph[4].add(new Edge(4,1,1));

        graph[5].add(new Edge(5,0,1));
        graph[5].add(new Edge(5,2,1));
    }
    public static void  calPathToTar(ArrayList<Edge> graph[],int src,int tar,String path){
        if (src==tar){
            System.out.println(path+tar);
            return;
        }
        for (int i = 0; i < graph[src].size() ; i++) {
                Edge e =graph[src].get(i);
                calPathToTar(graph, e.des, tar, path+src);
        }
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[] =new ArrayList[v];
        creategraph(graph);
        calPathToTar(graph,5,1,"");
    }
}

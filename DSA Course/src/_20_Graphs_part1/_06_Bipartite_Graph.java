package _20_Graphs_part1;


import _20_Graphs_part1.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _06_Bipartite_Graph {
    public static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0; i < graph.length ; i++) {
            graph[i] =new ArrayList<>();
        }
            graph[0].add(new Edge(0,1,1));
            graph[0].add(new Edge(0,2,1));

            graph[1].add(new Edge(1,0,1));
            graph[1].add(new Edge(1,3,1));

            graph[3].add(new Edge(3,1,1));
            graph[3].add(new Edge(3,4,1));

            graph[4].add(new Edge(4,3,1));
            graph[4].add(new Edge(4,2,1));

            graph[2].add(new Edge(2,0,1));
            graph[2].add(new Edge(2,4,1));

//            graph[0].add(new Edge(0,1,1));
//            graph[0].add(new Edge(0,2,1));
//
//            graph[1].add(new Edge(1,0,1));
//            graph[1].add(new Edge(1,2,1));
//
//            graph[2].add(new Edge(2,1,1));
//            graph[2].add(new Edge(2,3,1));
//
//            graph[3].add(new Edge(3,3,1));




    }
    public static boolean bipartitrGraph(ArrayList<Edge> graph[]){
        int color[] =new int[graph.length];
        for (int i = 0; i < graph.length ; i++) {
            color[i]=-1;
        }
        Queue<Integer> q =new LinkedList<>();
        for (int i = 0; i < graph.length ; i++) {
            if (color[i]==-1){
                q.add(i);
                color[i]=0;
                while (!q.isEmpty()){
                    int cur =q.remove();
                    for (int j = 0; j <graph[cur].size() ; j++) {
                        Edge e= graph[cur].get(j);
                        if (color[e.des]==-1){
                           int nxtColor = color[cur]==0? 1 :0;
                           color[e.des]=nxtColor;
                           q.add(e.des);
                        } else if (color[e.scr]==color[e.des]) {
                            return false;
                        }
                    }
                }
            }
        }
        return  true;
    }
    public static void main(String[] args) {
//            0-----2
//          /       |
//         /        |     ans ==> false;
//         1        4
//           \      |
//             \   |
//                3
//        "C:\Users\Rohit\Pictures\Screenshots\Screenshot (104).png"   <----------- sceenshot importent
        ArrayList<Edge> graph[]=new ArrayList[5];
        createGraph(graph);
        System.out.println(bipartitrGraph(graph));


    }
}

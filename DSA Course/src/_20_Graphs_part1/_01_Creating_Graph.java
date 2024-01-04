package _20_Graphs_part1;

import java.util.ArrayList;
import java.util.LinkedList;

class Edge{
    int scr;
    int des;
    int wt;

    public Edge(int scr, int des, int wt) {
        this.scr = scr;
        this.des = des;
        this.wt = wt;
    }
}
public class _01_Creating_Graph {
    public static void main(String[] args) {
//          (5)
//        0------1
//             /   \
//        (1)/      \(3)
//          /        \
//        2-----------3
//       |      (1)
//       |
//    (2)|
//       4
        int V =5;
        ArrayList<Edge> [] graph =new ArrayList[V];
        for (int i = 0; i <V ; i++) {
             graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));

        graph[1].add(new Edge(1, 0,5));
        graph[1].add(new Edge(1, 2,1));
        graph[1].add(new Edge(1, 3,3));

        graph[2].add(new Edge(2, 1,1));
        graph[2].add(new Edge(2, 3,1));
        graph[2].add(new Edge(2, 4,1));

        graph[3].add(new Edge(3, 1,3));
        graph[3].add(new Edge(3, 2,1));

        graph[4].add(new Edge(4, 2,2));

//        2'n Neighbors 
        for (int i = 0; i <graph[2].size() ; i++) {
            Edge  e= graph[2].get(i);
            System.out.println(e.des);
        }
    }
}

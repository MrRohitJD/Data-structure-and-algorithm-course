package _20_Graphs_part1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _14_CheapestFlight {
    public static void createGraph(int flight[][],ArrayList<Edge>graph[]){
        for (int i = 0; i < graph.length ; i++) {
            graph[i]= new ArrayList<>();
        }
        for (int i = 0; i < flight.length ; i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int cost = flight[i][2];

            Edge e =new Edge(src,dest,cost);
            graph[src].add(e);
        }
    }
    static class Info{
        int Vortex;
        int cost;
        int stops;

        public Info(int vortex, int cost, int stops) {
            Vortex = vortex;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public static int connectedFlight(int n,int flight[][], int scr, int Destination , int k){
        ArrayList<Edge> graph[]= new ArrayList[n];
        createGraph(flight, graph);

        int distance[] =new int[graph.length];
        for (int i = 0; i < distance.length ; i++) {
            if (i!=scr){
                distance[i] =Integer.MAX_VALUE;
            }
        }
        Queue<Info> q =new LinkedList<>();
        q.add(new Info(0,0,0));

        while (!q.isEmpty()){
            Info cur =q.remove();
            if (cur.stops>k){
                break;
            }
            for (int i = 0; i <graph[cur.Vortex].size() ; i++) {
                Edge e =graph[cur.Vortex].get(i);
                int u =e.scr;
                int v=e.des;
                int wt =e.wt;
                if (cur.cost+wt<distance[v] && cur.stops<=k){
                    distance[v]= cur.cost+wt;
                    q.add(new Info(v, distance[v], cur.stops+1));
                }
            }
        }
        if (distance[Destination]==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return distance[Destination];
        }

    }
    public static void main(String[] args) {
        int n=4;
        int flights[][] ={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int scr =0 ,Destination = 3, k=1;
        int result = connectedFlight(n,flights,scr,Destination,k);
        System.out.println(result);
    }
}

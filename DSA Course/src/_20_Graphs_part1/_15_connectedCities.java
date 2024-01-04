package _20_Graphs_part1;

import java.util.PriorityQueue;

public class _15_connectedCities{
    static class Edge  implements Comparable<Edge>{
        int des;
        int cost;

        public Edge(int des, int cost) {
            this.des = des;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e2) {
            return cost-e2.cost;
        }
    }
    public static int connectedCiti(int cities[][]){
        PriorityQueue<Edge>pq =new PriorityQueue<>();
        boolean vis[] =new boolean[cities.length];

        pq.add(new Edge(0,0));
        int finalCost =0;

        while (!pq.isEmpty()){
            Edge cur=pq.remove();
            if (!vis[cur.des]){
                vis[cur.des]= true;
                finalCost += cur.cost;

                for (int i = 0; i <cities[cur.des].length ; i++) {
                    if (cities[cur.des][i]!=0){
                        pq.add(new Edge(i,cities[cur.des][i]));
                    }
                }
            }
        }
        return finalCost;
    }
    public static void main(String[] args) {
        int cities[][]={{0,1,2,3,4},
                        {1,0,5,0,7},
                        {2,5,0,6,0},
                        {3,0,6,0,0},
                        {4,7,0,0,0}};
        System.out.println(connectedCiti(cities));
    }
}

package _13_Greedy_Algo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class _02_Fraction_Knapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length ; i++) {
            ratio[i][0]=i;
            ratio[i][1] = val[i]/weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int cap = W;
        int finalVAl = 0;
        for (int i =ratio.length-1; i >=0; i--) {
            int inx = (int)ratio[i][0];
            if (cap>=weight[inx]){
                finalVAl +=val[inx];
                cap -=weight[inx];
            }
            else {
                finalVAl +=(ratio[i][1]*cap);
                cap=0;
                break;
            }
        }
        System.out.println(finalVAl);
    }
}

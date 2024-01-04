package _13_Greedy_Algo;

import java.util.Arrays;
import java.util.Collections;

public class _05_Chocola_problem {
    public static void main(String[] args) {
        Integer [] costVer = {2,1,3,1,4};
        Integer []costHor = {4,1,2};
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        int i=0, j=0;
        int hp =1, vp =1;
        int cost =0;
        while (i<costVer.length && j< costHor.length){
            if (costVer[i]<=costHor[j]){
                cost += (costHor[j]*vp);
                hp++;
                j++;
            }
            else {
                cost+=(costVer[i]*hp);
                vp++;
                i++;
            }
        }
        while (j<costHor.length){
            cost += (costHor[j]*vp);
            hp++;
            j++;
        }
        while (i< costVer.length){
            cost+=(costVer[i]*hp);
            vp++;
            i++;
        }
        System.out.println("cost = "+cost);
    }
}

package _13_Greedy_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _06_Job_Awq_problem {
    public static void pro(int deadline[], int profit[]){
       ArrayList al =new ArrayList<>();
        int job[][] = new int[profit.length][3];
        for (int i = 0; i <job.length ; i++) {
            job[i][0]= i;
            job[i][1] =deadline[i];
            job[i][2] = profit[i];
        }
        Arrays.sort(job, Comparator.comparingDouble(o->o[2]));
        for (int i = 0; i < job.length; i++) {
            for (int j = 0; j < job[0].length; j++) {
                System.out.print(job[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        int time =0;
         int maxPro =0;
        for (int i = job.length-1; i >=0; i--) {
            if (time<deadline[i]){
                time = deadline[i];
                al.add(job[i][0]);
                maxPro = job[i][2];
            }
        }
        for (int i = 0; i <al.size() ; i++) {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println("max profit " +maxPro);
        System.out.println("thime "+time);
    }
    public static void main(String[] args) {
        int deadline[]={4,1,1,1};
        int profit [] ={20,10,40,30};
        pro(deadline, profit);

    }
}

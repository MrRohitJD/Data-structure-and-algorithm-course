package _13_Greedy_Algo;

import java.util.ArrayList;

public class _01_Activity_Selection {
//    For end array is sorted.
    public static void ActSel(int start[], int end[]){
        int count = 0;
        ArrayList al = new ArrayList();
        count =1;
        al.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i]>=lastEnd){
                count++;
                al.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println(count);
        System.out.println(al);

    }

//    For end Array is not Sorted
    public static void N_actSel(int start[], int end[]){

    }
    public static void main(String[] args) {
        int start [] = {1,3,0,5,8,5};
        int end [] = {2,4,6,7,9,9};
        ActSel(start, end);
    }
}

package _13_Greedy_Algo;

import java.util.Arrays;
import java.util.Comparator;

public class _04_max_len_Pair_chain {
    public static void main(String[] args) {
        int pairs[] [] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int count =1;
        int pairEnd = pairs[0][1];
        for (int i = 0; i < pairs.length; i++) {
            if (pairEnd<=pairs[i][0]){
                count++;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println(count);
    }
}

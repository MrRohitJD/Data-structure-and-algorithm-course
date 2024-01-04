package _13_Greedy_Algo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _05_Indian_Coins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
//        2000 500 100 50 20 10 5 2 1
        int val =590;
        int minCOinsNotes = 0;
        Arrays.sort(coins, Collections.reverseOrder());

        ArrayList al =new ArrayList<>();

        for (int i = 0; i < coins.length ; i++) {
            if (coins[i]<=val){
                while (coins[i]<=val){
                    val-=coins[i];
                    al.add(coins[i]);
                    minCOinsNotes++;
                }
            }
        }
        System.out.println(minCOinsNotes);
        for (int i = 0; i <al.size() ; i++) {
            System.out.print(al.get(i)+" ");
        }
    }
}

package _13_Greedy_Algo;

import java.util.Arrays;

public class _03_Min_Sum_Absulute {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {2,1,3};

        Arrays.sort(a);
        Arrays.sort(b);

        int minAbs =0;
        for (int i = 0; i < a.length; i++) {
            minAbs +=Math.abs(a[i]-b[i]);
        }
        System.out.println(minAbs);
    }

}

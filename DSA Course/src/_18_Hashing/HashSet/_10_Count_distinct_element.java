package _18_Hashing.HashSet;

import java.util.HashSet;

public class _10_Count_distinct_element {
    public static int cde(int arr[]){
        HashSet<Integer> s= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);

        }
        return s.size();
    }
    public static void main(String[] args) {
        int arr[] ={4,3,2,5,6,7,3,4,2,1,};
        System.out.println(cde(arr));

    }
}

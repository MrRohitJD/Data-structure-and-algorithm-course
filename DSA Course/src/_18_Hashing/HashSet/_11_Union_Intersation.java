package _18_Hashing.HashSet;
import java.util.*;
public class _11_Union_Intersation {
    public static void main(String[] args) {
        int arr1[] ={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        Set<Integer> s = new HashSet<>();
        System.out.println("Union");
        for (int i = 0; i < arr2.length ; i++) {
            s.add(arr2[i]);
        }
        for (int i = 0; i < arr1.length ; i++) {
            s.add(arr1[i]);
        }
        System.out.println(s.size());
        for (Integer i:s) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Interstion");
        s.clear();
//        Interstion
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }
        int count=0 ;
        for (int i = 0; i < arr2.length; i++) {
            if (s.contains(arr2[i])){
                count++;
                s.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }

}

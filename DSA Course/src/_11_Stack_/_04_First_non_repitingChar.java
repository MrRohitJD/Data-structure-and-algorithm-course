package _11_Stack_;

import java.util.LinkedList;
import java.util.Queue;

public class _04_First_non_repitingChar {
    public static void check(String str){
        int [] freq = new int[26];
        Queue<Character> q= new LinkedList<>();
        for (int i = 0; i <str.length() ; i++) {
            char curr = str.charAt(i);
            q.add(curr);
            freq[curr-'a']++;
            while (!q.isEmpty() &&freq[q.peek()-'a']>1){
                q.remove();

            }
            if (q.isEmpty()){
                System.out.print("-1 ");
            }
            else {
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        check(str);
    }
}

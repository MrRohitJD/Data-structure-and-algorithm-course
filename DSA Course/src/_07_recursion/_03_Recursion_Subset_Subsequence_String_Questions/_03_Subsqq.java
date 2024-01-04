package _07_recursion._03_Recursion_Subset_Subsequence_String_Questions;

import java.util.ArrayList;
import java.util.LinkedList;

public class _03_Subsqq{
//    static void subs(String p, String up){
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char c = up.charAt(0);
//        subs(p +c,up.substring(1));
//        subs(p,up.substring(1));
//    }
    static ArrayList<String> usingList(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char c =up.charAt(0);
//        take
        ArrayList<String> r = usingList(p+c,up.substring(1));
        ArrayList<String> l = usingList(p,up.substring(1));
        l.addAll(r);
        return l;
    }
//    public boolean isPalindrome(LinkedList<Integer> head) {
//
//
//    }
//    public boolean isPalindrome(LinkedList<Integer> head, Integer i) {
//        if (i == head.size()/2) {
//            return true;
//        }
////        return isPalindrome(head.get(i), i+1);
//
//
//    }


    public static void main(String[] args) {
//        subs("","abc");
//        System.out.println(usingList("","abc"));
        ArrayList<String>f =usingList("","abc");

//        for (int i = 0; i <f.size(); i++) {
//            if (f.get(i) != "") {
//                System.out.println(" "+ f.get(i));
//            }
//
//        }
    }
}

package _19_Tries;

import java.util.ArrayList;

public class _04_StartWith {
    static class node{
        node chilndren[] =new node[26];
        boolean eow =false;

        public node() {
            for (int i = 0; i <26 ; i++) {
                chilndren[i]= null;
            }
        }
    }
    public static node root =new node();
    public static void insert(String word){
        node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if (curr.chilndren[idx]==null){
                curr.chilndren[idx] =new node();
            }
            curr =curr.chilndren[idx];
        }
        curr.eow =true;
    }
    public static boolean stratWith(String prifix){
        node curr = root;
        for (int i = 0; i <prifix.length() ; i++) {
            int idx = prifix.charAt(i)-'a';
            if (curr.chilndren[idx]==null){
                return false;
            }
            curr =curr.chilndren[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String word[] = {"apple", "app", "mango", "man", "woman"};
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        String prifix1 = "appfrefsdfeswe";
        String prifix2 = "man";
        String prifix3 = "wa";

        System.out.println(stratWith(prifix1));
        System.out.println(stratWith(prifix2));
        System.out.println(stratWith(prifix3));
    }
}
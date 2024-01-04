package _18_Hashing.HashMap;

import java.util.HashMap;

public class _05_Anagram {
    public static boolean anagram(String ana1, String ana2){
        HashMap<Character, Integer>map = new HashMap<>();
        for (int i = 0; i <ana1.length() ; i++) {
            map.put(ana1.charAt(i), map.getOrDefault(ana1.charAt(i),0)+1);
        }
        for (int i = 0; i < ana2.length(); i++) {
            char ch =ana2.charAt(i);
            if (map.get(ch)!=null){
                if (map.get(ch)==1){
                    map.remove(ch);
                }
                else {
                    map.put(ch, map.get(ch)-1);
                }
            }
            else {
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        System.out.println(anagram(s1,s2));
    }
}

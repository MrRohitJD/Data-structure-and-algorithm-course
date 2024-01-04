package _18_Hashing.HashSet;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _09_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        HashSet<String> hs =new HashSet<>();
        hs.add("Mumbai");
        hs.add("New York ");
        hs.add("Cylifornia");
        hs.add("Pune");
        hs.add("Bengaluru");
        System.out.println(hs);

        LinkedHashSet<String> lhs =new LinkedHashSet<>(); //given order is maintained
        lhs.add("Mumbai");
        lhs.add("New York ");
        lhs.add("Cylifornia");
        lhs.add("Pune");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        TreeSet<Integer>ts =new TreeSet<>();
        ts.add(10);
        ts.add(60);
        ts.add(30);
        ts.add(10);
        ts.add(30);
        System.out.println(ts);


    }
}

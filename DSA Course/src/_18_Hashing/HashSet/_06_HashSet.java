package _18_Hashing.HashSet;

import java.util.HashSet;
import java.util.Set;

public class _06_HashSet {
    public static void main(String[] args) {
        Set<Integer>s =new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(10);
        s.add(30);

        System.out.println(s);
        System.out.println(s.size());
        s.remove(10);
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.clear();
    }
}

package _18_Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class _08_iteration_on_HashSet {
    public static void main(String[] args) {
        HashSet<String>s =new HashSet<>();
        s.add("Mumbai");
        s.add("New York ");
        s.add("Cylifornia");
        s.add("Pune");
        s.add("Bengaluru");

        System.out.println(s);
        Iterator it =s.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        for (String i:s) {
            System.out.print(i+", ");
        }
    }
}

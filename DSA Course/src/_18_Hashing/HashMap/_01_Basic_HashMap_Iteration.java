package _18_Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _01_Basic_HashMap_Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer>hm = new HashMap<>();
        hm.put("Apple" , 10);
        hm.put("Bannana", 12);
        hm.put("Orange", 15);

        System.out.println(hm);

        System.out.println(hm.get("Orange"));

        System.out.println(hm.remove("Apple"));

        System.out.println(hm.containsKey("Apple"));
        System.out.println(hm.containsKey("WaterMallen"));

        System.out.println(hm.containsValue(12));
        System.out.println(hm.containsValue(1));

        System.out.println(hm);

        Set<String> ke = hm.keySet();

        for (String i: ke) {
            System.out.println("key"+i+" value"+hm.get(i));
        }
//        --------------------------------
        Set<Map.Entry<String, Integer>> es = hm.entrySet();

        for (String i: ke) {
            System.out.println("key"+i+" value"+hm.get(i));
        }
    }
}

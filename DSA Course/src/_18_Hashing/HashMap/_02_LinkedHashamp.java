package _18_Hashing.HashMap;

import java.util.LinkedHashMap;
//-------------------------------------- LinkedHashMap is follow Order
public class _02_LinkedHashamp {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm =new LinkedHashMap<>();
        lhm.put("Apple" , 10);
        lhm.put("Bannana", 12);
        lhm.put("Orange", 15);

//        System.out.println(lhm);

//        System.out.println(lhm.get("Orange"));
//
//        System.out.println(lhm.remove("Apple"));
//
//        System.out.println(lhm.containsKey("Apple"));
//        System.out.println(lhm.containsKey("WaterMallen"));
//
//        System.out.println(lhm.containsValue(12));
//        System.out.println(lhm.containsValue(1));

        System.out.println(lhm);

    }
}

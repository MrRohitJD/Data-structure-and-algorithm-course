package _18_Hashing.HashMap;

import java.util.TreeMap;
//-----------------------------------Tree map return sorted order----------------------------
public class _03_TreeHash {
    public static void main(String[] args) {
        TreeMap<String, Integer> Tm =new TreeMap<>();
        Tm.put("Apple" , 10);
        Tm.put("Bannana", 12);
        Tm.put("Orange", 15);

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

        System.out.println(Tm);
    }
}

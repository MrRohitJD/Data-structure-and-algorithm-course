package _18_Hashing.Questions;

import java.util.HashMap;


public class _12_Find_itinerary_for_tickets {
    public static String getstart(HashMap<String, String> ticket){
        HashMap<String, String> remap= new HashMap<>();
        for (String key: ticket.keySet()) {
            remap.put(ticket.get(key),key);
        }
        for (String key:ticket.keySet()) {
            if (!remap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("C", "B" );
        ticket.put("M", "D" );
        ticket.put("G" ,"C" );
        ticket.put("D", "G" );
//        System.out.println(ticket);
//        System.out.println(getstart(ticket));

        String start = getstart(ticket);
        System.out.print(start);
        for (String i : ticket.keySet()){
            System.out.print(" -->"+ ticket.get(start));
            start = ticket.get(start);
        }
        System.out.println();


    }
}

package _12_Queus;

import java.util.LinkedList;
import java.util.Queue;

public class _05_interleave_2_halves {
    static Queue<Integer> finall = new LinkedList<>();
    public static void interlap(Queue<Integer> q) {
        Queue<Integer> firstQ = new LinkedList<>();
        int lenh = q.size();
        for (int i = 0; i <lenh/2 ; i++) {
            firstQ.add(q.remove());
        }
        while (!firstQ.isEmpty()){
            q.add(firstQ.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue <Integer> q =new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        interlap(q);
        while (!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();

        }

    }
}

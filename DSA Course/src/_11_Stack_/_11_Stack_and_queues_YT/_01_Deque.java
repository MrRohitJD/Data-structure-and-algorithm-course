package _11_Stack_._11_Stack_and_queues_YT;

import java.util.ArrayDeque;
import java.util.Deque;

public class _01_Deque {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(10);
        dq.addLast(500);
        dq.addLast(50);
        dq.addFirst(20);
        System.out.println(dq.peekFirst());
//        dq.removeFirst();
    }
}

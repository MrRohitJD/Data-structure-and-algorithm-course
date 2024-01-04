package _12_Queus;

import java.util.*;

class STAck{
    static Deque<Integer> dq = new ArrayDeque<>();
    public static void push(int data){
        dq.add(data);
    }
    public static boolean isEmpty(){
        return dq.isEmpty();
    }
    public static int peek(){
        if (dq.isEmpty()){
            System.out.println("Stack is Empty");
        }
        return  dq.getLast();
    }
    public static int pop(){
        if (dq.isEmpty()){
            System.out.println("Stack is Empty");
        }
        return dq.removeLast();
    }
}
class QUEus{
    static Deque<Integer> dq = new ArrayDeque<>();
    public static void add(int data){
        dq.add(data);
    }
    public static boolean isEmpty(){
        return dq.isEmpty();
    }
    public static int remove(){
        return dq.remove();
    }
    public static int peek(){
        return dq.getFirst();
    }
}
public class _07_Stack_N_queue_implememnt_DQ {
    public static void main(String[] args) {
        STAck s =new STAck();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
//--------------------------------------------------------------
        QUEus q = new QUEus();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while (!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}

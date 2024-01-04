package _12_Queus;

import java.util.Stack;

public class _02_Queus_using_two_stack {
    static Stack <Integer> s1 =new Stack<>();
   static Stack <Integer> s2 =new Stack<>();

    public static boolean isEmpty(){
        return s1.isEmpty();
    }
    public static void add(int data){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()){
            s1.push(s2.pop());

        }
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("q is full");
            return -1;
        }
        return s1.pop();
    }
    public static int peek(){
        return s1.peek();
    }
    public static void main(String[] args) {

        add(1);
        add(2);
        add(3);
        while (!isEmpty()){
            System.out.println(peek());
            remove();
        }
    }
}

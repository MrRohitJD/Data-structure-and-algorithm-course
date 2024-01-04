package _11_Stack_;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Stack;

class StackA{
    static ArrayList<Integer> list=new ArrayList<>();
    public boolean isEmpty(){
        return list.size()==0;
    }
    public void push(int data){
        list.add(data);
    }
    public int pop(){
        int top =list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public int peek(){
        int top = list.get(list.size() - 1);
        return top;
    }
}



         class StackLL{
            static class Node {
                int data;
                Node next;

                public Node(int data) {
                    this.data = data;
                    this.next = null;
                }
            }
            Node head =null;
            public boolean isEmpty(){
                return head==null;
            }
            public void push(int data){
                Node newNode=new Node(data);
                if(isEmpty()){
                    head= newNode;
                    return;
                }
                newNode.next =head;
                head=newNode;
            }
            public int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top =head.data;
                head =head.next;
                return top;
            }
            public int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }

        }


public class _01_create_Custom_Stack {
    public static void main(String[] args) {
        StackA s=new StackA();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        s.push(40);
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
        StackLL sl =new StackLL();
        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.push(30);
        while (!sl.isEmpty()){
            System.out.println(sl.peek());
            sl.pop();
        }

    }
}

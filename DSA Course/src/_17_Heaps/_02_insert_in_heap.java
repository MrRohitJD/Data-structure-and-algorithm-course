package _17_Heaps;

import java.util.ArrayList;

class Heap{
    ArrayList<Integer> al =new ArrayList<>();
    public void add(int data){
        al.add(data);
        int x = al.size()-1;
        int pr = (x-1)/2;
        while (al.get(x)<al.get(pr)){
            int temp  =al.get(x);
            al.set(x ,al.get(pr));
            al.set(pr ,temp);
            x = pr;
            pr = (x-1)/2;
        }
    }
    public int peek(){
        return  al.get(0);
    }

    public void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int minInx = i;

        if (left<al.size() && al.get(minInx) > al.get(left)){
            minInx = left;
        }
        if (right<al.size() && al.get(minInx) > al.get(right)){
            minInx = right;
        }
        if (minInx!= i){
            int temp = al.get(i);
            al.set(i, al.get(minInx));
            al.set(minInx, temp);

            heapify(minInx);
        }
    }
    public int remove(){
        int data = al.get(0);
//            first step
        int temp = al.get(0);
        al.set(0, al.get(al.size()-1));
        al.set(al.size()-1 ,temp);

//        second step
        al.remove(al.size()-1);

//        3rd step
        heapify(0);
        return data;
    }
    public boolean isEmpty(){
        return al.size()==0;
    }
}
public class _02_insert_in_heap {
    public static void main(String[] args) {
        Heap pq =new Heap();
        pq.add(10);
        pq.add(5);
        pq.add(50);
        pq.add(-1);

        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}

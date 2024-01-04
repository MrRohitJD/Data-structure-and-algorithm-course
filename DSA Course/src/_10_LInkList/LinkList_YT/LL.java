//package _10_LInkList.LinkList_YT;
//
//public class LL {
//    private Node head;
//    private Node tail;
//    private int size;
//
//    public LL() {
//        this.size = 0;
//    }
//    public void insertFirst(int value){
//        Node node=new Node(value);
//        node.next =head;
//        head =node;
//        if (tail==null){
//            tail=head;
//        }
//        size+=1;
//    }
//    public void  insertLast(int value){
//        if (tail == null) {
//            insertFirst(value);
//
//        }
//        else {
//        Node node =new Node(value);
//        tail.next =node;
//        tail = node;
//        size++;
//        }
//    }
//    public void insert(int value, int index){
//        if (index == 0) {
//            insertFirst(value);
//            return;
//        }
//        if (index == size) {
//            insertLast(value);
//            return;
//        }
//        Node temp =head;
//        for (int i = 1; i < index; i++) {
//            temp=temp.next;
//
//        }
//        Node node =new Node(value,temp.next);
//        temp.next=node;
//        size++;
//    }
//    public void printll(){
//        Node temp =head;
//        while (temp!=null) {
//            System.out.print(temp.value+" -> ");
//            temp =temp.next;
//        }
//        System.out.println("END");
//
//    }
//
//    private class Node {
//        private int value;
//        private Node next;
//        public Node(int value) {
//            this.value = value;
//        }
//        public Node(int value, Node next) {
//            this.value = value;
//            this.next = next;
//        }
//    }
//
//    public static void main(String[] args) {
//        LL list =new LL();
//        list.insertFirst(1);
//        list.insertLast(10);
//        list.insertFirst(2);
//        list.insert(100,2);
//
//        list.printll();
//    }
//}

package _12_Queus;

 class Queuee{
     static int arr[];
     static int size;
     static  int rear;
     static  int front;
     public Queuee(int n) {
         arr= new int[n];
         size=n;
         rear=-1;
         front=-1;
     }
     public static boolean isEmpty(){
         return  rear== -1 && front==-1;
     }
     public static boolean isFull(){
         return (rear +1)%size==front;
     }
     public static void add(int data){
         if (isFull()){
             System.out.println("Array is full");
             return;
         }
         if (front==-1){
             front=0;
         }
         rear=(rear+1)%size;
         arr[rear]=data;
     }
     public static int remove(){
         if (isEmpty()){
             System.out.println("Array is Empty");
             return -1;
         }

         int result = arr[front];
         if (rear==front){
             rear=front=-1;
         }
         else{
             front=(front+1)%size;
         }
         return front;
     }
     public static int peek(){
         if (isEmpty()){
             System.out.println("Array is Empty");
             return -1;
         }
         return arr[front];
     }
 }
public class _01_Using_Array {
    public static void main(String[] args) {
        Queuee q =new Queuee(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        while (!q.isEmpty()){
            System.out.println(q.remove());
        }

    }
}

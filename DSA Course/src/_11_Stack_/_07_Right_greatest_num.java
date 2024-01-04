package _11_Stack_;

import java.util.Stack;

public class _07_Right_greatest_num {
    public static void greatestNum(int arr[], int greatest[]){
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            while (!s.isEmpty() && arr[s.peek()]>arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                greatest[i] = -1;
            }
            else{
                greatest[i] =arr[s.peek()];

            }
            s.push(i);
        }


    }
    public static void main(String[] args) {
        int arr[] ={6,8,0,1,3};
        int greatest []= new int[arr.length];
        greatestNum(arr,greatest);
        for (int i = 0; i < greatest.length; i++) {
            System.out.print(greatest[i]+" ");
        }



    }
}

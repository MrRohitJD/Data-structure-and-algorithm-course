package _07_recursion;

public class First_occurenceArray {
    public  static int  occur(int arr[], int i,int num){
        if (i==arr.length-1){
            return -1;
        }
        if (num==arr[i]){
            return i;
        }
        return occur(arr, i+1, num);
    }
    public static void main(String[] args) {
        int arr[]= {4,5,8,9,6,5,2,4,7,8,};
        System.out.println(occur(arr,0,222));
    }
}

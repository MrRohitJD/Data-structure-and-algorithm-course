package _09_Backtracking;
import static _08_Divide_Conquer._01_marge_Sort.printArr;
public class _01_BackTracking_On_Array {
    public static void ArrayBAck(int arr[], int i, int val){
        if(i==arr.length){
            printArr(arr );
            System.out.println();
            return;
        }
        arr[i] = val;
        ArrayBAck(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        ArrayBAck(arr, 0,1);
        printArr(arr);

    }
}

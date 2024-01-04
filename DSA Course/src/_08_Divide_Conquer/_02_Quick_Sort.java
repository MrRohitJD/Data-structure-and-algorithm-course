package _08_Divide_Conquer;

public class _02_Quick_Sort {
    public  static  void printArr(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public  static void quickSort(int arr[], int si, int ei){
        if (si>=ei){
            return;
        }
        int pInx = partInx(arr,si,ei);
        quickSort(arr, si, pInx-1);
        quickSort(arr, pInx+1, ei);
    }
    public  static int partInx(int arr[], int si,int ei){
        int pivot = arr[ei];
        int i=si-1;
        for (int j=si;j<ei;j++){
            if (arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        int nn = Integer.MIN_VALUE;
        return i;
    }



    public static void main(String[] args) {
        int arr[] = {100, -100,200,300,50};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

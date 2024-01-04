package _08_Divide_Conquer;

public class _01_marge_Sort {
    public  static  void printArr(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public  static  void margeSort(int arr[], int si , int ei){
        if (si>=ei){
            return;
        }
        int mid = si+ (ei-si)/2;
        margeSort(arr, si, mid);//left
        margeSort(arr, mid+1, ei);//right
        marge(arr, si, mid, ei); //method
    }
    public static  void marge(int arr[], int si, int mid,int ei ){
        int temp [] =new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0; //temp
        while(i<=mid &&j<=ei){
            if (arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i==mid){
            temp[k++] = arr[i++];
        }
        while (j==ei){
            temp[k++] = arr[j++];
        }
        for (k=0, i=si;k<temp.length;k++, i++){
            arr[i]  =temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {100, -100,200,300,50};
        margeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

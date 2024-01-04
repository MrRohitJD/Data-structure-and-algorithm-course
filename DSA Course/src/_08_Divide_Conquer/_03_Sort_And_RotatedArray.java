package _08_Divide_Conquer;

public class _03_Sort_And_RotatedArray {
    public  static int search(int arr[],int tar, int si, int ei){
        int mid = si+(ei-si)/2;
        if (si>ei){
            return -1;
        }
//        mid==tar
        if (arr[si]==arr[mid]){
            return mid;
        }
//        Line 1
        if (arr[si]<=arr[mid]){
            if (arr[si]<=tar && tar<=arr[mid])
            return search(arr,tar ,si,mid-1 );
            else {
               return search(arr, tar, mid+1, ei);
            }
        }
//        line 2
        else {
            if (arr[mid]<=tar && arr[ei]<=tar){
                return search(arr, tar, mid+1, ei);
            }
            else {
                return search(arr, tar, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2,3};
        int tarInx = search(arr, 0, 0, arr.length-1);

        System.out.println(tarInx);

    }
}

package _07_recursion._02_Recursion_Array_Questions;


public class _01_ArraySort {
    static boolean sort(int a[]){
        return helper(a,0);
    }
//    Contract(pure = true)
    static boolean helper(int a[], int n){
        if (n==a.length-1){
            return true;
        }
        if (a[n]<a[n+1]){
            return helper(a, n+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {1,22,3};
        System.out.println(sort(a));
    }
}

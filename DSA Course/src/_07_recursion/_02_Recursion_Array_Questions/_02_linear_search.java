package _07_recursion._02_Recursion_Array_Questions;

public class _02_linear_search {
    static int search(int[]a,int i,int tar){
        if (i==a.length-1){
            return -1;
        }
        if (tar==a[i]){
                return i;
        }
        return search(a, i+1, tar);
    }
    public static void main(String[] args) {
        int []a = {1,4,7,8,9,63,45};
        System.out.println(search(a,0,9));
    }
}

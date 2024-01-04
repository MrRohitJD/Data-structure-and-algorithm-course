package _07_recursion;

public class ArrayIsSorted_orN {
    public  static boolean SortTN(int a [], int i){
        if (i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
       return SortTN(a, i+1);

    }
    public static void main(String[] args) {
        int a []= {1,5,3,4,5,6};
        System.out.println(SortTN(a, 0));


    }
}

package _07_recursion;

public class FirstOccurrence {
    public  static int Foccurse(int num,int arr[] , int i){
        if (i==arr.length){
            return -1;
        }
        if (num==arr[1]){
            return 0;
        }
        if (num==arr[i]){
            return i;
        }

        return Foccurse(num, arr, i+1);
    }
    public static void main(String[] args) {
        int i=0;
        int arr[] ={1,4,2,5,3,6};
        System.out.println(Foccurse(2, arr,i));
    }
}

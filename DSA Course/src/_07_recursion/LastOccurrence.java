package _07_recursion;

public class LastOccurrence {
    public  static  int Loccurse(int num, int arr[], int i){
        if (i==arr.length){
            return  -1;
        }
        int found = Loccurse(num, arr, i+1);
        if(found == -1 && arr[i]== num){
            return i;
        }
        return found;
    }
    public static void main(String[] args) {
        int arr[] ={1,3,2,5,3,6};
        int i=0;
        System.out.println(Loccurse(3,arr,i));
    }
}

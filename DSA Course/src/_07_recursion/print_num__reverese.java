package _07_recursion;

public class print_num__reverese {
    public  static void printn(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+"");
        printn(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printn(n);
    }
}

package _07_recursion;

public class SumOfNatural {
    public  static int Sum(int n){
        if (n==1){
            return n;
        }
        int sum = n+Sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Sum(n));
    }
}

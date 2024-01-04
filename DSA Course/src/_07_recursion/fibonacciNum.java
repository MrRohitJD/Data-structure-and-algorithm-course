package _07_recursion;

public class fibonacciNum {
    public  static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int firstNum =fib(n-1);
        int secNum =fib(n-2);
        int res = firstNum + secNum;
        return res;

    }
    public static void main(String[] args) {
        int n = 40;
        System.out.println(fib(n));

    }
}

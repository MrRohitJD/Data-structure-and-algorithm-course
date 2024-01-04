package _07_recursion;

public class factorial {
    public static  int fact(int n){
        if(n==0){
            return 1;
        }
        int facts = n*(fact(n-1));
        return facts;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}

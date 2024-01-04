package _07_recursion;

public class Print_X_Power_N {
    public  static int pow(int x ,int n){
        if (n==1){
            return x;
        }
       return x*pow(x, n-1);
    }
    public  static int optimizePow(int x, int n){
        if (n==1){
            return x;
        }
        int half= optimizePow(x, n/2);
        int fullPower = half*half;
        if (n%2!=0){
            return fullPower = x*fullPower;
        }
        return fullPower;

    }
    public static void main(String[] args) {
        System.out.println(optimizePow(2,17));

    }
}

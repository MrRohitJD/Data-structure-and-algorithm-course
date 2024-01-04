package _07_recursion;

public class PoweXandN {
    public  static int XandN(int x, int n){
        if(n==0){
            return 1;
        }
        int xn = XandN(x, n-1);
        int xnx = x* xn;
        return xnx;


    }
    public static void main(String[] args) {
        System.out.println(XandN(2,10));
    }
}

package _07_recursion._01_Recursion_Level_1_Questionsss;

public class CountZeros {
    static int count(int n){
        return helper(n,0);
    }
    public static int helper(int n,int c){
        if (n == 0) {
            return c;
        }
        int rem = n%10;
        if (rem==0){
            return helper(n/10,c+1);
        }
        return  helper(n/10,c);
    }
    public static void main(String[] args) {
        System.out.println(count(10122400));
    }
}

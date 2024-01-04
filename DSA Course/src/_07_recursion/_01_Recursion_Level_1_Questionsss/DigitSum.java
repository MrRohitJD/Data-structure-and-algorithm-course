package _07_recursion._01_Recursion_Level_1_Questionsss;

public class DigitSum {
    static int sum(int n){
       if (n == 0) {
            return 0;
        }
        int div = sum(n/10);
        int res = (n%10);
        return div + res;
    }
    public static void main(String[] args) {
        System.out.println(sum(723));
    }
}

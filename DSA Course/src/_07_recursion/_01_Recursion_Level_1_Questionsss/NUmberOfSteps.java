package _07_recursion._01_Recursion_Level_1_Questionsss;

public class NUmberOfSteps {
    static int count(int num){
        return helper( num, 0);
    }
    static int helper(int num, int c){
        if (num==0){
            return c;
        }

        if (num%2==0) {
            return helper(num/2, c+1);
        }
        return helper(num-1, c+1);
    }
    public static void main(String[] args) {
        System.out.println(count(14));
    }
}

package _07_recursion._01_Recursion_Level_1_Questionsss;

public class PRob_1_To_n {
    public static void pro1(int a){
        if (a == 0) {
            return;
        }
        System.out.println(a);
        pro1(a-1);

    }
    public static void main(String[] args) {
        pro1(5);
    }

}

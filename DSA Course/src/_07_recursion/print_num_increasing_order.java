package _07_recursion;

public class print_num_increasing_order {
    public  static void printIncrteasing(int n){
        if (n==1){
            System.out.println(n+"");
            return;
        }
        printIncrteasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=5;
        printIncrteasing(n);

    }
}

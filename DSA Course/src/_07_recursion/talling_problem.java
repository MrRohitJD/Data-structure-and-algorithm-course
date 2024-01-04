package _07_recursion;

public class talling_problem {
    public  static  int ways(int n){
        if (n==0 ||n==1){
            return 1;
        }
       // vartical choice
        int var= ways(n-1);

        //horizontal choice
        int hor = ways(n-2);

        return var+hor;

    }

    public static void main(String[] args) {
       System.out.println(ways(4));
    }
}

package _07_recursion;

 class  Negative extends  Exception{
    @Override
    public String toString() {
        return "Negative radius ";
    }

    @Override
    public String getMessage() {
        return  "Negative radius " ;
    }
}
public class exeptions {
    public  static  int  zero(int a, int b) throws  Exception {
        if (a==b){
            throw new  Negative();
        }
        int res = a/b;
        return res;
    }
    public static void main(String[] args) {
        try {
            System.out.println(zero(12,12));
        }
        catch (Exception e){
            System.out.println("Exception " +e);
        }
    }
}

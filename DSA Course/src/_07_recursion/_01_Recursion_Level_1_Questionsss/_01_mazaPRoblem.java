package _07_recursion._01_Recursion_Level_1_Questionsss;

public class _01_mazaPRoblem {
//    public static int count(int r,int c){
//        if (r==1 || c==1){
//            return 1;
//        }
////        down
//        int down = count(r-1, c);
////        for right
//        int right = count(r, c-1);
//        int res = down+right;
//        return res;
//    }

    public static void printpar(String s, int r, int c){
        if (r==1 && c==1){
            System.out.println(s);
            return;
        }
        if (r>1){
            printpar(s+'D', r-1, c);
        }
        if (c>1){
            printpar(s+'R', r, c-1);
        }
    }
    public static void main(String[] args) {
//        System.out.println(count(3,3));
        printpar("", 3,3);
    }
}

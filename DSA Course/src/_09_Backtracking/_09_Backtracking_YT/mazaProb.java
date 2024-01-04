package _09_Backtracking._09_Backtracking_YT;

public class mazaProb {
    public static void path(String p, int r, int c){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            path(p+ 'D', r-1, c);
        }
        if (c>1){
            path(p+'R', r, c-1);
        }
    }
    public static void pathWithDigonal(String p, int r, int c){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1 && c>1){
            path(p+'D', r-1, c-1);
        }
        if (r>1){ //row
            pathWithDigonal(p+ 'D', r-1, c);
        }

        if (c>1){   //col
            pathWithDigonal(p+'R', r, c-1);
        }
    }
    public static void main(String[] args) {
        pathWithDigonal("", 3,3);
    }
}

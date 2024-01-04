package _09_Backtracking;
public class _02_Find_Parmutation {
    public static void findp(String str, String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newS = str.substring(0,i) + str.substring(i+1);
            findp(newS, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findp(str, ans);
    }
}

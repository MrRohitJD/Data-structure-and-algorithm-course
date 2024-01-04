package _07_recursion._03_Recursion_Subset_Subsequence_String_Questions;

public class _01_skip_char {
    static void SkipChar(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c =up.charAt(0);
        if (c=='a'){
            SkipChar(p,up.substring(1));
        }
        else {
            SkipChar(p+c,up.substring(1));
        }

    }
    public static void main(String[] args) {
        String up="bbbaaacdacc";
        SkipChar("",up);
    }
}

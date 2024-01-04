package _11_Stack_;

import java.util.Stack;

public class Duplicate_para {
    public static boolean dupPara(String p){
        Stack <Character> s =new Stack<>();
        for (int i = 0; i <p.length() ; i++) {
            char curr= p.charAt(i);
            if (curr==')'){
                int count = 0;
                while (s.peek()!='('){
                    s.pop();
                    count++;
                }
                if (count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else {
                s.push(curr);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String p = "((a+b))"; //true
        String q = "(a+b)"; //flase
        System.out.println(dupPara(q));

    }
}

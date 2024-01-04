package _11_Stack_;

import java.util.Stack;

public class _08_Valid_parenthesis {
    public static boolean vldPara(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '[' || curr == '(' || curr == '{') {
                s.push(curr);
            }
            else {
                if (s.isEmpty()) {
                    return false;
                }
                if(  (s.peek() == '(' && curr == ')') ||
                        (s.peek() == '[' && curr == ']') ||
                        ( s.peek() == '{' && curr == '}')) {
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        String str = "({[]}())";
        System.out.println(vldPara(str));
    }
}

package _11_Stack_;

import java.util.Stack;

public class REV_STRING {

    public static void  ResStr(Stack<String> st, StringBuilder r){
        if (st.isEmpty()){
            return;
        }
        String p  = st.pop();
        r.append(p);
        ResStr(st, r);


    }
    public static void main(String[] args) {
         StringBuilder r = new StringBuilder("");
        Stack <String>st =new Stack<>();
        st.push("Apple");
        st.push("Bannana");
        st.push("Cat");
        System.out.println(st);
        ResStr(st,r);
        System.out.println(r);
    }
}

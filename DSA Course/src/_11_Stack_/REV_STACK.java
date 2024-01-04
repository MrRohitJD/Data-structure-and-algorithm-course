package _11_Stack_;

import java.util.Stack;

import static _11_Stack_._02_Push_At_Buttom.AddButtom;

public class REV_STACK {
    public static  void revStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int t = st.pop();
        revStack(st);
        AddButtom(st,t);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        revStack(st);
        System.out.println(st);

    }
}

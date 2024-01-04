package _11_Stack_;

import java.util.Stack;

public class _02_Push_At_Buttom {
    public static void AddButtom(Stack<Integer>st,int data){
        if (st.isEmpty()){
            st.push(data);
            return;
        }
       int top = st.pop();
        AddButtom(st, data);
        st.push(top);
    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        AddButtom(st,100);
        System.out.println(st);
    }
}

package _11_Stack_;

import java.util.Stack;

public class _06_Stock_Span {
    public static void StockSpan(int Stock[], int span[]){
        Stack <Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);
        for (int i=1;i<Stock.length;i++){
            int currPri = Stock[i];
            while (!s.isEmpty() && currPri>Stock[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()) {
                span[i]=i+1;
            }
            else {
                int high = i-s.peek();
                span[i]=high;
//                int prihigh = s.peek();
//                span[i]=i-prihigh;
            }
            s.push(i);
        }

    }
    public static void main(String[] args) {
        int Stock []={100,80,60,70,60,85,100};
        int span [] = new int [Stock.length];
        StockSpan(Stock,span);
        for (int i = 0; i <span.length ; i++) {
            System.out.print(span[i]+" ");
        }
//        System.out.println(span);
    }
}

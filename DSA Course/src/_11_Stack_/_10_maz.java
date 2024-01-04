package _11_Stack_;

import java.util.Stack;

public class _10_maz {
    public static void rs(int [] histogram, int []RS){
        Stack<Integer> s=new Stack<>();
        for (int i = histogram.length-1; i >=0 ; i--) {
            while (!s.isEmpty() && histogram[s.peek()]>=histogram[i]){
                s.pop();
            }
            if (s.isEmpty()){
                RS[i]=histogram.length;
            }
            else{
                RS[i] =s.peek();
            }
            s.push(i);
        }
    }
    public static void ls(int histogram [], int []LS){
        Stack<Integer> s =new Stack<>();
        for (int i = 0; i <histogram.length; i++) {
            while (!s.isEmpty() && histogram[s.peek()]>=histogram[i]){
                s.pop();
            }
            if (s.isEmpty()){
                LS[i]=-1;
            }
            else{
                LS[i] =s.peek();;
            }
            s.push(i);
        }
    }
    public static int area(int histogram[], int[]RS, int[] LS){
        int maxArea=0;
        for (int i = 0; i < RS.length; i++) {
            int width = RS[i]-LS[i]-1;
            int hieght = histogram[i];
            int currArea =hieght*width;
             maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int histogram[] = {2,1,5,6,2,3};
        int RS[] = new int[histogram.length];
        int LS[] = new int[histogram.length];
        rs(histogram,RS);
        ls(histogram,LS);
        System.out.println(area(histogram, RS,LS));
    }
}


package _19_Tries;
import static _19_Tries._01_Insert_element_in_Tries.*;

public class _06_Longest_word_with_all_prifix {
    public static String fina="";
    public static void lwap(Node root,StringBuilder temp){
        if (root==null){
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i]!=null && root.children[i].eow==true){
                char ch= (char)(i+'a');
                temp.append(ch);
                if (temp.length()>fina.length()){
                    fina = temp.toString();
                }
                lwap(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1); ///backtracking
            }
        }
    }
    public static void main(String[] args) {
        String arr[] ={"a", "app","appl","apple", "ap","apply", "bannana"};
        for (int i = 0; i <arr.length ; i++) {
            insert(arr[i]);
        }
        lwap(root, new StringBuilder());
        System.out.println(fina);
    }
}

package _19_Tries;

public class _03_prifix_prob {
    static class Node{
        Node children[] =new Node[26];
        Boolean eow =false;
        int freq;

        Node() {
            for (int i = 0; i < children.length ; i++) {
                children[i] =null;
            }
             freq =1;
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i <word.length() ; i++) {
            int idx = word.charAt(i)-'a';
            if (curr.children[idx]==null){
                curr.children[idx] =new Node();
            }
            else {
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow =true;
    }
    public static void findPrifix( Node root,String ans){
        if (root==null){
            return;
        }
        if (root.freq==1){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i <root.children.length ; i++) {
            if (root.children[i]!=null){
                findPrifix(root.children[i], ans+(char)(i+'a') );
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"ap", "app", "apps", "apply"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        root.freq = -1;
        findPrifix(root, "");
    }
}

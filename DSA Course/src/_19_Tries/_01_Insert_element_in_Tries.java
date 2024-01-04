package _19_Tries;
class Node{
    Node children[] =new Node[26];
    boolean eow =false;

    public Node() {
        for (int i = 0; i <26 ; i++) {
            children[i] =null;
        }
    }
}
public class _01_Insert_element_in_Tries{

    public static Node root =new Node();
    public static void insert(String word){
        Node curr =root;
        for (int level = 0; level <word.length(); level++) {
            int inx = word.charAt(level)-'a';
            if (curr.children[inx]==null){
                curr.children[inx]=new Node();
            }
            curr=curr.children[inx];
        }
        curr.eow=true;
    }
    public static boolean search(String key){ //o(L)
        Node curr =root;
        for (int level = 0; level <key.length() ; level++) {
            int idx = key.charAt(level)-'a';
            if (curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow==true;
    }
    public static void main(String[] args) {
        String word[]={"the", "a","there", "their","any", "thee"};
        for (int i = 0; i < word.length ; i++) {
            insert(word[i]);
        }
        System.out.println(search("any"));
        System.out.println(search("an"));
        System.out.println(search("a"));

    }
}

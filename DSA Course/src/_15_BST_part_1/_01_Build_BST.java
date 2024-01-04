package _15_BST_part_1;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data =data;
        this.left =null;
        this.right =null;
    }
}
public class _01_Build_BST {
    public static Node insert(Node root, int val){
        if (root==null){
            root = new Node(val);
            return root;
        }
        if (root.data>val){
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={3,5,6,8,10,11,12};
        Node root = null;
        for (int i = 0; i <values.length; i++) {
           root = insert(root, values[i]);
        }
        inorder(root);
    }
}

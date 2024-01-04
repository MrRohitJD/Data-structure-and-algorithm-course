package _15_BST_part_1;
import static _15_BST_part_1._01_Build_BST.*;
public class _03_Delete_Node {
    public static Node delete(Node root, int val){
        if (root.data>val){
            root.left  =delete(root.left, val);
        }
        else if(root.data<val) {
            root.right =delete(root.right, val);
        }
        else {
            if (root.left==null && root.right==null){
                return null;
            }
            if(root.left==null) {
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }
            Node IS = IndorderSuccesser(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node IndorderSuccesser(Node root){
        if (root.left!=null){
            return root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
         int values []={8,5,3,1,4,6,10,11,14};
         Node root= null;
        for (int i = 0; i <values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        delete(root, 10);
        System.out.println();
        inorder(root);
    }
}

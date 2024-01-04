package _16_BST_part_2;

import java.util.ArrayList;
 import static _16_BST_part_2._01_sorted_arr_to_BST.*;

public class _02_convert_BST_to_BAl_BST {
    public static void getInorder(Node root, ArrayList<Integer> al){
        if (root == null) {
            return;
        }
        getInorder(root.left, al);
        al.add(root.data);
        getInorder(root.right,al);
    }
    public static Node createBST(ArrayList<Integer>al, int st, int en){
        if (st>en){
            return null;
        }
        int mid = (st+en)/2;
        Node root = new Node(al.get(mid));
        root.left = createBST(al, st, mid-1);
        root.right = createBST(al, mid+1, en);
        return root;
    }
    public static Node balanceBST(Node root){
        ArrayList<Integer>al =new ArrayList<>();
        getInorder(root, al);
        root = createBST(al,0,al.size()-1);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left =new Node(5);
        root.left.left.left  =new Node(3);

        root.right =new Node(10);
        root.right.right =new Node(11);
        root.right.right.right =new Node(12);

        root = balanceBST(root);
        priorder(root);






    }
}

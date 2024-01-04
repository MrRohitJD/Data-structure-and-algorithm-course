package _16_BST_part_2;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;

public class _04_Merge_2_BSTs{
    public static void inorder(Node root, ArrayList<Integer>al){
        if (root==null){
            return;
        }
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right, al);
    }
    public static void priorder(Node root){
            if (root==null){
                return;
            }
            System.out.print(root.data+" ");
            priorder(root.left);
            priorder(root.right);

        }
    public static Node createBST(ArrayList<Integer>al ,int st, int en){
        int mid = (st+en)/2;
        if (st>en){
            return null;
        }
        Node root = new Node(al.get(mid));
        root.left = createBST(al, st, mid-1);
        root.right = createBST(al, mid+1, en);
        return root;

    }
    public static Node mergeBST(Node root1,Node root2){
        ArrayList<Integer>al1 =new ArrayList<>();
        inorder(root1,al1);
        ArrayList<Integer>al2 =new ArrayList<>();
        inorder(root2,al2);
        ArrayList<Integer>finall =new ArrayList<>();
        int i=0,j=0;
        while (i<al1.size() && j<al2.size() ){
            if (al1.get(i)<=al2.get(j)){
                finall.add(al1.get(i));
                i++;
            }
            else {
                finall.add(al2.get(j));
                j++;
            }
        }
        while (i<al1.size()){
            finall.add(al1.get(i));
            i++;
        }
        while (j<al2.size()){
            finall.add(al2.get(j));
            j++;
        }
       return createBST(finall,0,finall.size()-1);


    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right  =new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right=new Node(12);

        Node root =mergeBST(root1,root2);
        priorder(root);
    }
}

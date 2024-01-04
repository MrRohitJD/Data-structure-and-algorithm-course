package _15_BST_part_1;

import java.util.ArrayList;

import static _15_BST_part_1._01_Build_BST.insert;

public class _05_rootToLeep_path {
    public static void printPath(ArrayList<Integer> al){
        for (int i = 0; i <al.size() ; i++) {
            System.out.print(al.get(i)+" ");
        }
        System.out.println("");
    }
    public static void rTo_l_Path(Node root, ArrayList<Integer>al){
        if (root==null){
            return;
        }
        al.add(root.data);
        if (root.left==null && root.right==null){
            printPath(al);
        }
        rTo_l_Path(root.left,al);
        rTo_l_Path(root.right, al);
        al.remove(al.size()-1);
    }
    public static void main(String[] args) {
        int values []={8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        ArrayList<Integer>al = new ArrayList<>();
        rTo_l_Path(root,al);
    }
}

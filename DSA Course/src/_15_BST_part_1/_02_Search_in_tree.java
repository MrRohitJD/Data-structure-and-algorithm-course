package _15_BST_part_1;

public class _02_Search_in_tree {
    public static Node inser(Node root, int val){
        if(root==null){
            return  root =new Node(val);
        }
        if (root.data>val){
            root.left = inser(root.left, val);
        }
        else{
            root.right= inser(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root , int k){
        if (root==null){
            return false;
        }
        if (root.data ==k){
            return true;
        }
        if (root.data>k) {
            return search(root.left, k);
        }
         if (root.data<k) {
            return search(root.right, k);
        }
        return false;

    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root =null;
        for (int i = 0; i < values.length; i++) {
            root = inser(root, values[i]);
        }
//        inorder(root);
        System.out.println(search(root, 6));

    }
}

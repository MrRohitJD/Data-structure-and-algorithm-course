package _15_BST_part_1;
import static _15_BST_part_1._01_Build_BST.*;
public class _04_print_in_range {
    public static void range(Node root ,int n1 , int n2){
        if (root==null){
            return;
        }
        if (root.data>=n1 && root.data<=n2){
             range(root.left, n1, n2);
            System.out.print(root.data+" ");
            range(root.right, n1,n2);
        }
        else if(root.data<n1){
            range(root.left, n1, n2);
        }
        else {
            range(root.right, n1,n2);
        }
    }
    public static void main(String[] args) {
        int values []={8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        range(root, 5 ,11);

    }
}

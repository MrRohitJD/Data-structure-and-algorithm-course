package _16_BST_part_2;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left = null;
        this.right =null;
    }
}
public class _01_sorted_arr_to_BST {
    public static Node createBSTArr(int arr[], int st, int ed){
        if (st>ed){
            return null;
        }
        int mid = (st+ed)/2;
        Node root = new Node(arr[mid]);
        root.left = createBSTArr(arr, st, mid-1);
        root.right = createBSTArr(arr, mid+1, ed);
        return root;
    }
    public static void priorder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        priorder(root.left);
        priorder(root.right);

    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        Node root = createBSTArr(arr, 0, arr.length-1);
        priorder(root);

    }
}

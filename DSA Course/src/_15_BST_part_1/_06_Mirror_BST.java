package _15_BST_part_1;

public class _06_Mirror_BST {
    public static Node mirror(Node root){
        if (root==null){
            return null;
        }
        Node leftM = mirror(root.left);
        Node rightM = mirror(root.right);
        root.left = rightM;
        root.right =leftM;
        return root;

    }
    public static void priorder(Node root){
        if (root==null){
            return;
        }
        priorder(root.left);
        priorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
   Node root = new Node(1);
        root.left =new Node(2);
        root.left.left =new Node(3);
        root.left.right =new Node(4);
        root.right =new Node(5);
        root.right.left = new Node(6);
        root.right.right =new Node(7);
        priorder(root);
        System.out.println();
        mirror(root);
        System.out.println();
        priorder(root);



    }
}

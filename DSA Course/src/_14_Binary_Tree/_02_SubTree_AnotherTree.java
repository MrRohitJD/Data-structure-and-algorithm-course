package _14_Binary_Tree;

class Node2{
    int data;
    Node2 left;
    Node2 right;

    public Node2(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BineryTree{
    static int ind=-1;
    public static Node2 buildtree(int nodes[]){
        ind++;
        if (nodes[ind]==-1){
            return null;
        }
        Node2 newNode = new Node2(nodes[ind]);
        newNode.left = buildtree(nodes);
        newNode.right = buildtree(nodes);
        return newNode;
    }


}
public class _02_SubTree_AnotherTree {
    public static boolean isIdentical(Node2 node,Node2 subroot){
        if (node==null && subroot==null){
            return true;
        } else if (node==null || subroot==null || node.data !=subroot.data) {
            return false;
        }
        if (!isIdentical(node.left , subroot.left)){
            return false;
        }
        if (!isIdentical(node.right , subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node2 root, Node2 subroot){
        if (root==null){
            return false;
        }
        if (root.data==subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot) ||isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {
        Node2 root =new Node2(1);
        root.left =new Node2(2);
        root.right =new Node2(3);
        root.left.left =new Node2(4);
        root.left.right =new Node2(5);
        root.right.left =new Node2(6);
        root.right.right =new Node2(7);

        Node2 subroot = new Node2(2);
        subroot.left = new Node2(4);
        subroot.right =new Node2(5);
//        subroot.right.left =new Node2(10);

        System.out.println(isSubtree(root, subroot));

    }
}

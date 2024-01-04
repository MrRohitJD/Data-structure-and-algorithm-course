package _14_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Binarytree{
    static int ind =-1;
    public static Node buildtree(int nodes[]){
        ind++;
        if (nodes[ind]==-1){
            return null;
        }
        Node newNode = new Node(nodes[ind]);
        newNode.left = buildtree(nodes);
        newNode.right = buildtree(nodes);
        return newNode;
    }
    public static void priorder(Node root){
        if (root==null){
            return;
        }
        priorder(root.left);
        priorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void Inorder(Node root){
        LinkedList ld =new LinkedList<>();
        if (root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);

    }
    public static void PostOrder(Node root){
        if (root==null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        if (root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.println(currNode.data+" ");
                if (currNode.left !=null);{
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int Height_of_Tree(Node root){
        if (root==null){
            return 0;
        }
       int l= Height_of_Tree(root.left);
        int r = Height_of_Tree(root.right);
        int h = Math.max(l,r)+1;
        return h;
    }
    public static int countNodes(Node root){
        if (root==null){
            return 0;
        }
       int lh = countNodes(root.left);
        int rh = countNodes(root.right);
        return lh+rh+1;
    }
    public static int SumNodes(Node root){
        if (root==null){
            return 0;
        }
        int lh = SumNodes(root.left);
        int rh = SumNodes(root.right);
        return lh+rh+ root.data;
    }
    public static boolean isIdentical(Node node,Node subroot){
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
    public static boolean isSubtree(Node root, Node subroot){
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
}
public class _01_Create_Binary_tree {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int subnodes[] = {2,4,-1,-1,5,-1,-1};
        Binarytree bt =new Binarytree();
        Node root = bt.buildtree(nodes);
        Node subroot = bt.buildtree(subnodes);
//        System.out.println(root.data);
//        bt.priorder(root);
//        bt.Inorder(root);
//        bt.PostOrder(root);
//        int Height = bt.Height_of_Tree(root);
//        System.out.println(Height);
//        int count =bt.countNodes(root);
//        System.out.println(count);
        System.out.println(bt.SumNodes(root));
        System.out.println(bt.isSubtree(root, subroot));
    }
}

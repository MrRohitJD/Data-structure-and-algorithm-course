package _14_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class _04_Kth_level_of_Tree {
    public static void Kth_level_order(Node root , int K){
        Queue<Node> q =new LinkedList<>();
        if (root==null){
            return;
        }
        q.add(root);
        q.add(null);
        int nl=1;
        while (!q.isEmpty()){
            Node curr = q.remove();
            if (curr==null){
                nl++;
                if (q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                if (nl==K) System.out.print(curr.data+" ");
                if (curr.left!=null){
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void Kth_level(Node root ,int level , int K){
        if (root==null){
            return;
        }
        if (level==K){
            System.out.print(root.data+" ");
        }
        Kth_level(root.left, level+1, K);
        Kth_level(root.right, level+1, K);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left =new Node(2);
        root.left.left =new Node(3);
        root.left.right =new Node(4);
        root.right =new Node(5);
        root.right.left = new Node(6);
        root.right.right =new Node(7);
        Kth_level_order(root , 3);
        System.out.println();
        Kth_level(root, 1,3);
    }
}

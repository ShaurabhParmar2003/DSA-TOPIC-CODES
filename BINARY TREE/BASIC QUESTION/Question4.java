//Kth level of a tree....
import java.util.*;
public class Question4 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    } 
    public static void kLevel(Node root,int lev,int k){
        if(root==null){
            return;
        }
        if(lev==k){
            System.out.print(root.data+" ");
            return;
        }
        kLevel(root.left, lev+1, k);
        kLevel(root.right, lev+1, k);
    }
    public static void main(String []args){
        Node root=new Node(1);
             root.left=new Node(2);
             root.right=new Node (3);
             root.left.left=new Node(4);
             root.left.right=new Node(5);
             root.right.left=new Node(6);
             root.right.right=new Node(7);
        int k=3;
        kLevel(root,1,k);
    }
}

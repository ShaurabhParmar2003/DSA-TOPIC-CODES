
import java.util.*;
public class Question1 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    // Height of Tree :-
    public static int heightTree(Node root){
        if(root==null){
            return 0;
        }
        int lh=heightTree(root.left);
        int rh=heightTree(root.right);
        int height= Math.max(lh,rh)+1;
        return height;
        //return Math.max(lh,rh)+1;
    }

    // Question number 2.
    // Count of Tree Nodes...
    
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        int treeCount=leftCount+rightCount+1;
        return treeCount;
    }

    //Question 3.
    //Sum of Tree Node.....

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        int treeSum=leftSum+rightSum+root.data;
        return treeSum;
    }

    //Question4.
    // Diameter of Tree :- 0(n^2)

    public static int Diameter(Node root){
      if(root==null){
        return 0;
      }  
      int leftDiam=Diameter(root.left);
      int leftHt=heightTree(root.left);
      int rightDiam=Diameter(root.right);
      int rightHt=heightTree(root.right);

      int selfDiam=leftHt+rightHt+1;
      return Math.max(selfDiam, Math.max(leftDiam,rightDiam));
    }
    
    
    static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
        public static Info Diameter2(Node root){ //0(n)
            if(root==null){
                return new Info(0, 0);
            }
            Info leftInfo=Diameter2(root.left);
            Info rightInfo=Diameter2(root.right);
            
             int selfDiam = leftInfo.ht + rightInfo.ht + 1;
             int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), selfDiam);

             int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

             return new Info(diam, ht); 
        }
    public static void main(String []args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println("Max height of Tree :-"+heightTree(root));

        System.out.println();
        System.out.println("Total Count of Tree Nodes :-"+count(root));

         System.out.println();
        System.out.println("Sum of Tree Nodes :-"+sum(root));

        System.out.println();
        System.out.println("Diameter of Tree :-"+Diameter(root));

         System.out.println();
        System.out.println("Diameter 2 of Tree :-"+Diameter2(root).diam);
    }
}

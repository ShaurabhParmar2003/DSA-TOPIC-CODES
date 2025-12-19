import java.util.*;

public class Question2 {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            this.left= this.right=null;
        }
    }
    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror=createMirror(root.left);
        Node rightMirror=createMirror(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    //Question 2 :-
    //sorted Array to Balanced BST:-

    public static Node createBST(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr, st, mid-1);
        root.right=createBST(arr, mid+1, end);
        return root;
    }

    //Question 3 :-
    //Convert BST to Balanced BST:-

    public static Node balancedBST(Node root){
        ArrayList<Integer> inOrder=new ArrayList<>();
        getInOrder(root,inOrder);
        root=createBST2(inOrder, 0, inOrder.size()-1);
        return root;
    }
    public static void getInOrder(Node root,ArrayList<Integer> inOrder){
        if(root==null){
            return ;
        }
        getInOrder(root.left, inOrder);
        inOrder.add(root.val);
        getInOrder(root.right, inOrder);
    }

    public static Node createBST2(ArrayList<Integer> inOrder,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inOrder.get(mid));
        root.left=createBST2(inOrder, st, mid-1);
        root.right=createBST2(inOrder, mid+1, end);
        return root;
    }
    
    public static void main(String []args){
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        int arr[]={3,5,6,8,10,11,12};
        System.out.println("create Mirror BST:-");
        //root=createMirror(root);
        //preOrder(root);
        System.out.println();
        System.out.println("create a balanced BST:-");
        Node root1=createBST(arr, 0, arr.length-1);
        preOrder(root1);
        System.out.println();
        System.out.println("Convert BST to Balanced BST:-");
        root=balancedBST(root);
        preOrder(root);
    }
}

/*import java.util.*;
public class PalindromeLinkedList {
    public static boolean palindromeLL(LinkedList<String> list){
        Stack<String> st=new Stack<>();
        for(int i=0;i<list.size();i++){
            st.push(list.get(i));
        }
        for(int i=0;i<list.size();i++){
            if(!st.pop().equals(list.get(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        LinkedList<String> s=new LinkedList<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("B");
        s.add("A");
        if(palindromeLL(s)==true){
            System.out.println("Yes It is Palindrome");
        }else{
        System.out.println("Not It is Palindrome");
        }
    }
}*/

import java.util.*;

class PalindromeLinkedList {
    public static void main(String args[]) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);

        //one.ptr = two;
        //two.ptr = three;
        //three.ptr = four;
        //four.ptr = five;
        //five.ptr = six;
        //six.ptr = seven;

        boolean condition = isPalindrome(one);
        System.out.println("Palindrome : " + condition);
    }

    static boolean isPalindrome(Node head) {
        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();

        // Step 1: push all elements into stack
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.ptr;
        }

        // Step 2: pop from stack and compare with list
        while (head != null) {
            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            } else {
                ispalin = false;
                break;
            }
            head = head.ptr;
        }
        return ispalin;
    }
}

class Node {
    int data;
    Node ptr;
    Node(int d) {
        ptr = null;
        data = d;
    }
}

//Create a Queue using LinkedList....

public class Question1 {
    static class Queue{
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Node head=null;
        public static Node tail=null;
        
        boolean isEmpty(){
            return head==null&&tail==null;
        }
        //add():-
         void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        //remove():-
         int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val=head.data;
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }
            return val;
        }
        //peek():-
         int peek(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String []args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
            //q.remove();
        }
    }
}

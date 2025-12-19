//import org.w3c.dom.Node;
public class Reversell {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
     public void Addfirst(int data){
        //Step 1 :- Create a Node
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        //Step 2 :- newnode next=head
        newnode.next=head;//link
        //Step 3 :- head=newnode
        head=newnode;
    }
     public void Addlast(int data){
        //Step 1 :- Create a Node
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        //Step 2 :- tail next=newnode 
        tail.next=newnode;//link
        //Step 3 :- head=newnode
        tail=newnode;
    }
    //add midile linkedlist
    public void add(int idx,int data){
        //add(0,5); is case me
        if(idx==0){
            Addfirst(data);
            return;
        }
        Node newnode=new Node(data);
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //REVERSE LINKED LIST...

    public void Reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        tail=head;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String [] args){
        Reversell ll=new Reversell();
        ll.Addfirst(2);
        ll.Addfirst(1);
        ll.Addlast(4);
        ll.Addlast(5);
        ll.add(2,3);
        ll.print();
        ll.Reverse();
        ll.print();
    }
}

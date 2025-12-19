import org.w3c.dom.Node;

public class AddLinkedlist {
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
    public static int size;
    public void Addfirst(int data){
        //Step 1 :- Create a Node
        Node newnode=new Node(data);
        size++;
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
        size++;
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
            size++;
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    //REMOVE FIRST NODE
    public int removefirst()
        {
            if(size==0){
            System.out.println("LL is a empty");
            return Integer.MIN_VALUE;
            }
             else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
        //REMOVE LAST NODE
     public int removelast()
        {
            if(size==0){
            System.out.println("LL is a empty");
            return Integer.MIN_VALUE;
            }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
            }
            //prev : i=size=2;
            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            int val=prev.next.data;//tail ka data
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String []args){
        AddLinkedlist ll=new AddLinkedlist();
       // ll.print();
        ll.Addfirst(2);
       // ll.print();
       ll.Addfirst(1);
       // ll.print();
        ll.Addlast(3);
       // ll.print();
        ll.Addlast(5);
        //ll.print();
        ll.add(3,4);
        ll.print();
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print();
        System.out.println(ll.size);
    }   
}

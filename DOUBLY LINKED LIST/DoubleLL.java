
public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //addFirst Method :- 

    public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    //addLast Method :-

    public void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }
    //removeFirst Method :-

    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    //removeLast Method :-

    public int removeLast(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
            int val = tail.data;   // 🟢 Direct tail se data le lo
            tail = tail.prev;      // move tail backward
            tail.next = null;      // unlink last node
            size--;
    return val;
}
    //Print DLL Method :-

    public void print(){
        if(head==null){
            System.out.println("DLL is empty");
            return;
        }
         System.out.print("Null<->");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String []args){
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        System.out.println(dll.size);
        //1<->2<->3<->Null
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
        //2<->3<->Null
        dll.removeLast();
        dll.print();
        System.out.println(dll.size);
    }
}

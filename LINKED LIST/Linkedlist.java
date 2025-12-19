public class Linkedlist {
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
    public void addf(int data){
        Node newnNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnNode;
            return;
        }
        newnNode.next=head;
        head=newnNode;
    }
    public void addl(int data){
        Node newnNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnNode;
            return;
        }
        tail.next=newnNode;
        tail=newnNode;
    }
    public void addm(int idx,int data){
        if(idx==0){
            addf(data);
            return;
        }
        Node newnNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnNode.next=temp.next;
        temp.next=newnNode;
    }
    public int removef(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
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
    public int removel(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        int val=prev.next.data;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void print(){
        Node temp=head;
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.addf(2);
        ll.addf(1);
        ll.addl(4);
        ll.addl(5);
        ll.addm(2,3);
        ll.print();
        System.out.println(ll.size);
        ll.removef();
        ll.print();
        ll.removel();
        ll.print();
        System.out.println(ll.size);
    }
}
public class RemoveNthnode {
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
    public void addf(int data){
        Node newnNode=new Node(data);
        if(head==null){
            head=tail=newnNode;
            return;
        }
        newnNode.next=head;
        head=newnNode;
    }
    public void addl(int data){
        Node newnNode=new Node(data);
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
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnNode.next=temp.next;
        temp.next=newnNode;
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
    public void deleteNthnode(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int itofind=sz-n;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String []args){
        RemoveNthnode ll=new RemoveNthnode();
        ll.addf(2);
        ll.addf(1);
        ll.addl(4);
        ll.addl(5);
        ll.addm(2,3);
        ll.print();
        ll.deleteNthnode(3);
        ll.print();
    }
}

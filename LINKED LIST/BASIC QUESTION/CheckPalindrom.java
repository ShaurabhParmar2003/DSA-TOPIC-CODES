public class CheckPalindrom {
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
    public void addfirst(int data){
        Node newnNode=new Node(data);
        if(head==null){
            head=tail=newnNode;
            return;
        }
        newnNode.next=head;
        head=newnNode;
    }
    public void addlast(int data){
        Node newnNode=new Node(data);
        if(head==null){
            head=tail=newnNode;
            return;
        }
        tail.next=newnNode;
        tail=newnNode;
    }
    public void addMid(int idx,int data){
        Node newnNode=new Node(data);
        if(idx==0){
            addfirst(data);
            return;
        }
        int i=0;
        Node prev=head;
        while (i<idx-1) {
            prev=prev.next;
            i++;
        }
        newnNode.next=prev.next;
        prev.next=newnNode;
    }
    public Node Findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public boolean CheckPalindromll(){
        if(head==null||head.next==null){
            return true;
        }
        //step 1:- find mid

        Node midNode=Findmid(head);

        //step 2:- reverse 2th half

        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //step 3:- check lefthalf and righthalf are equal

        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public void print(){
        if(head==null){
            System.out.print("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String []args){
        CheckPalindrom ll=new CheckPalindrom();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(1);
        ll.print();
        if(ll.CheckPalindromll()==true){
            System.out.println("LL is palindrom");
        }else{
            System.out.println("LL is not palindrom");
        }
    }
}

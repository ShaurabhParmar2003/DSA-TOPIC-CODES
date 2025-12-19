public class Question1 {
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

    //using iterative approach :- 

    public int itesearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
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

    //using recursive methode :- 

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head,key);
    }
    public static void main(String[]args){
        Question1 ll=new Question1();
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        System.out.println(ll.itesearch(3));
        System.out.println(ll.recsearch(3));
        System.out.println(ll.recsearch(10));
    }
}

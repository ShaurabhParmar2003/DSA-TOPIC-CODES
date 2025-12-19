public class MergeSortLL{
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return; // prevent self-loop
        }
        newnode.next = head;
        head = newnode;
    }

    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1!=null) {
        temp.next = head1;
                head1 = head1.next;
                temp=temp.next;
       }
       while (head2!=null) {
        temp.next = head2;
                head2 = head2.next;
                temp=temp.next;
       }
           // if (head1 != null) temp.next = head1;
         //else temp.next = head2;

        return dummy.next;
    }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find mid
        Node mid = getmid(head);

        // Split list
        Node righthead = mid.next;
        mid.next = null;

        // Sort both halves
        Node left = mergesort(head);
        Node right = mergesort(righthead);

        // Merge sorted halves
        return merge(left, right);
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();

        ll.head = ll.mergesort(ll.head);
        ll.print();
    }
}

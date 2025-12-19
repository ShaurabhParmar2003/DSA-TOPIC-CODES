import java.util.LinkedList;
public class Jcf {
    public static void main(String []args){
        LinkedList<Integer> ll=new LinkedList<>();
       
        //AddLast
       ll.addLast(2);
       ll.addLast(4);
        
       //AddFist
        ll.addFirst(1);
        
        //AddMid
        ll.add(2,3);
        
        System.out.println("origale LL");
        System.out.println(ll);
        
        int first= ll.getLast();
        int last= ll.getFirst();
        
        //Remove
        
        ll.removeLast();
        ll.removeFirst();

         System.out.println("remove LL");
        System.out.println(ll);

        System.out.println("get method use");
        System.out.println(first+"->"+last);
    }
}

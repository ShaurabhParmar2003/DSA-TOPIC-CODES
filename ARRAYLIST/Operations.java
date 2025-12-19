import java.util.ArrayList;
public class Operations {
    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        int element= list.get(2);
        System.out.println(element);
        //delet
        //list.remove(2);
       // System.out.println(list);
        //set
        list.set(2,10);
        System.out.println(list);
        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        list.add(0,9);
        System.out.println(list);
    }
    
}

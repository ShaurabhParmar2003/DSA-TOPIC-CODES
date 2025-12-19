import java.util.Comparator;
import java.util.PriorityQueue;
public class Jcf {
    public static void main(String []args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(3);//0(long)
        pq.add(4);
        pq.add(1);
        pq.add(2);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");//0(1)
            pq.remove();//0(long)
        }
    }
}

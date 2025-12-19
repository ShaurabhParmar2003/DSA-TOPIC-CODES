//import java.util.PriorityQueue;
import java.util.*;
public class Object_method {
    static class Student implements Comparable<Student>{
    String name;
    int rank;
    Student(String name,int rank){
        this.name=name;
        this.rank=rank;
    }
    @Override
    public int compareTo(Student s2){
        return this.rank-s2.rank;
    }
}
    public static void main(String[] args) {
        System.out.println("Try program.pro");
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("A",20));
        pq.add(new Student("B",4));
        pq.add(new Student("C",2));
        pq.add(new Student("D",6));
        
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank+" ");
            pq.remove();
        }
    }
}

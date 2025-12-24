
//Count Distinct (unique) Element:-  

import java.util.HashSet;
public class Question3 {
    public static void main(String[] args) {
        int num[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> count=new HashSet<>();
        for(int number:num){
            count.add(number);
        }
        System.out.println("Unique Element Total Count = "+count.size());
    }
}

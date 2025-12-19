/******************************************************************************

        Question 2 : Lonely Numbers in ArrayList(MEDIUM) :- 
        Youaregivenanintegerarraylistnums.
        Anumberxislonelywhenitappearsonlyonce,andno adjacent numbers (i.e. x + 1 and x - 1)
        appear in the arraylist.Return all lonely numbers in nums. You may return the answer in any order.
       
        Sample Input 1: nums = [10,6,5,8]
        Sample Output 1: [10,8]

*******************************************************************************/
import java.util.ArrayList;
import java.util.Collections;
public class Question2 {
    public static ArrayList<Integer> findlonely(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> lonely=new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            if((i==0||nums.get(i)-nums.get(i-1)>1)&&(i==nums.size()-1||nums.get(i+1)-nums.get(i)>1)){
                 lonely.add(nums.get(i));
            }
        }
        return lonely;
    }
    public static void main(String []args){
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1); 
        nums.add(3);
        nums.add(5);
        nums.add(3);
        System.out.println(findlonely(nums));
    }
}

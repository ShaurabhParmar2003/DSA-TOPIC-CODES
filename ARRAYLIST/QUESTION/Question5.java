/******************************************************************************

    Question :- Pair Sum 1 :- 
    Find if any pair in a Sorted ArrayList has a target sum .
    List :- [1,2,3,4,5,6]
    target :- 5
    output :- true.

*******************************************************************************/
import java.util.ArrayList;
public class Question5 {
    public static boolean pairsum1(ArrayList<Integer>list,int target){
        //brute force...
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    //Method 2 :- 2 pointer approach:-
    public static boolean pairsum2(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            //case 1

            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case 2

            if (list.get(lp)+list.get(rp)<target) {
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int target=5;
        System.out.println("Method 1 :- brute force approach :- ");
        System.out.println(pairsum1(list,target));
        System.out.println("Method 2 :- 2 pointer approach best timecomplcity:- ");
        System.out.println(pairsum2(list,target));
    }
}

/******************************************************************************
    
    Question :- Pair Sum 2 :- 
    Find if any pair in a Sorted & Rotated ArrayList has a target sum .
    List :- [11,15,6,8,9,10]
    target :- 16
    output :- true.

*******************************************************************************/
import java.util.ArrayList;
public class Question6 {
    public static boolean pairsumrotated(ArrayList<Integer>list,int target){
        int breakpoint=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                breakpoint=i;
                break;
            }
        }
        int lp=breakpoint+1;//smallest
        int rp=breakpoint;//largest
        while (lp!=rp) {
            //case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case 2:-

            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                //case 3
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println("Method 2 :- Two Pointer Approach ");
        System.out.println("Like :- "+pairsumrotated(list,target));
    }
}

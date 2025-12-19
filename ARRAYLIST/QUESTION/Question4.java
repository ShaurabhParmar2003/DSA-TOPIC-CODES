/******************************************************************************

        Qustion :- Container With Most Water :-
        For give n liner on x-axis , use 2 lines to form a contheiainer
        Such that it holds maximum water.
        Heigth :- [1,8,6,2,5,4,8,3,7]
        OUTPUT :- 49.

*******************************************************************************/
import java.util.ArrayList;
public class Question4 {
    public static int storewater(ArrayList<Integer>height){
        int maxwater=0;
        //Methode 1 :- use brute force...
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width= j-i;
                int currwater=ht*width;
                maxwater=Math.max(maxwater,currwater);
            }
        }
        return maxwater;
    }


    //Methode 2 :-  using 2 pointer Approach :- o(n)


    public static int storewater2(ArrayList<Integer>height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while (lp<rp) {
            //calculate water area....
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater,currwater);
            //update ptr....
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String []args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
         System.out.println("Methode 1 :- brute force :- ");
        System.out.println("Answer :-"+storewater(height));
         System.out.println("Methode 2 :- 2 pointer approach :- ");
         System.out.println("Answer :-"+storewater2(height));
    }
}

//Input:- Start=[10,12,20]
//        end=[20,25,30]
//  Output:- 2(A0 & A2).

import java.util.ArrayList;
public class Question1 {
    public static void main(String []args){
        int start[]={10,12,20};
        int end[]={20,25,30};
        //end time basics sorted:-
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1st activity:-
        maxAct=1;
        ans.add(0);
        int lasEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lasEnd){
            //activity select:-
            maxAct++;
            ans.add(i);
            lasEnd=end[i];
            }
        }
        System.out.println("MaxActivities="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+"  ");
        }
        System.out.println();
    }
}

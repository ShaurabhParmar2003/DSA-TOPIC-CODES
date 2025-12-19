//LeetCode Question :-239 important 
import java.util.*;
public class Question3 {
    public static int []maxSlidingWindow(int[]nums,int k){
        List<Integer> temp=new ArrayList<>();
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            //remove indices outside the current window :-
            if(!dq.isEmpty()&&i-dq.peekFirst()+1>k){
                dq.pollFirst();
            }
            //remove indices of smaller elements form the back :-
            while (!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]) {
                dq.pollLast();
            }
            //Add current index :-
            dq.offerLast(i);
            //Add current max to result list :-
            if(i+1>=k){
                temp.add(nums[dq.peekFirst()]);
            }
        }
        //convert list<Integer> to int[] :-
        int []ans=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
    public static void main(String []args){
        int nums[]={1,3,-1,-3,5,3,6,7};
        int k=3;
       int result[]=maxSlidingWindow(nums,k);
        //System.out.println(Arrays.toString(result));
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}

//Ques:- Next Greater the Element :-
//The next greater element of some element X in 
//an array is the first greater element that is
//to the right of X in the same array. 
import java.util.*;
public class NextGreaterEl {
    public static void main(String []args){
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nextGreater[]=new int [arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //step 1 while..
            while (!s.isEmpty()&&arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            // step 2 if-else..
            if(s.isEmpty()){
                nextGreater[i]=-1;
            } else{
                nextGreater[i]=arr[s.peek()];
            }
            // step 3 push in stack...
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}

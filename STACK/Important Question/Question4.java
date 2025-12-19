import java.util.*;
public class Question4 {
    public static void stacksSpan(int stacks[],int span[]){
        Stack<Integer> stack=new Stack<>();
        span[0]=1;
        stack.push(0);
        for(int i=1;i<stacks.length;i++){
            int currprice=stacks[i];
            while(!stack.isEmpty()&&currprice>=stacks[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh=stack.peek();
                span[i]=i-prevHigh;
            }
            stack.push(i);
        }
    }
    public static void main(String []args){
        int stacks[]={100, 80, 60, 70, 60, 85, 100};
        int span[]=new  int[stacks.length];
        stacksSpan(stacks,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}

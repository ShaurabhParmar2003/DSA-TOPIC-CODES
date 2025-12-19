import java.util.*;
public class Question4 {
    public static void printNonRepeting(String str){
        int frq[]=new int [26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            frq[ch-'a']++;
            while(!q.isEmpty()&&frq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                 System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String []args){
        String str="aabccxb";
        printNonRepeting(str);
    }
}

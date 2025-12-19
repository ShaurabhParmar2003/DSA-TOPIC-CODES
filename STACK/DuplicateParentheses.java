import java.util.*;
public class DuplicateParentheses {
    public static boolean findDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing :-
            if(ch==')'){
                int count=0;
                while(s.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true;//Duplicate hai
                }
            }else{
                //opening:-
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String []args){
        String str="((a+b))"; //true
        String str2="(a-b)";//false
        System.out.println(findDuplicate(str));
    }
}


//thoda better code hai :-

/*import java.util.*;
class Main {
    public static boolean dp(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing
            if(ch==')'){
                int count=0;
                while(!s.isEmpty()&&s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(s.isEmpty()){
                    return false;
                }
                s.pop();
                if(count<1){
                    return true;
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str="(a+b)";
        System.out.println(dp(str));
    }
}*/
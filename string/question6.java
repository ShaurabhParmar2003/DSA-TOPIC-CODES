//import java.util.Scanner;
public class question6 {
    public static String countvowels(String name){
        StringBuilder sb=new StringBuilder("");
         Integer count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                count++;
            }
        }
        sb.append(count);
        return sb.toString();
    }
    public static void main(String []args){
       // String name=new Scanner(System.in).nextLine();
        //Scanner sc=new Scanner(System.in);
        //String name=sc.nextLine();
        System.out.print("how many times lowercase vowels= ");
        //System.out.print(countvowels(name));
        System.out.print(" times");
    }
    
}

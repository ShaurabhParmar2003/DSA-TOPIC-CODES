//print x^n...
public class Problem9 {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        //int fpower=power(x,n-1);
         //return x*fpower;
//optimizedpower modifiction of same question.
     int halfpower=power(x,n/2);
     int halfpowersq=halfpower*halfpower;
     //n is odd  
     if(n%2!=0){
        halfpowersq=x*halfpowersq;
       }
       return halfpowersq;
    }
    public static void main(String args[]){
        System.out.println(power(2,10));
    }
}

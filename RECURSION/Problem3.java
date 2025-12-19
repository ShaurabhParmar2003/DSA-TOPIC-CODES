//print factorial of number n.
public class Problem3 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
       //int fn=factorial(n-1);
       int fn1=n*factorial(n-1);
       return fn1;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(factorial(n));
    }
}

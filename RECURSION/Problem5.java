//print Nth Fibonacci number. 
public class Problem5 {
    public static int fibo(int n){
        if(n==1||n==0){
            return n;
        }
        int fib1=fibo(n-1);
        int fib2=fibo(n-2);
        int fn=fib1+fib2;
        return fn;
    }
    public static void main(String []args){
        int n=25;
        System.out.println(fibo(n));
    }
}

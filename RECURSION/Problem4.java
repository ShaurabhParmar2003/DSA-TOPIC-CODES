//print sum of first n natural numbers.
public class Problem4 {
    public static int SumOfNaturalNumbaer(int n){
        if(n==1){
            return 1;
        }
        int sum=n+SumOfNaturalNumbaer(n-1);
        return sum;
    }
    public static void main(String []args){ 
        int n=5;
        System.out.println(SumOfNaturalNumbaer(n));
    }
}

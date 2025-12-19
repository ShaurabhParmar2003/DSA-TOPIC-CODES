//you are given anumber (eg - 2019),convert it into a string of engkish like
//"two zero one nine". use a recursive function to solve this problem.
//NOTE :- The digit of number will only be in the range 0-9 and the last dugit of a number can't be 0.
//simple input : 1947
//sample output : "one nine four seven".

public class Question2 {
    public static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    //static int numcalls = 0;
    public static void printdigit(int number){
        if(number==0){
            System.out.println("not a digit numer");
            return;
        }
        int lastdigit=number%10;
        printdigit(number/10);
        System.out.print(digit[lastdigit]+" ");
    }
    public static void main(String []args){
        printdigit(1947);
        //System.out.println();
    }
}

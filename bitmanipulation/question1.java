public class question1 {
    //check if a number is odd or even
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static int getihbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
            else{
                return 1;
            }
    }
    public static void main(String []args){
        oddoreven(3);
        oddoreven(2);
        oddoreven(5);
        System.out.print(getihbit(10, 03));
    }
}

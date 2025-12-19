//friend pairing problem....
//given n friends ,each one can remain single or con be paired up
//with some other friend each friend can be paird only once find 
//out the total number of ways in which friends can remain single 
//or can be paired up...... 
public class Problem12 {
    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1=friendspairing(n-1);

        //pair
        int fnm2=friendspairing(n-2);
        int pairways=(n-1)*fnm2;

        //totalways
        int totalways=fnm1+pairways;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(friendspairing(3));
    }
}

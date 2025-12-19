//Tiling problem
//given a "2*n" board and tiles of size "2*1",count the number of
//ways to tile the given board using the 2*1 tiles.
//(A tile can either be placed horizontally or vertically.)..........
public class Problem10 {
    public static int tilingproblem(int n){//2 x n (floor size)
       //base case
       if(n==0||n==1){
        return 1;
       }
       
        //kaam
        //vertical choice.
        int vtrem = tilingproblem(n-1);

        //horizontal choice
        int htrem =tilingproblem(n-2);
        int totalways = vtrem + htrem;
        return totalways;
    }
    public static void main(String args[]){
System.out.print(tilingproblem(4));
System.out.print(" Ways");
    }
}

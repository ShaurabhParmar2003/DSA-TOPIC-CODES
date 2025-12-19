public class practiceques2 {
    public static void sumofsecondrow(int [][] arr)
    {   int sum=0;
        for(int j=0;j<arr[0].length;j++)
        {
            sum+=arr[1][j];
        }
        System.out.println("Total sum of second Row:- "+sum);
    }
    public static void main(String []args)
    {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        sumofsecondrow(arr);
    }
    
}

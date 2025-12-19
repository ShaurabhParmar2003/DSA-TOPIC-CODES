public class practiceques {
    public static void findout(int [][]arr,int key)
    { int n=arr.length;
        int m=arr[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==key)
                {
                    count++;
                }
            }
        }
        System.out.println("number of 7s :-"+count);
    }
    public static void main(String args [])
    {
        int arr[][]={{4,7,8},{8,8,7}};
        int key=7;
        findout(arr,key);
    }
}

public class insertionsort{
    public static void insetionsort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String []args)
    {
        int arr[]={5,2,1,3,4};
        insetionsort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

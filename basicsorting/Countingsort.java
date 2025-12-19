public class Countingsort {
    public static void countingsort(int arr[])
    {
    int size=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(size<arr[i])
            {
                size=arr[i];
            }
        }
        System.out.println("size of array :-"+size);
        int [] count=new int [size+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int index=0;
        for(int i=size;i>0;i--)
        {
            while(count[i]!=0)
            {
                arr[index]=i;
                index++;
                count[i]--;
            }
        }
    } 
    public static void main(String [] args)
    {
        int arr[]={4,3,1,5,2};
        countingsort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}

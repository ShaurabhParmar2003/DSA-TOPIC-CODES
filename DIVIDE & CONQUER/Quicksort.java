public class Quicksort {
    public static void Quicksorting(int arr[],int st,int end){
        if(st>=end){
            return;
        }
        //last element
        int pidx=partition(arr,st,end);
        Quicksorting(arr,st,pidx-1);//left part
        Quicksorting(arr,pidx+1,end);//right part
    }
    public static int partition(int arr[],int st,int end){
        int pivot=arr[end];
        int i=st-1;//to make place for els smaller then pivot
        for(int j=st;j<end;j++){
            if(arr[j]<pivot){
                i++;
                  // swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
                int temp=pivot;
                arr[end]=arr[i];
                arr[i]=temp;
                return i;
    }
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
        Quicksorting(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

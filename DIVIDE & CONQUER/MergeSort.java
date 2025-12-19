public class MergeSort {
    public static void MergeSorting(int arr[],int st,int end){
       //base case
        if(st>=end){
            return;
        }
        //kam
        int mid=st+(end-st)/2; //  (st+end)/2;
        MergeSorting(arr,st,mid);
        MergeSorting(arr,mid+1,end);
        merge(arr,st,mid,end);
    }
    //merge the array
    public static void merge(int arr[],int st,int mid,int end){
        int temp[]=new int[end-st+1];
        int i=st;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temparr
        while(i<=mid&&j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
            //k++;
        }

        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }

        //copy temp to original arr
        for(k=0,i=st;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        System.out.println("i am saurabh");
        int arr[]={6,3,9,5,2,8,-2};
        MergeSorting(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //System.out.println();
    }
    
}

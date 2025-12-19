public class Problem8 {
    public static int lastoccurence(int arr[],int i,int key){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastoccurence(arr, i-1, key);
    }
    public static void main(String []args){
        int arr[]={2,5,3,4,4,3,2,3};
        //int i=arr.length-1;
        System.out.println(lastoccurence(arr,arr.length-1, 5));
    }
}

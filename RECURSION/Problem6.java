public class Problem6 {
    public static boolean issortedarr(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issortedarr(arr, i+1);
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5};
       if(issortedarr(arr, 0)==true){
        System.out.println("arrray is sorted");
       }else{
        System.out.println("array is not sorted");
       }
    }
}

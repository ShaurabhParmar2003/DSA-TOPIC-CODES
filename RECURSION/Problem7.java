//WAF to find the first occurence of an element in an array.
public class Problem7 {
    public static int firstoccurence(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurence(arr, i+1, key);
    }
    public static void main(String []args){
        int arr[]={2,1,3,4,5,1};
        System.out.println(firstoccurence(arr, 0, 5));
    }
}

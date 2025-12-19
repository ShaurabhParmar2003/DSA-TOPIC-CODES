//SEARCH IN ROTATED SORT ARRAY :- 
//INPUT :- sorted ,rotated array with distinct number
//(in ascending order) it is rotated at a pivot point 
//find the index of given element.....
public class Search {
    public static int searcharray(int arr[],int tar,int st,int end){
        //base case
        if(st>end){
            return -1;
        }
        //kam
        int mid=st+(end-st)/2;

        //case found
        if(arr[mid]==tar){
            return mid;
        }

        //mid on l 1
        if(arr[st]<=arr[mid]){
            //csae a: left
            if(arr[st]<=tar&&tar<=arr[mid]){
                return searcharray(arr, tar, st, mid-1);
            }else{
                //case b : right
                return searcharray(arr, tar, mid+1, end);
            }
        }

        //mid on l 2
        else{
            //case c : right
            if(arr[mid]<=tar&&tar<=arr[end]){
                return searcharray(arr, tar, mid+1, end);
            }else{
                //case d : left
                return searcharray(arr, tar, st, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int taridx=searcharray(arr, target, 0, arr.length-1);
        System.out.println("target = "+taridx);
    }
}

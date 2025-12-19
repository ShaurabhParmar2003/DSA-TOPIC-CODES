//for a given integer array of size n. you have to find all the
//occurrences (indices) of a element (key) print them. use a
//recursive function to solve this problem.......
//sample input :arr[]={3,2,4,5,6,2,7,2,2} ,key=2
//OUTPUT:- 1 5 7 8
public class Question1 {
    public static void findoccur(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        findoccur(arr, key, i+1);
    }
    public static void main(String []args){
        int arr[]={3,2,4,5,6,2,7,2,2};
        findoccur(arr, 2, 0);
    } 
}

//apply merge sort to an array of string.(asscume that all the character in
//all the string are in lowercase).(EASY)..
public class Question1 {
    public static void mergesort(String arr[],int st,int end){
        //base case
         if (st >= end) {
            return;
        }

        int mid = st + (end - st) / 2;

        // left half
        mergesort(arr, st, mid);

        // right half
        mergesort(arr, mid + 1, end);

        // merge step
        merge(arr, st, mid, end);
    }

    // Merge two sorted halves
    public static void merge(String arr[], int st, int mid, int end) {
        String temp[] = new String[end - st + 1]; // temporary array
        int i = st;     // left half index
        int j = mid + 1; // right half index
        int k = 0;      // temp index

        while (i <= mid && j <= end) {
            if (arr[i].compareTo(arr[j]) < 0) { // lexicographic comparison
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // leftover elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // copy back to original array
        for (k = 0,i=st; k < temp.length; k++,i++) {
           // arr[st + k] = temp[k];
           arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        String arr[] = {"banana", "apple", "grape", "cherry", "mango"};

        System.out.println("Original Array:");
        for (String s : arr) {
            System.out.print(s + " ");
        }

        mergesort(arr, 0, arr.length - 1);

        System.out.println("\n\nSorted Array:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
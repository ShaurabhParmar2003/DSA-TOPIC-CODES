
//Union and intersection of 2 arrays:-...

import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union = "+set.size()+set);

        // set total clear like :- [0]
        set.clear();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        HashSet<Integer> set2=new HashSet<>();
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set2.add(arr2[i]);
               set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection = "+count+set2);
    }
}

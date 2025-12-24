//Majority Element:-given arr[]..
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,3,1,1,5,1};
        System.out.print("Enter a number ex:= enter '1' Methode 1 code & enter 2 Methode 2 code choise you :-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        switch (n) {
            case 1:
                //Metode 1:-

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        Set<Integer> keyset=map.keySet();
        for(Integer key:keyset){
            if(map.get(key)>arr.length/3){
                System.out.println("result="+key);
            }
        }
                 break;
        case 2:
            //Methode 2:-

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(Integer key:map.keySet()){
            if(map.get(key)>arr.length/3){
                System.out.println("result="+key);
            }
        }
        break;
            default:System.out.println("(sorry) yesa koi case nahi hai");
                break;
       }
    }
}

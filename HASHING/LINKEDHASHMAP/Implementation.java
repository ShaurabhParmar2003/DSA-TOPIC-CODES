import java.util.*;
public class Implementation {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
       
        lhm.put("India", 171);
        lhm.put("Chaina",170);
        lhm.put("Nepal", 50);
        System.out.println("1. print all put (add) (key , vallue) :-");
        
        System.out.println("result= "+lhm);
        
        System.out.println("2. print get key of hashMap:-");
        
        System.out.println("result= "+lhm.get("India"));
        
        System.out.println("3. print result true = key hai HashMap me or , flase = key nahi hai HashMap me :-");
        
        System.out.println("result= "+lhm.containsKey("Nepal"));
        
        System.out.println("4. HashMap mese key delet ho gya hai but value return kiya hai :-");
        
        System.out.println("result= "+lhm.remove("Chaina"));
        
        System.out.println("result= "+lhm);
    }
}

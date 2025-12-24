import java.util.HashMap;
public class HashMAp {
    public static void main(String []args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("india",160);
        hm.put("china",170);
        hm.put("nepal",50);
        System.out.println("1. print all put (add) (key , vallue) :-");
        System.out.println("result= "+hm);
        System.out.println("2. print get key of hashMap:-");
        System.out.println("result= "+hm.get("india"));
        System.out.println("3. print result true = key hai HashMap me or , flase = key nahi hai HashMap me :-");
        System.out.println("result= "+hm.containsKey("dhanbad"));
        System.out.println("4. HashMap mese key delet ho gya hai but value return kiya hai :-");
        System.out.println("result= "+hm.remove("china"));
        System.out.println("result= "+hm);
    }
}

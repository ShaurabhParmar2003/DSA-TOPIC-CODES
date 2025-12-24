import java.util.*;
public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Bihar");
        lhs.add("Bengaluru");
        lhs.add("Nodia");
        lhs.add("Mumbai");
        System.out.println(lhs);
        System.out.println("Before LinkedHashset Size = "+lhs.size());
        lhs.remove("Delhi");
        System.out.println(lhs);
        System.out.println("Remove After LinkedHashset Size = "+lhs.size());
    }
}

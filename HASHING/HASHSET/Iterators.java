import java.util.*;
public class Iterators {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Bengaluru");
        cities.add("Nodia");
        cities.add("Mumbai");
        cities.add("Bihar");
        //type 1:-
        Iterator it=cities.iterator();
        while (it.hasNext()) {
           System.out.println(it.next());
        }

        //type 2:-
        //for(String city:cities){
        //    System.out.println(city);
      //  }
    }
}

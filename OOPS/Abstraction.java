public class Abstraction {
    public static void main(String []args){
    hours h=new hours();
    h.eat();
    h.walk();
    chicken c=new chicken();
    c.eat();
    c.walk();
    }
}
abstract class animal{
    void eat(){
        System.out.println("animal eating"); 
       }
       abstract void walk();
}
class hours extends animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}


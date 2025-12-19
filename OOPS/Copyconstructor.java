public class Copyconstructor {
    public static void main(String []args){
        car c1=new car();
        c1.color="read";
        System.out.println(c1.color);
        c1.brand="BMW";
        System.out.println(c1.brand);
        c1.speed=200;
        System.out.println(c1.speed);
        car c2=new car(c1);
        c2.speed=300;
        System.out.println(c2.speed);
    }
}
class car{
    String color;
    String brand;
    int speed;
  //compy constructor
    car(car c1){
        this.color=c1.color;
        this.brand=c1.brand;
        //this.speed=c1.speed;
    }
    car(){
        System.out.println("constructor defolat call");
    }
    car(String color,String brand){
        this.color=color;
        this.brand=brand;
    }
    car(int speed){
        this.speed=speed;
    }
}

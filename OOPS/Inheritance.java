public class Inheritance {
    public static void main(String [] args){
        //singal level inheritance
        fish shark=new fish();
        shark.eating();
        shark.swin();
        //multi level inheritance
        dog dobby=new dog();
        dobby.eating();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}
//base class
class animal{
    String color;
    void eating(){
        System.out.println("eating");
    }
    void breathe(){
        System.out.println("breatheing");
    }
}
//derived class / subclass
class fish extends animal{
    int fins;
    void swin(){
        System.out.println("swining");
    }
}

//multi level inheritance
class mammals extends animal{
    int legs;

}
class dog extends mammals{
    String breed;
}
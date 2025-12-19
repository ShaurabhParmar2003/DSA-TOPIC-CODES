public class Classobject {
    public static void main(String []args){
        System.out.println("hello world");
        pen p1=new pen();
        p1.setcolor("white");
       // p1.color="yellow";
        System.out.println(p1.color);
        p1.setTip(2);
        System.out.println(p1.tip);
        student s1=new student();
        s1.name="saurabh";
        s1.age=19;
        System.out.println(s1.name+"\n"+s1.age);
        s1.percentage(45,88,99);
        System.out.println(s1.per);
    }

}

class pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
class student{
    String name;
    int age;
    float per;
    void percentage(int phy,int chem,int math){
        per=(phy+chem+math)/3;
    }
}
    
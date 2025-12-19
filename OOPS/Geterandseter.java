public class Geterandseter {
    public static void main(String args[]){
        pen p1=new pen();
        p1.setcolor("white");
        System.out.println(p1.getcolor());
        p1.setTip(3);
        System.out.println(p1.getTip());
    }
}
class pen{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setcolor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}

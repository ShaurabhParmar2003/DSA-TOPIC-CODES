public class polymorphism {
    public static void main(String args[]){
        calculater call=new calculater();
        System.out.println(call.sum(5,5,10));
        System.out.println(call.sum((float)2.5,(float)5.5));
        deer sb= new deer();
        sb.eat();
    }
}
//methoded overloading
class calculater{
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a + b;
    }
}
//method overriding
class animal{
    void eat(){
        System.out.println("eating anything");
    }
}
class deer extends animal{
    void eat(){
        System.out.println("eats grass");
    }
}
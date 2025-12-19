//print the sum,difference and product of two comlex number by creating
//a class named complex with separate methods for each operation whose real
//and imaginary parts are entered by user.
//import java.util.*;
public class Question1 {
    public static void main(String []args){
        System.out.println("hello i am saurabh");
        complex c=new complex(4,5);
        complex d=new complex(9, 4);

        complex e= complex.add(c,d);
        complex f= complex.diff(c,d);
        complex g= complex.product(c, d);
        e.printcomplex();
        f.printcomplex();
        g.printcomplex();
    }
}
class complex{
    int real;
    int imag;

public complex(int r,int i){
    real=r;
    imag=i;
}
public static complex add(complex a,complex b){
    return new complex((a.real+b.real),(a.imag+b.imag));
}
public static complex diff(complex a,complex b){
    return new complex((a.real-b.real),(a.imag-b.imag));
}
public static complex product(complex a, complex b){
    return new complex (((a.real*b.real)-(a.imag*b.imag)),
                        ((a.imag*b.real)+(a.imag*b.real)));
}
public void printcomplex(){
    if(real==0&&imag!=0){
        System.out.println(imag+"i");
    }
    else if (imag==0&&real!=0){
        System.out.println(real);
    }
    else{
        System.out.println(real+"+"+imag+"i");
    }
}
}


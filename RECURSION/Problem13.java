public class Problem13 {
    public static void printbinstring(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        //kam
       // if(lastplace==0){
            //sit 0on chir n
           // printbinstring(n-1,0, str.append("0"));
            //printbinstring(n-1, 1, str.append("1"));
        //}else{
          //  printbinstring(n-1, 0, str.append("0"));
        //}
        printbinstring(n-1, 0, str+"0");
        if(lastplace==0){
            printbinstring(n-1, 1, str+"1");
        }

    }
    public static void main(String args[]){
        printbinstring(3, 0,"");
    }
}

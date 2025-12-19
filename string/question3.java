//QNO:-3 for a given set of string print the largest string
//********//"apple","mango","banana"
public class question3 {
    public static void main(String []args)
    {
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++)
        {           //useing compare function in string 
            if(largest.compareToIgnoreCase(fruits[i])<0)
            {
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}

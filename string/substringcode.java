public class substringcode {
    public static String substring(String str,int st,int end)
    {
        String substr="";
        for(int i=st;i<end;i++)
        {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
        String str="helloworld";
        //lkud ka code hai substring ka
        System.out.println(substring(str,0,5));
       // System.out.println(str.substring(0,5));
       //***this is a java peale se code likha rahta hai substring ka***
    }
    
}

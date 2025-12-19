public class question1 {
    public static boolean checkpalindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        if(checkpalindrome(str)==true)
        {
            System.out.println("is palindrome string");
        }
        else{
            System.out.println("is not palindrom string");
        }
        
    }
    
}

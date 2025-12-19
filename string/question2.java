public class question2 {
    public static float getshortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            //south
            if(dir=='s')
            {
                y--;
            }
            //north
            else if(dir=='n')
            {
                y++;
            }
            //west
            else if(dir=='w')
            {
                x--;
            }
            //east
            else if(dir=='e')
            {
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String []args){
        String path="wneenesennn";
        System.out.println(getshortestpath(path));
    }
    
}

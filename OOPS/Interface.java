public class Interface {
    public static void main(String []args){
        queen q=new queen();
        q.move();
    }
}
interface chessplayer{
    void move();
}
class queen implements chessplayer{
   public void move(){
        System.out.println("up, down, left, rigth, diagonal -(in all 4 dirns)");
    }
}
class rook implements chessplayer{
    public void move(){
        System.out.println("up, dwon, lift, right");
    }
}
class king implements chessplayer{
    public void move(){
        System.out.println("up, dwon, lift, right, diagonal -(by 1 step)");
    }
}

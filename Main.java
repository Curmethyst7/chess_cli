import java.util.Scanner;
import pieces.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Board board = new Board();

        board.getNewBoard();
        board.getBoard();

        System.out.println(board.isValidPosition(1,1,1,1));
    }
}
import pieces.*;
import java.util.Scanner;

public class Board{
    
    Piece[][] board = new Piece[8][8];
    
    public void getNewBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(i == 0 || i == 7){
                    if(j == 0 || j == 7){
                        this.board[i][j] = new Rook(i == 7);
                    } else if(j == 1 || j == 6){
                        this.board[i][j] = new Knight(i == 7);
                    } else if(j == 2 || j == 5){
                        this.board[i][j] = new Bishop(i == 7);
                    } else if(j == 4){
                        this.board[i][j] = new King(i == 7);
                    } else if(j == 3){
                        this.board[i][j] = new Queen(i == 7);
                    }
                } else if(i == 1 || i == 6){
                    this.board[i][j] = new Pawn(i == 6);
                }
            }
        }
    }

    public void getBoard(){
        for(int i = 0; i < 9; i++){
            if(i < 8){
                System.out.print(8 - i + " |");
                for(int j = 0; j < 8; j++){
                    Piece pieces = board[i][j];
                    if(pieces == null){
                        System.out.print(" |");
                    } else {
                        System.out.print(pieces.getTypeCode() + "|"); 
                    }
                }
                System.out.println();
            }
            if(i == 8){
                System.out.print("   ");
                for(int j = 0; j < 8; j++){
                    System.out.print((char) ('a' + j) + " "); 
                }
            }
        }
    }

    public void getMove(int fromX, int fromY, int toX, int toY){
        //if(fromX > 0 || fromX < 0){}
        
        
        //Piece piece = this.board[8 - a]
    }

    public boolean isValidPosition(int fromX, int fromY, int toX, int toY){
        try {
            Piece piece = this.board[8 - fromX][8 - fromY];
            Piece target = this.board[8 - toX][8 - toY];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Trigger is Success");
            return false;
        }
        return true;
    }
}
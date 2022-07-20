package Classes;

import javafx.geometry.Pos;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.ArrayList;
class Position{
    int row;
    int column;
}

class



public class Board {

    private int dimension;
    private int[][] board;
    private ArrayList<ArrayList<Position>> boxes;
    public Board(int dimension){
        this.dimension = dimension;
        board = new int[this.dimension][this.dimension];
        boxes = new ArrayList<>();
        InitializeBoard();
    }


    public int GetBoardDimension(){
        return dimension;
    }


    public void InitializeBoard(){
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }
    }

    public void InitializeBoxes(){
        for (int i = 0; i <dimension ; i++) {
            for (int j = 0; j <dimension ; j++) {
                boxes.add()
            }
        }



    }

    public void PrintBoard(){
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void PlayGivenPosition(int x, int y, int playerTurn){
        board[x][y] = playerTurn;
    }


    public int CompletedBoxes(int x , int y , int playerTurn){
        int count = 0;
        if(board[x][y-1]!=0 || board[x][y-1]!= -1){

        }

    }

    public int GetEmptyTilesCount(){
        int count = 0;
        for (int i = 0; i <dimension ; i++) {
            for (int j = 0; j <dimension ; j++) {
                if(board[i][j] == 0){
                    count++;
                }
            }
        }
        return count;
    }


    public boolean IsOutOfBoundaries(int x , int y){
        return  x > dimension || y > dimension;
    }

    public boolean IsTileAvailable(int x , int y){
        return board[x][y] == 0;
    }



}

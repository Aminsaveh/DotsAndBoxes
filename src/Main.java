import Classes.Board;
import Classes.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    static ArrayList<Player> players;
    static  Board  board;
    static  int    currentTurnPlayerIndex;
    static  Scanner scanner ;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        players = new ArrayList<>();
        System.out.println("HI! Welcome To The Game!");
        System.out.println("Please Enter First Player Name : ");
        String player1Name = scanner.next();
        System.out.println("Please Enter Second Player Name : ");
        String player2Name = scanner.next();
        System.out.println("Please Enter Board Dimensions : ");
        int boardDimension = scanner.nextInt();
        InitializeGame(player1Name,player2Name,boardDimension);
    }


    public static void InitializeGame(String player1Name, String player2Name, int boardDimension){
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        board          = new Board(boardDimension);
        players.add(player1);
        players.add(player2);
        StartGame();
    }

    public static void ShowPlayerStats(){
        for (int i = 0; i <players.size() ; i++) {
            System.out.println("Player " + (i+1) + " - Score :  " + players.get(i).GetBoxCount());
        }
        System.out.println("Empty Available Tiles : " + board.GetEmptyTilesCount());
    }

    public static void StartGame(){
        ChangeTurn(true,true);

    }

    public static void ChangeTurn(boolean isFirst, boolean nextPlayer){
        ShowPlayerStats();
        board.PrintBoard();
        if(nextPlayer){
            currentTurnPlayerIndex =isFirst ? 1 : currentTurnPlayerIndex+1 > players.size() ? 1 : currentTurnPlayerIndex+1;
        }
        System.out.println("It's Player " + currentTurnPlayerIndex + "'s Turn");
        ChooseTile();
    }

    public static void ChooseTile(){

        System.out.println("Please Choose One Tile-Row ");
        int row = scanner.nextInt();
        System.out.println("Please Choose One Tile-Column ");
        int column = scanner.nextInt();
        if(board.IsOutOfBoundaries(row-1,column-1)){
            System.out.println("Please Enter Each Position In Range [1, " + board.GetBoardDimension() + "]" );
            System.out.println("Please Try Again" );
            ChangeTurn(false,false);
        }else if (!board.IsTileAvailable(row-1,column-1)){
            System.out.println("Your Chosen Tile Is Not Empty!! ");
            System.out.println("Please Try Again" );
            ChangeTurn(false,false);
        }
        else{
                board.PlayGivenPosition(row-1,column-1,currentTurnPlayerIndex);
                ChangeTurn(false,true);
        }
    }


}

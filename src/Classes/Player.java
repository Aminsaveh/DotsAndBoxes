package Classes;

public class Player {

    private String name;
    private boolean isMyTurn;
    private int boxCount;


    public Player(String name){
        this.name     = name;
        this.isMyTurn = false;
        this.boxCount    = 0;
    }



    public String GetName(){
        return name;
    }

    public boolean GetIsMyTurn(){
        return isMyTurn;
    }

    public int GetBoxCount(){
        return boxCount;
    }

}

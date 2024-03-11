package src;
import java.util.ArrayList;
import java.util.Scanner;
public class Player {
    int MoneyBalance; //decide on starting balance later
    int PlayerNumber; //stores player number
    int PlayerLocation = 0; //startPosition
    Scanner scanner = new Scanner(System.in);
    String PlayerName;  //stores name of the player
    String playingPiece; //stores player piece, can change into a graphic once swing is set up
    ArrayList<Bean> beansOwned = new ArrayList<>(); //stores the beans owned by the player


    //constructor, created for each player
    public Player(int newPlayerNumber, String newPlayerName, String newPlayerPiece) {
        this.PlayerNumber = newPlayerNumber;
        this.PlayerName = newPlayerName;
        this.playingPiece = newPlayerPiece;
    }
<<<<<<< HEAD
=======

>>>>>>> 1951db22a0c3fa67fb4c3d7d5c52ad986b905503
    public int changeMoney(int moneyAmount) {  //takes certain amount of money and passes it into method so that method knows how much money to add (eg 1000 for landing on go 500 for passing go)
        MoneyBalance = MoneyBalance + moneyAmount; //can pass in negative parameter to decrease money
        return MoneyBalance;
    }

    public ArrayList<Bean> getBeansOwned() {
        return beansOwned;
    }

    private int getPlayerLocation() {
        return PlayerLocation;
    }

<<<<<<< HEAD
    public int getMoneyBalance() { return MoneyBalance; }
    public boolean missATurn(boolean missATurn) {

    }



=======
    public int getMoneyBalance() {
        return MoneyBalance;
    }

>>>>>>> 1951db22a0c3fa67fb4c3d7d5c52ad986b905503

}

package src;
import java.util.ArrayList;
import java.util.Scanner;
public class Player {
    int MoneyBalance = 2000; //decide on starting balance later
    int PlayerNumber; //stores player number
    int PlayerLocation = 0; //startPosition
    //board booleans
    boolean isDouble; //if player rolled double
    boolean landedOnCard;
    boolean landedOnMissATurn;
    boolean missATurn;
    boolean landOnGo;
    boolean passGo;
    boolean landOnBean;

    Scanner scanner = new Scanner(System.in);
    MainForm mainForm = new MainForm();
    Board board = new Board();
    String PlayerName;  //stores name of the player
    String playingPiece; //stores player piece, can change into a graphic once swing is set up
    ArrayList<Bean> beansOwned = new ArrayList<>(); //stores the beans owned by the player



    //constructor, created for each player
    public Player(int newPlayerNumber, String newPlayerName, String newPlayerPiece) {
        this.PlayerNumber = newPlayerNumber;
        this.PlayerName = newPlayerName;
        this.playingPiece = newPlayerPiece;
        this.MoneyBalance = 2000;
        isDouble = false; landedOnCard = false; landedOnMissATurn = false; missATurn = false;
        landOnGo = false; passGo = false; landOnBean = false;
    }

    public void changeMoney(int moneyAmount, ArrayList<Player> players) {  //takes certain amount of money and passes it into method so that method knows how much money to add (eg 1000 for landing on go 500 for passing go)
        MoneyBalance = MoneyBalance + moneyAmount; //can pass in negative parameter to decrease money
        mainForm.updateMoneyBalanceDisplay((PlayerNumber - 1), players);
        board.checkBalance(PlayerNumber - 1, players, mainForm);
    }

    public ArrayList<Bean> getBeansOwned() {
        return beansOwned;
    }

    private int getPlayerLocation() {
        return PlayerLocation;
    }

    public int getMoneyBalance() { return MoneyBalance; }

    public boolean missATurn(boolean missATurn) { return missATurn;  }


}

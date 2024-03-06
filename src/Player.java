package src;
public class Player {
    int MoneyBalance; //decide on starting balance later
    int PlayerNumber; //stores player number
    String PlayerName;  //stores name of the player
    boolean missTurn;



    //constructor, created for each player
    public Player(int playerNumber, String playerName) {
        this.PlayerNumber = playerNumber;
        this.PlayerName = playerName;
    }
    public int changeMoney(int moneyAmount) {  //takes certain amount of money and passes it into method so that method knows how much money to add (e.g. 1000 for landing on go 500 for passing go)
        MoneyBalance = MoneyBalance + moneyAmount; //can pass in negative parameter to decrease money
        return MoneyBalance;
    }
    public int getMoneyBalance() {
        return MoneyBalance;
    }
    public void missTurn(boolean skipTurn) {
        this.missTurn = skipTurn;
        do {
            //code for missing a turn once we have turns sorted out
            missTurn = false;
        } while (missTurn == true);
    }
}


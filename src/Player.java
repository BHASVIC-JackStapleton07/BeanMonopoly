package src;

public class Player {
    int MoneyBalance = 0; //decide on starting balance later
    int PlayerNumber; //stores player number
    String PlayerName;  //stores name of the player




    //constructor, created for each player
    public Player(int playerNumber, String playerName) {
        this.PlayerNumber = playerNumber;
        this.PlayerName = playerName;
    }
    public int addMoney(int moneyAmmount) {  //takes certain amount of money and passes it into method so that method knows how much money to add (eg 1000 for landing on go 500 for passing go)
        MoneyBalance = MoneyBalance + moneyAmmount;
        return MoneyBalance;
    }
    public int decreaseMoney(int moneyAmmount) {
        MoneyBalance = MoneyBalance - moneyAmmount;
        return MoneyBalance;
    }

}


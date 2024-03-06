package src;

public class Bean {
    //variables
    private String name;
    private int location;
    private int level;
    private boolean isBought;
    private int cost; //cost to buy
    private int tax;
    private int ownerID;


    //this fills in the information when the beans are made at the start of the game
    public Bean(String newName, int newLocation, int newCost, int newTax) {
        name = newName; tax = newTax; //sets variables
        location = newLocation; cost = newCost;
        isBought = false; ownerID = 0; //ownerID = 0 and isbought is false because the bean isn't owned by anyone
        level = 0; //unbought means the bean is not upgraded
    }

    //called when a bean is bought
    private void buy(int playerID) {
        isBought = true;
        ownerID = playerID;
        //sets player as owner
    }

    private void update() {
        level++;
        //level up by one when bean upgraded
    }

    //gets
    private int getCost() {
        return cost; //returns the base level cost
    }

    private int getTax() {
        return tax; //level 0 tax
    }

    private int getOwnerID() {
        return ownerID;
    }

}

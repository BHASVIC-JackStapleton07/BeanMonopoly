package src;

import java.util.ArrayList;
import java.util.Random;

public class Cards {
    String textOutput;
    int outcome = 0; //takes in amount of money to change
    ArrayList<Cards> cards = new ArrayList<>();


    private Random random;

    public Cards(String text, int moneyChange) { //passes in amount of money to change when card is pulled
        this.textOutput = text;
        this.outcome = moneyChange;
        random = new Random();
    }

    public String returnCardText(int index) {
        textOutput = cards.get(index).textOutput;
        return textOutput;
    }

    public int returnCardMoneyChange(int index) {
        outcome = cards.get(index).outcome;
        return outcome;
    }
}
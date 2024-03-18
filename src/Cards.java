package src;

import java.util.ArrayList;
import java.util.Random;

public class Cards {
    String textOutput;
    int outcome = 0; //takes in amount of money to change
    ArrayList<Cards> cards = new ArrayList<>();
    public void createCards() {
        //add cards (name, location, cost, tax)
        cards.add(new Cards("Bank error in your favor", 75));
        cards.add(new Cards("Doctor's fees", -50));
        cards.add(new Cards("Pay hospital fees", -100));
        cards.add(new Cards("Holiday fund matures", 100));
        cards.add(new Cards("Income tax refund", 20));
        cards.add(new Cards("It's your birthday", 60));
        cards.add(new Cards("Life insurance matures", 100));
        cards.add(new Cards("You inherit your Grandma's knitting set", 50));
        cards.add(new Cards("Sale of stock", 50));
        cards.add(new Cards("Receive consultancy fee", 25));
        cards.add(new Cards("Pay school fees", -50));
        cards.add(new Cards("You came last place in a beauty contest", -10));
        cards.add(new Cards("You lose your insurance policy", -100));
        cards.add(new Cards("You have won a crossword competition", 100));
    }

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
package src;

import java.util.ArrayList;
import java.util.Random;

public class Cards {

    private void createBeans(ArrayList<String> cards) {
        //add beans (name, location, cost, tax)
        cards.add("Bank error in your favor", 75);
        cards.add("Doctor's fees", -50);
        cards.add("Pay hospital fees", -100);
        cards.add("Holiday fund matures", 100);
        cards.add("Income tax refund", 20);
        cards.add("It's your birthday", 60);
        cards.add("Life insurance matures", 100);
        cards.add("You inherit your Grandma's knitting set", 50);
        cards.add("Sale of stock", 50);
        cards.add("Receive consultancy fee", 25);
        cards.add("Pay school fees", -50);
        cards.add("You have won last place prize in a beauty contest", -10);
        cards.add("You lose your insurance policy", -100);
        cards.add("You have won a crossword competition", 100);
    }

    private Random random;

    public Cards() {
        random = new Random();
    }

    public String drawCard() {
        int index = random.nextInt(cards.length);
        return cards[index];
    }
}
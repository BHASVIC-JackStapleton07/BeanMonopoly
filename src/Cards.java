package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//CARDS
// Define the Cards class
public class Cards {
    private String outcome;

    // Constructor
    public Cards(String outcome) {
        this.outcome = outcome;
        List<String> outcomes = generateOutcomes();

        // Create a list to hold Mystery Beans
        List<Cards> mysteryBeans = new ArrayList<>();

        // Populate the list with Mystery Beans with different outcomes
        for (String outcome : outcomes) {
            Cards bean = new Cards(outcome);
            mysteryBeans.add(bean);
        }

        // Display the outcomes of each Mystery Bean
        for (int i = 0; i < mysteryBeans.size(); i++) {
            System.out.println("Card " + (i + 1) + " Outcome: " + mysteryBeans.get(i).getOutcome());
        }
    }

    // Gets outcome
    public String getOutcome() {
        return outcome;
    }

    // Generates a list of 20 different outcomes
    public static List<String> generateOutcomes() {
        List<String> outcomes = new ArrayList<>();

        // Add different chance card outcomes
        outcomes.add("Advance to Go (Collect $200)");
        outcomes.add("Bank error in your favor – collect $75");
        outcomes.add("Doctor's fees – Pay $50");
        outcomes.add("Get out of jail free – this card may be kept until needed or sold");
        outcomes.add("Pay hospital fees of $100");
        outcomes.add("Advance to Baked Beans – If you pass Go, collect $200");
        outcomes.add("Holiday fund matures - Receive $100");
        outcomes.add("Income tax refund – collect $20");
        outcomes.add("It's your birthday - Collect $10 from each player");
        outcomes.add("Life insurance matures - Collect $100");
        outcomes.add("You inherit your Grandma's knitting set - collect $50");
        outcomes.add("From sale of stock you get $50");
        outcomes.add("Receive $25 consultancy fee");
        outcomes.add("Pay school fees of $50");
        outcomes.add("You are assessed for street repairs – $40 per house, $115 per hotel");
        outcomes.add("You have won last place prize in a beauty contest– collect $10");
        outcomes.add("You lose your insurance policy - pay $100");
        outcomes.add("You are assessed for repairs - pay $40 per house, $115 per hotel");
        outcomes.add("You have won a crossword competition - collect $100");
        outcomes.add("Go to Jail – Go directly to Jail – Do not pass Go, do not collect $200");

        // Shuffle the outcomes
        Collections.shuffle(outcomes);

        // Return the first 20 outcomes
        return outcomes.subList(0, 20);
    }


    }

package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
<<<<<<< HEAD
    static Scanner scanner = new Scanner(System.in);
    Board board = new Board();
    DiceRoller dice = new DiceRoller();
=======
>>>>>>> 1951db22a0c3fa67fb4c3d7d5c52ad986b905503

    public static void main(String[] args) {
        //create bean array
        PlayerManager playerManager = new PlayerManager(); //makes player manager to store players
        ArrayList<Bean> beans = new ArrayList<>();
        createBeans(beans);
<<<<<<< HEAD
        createPlayers();
        turn(players);
=======

>>>>>>> 1951db22a0c3fa67fb4c3d7d5c52ad986b905503
    }




    private static void createBeans(ArrayList<Bean> beans) {
        //add beans (name, location, cost, tax)
        beans.add(new Bean("Baked Bean", 1, 60, 10));
        beans.add(new Bean("Kidney Bean", 2, 60, 20));
        beans.add(new Bean("Black Bean", 3, 100, 30));
        beans.add(new Bean("Black-Eyed Bean", 4, 100, 30));
        beans.add(new Bean("Cannellini Bean", 5, 120, 40));
        beans.add(new Bean("Chickpea", 6, 140, 50));
        beans.add(new Bean("Pinto Bean", 7, 140, 50));
        beans.add(new Bean("Lima Bean", 8, 160, 60));
        beans.add(new Bean("Fava Bean", 9, 180, 70));
        beans.add(new Bean("Navy Bean", 10, 180, 70));
        beans.add(new Bean("Adzuki Bean", 11, 200, 80));
        beans.add(new Bean("Edamame Bean", 12, 220, 90));
        beans.add(new Bean("Mung Bean", 14, 220, 90));
        beans.add(new Bean("Soy Bean", 15, 240, 100));
        beans.add(new Bean("Anasazi Bean", 16, 260, 110));
        beans.add(new Bean("Cocoa Bean", 17, 260, 110));
        beans.add(new Bean("Coffee Bean", 18, 280, 120));
        beans.add(new Bean("Fayot Bean", 19, 300, 130));
        beans.add(new Bean("Green Bean", 20, 300, 130));
        beans.add(new Bean("Broad Bean", 21, 320, 150));
        beans.add(new Bean("Long Bean", 22, 350, 175));
        beans.add(new Bean("String Bean", 23, 400, 200));
        beans.add(new Bean("Ben's Beans", 24, 500, 250));
    }

    }
<<<<<<< HEAD

    public static void removePlayer(String playerName) {
        System.out.println("Sorry " + playerName + " , but you are out of money, this means you have been eliminated from the game, better luck next time!");
        //code removing from list when it gets sorted out
    }
    public static void turn(ArrayList<Player> players) {
        int counter = 0;
        int move; //used to calculate how much player needs to move on the board (can get passed into another method)
        boolean isDouble;
        DiceRoller diceRoller = new DiceRoller();
        boolean landedOnCard;
        boolean missATurn;
        boolean landOnGo;
        boolean passGo;
        do {
            do {
                isDouble = false;
                System.out.println("It is now player " + players.get(counter) + " turn.");
                System.out.println("Dice 1: " + diceRoller.dice1);
                System.out.println("Dice 2: " + diceRoller.dice2);
                System.out.println("Total Score: " + diceRoller.getTotalScore());
                System.out.println("Is double: " + diceRoller.isDouble());
                move = diceRoller.getTotalScore();
                // code to make player move along this board

                if (landedOnCard) {
                    //code for drawing a card and doing the action...
                }
                if (landOnGo) {
                    players.get(counter).changeMoney(1000);
                    System.out.println("You landed on go! Your balance has increased by 1000.");
                }
                if (passGo) {
                    players.get(counter).changeMoney(500);
                    System.out.println("You passed go! Your balance has increased by 500.");
                }


                isDouble = diceRoller.isDouble;
            } while (isDouble);
            counter++;
        } while(1==1);
    }

}
=======
>>>>>>> 1951db22a0c3fa67fb4c3d7d5c52ad986b905503

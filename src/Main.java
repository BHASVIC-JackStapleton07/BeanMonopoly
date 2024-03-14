package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Board board = new Board();
    DiceRoller dice = new DiceRoller();
    static MainForm mainForm = new MainForm();

    PlayerManager playerManager = new PlayerManager(); //makes player manager to store players

    public static void main(String[] args) {
        //create bean array
        ArrayList<Bean> beans = new ArrayList<>();
        createBeans(beans);
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


    public static void removePlayer(String playerName) {
        mainForm.outputConsoleText("Sorry " + playerName + " , but you are out of money, this means you have been eliminated from the game, better luck next time!");
        //code removing from list when it gets sorted out
    }

}

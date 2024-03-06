package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //create bean array
        ArrayList<Bean> beans = new ArrayList<Bean>();
        ArrayList<Player> players = new ArrayList<>();

    }



    public void createPlayers() {
        int numOfPlayers;
        do {
            System.out.println("How many players will be playing this game of Bean monopoly, please note that the minimum number of players is 2, and the maximum number of players is 4:");
            numOfPlayers = Integer.valueOf(scanner.nextLine());
        } while (numOfPlayers >= 2 && numOfPlayers <= 4);
        for (int i = 2; i <= numOfPlayers; i++) {
            System.out.println("What is player " + i + "s name?:");
            String name = scanner.nextLine();
            System.out.println("Welcome to Bean monopoly " + name + " ,happy playing!");
            Player player = new Player(i, name);
            i++;
        }

    }

}
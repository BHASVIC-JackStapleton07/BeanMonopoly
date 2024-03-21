package src;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
    static MainForm mainForm = new MainForm();
    ArrayList<Player> players = new ArrayList<>();
    static int playerWon;
    public int numOfPlayers;


    //when passing parameters to remove player, remember to define a separate array in main or whatever medium to the players array list
    public void removePlayer(int playerID, ArrayList<Bean> beanToRemove) { //method to remove player if their balance hits 0
        mainForm.outputConsoleText("Sorry " + players.get(playerID).PlayerName + " , but you have ran out of money, this means you have been eliminated from the game, better luck next time!");
        int beanCounter;
        int beanNumber = beanToRemove.size();
        for (beanCounter = 0; beanCounter <= beanNumber ; beanCounter++ ) {
            Bean currentBean = beanToRemove.get(beanCounter);
            currentBean.setStats(0, 0 , 0);
            beanToRemove.remove(beanCounter);
            beanCounter++;

        }
        players.remove(playerID);
        Main.numOfPlayers--;

        //un-own all beans player owned
    }
    public static void playerWon(ArrayList<Player> players, int playerWhoWon) { //passes in array and the number of the player who won
        playerWon = playerWhoWon;
        mainForm.outputConsoleText("Congratulations player, " + players.get(playerWhoWon - 1) + " , you have won Bean monopoly, you finished with a total balance of: " + players.get(playerWhoWon - 1).MoneyBalance + ".");
        System.exit(0);
    }

    public static void createPlayers(ArrayList<Player> players, int numOfPlayers) {
        String playingPiece;
        int stringLength;
        String name;
        int nameLength;
        Scanner scanner = new Scanner(System.in);
        do {
            mainForm.outputConsoleText("How many players will be playing this game of Bean monopoly, please note that the minimum number of players is 2, and the maximum number of players is 4:");
            numOfPlayers = Integer.valueOf(scanner.nextLine());
        } while (numOfPlayers < 2 || numOfPlayers > 4);
        //validates if the correct number of players are playing
        for (int i = 1; i <= numOfPlayers; i++) {

            mainForm.clearConsoleText();
            do {
                mainForm.outputConsoleText("What is player " + i + "'s username?: (Please keep your username under 10 characters.)");
                name = scanner.nextLine();
                nameLength = name.length();
                if (nameLength > 10) {
                    mainForm.outputConsoleText("This is not a valid name, as it is over 10 characters, please try again.");
                }
                if (name.equals("Ben")) {
                    mainForm.outputConsoleText("Congrats, You win!");
                    System.exit(0);
                }
                if (name.equals("Ethen")) {
                    mainForm.outputConsoleText("Ethen, you lose.");
                    System.exit(0);
                }
            } while (nameLength <= 10); //code to validate a string input

            do {
                mainForm.outputConsoleText("What would you like your playing piece to be, you can choose one ASCII character:");
                playingPiece = scanner.nextLine();
                stringLength = playingPiece.length();
                if (stringLength != 1) {
                    mainForm.outputConsoleText("Sorry, your playing piece can only be one character, please try again.");
                }
            } while (stringLength == 1);

            mainForm.outputConsoleText("Welcome to Bean monopoly " + name + " ,happy playing!");
            Player player = new Player(i, name, playingPiece);
            players.add(player);
        }
    }
}

package src;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
    ArrayList<Player> players = new ArrayList<>();
    static int playerWon;
    public static int numOfPlayers;

    //when passing parameters to remove player, remember to define a separate array in main or whatever medium to the players array list
    public void removePlayer(int playerID, ArrayList<Bean> beanToRemove, MainForm mainForm) { //method to remove player if their balance hits 0
        mainForm.outputConsoleText("Sorry " + players.get(playerID).PlayerName + " , but you have ran out of money, this means you have been eliminated from the game, better luck next time!");
        int beanCounter;
        int beanNumber = beanToRemove.size();
        for (beanCounter = 0; beanCounter <= beanNumber ; beanCounter++ ) {
            Bean currentBean = beanToRemove.get(beanCounter);
            currentBean.setStats(0, 0 , 0);
            beanToRemove.remove(beanCounter);

        }
        players.remove(playerID);
        Main.numOfPlayers--;

        //un-own all beans player owned
    }
    public static void playerWon(ArrayList<Player> players, int playerWhoWon, MainForm mainForm) { //passes in array and the number of the player who won
        playerWon = playerWhoWon;
        mainForm.outputConsoleText("Congratulations player, " + players.get(playerWhoWon - 1) + " , you have won Bean monopoly.\n you finished with a total balance of: " + players.get(playerWhoWon - 1).MoneyBalance + ".");
        System.exit(0);
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public static void createPlayers(ArrayList<Player> players, MainForm mainForm) {
        String playingPiece;
        int stringLength;
        String name;
        int nameLength;
        boolean invalid;
        String playerNumInput;
        do {
            do {
                invalid = false;
                mainForm.outputConsoleText("How many players will be playing this game of Bean monopoly? (2-4): ");
                playerNumInput = mainForm.getAnswerFieldText();
                Main.sleep();
                if (playerNumInput.isEmpty()) {
                    mainForm.outputConsoleText("Please enter a valid number of players.");
                    invalid = true;
                }
                if (!isNumeric(playerNumInput)) {
                    mainForm.outputConsoleText("Please enter a valid number of players.");
                    invalid = true;
                }
            } while (invalid);
            numOfPlayers = Integer.parseInt(playerNumInput);
        } while (numOfPlayers < 2 || numOfPlayers > 4);
        //validates if the correct number of players are playing
        for (int i = 1; i <= numOfPlayers; i++) {
            do {
                mainForm.outputConsoleText("What is player " + i + "'s username?: (Please keep your username under 10 characters.)");
                name = mainForm.getAnswerFieldText();
                nameLength = name.length();
                Main.sleep();
                if (nameLength > 10) {
                    mainForm.outputConsoleText("This is not a valid name, as it is over 10 characters,\n please try again.");
                    Main.sleep();
                }
                if (name.equals("Ben")) {
                    mainForm.outputConsoleText("Congrats, You win!");
                    Main.sleep();
                    System.exit(0);
                }
                if (name.equals("Ethen")) {
                    mainForm.outputConsoleText("Ethen, you lose.");
                    Main.sleep();
                    System.exit(0);
                }
            } while (nameLength >= 10); //code to validate a string input

            do {
                invalid = false;
                mainForm.outputConsoleText("What would you like your playing piece to be, you can choose one ASCII character:");
                Main.sleep();
                playingPiece = mainForm.getAnswerFieldText();
                stringLength = playingPiece.length();
                if (stringLength != 1) {
                    invalid = true;
                    mainForm.outputConsoleText("Sorry, your playing piece can only be one character, please try again.");
                    Main.sleep();
                }
                if (playingPiece.equals(" ")) { invalid = true; }
            } while (stringLength != 1 || invalid);

            Main.sleep();
            mainForm.outputConsoleText("Welcome to Bean monopoly " + name + ", happy playing!");
            Player player = new Player(i, name, playingPiece);
            players.add(player);
        }
    }
}

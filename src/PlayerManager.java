package src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
    static MainForm mainForm = new MainForm();
    ArrayList<Player> players = new ArrayList<>();
    int playerWon;

    //when passing parameters to remove player, remember to define a separate array in main or whatever medium to the players array list
    public ArrayList<Player> removePlayer(Player player) { //method to remove player if there balance hits 0
        mainForm.outputConsoleText("Sorry " + player.PlayerName + " , but you have ran out of money, this means you have been eliminated from the game, better luck next time!");
        players.remove(player);
        return players;
    }
    public void playerWon(ArrayList<Player> players, int playerWhoWon) { //passes in array and the number of the player who won
        this.playerWon = playerWhoWon;
        mainForm.outputConsoleText("Congratulations player, " + players.get(playerWhoWon - 1) + " , you have won Bean monopoly, you finished with a total balance of: " + players.get(playerWhoWon - 1).MoneyBalance + ".");
        System.exit(0);
    }

    public ArrayList<Player> createPlayers(ArrayList<Player> players) {
        int numOfPlayers;
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
            } while (nameLength <= 10); //add code to validate a sting input

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
        return players;
    }
}

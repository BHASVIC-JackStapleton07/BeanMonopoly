package src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
    //when passing parameters to remove player, remember to define a separate array in main or whatever medium to the players array list
    public ArrayList<Player> removePlayer(ArrayList<Player> players, Player player) {
        System.out.println("Sorry " + player.PlayerName + " , but you are out of money, this means you have been eliminated from the game, better luck next time!");
        players.remove(player);
        return players;
        //REMOVE PLAYERS IS NOT FINISHED, STILL ISSUES WITH ARRAY
        //FIGURE OUT HOW AND WHAT ARRAY TO PASS AS A PARAMETER, SHOULD USE SIMILAR METHOD AS CREATE PLAYERS SHOWN IN MAIN (ask ben if stuck)
        //IMPORT THE PLAYER WHOSE TURN IT IS WHEN THE CODE GETS FIXED
    }

    public ArrayList<Player> createPlayers(ArrayList<Player> players) {
        int numOfPlayers;
        String playingPiece;
        int stringLength;
        String name;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("How many players will be playing this game of Bean monopoly, please note that the minimum number of players is 2, and the maximum number of players is 4:");
            numOfPlayers = Integer.valueOf(scanner.nextLine());
        } while (numOfPlayers < 2 || numOfPlayers > 4);
        //validates if the correct number of players are playing
        for (int i = 1; i < numOfPlayers; i++) {

            do {
                System.out.println("What is player " + i + "'s name?:");
                name = scanner.nextLine();
                if () {
                    System.out.println("This is not a valid name, please try again.");
                }
            } while (); //add code to validate a sting input

            do {
                System.out.println("What would you like your playing piece to be, you can choose one ASCII character:");
                playingPiece = scanner.nextLine();
                stringLength = playingPiece.length();
                if (stringLength != 1) {
                    System.out.println("Sorry, your playing piece can only be one character, please try again.");
                }
            } while (stringLength == 1);

            System.out.println("Welcome to Bean monopoly " + name + " ,happy playing!");
            Player player = new Player(i, name, playingPiece);
            i++;

            return players;
        }
    }
}

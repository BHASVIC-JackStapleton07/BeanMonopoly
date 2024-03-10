package src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
    //when passing parameters to remove player, remember to define a separate array in main or whatever medium to the players array list
    public ArrayList<Player> removePlayer(ArrayList<Player> players , Player player) {
        System.out.println("Sorry " + player.PlayerName + " , but you are out of money, this means you have been eliminated from the game, better luck next time!");
        players.remove(player);
        return players;
        //REMOVE PLAYERS IS NOT FINISHED, STILL ISSUES WITH ARRAY
        //FIGURE OUT HOW AND WHAT ARRAY TO PASS AS A PARAMETER, SHOULD USE SIMILAR METHOD AS CREATE PLAYERS SHOWN IN MAIN (ask ben if stuck)
        //IMPORT THE PLAYER WHOSE TURN IT IS WHEN THE CODE GETS FIXED
    }
    public ArrayList<Player> createPlayers(ArrayList<Player> players) {
        int numOfPlayers;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("How many players will be playing this game of Bean monopoly, please note that the minimum number of players is 2, and the maximum number of players is 4:");
            numOfPlayers = Integer.valueOf(scanner.nextLine());
        } while (numOfPlayers < 2 || numOfPlayers > 4);
        //adds each player to arraylist
        for (int i = 1; i <= numOfPlayers; i++) {
            System.out.println("What is player " + i + "'s name?:");
            String name = scanner.nextLine();
            System.out.println("Welcome to Bean monopoly " + name + " ,happy playing!");
            players.add(new Player(i, name));
            i++;
        }
        return players;
    }
}

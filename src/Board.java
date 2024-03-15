package src;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {

    static MainForm mainForm = new MainForm();
    private static JTextPane boardDisplay;
    Bean bean = new Bean();
    Scanner scanner = new Scanner(System.in);

    PlayerManager playerManager = new PlayerManager();


    //fat array for board
    static String[][] boardPosArray = new String[26][4]; //pos0 is start pos13 is miss a go
    void fillArray(String[][] array) {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = " ";
            }
        }
    }

    public Board() {
        boardDisplay = new JTextPane();
        fillArray(boardPosArray);
        boardPosArray[0][0] = "1"; boardPosArray[0][1] = "2";
        if (playerManager.numOfPlayers > 2) {
        boardPosArray[0][2] = "3"; }
        if (playerManager.numOfPlayers > 3) { boardPosArray[0][3] = "4"; }
        printBoard();
    }

    public JTextPane getTextPane() {
        return boardDisplay;
    }

    public static void printBoard() {
        boardDisplay.setEditable(false);
        String boardText =
                "\n" +
                        " START\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "| "+ boardPosArray[0][0] +" "+ boardPosArray[0][1] +" | "+ boardPosArray[1][0] +" "+ boardPosArray[1][1] +" | "+ boardPosArray[2][0] +" "+ boardPosArray[2][1] +" | "+ boardPosArray[3][0] +" "+ boardPosArray[3][1] +" | "+ boardPosArray[4][0] +" "+ boardPosArray[4][1] +" | "+ boardPosArray[5][0] +" "+ boardPosArray[5][1] +" | "+ boardPosArray[6][0] +" "+ boardPosArray[6][1] +" | "+ boardPosArray[7][0] +" "+ boardPosArray[7][1] +" |\n" +
                        "| "+ boardPosArray[0][2] +" "+ boardPosArray[0][3] +" | "+ boardPosArray[1][2] +" "+ boardPosArray[1][3] +" | "+ boardPosArray[2][2] +" "+ boardPosArray[2][3] +" | "+ boardPosArray[3][2] +" "+ boardPosArray[3][3] +" | "+ boardPosArray[4][2] +" "+ boardPosArray[4][3] +" | "+ boardPosArray[5][2] +" "+ boardPosArray[5][3] +" | "+ boardPosArray[6][2] +" "+ boardPosArray[6][3] +" | "+ boardPosArray[7][2] +" "+ boardPosArray[7][3] +" |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "| "+ boardPosArray[25][0] +" "+ boardPosArray[25][1] +" |                                   | "+ boardPosArray[8][0] +" "+ boardPosArray[8][1] +" |\n" +
                        "| "+ boardPosArray[25][2] +" "+ boardPosArray[25][3] +" |                                   | "+ boardPosArray[8][2] +" "+ boardPosArray[8][3] +" |\n" +
                        " -----                                     ----- \n" +
                        "| "+ boardPosArray[24][0] +" "+ boardPosArray[24][1] +" |                                   | "+ boardPosArray[9][0] +" "+ boardPosArray[9][1] +" |\n" +
                        "| "+ boardPosArray[24][2] +" "+ boardPosArray[24][3] +" |                                   | "+ boardPosArray[9][2] +" "+ boardPosArray[9][3] +" |\n" +
                        " -----                                     ----- \n" +
                        "| "+ boardPosArray[23][0] +" "+ boardPosArray[23][1] +" |                                   | "+ boardPosArray[10][0] +" "+ boardPosArray[10][1] +" |\n" +
                        "| "+ boardPosArray[23][2] +" "+ boardPosArray[23][3] +" |                                   | "+ boardPosArray[10][2] +" "+ boardPosArray[10][3] +" |\n" +
                        " -----                                     ----- \n" +
                        "| "+ boardPosArray[22][0] +" "+ boardPosArray[22][1] +" |                                   | "+ boardPosArray[11][0] +" "+ boardPosArray[11][1] +" |\n" +
                        "| "+ boardPosArray[22][2] +" "+ boardPosArray[22][3] +" |                                   | "+ boardPosArray[11][2] +" "+ boardPosArray[11][3] +" |\n" +
                        " -----                                     ----- \n" +
                        "| "+ boardPosArray[21][0] +" "+ boardPosArray[21][1] +" |                                   | "+ boardPosArray[12][0] +" "+ boardPosArray[12][1] +" |\n" +
                        "| "+ boardPosArray[21][2] +" "+ boardPosArray[21][3] +" |                                   | "+ boardPosArray[12][2] +" "+ boardPosArray[12][3] +" |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "| "+ boardPosArray[20][0] +" "+ boardPosArray[20][1] +" | "+ boardPosArray[19][0] +" "+ boardPosArray[19][1] +" | "+ boardPosArray[18][0] +" "+ boardPosArray[18][1] +" | "+ boardPosArray[17][0] +" "+ boardPosArray[17][1] +" | "+ boardPosArray[16][0] +" "+ boardPosArray[16][1] +" | "+ boardPosArray[15][0] +" "+ boardPosArray[15][1] +" | "+ boardPosArray[14][0] +" "+ boardPosArray[14][1] +" | "+ boardPosArray[13][0] +" "+ boardPosArray[13][1] +" |\n" +
                        "| "+ boardPosArray[20][2] +" "+ boardPosArray[20][3] +" | "+ boardPosArray[19][2] +" "+ boardPosArray[19][3] +" | "+ boardPosArray[18][2] +" "+ boardPosArray[18][3] +" | "+ boardPosArray[17][2] +" "+ boardPosArray[17][3] +" | "+ boardPosArray[16][2] +" "+ boardPosArray[16][3] +" | "+ boardPosArray[15][2] +" "+ boardPosArray[15][3] +" | "+ boardPosArray[14][2] +" "+ boardPosArray[14][3] +" | "+ boardPosArray[13][2] +" "+ boardPosArray[13][3] +" |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "                                           MISS A\n" +
                        "                                             GO";
        boardDisplay.setText("");
        boardDisplay.setText(boardText);
    }

    public void movePlayerOnBoard() {}

    DiceRoller dice = new DiceRoller();




    public void turn(ArrayList<Player> players, ArrayList<Bean> beans) {
        int counter = 0;
        int move; //used to calculate how much player needs to move on the board (can get passed into another method)
        boolean isDouble = false;
        DiceRoller diceRoller = new DiceRoller();
        boolean landedOnCard = false;
        boolean landedOnMissATurn = false;
        boolean missATurn = false;
        boolean landOnGo = false;
        boolean passGo = false;
        boolean landOnBean = false;
        PlayerManager playerManager = new PlayerManager();

        chec

        do { //does the loop and repeats if player lands a double
                if (!missATurn) { //if loop that checks if player misses turn
                isDouble = false;
                printBoard();
                mainForm.clearConsoleText();
                mainForm.outputConsoleText("It is now the turn of " + (players.get(counter)) + ".");
                mainForm.outputConsoleText("Dice 1: " + diceRoller.dice1);
                mainForm.outputConsoleText("Dice 2: " + diceRoller.dice2);
                mainForm.outputConsoleText("Total Score: " + diceRoller.getTotalScore());
                mainForm.outputConsoleText("Is double: " + diceRoller.isDouble());
                move = diceRoller.getTotalScore();
                isDouble = diceRoller.isDouble;
                // code to make player move along this board
                boardPosArray[players.get(counter).PlayerLocation][counter] = " "; //set previous location to blank
                players.get(counter).PlayerLocation += move; //move player
                int playerArrayPrintID = counter++; //just for printing
                boardPosArray[players.get(counter).PlayerLocation][counter] = players.get(counter).playingPiece;

                if (landOnBean) {
                    int currentBean = players.get(counter).PlayerLocation - 1;

                    if (currentBean >= 13) { currentBean--; }

                    if (beans.get(currentBean).getOwnerID() == counter) {

                        if (beans.get(currentBean).isBeanOwned() == false && (button)) {
                            beans.get(currentBean).buyBean(counter); //buy bean
                            int cost = beans.get(currentBean).getCost();
                            players.get(counter).changeMoney(-cost); //remove money
                        } else if () { //if you own the bean
                            beans.get(currentBean).upgrade(); //upgrade bean
                            int cost = beans.get(currentBean).getCost();
                            players.get(counter).changeMoney(-cost);
                        }

                    } else {
                        //tax
                        int level = beans.get(currentBean).getLevel();
                        int tax = beans.get(currentBean).getTax();
                        int ownerID = beans.get(currentBean).getOwnerID();
                        players.get(counter).changeMoney(-(tax * (level + 1)));//remove money from taxed player
                        players.get(ownerID).changeMoney((tax) * (level + 1)); //give money to owner of bean
                        checkBalance(counter, players); //check if in debt
                    }
                }
                if (landedOnCard) {
                    int cardMoneyChange;
                    Cards cards = new Cards();
                    String card = cards.drawCard();
                    cardMoneyChange = scanner.nextInt();
                    players.get(counter).changeMoney(cardMoneyChange);
                    mainForm.outputConsoleText(card);

                    //make sure all cards actually do something
                }
                if (landOnGo) {
                    players.get(counter).changeMoney(1000);
                    mainForm.outputConsoleText("You landed on go! Your balance has increased by 1000.");

                }
                if (passGo) {
                    players.get(counter).changeMoney(500);
                    mainForm.outputConsoleText("You passed go! Your balance has increased by 500.");
                }
                if (landedOnMissATurn) {
                    missATurn = true;
                    mainForm.outputConsoleText("You landed on miss a turn! Sorry, but your next turn will be skipped!");
                    if (isDouble) {
                        mainForm.outputConsoleText("Even though you rolled a double, since you landed on miss a turn, you wont be able to roll again, bad luck!"); //giving user explanation, so it doesn't come off as a bug
                        isDouble = false; //makes sure player cant roll again if they land on miss a turn
                    }
                }
                if (players.get(counter).MoneyBalance == 0) {
                    playerManager.removePlayer(players.get(counter));
                }

            }
                else {
                    mainForm.outputConsoleText("You landed on miss a turn, so your turn has been skipped!");
                    missATurn = false;
                }
        } while (isDouble);

        if (counter == 3) {
                counter = 0;
        }
        else {
                counter++;
        }

    }

    public void checkBalance(int playerID, ArrayList<Player> players) {
        if (players.get(playerID).MoneyBalance <= 0 ) {
            playerManager.removePlayer(playerID);
        }
    }

}

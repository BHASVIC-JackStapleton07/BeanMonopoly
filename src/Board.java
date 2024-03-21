package src;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Board {

    static MainForm mainForm = new MainForm();
    Bean bean = new Bean();
    Scanner scanner = new Scanner(System.in);
    public String boardText = generateBoard();

    PlayerManager playerManager = new PlayerManager();


    //fat array for board
    static String[][] boardPosArray = new String[26][4]; //pos0 is start pos13 is miss a go

    void fillArray(String[][] array) {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = " ";
            }
        }
    }

    public Board() {

        fillArray(boardPosArray);
        boardPosArray[0][0] = "1";
        boardPosArray[0][1] = "2";
        if (playerManager.numOfPlayers > 2) {
            boardPosArray[0][2] = "3";
        }
        if (playerManager.numOfPlayers > 3) {
            boardPosArray[0][3] = "4";
        }
        mainForm.printBoard(boardText);
    }


    public static String generateBoard() {
        String boardText =
                "\n" +
                        " START\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "| " + boardPosArray[0][0] + " " + boardPosArray[0][1] + " | " + boardPosArray[1][0] + " " + boardPosArray[1][1] + " | " + boardPosArray[2][0] + " " + boardPosArray[2][1] + " | " + boardPosArray[3][0] + " " + boardPosArray[3][1] + " | " + boardPosArray[4][0] + " " + boardPosArray[4][1] + " | " + boardPosArray[5][0] + " " + boardPosArray[5][1] + " | " + boardPosArray[6][0] + " " + boardPosArray[6][1] + " | " + boardPosArray[7][0] + " " + boardPosArray[7][1] + " |\n" +
                        "| " + boardPosArray[0][2] + " " + boardPosArray[0][3] + " | " + boardPosArray[1][2] + " " + boardPosArray[1][3] + " | " + boardPosArray[2][2] + " " + boardPosArray[2][3] + " | " + boardPosArray[3][2] + " " + boardPosArray[3][3] + " | " + boardPosArray[4][2] + " " + boardPosArray[4][3] + " | " + boardPosArray[5][2] + " " + boardPosArray[5][3] + " | " + boardPosArray[6][2] + " " + boardPosArray[6][3] + " | " + boardPosArray[7][2] + " " + boardPosArray[7][3] + " |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "| " + boardPosArray[25][0] + " " + boardPosArray[25][1] + " |                                   | " + boardPosArray[8][0] + " " + boardPosArray[8][1] + " |\n" +
                        "| " + boardPosArray[25][2] + " " + boardPosArray[25][3] + " |                                   | " + boardPosArray[8][2] + " " + boardPosArray[8][3] + " |\n" +
                        " -----                                     ----- \n" +
                        "| " + boardPosArray[24][0] + " " + boardPosArray[24][1] + " |                                   | " + boardPosArray[9][0] + " " + boardPosArray[9][1] + " |\n" +
                        "| " + boardPosArray[24][2] + " " + boardPosArray[24][3] + " |                                   | " + boardPosArray[9][2] + " " + boardPosArray[9][3] + " |\n" +
                        " -----                                     ----- \n" +
                        "| " + boardPosArray[23][0] + " " + boardPosArray[23][1] + " |                                   | " + boardPosArray[10][0] + " " + boardPosArray[10][1] + " |\n" +
                        "| " + boardPosArray[23][2] + " " + boardPosArray[23][3] + " |                                   | " + boardPosArray[10][2] + " " + boardPosArray[10][3] + " |\n" +
                        " -----                                     ----- \n" +
                        "| " + boardPosArray[22][0] + " " + boardPosArray[22][1] + " |                                   | " + boardPosArray[11][0] + " " + boardPosArray[11][1] + " |\n" +
                        "| " + boardPosArray[22][2] + " " + boardPosArray[22][3] + " |                                   | " + boardPosArray[11][2] + " " + boardPosArray[11][3] + " |\n" +
                        " -----                                     ----- \n" +
                        "| " + boardPosArray[21][0] + " " + boardPosArray[21][1] + " |                                   | " + boardPosArray[12][0] + " " + boardPosArray[12][1] + " |\n" +
                        "| " + boardPosArray[21][2] + " " + boardPosArray[21][3] + " |                                   | " + boardPosArray[12][2] + " " + boardPosArray[12][3] + " |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "| " + boardPosArray[20][0] + " " + boardPosArray[20][1] + " | " + boardPosArray[19][0] + " " + boardPosArray[19][1] + " | " + boardPosArray[18][0] + " " + boardPosArray[18][1] + " | " + boardPosArray[17][0] + " " + boardPosArray[17][1] + " | " + boardPosArray[16][0] + " " + boardPosArray[16][1] + " | " + boardPosArray[15][0] + " " + boardPosArray[15][1] + " | " + boardPosArray[14][0] + " " + boardPosArray[14][1] + " | " + boardPosArray[13][0] + " " + boardPosArray[13][1] + " |\n" +
                        "| " + boardPosArray[20][2] + " " + boardPosArray[20][3] + " | " + boardPosArray[19][2] + " " + boardPosArray[19][3] + " | " + boardPosArray[18][2] + " " + boardPosArray[18][3] + " | " + boardPosArray[17][2] + " " + boardPosArray[17][3] + " | " + boardPosArray[16][2] + " " + boardPosArray[16][3] + " | " + boardPosArray[15][2] + " " + boardPosArray[15][3] + " | " + boardPosArray[14][2] + " " + boardPosArray[14][3] + " | " + boardPosArray[13][2] + " " + boardPosArray[13][3] + " |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "                                           MISS A\n" +
                        "                                             GO";
        return boardText;
    }

    public void movePlayerOnBoard(int playerID, int moveAmount, ArrayList<Player> players) {
        boardPosArray[players.get(playerID).PlayerLocation][playerID] = " "; //set previous location to blank
        players.get(playerID).PlayerLocation += moveAmount; //move player
        if (players.get(playerID).PlayerLocation >= 26) { //if passed go
            players.get(playerID).PlayerLocation -= 26; //set location back to 0
        }
        boardPosArray[players.get(playerID).PlayerLocation][playerID] = players.get(playerID).playingPiece;
    }

    DiceRoller dice = new DiceRoller();


    public void turn(ArrayList<Player> players, ArrayList<Bean> beans, int playerTurn) {
        int counter = playerTurn;

        Player currentPlayer = players.get(counter);

        int move; //used to calculate how much player needs to move on the board (can get passed into another method)
        DiceRoller diceRoller = new DiceRoller();
        boolean isDouble = currentPlayer.isDouble; //
        boolean landedOnCard = currentPlayer.landedOnCard;
        boolean landedOnMissATurn = currentPlayer.landedOnMissATurn; //
        boolean missATurn = currentPlayer.missATurn; //
        boolean landOnGo = currentPlayer.landOnGo; //
        boolean passGo = currentPlayer.passGo; //
        boolean landOnBean = currentPlayer.landOnBean; //
        PlayerManager playerManager = new PlayerManager();

        mainForm.BUYUPGRADEButton.setEnabled(false); //disable buy button
        mainForm.CONTINUEButton.setEnabled(false); //disable continue button


        do { //does the loop and repeats if player lands a double
            if (!currentPlayer.missATurn) { //if loop that checks if player misses turn
                currentPlayer.isDouble = false;
                mainForm.printBoard(generateBoard());
                mainForm.clearConsoleText();
                mainForm.outputConsoleText("It is now the turn of " + (players.get(counter)) + ".");
                mainForm.updateMoneyBalanceDisplay(counter, players);
                mainForm.outputConsoleText("Dice 1: " + diceRoller.dice1);
                mainForm.outputConsoleText("Dice 2: " + diceRoller.dice2);
                mainForm.outputConsoleText("Total Score: " + diceRoller.getTotalScore());
                mainForm.outputConsoleText("Is double: " + diceRoller.isDouble());
                move = diceRoller.getTotalScore();
                currentPlayer.isDouble = diceRoller.isDouble;

                //if passed go or not
                if (currentPlayer.PlayerLocation == 26) {
                    currentPlayer.landOnGo = true; //landed on go
                } else if (currentPlayer.PlayerLocation > 26) {
                    currentPlayer.passGo = true; //passed go
                }

                // code to make player move along this board
                movePlayerOnBoard(counter, move, players);

                // landing boolean stuff (bean, miss-a-go)
                if (currentPlayer.PlayerLocation != 0 && currentPlayer.PlayerLocation != 13) {
                    currentPlayer.landOnBean = true; //unless landed on start or miss you land on a bean
                } else if (currentPlayer.PlayerLocation == 13) {
                    currentPlayer.landedOnMissATurn = true; //miss next go
                }


                if (currentPlayer.landOnBean) {
                    int currentBean = currentPlayer.PlayerLocation - 1;

                    if (currentBean >= 13) {
                        currentBean--;
                    }

                    String currentBeanName = beans.get(currentBean).getName();
                    int currentBeanCost = beans.get(currentBean).getCost();
                    int currentBeanTax = beans.get(currentBean).getTax();
                    int currentBeanLevel = beans.get(currentBean).getLevel();
                    String isOwnedText = beans.get(currentBean).isBeanOwned() ? "Yes" : "False";

                    //print bean information
                    mainForm.outputConsoleText("You landed on: " + currentBeanName + "\n" +
                            "Level: " + currentBeanLevel + "\n" +
                            "Cost to buy: " + currentBeanCost + "\n" +
                            "Tax Level 0/1/2/3: " + currentBeanTax + "/" + (currentBeanTax * 2) + "/" + (currentBeanTax * 3) + "/" + (currentBeanTax * 4) + "\n" +
                            "Owned: " + isOwnedText);

                    if (beans.get(currentBean).getOwnerID() == counter) { // if you own the bean
                        mainForm.BUYUPGRADEButton.setEnabled(true); //enable upgrade button
                        mainForm.CONTINUEButton.setEnabled(true); //enable button

                        if (mainForm.buyUpgradeButtonPressed && beans.get(currentBean).getLevel() < 3) { //if upgrade button pressed and if not max level
                            beans.get(currentBean).upgrade(); //upgrade bean
                            int cost = beans.get(currentBean).getCost();
                            players.get(counter).changeMoney(-cost, players);
                       } else if (mainForm.continueButtonPressed) {
                            continue;
                        }
                    } else if (!beans.get(currentBean).isBeanOwned()) { //if bean is unowned
                        mainForm.BUYUPGRADEButton.setEnabled(true); //enable buy button
                        mainForm.CONTINUEButton.setEnabled(true); //enable continue button

                        if (mainForm.buyUpgradeButtonPressed) {
                            beans.get(currentBean).buyBean(counter); //buy bean
                            int cost = beans.get(currentBean).getCost();
                            players.get(counter).changeMoney(-cost, players); //spend money

                            mainForm.BUYUPGRADEButton.setEnabled(false); //disable buy button
                            mainForm.CONTINUEButton.setEnabled(false); //disable continue button
                        } else if (mainForm.continueButtonPressed) {
                            mainForm.BUYUPGRADEButton.setEnabled(false); //disable buy button
                            mainForm.CONTINUEButton.setEnabled(false); //disable continue button
                            continue;
                        }
                    } else { //bean belongs to someone else
                        //tax
                        int level = beans.get(currentBean).getLevel();
                        int tax = beans.get(currentBean).getTax();
                        int ownerID = beans.get(currentBean).getOwnerID();
                        currentPlayer.changeMoney(-(tax * (level + 1)), players);//remove money from taxed player
                        players.get(ownerID).changeMoney((tax) * (level + 1), players); //give money to owner of bean
                        checkBalance(counter, players); //check if in debt
                    }
                }


                if (currentPlayer.landedOnCard) {
                    Random random = new Random();
                    Cards cards = new Cards("", 0);
                    int randomNum = random.nextInt(13);
                    String cardText = cards.returnCardText(randomNum);
                    int cardMoneyChange = cards.returnCardMoneyChange(randomNum);
                    currentPlayer.changeMoney(cardMoneyChange, players);
                    checkBalance(counter, players);
                    mainForm.outputConsoleText(cardText);

                    //make sure all cards actually do something
                }

                if (currentPlayer.landOnGo) {
                    currentPlayer.changeMoney(1000, players);
                    mainForm.outputConsoleText("You landed on go! Your balance has increased by 1000.");

                }

                if (currentPlayer.passGo) {
                    currentPlayer.changeMoney(500, players);
                    mainForm.outputConsoleText("You passed go! Your balance has increased by 500.");
                }

                if (currentPlayer.landedOnMissATurn) {
                    currentPlayer.missATurn = true;
                    mainForm.outputConsoleText("You landed on miss a turn! Sorry, but your next turn will be skipped!");
                    if (currentPlayer.isDouble) {
                        mainForm.outputConsoleText("Even though you rolled a double, since you landed on miss a turn, you wont be able to roll again, bad luck!"); //giving user explanation, so it doesn't come off as a bug
                        currentPlayer.isDouble = false; //makes sure player cant roll again if they land on miss a turn
                    }
                }
            } else {
                mainForm.outputConsoleText("You landed on miss a turn, so your turn has been skipped!");
                currentPlayer.missATurn = false;
            }

            if (counter == 3) {
                counter = 0;
            } else {
                counter++;
            }

        } while (currentPlayer.isDouble);
    }

    public void checkBalance(int playerID, ArrayList<Player> players) {
        if (players.get(playerID).MoneyBalance <= 0) {
            playerManager.removePlayer(playerID, players.get(playerID).beansOwned, mainForm);
        }
    }
}
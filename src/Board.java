package src;

import javax.swing.*;

public class Board {

    MainForm mainForm = new MainForm();
    private JTextPane boardDisplay;

    //fat array for board
    String[][] boardPosArray = new String[26][4]; //pos0 is start pos13 is miss a go
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
        boardPosArray[0][0] = "1"; boardPosArray[0][1] = "2"; boardPosArray[0][2] = "3"; boardPosArray[0][3] = "4";
        printBoard(boardDisplay, boardPosArray);
    }

    public JTextPane getTextPane() {
        return boardDisplay;
    }

    private void printBoard(JTextPane boardDisplay, String[][] array) {
        boardDisplay.setEditable(false);
        String boardText =
                "\n" +
<<<<<<< Updated upstream
                        " START\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "| "+ array[0][0] +" "+ array[0][1] +" | "+ array[1][0] +" "+ array[1][1] +" | "+ array[2][0] +" "+ array[2][1] +" | "+ array[3][0] +" "+ array[3][1] +" | "+ array[4][0] +" "+ array[4][1] +" | "+ array[5][0] +" "+ array[5][1] +" | "+ array[6][0] +" "+ array[6][1] +" | "+ array[7][0] +" "+ array[7][1] +" |\n" +
                        "| "+ array[0][2] +" "+ array[0][3] +" | "+ array[1][2] +" "+ array[1][3] +" | "+ array[2][2] +" "+ array[2][3] +" | "+ array[3][2] +" "+ array[3][3] +" | "+ array[4][2] +" "+ array[4][3] +" | "+ array[5][2] +" "+ array[5][3] +" | "+ array[6][2] +" "+ array[6][3] +" | "+ array[7][2] +" "+ array[7][3] +" |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "| "+ array[25][0] +" "+ array[25][1] +" |                                   | "+ array[8][0] +" "+ array[8][1] +" |\n" +
                        "| "+ array[25][2] +" "+ array[25][3] +" |                                   | 3 4 |\n" +
                        " -----                                     ----- \n" +
                        "| "+ array[24][0] +" "+ array[24][1] +" |                                   | "+ array[9][0] +" "+ array[9][1] +" |\n" +
                        "| "+ array[24][2] +" "+ array[24][3] +" |                                   | 3 4 |\n" +
                        " -----                                     ----- \n" +
                        "| "+ array[23][0] +" "+ array[23][1] +" |                                   | "+ array[10][0] +" "+ array[10][1] +" |\n" +
                        "| "+ array[23][2] +" "+ array[23][3] +" |                                   | 3 4 |\n" +
                        " -----                                     ----- \n" +
                        "| "+ array[22][0] +" "+ array[22][1] +" |                                   | "+ array[11][0] +" "+ array[11][1] +" |\n" +
                        "| "+ array[22][2] +" "+ array[22][3] +" |                                   | 3 4 |\n" +
                        " -----                                     ----- \n" +
                        "| "+ array[21][0] +" "+ array[21][1] +" |                                   | "+ array[12][0] +" "+ array[12][1] +" |\n" +
                        "| "+ array[21][2] +" "+ array[21][3] +" |                                   | 3 4 |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "| "+ array[20][0] +" "+ array[20][1] +" | "+ array[19][0] +" "+ array[19][1] +" | "+ array[18][0] +" "+ array[18][1] +" | "+ array[17][0] +" "+ array[17][1] +" | "+ array[16][0] +" "+ array[16][1] +" | "+ array[15][0] +" "+ array[15][1] +" | "+ array[14][0] +" "+ array[14][1] +" | "+ array[13][0] +" "+ array[13][1] +" |\n" +
                        "| 3 4 | 3 4 | 3 4 | 3 4 | 3 4 | 3 4 | 3 4 | 3 4 |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "                                           MISS A\n" +
                        "                                             GO";
        boardDisplay.setText("");
        boardDisplay.setText(boardText);

=======
                        " START" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "|     |     |     |     |     |     |     |     |\n" +
                        "|     |     |     |     |     |     |     |     |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "|     |                                   |     |\n" +
                        "|     |                                   |     |\n" +
                        " -----                                     ----- \n" +
                        "|     |                                   |     |\n" +
                        "|     |                                   |     |\n" +
                        " -----                                     ----- \n" +
                        "|     |                                   |     |\n" +
                        "|     |                                   |     |\n" +
                        " -----                                     ----- \n" +
                        "|     |                                   |     |\n" +
                        "|     |                                   |     |\n" +
                        " -----                                     ----- \n" +
                        "|     |                                   |     |\n" +
                        "|     |                                   |     |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "|     |     |     |     |     |     |     |     |\n" +
                        "|     |     |     |     |     |     |     |     |\n" +
                        " ----- ----- ----- ----- ----- ----- ----- ----- \n" +
                        "                                           MISS A" +
                        "                                              GO";
>>>>>>> Stashed changes
    }

}

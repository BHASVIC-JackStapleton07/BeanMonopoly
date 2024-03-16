package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainForm {
    private JPanel mainPanel;
    public JButton BUYUPGRADEButton;
    public JButton CONTINUEButton;
    private JTextArea consoleText;
    private JTextField answerField;
    public JTextPane boardDisplay;
    public JLabel moneyLabel;

    DiceRoller dice = new DiceRoller();

    public MainForm() {
        boardDisplay.setEditable(false);
        BUYUPGRADEButton.addActionListener(new ActionListener() { //UPGRADE / BUY
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        CONTINUEButton.addActionListener(new ActionListener() { //CONTINUE
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void outputConsoleText(String string) {
        consoleText.append("\n" + string);
    }

    public void clearConsoleText() {
        consoleText.setText("");
    }

    public void updateMoneyBalanceDisplay(int playerID, ArrayList<Player> players) {
        moneyLabel.setText("Money: " + players.get(playerID).MoneyBalance);
    }

}

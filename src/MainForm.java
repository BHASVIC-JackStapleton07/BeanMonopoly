package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    public JButton BUYUPGRADEButton;
    public JButton CONTINUEButton;
    public JTextArea consoleText;
    private JTextField answerField;
    public JTextPane boardDisplay;
    public JLabel moneyLabel;

    public boolean buyUpgradeButtonPressed;
    public boolean continueButtonPressed;

    DiceRoller dice = new DiceRoller();

    public MainForm() {
        consoleText.setEditable(false);
        setContentPane(mainPanel);
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        outputConsoleText("Welcome to Beanopoly!");
        boardDisplay.setEditable(false);
        buyUpgradeButtonPressed = false; continueButtonPressed = false;
        BUYUPGRADEButton.addActionListener(new ActionListener() { //UPGRADE / BUY
            @Override
            public void actionPerformed(ActionEvent e) {
                buyUpgradeButtonPressed = true;
                CONTINUEButton.setEnabled(false);
            }
        });
        CONTINUEButton.addActionListener(new ActionListener() { //CONTINUE
            @Override
            public void actionPerformed(ActionEvent e) {
                continueButtonPressed = true;
                BUYUPGRADEButton.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        MainForm myForm = new MainForm();
        //SwingUtilities.invokeLater(MainForm::new);
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

    public void printBoard(String boardText) {
        boardDisplay.setText(boardText);
        boardDisplay.setEditable(false);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel mainPanel;
    private JButton ROLLButton;
    private JButton BUYUPGRADEButton;
    private JButton CONTINUEButton;
    private JTextArea consoleText;
    private JTextField answerField;
    public JTextPane boardDisplay;

    DiceRoller dice = new DiceRoller();

    public MainForm() {
        boardDisplay.setEditable(false);
        ROLLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dice.rollDice();
            }
        });
        BUYUPGRADEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        CONTINUEButton.addActionListener(new ActionListener() {
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

}

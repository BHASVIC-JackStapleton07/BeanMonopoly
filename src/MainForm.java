package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    public JButton BUYUPGRADEButton;
    public JButton CONTINUEButton;
    private JTextField answerField;
    public JTextPane boardDisplay;
    public JLabel moneyLabel;
    public JTextArea consoleText;
    public JScrollPane scrollPane;

    public boolean buyUpgradeButtonPressed;
    public boolean continueButtonPressed;


    public MainForm() {
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        consoleText.setEditable(false);
        setContentPane(mainPanel);
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        outputConsoleText("Welcome to Beanopoly!");
        boardDisplay.setEditable(false);
        buyUpgradeButtonPressed = false;
        continueButtonPressed = false;
        // Action listener for BUYUPGRADEButton
        BUYUPGRADEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buyUpgradeButtonPressed = true;
            }
        });

// Action listener for CONTINUEButton
        CONTINUEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                continueButtonPressed = true;
            }
        });
    }


    public static void main(String[] args) {
        MainForm myForm = new MainForm();
        SwingUtilities.invokeLater(MainForm::new);
    }

    public void outputConsoleText(String string) {
        consoleText.append("\n" + string);
        //scroll down
        consoleText.setCaretPosition(consoleText.getDocument().getLength());
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



    public String getAnswerFieldText() {
        answerField.setEditable(true);

        // Create a mutable container for input text and input received flag
        class InputContainer {
            String text = "";
            boolean received = false;
        }

        InputContainer inputContainer = new InputContainer();

        // Enter key listener
        answerField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = answerField.getText().trim();
                if (!text.isEmpty()) {
                    inputContainer.text = text; // Store text entered
                    inputContainer.received = true; // Set input flag to true
                }
                answerField.setText(""); // Clear text
                answerField.setEditable(false);
            }
        });

        // Wait until input is received
        while (!inputContainer.received) {
            try {
                Thread.sleep(100); // Wait for a short interval before checking again
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        return inputContainer.text;
    }


}


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
    private JTextPane boardDisplay;

    public MainForm() {
        boardDisplay.setEditable(false);
        ROLLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

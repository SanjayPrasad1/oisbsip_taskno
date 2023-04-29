import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guessing {
    private JTextField myNumber;
    private JButton checkButton;
    private JTextField computerNo;
    private JPanel myPanel;
    private JTextField message;

    public Guessing() {
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int myNo = Integer.parseInt(myNumber.getText());
                int number2 = (int) (Math.random()*100);
                if (myNo == number2) {
                    message.setText("Congratulations!!! You Guessed It Right.");
                } else {
                    message.setText("Better Luck Next Time!");
                }
                computerNo.setText(Integer.toString(number2));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Guessing Game");
        frame.setContentPane(new Guessing().myPanel);
        frame.setSize(450,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

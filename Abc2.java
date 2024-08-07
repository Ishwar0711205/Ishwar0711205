import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Abc2 extends JFrame implements ActionListener {
    private JTextField t1;
    private JTextField t2;

    public Abc2() {
        setTitle("Factorial Calculation App");
        setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Enter Number");
        t1 = new JTextField(20);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        JLabel l2 = new JLabel("Result");
        t2 = new JTextField(20);
        t2.setEditable(false); // Prevent user input in the result field

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(calculateButton);

        getContentPane().setBackground(Color.BLUE);
        setSize(250, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent AE) {
        if (AE.getActionCommand().equals("Calculate")) {
            try {
                int num = Integer.parseInt(t1.getText());

                int res = 1;
                for (int i = num; i > 0; i--) {
                    res *= i;
                }
                t2.setText(String.valueOf(res));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Abc2());
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Abc extends JFrame implements ActionListener {
    private JTextField t1;
    private JTextField t2;
    private JLabel l3;

    public Abc() {
        setTitle("Addition App");
        setLayout(new FlowLayout());

        JLabel l1 = new JLabel("First Number");
        t1 = new JTextField(20);
        JLabel l2 = new JLabel("Second Number");
        t2 = new JTextField(20);
        JButton addButton = new JButton("Add");
        JButton resetButton = new JButton("Reset");
        l3 = new JLabel("Result");

        addButton.addActionListener(this);
        resetButton.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(addButton);
        add(resetButton);
        add(l3);

        getContentPane().setBackground(Color.BLUE);
        setSize(250, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent AE) {
        if (AE.getActionCommand().equals("Add")) {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int value = num1 + num2;
                l3.setText(String.valueOf(value));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
            }
        } else if (AE.getActionCommand().equals("Reset")) {
            t1.setText("");
            t2.setText("");
            l3.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Abc());
    }
}

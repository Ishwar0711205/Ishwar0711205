import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_Color extends JFrame implements ActionListener {
    private static final java.awt.Color ICC_ProfileGray = null;
    JLabel l1;
    JTextField t1;
    JLabel l2;
    JTextField t2;
    JLabel l3;
    JTextField t3;
    JButton b, b1, b2, b3, b4, b5;

    Calculator_Color() {
        l1 = new JLabel("First number ");
        t1 = new JTextField(10);
        l2 = new JLabel("second number ");
        t2 = new JTextField(10);
        l3 = new JLabel("result number ");
        t3 = new JTextField(10);

        b = new JButton("+");
       
        b.setForeground(Color.WHITE); // White text color

        b1 = new JButton("-");
       
        b1.setForeground(Color.WHITE); // White text color

        b2 = new JButton("*");
      
        b2.setForeground(Color.WHITE); // White text color

        b3 = new JButton("/");
     
        b3.setForeground(Color.WHITE); // White text color

        b4 = new JButton("%");
       
        b4.setForeground(Color.WHITE); // White text color

        b5 = new JButton("CLEAR");
     
        b5.setForeground(Color.WHITE); // White text color

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        getContentPane().setBackground(ICC_ProfileGray ); // Light gray background color

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int result = 0;

            if (ae.getActionCommand().equals("+")) {
                result = num1 + num2;
                t3.setText("" + result);
            }

            if (ae.getActionCommand().equals("-")) {
                result = num1 - num2;
                t3.setText("" + result);
            }

            if (ae.getActionCommand().equals("*")) {
                result = num1 * num2;
                t3.setText("" + result);
            }

            if (ae.getActionCommand().equals("/")) {
                if (num2 != 0) {
                    result = num1 / num2;
                    t3.setText("" + result);
                } else {
                    t3.setText("Error: Division by zero");
                }
            }

            if (ae.getActionCommand().equals("%")) {
                result = num1 % num2;
                t3.setText("" + result);
            }

            if (ae.getActionCommand().equals("CLEAR")) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        } catch (NumberFormatException e) {
            t3.setText("Error: Invalid input");
        }
    }

    public static void main(String args[]) {
        new Calculator_Color();
    }
}
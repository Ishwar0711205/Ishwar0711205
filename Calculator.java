import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




class Calculator extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b6;




public Calculator()
{
setLayout(new FlowLayout());
l1 = new JLabel("First Number");
t1 = new JTextField(10);
l2 = new JLabel("Second Number");
t2 = new JTextField(10);
l3 = new JLabel("Result");
t3 = new JTextField(10);




b1 = new JButton("+");
b2 = new JButton("-");
b3 = new JButton("*");
b4 = new JButton("/");
b5 = new JButton("%");
b6 = new JButton("CLEAR");




add (l1);
add (t1);
add (l2);
add (t2);
add (l3);
add (t3);



add (b1);
add (b2);
add (b3);
add (b4);
add (b5);
add (b6);



b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);


setVisible(true);
setSize(300,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


public void actionPerformed(ActionEvent ae)
{
int num1 = Integer.parseInt(t1.getText());
int num2 = Integer.parseInt(t2.getText());

if (ae.getSource()==b1)
{
int value = num1+num2;
t3.setText(""+value);
}
if (ae.getSource()==b2)
{
int value = num1-num2;
t3.setText(""+value);
}
if (ae.getSource()==b3)
{
int value = num1*num2;
t3.setText(""+value);
}
if (ae.getSource()==b4)
{
int value = num1/num2;
t3.setText(""+value);
}
if (ae.getSource()==b5)
{
int value = num1%num2;
t3.setText(""+value);
}
if (ae.getSource()==b6)
{
t1.setText("");
t2.setText("");
t3.setText("");
}

}
public static void main(String args[])
{
Calculator al = new Calculator();
}
}










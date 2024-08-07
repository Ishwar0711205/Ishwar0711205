import javax.swing .*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.color.*;


public class Color extends JFrame implements ActionListener{

    public static final java.awt.Color BLUE = null;
    public static final java.awt.Color WHITE = null;

    public static void main(String args[]){
        Color c =new Color();

    }

    JButton b,b1,b2,b3,b4;

    public Color(){



        setLayout(new FlowLayout());
        b=new JButton("BLUE");
        b1=new JButton("RED");
        b2=new JButton("CYAN");
        b3=new JButton("PINK");
        b4=new JButton("MAGENTA");

        add(b);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        getContentPane().setBackground(java.awt.Color.WHITE);
        setVisible(true);
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("BLUE") ) {
            getContentPane().setBackground(java.awt.Color.BLUE);

        } else if  (ae.getActionCommand().equals("RED")) {
            getContentPane().setBackground(java.awt.Color.RED);

        }
        else if  (ae.getActionCommand().equals("CYAN")) {
            getContentPane().setBackground(java.awt.Color.CYAN);

        }else if  (ae.getActionCommand().equals("PINK")) {
            getContentPane().setBackground(java.awt.Color.PINK);

        }else if  (ae.getActionCommand().equals("MAGENTA") ) {
            getContentPane().setBackground(java.awt.Color.MAGENTA);

        }


    }

    public static java.awt.Color decode(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'decode'");
    }
}

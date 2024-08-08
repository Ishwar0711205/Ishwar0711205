import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Notepad extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem open, save, cut, copy, paste, selectall;
    JTextArea ta;

    Notepad(){

        setTitle("Notepad");
        mb=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu ("Edit");
        help = new JMenu("Help");

        open =new JMenuItem("Open");
        cut =new JMenuItem("Cut");
        save =new JMenuItem("Save");
        paste =new JMenuItem("Paste");
        selectall =new JMenuItem("Select All");
        copy =new JMenuItem("Copy");

        ta=new JTextArea();

        file.add(open);
        file.add(save);

        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        edit.add(selectall);

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        ta.setBounds(20,20,400,400);

        add(ta);

        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        selectall.addActionListener(this);

        setJMenuBar(mb);
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent a)
    {
        if (a.getSource()==copy){
            ta.copy();
        }
        if(a.getSource()==cut){
            ta.cut();
        }
        if(a.getSource()==paste){
            ta.paste();
        }
        if(a.getSource()==selectall){
            ta.selectAll();
        }
    }

    public static void main(String args[]) {
        new Notepad();
    }
}
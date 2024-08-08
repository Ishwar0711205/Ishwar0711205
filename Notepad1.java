import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Notepad1 extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem open, save, cut, copy, paste, selectall;
    JTextArea ta;

    Notepad1(){
        setTitle("Notepad");
        mb=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu ("Edit");
        help = new JMenu("Help");

        open =new JMenuItem("Open");
        save =new JMenuItem("Save");
        cut =new JMenuItem("Cut");
        copy =new JMenuItem("Copy");
        paste =new JMenuItem("Paste");
        selectall =new JMenuItem("Select All");

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

        open.addActionListener(this);
        save.addActionListener(this);
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
        if(a.getSource()==open){
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    ta.setText(new String(java.nio.file.Files.readAllBytes(selectedFile.toPath())));
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
                }
            }
        }
        if(a.getSource()==save){
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showSaveDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    java.nio.file.Files.write(selectedFile.toPath(), ta.getText().getBytes());
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error writing file: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String args[]) {
        new Notepad1();
    }
}
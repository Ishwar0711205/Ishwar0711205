import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bicycle {
    
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Bike Rental");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        
        // Create and add name label and text field
        JLabel L1 = new JLabel("Name:");
        JTextField name = new JTextField(20);
        JPanel namePanel = new JPanel();
        namePanel.add(L1);
        namePanel.add(name);
        frame.add(namePanel);

        // Create and add days label and text field
        JLabel daysLabel = new JLabel("Number of Days:");
        JTextField daysField = new JTextField(5);
        JPanel daysPanel = new JPanel();
        daysPanel.add(daysLabel);
        daysPanel.add(daysField);
        frame.add(daysPanel);

        // Create radio buttons for bike models
        JRadioButton B1 = new JRadioButton("Model 1 - Ru10/day");
        JRadioButton B2 = new JRadioButton("Model 2 - Ru20/day");
        JRadioButton B3 = new JRadioButton("Model 3 - Ru30/day");
        
        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(B1);
        group.add(B2);
        group.add(B3);
        
        // Add radio buttons to a panel
        JPanel bikePanel = new JPanel();
        bikePanel.add(B1);
        bikePanel.add(B2);
        bikePanel.add(B3);
        frame.add(bikePanel);
        
        // Create button to calculate rent
        JButton CalcRent = new JButton("Calculate Rent");
        frame.add(CalcRent);

        // Add action listener to the calculate rent button
        CalcRent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String customerName = name.getText().trim();
                String daysText = daysField.getText().trim();
                double rent = 0.0;
                String selectedModel = "None";
                int numberOfDays = 0;

                try {
                    numberOfDays = Integer.parseInt(daysText);
                    if (numberOfDays <= 0) {
                        JOptionPane.showMessageDialog(frame, "Number of days must be a positive number.");
                        return;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number of days.");
                    return;
                }

                if (B1.isSelected()) {
                    selectedModel = "Model 1";
                    rent = 10.0;
                } else if (B2.isSelected()) {
                    selectedModel = "Model 2";
                    rent = 20.0;
                } else if (B3.isSelected()) {
                    selectedModel = "Model 3";
                    rent = 30.0;
                }

                if (customerName.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter your name.");
                } else if (selectedModel.equals("None")) {
                    JOptionPane.showMessageDialog(frame, "Please select a bike model.");
                } else {
                    double totalRent = rent * numberOfDays;
                    JOptionPane.showMessageDialog(frame,"Customer Name: " + customerName + "\nSelected Model: " + selectedModel +
                        "\nNumber of Days: " + numberOfDays + "\nTotal Rent: Ru." + totalRent);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

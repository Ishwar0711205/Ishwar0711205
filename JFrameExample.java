import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Main JFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            JButton openDialogButton = new JButton("Open JDialog");
            frame.add(openDialogButton, BorderLayout.CENTER);

            openDialogButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JDialog dialog = new JDialog(frame, "JDialog", true);
                    dialog.setSize(300, 200);
                    dialog.setLayout(new BorderLayout());

                    JLabel messageLabel = new JLabel("This is a JDialog", SwingConstants.CENTER);
                    dialog.add(messageLabel, BorderLayout.CENTER);

                    JButton closeButton = new JButton("Close");
                    dialog.add(closeButton, BorderLayout.SOUTH);

                    closeButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            dialog.dispose();
                        }
                    });

                    dialog.setLocationRelativeTo(frame);
                    dialog.setVisible(true);
                }
            });

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
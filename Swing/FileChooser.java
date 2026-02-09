package Swing;

import java.awt.event.*;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FileChooser {
    FileChooser() {

        JFrame frame = new JFrame("Border Demo");

        frame.setSize(500, 500);

        JButton opeButton = new JButton("Open");
        opeButton.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        opeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                int result = fc.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fc.getSelectedFile();
                    JOptionPane.showMessageDialog(frame, "You selected: " + selectedFile.getAbsolutePath());
                } else {
                    JOptionPane.showMessageDialog(frame, "You cancelled the operation.");
                }
            }
        });

        frame.add(opeButton);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FileChooser f = new FileChooser();
    }
}

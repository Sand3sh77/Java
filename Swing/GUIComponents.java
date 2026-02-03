package Swing;

import javax.swing.*;
import java.awt.*;

public class GUIComponents {
    GUIComponents() {
        JFrame frame = new JFrame("GUI Components Example");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("User name:");
        JTextField t1 = new JTextField();
    }

    public static void main(String[] args) {
        GUIComponents g = new GUIComponents();
    }
}
package Swing;

import javax.swing.*;
import java.awt.*;

public class GUIComponents {
    GUIComponents() {
        JFrame frame = new JFrame("GUI Components Example");
        frame.setSize(500, 500);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("User name:");
        JTextField t1 = new JTextField();

        JCheckBox c1 = new JCheckBox("Java");
        JCheckBox c2 = new JCheckBox("C++");
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(c1);
        bg1.add(c2);

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(r1);
        bg2.add(r2);

        String languages[] = { "Java", "Python", "C++", "JavaScript" };
        JComboBox cb1 = new JComboBox<>(languages);

        // l1.setBounds(20, 50, 100, 20);
        // t1.setBounds(120, 50, 100, 30);

        frame.add(l1);
        frame.add(t1);
        frame.add(c1);
        frame.add(c2);
        frame.add(r1);
        frame.add(r2);
        frame.add(cb1);

        frame.setVisible(true);

        frame.requestFocus();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GUIComponents g = new GUIComponents();
    }
}
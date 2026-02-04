package Swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderDemo {
    BorderDemo() {
        JFrame frame = new JFrame("Border Demo");

        frame.setLayout(new GridLayout(3, 2, 10, 10));

        JPanel p1 = new JPanel();
        p1.setBorder(BorderFactory.createLineBorder(Color.RED));
        p1.add(new JLabel("Line Border"));

        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.createEtchedBorder());
        p2.add(new JLabel("Etched Border"));

        JPanel p3 = new JPanel();
        p3.setBorder(BorderFactory.createLoweredBevelBorder());
        p3.add(new JLabel("Lowered Bevel Border"));

        JPanel p4 = new JPanel();
        p4.setBorder(BorderFactory.createRaisedBevelBorder());
        p4.add(new JLabel("Raised Level Border"));

        frame.setSize(500, 500);

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        BorderDemo b = new BorderDemo();
    }
}

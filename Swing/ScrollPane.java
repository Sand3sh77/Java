package Swing;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollPane {
    ScrollPane() {
        JFrame frame = new JFrame("Scroll Pane Expanded");

        JTextArea ta1 = new JTextArea(10, 20);
        JScrollPane sp1 = new JScrollPane(ta1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        frame.setLayout(new GridLayout());

        frame.setSize(500,500);

        frame.add(sp1);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ScrollPane g = new ScrollPane();
    }
}

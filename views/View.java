package mvc.views;

import javax.swing.*;
import java.awt.BorderLayout;

public class View {
    private JFrame frame;
    private JLabel label;
    private JButton button;

    public View(String text) {
        frame = new JFrame("View");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);

        label = new JLabel(text, SwingConstants.CENTER);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        button = new JButton("Click Me");
        frame.getContentPane().add(button, BorderLayout.CENTER);
    }

    public JButton getButton() {
        return button;
    }

    public void setText(String text) {
        label.setText(text);
    }
}

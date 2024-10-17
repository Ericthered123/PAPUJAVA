import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Hello World"), BorderLayout.CENTER);
        frame.add(panel);

        frame.setSize(400,200);
        frame.setVisible(true);


    }
}

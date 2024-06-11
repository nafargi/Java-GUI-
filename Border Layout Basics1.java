import javax.swing.*;
import java.awt.*;
111111
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout");
        frame.setLayout(new BorderLayout());

        JButton northButton = new JButton("north");
        JButton westButton = new JButton("west");
        JButton eastButton = new JButton("east");
        JButton southButton = new JButton("south");
        JButton centerButton = new JButton("center");

        frame.add(northButton,BorderLayout.NORTH);
        frame.add(westButton,BorderLayout.WEST);
        frame.add(eastButton,BorderLayout.EAST);
        frame.add(southButton,BorderLayout.SOUTH);
        frame.add(centerButton,BorderLayout.CENTER);

        frame.setSize(300,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

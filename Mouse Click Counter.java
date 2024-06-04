import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
1111111
public class MousecClickCount{
    public static void main(String[] args){
        JFrame frame = new JFrame("Mouse Click Counter");
        frame.setLayout(new FlowLayout());
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Number Of Clicks : 0");
        frame.add(label);

        final int[] numOfClicked = {0};

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                numOfClicked[0]++;
                label.setText("Number Of Clicks : "+numOfClicked[0]);
             }
        });

        frame.setVisible(true);
    }
}

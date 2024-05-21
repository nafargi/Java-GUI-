import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);


        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        frame.setContentPane(contentPane);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Set layout to FlowLayout to align components in the same line
        panel.setLayout(new FlowLayout());

        // Create checkboxes
        JCheckBox chkC = new JCheckBox("C");
        JCheckBox chkCpp = new JCheckBox("C++");
        JCheckBox chkJava = new JCheckBox("Java", true);
        JCheckBox chkPython = new JCheckBox("Perl");


        panel.add(chkC);
        panel.add(chkCpp);
        panel.add(chkJava);
        panel.add(chkPython);

        frame.getContentPane().add(panel);

        JPanel javaPanel = new JPanel();
        JLabel javaLabel = new JLabel("Java Is Selected:");
        javaPanel.setLayout(new FlowLayout(FlowLayout.CENTER));;
        javaPanel.add(javaLabel);

        frame.getContentPane().add( javaPanel);

        frame.setVisible(true);
    }
}

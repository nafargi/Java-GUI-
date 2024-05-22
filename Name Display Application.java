import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(450,220));
        frame.setTitle("Display Name");


        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints panelGird = new GridBagConstraints();
        panelGird.fill = GridBagConstraints.HORIZONTAL;


        JLabel label = new JLabel("Enter Youer  Name ");
        JTextField nameHolder  = new JTextField(null,10);
        JButton btn = new JButton("Display the Name ");


        panelGird.gridy = 0;
        panelGird.gridx = 0;
        panel.add(label, panelGird);
        panelGird.gridx = 1;
        panel.add(nameHolder, panelGird);

        panelGird.gridy = 1;
        panelGird.gridx = 0;
        panel.add(btn, panelGird);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameHolder.getText();
                displayName(name);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void displayName(String name){
        JFrame dFrame = new JFrame();
        dFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dFrame .setSize(new Dimension(450,220));
        dFrame .setTitle("Entered Name");
        dFrame.setLayout(new FlowLayout());

        JLabel label2 = new JLabel("Entered name : "+ name);
        dFrame.add(label2);
        dFrame.setVisible(true);
    }

}


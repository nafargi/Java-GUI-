import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame =  new JFrame();
        frame.setLayout(new GridBagLayout());
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Sample Of Action Listener");

        JButton btn1 = new JButton("Alpha");
        JLabel labelAlpha = new JLabel(" ");

        JButton btn2 = new JButton("Beta");
        JLabel labelBeta = new JLabel(" ");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(labelAlpha.getText().equals("Alpha was pressed")){
                    labelAlpha.setText(" ");
                }else {
                    labelAlpha.setText("Alpha was pressed");
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(labelBeta.getText().equals("Beta was pressed")){
                    labelBeta.setText(" ");
                }else {
                    labelBeta.setText("Beta was pressed");
                }
            }
        });
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(btn1,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(btn2,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        frame.add(labelAlpha,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        frame.add(labelBeta,gbc);

        frame.setVisible(true);

    }
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(450,220));
        frame.setTitle("JcheckDemo");


        JPanel checkPanel = new JPanel(new GridBagLayout());
        GridBagConstraints checkGird = new GridBagConstraints();
        checkGird.fill = GridBagConstraints.HORIZONTAL;

        JCheckBox check1 = new JCheckBox("C");
        JCheckBox check2 = new JCheckBox("C++");
        JCheckBox check3 = new JCheckBox("Java");
        JCheckBox check4 = new JCheckBox("Perl");

        JLabel label1 = new JLabel(" ");
        JLabel label2 = new JLabel(" ");
        JLabel label3 = new JLabel(" ");
        JLabel label4 = new JLabel(" ");

        checkGird.gridy = 0;
        checkGird.gridx = 0;
        checkPanel.add(check1, checkGird);
        checkGird.gridx = 1;
        checkPanel.add(check2, checkGird);
        checkGird.gridx = 2;
        checkPanel.add(check3, checkGird);
        checkGird.gridx = 3;
        checkPanel.add(check4, checkGird);

        checkGird.gridy = 1;
        checkGird.gridx = 0;
        checkPanel.add(label1, checkGird);
        checkGird.gridx = 1;
        checkPanel.add(label2, checkGird);
        checkGird.gridx = 2;
        checkPanel.add(label3, checkGird);
        checkGird.gridx = 3;
        checkPanel.add(label4, checkGird);


        check1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(check1.isSelected()){
                    label1.setText("C Is Selected  ");
                } else {
                    label1.setText(" ");
                }
            }
        });
        check2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(check2.isSelected()){
                    label2.setText("C++ Is Selected  ");
                } else {
                    label2.setText(" ");
                }
            }
        });
        check3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(check3.isSelected()){
                    label3.setText("Java Is Selected  ");
                } else {
                    label3.setText(" ");
                }
            }
        });
        check4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(check4.isSelected()){
                    label4.setText("Perl Is Selected  " );
                } else {
                    label4.setText(" ");
                }
            }
        });
        frame.add(checkPanel);
        frame.setVisible(true);
    }
}

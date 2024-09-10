import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new GridBagLayout());
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

         JLabel label1 = new JLabel("Number 1: ");
         JTextField num1 = new JTextField(15);

         JLabel label2 = new JLabel("Number 2: ");
         JTextField num2 = new JTextField(15);

         JButton btn = new JButton("Calculate");
         btn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try{
                     String numStr1 = num1.getText();
                     String numStr2 = num2.getText();

                     int numInt1 = Integer.parseInt(numStr1);
                     int numInt2 = Integer.parseInt(numStr2);

                     int sum = numInt1 + numInt2;
                     JOptionPane.showMessageDialog(null,"sum is : "+sum);
                 }
                 catch(NumberFormatException ex){
                     JOptionPane.showMessageDialog(null,"OOPs,try again you entered invalid value");
                 }
             }
         });

         GridBagConstraints gbc = new GridBagConstraints();
         gbc.insets = new Insets(10,10,10,10);
         gbc.fill = GridBagConstraints.HORIZONTAL;

         gbc.gridx = 0;
         gbc.gridy = 0;
         frame.add(label1,gbc);

         gbc.gridx = 1;
         gbc.gridy = 0;
         frame.add(num1,gbc);

         gbc.gridx = 0;
         gbc.gridy = 1;
         frame.add(label2,gbc);

         gbc.gridx = 1;
         gbc.gridy = 1;
         frame.add(num2,gbc);

         gbc.gridx = 0;
         gbc.gridy = 2;
         gbc.gridwidth = 2;
         frame.add(btn,gbc);

        frame.setVisible(true);

    }
}

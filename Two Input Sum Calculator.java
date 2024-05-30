import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new FlowLayout());
        
         JLabel label1 = new JLabel("Number 1: ");
         JTextField num1 = new JTextField(15);

         JLabel label2 = new JLabel("Number 2: ");
         JTextField num2 = new JTextField(15);

         JButton btn = new JButton("Calculate");

         btn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String numStr1 = num1.getText();
                 String numStr2 = num2.getText();

                 int numInt1 = Integer.parseInt(numStr1);
                 int numInt2 = Integer.parseInt(numStr2);

                 int sum = numInt1 + numInt2;
                JOptionPane.showMessageDialog(null,"sum is : "+sum);
             }
         });

         frame.add(label1);
         frame.add(num1);
         frame.add(label2);
         frame.add(num2);
         frame.add(btn);

        frame.setSize(300,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }
}

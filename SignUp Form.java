
import javax.swing.*;
import java.awt.*;

public class GridBagLayoutInstance {

    public GridBagLayoutInstance() {
        JFrame frame = new JFrame();
        GridBagLayout gBag = new GridBagLayout();
        frame.setLayout(gBag);

        GridBagConstraints gbc = new GridBagConstraints();
        JLabel labelForUserName = new JLabel("UserName");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.1;
        gbc.weighty = 0.1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(80,20,10,0);
        frame.add(labelForUserName, gbc);

        JTextField fieldForUserName= new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(80,10,10,40);
        frame.add(fieldForUserName,gbc);

        JLabel labelForPassword= new JLabel("Password");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(0,20,10,0);
        frame.add(labelForPassword,gbc);

        JPasswordField passwordField= new JPasswordField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(0,10,10,40);
        frame.add(passwordField,gbc);

        JLabel confirmPasswordLabel= new JLabel("confirm password");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(0,20,10,0);
        frame.add(confirmPasswordLabel,gbc);

        JPasswordField confirmPasswordField= new JPasswordField();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(0,10,10,40);
        frame.add(confirmPasswordField, gbc);

        JButton signUpButton= new JButton("SignUp");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(0,40,80,40);
        frame.add(signUpButton, gbc);


        frame.setVisible(true);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 }



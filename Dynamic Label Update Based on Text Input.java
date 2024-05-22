import javax.swing.*;
import java.awt.FlowLayout;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class DocumentListenerInstance {

    public DocumentListenerInstance() {
        JFrame frame = new JFrame("Label Update");
       frame.setLayout(new FlowLayout());

        JTextField textFromUser = new JTextField(20);
        JLabel label = new JLabel("Type something...");


        textFromUser.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                label.setText(textFromUser.getText());
            }

            public void removeUpdate(DocumentEvent e) {

            }

            public void changedUpdate(DocumentEvent e) {

            }
        });


        frame.add(textFromUser);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

    }
}

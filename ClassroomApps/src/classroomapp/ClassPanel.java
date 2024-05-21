package classroomapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class ClassPanel extends JPanel {
    private DefaultListModel<String> classListModel;
    private JList<String> classList;

    public ClassPanel() {
        setLayout(new BorderLayout());
        classListModel = new DefaultListModel<>();
        classList = new JList<>(classListModel);

        JButton addButton = new JButton("Add Class");
        addButton.addActionListener(this::addClass);

        add(new JScrollPane(classList), BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);
    }

    private void addClass(ActionEvent e) {
        String className = JOptionPane.showInputDialog(this, "Enter class name:");
        if (className != null && !className.trim().isEmpty()) {
            classListModel.addElement(className);
        }
    }
}

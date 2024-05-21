package classroomapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AnnouncementPanel extends JPanel {
    private DefaultListModel<String> announcementListModel;
    private JList<String> announcementList;

    public AnnouncementPanel() {
        setLayout(new BorderLayout());
        announcementListModel = new DefaultListModel<>();
        announcementList = new JList<>(announcementListModel);

        JButton addButton = new JButton("Post Announcement");
        addButton.addActionListener(this::postAnnouncement);

        add(new JScrollPane(announcementList), BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);
    }

    private void postAnnouncement(ActionEvent e) {
        String announcement = JOptionPane.showInputDialog(this, "Enter announcement:");
        if (announcement != null && !announcement.trim().isEmpty()) {
            announcementListModel.addElement(announcement);
        }
    }
}

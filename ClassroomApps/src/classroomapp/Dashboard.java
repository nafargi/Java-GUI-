package classroomapp;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    public Dashboard() {
        setTitle("Classroom App - Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        JTabbedPane tabbedPane = new JTabbedPane();

        ClassPanel classPanel = new ClassPanel();
        AnnouncementPanel announcementPanel = new AnnouncementPanel();

        tabbedPane.addTab("Classes", classPanel);
        tabbedPane.addTab("Announcements", announcementPanel);

        add(tabbedPane);
    }
}

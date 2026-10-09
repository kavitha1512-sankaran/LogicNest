
package com.Smartblood.ui;

import javax.swing.*;
import java.awt.*;

public class DonorDashboardFrame extends JFrame {

    public DonorDashboardFrame() {
        setTitle("Donor Dashboard");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(25, 60, 25, 60));

        JLabel title = new JLabel("Donor Dashboard", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));

        JButton profile = new JButton("My Profile");
        JButton history = new JButton("Donation History");
        JButton emergency = new JButton("Emergency Requests");
        JButton search = new JButton("Search Donors");
        JButton logout = new JButton("Logout");

        profile.addActionListener(e -> new DonorProfileFrame());
        history.addActionListener(e -> new DonationHistoryFrame());
        emergency.addActionListener(e -> new EmergencyRequestFrame());
        search.addActionListener(e -> new DonorSearchFrame());

        logout.addActionListener(e -> {
            dispose();
            new HomeFrame();
        });

        panel.add(title);
        panel.add(profile);
        panel.add(history);
        panel.add(emergency);
        panel.add(search);
        panel.add(logout);

        add(panel);
        setVisible(true);
    }
}
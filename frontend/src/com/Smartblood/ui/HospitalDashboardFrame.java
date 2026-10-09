
package com.Smartblood.ui;

import java.awt.*;
import javax.swing.*;

public class HospitalDashboardFrame extends JFrame {

    private JButton searchDonorButton;
    private JButton emergencyRequestButton;
    private JButton logoutButton;

    public HospitalDashboardFrame() {

        // Window settings
        setTitle("SmartBloodDonor - Hospital Dashboard");
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBackground(Color.WHITE);

        // Heading
        JLabel heading = new JLabel(
                "Hospital Dashboard", JLabel.CENTER);

        heading.setFont(new Font("Arial", Font.BOLD, 28));
        heading.setForeground(new Color(180, 20, 40));
        heading.setBorder(
                BorderFactory.createEmptyBorder(25, 10, 25, 10));

        // Welcome message
        JLabel welcome = new JLabel(
                "Welcome to SmartBloodDonor Hospital Portal",
                JLabel.CENTER);

        welcome.setFont(new Font("Arial", Font.PLAIN, 16));

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 15, 15));
        buttonPanel.setBorder(
                BorderFactory.createEmptyBorder(20, 100, 30, 100));
        buttonPanel.setBackground(Color.WHITE);

        searchDonorButton = new JButton("Search Blood Donors");
        emergencyRequestButton =
                new JButton("Create Emergency Request");
        logoutButton = new JButton("Logout");

        // Button styling
        searchDonorButton.setFont(
                new Font("Arial", Font.BOLD, 16));
        emergencyRequestButton.setFont(
                new Font("Arial", Font.BOLD, 16));
        logoutButton.setFont(
                new Font("Arial", Font.BOLD, 16));

        searchDonorButton.setBackground(
                new Color(190, 30, 45));
        searchDonorButton.setForeground(Color.WHITE);

        emergencyRequestButton.setBackground(
                new Color(190, 30, 45));
        emergencyRequestButton.setForeground(Color.WHITE);

        logoutButton.setBackground(Color.LIGHT_GRAY);

        // Button actions
        searchDonorButton.addActionListener(e -> {
            new DonorSearchFrame();
        });

        emergencyRequestButton.addActionListener(e -> {
            new EmergencyRequestFrame();
        });

        logoutButton.addActionListener(e -> {
            dispose();
            new HomeFrame();
        });

        // Add buttons
        buttonPanel.add(searchDonorButton);
        buttonPanel.add(emergencyRequestButton);
        buttonPanel.add(logoutButton);

        // Footer
        JLabel footer = new JLabel(
                "SmartBloodDonor | Save Lives, Donate Blood",
                JLabel.CENTER);

        footer.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 15, 10));

        // Add components
        mainPanel.add(heading, BorderLayout.NORTH);
        mainPanel.add(welcome, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel, BorderLayout.CENTER);
        add(footer, BorderLayout.SOUTH);

        // Open dashboard
        setVisible(true);
    }

    // Run this class directly to open the dashboard
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HospitalDashboardFrame();
        });
    }
}
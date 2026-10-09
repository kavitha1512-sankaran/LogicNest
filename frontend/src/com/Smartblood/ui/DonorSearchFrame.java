
package com.Smartblood.ui;

import java.awt.*;
import javax.swing.*;

public class DonorSearchFrame extends JFrame {

    public DonorSearchFrame() {
        setTitle("Search Blood Donors");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        JComboBox<String> bloodGroup = new JComboBox<>(
                new String[]{"A+", "A-", "B+", "B-", "AB+",
                    "AB-", "O+", "O-"});

        JTextField city = new JTextField();
        JButton search = new JButton("Search");
        JButton back = new JButton("Back");

        panel.add(new JLabel("Blood Group:"));
        panel.add(bloodGroup);
        panel.add(new JLabel("City:"));
        panel.add(city);
        panel.add(search);
        panel.add(back);

        search.addActionListener(e -> {
            if (city.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Please enter the city.");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Search criteria: " + bloodGroup.getSelectedItem()
                        + ", " + city.getText().trim()
                        + "\nConnect DonorDAO to display matching donors.");
            }
        });

        back.addActionListener(e -> dispose());

        add(panel);
        setVisible(true);
    }
}
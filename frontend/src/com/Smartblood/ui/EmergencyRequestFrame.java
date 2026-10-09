
package com.Smartblood.ui;

import java.awt.*;
import javax.swing.*;

public class EmergencyRequestFrame extends JFrame {

    public EmergencyRequestFrame() {
        setTitle("Emergency Blood Request");
        setSize(450, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        JTextField hospital = new JTextField();
        JComboBox<String> bloodGroup = new JComboBox<>(
                new String[]{"A+", "A-", "B+", "B-", "AB+",
                    "AB-", "O+", "O-"});

        JTextField units = new JTextField();
        JTextField city = new JTextField();

        JComboBox<String> urgency = new JComboBox<>(
                new String[]{"High", "Medium", "Low"});

        JButton submit = new JButton("Submit Request");
        JButton back = new JButton("Back");

        panel.add(new JLabel("Hospital Name:"));
        panel.add(hospital);
        panel.add(new JLabel("Blood Group:"));
        panel.add(bloodGroup);
        panel.add(new JLabel("Units Required:"));
        panel.add(units);
        panel.add(new JLabel("City:"));
        panel.add(city);
        panel.add(new JLabel("Urgency:"));
        panel.add(urgency);
        panel.add(submit);
        panel.add(back);

        submit.addActionListener(e -> {
            try {
                int requiredUnits =
                        Integer.parseInt(units.getText().trim());

                if (hospital.getText().trim().isEmpty()
                        || city.getText().trim().isEmpty()
                        || requiredUnits <= 0) {
                    JOptionPane.showMessageDialog(this,
                            "Please enter valid request details.");
                    return;
                }

                JOptionPane.showMessageDialog(this,
                        "Request form validated!\n"
                        + "Blood Group: " + bloodGroup.getSelectedItem()
                        + "\nUnits: " + requiredUnits
                        + "\nUrgency: " + urgency.getSelectedItem()
                        + "\nDatabase saving is not connected yet.");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Enter a valid number of units.");
            }
        });

        back.addActionListener(e -> dispose());

        add(panel);
        setVisible(true);
    }
}
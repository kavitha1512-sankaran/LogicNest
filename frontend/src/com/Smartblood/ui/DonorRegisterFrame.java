
package com.Smartblood.ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import com.Smartblood.model.Donor;

public class DonorRegisterFrame extends JFrame {

    private JTextField nameField;
    private JTextField phoneField;
    private JTextField cityField;
    private JComboBox<String> bloodGroup;

    private static ArrayList<Donor> donorList =
            new ArrayList<>();

    public DonorRegisterFrame() {
        setTitle("Donor Registration");
        setSize(450, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(
                new GridLayout(6, 2, 10, 10));

        nameField = new JTextField();
        phoneField = new JTextField();
        cityField = new JTextField();

        bloodGroup = new JComboBox<>(new String[]{
                "A+", "A-", "B+", "B-", "AB+",
                "AB-", "O+", "O-"
        });

        JButton register = new JButton("Register");
        JButton viewDonors = new JButton("View Donors");

        panel.add(new JLabel("Name:"));
        panel.add(nameField);

        panel.add(new JLabel("Blood Group:"));
        panel.add(bloodGroup);

        panel.add(new JLabel("Phone:"));
        panel.add(phoneField);

        panel.add(new JLabel("City:"));
        panel.add(cityField);

        panel.add(register);
        panel.add(viewDonors);

        register.addActionListener(e -> registerDonor());
        viewDonors.addActionListener(e -> showDonors());

        add(panel);
        setVisible(true);
    }

    private void registerDonor() {
        String name = nameField.getText().trim();
        String phone = phoneField.getText().trim();
        String city = cityField.getText().trim();
        String group = (String) bloodGroup.getSelectedItem();

        if (name.isEmpty() || phone.isEmpty()
                || city.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill all fields.");
            return;
        }

        if (!phone.matches("[0-9]{10}")) {
            JOptionPane.showMessageDialog(this,
                    "Enter a valid 10-digit phone number.");
            return;
        }

        Donor donor = new Donor(name, group, phone, city);
        donorList.add(donor);

        JOptionPane.showMessageDialog(this,
                "Donor registered successfully!");

        nameField.setText("");
        phoneField.setText("");
        cityField.setText("");
    }

    private void showDonors() {
        StringBuilder result = new StringBuilder();

        for (Donor donor : donorList) {
            result.append("Name: ")
                  .append(donor.getName())
                  .append(", Blood Group: ")
                  .append(donor.getBloodGroup())
                  .append(", City: ")
                  .append(donor.getCity())
                  .append("\n");
        }

        if (donorList.isEmpty()) {
            result.append("No donors registered yet.");
        }

        JOptionPane.showMessageDialog(this,
                result.toString());
    }
}
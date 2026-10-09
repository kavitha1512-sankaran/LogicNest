
package com.Smartblood.ui;

import java.awt.*;
import javax.swing.*;

public class DonorLoginFrame extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;

    public DonorLoginFrame() {
        setTitle("Donor Login");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(
                new GridLayout(3, 2, 10, 10));

        emailField = new JTextField();
        passwordField = new JPasswordField();

        JButton login = new JButton("Login");
        JButton back = new JButton("Back");

        panel.add(new JLabel("Email:"));
        panel.add(emailField);

        panel.add(new JLabel("Password:"));
        panel.add(passwordField);

        panel.add(login);
        panel.add(back);

        login.addActionListener(e -> validateLogin());
        back.addActionListener(e -> dispose());

        add(panel);
        setVisible(true);
    }

    private void validateLogin() {
        String email = emailField.getText().trim();
        String password =
                new String(passwordField.getPassword());

        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Enter email and password.");
        } else {
            JOptionPane.showMessageDialog(this,
                    "Connect the login service to verify credentials.");
        }
    }
}
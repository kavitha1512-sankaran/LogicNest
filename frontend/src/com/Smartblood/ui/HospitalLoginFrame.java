
package com.Smartblood.ui;

import java.awt.*;
import javax.swing.*;

public class HospitalLoginFrame extends JFrame {

    public HospitalLoginFrame() {
        setTitle("Hospital Login");
        setSize(400, 280);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        JTextField hospitalId = new JTextField();
        JPasswordField password = new JPasswordField();

        JButton login = new JButton("Login");
        JButton back = new JButton("Back");

        panel.add(new JLabel("Hospital ID:"));
        panel.add(hospitalId);
        panel.add(new JLabel("Password:"));
        panel.add(password);
        panel.add(login);
        panel.add(back);

        login.addActionListener(e -> {
            if (hospitalId.getText().trim().isEmpty()
                    || password.getPassword().length == 0) {
                JOptionPane.showMessageDialog(this,
                        "Please enter Hospital ID and password.");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Demo only. Hospital authentication is not connected.");
            }
        });

        back.addActionListener(e -> dispose());

        add(panel);
        setVisible(true);
    }
}
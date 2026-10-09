
package com.Smartblood.ui;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends JFrame {

    private JButton donorLogin;
    private JButton donorRegister;
    private JButton hospitalLogin;

    public HomeFrame() {
        setTitle("SmartBloodDonor");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void showHome() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JLabel title = new JLabel(
                "SmartBloodDonor", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 25));

        donorLogin = new JButton("Donor Login");
        donorRegister = new JButton("Donor Registration");
        hospitalLogin = new JButton("Hospital Login");

        donorLogin.addActionListener(e ->
                new DonorLoginFrame());

        donorRegister.addActionListener(e ->
                new DonorRegisterFrame());

        hospitalLogin.addActionListener(e ->
                new HospitalLoginFrame());

        panel.add(title);
        panel.add(donorLogin);
        panel.add(donorRegister);
        panel.add(hospitalLogin);
        panel.add(new JLabel(
                "Donate Blood - Save Lives", JLabel.CENTER));

        add(panel);
        setVisible(true);
    }
}

package com.Smartblood.ui;

import java.awt.*;
import javax.swing.*;

public class DonorProfileFrame extends JFrame {

    public DonorProfileFrame() {
        setTitle("Donor Profile");
        setSize(420, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        JTextField name = new JTextField();
        JTextField phone = new JTextField();
        JTextField blood = new JTextField();
        JTextField city = new JTextField();

        JButton save = new JButton("Save Changes");
        JButton back = new JButton("Back");

        panel.add(new JLabel("Name:"));
        panel.add(name);
        panel.add(new JLabel("Phone:"));
        panel.add(phone);
        panel.add(new JLabel("Blood Group:"));
        panel.add(blood);
        panel.add(new JLabel("City:"));
        panel.add(city);
        panel.add(save);
        panel.add(back);

        save.addActionListener(e ->
            JOptionPane.showMessageDialog(this,
                "Profile form ready. Database update is not connected yet."));

        back.addActionListener(e -> dispose());

        add(panel);
        setVisible(true);
    }
}
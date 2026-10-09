
package com.Smartblood.ui;

import java.awt.*;
import javax.swing.*;

public class DonationHistoryFrame extends JFrame {

    public DonationHistoryFrame() {
        setTitle("Donation History");
        setSize(550, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {
            "Donation ID", "Date", "Blood Group", "Hospital"
        };

        Object[][] data = {};

        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);

        JButton back = new JButton("Back");
        back.addActionListener(e -> dispose());

        add(scrollPane, BorderLayout.CENTER);
        add(back, BorderLayout.SOUTH);

        setVisible(true);
    }
}
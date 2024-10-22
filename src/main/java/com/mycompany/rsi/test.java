/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class test {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Dynamic Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 800);
        frame.setLayout(new AbsoluteLayout()); // Using Absolute Layout like in your example

        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new AbsoluteLayout());
        
        // Create multiple panels in a for loop
        for (int i = 0; i < 3; i++) {
            // Create a new JPanel with the same configuration as jPanel1
            JPanel newPanel = new JPanel();

            newPanel.setForeground(new java.awt.Color(255, 255, 255));
            newPanel.setDoubleBuffered(false);
            newPanel.setEnabled(false);
            newPanel.setFocusable(false);
            newPanel.setOpaque(false);
            newPanel.setRequestFocusEnabled(false);
            newPanel.setVerifyInputWhenFocusTarget(false);
            newPanel.setLayout(new AbsoluteLayout());

            // Add any sub-components to the new panel (if you have any)
            JLabel label = new JLabel("Panel " + (i + 1));
            newPanel.add(label, new AbsoluteConstraints(10, 10, -1, -1));  // Example sub-component

            // Adjust the position dynamically for each panel (e.g., spacing them vertically)
            int x = 60; // X-coordinate (kept same for all panels)
            int y = 180 + i * 220; // Y-coordinate changes for each panel (offset of 220 pixels)
            int width = 1319;
            int height = 197;

            // Add the new panel to jPanel2
            jPanel2.add(newPanel, new AbsoluteConstraints(x, y, width, height));
        }

        // Add jPanel2 to the JFrame
        frame.add(jPanel2, new AbsoluteConstraints(0, 0, 1600, 800));
        
        // Make the frame visible
        frame.setVisible(true);
    }
}




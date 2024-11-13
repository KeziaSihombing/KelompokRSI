/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rsi;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class LoginUI extends javax.swing.JFrame {
    /**
     * Creates new form Login
     */
    public LoginUI() {
    
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Famify");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(1440, 900));
        setMinimumSize(new java.awt.Dimension(1440, 900));
        setPreferredSize(new java.awt.Dimension(1440, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Property 1=Default.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 186, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel3.setText("EMAIL");
        jLabel3.setPreferredSize(new java.awt.Dimension(655, 21));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel4.setText("Kata Sandi");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setPreferredSize(new java.awt.Dimension(658, 21));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 406, -1, -1));

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText("Ketik email...");
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setPreferredSize(new java.awt.Dimension(658, 61));
        jTextField2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField2.setVerifyInputWhenFocusTarget(false);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 309, -1, -1));
        jTextField2.getAccessibleContext().setAccessibleName("emailTxtField");

        jPasswordField1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordField1.setText("Ketik kata sandi..");
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPasswordField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPasswordField1.setOpaque(true);
        jPasswordField1.setPreferredSize(new java.awt.Dimension(658, 61));
        jPasswordField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 435, -1, -1));
        jPasswordField1.getAccessibleContext().setAccessibleName("PassPsField");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/girl-with-red-hat-f4_Obgjio9Y-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(135, 55));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 532, -1, -1));
        jButton1.getAccessibleContext().setAccessibleName("LoginButton");

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(11, 177, 203));
        jButton2.setText("Daftar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.setPreferredSize(new java.awt.Dimension(655, 21));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 623, 80, -1));
        jButton2.getAccessibleContext().setAccessibleName("RegisterButton");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Belum punya akun?       \n");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setPreferredSize(new java.awt.Dimension(658, 21));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 623, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
//select Login
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if((jTextField2.getText().equals("Ketik email...") || jTextField2.getText().isBlank()) &&
           (jPasswordField1.getText().equals("Ketik kata sandi..") || jPasswordField1.getText().isBlank())){               
            Aplikasi.controllerLogin.showMessage("Lengkapi Email dan Password Anda");
            jTextField2.setText("Ketik email...");
            jPasswordField1.setText("Ketik kata sandi..");
        }else if (jTextField2.getText().equals("Ketik email...") || jTextField2.getText().isBlank()){
            Aplikasi.controllerLogin.showMessage("Lengkapi Email Anda");
            jTextField2.setText("Ketik email...");
            jPasswordField1.setText("Ketik kata sandi..");
        }else if(jPasswordField1.getText().equals("Ketik kata sandi..") || jPasswordField1.getText().isBlank()){
             Aplikasi.controllerLogin.showMessage("Lengkapi Password Anda");
             jTextField2.setText("Ketik email...");
            jPasswordField1.setText("Ketik kata sandi..");
        }else{        
            Aplikasi.controllerLogin.validateUser(jTextField2.getText(), jPasswordField1.getText());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Aplikasi.dialogUI.showMessage("Fitur ini tidak dikembangkan");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        jPasswordField1.setText("");    // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1MouseClicked

    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }
    
    public void tampilkan(){
        this.setVisible(true);
    }
   
         
    /**
     * @param args the command line arguments
     */

     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
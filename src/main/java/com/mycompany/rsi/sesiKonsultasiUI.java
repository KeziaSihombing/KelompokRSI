/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rsi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class sesiKonsultasiUI extends javax.swing.JFrame {

    /**
     * Creates new form sesiKonsultasiUI
     */
    public sesiKonsultasiUI() {
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

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1446, 1256));
        setMinimumSize(new java.awt.Dimension(1446, 1256));
        setPreferredSize(new java.awt.Dimension(1440, 1256));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(111, 110, 110));
        jButton1.setText("Beranda");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(78, 15));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 40, 100, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(111, 110, 110));
        jButton3.setText("Manajemen Jadwal");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(180, 15));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(111, 110, 110));
        jButton4.setText("Sesi Konsultasi");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setPreferredSize(new java.awt.Dimension(143, 15));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(111, 110, 110));
        jButton2.setText("Obrolan");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(76, 15));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 40, 110, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ellipse 44.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 12, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Property 1=Default.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 17, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 3.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        jLabel1.setPreferredSize(new java.awt.Dimension(1440, 94));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setDoubleBuffered(true);

        jPanel2.setMinimumSize(new java.awt.Dimension(1379, 800));
        jPanel2.setPreferredSize(new java.awt.Dimension(1379, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 40)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Berikut Daftar");
        jLabel3.setPreferredSize(new java.awt.Dimension(719, 35));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(11, 177, 203));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Sesi Konsultasi");
        jLabel5.setPreferredSize(new java.awt.Dimension(719, 35));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 450, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 40)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Kamu");
        jLabel6.setPreferredSize(new java.awt.Dimension(719, 35));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel4.setText("Hari ini");
        jLabel4.setPreferredSize(new java.awt.Dimension(71, 28));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 450, -1));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setEnabled(false);
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/div.u-pos-has.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(34, 184, 185));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.u-t-capitalize.png"))); // NOI18N
        jButton7.setText("Lihat Detail Sesi");
        jButton7.setActionCommand("");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 220, -1));

        jButton12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.u-t-capitalize (2).png"))); // NOI18N
        jButton12.setText("Mulai Obrolan");
        jButton12.setActionCommand("");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 220, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel13.setText("Dewi Alyssa");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(120, 120, 135));
        jLabel14.setText("24 Tahun");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(65, 65, 70));
        jLabel19.setText("Kamis, 10 Oktober 2024");
        jLabel19.setPreferredSize(new java.awt.Dimension(155, 20));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(34, 184, 185));
        jLabel20.setText("Konsultasi online");
        jLabel20.setPreferredSize(new java.awt.Dimension(155, 20));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(65, 65, 70));
        jLabel21.setText("02.00 PM - 03.00 PM");
        jLabel21.setPreferredSize(new java.awt.Dimension(155, 20));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(96, 96, 96));
        jLabel7.setText("Akan Berlangsung");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 50, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/div.u-border-general--bottom.png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setPreferredSize(new java.awt.Dimension(1319, 197));
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 1319, 197));

        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);
        jPanel3.setDoubleBuffered(false);
        jPanel3.setEnabled(false);
        jPanel3.setMinimumSize(new java.awt.Dimension(1319, 183));
        jPanel3.setPreferredSize(new java.awt.Dimension(1319, 183));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/div.u-pos-has.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(34, 184, 185));
        jLabel17.setText("Konsultasi online");
        jLabel17.setPreferredSize(new java.awt.Dimension(155, 20));
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(65, 65, 70));
        jLabel18.setText("Kamis, 10 Oktober 2024");
        jLabel18.setPreferredSize(new java.awt.Dimension(155, 20));
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel15.setText("Dewi Alyssa");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(96, 96, 96));
        jLabel11.setText("Akan Berlangsung");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, -1, -1));

        jLabel16.setForeground(new java.awt.Color(120, 120, 135));
        jLabel16.setText("24 Tahun");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(65, 65, 70));
        jLabel22.setText("02.00 PM - 03.00 PM");
        jLabel22.setPreferredSize(new java.awt.Dimension(155, 20));
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jButton8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(34, 184, 185));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.u-t-capitalize.png"))); // NOI18N
        jButton8.setText("Lihat Detail Sesi");
        jButton8.setActionCommand("");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 218, 47));

        jButton14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.u-t-capitalize (2).png"))); // NOI18N
        jButton14.setText("Mulai Obrolan");
        jButton14.setActionCommand("");
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 218, 47));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/div.u-border-general--bottom.png"))); // NOI18N
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setPreferredSize(new java.awt.Dimension(1319, 197));
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jPanel4.setDoubleBuffered(false);
        jPanel4.setEnabled(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(1319, 183));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/div.u-pos-has.png"))); // NOI18N
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(34, 184, 185));
        jLabel32.setText("Konsultasi online");
        jLabel32.setPreferredSize(new java.awt.Dimension(155, 20));
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(65, 65, 70));
        jLabel33.setText("Kamis, 10 Oktober 2024");
        jLabel33.setPreferredSize(new java.awt.Dimension(155, 20));
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel34.setText("Dewi Alyssa");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jButton9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(34, 184, 185));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.u-t-capitalize.png"))); // NOI18N
        jButton9.setText("Lihat Detail Sesi");
        jButton9.setActionCommand("");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 218, 47));

        jButton15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.u-t-capitalize (2).png"))); // NOI18N
        jButton15.setText("Mulai Obrolan");
        jButton15.setActionCommand("");
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 218, 47));

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(96, 96, 96));
        jLabel35.setText("Akan Berlangsung");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, -1, -1));

        jLabel36.setForeground(new java.awt.Color(120, 120, 135));
        jLabel36.setText("24 Tahun");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(65, 65, 70));
        jLabel37.setText("02.00 PM - 03.00 PM");
        jLabel37.setPreferredSize(new java.awt.Dimension(155, 20));
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/div.u-border-general--bottom.png"))); // NOI18N
        jLabel38.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel38.setPreferredSize(new java.awt.Dimension(1319, 197));
        jLabel38.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        jScrollPane2.setViewportView(jPanel2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 1440, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Aplikasi.upHasil.tampilkan();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void tampilkan(List<DataDaftarSesi> daftar){
        jPanel1.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        
        //perbedaan tampilan untuk klien dan konsultan
        if(Aplikasi.akun.getPerson().equals("klien")){
            //tampilan klien  
            
            if(daftar.size()>=1){              
                DataDaftarSesi sesi1 = daftar.get(0);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                // Konversi string tanggalKonsul menjadi LocalDate
                LocalDate tanggalKonsultasi = LocalDate.parse(sesi1.getTanggalKonsul(), formatter);
                DateTimeFormatter formatterWithDay = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
                String formattedTanggal = tanggalKonsultasi.format(formatterWithDay);
                
                jLabel4.setText(formattedTanggal);
                jLabel13.setText(sesi1.getNama()); // Nama
                jLabel14.setText(sesi1.getSpesialisasi()); // Spesialisasi
                jLabel19.setText(formattedTanggal); // Tanggal Konsultasi
                jLabel21.setText(sesi1.getWaktuKonsul()); // Waktu Konsultasi
                jLabel20.setText("Konsultasi " + sesi1.getTempat()); // Tempat
                if(tanggalKonsultasi.isBefore(LocalDate.now())){
                    jButton12.setVisible(false);
                    jLabel7.setText("Sudah Berakhir");
                }else{
                    jLabel7.setText("Akan Berlangsung");
                 
                }
                
                jPanel1.setVisible(true);
            }
            if(daftar.size()>=2){
                DataDaftarSesi sesi2 = daftar.get(1);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                // Konversi string tanggalKonsul menjadi LocalDate
                LocalDate tanggalKonsultasi = LocalDate.parse(sesi2.getTanggalKonsul(), formatter);
                DateTimeFormatter formatterWithDay = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
                String formattedTanggal = tanggalKonsultasi.format(formatterWithDay);
                
                jLabel15.setText(sesi2.getNama()); // Nama
                jLabel16.setText(sesi2.getSpesialisasi()); // Spesialisasi
                jLabel18.setText(formattedTanggal); // Tanggal Konsultasi
                jLabel22.setText(sesi2.getWaktuKonsul()); // Waktu Konsultasi
                jLabel17.setText("Konsultasi " + sesi2.getTempat()); // Tempat

                if(tanggalKonsultasi.isBefore(LocalDate.now())){
                    jButton14.setVisible(false);
                    jLabel11.setText("Sudah Berakhir");
                }else{
                    jLabel11.setText("Akan Berlangsung");
                    
                }
                jPanel3.setVisible(true);
            }
            if(daftar.size()>=3){
                DataDaftarSesi sesi3 = daftar.get(2);
                
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                // Konversi string tanggalKonsul menjadi LocalDate
                LocalDate tanggalKonsultasi = LocalDate.parse(sesi3.getTanggalKonsul(), formatter);
                DateTimeFormatter formatterWithDay = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
                String formattedTanggal = tanggalKonsultasi.format(formatterWithDay);
                
                jLabel34.setText(sesi3.getNama()); // Nama
                jLabel36.setText(sesi3.getSpesialisasi()); // Spesialisasi
                jLabel33.setText(formattedTanggal); // Tanggal Konsultasi
                jLabel37.setText(sesi3.getWaktuKonsul()); // Waktu Konsultasi
                jLabel32.setText("Konsultasi " + sesi3.getTempat()); // Tempat
                
                if(tanggalKonsultasi.isBefore(LocalDate.now())){
                    jButton15.setVisible(false);
                    jLabel35.setText("Sudah Berakhir");
                }else{        
                    jLabel35.setText("Akan Berlangsung");
                }                 
                    
                jPanel4.setVisible(true);
            
           
            }
            
        }else{
            //tampulan konsultan
            
            if(daftar.size()>=1){              
                DataDaftarSesi sesi1 = daftar.get(0);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                // Konversi string tanggalKonsul menjadi LocalDate
                LocalDate tanggalKonsultasi = LocalDate.parse(sesi1.getTanggalKonsul(), formatter);
                DateTimeFormatter formatterWithDay = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
                String formattedTanggal = tanggalKonsultasi.format(formatterWithDay);
                
                jLabel4.setText(formattedTanggal);
                jLabel13.setText(sesi1.getNama()); // Nama
                jLabel14.setText(sesi1.getUmur() + " Tahun"); // Umur
                jLabel19.setText(formattedTanggal); // Tanggal Konsultasi
                jLabel21.setText(sesi1.getWaktuKonsul()); // Waktu Konsultasi
                jLabel20.setText("Konsultasi " + sesi1.getTempat()); // Tempat
                if(tanggalKonsultasi.isBefore(LocalDate.now())){
                    jButton12.setVisible(false);
                    jLabel7.setText("Sudah Berakhir");
                }else{
                    jLabel7.setText("Akan Berlangsung");
                 
                }
                
                jPanel1.setVisible(true);
            }
            if(daftar.size()>=2){
                DataDaftarSesi sesi2 = daftar.get(1);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                // Konversi string tanggalKonsul menjadi LocalDate
                LocalDate tanggalKonsultasi = LocalDate.parse(sesi2.getTanggalKonsul(), formatter);
                DateTimeFormatter formatterWithDay = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
                String formattedTanggal = tanggalKonsultasi.format(formatterWithDay);
                
                jLabel15.setText(sesi2.getNama()); // Nama
                jLabel16.setText(sesi2.getUmur() + " Tahun"); // Umur
                jLabel18.setText(formattedTanggal); // Tanggal Konsultasi
                jLabel22.setText(sesi2.getWaktuKonsul()); // Waktu Konsultasi
                jLabel17.setText("Konsultasi " + sesi2.getTempat()); // Tempat

                if(tanggalKonsultasi.isBefore(LocalDate.now())){
                    jButton14.setVisible(false);
                    jLabel11.setText("Sudah Berakhir");
                }else{
                    jLabel11.setText("Akan Berlangsung");
                    
                }
                jPanel3.setVisible(true);
            }
            if(daftar.size()>=3){
                DataDaftarSesi sesi3 = daftar.get(2);
                
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                // Konversi string tanggalKonsul menjadi LocalDate
                LocalDate tanggalKonsultasi = LocalDate.parse(sesi3.getTanggalKonsul(), formatter);
                DateTimeFormatter formatterWithDay = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
                String formattedTanggal = tanggalKonsultasi.format(formatterWithDay);
                
                jLabel34.setText(sesi3.getNama()); // Nama
                jLabel36.setText(sesi3.getUmur() + " Tahun"); // Umur
                jLabel33.setText(formattedTanggal); // Tanggal Konsultasi
                jLabel37.setText(sesi3.getWaktuKonsul()); // Waktu Konsultasi
                jLabel32.setText("Konsultasi " + sesi3.getTempat()); // Tempat
                
                if(tanggalKonsultasi.isBefore(LocalDate.now())){
                    jButton15.setVisible(false);
                    jLabel35.setText("Sudah Berakhir");
                }else{        
                    jLabel35.setText("Akan Berlangsung");
                }                 
                    
                jPanel4.setVisible(true);
            
           
            }
           
        }
         this.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rsi;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class EditArtikel extends javax.swing.JFrame {
    private String judulLama;
    private String idArtikel;
    /**
     * Creates new form ProsesUpArtikelGUI
     */
    public EditArtikel() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eJudulA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        eSubjudulA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ePenulisA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editAButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        eIsiA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 94));

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(111, 110, 110));
        jButton2.setText("Beranda");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(78, 15));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(111, 110, 110));
        jButton5.setText("Manajemen Konten");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setPreferredSize(new java.awt.Dimension(180, 15));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(111, 110, 110));
        jButton6.setText("Notifikasi");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setPreferredSize(new java.awt.Dimension(143, 15));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Foto user (3).png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Property 1=Default.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(80, 80, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(964, 964, 964)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jLabel1.setText("Judul*");

        eJudulA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eJudulAActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jLabel2.setText("Sub Judul*");

        eSubjudulA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eSubjudulAActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jLabel4.setText("Ditulis oleh*");

        ePenulisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ePenulisAActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jLabel5.setText("Isi Artikel*");

        jLabel6.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jLabel6.setText("Thumbnail/Foto Sampul*");

        jButton1.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jButton1.setText("thumbnail");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editAButton.setBackground(new java.awt.Color(64, 228, 231));
        editAButton.setFont(new java.awt.Font("Satoshi Variable", 1, 18)); // NOI18N
        editAButton.setForeground(new java.awt.Color(255, 255, 255));
        editAButton.setText("Simpan Perubahan");
        editAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAButtonActionPerformed(evt);
            }
        });

        eIsiA.setColumns(20);
        eIsiA.setLineWrap(true);
        eIsiA.setRows(5);
        jScrollPane1.setViewportView(eIsiA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(editAButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ePenulisA, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                            .addComponent(eSubjudulA)
                            .addComponent(eJudulA)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eJudulA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eSubjudulA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ePenulisA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(editAButton)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Aplikasi.beranda.tampilkan();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       Aplikasi.controllerManajemen.showAll(1);
       this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Aplikasi.dialogUI.showMessage("FITUR INI TIDAK KAMI PROSES");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void eJudulAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eJudulAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eJudulAActionPerformed

    private void ePenulisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ePenulisAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ePenulisAActionPerformed

    private void eSubjudulAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eSubjudulAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eSubjudulAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Aplikasi.addArticle.LoadThumbnail();
        //munculin thumnailnya pake logic kaya munculin file di hasil konsul
        Aplikasi.updateArtikel.showMessage("Thumbnail tidak dapat diubah");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAButtonActionPerformed
        // TODO add your handling code here:
        // Mengambil input dari UI
    String judul = eJudulA.getText();
    String subJudul = eSubjudulA.getText();
    String isiArtikel = eIsiA.getText();
    String diisiOleh = ePenulisA.getText();
    
 //thumbnail tidak dpt diubah   
    // Panggil metode simpanArtikelDB
    Aplikasi.updateArtikel.updateArtikelDB(getIdArtikel(), getJudulLama(), judul, subJudul, isiArtikel, diisiOleh);
    this.dispose();
    }//GEN-LAST:event_editAButtonActionPerformed

    public void tampilkan(String judul,String idArtikel){
        setJudulLama(judul);
        setIdArtikel(idArtikel);
        
        String query = "SELECT *"
                + "FROM FAMIFY.KONTEN_ARTIKEL WHERE ID_ARTIKEL = ?";
        
        try {
            Aplikasi.database.databaseConnection();
            Connection con = Aplikasi.database.getCon();            
            PreparedStatement pstmt = con.prepareStatement(query); 
            pstmt.setString(1, idArtikel);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                eJudulA.setText(judul);
                eSubjudulA.setText(rs.getString("SUBJUDUL"));
                ePenulisA.setText(rs.getString("PENULIS"));
                eIsiA.setText(rs.getString("ISI_ARTIKEL"));
            }
        }catch (Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
        }
        if(Aplikasi.akun.getPerson().equals("klien")){
            jButton5.setText("Reservasi");            
        }else if(Aplikasi.akun.getPerson().equals("administrator")){
            jButton6.setText("Notifikasi");
            jButton5.setText("Manajemen Konten");                
        }
        this.setVisible(true);        
    }
    
    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getjButton3() {
        return editAButton;
    } 

    public JTextArea getjTextArea1() {
        return eIsiA;
    }

    public JTextField getjTextField1() {
        return eJudulA;
    }

    public JTextField getjTextField2() {
        return eSubjudulA;
    }

    public JTextField getjTextField3() {
        return ePenulisA;
    }

    public String getJudulLama() {
        return judulLama;
    }

    public void setJudulLama(String judulLama) {
        this.judulLama = judulLama;
    }
    
    public String getIdArtikel() {
        return idArtikel;
    }

    public void setIdArtikel(String idArtikel) {
        this.idArtikel = idArtikel;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea eIsiA;
    private javax.swing.JTextField eJudulA;
    private javax.swing.JTextField ePenulisA;
    private javax.swing.JTextField eSubjudulA;
    private javax.swing.JButton editAButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rsi;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class EditVideo extends javax.swing.JFrame {

    private String judulLama;
    private String idVideo;
    /**
     * Creates new form ProsesUpVideoUI
     */
    
    
    public EditVideo() {
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

        jPanel3 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eJudulV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ePengunggahV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        eThumbnailV = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        editVButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        eDescV = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 94));

        jButton11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton11.setForeground(new java.awt.Color(111, 110, 110));
        jButton11.setText("Beranda");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setPreferredSize(new java.awt.Dimension(78, 15));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton12.setForeground(new java.awt.Color(111, 110, 110));
        jButton12.setText("Manajemen Konten");
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setPreferredSize(new java.awt.Dimension(180, 15));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jButton13.setForeground(new java.awt.Color(111, 110, 110));
        jButton13.setText("Notifikasi");
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setPreferredSize(new java.awt.Dimension(143, 15));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Foto user (3).png"))); // NOI18N
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Property 1=Default.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(964, 964, 964)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 90, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jLabel1.setText("Judul*");

        eJudulV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eJudulVActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jLabel5.setText("Deskripsi*");

        jLabel6.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jLabel6.setText("Pengunggah*");

        jLabel7.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jLabel7.setText("Thumbnail/Foto Sampul*");

        eThumbnailV.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        eThumbnailV.setText("+ Unggah Thumbnail");
        eThumbnailV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eThumbnailVActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jLabel8.setText("Video*");

        jButton17.setFont(new java.awt.Font("Satoshi Variable", 1, 14)); // NOI18N
        jButton17.setText("+Unggah Video");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        editVButton.setBackground(new java.awt.Color(57, 206, 209));
        editVButton.setFont(new java.awt.Font("Satoshi Variable", 1, 18)); // NOI18N
        editVButton.setForeground(new java.awt.Color(255, 255, 255));
        editVButton.setText("Simpan Perubahan");
        editVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVButtonActionPerformed(evt);
            }
        });

        eDescV.setColumns(20);
        eDescV.setRows(5);
        jScrollPane1.setViewportView(eDescV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eThumbnailV, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editVButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eJudulV)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ePengunggahV, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eJudulV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ePengunggahV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eThumbnailV)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editVButton)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Aplikasi.beranda.tampilkan();
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Aplikasi.controllerManajemen.showAll(1);   
        this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        Aplikasi.dialogUI.showMessage("FITUR INI TIDAK KAMI PROSES");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void eJudulVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eJudulVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eJudulVActionPerformed

    private void editVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVButtonActionPerformed
        // Mengambil input dari UI
        String judul = eJudulV.getText();
        String deskripsi = eDescV.getText();      
        String diisiOleh = ePengunggahV.getText();
        
        String thumbnail = Aplikasi.updateVideo.getPathThumbnail();
        if(thumbnail.isEmpty()){
            Aplikasi.updateVideo.updateVideoDB(getIdVideo(), getJudulLama(), judul, deskripsi, diisiOleh, null);
            this.dispose();
        }else{
            Aplikasi.updateVideo.updateVideoDB(getIdVideo(), getJudulLama(), judul, deskripsi, diisiOleh, thumbnail);
            this.dispose();
        }        
    }//GEN-LAST:event_editVButtonActionPerformed

    private void eThumbnailVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eThumbnailVActionPerformed
        // TODO add your handling code here:
        Aplikasi.updateVideo.loadThumbnail();
    }//GEN-LAST:event_eThumbnailVActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        Aplikasi.updateVideo.showMessage("Video tidak bisa diubah");
    }//GEN-LAST:event_jButton17ActionPerformed
                                  
    public void tampilkan(String judul,String idVideo){
        setJudulLama(judul);
        setIdVideo(idVideo);
        eThumbnailV.setText("+ Unggah Thumbnail");
        String query = "SELECT *"
                + "FROM FAMIFY.KONTEN_VIDEO WHERE ID_VIDEO = ?";
        
        try {
            Aplikasi.database.databaseConnection();
            Connection con = Aplikasi.database.getCon();            
            PreparedStatement pstmt = con.prepareStatement(query); 
            pstmt.setString(1, idVideo);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                eJudulV.setText(judul);
                eDescV.setText(rs.getString("DESKRIPSI"));
                ePengunggahV.setText(rs.getString("PENGUNGGAH"));                
            }
        }catch (Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
        }       
        this.setVisible(true);    
    }

    public JButton getjButton18() {
        return editVButton;
    }

    public JButton getjButton16() {
        return eThumbnailV;
    }

    public JButton getjButton17() {
        return jButton17;
    }

    public JTextField getjTextField1() {
        return eJudulV;
    }
    
    public JTextField getjTextField3() {
        return ePengunggahV;
    }

    public String getJudulLama() {
        return judulLama;
    }

    public String getIdVideo() {
        return idVideo;
    }

    public void setJudulLama(String judulLama) {
        this.judulLama = judulLama;
    }

    public void setIdVideo(String idVideo) {
        this.idVideo = idVideo;
    }
    
    

    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea eDescV;
    private javax.swing.JTextField eJudulV;
    private javax.swing.JTextField ePengunggahV;
    private javax.swing.JButton eThumbnailV;
    private javax.swing.JButton editVButton;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
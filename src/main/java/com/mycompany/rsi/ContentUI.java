/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ContentUI extends javax.swing.JFrame {

    /**
     * Creates new form sesiKonsultasiUI
     */
    public ContentUI() {
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

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1446, 3000));
        setPreferredSize(new java.awt.Dimension(1440, 3000));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Property 1=Default.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 17, -1, -1));

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
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
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
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 40, 110, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ellipse 44.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 12, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 3.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        jLabel1.setPreferredSize(new java.awt.Dimension(1440, 94));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(4, 63, 73));
        jScrollPane1.setForeground(new java.awt.Color(4, 63, 73));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setDoubleBuffered(true);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1451, 2627));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1439, 19670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(1439, 2143));
        jPanel1.setMinimumSize(new java.awt.Dimension(1439, 2143));
        jPanel1.setPreferredSize(new java.awt.Dimension(1439, 2143));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(111, 110, 110));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Kiat-kiat psikolog untuk membantu anak merasa aman dan terlindung");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Membangun Kesehatan Mental Bayi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(128, 128, 128));
        jLabel3.setText("Oleh");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(128, 128, 128));
        jLabel5.setText("DADANG ADMIN");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 128));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("30 Oktober 2024");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frame 1.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jScrollPane9.setBorder(null);
        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setToolTipText("");
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea8.setForeground(new java.awt.Color(111, 110, 110));
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(6);
        jTextArea8.setTabSize(10);
        jTextArea8.setText("Mengasuh bayi yang baru lahir adalah tugas yang berat dan orang tua akan merasakan berbagai macam emosi. Bahagia bercampur dengan frustrasi, \nkeletihan, dan kecemasan. Emosi yang bercampur-aduk ini sama sekali tak perlu ditakuti.\n\nLalu, kapan sebaiknya orang tua mulai memikirkan tentang kesehatan mental bayinya? Dan bagaimana orang tua dapat membangun kesehatan mental\ndi dalam keluarga? Simak jawaban pertanyaan-pertanyaan ini dan beberapa pertanyaan lain dari Dr. Lisa Damour, psikolog dan pakar perkembangan \nanak.\n\nSebentar lagi saya akan menjadi orang tua. Emosi dan stres seperti apa yang perlu diantisipasi? Menjadi orang tua baru adalah transisi kehidupan yang\nbesar. Kelahiran seorang anak akan mengubah keseharian kita. Setiap aspek kehidupan akan berbeda.Salah satu hal yang diketahui tentang stres adalah\nstres terjadi setiap kali kita harus menyesuaikan diri dengan kondisi baru. Kehadiran seorang bayi adalah contoh kondisi baru. Dengan demikian, stres \nakan muncul. Tapi, stres tidak berarti ada sesuatu yang salah. Artinya, orang tua sedang membiasakan diri dengan perannya yang baru. Peran ini pun \nakan makin mudah dijalani seiring dengan waktu. \n\nPada usia berapa saya perlu mulai mempertimbangkan kesehatan mental anak?\nKesehatan mental anak perlu diperhatikan begitu ia lahir. Sejak hari pertamanya di dunia, anak membutuhkan orang tua untuk mendapatkan cinta, \nbimbingan, dan rasa aman. Saat orang tua memberikan interaksi yang hangat dan lembut, membantu anak merasa terlindung, menghibur saat anak \nsedih dan membantu mereka menghadapi dunia, maka saat itu pula orang tua sedang membangun landasan kesehatan mental anak untuk \nkehidupannya kelak.\n\nBagaimana stres berdampak terhadap perkembangan emosional anak? \nRespons stres pada bayi aktif ketika bayi merasa takut atau khawatir dilupakan, atau ada kebutuhannya yang tidak terpenuhi. Tugas orang tua adalah\nmembantu bayi untuk menenangkan respons tersebut. Setelah tenang, maka situasi akan kembali seperti semula  dan bayi akan belajar bahwa dunia \nadalah tempat yang aman dan dapat diandalkan. Pengalaman belajar ini tidak dialami semua bayi. Ada bayi yang berada pada situasi stres dan tidak \nmendapatkan dukungan emosional yang diperlukannya agar tenang kembali. Situasi  ketika anak mengalami stres, tetapi tidak memiliki orang dewasa\nyang menyayangi dan dapat membantu menghibur mereka dapat menjadi sumber kesulitan emosional kelak.\n\nBagaimana saya dapat belajar menunjukkan kasih sayang dan cinta kepada anak jika saya sendiri tidak mengalaminya saat kecil?\nMenjadi orang tua adalah hal yang sulit. Semua orang pun belajar menjadi orang tua. Dan kita bisa menjadi orang tua yang baik asalkan kita punya \ntekad yang kuat. Ada begitu banyak hal yang harus diperhatikan saat menjadi orang tua baru. Berikut adalah beberapa hal yang dapat menciptakan \nperbedaan besar dan akan membantu seseorang menjadi sosok orang tua yang mungkin tidak dimilikinya saat ia sendiri kecil:  Berikan perhatian \nkepada bayi, perhatikan kebutuhan mereka, penuhi kebutuhannya, dan pastikan orang tua senantiasa hadir dengan kasih sayang. Inilah yang \ndibutuhkan seorang bayi untuk dapat menapaki kehidupan yang luar biasa nantinya.\n\n");
        jTextArea8.setBorder(null);
        jScrollPane9.setViewportView(jTextArea8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(518, 518, 518)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, -1, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Aplikasi.beranda.tampilkan();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(Aplikasi.akun.getPerson().contains("k")){
            this.dispose();
            Aplikasi.controllerDaftarSesi.load();
        }else{
           
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(Aplikasi.akun.getPerson().contains("k")){
            Aplikasi.dialogUI.showMessage("FITUR INI TIDAK KAMI PROSES");
        }else{
            //manajemen konten
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Aplikasi.dialogUI.showMessage("FITUR INI TIDAK KAMI PROSES");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void tampilkan(String judul){
        String query = "SELECT SUBJUDUL, ISI_ARTIKEL, PENULIS, TANGGAL_PUBLIKASI, THUMBNAIL "
                + "FROM FAMIFY.KONTEN_ARTIKEL WHERE JUDUL_ARTIKEL = ?";
        
        try {
            Aplikasi.database.databaseConnection();
            Connection con = Aplikasi.database.getCon();            
            PreparedStatement pstmt = con.prepareStatement(query); 
            pstmt.setString(1, judul);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                jLabel6.setText(judul);
                jLabel4.setText(rs.getString("SUBJUDUL"));
                jLabel5.setText(rs.getString("PENULIS")+" admin");
                jLabel7.setText(rs.getString("TANGGAL_PUBLIKASI"));
                jTextArea8.setText(rs.getString("ISI_ARTIKEL"));
            }
        }catch (Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
        }
        this.setVisible(true);        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea8;
    // End of variables declaration//GEN-END:variables
}

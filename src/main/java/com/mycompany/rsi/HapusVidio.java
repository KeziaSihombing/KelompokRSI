/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class HapusVidio {
     public void hapusVideoDariDB(String judulVideo) {
        try {
            // Koneksi ke database
            Aplikasi.database.databaseConnection();
            Connection con = Aplikasi.database.getCon();
           
            String queryCari = "DELETE FROM FAMIFY.KONTEN_VIDEO WHERE JUDUL_VIDEO = ?";
            PreparedStatement pstmtCari = con.prepareStatement(queryCari);
            pstmtCari.setString(1, judulVideo);

            int rs = pstmtCari.executeUpdate();

            if (rs != 0) {
                Aplikasi.dialogUI.showMessage("Video berhasil dihapus dari database.");

                File directory = new File("src/main/resources/images");
                String filePattern = "Thumbnail_db_" + judulVideo + ".png";
                File[] files = directory.listFiles();

                if (files != null) {
                    for (File file : files) {
                        if (file.getName().contains(filePattern)) {
                           file.delete();
                        }
                    }
                }
                
                File directory2 = new File("src/main/resources/video");
                filePattern = "Video_db"+ judulVideo + ".mp4";
                files = directory2.listFiles();

                if (files != null) {
                    for (File file : files) {
                        if (file.getName().contains(filePattern)) {
                           file.delete();
                        }
                    }
                }
                
                
                
//                Aplikasi.manage.getjButton13();
                
//                if (Aplikasi.manage instanceof ManajemenKontenUI) {
//                    ManajemenKontenUI ui = (ManajemenKontenUI) Aplikasi.manage;
//                   // ui.removeArtikelFromUI(judulArtikel); 
//                }
            } else {
                Aplikasi.dialogUI.showMessage("Video tidak ditemukan dalam database.");
            }
        } catch (SQLException e) {
            Aplikasi.dialogUI.showMessage("Gagal menghapus video.");
        }
     }
}

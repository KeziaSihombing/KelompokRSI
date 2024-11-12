/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ASUS
 */
public class HapusArtikel {
    public void hapusArtikelDariDB(String judulArtikel) {
        try {
            // Koneksi ke database
            Aplikasi.database.databaseConnection();
            Connection con = Aplikasi.database.getCon();
           
            String queryCari = "DELETE FROM FAMIFY.KONTEN_ARTIKEL WHERE JUDUL_ARTIKEL = ?";
            PreparedStatement pstmtCari = con.prepareStatement(queryCari);
            pstmtCari.setString(1, judulArtikel);

            int rs = pstmtCari.executeUpdate();

            if (rs != 0) {
                Aplikasi.dialogUI.showMessage("Artikel berhasil dihapus dari database.");

                File directory = new File("src/main/resources/images");
                String filePattern = "Thumbnail_db_" + judulArtikel + ".png";
                File[] files = directory.listFiles();

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
                Aplikasi.dialogUI.showMessage("Artikel tidak ditemukan dalam database.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Aplikasi.dialogUI.showMessage("Gagal menghapus artikel.");
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFileChooser;
/**
 *
 * @author ASUS
 */
public class ProsesNulisArtikel {
    private String pathThumbnail;
    
    public void LoadThumbnail(){
        JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            File selectedFile = fc.getSelectedFile(); // Mengambil file yang dipilih

            if (selectedFile != null && selectedFile.getAbsolutePath().endsWith(".png")) {
                setPathThumbnail(selectedFile.getAbsolutePath());
                //ini masih error, help puh sepuh
                //Aplikasi.upArtikel.getjButton1().setText("+Unggah Thumbnail");
            } else {
                Aplikasi.dialogUI.showMessage("Error: Format file tidak didukung. Harus PNG.");
            }
    }
    
    public void simpanArtikelDB(String judul, String subJudul, String isiArtikel, String diisiOleh, File thumbnailFile) {
        Connection con = null;
        PreparedStatement pstmtSimpanArtikel = null;
        
        try {
            // Validasi input
            if (judul.isEmpty() || subJudul.isEmpty() || diisiOleh.isEmpty() || isiArtikel.isEmpty() || thumbnailFile == null) {
                Aplikasi.dialogUI.showMessage("Semua kolom harus diisi.");
                return;
            }

            // Koneksi ke database
            Aplikasi.database.databaseConnection();
            con = Aplikasi.database.getCon();

            // Query untuk menyimpan artikel ke database
            String querySimpan = "INSERT INTO FAMIFY.KONTEN_ARTIKEL (JUDUL_ARTIKEL, SUBJUDUL, ISI_ARTIKEL, PENULIS, THUMBNAIL) VALUES (?, ?, ?, ?, ?)";
            pstmtSimpanArtikel = con.prepareStatement(querySimpan);

            pstmtSimpanArtikel.setString(1, judul);
            pstmtSimpanArtikel.setString(2, subJudul);
            pstmtSimpanArtikel.setString(3, isiArtikel);
            pstmtSimpanArtikel.setString(4, diisiOleh);

            // Menyimpan thumbnail sebagai byte array
            FileInputStream fis = new FileInputStream(thumbnailFile);
            pstmtSimpanArtikel.setBinaryStream(5, fis, (int) thumbnailFile.length());

            // Eksekusi penyimpanan
            int row = pstmtSimpanArtikel.executeUpdate();
            fis.close();

            if (row > 0) {
                Aplikasi.dialogUI.showMessage("Artikel berhasil diunggah.");
                // Reset form setelah penyimpanan
                // disini juga keknya ada yang janggal cuman gw bego salah dimananya
              //Aplikasi.upArtikel.resetForm();
            } else {
                Aplikasi.dialogUI.showMessage("Gagal mengunggah artikel.");
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            Aplikasi.dialogUI.showMessage("SQL Error: " + sqlEx.getMessage());
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
            Aplikasi.dialogUI.showMessage("Error membaca file: " + ioEx.getMessage());
        } finally {
            // Tutup resources
            try {
                if (pstmtSimpanArtikel != null) pstmtSimpanArtikel.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public String getPathThumbnail() {
        return pathThumbnail;
    }

    public void setPathThumbnail(String pathThumbnail) {
        this.pathThumbnail = pathThumbnail;
    }
    
    
}

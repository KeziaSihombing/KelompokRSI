/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFileChooser;

/**
 *
 * @author HP
 */
public class EditArtikelController {
    private String pathThumbnail;
    
    public void LoadThumbnail(){
        JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            File selectedFile = fc.getSelectedFile(); // Mengambil file yang dipilih

            if (selectedFile != null && selectedFile.getAbsolutePath().endsWith(".png")) {
                 setPathThumbnail(selectedFile.getAbsolutePath());                
                 Aplikasi.upArtikel.getjButton1().setText("Thumnail Artikel.png");
            } else {
                Aplikasi.dialogUI.showMessage("Error: Format file tidak didukung. Harus PNG.");
            }
    }
    
    public void updateArtikelDB(String judul, String subJudul, String isiArtikel, String diisiOleh, File thumbnailFile) {
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

        // Query untuk menyimpan artikel ke database dengan TANGGAL_PUBLIKASI
        String querySimpan = "UPDATE FAMIFY.KONTEN_ARTIKEL SET JUDUL_ARTIKEL = ?, SUBJUDUL = ?, ISI_ARTIKEL = ?, PENULIS = ?, TANGGAL_PUBLIKASI = ?, THUMBNAIL = ? WHERE ID_ARTIKEL = ?";
        pstmtSimpanArtikel = con.prepareStatement(querySimpan);

        // Set nilai kolom sesuai dengan parameter
        pstmtSimpanArtikel.setString(1, judul);
        pstmtSimpanArtikel.setString(2, subJudul);
        pstmtSimpanArtikel.setString(3, isiArtikel);
        pstmtSimpanArtikel.setString(4, diisiOleh);

        // Set tanggal publikasi dengan tanggal saat ini
        Date currentDate = new Date(System.currentTimeMillis());
        pstmtSimpanArtikel.setDate(5, currentDate);

        // Simpan thumbnail sebagai byte array
        FileInputStream fis = new FileInputStream(thumbnailFile);
        pstmtSimpanArtikel.setBinaryStream(6, fis, (int) thumbnailFile.length());

        // Eksekusi penyimpanan
        int row = pstmtSimpanArtikel.executeUpdate();
        fis.close();

        if (row > 0) {
            Aplikasi.dialogUI.showMessage("Perubahan berhasil disimpan.");
            
            File pathTarget = new File("src/main/resources/images/Thumbnail_db_" + judul + ".png");
            Files.copy(thumbnailFile.toPath(), pathTarget.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } else {
            Aplikasi.dialogUI.showMessage("Gagal menyimpan perubahan.");
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

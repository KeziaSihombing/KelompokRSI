/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import java.sql.Date;
/**
 *
 * @author ASUS
 */
public class ProsesNulisArtikel {
    private String pathThumbnail;
    
    public void showUpArticle(){
        Aplikasi.upArtikel.tampilkan();
    }
    
    public void LoadThumbnail(){
        JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            File selectedFile = fc.getSelectedFile(); // Mengambil file yang dipilih

            if (selectedFile != null && selectedFile.getAbsolutePath().endsWith(".png")) {
                 setPathThumbnail(selectedFile.getAbsolutePath());                
                 Aplikasi.upArtikel.getjButton1().setText("Thumbnail Artikel.png");
            } else if(selectedFile == null) {
                
            }else{
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

        // Query untuk menyimpan artikel ke database dengan TANGGAL_PUBLIKASI
        String querySimpan = "INSERT INTO FAMIFY.KONTEN_ARTIKEL (JUDUL_ARTIKEL, SUBJUDUL, ISI_ARTIKEL, PENULIS, TANGGAL_PUBLIKASI, THUMBNAIL) VALUES (?, ?, ?, ?, ?, ?)";
        pstmtSimpanArtikel = con.prepareStatement(querySimpan);

        // Set nilai kolom sesuai dengan parameter
        pstmtSimpanArtikel.setString(1, judul);
        pstmtSimpanArtikel.setString(2, subJudul);
        pstmtSimpanArtikel.setString(3, isiArtikel);
        pstmtSimpanArtikel.setString(4, diisiOleh);

        // Set tanggal publikasi dengan tanggal saat ini
        Date currentDate = new Date(System.currentTimeMillis());
        pstmtSimpanArtikel.setDate(5, currentDate);
        
       try (FileInputStream fis = new FileInputStream(thumbnailFile)) {
            pstmtSimpanArtikel.setBinaryStream(6, fis, thumbnailFile.length());
            
            //Eksekusi penyimpanan 
                int row = pstmtSimpanArtikel.executeUpdate();
       

        if (row > 0) {
            Aplikasi.dialogUI.showMessage("Artikel berhasil diunggah.");
            Aplikasi.controllerManajemen.showAll(1);
            Aplikasi.upArtikel.dispose();
            
            File pathTarget = new File("src/main/resources/images/Thumbnail_db_" + judul + ".png"); 
            
            try(FileChannel sourceChannel = new FileInputStream((thumbnailFile.toPath().toFile())).getChannel();
                FileChannel targetChannel = new FileOutputStream((pathTarget.toPath().toFile())).getChannel();){
                    sourceChannel.transferTo(0, sourceChannel.size(), targetChannel);
            }
           
        } else {
            Aplikasi.dialogUI.showMessage("Gagal mengunggah artikel.");            
            Aplikasi.upArtikel.tampilkan();
            
        }  
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

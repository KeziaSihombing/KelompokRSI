/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author ASUS
 */
public class EditVideoController {
    private String pathThumbnail;
    
    public void updateVideoDB(String idArtikel, String judulLama, String judul, String deskripsi, String diisiOleh, String thumbnail) {
    Connection con = null;
    PreparedStatement pstmtSimpanArtikel = null;

    try {
        // Validasi input
        if (judul.isEmpty() || deskripsi.isEmpty() || diisiOleh.isEmpty()) {
            Aplikasi.dialogUI.showMessage("Semua kolom harus diisi.");
            return;
        }

        // Koneksi ke database
        Aplikasi.database.databaseConnection();
        con = Aplikasi.database.getCon();

        // Query untuk menyimpan artikel ke database dengan TANGGAL_PUBLIKASI
        String querySimpan = "UPDATE FAMIFY.KONTEN_VIDEO SET JUDUL_VIDEO = ?, DESKRIPSI = ?, PENGUNGGAH = ? WHERE ID_VIDEO = ?";
        String querySimpan2 = "UPDATE FAMIFY.KONTEN_VIDEO SET JUDUL_VIDEO = ?, DESKRIPSI = ?, PENGUNGGAH = ?, THUMBNAIL = ? WHERE ID_VIDEO = ?";
        
        if(thumbnail != null){       
            pstmtSimpanArtikel = con.prepareStatement(querySimpan2);
            pstmtSimpanArtikel.setString(5, idArtikel);
            // Set nilai kolom sesuai dengan parameter
            pstmtSimpanArtikel.setString(1, judul);
            pstmtSimpanArtikel.setString(2, deskripsi);
            pstmtSimpanArtikel.setString(3, diisiOleh);
            
            File thumbnailFile = new File(thumbnail);
            try (FileInputStream fis = new FileInputStream(thumbnailFile)) {
            pstmtSimpanArtikel.setBinaryStream(4, fis, thumbnailFile.length());
            
            //Eksekusi penyimpanan 
                int row = pstmtSimpanArtikel.executeUpdate();
       

            if(row>0){
                Aplikasi.dialogUI.showMessage("Perubahan berhasil disimpan.");               
                
                File directory = new File("src/main/resources/images");
                String filePattern = "Thumbnail_db_" + judulLama + ".png";
                File[] files = directory.listFiles();

                if (files != null) {
                    for (File file : files) {
                        if (file.getName().contains(filePattern)) {
                           file.delete();
                        }
                    }
                }
                
                File pathTarget = new File("src/main/resources/images/Thumbnail_db_" + judul + ".png"); 

                try(FileChannel sourceChannel = new FileInputStream((thumbnailFile.toPath().toFile())).getChannel();
                    FileChannel targetChannel = new FileOutputStream((pathTarget.toPath().toFile())).getChannel();){
                        sourceChannel.transferTo(0, sourceChannel.size(), targetChannel);
                }
                
                Aplikasi.controllerManajemen.showAll(1);               
            } else {
                Aplikasi.dialogUI.showMessage("Gagal menyimpan perubahan.");

            }  
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EditVideoController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EditVideoController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }else{
            pstmtSimpanArtikel = con.prepareStatement(querySimpan);
            pstmtSimpanArtikel.setString(4, idArtikel);
            // Set nilai kolom sesuai dengan parameter
            pstmtSimpanArtikel.setString(1, judul);
            pstmtSimpanArtikel.setString(2, deskripsi);
            pstmtSimpanArtikel.setString(3, diisiOleh);
            
            //Eksekusi penyimpanan 
                int row = pstmtSimpanArtikel.executeUpdate();
            if(row>0){
                Aplikasi.dialogUI.showMessage("Perubahan berhasil disimpan.");  
                Aplikasi.controllerManajemen.showAll(1);                
            } else {
                Aplikasi.dialogUI.showMessage("Gagal menyimpan perubahan.");

            }  
        }
    } catch (SQLException sqlEx) {
        sqlEx.printStackTrace();
        Aplikasi.dialogUI.showMessage("SQL Error: " + sqlEx.getMessage());
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
    
    public void showVideoEdit(String judul,String idVideo){        
        Aplikasi.editVideo.tampilkan(judul, idVideo);
    }
    
    public void showMessage(String message){
        Aplikasi.dialogUI.showMessage(message);
    }

    public String getPathThumbnail() {
        return pathThumbnail;
    }

    public void setPathThumbnail(String pathThumbnail) {
        this.pathThumbnail = pathThumbnail;
    }
    
    public void loadThumbnail(){
        JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            File selectedFile = fc.getSelectedFile(); // Mengambil file yang dipilih

            if (selectedFile != null && selectedFile.getAbsolutePath().endsWith(".png")) {
                 setPathThumbnail(selectedFile.getAbsolutePath());                
                 Aplikasi.editVideo.getjButton16().setText("Thumbnail Video.png");
            } else if(selectedFile == null) {
                
            }else{
                showMessage("Error: Format file tidak didukung. Harus PNG.");
            }
    }
}

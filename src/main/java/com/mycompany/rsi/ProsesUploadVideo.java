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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author ASUS
 */
public class ProsesUploadVideo {
    private String videoPath;
    private String thumbnailPath;
    
    public void showUpVideo(){
        Aplikasi.upVideo.tampilkan();
    } 
    
    public void loadThumbnail() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File selectedFile = fc.getSelectedFile();

        if (selectedFile != null && (selectedFile.getAbsolutePath().endsWith(".png"))) {
            setThumbnailPath(selectedFile.getAbsolutePath());
            Aplikasi.upVideo.getjButton16().setText("Thumbnail Tersimpan");
        } else {
            Aplikasi.dialogUI.showMessage("Error: Format file tidak didukung. Harus PNG.");
        }
    }
    
    public void loadVideo() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File selectedFile = fc.getSelectedFile();

        if (selectedFile != null && selectedFile.getAbsolutePath().endsWith(".mp4")) {
            setVideoPath(selectedFile.getAbsolutePath());
            Aplikasi.upVideo.getjButton17().setText("Video Tersimpan");
        } else {
            Aplikasi.dialogUI.showMessage("Error: Format file tidak didukung. Harus MP4.");
        }
    }
    
   public void simpanVideoDB(File videoFile, File thumbnailFile, String judul, String deskripsi, String pengunggah) {
    Connection con = null;
    PreparedStatement pstmtSimpan = null;

    try {
        // Validasi input
        if (judul.isEmpty() || deskripsi.isEmpty() || pengunggah.isEmpty()) {
            Aplikasi.dialogUI.showMessage("Semua kolom harus diisi.");
            return;
        }
        // Validasi file
        if (videoFile == null || !videoFile.exists() || !videoFile.canRead()) {
            Aplikasi.dialogUI.showMessage("File video tidak valid.");
            return;
        }
        if (thumbnailFile == null || !thumbnailFile.exists() || !thumbnailFile.canRead()) {
            Aplikasi.dialogUI.showMessage("File thumbnail tidak valid.");
            return;
        }

        // Koneksi ke database
        Aplikasi.database.databaseConnection();
        con = Aplikasi.database.getCon();

        // Query untuk menyimpan konten video ke tabel KONTEN_VIDEO
        String querySimpan = "INSERT INTO FAMIFY.KONTEN_VIDEO (JUDUL_VIDEO, DESKRIPSI, PENGUNGGAH, VIDEO, THUMBNAIL, TANGGAL_PUBLIKASI) VALUES (?, ?, ?, ?, ?, ?)";
        pstmtSimpan = con.prepareStatement(querySimpan);

        // Baca file video dan thumbnail
        FileInputStream videoFis = new FileInputStream(videoFile);
        FileInputStream thumbnailFis = new FileInputStream(thumbnailFile);

        // Atur parameter ke query
        pstmtSimpan.setString(1, judul);
        pstmtSimpan.setString(2, deskripsi);
        pstmtSimpan.setString(3, pengunggah);
        pstmtSimpan.setBinaryStream(4, videoFis, videoFile.length());
        pstmtSimpan.setBinaryStream(5, thumbnailFis, thumbnailFile.length());

        // Set tanggal publikasi sebagai tanggal hari ini
        Date tanggalPublikasi = new Date(Calendar.getInstance().getTimeInMillis());
        pstmtSimpan.setDate(6, tanggalPublikasi);

        // Eksekusi penyimpanan
        int row = pstmtSimpan.executeUpdate();
        videoFis.close();
        thumbnailFis.close();

        if (row > 0) {
            Aplikasi.dialogUI.showMessage("Konten berhasil disimpan.");
            // Reset UI setelah menyimpan, jika diperlukan
            Aplikasi.upVideo.getjButton16().setText("Konten Tersimpan");
            Aplikasi.upVideo.getjButton17().setText("Unggah Konten Baru");
        } else {
            Aplikasi.dialogUI.showMessage("Gagal menyimpan konten.");
        }

    } catch (SQLException sqlEx) {
        sqlEx.printStackTrace();
        Aplikasi.dialogUI.showMessage("SQL Error: " + sqlEx.getMessage());
    } catch (IOException ioEx) {
        ioEx.printStackTrace();
        Aplikasi.dialogUI.showMessage("Error membaca file: " + ioEx.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
        Aplikasi.dialogUI.showMessage("Gagal menyimpan konten: " + e.getMessage());
    } finally {
        try {
            if (pstmtSimpan != null) pstmtSimpan.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath;
    }
}

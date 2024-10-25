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

/**
 *
 * @author ASUS
 */
public class ProsesUnggahHasil {
    
    public void Load(){
        JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            File selectedFile = fc.getSelectedFile(); // Mengambil file yang dipilih

            if (selectedFile != null && selectedFile.getAbsolutePath().endsWith(".pdf")) {
                Aplikasi.upHasil.getjButton1().setText(selectedFile.getAbsolutePath());
            } else {
                Aplikasi.dialogUI.showMessage("Error: Format file tidak didukung. Harus PDF.");
            }
    }
    
    public void simpanDB(File file) {
    Connection con = null;
    PreparedStatement pstmtCekKlien = null;
    PreparedStatement pstmtCari = null;
    PreparedStatement pstmtSimpan = null;
    ResultSet rsCek = null;
    ResultSet rs = null;

    try {
        // Periksa apakah file valid
        if (file == null || !file.exists() || !file.canRead()) {
            Aplikasi.dialogUI.showMessage("File hasil konsultasi tidak valid.");
            return;
        }

        // Ambil data yang diperlukan
        String filePath = Aplikasi.upHasil.getjButton1().getText(); // Path file hasil konsultasi
        String namaKlien = Aplikasi.upHasil.getjLabel2().getText(); // Nama klien dari label

        // Koneksi ke database
        Aplikasi.database.databaseConnection();
        con = Aplikasi.database.getCon();

        // Cek apakah nama klien ada di tabel KLIEN
        String queryCekKlien = "SELECT * FROM FAMIFY.KLIEN WHERE NAMA_LENGKAP = ?";
        pstmtCekKlien = con.prepareStatement(queryCekKlien);
        pstmtCekKlien.setString(1, namaKlien);
        rsCek = pstmtCekKlien.executeQuery();

        if (!rsCek.next()) {
            Aplikasi.dialogUI.showMessage("Nama klien tidak ditemukan di database.");
            return;
        }

        // Ambil ID_KLIEN
        int idKlien = rsCek.getInt("ID_KLIEN");

        // Ambil ID_RESERVASI berdasarkan ID_KLIEN
        String queryCari = "SELECT ID_RESERVASI FROM FAMIFY.RESERVASI WHERE ID_KLIEN = ?";
        pstmtCari = con.prepareStatement(queryCari);
        pstmtCari.setInt(1, idKlien);
        rs = pstmtCari.executeQuery();

        if (!rs.next()) {
            Aplikasi.dialogUI.showMessage("ID reservasi tidak ditemukan untuk klien ini.");
            return;
        }

        // Ambil ID_RESERVASI
        int idReservasi = rs.getInt("ID_RESERVASI");

        // Simpan hasil konsultasi ke tabel HASIL_KONSULTASI
        String querySimpan = "INSERT INTO FAMIFY.HASIL_KONSULTASI (ID_RESERVASI, CATATAN_KONSULTASI) VALUES (?, ?)";
        pstmtSimpan = con.prepareStatement(querySimpan);

        // Baca file menjadi byte array
        FileInputStream fis = new FileInputStream(file);
        pstmtSimpan.setInt(1, idReservasi);
        pstmtSimpan.setBinaryStream(2, fis, file.length());

        // Eksekusi pernyataan
        int row = pstmtSimpan.executeUpdate();
        fis.close();

        if (row > 0) {
            Aplikasi.dialogUI.showMessage("Hasil konsultasi berhasil disimpan.");
            // Reset UI setelah menyimpan
            Aplikasi.upHasil.getjButton1().setText(Aplikasi.upHasil.getjButton1().getText());
            Aplikasi.upHasil.getjButton3().setText("Hapus");
        } else {
            Aplikasi.dialogUI.showMessage("Gagal menyimpan hasil konsultasi.");
        }

    } catch (SQLException sqlEx) {
        sqlEx.printStackTrace();
        Aplikasi.dialogUI.showMessage("SQL Error: " + sqlEx.getMessage());
    } catch (IOException ioEx) {
        ioEx.printStackTrace();
        Aplikasi.dialogUI.showMessage("Error membaca file: " + ioEx.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
        Aplikasi.dialogUI.showMessage("Gagal menyimpan hasil konsultasi: " + e.getMessage());
    } finally {
        // Tutup resources
        try {
            if (rs != null) rs.close();
            if (rsCek != null) rsCek.close();
            if (pstmtSimpan != null) pstmtSimpan.close();
            if (pstmtCari != null) pstmtCari.close();
            if (pstmtCekKlien != null) pstmtCekKlien.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

}

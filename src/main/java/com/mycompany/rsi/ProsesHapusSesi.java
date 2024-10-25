/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class ProsesHapusSesi {
    public void hapusdariDB() {
    try {
        String filePath = Aplikasi.upHasil.getjButton1().getText(); // Mengambil nama file dari jButton1
        String namaKlien = Aplikasi.upHasil.getjLabel2().getText();

        // Koneksi ke database
        Aplikasi.database.databaseConnection();
        Connection con = Aplikasi.database.getCon();

        // Ambil ID_HASIL yang sesuai dengan klien berdasarkan nama file
        String queryCari = "SELECT ID_HASIL FROM FAMIFY.HASIL_KONSULTASI H " +
                           "INNER JOIN FAMIFY.RESERVASI R ON H.ID_RESERVASI = R.ID_RESERVASI " +
                           "INNER JOIN FAMIFY.KLIEN K ON R.ID_KLIEN = K.ID_KLIEN " +
                           "WHERE K.NAMA_LENGKAP = ? AND H.CATATAN_KONSULTASI = ?";
        PreparedStatement pstmtCari = con.prepareStatement(queryCari);
        pstmtCari.setString(1, namaKlien);
        pstmtCari.setString(2, filePath); // Menggunakan filePath untuk mencari ID_HASIL
        ResultSet rs = pstmtCari.executeQuery();

        if (rs.next()) {
            int idHasil = rs.getInt("ID_HASIL");

            // Eksekusi DELETE statement
            String queryHapus = "DELETE FROM FAMIFY.HASIL_KONSULTASI WHERE ID_HASIL = ?";
            PreparedStatement pstmtHapus = con.prepareStatement(queryHapus);
            pstmtHapus.setInt(1, idHasil);
            int row = pstmtHapus.executeUpdate();

            if (row > 0) {
                Aplikasi.dialogUI.showMessage("File hasil konsultasi berhasil dihapus");
                Aplikasi.upHasil.getjButton1().setText("+ Unggah Hasil Konsultasi"); // Reset jButton1
                Aplikasi.upHasil.getjButton3().setText("Simpan"); // Kembali ke tombol "Simpan"
            } else {
                Aplikasi.dialogUI.showMessage("File hasil konsultasi tidak ditemukan");
            }

            pstmtHapus.close();
        } else {
            Aplikasi.dialogUI.showMessage("ID hasil konsultasi tidak ditemukan untuk klien ini");
        }

        // Tutup resources
        rs.close();
        pstmtCari.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
        Aplikasi.dialogUI.showMessage("Gagal menghapus file hasil konsultasi.");
    }
}

}

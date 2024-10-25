/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ProsesHapusSesi {
    public void hapusdariDB() {
    try {
        String namaKlien = Aplikasi.upHasil.getjLabel2().getText();

        // Koneksi ke database
        Aplikasi.database.databaseConnection();
        Connection con = Aplikasi.database.getCon();
        String query = "SELECT j.TANGGAL, j.WAKTU FROM FAMIFY.RESERVASI r JOIN FAMIFY.JADWAL_KONSULTASI j ON r.ID_JADWAL = j.ID_JADWAL JOIN FAMIFY.KLIEN k ON r.ID_KLIEN = k.ID_KLIEN JOIN FAMIFY.KONSULTAN kl ON r.ID_KONSULTAN = kl.ID_KONSULTAN WHERE k.NAMA_LENGKAP= ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, namaKlien);
        ResultSet rs1 = pstmt.executeQuery();
        
        if (rs1.next()) {
            String tanggal = rs1.getString("TANGGAL");
            String waktu = rs1.getString("WAKTU");

            // Ambil ID_HASIL yang sesuai dengan klien berdasarkan nama file
            String queryCari = "DELETE H " + 
                                "FROM FAMIFY.HASIL_KONSULTASI H " + 
                                "INNER JOIN FAMIFY.RESERVASI R ON H.ID_RESERVASI = R.ID_RESERVASI "  +
                                "INNER JOIN FAMIFY.KLIEN K ON R.ID_KLIEN = K.ID_KLIEN " +
                                "INNER JOIN FAMIFY.KONSULTAN C ON R.ID_KONSULTAN = C.ID_KONSULTAN " +
                                "INNER JOIN FAMIFY.JADWAL_KONSULTASI J ON R.ID_JADWAL = J.ID_JADWAL " +
                                "WHERE K.NAMA_LENGKAP = ? " +
                                "AND C.EMAIL = ? " +
                                "AND J.TANGGAL =  ? " +
                                "AND J.WAKTU = ? ";
            PreparedStatement pstmtCari = con.prepareStatement(queryCari);
            pstmtCari.setString(1, namaKlien);
            pstmtCari.setString(2, Aplikasi.akun.getEmail());
            pstmtCari.setString(3, tanggal);
            pstmtCari.setString(4, waktu);
        
                
            int rs = pstmtCari.executeUpdate();

            if (rs!=0) {
                    Aplikasi.dialogUI.showMessage("File hasil konsultasi berhasil dihapus");
                    Aplikasi.upHasil.getjButton1().setText("+ Unggah Hasil Konsultasi"); // Reset jButton1
                    Aplikasi.upHasil.getjButton3().setText("Simpan"); // Kembali ke tombol "Simpan"
            } else {
                    Aplikasi.dialogUI.showMessage("File hasil konsultasi tidak ditemukan");
            }      
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        Aplikasi.dialogUI.showMessage("Gagal menghapus file hasil konsultasi.");
    }
}

}

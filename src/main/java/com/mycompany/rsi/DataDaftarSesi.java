/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DataDaftarSesi {
    
    private List<DataDaftarSesi> daftarSesiKonsultan = new ArrayList<>();
    
    private String nama;
    private int umur;
    private String tanggalKonsul;
    private String waktuKonsul;
    private String tempat;
    private String spesialisasi;
    
    
    //untuk mendapatkan list Klien konsultan
    public List<DataDaftarSesi> getDaftarSesiKlien(){
       if(Aplikasi.akun.getPerson().equals("konsultan")){
            String email = Aplikasi.akun.getEmail();
            String query = "SELECT j.TANGGAL, j.WAKTU, k.NAMA_LENGKAP, k.UMUR,r.TEMPAT FROM FAMIFY.RESERVASI r JOIN FAMIFY.JADWAL_KONSULTASI j ON r.ID_JADWAL = j.ID_JADWAL JOIN FAMIFY.KLIEN k ON r.ID_KLIEN = k.ID_KLIEN JOIN FAMIFY.KONSULTAN kl ON r.ID_KONSULTAN = kl.ID_KONSULTAN WHERE kl.EMAIL = ?";
            List<DataDaftarSesi> daftarSesiKlien = new ArrayList<>();
            try{
                Aplikasi.database.databaseConnection();
                Connection con = Aplikasi.database.getCon();
                PreparedStatement pStatement = con.prepareStatement(query);
                pStatement.setString(1, email);
                ResultSet rs = pStatement.executeQuery(); 
                while(rs.next()){
                    DataDaftarSesi sesi = new DataDaftarSesi();
                    sesi.tanggalKonsul = rs.getString("TANGGAL");
                    sesi.waktuKonsul = rs.getString("WAKTU");
                    sesi.nama = rs.getString("NAMA_LENGKAP");
                    sesi.umur = rs.getInt("UMUR");
                    sesi.tempat = rs.getString("TEMPAT");
                    daftarSesiKlien.add(sesi);
                }
            }catch(Exception ex){
                Aplikasi.dialogUI.showMessage("Connection Error" + ex.getMessage());
            } 
            return daftarSesiKlien;
       }else if(Aplikasi.akun.getPerson().equals("klien")){
           
            String email = Aplikasi.akun.getEmail();
            String query = "SELECT j.TANGGAL, j.WAKTU, kl.NAMA_KONSULTAN, kl.SPESIALISASI, r.TEMPAT FROM FAMIFY.RESERVASI r JOIN FAMIFY.JADWAL_KONSULTASI j ON r.ID_JADWAL = j.ID_JADWAL JOIN FAMIFY.KLIEN k ON r.ID_KLIEN = k.ID_KLIEN JOIN FAMIFY.KONSULTAN kl ON r.ID_KONSULTAN = kl.ID_KONSULTAN WHERE k.EMAIL = ?";
            List<DataDaftarSesi> daftarSesiKlien = new ArrayList<>();
            try{
                Aplikasi.database.databaseConnection();
                Connection con = Aplikasi.database.getCon();
                PreparedStatement pStatement = con.prepareStatement(query);
                pStatement.setString(1, email);
                ResultSet rs = pStatement.executeQuery(); 
                while(rs.next()){
                    DataDaftarSesi sesi = new DataDaftarSesi();
                    sesi.tanggalKonsul = rs.getString("TANGGAL");
                    sesi.waktuKonsul = rs.getString("WAKTU");
                    sesi.nama = rs.getString("NAMA_KONSULTAN");
                    sesi.spesialisasi = rs.getString("SPESIALISASI");
                    sesi.tempat = rs.getString("TEMPAT");
                    daftarSesiKlien.add(sesi);
                }
            }catch(Exception ex){
                Aplikasi.dialogUI.showMessage("Connection Error" + ex.getMessage());
            } 
            return daftarSesiKlien;
       }else{
            return null;
       }
    }

   
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getTanggalKonsul() {
        return tanggalKonsul;
    }

    public String getWaktuKonsul() {
        return waktuKonsul;
    }

    public String getTempat() {
        return tempat;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }
    
    
    
    


    
    
    
}

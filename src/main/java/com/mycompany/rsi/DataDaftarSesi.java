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
    private List<DataDaftarSesi> daftarSesiKlien = new ArrayList<>();
    private List<DataDaftarSesi> daftarSesiKonsultan = new ArrayList<>();
    
    private String nama;
    private int umur;
    private int tanggalKonsul;
    private int waktuKonsul;
    private int jenisKonsul;
    
    //untuk mendapatkan list Klien konsultan
    public List<DataDaftarSesi> getDaftarSesiKlien(){
       String email = Aplikasi.akun.getEmail();
       String query = "SELECT j.TANGGAL, j.WAKTU, k.NAMA_KONSULTAN, k.SPESIALISASI FROM FAMIFY.RESERVASI r JOIN FAMIFY.JADWAL_KONSULTASI j ON r.ID_JADWAL = j.ID_JADWAL JOIN FAMIFY.KONSULTAN k ON r.ID_KONSULTAN = k.ID_KONSULTAN k.EMAIL = ? ";
       PreparedStatement pStatement = null;
       ResultSet rs;
     
       try{
            Aplikasi.database.databaseConnection();
            Connection con = Aplikasi.database.getCon();
            pStatement = con.prepareStatement(query);
            pStatement.setString(1, email);
            rs = pStatement.executeQuery(); 
            while(rs.next()){
                DataDaftarSesi sesi = new DataDaftarSesi();
                sesi.tanggalKonsul = rs.getDate("TANGGAL").toLocalDate().getDayOfMonth();
                sesi.waktuKonsul = rs.getTime("WAKTU").toLocalTime().getHour();
                sesi.nama = rs.getString("NAMA_KONSULTAN");
                daftarSesiKlien.add(sesi);
            }
            
       }catch(Exception ex){
           Aplikasi.dialogUI.showMessage("Connection Error" + ex.getMessage());
       } 
       return daftarSesiKlien;        
    }
    
    //untuk mendapatkan list Konsultan klien MALES BRO TOLONG CARRY
    public List<DataDaftarSesi> getDaftarSesiKonsultan(String namaKlien){
        String query ;
        
        
        return daftarSesiKonsultan;
    }

    public String getNama() {
        //sql
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public int getTanggalKonsul() {
        return tanggalKonsul;
    }

    public int getWaktuKonsul() {
        return waktuKonsul;
    }

    public int getJenisKonsul() {
        return jenisKonsul;
    }
    
    
    
}

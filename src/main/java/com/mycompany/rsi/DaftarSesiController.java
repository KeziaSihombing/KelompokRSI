/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DaftarSesiController {
    private List<DataDaftarSesi> daftarSesiKlien = new ArrayList<>();
    
   public void load(){
        daftarSesiKlien = Aplikasi.daftar.getDaftarSesiKlien();
        
        if(!daftarSesiKlien.isEmpty()){
            showDaftarSesiKonsultasi(daftarSesiKlien);
        }
        else {
            Aplikasi.dialogUI.showMessage("Sesi konsultasi belum tersedia");
            Aplikasi.beranda.tampilkan();
        }
        
        
    }
    
    public void showDaftarSesiKonsultasi(List<DataDaftarSesi> daftarKonsultasi){
        Aplikasi.sesiKonsultasiUI.tampilkan(daftarKonsultasi);
        
    }

    public Connection getConnection(){
        return Aplikasi.database.getConnection();
    }
     
}

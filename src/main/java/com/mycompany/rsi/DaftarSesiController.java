/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DaftarSesiController {
    private List<DataDaftarSesi> daftarSesiKlien = new ArrayList<>();
    private List<DataDaftarSesi> daftarSesiKonsultan = new ArrayList<>();
    
    public void load(){
        daftarSesiKlien = Aplikasi.daftar.getDaftarSesiKlien();
        //daftarSesiKonsultan = Aplikasi.daftar.getDaftarSesiKonsultan();
        if(!daftarSesiKlien.isEmpty()){
            showDaftarSesiKonsultasi(daftarSesiKlien);
        }
        else {
            Aplikasi.dialogUI.showMessage("Anda tidak memiliki sesi konsultasi");
            Aplikasi.beranda.tampilkan();
        }
        
        //ini juga ada untuk daftarSesiKonsultan
    }
    
    public void showDaftarSesiKonsultasi(List<DataDaftarSesi> daftarKonsultasi){
        Aplikasi.sesiKonsultasiUI.tampilkan(daftarKonsultasi);
        
    }    
     
}

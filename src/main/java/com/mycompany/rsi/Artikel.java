/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Artikel extends Content {
    private String subjudul;
    private String penulis;    
    private String isiArtikel;

    
    public List<Artikel> getRecentArticles(){
            String query = "SELECT JUDUL_ARTIKEL, SUBJUDUL, ISI_ARTIKEL,PENULIS, TANGGAL_PUBLIKASI, THUMBNAIL FROM FAMIFY.KONTEN_ARTIKEL ORDER BY TANGGAL_PUBLIKASI DESC LIMIT 3";
            List<Artikel> daftarArtikelTemp = new ArrayList<>();
            try{
                Aplikasi.database.databaseConnection();
                Connection con = Aplikasi.database.getCon();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query); 
                while(rs.next()){
                    Artikel artikel = new Artikel();
                    artikel.judul = rs.getString("JUDUL_ARTIKEL");
                    artikel.subjudul = rs.getString("SUBJUDUL");
                    artikel.tanggalPublikasi = rs.getString("TANGGAL_PUBLIKASI");
                    artikel.penulis = rs.getString("PENULIS");
                    artikel.isiArtikel = rs.getString("ISI_ARTIKEL");
                    
                    File file = new File("Thumbnail_db_" + artikel.judul+".png");
                    
                    try (FileOutputStream outputStream = new FileOutputStream(file);
                    InputStream inputStream = rs.getBinaryStream("THUMBNAIL")) {

                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) > 0) {
                            outputStream.write(buffer, 0, bytesRead);
                        }   

                        artikel.thumbnail = file;
                    }
                    daftarArtikelTemp.add(artikel);
                }
            }catch(Exception ex){
                Aplikasi.dialogUI.showMessage("Connection Error" + ex.getMessage());
            } 
            return daftarArtikelTemp;
    }

    public String getJudul() {
        return judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public String getTanggalPublikasi() {
        return tanggalPublikasi;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getIsiArtikel() {
        return isiArtikel;
    }

    public File getThumbnail() {
        return thumbnail;
    }
    
    public String getType(){
        return "artikel";
    }
    
    
    
    
   

}

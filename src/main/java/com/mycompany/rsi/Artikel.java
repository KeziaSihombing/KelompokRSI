/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Artikel extends Content {
    private String idArtikel;
    private String subjudul;
    private String penulis;    
    private String isiArtikel;
    
    public List<Artikel> getArticlesByPage(int page) {

        String countQuery = "SELECT COUNT(*) FROM FAMIFY.KONTEN_ARTIKEL";
        int totalArticles = 0;
        String query = "SELECT ID_ARTIKEL, JUDUL_ARTIKEL, SUBJUDUL, ISI_ARTIKEL, PENULIS, TANGGAL_PUBLIKASI, THUMBNAIL "
                + "FROM FAMIFY.KONTEN_ARTIKEL ORDER BY TANGGAL_PUBLIKASI DESC LIMIT ? OFFSET ?";
        List<Artikel> daftarArtikelTemp = new ArrayList<>();
        int offset = (page - 1) * 4;

            try {
                Connection con = Aplikasi.controllerManajemen.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs1 = stmt.executeQuery(countQuery);
                PreparedStatement pstmt = con.prepareStatement(query); 
                if (rs1.next()) {
                    totalArticles = rs1.getInt(1);
                }
            
                if(totalArticles>=0){                    
                
                int limit = Math.max(4, totalArticles - offset);
                pstmt.setInt(1, limit);
                pstmt.setInt(2, offset);

                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        Artikel artikel = new Artikel();
                        artikel.idArtikel = rs.getString("ID_ARTIKEL");
                        artikel.judul = rs.getString("JUDUL_ARTIKEL");
                        artikel.subjudul = rs.getString("SUBJUDUL");
                        artikel.tanggalPublikasi = rs.getString("TANGGAL_PUBLIKASI");
                        artikel.penulis = rs.getString("PENULIS");
                        artikel.isiArtikel = rs.getString("ISI_ARTIKEL");

                        File file = new File("Thumbnail_db_" + artikel.judul + ".png");

                        try (FileOutputStream outputStream = new FileOutputStream(file); InputStream inputStream = rs.getBinaryStream("THUMBNAIL")) {

                            byte[] buffer = new byte[4096];
                            int bytesRead;
                            while ((bytesRead = inputStream.read(buffer)) > 0) {
                                outputStream.write(buffer, 0, bytesRead);
                            }

                            artikel.thumbnail = file;
                        }

                        File pathTarget = new File("src/main/resources/images/Thumbnail_db_" + artikel.judul + ".png");

                        try {
                            Files.move(file.toPath(), pathTarget.toPath(), StandardCopyOption.REPLACE_EXISTING);

                        }catch (Exception ex) {
                            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
                        }


                        daftarArtikelTemp.add(artikel);
                    }
                }
                }
                }catch (Exception ex) {
                            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
                        }
            return daftarArtikelTemp;
        }
    
    
    
    public int getTotalPages() {
        String countQuery = "SELECT COUNT(*) FROM FAMIFY.KONTEN_ARTIKEL";
        int totalPages = 1;

        try {
            Aplikasi.database.databaseConnection();
            try (Connection con = Aplikasi.database.getCon(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(countQuery)) {

                if (rs.next()) {
                    int totalArticles = rs.getInt(1);
                    totalPages = (int) Math.ceil((double) totalArticles / 4);
                }
            }
        } catch (Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
        }

        return totalPages;
    }
    
    public int totalArticle(){
       String countQuery = "SELECT COUNT(*) FROM FAMIFY.KONTEN_ARTIKEL";      
       int totalArticles =0;
        try {
            Aplikasi.database.databaseConnection();
            try (Connection con = Aplikasi.database.getCon(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(countQuery)) {

                if (rs.next()) {
                    totalArticles = rs.getInt(1);                  
                }
            }
        } catch (Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
        } 
        return totalArticles;
    }   
    
    public List<Artikel> getAllArticles() {
    List<Artikel> allArticles = new ArrayList<>();
    int currentPage = 1;

    while (true) {
        List<Artikel> articlesPage = getArticlesByPage(currentPage);

        // Jika tidak ada artikel yang tersisa, hentikan proses
        if (articlesPage.isEmpty()) {
            break;
        }

        // Tambahkan artikel dari halaman saat ini ke daftar utama
        allArticles.addAll(articlesPage);

        // Pindah ke halaman berikutnya
        currentPage++;
    }

    return allArticles;
}


    
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
                    File file = new File("Thumbnail_db_" + artikel.judul + ".png");
                    
                    try (FileOutputStream outputStream = new FileOutputStream(file);
                    InputStream inputStream = rs.getBinaryStream("THUMBNAIL")) {

                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) > 0) {
                            outputStream.write(buffer, 0, bytesRead);
                        }   

                        artikel.thumbnail = file;                        
                    }
                        
                    File pathTarget = new File("src/main/resources/images/Thumbnail_db_" + artikel.judul + ".png");

                    try {
                        Files.move(file.toPath(), pathTarget.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        
                    }catch (Exception ex) {
                        Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
                    }
                    daftarArtikelTemp.add(artikel);
                }
            }catch(Exception ex){
                Aplikasi.dialogUI.showMessage("Connection Error" + ex.getMessage());
            } 
            return daftarArtikelTemp;
    }
    
    public boolean getTypebyID(String id, String judul){
         String query = "SELECT * FROM FAMIFY.KONTEN_ARTIKEL WHERE ID_ARTIKEL = ? AND JUDUL_ARTIKEL = ?";
        try {
            Aplikasi.database.databaseConnection();
            try (Connection con = Aplikasi.database.getCon(); PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setInt(1, Integer.parseInt(id));
                pstmt.setString(2, judul);
                try (ResultSet rs = pstmt.executeQuery()) {
                    // Menggunakan rs.next() untuk memeriksa apakah ada hasil
                    return rs.next();
                }
            }
        } catch (Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
        }
        return false;       
    }

    public String getIdArtikel() {
        return idArtikel;
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

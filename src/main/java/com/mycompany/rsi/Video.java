/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
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
public class Video extends Content {
    private String idVideo;
    private String deskripsi;
    private String pengunggah;    
    private File video;
    
    public List<Video> getVideosByPages(int page){
            String countQuery = "SELECT COUNT(*) FROM FAMIFY.KONTEN_VIDEO";
            int totalVideo = 0;           
            String query = "SELECT ID_VIDEO, JUDUL_VIDEO, DESKRIPSI, PENGUNGGAH ,VIDEO, TANGGAL_PUBLIKASI, THUMBNAIL FROM FAMIFY.KONTEN_VIDEO ORDER BY TANGGAL_PUBLIKASI DESC LIMIT ? OFFSET ?";
            List<Video> daftarVideoTemp = new ArrayList<>();
            int offset = (page - 1) * 4;

            try{
                Aplikasi.database.databaseConnection();
                Connection con = Aplikasi.database.getCon();
                Statement stmt = con.createStatement();
                ResultSet rs1 = stmt.executeQuery(countQuery);
                PreparedStatement pstmt = con.prepareStatement(query); 
                if (rs1.next()) {
                    totalVideo = rs1.getInt(1);
                }         
                
                if(totalVideo!=0){
                    int limit = Math.max(4, totalVideo - offset);
                    pstmt.setInt(1, limit);
                    pstmt.setInt(2, offset);
                    try (ResultSet rs = pstmt.executeQuery()) { 
                            while(rs.next()){
                                Video video = new Video();
                                video.idVideo = rs.getString("ID_VIDEO");
                                video.judul = rs.getString("JUDUL_VIDEO");
                                video.deskripsi = rs.getString("DESKRIPSI");
                                video.tanggalPublikasi = rs.getString("TANGGAL_PUBLIKASI");
                                video.pengunggah = rs.getString("PENGUNGGAH");

                                File fileThumbnail = new File("Thumbnail_db_" + video.judul+".png");

                                try (FileOutputStream outputStream = new FileOutputStream(fileThumbnail);
                                InputStream inputStream = rs.getBinaryStream("THUMBNAIL")) {

                                    byte[] buffer = new byte[4096];
                                    int bytesRead;
                                    while ((bytesRead = inputStream.read(buffer)) > 0) {
                                        outputStream.write(buffer, 0, bytesRead);
                                    }   

                                    video.thumbnail = fileThumbnail;


                                }

                                File pathTarget = new File("src/main/resources/images/Thumbnail_db_" + video.judul + ".png");

                                try {
                                    Files.move(fileThumbnail.toPath(), pathTarget.toPath(), StandardCopyOption.REPLACE_EXISTING);

                                }catch (Exception ex) {
                                    Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
                                }

                                File fileVideo = new File("Video_db_" + video.judul + ".mp4");
                                try (FileOutputStream outputStream = new FileOutputStream(fileVideo);
                                InputStream inputStream = rs.getBinaryStream("VIDEO")) {

                                    byte[] buffer = new byte[4096];
                                    int bytesRead;
                                    while ((bytesRead = inputStream.read(buffer)) > 0) {
                                        outputStream.write(buffer, 0, bytesRead);
                                    }   

                                    video.video = fileVideo;

                                }

                                File pathTargetVideo = new File("src/main/resources/video/Video_db" + video.judul + ".mp4");

                                try {
                                    Files.move(fileVideo.toPath(), pathTargetVideo.toPath(), StandardCopyOption.REPLACE_EXISTING);

                                }catch (Exception ex) {
                                    Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
                                }

                                daftarVideoTemp.add(video);
                            }
                    }
                    }
                    }catch (Exception ex) {
                       Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
                    }
        return daftarVideoTemp;    
    }
    
    
    public List<Video> getRecentVideos(){
            String query = "SELECT JUDUL_VIDEO, DESKRIPSI, PENGUNGGAH ,VIDEO, TANGGAL_PUBLIKASI, THUMBNAIL FROM FAMIFY.KONTEN_VIDEO ORDER BY TANGGAL_PUBLIKASI DESC LIMIT 3";
            List<Video> daftarVideoTemp = new ArrayList<>();
            try{
                Aplikasi.database.databaseConnection();
                Connection con = Aplikasi.database.getCon();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query); 
                while(rs.next()){
                    Video video = new Video();
                    video.judul = rs.getString("JUDUL_VIDEO");
                    video.deskripsi = rs.getString("DESKRIPSI");
                    video.tanggalPublikasi = rs.getString("TANGGAL_PUBLIKASI");
                    video.pengunggah = rs.getString("PENGUNGGAH");
                    
                    File fileThumbnail = new File("Thumbnail_db_" + video.judul+".png");
                    
                    try (FileOutputStream outputStream = new FileOutputStream(fileThumbnail);
                    InputStream inputStream = rs.getBinaryStream("THUMBNAIL")) {

                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) > 0) {
                            outputStream.write(buffer, 0, bytesRead);
                        }   

                        video.thumbnail = fileThumbnail;
                       
                        
                    }
                    
                    File pathTarget = new File("src/main/resources/images/Thumbnail_db_" + video.judul + ".png");

                    try {
                        Files.move(fileThumbnail.toPath(), pathTarget.toPath(), StandardCopyOption.REPLACE_EXISTING);

                    }catch (Exception ex) {
                        Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
                    }
                    
                    File fileVideo = new File("Video_db_" + video.judul + ".mp4");
                    try (FileOutputStream outputStream = new FileOutputStream(fileVideo);
                    InputStream inputStream = rs.getBinaryStream("VIDEO")) {

                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) > 0) {
                            outputStream.write(buffer, 0, bytesRead);
                        }   

                        video.video = fileVideo;
                        
                    }
                    
                    File pathTargetVideo = new File("src/main/resources/video/Video_db" + video.judul + ".mp4");

                    try {
                        Files.move(fileVideo.toPath(), pathTargetVideo.toPath(), StandardCopyOption.REPLACE_EXISTING);

                    }catch (Exception ex) {
                        Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
                    }
                    
                    daftarVideoTemp.add(video);
                }
            }catch(Exception ex){
                Aplikasi.dialogUI.showMessage("Connection Error" + ex.getMessage());
            } 
            return daftarVideoTemp;
    }
    
    public int getTotalPages() {
        String countQuery = "SELECT COUNT(*) FROM FAMIFY.KONTEN_VIDEO";
        int totalPages = 1;

        try {
            Aplikasi.database.databaseConnection();
            try (Connection con = Aplikasi.database.getCon(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(countQuery)) {

                if (rs.next()) {
                    int totalVideo = rs.getInt(1);
                    totalPages = (int) Math.ceil((double) totalVideo / 4);
                }
            }
        } catch (Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
        }

        return totalPages;
    }

    public int totalVideos(){        
        String countQuery = "SELECT COUNT(*) FROM FAMIFY.KONTEN_VIDEO";
        int totalVideos = 0;

        try {
            Aplikasi.database.databaseConnection();
            try (Connection con = Aplikasi.database.getCon(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(countQuery)) {

                if (rs.next()) {
                    totalVideos = rs.getInt(1);                  
                }
            }
        } catch (Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
        }

        return totalVideos;    
    }
    
    public List<Video> getAllVideos() {
    List<Video> allVideos = new ArrayList<>();
    int currentPage = 1;

    while (true) {
        List<Video> videosPage = getVideosByPages(currentPage);

        // Jika tidak ada video yang tersisa, hentikan proses
        if (videosPage.isEmpty()) {
            break;
        }

        // Tambahkan video dari halaman saat ini ke daftar utama
        allVideos.addAll(videosPage);

        // Pindah ke halaman berikutnya
        currentPage++;
    }
    return allVideos;
    }

    public String getIdVideo() {
        return idVideo;
    }

    
    public boolean getTypebyID(String id, String judul){
         String query = "SELECT * FROM FAMIFY.KONTEN_VIDEO WHERE ID_VIDEO = ? AND JUDUL_VIDEO = ?";
        try {
            Aplikasi.database.databaseConnection();
            try (Connection con = Aplikasi.database.getCon(); PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setInt(1, Integer.parseInt(id));
                pstmt.setString(2, judul);
                try (ResultSet rs = pstmt.executeQuery()) {
                    // Memeriksa apakah ada hasil dari query
                    return rs.next();
                }
            }
        } catch (Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection Error: " + ex.getMessage());
        }
        return false;        
    }
    
      public String getType(){
        return "video";
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getPengunggah() {
        return pengunggah;
    }

    public File getVideo() {
        return video;
    }

    public String getJudul() {
        return judul;
    }

    public String getTanggalPublikasi() {
        return tanggalPublikasi;
    }

    public File getThumbnail() {
        return thumbnail;
    }
    
    


}

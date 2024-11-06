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
    private String deskripsi;
    private String pengunggah;    
    private File video;
    private String path;
    
    public List<Video> getVideosByPages(int page){
            String countQuery = "SELECT COUNT(*) FROM FAMIFY.KONTEN_ARTIKEL";
            int totalArticles = 0;
            
            String query = "SELECT JUDUL_VIDEO, DESKRIPSI, PENGUNGGAH ,VIDEO, TANGGAL_PUBLIKASI, THUMBNAIL FROM FAMIFY.KONTEN_VIDEO ORDER BY TANGGAL_PUBLIKASI DESC LIMIT ? OFFSET ?";
            List<Video> daftarVideoTemp = new ArrayList<>();
            int offset = (page - 1) * 4;
            
            try{
                Aplikasi.database.databaseConnection();
                Connection con = Aplikasi.database.getCon();
                Statement stmt = con.createStatement();
                ResultSet rs1 = stmt.executeQuery(countQuery);
                PreparedStatement pstmt = con.prepareStatement(query); 
                if (rs1.next()) {
                    totalArticles = rs1.getInt(1);
                }
                if(totalArticles-offset<4){
                    pstmt.setInt(1,totalArticles-offset);
                }else{
                    pstmt.setInt(1, 4);
                }
                pstmt.setInt(2, offset);
                ResultSet rs = pstmt.executeQuery(query); 
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
                        video.path =  fileThumbnail.getAbsolutePath();
                        
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
                        Files.move(fileThumbnail.toPath(), pathTargetVideo.toPath(), StandardCopyOption.REPLACE_EXISTING);

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
                        video.path =  fileThumbnail.getAbsolutePath();
                        
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
                        Files.move(fileThumbnail.toPath(), pathTargetVideo.toPath(), StandardCopyOption.REPLACE_EXISTING);

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
    
    
    
      public String getType(){
        return "video";
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

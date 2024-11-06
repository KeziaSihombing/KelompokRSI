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
public class Video extends Content {
    private String deskripsi;
    private String pengunggah;    
    private File video;
    private String path;
    
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

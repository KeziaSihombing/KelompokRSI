/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

import java.sql.*;

/**
 *
 * @author ASUS
 */
public class Database {
    private Connection con;
    private String user = "root";
    private String passwordSQL = "rahasia";
    
    public void databaseConnection(){
         try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL", user, passwordSQL); 
        } catch(Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection error" + ex.getMessage());
        }
    }
    
  public Connection getCon(){
      return con;
  }
    
    public void insertTable(){
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SHOW DATABASES LIKE 'FAMIFY'");
            if(resultSet.next()){
               statement.executeUpdate("USE FAMIFY");
            }else{
               statement.executeUpdate("CREATE SCHEMA IF NOT EXISTS FAMIFY");
               statement.executeUpdate("USE FAMIFY");
               
               statement.executeUpdate("CREATE TABLE IF NOT EXISTS FAMIFY.KLIEN( ID_KLIEN INT NOT NULL AUTO_INCREMENT ,EMAIL VARCHAR(100) NOT NULL,PASSWORD VARCHAR(50) NOT NULL,USERNAME VARCHAR(50) NOT NULL,NAMA_LENGKAP VARCHAR(100) NOT NULL,UMUR INT NOT NULL,PRIMARY KEY (ID_KLIEN))");
               statement.executeUpdate("CREATE TABLE IF NOT EXISTS FAMIFY.KONSULTAN (ID_KONSULTAN INT NOT NULL AUTO_INCREMENT ,NAMA_KONSULTAN VARCHAR(100) NOT NULL,EMAIL VARCHAR(100) NOT NULL, USERNAME VARCHAR(50) NOT NULL, PASSWORD VARCHAR(50) NOT NULL,SPESIALISASI VARCHAR(50),PRIMARY KEY (ID_KONSULTAN))");
               statement.executeUpdate("CREATE TABLE IF NOT EXISTS FAMIFY.JADWAL_KONSULTASI (ID_JADWAL INT NOT NULL AUTO_INCREMENT,ID_KONSULTAN INT NOT NULL,HARGA DECIMAL (10,2) NOT NULL,TANGGAL DATE NOT NULL, WAKTU TIME NOT NULL,AVAILABILITY SMALLINT NOT NULL, PRIMARY KEY (ID_JADWAL), FOREIGN KEY (ID_KONSULTAN) REFERENCES FAMIFY.KONSULTAN (ID_KONSULTAN))");
               statement.executeUpdate("CREATE TABLE IF NOT EXISTS FAMIFY.RESERVASI ( ID_RESERVASI INT NOT NULL AUTO_INCREMENT, ID_JADWAL INT NOT NULL,ID_KONSULTAN INT NOT NULL,ID_KLIEN INT NOT NULL, TEMPAT VARCHAR(50) NOT NULL,PRIMARY KEY (ID_RESERVASI),FOREIGN KEY (ID_JADWAL) REFERENCES FAMIFY.JADWAL_KONSULTASI (ID_JADWAL),FOREIGN KEY (ID_KONSULTAN) REFERENCES FAMIFY.KONSULTAN (ID_KONSULTAN), FOREIGN KEY (ID_KLIEN) REFERENCES FAMIFY.KLIEN (ID_KLIEN))");
               statement.executeUpdate("CREATE TABLE IF NOT EXISTS FAMIFY.HASIL_KONSULTASI (ID_HASIL INT NOT NULL AUTO_INCREMENT, ID_RESERVASI INT NOT NULL,CATATAN_KONSULTASI MEDIUMBLOB NOT NULL,PRIMARY KEY (ID_HASIL),FOREIGN KEY (ID_RESERVASI) REFERENCES FAMIFY.RESERVASI (ID_RESERVASI))");
               statement.executeUpdate("CREATE TABLE IF NOT EXISTS FAMIFY.ADMINISTRATOR( ID_ADMINISTRATOR INT NOT NULL AUTO_INCREMENT ,EMAIL VARCHAR(100) NOT NULL,PASSWORD VARCHAR(50) NOT NULL,USERNAME VARCHAR(50) NOT NULL,PRIMARY KEY (ID_ADMINISTRATOR))");
               statement.executeUpdate("CREATE TABLE IF NOT EXISTS FAMIFY.KONTEN_VIDEO(ID_VIDEO INT NOT NULL, JUDUL_VIDEO VARCHAR(100) NOT NULL, VIDEO LONGBLOB NOT NULL, TANGGAL_PUBLIKASI DATE NOT NULL, DESKRIPSI TEXT NOT NULL, THUMBNAIL MEDIUMBLOB NOT NULL, PRIMARY KEY(ID_VIDEO))");
               statement.executeUpdate("CREATE TABLE IF NOT EXISTS FAMIFY.KONTEN_ARTIKEL(ID_ARTIKEL INT NOT NULL AUTO_INCREMENT, JUDUL_ARTIKEL VARCHAR(100) NOT NULL, DESKRIPSI VARCHAR(255) NOT NULL, ISI_ARTIKEL TEXT NOT NULL, TANGGAL_PUBLIKASI DATE NOT NULL, THUMBNAIL MEDIUMBLOB NOT NULL, PRIMARY KEY(ID_ARTIKEL))");
               
               statement.executeUpdate("INSERT INTO FAMIFY.KLIEN (EMAIL, PASSWORD, USERNAME, NAMA_LENGKAP, UMUR) VALUES ('courtneyHenry@gmail.com', 'courtney28', 'courtney_Henry', 'Courtney Henry', 28)");
               statement.executeUpdate("INSERT INTO FAMIFY.KLIEN (EMAIL, PASSWORD, USERNAME, NAMA_LENGKAP, UMUR) VALUES ('jennywilson@gmail.com', 'jenny30', 'jenny_wilson', 'Jenny Wilson', 30)");
               statement.executeUpdate("INSERT INTO FAMIFY.KLIEN (EMAIL, PASSWORD, USERNAME, NAMA_LENGKAP, UMUR) VALUES ('esterhoward@gmail.com', 'ester26', 'ester_howard', 'Ester Howard', 26)");
               statement.executeUpdate("INSERT INTO FAMIFY.ADMINISTRATOR(EMAIL, PASSWORD, USERNAME) VALUES ('Dadang@gmail.com', 'admin123', 'Dadang Admin')");
                              
               statement.executeUpdate("INSERT INTO FAMIFY.KONSULTAN (NAMA_KONSULTAN, EMAIL, USERNAME, PASSWORD, SPESIALISASI) VALUES ('Eleanor Pena', 'eleanorpena@gmail.com', 'eleanor_pena', 'konsultan1','Ahli Pengembangan Anak')");
               statement.executeUpdate("INSERT INTO FAMIFY.KONSULTAN (NAMA_KONSULTAN, EMAIL, USERNAME, PASSWORD, SPESIALISASI) VALUES ('Kathryn Murphy', 'kathrynmurphy@gmail.com', 'kathryn_murphy', 'konsultan2', 'Konselor Keluarga')");
               statement.executeUpdate("INSERT INTO FAMIFY.JADWAL_KONSULTASI (ID_KONSULTAN, HARGA, TANGGAL, WAKTU, AVAILABILITY) VALUES (1, 100000, '2024-10-21', '10:00:00', 1)");
               statement.executeUpdate("INSERT INTO FAMIFY.JADWAL_KONSULTASI (ID_KONSULTAN, HARGA, TANGGAL, WAKTU, AVAILABILITY) VALUES (1, 100000, '2024-10-21', '14:00:00', 1)");
               statement.executeUpdate("INSERT INTO FAMIFY.JADWAL_KONSULTASI (ID_KONSULTAN, HARGA, TANGGAL, WAKTU, AVAILABILITY) VALUES (1, 100000, '2024-10-21', '09:00:00', 1)");
               statement.executeUpdate("INSERT INTO FAMIFY.RESERVASI (ID_JADWAL, ID_KONSULTAN, ID_KLIEN, TEMPAT) VALUES (3, 1, 3, 'Online')");
               statement.executeUpdate("INSERT INTO FAMIFY.RESERVASI (ID_JADWAL, ID_KONSULTAN, ID_KLIEN, TEMPAT) VALUES (2, 1, 2, 'Offline')");
               statement.executeUpdate("INSERT INTO FAMIFY.RESERVASI (ID_JADWAL, ID_KONSULTAN, ID_KLIEN, TEMPAT) VALUES (1, 1, 1, 'Online')");
               ;
               
               
            }
        } catch (Exception ex){
            Aplikasi.dialogUI.showMessage("Connection error");
        }
    }
    
    
}

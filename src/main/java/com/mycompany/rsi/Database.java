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
            Aplikasi.dialogUI.showMessage("Connection success");
        } catch(Exception ex) {
            Aplikasi.dialogUI.showMessage("Connection error");
        }
    }
    
    public void insertTable(){
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SHOW DATABASES LIKE 'FAMIFY'");
            if(resultSet.next()){
               statement.executeUpdate("USE FAMIFY");
               Aplikasi.dialogUI.showMessage("Success");
            }else{
               statement.executeUpdate("CREATE SCHEMA IF NOT EXISTS FAMIFY");
               statement.executeUpdate("CREATE TABLE IF NOT EXISTS FAMIFY.KLIEN( ID_KLIEN INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),EMAIL VARCHAR(100) NOT NULL,PASSWORD VARCHAR(50) NOT NULL,USERNAME VARCHAR(50) NOT NULL,NAMA_LENGKAP VARCHAR(100) NOT NULL,UMUR INT NOT NULL,PRIMARY KEY (ID_KLIEN)");
               statement.executeUpdate("CREATE  IF NOT EXISTS FAMIFY.KONSULTAN (ID_KONSULTAN INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),NAMA_KONSULTAN VARCHAR(100) NOT NULL,EMAIL VARCHAR(100) NOT NULL, USERNAME VARCHAR(50) NOT NULL, PASSWORD VARCHAR(50) NOT NULL,PRIMARY KEY (ID_KONSULTAN))");
               statement.executeUpdate("");
            }
        } catch (Exception ex){
            Aplikasi.dialogUI.showMessage("Connection error");
        }
    }
       
   
}

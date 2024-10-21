/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
       
   
}

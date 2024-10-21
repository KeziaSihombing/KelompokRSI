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
public class Akun {
   private String email;
   private String password;
   private String person;
   
   
   public Akun(String emal, String password){
       this.email = email;
       this.password = password;
   }
   
   public Akun(){
       
   }
      
   public boolean getUser(String email, String password){
       String query = "SELECT * FROM FAMIFY.KLIEN WHERE EMAIL = ? AND PASSWORD = ?";
       String query2 = "SELECT * FROM FAMIFY.KONSULTAN WHERE EMAIL = ? AND PASSWORD = ?";
       PreparedStatement pStatement = null;
       PreparedStatement pStatement2 = null;
       ResultSet rs;
       ResultSet rs2;
       try{
            Aplikasi.database.databaseConnection();
            Connection con = Aplikasi.database.getCon();
            
            pStatement = con.prepareStatement(query);
            pStatement.setString(1, email);
            pStatement.setString(2, password);
            rs = pStatement.executeQuery(); //apabila yang login merupakan klien
            
            pStatement2 = con.prepareStatement(query2);
            pStatement2.setString(1, email);
            pStatement2.setString(2, password);
            rs2 = pStatement2.executeQuery(); //apabila yang login merupakan konsultan 
            
            if (rs.next()) {
                return true;
            }else if(rs2.next()){                
                return true;
            }
            
       }catch(Exception ex){
           Aplikasi.dialogUI.showMessage("Connection Error" + ex.getMessage());
       } 
       return false;
   }
   
   
   
   
   
      
    
}

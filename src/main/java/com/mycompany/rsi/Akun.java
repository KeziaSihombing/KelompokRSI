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
       String query = "SELECT * FROM FAMIFY.KLIEN WHERE BINARY EMAIL = ? AND BINARY PASSWORD = ?";
       String query2 = "SELECT * FROM FAMIFY.KONSULTAN WHERE BINARY EMAIL = ? AND BINARY PASSWORD = ?";
       String query3 ="SELECT * FROM FAMIFY.ADMINISTRATOR WHERE BINARY EMAIL = ? AND BINARY PASSWORD = ?";
       
       PreparedStatement pStatement = null;
       PreparedStatement pStatement2 = null;
       PreparedStatement pStatement3 = null;
       ResultSet rs;
       ResultSet rs2;
       ResultSet rs3;
       try{
            Connection con = Aplikasi.controllerLogin.getConnection();
            
            pStatement = con.prepareStatement(query);
            pStatement.setString(1, email);
            pStatement.setString(2, password);
            rs = pStatement.executeQuery(); //apabila yang login merupakan klien
            
            pStatement2 = con.prepareStatement(query2);
            pStatement2.setString(1, email);
            pStatement2.setString(2, password);
            rs2 = pStatement2.executeQuery(); //apabila yang login merupakan konsultan 
            
            pStatement3 = con.prepareStatement(query3);
            pStatement3.setString(1, email);
            pStatement3.setString(2, password);
            rs3 = pStatement3.executeQuery(); //apabila yang login merupakan admin
            
            if (rs.next()) {
                person = "klien";
                this.email = email;
                this.password = password;
                return true;
            }else if(rs2.next()){
                person = "konsultan";
                this.email = email;
                this.password = password;
                return true;
            }else if(rs3.next()){
                person = "administrator";
                this.email = email;
                this.password = password;
                return true;
            }
            
       }catch(Exception ex){
           Aplikasi.dialogUI.showMessage("Connection Error" + ex.getMessage());
       } 
       return false;
   }
   
   
   
   public String getPerson(){
       return person;
   }
   
   public String getEmail(){
       return email;
   }
   
   
   
      
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DataDaftarSesi {
    private List<DataDaftarSesi> daftarSesiKlien = new ArrayList<>();
    private List<DataDaftarSesi> daftarSesiKonsultan = new ArrayList<>();
    
    //untuk mendapatkan list Klien konsultan
    public List<DataDaftarSesi> getDaftarSesiKlien(){
//       String query = "SELECT * FROM FAMIFY.KLIEN WHERE EMAIL = ? AND PASSWORD = ?";
//       String query2 = "SELECT * FROM FAMIFY.KONSULTAN WHERE EMAIL = ? AND PASSWORD = ?";
//       PreparedStatement pStatement = null;
//       PreparedStatement pStatement2 = null;
//       ResultSet rs;
//       ResultSet rs2;
       try{
            Aplikasi.database.databaseConnection();
            Connection con = Aplikasi.database.getCon();
            
//            pStatement = con.prepareStatement(query);
//            pStatement.setString(1, email);
//            pStatement.setString(2, password);
//            rs = pStatement.executeQuery(); //apabila yang login merupakan klien
//            
//            pStatement2 = con.prepareStatement(query2);
//            pStatement2.setString(1, email);
//            pStatement2.setString(2, password);
//            rs2 = pStatement2.executeQuery(); //apabila yang login merupakan konsultan 
//            
//            if (rs.next()) {
//                person = "klien";
//                return true;
//            }else if(rs2.next()){
//                person = "konsultan";
//                return true;
//            }
//            
       }catch(Exception ex){
           Aplikasi.dialogUI.showMessage("Connection Error" + ex.getMessage());
       } 
       return daftarSesiKlien;        
    }
    
    //untuk mendapatkan list Konsultan klien
    public List<DataDaftarSesi> getDaftarSesiKonsultan(){
        return daftarSesiKonsultan;
    }
    
    
}

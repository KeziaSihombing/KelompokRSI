/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class MelihatKonten {
    public void showArticle(String judul){
        Aplikasi.lihatMateri.tampilkanArtikel(judul);
    }
    
    public Connection getConnection(){
        return Aplikasi.database.getConnection();
    }
    
    
        

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.io.File;

/**
 *
 * @author ASUS
 */
abstract class Content {
    String judul;
    String tanggalPublikasi;
    File thumbnail;

    public String getJudul() {
        return judul;
    }

    public String getTanggalPublikasi() {
        return tanggalPublikasi;
    }

    public File getThumbnail() {
        return thumbnail;
    }
    
    public abstract String getType();
    
    
}

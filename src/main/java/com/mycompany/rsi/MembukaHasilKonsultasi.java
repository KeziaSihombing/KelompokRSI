/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class MembukaHasilKonsultasi {
    public void Load(){
        File myFile = new File(Aplikasi.upHasil.getjButton1().getText());
            try {
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                Logger.getLogger(DetailSesiUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}

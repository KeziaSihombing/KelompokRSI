/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DialogUI {
    public void showMessage (String message){
        JOptionPane.showMessageDialog(new LoginUI(), message);
    }
     
}
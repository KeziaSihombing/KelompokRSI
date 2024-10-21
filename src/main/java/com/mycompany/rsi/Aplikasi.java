/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

/**
 *
 * @author ASUS
 */
public class Aplikasi {
    
    public static Akun akun;
    public static LoginController controllerLogin;
    public static LoginDialogUI dialogUI;
    public static LoginUI loginUI;
    public static sesiKonsultasiUI sesiKonsultasiUI;
    public static Database database;
    public static UpHasilKonsultasiUI upHasil;
       
    public static void main(String[] args){
        Aplikasi.dialogUI = new LoginDialogUI();
        Aplikasi.loginUI = new LoginUI();
        Aplikasi.akun = new Akun();
        Aplikasi.sesiKonsultasiUI = new sesiKonsultasiUI();
        Aplikasi.database = new Database();
        Aplikasi.database.databaseConnection(); //connect ke database
        Aplikasi.database.insertTable(); //memasukkan semua table yang diperlukan
        Aplikasi.upHasil = new UpHasilKonsultasiUI();
        Aplikasi.controllerLogin = new LoginController();        
        Aplikasi.controllerLogin.showLoginForm();
    }
            
    
}

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
    public static DialogUI dialogUI;
    public static LoginUI loginUI;
    public static sesiKonsultasiUI sesiKonsultasiUI;
    public static Database database;
    public static DetailSesiUI upHasil;
    public static HalamanUtamaUI beranda;
    public static DataDaftarSesi daftar;
    public static DaftarSesiController controllerDaftarSesi;
    public static PilihSesi pilihSesi;
    public static ProsesUnggahHasil unggah;
    public static ProsesHapusSesi hapus;
   
    
    public static void main(String[] args){
        Aplikasi.dialogUI = new DialogUI();
        Aplikasi.loginUI = new LoginUI();
        Aplikasi.akun = new Akun();
        Aplikasi.sesiKonsultasiUI = new sesiKonsultasiUI();
        Aplikasi.database = new Database();
        Aplikasi.database.databaseConnection(); //connect ke database
        Aplikasi.database.insertTable(); //memasukkan semua table yang diperlukan
        Aplikasi.upHasil = new DetailSesiUI();
        Aplikasi.beranda = new HalamanUtamaUI();
        Aplikasi.controllerDaftarSesi = new DaftarSesiController();
        Aplikasi.daftar = new DataDaftarSesi();        
        Aplikasi.pilihSesi = new PilihSesi();
        Aplikasi.hapus = new ProsesHapusSesi();
        Aplikasi.unggah = new ProsesUnggahHasil();
        Aplikasi.controllerLogin = new LoginController();        
        Aplikasi.controllerLogin.showLoginForm();
    }
            
    
}

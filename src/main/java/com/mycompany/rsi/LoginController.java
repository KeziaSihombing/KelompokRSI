/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

/**
 *
 * @author ASUS
 */
public class LoginController {
    
    private boolean validation;
        
    public LoginController(){
     
    }  
 
    public void showLoginForm(){
        Aplikasi.loginUI.tampilkan();
    }           
    
    public void validateUser(String email, String password){
        validation = Aplikasi.akun.getUser(email, password);
        showBeranda();
    }
    
    public void showBeranda(){
        if(validation == true){
            Aplikasi.beranda.tampilkan();
            Aplikasi.loginUI.dispose();
        }else{
            Aplikasi.dialogUI.showMessage("Email atau password salah");
            Aplikasi.loginUI.getjTextField2().setText("Ketik email...");
            Aplikasi.loginUI.getjPasswordField1().setText("Ketik kata sandi..");   
        }
    }
    
    
    
    
    
    

    
    


   
}

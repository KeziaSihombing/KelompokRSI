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
    
    public static void showLoginForm(){
        Login loginInstance = Login.getInstance();
        loginInstance.setVisible(true);
    }
        
    public void validateUser(String email, String password){
        if(email.equals("Admin") && password.equals("admin")){
            LoginDialogUI.showMessage("Sukses");
            setValidation(true);
        }else{
            LoginDialogUI.showMessage("Email atau password salah");
            setValidation(false);
            Login loginInstance = Login.getInstance();
            loginInstance.getjTextField2().setText("Ketik email...");
            loginInstance.getjPasswordField1().setText("Ketik kata sandi..");   
        }
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    public boolean isValidation() {
        return validation;
    }
    
    public static void main(String args[]) {
        LoginController.showLoginForm();
    }
}

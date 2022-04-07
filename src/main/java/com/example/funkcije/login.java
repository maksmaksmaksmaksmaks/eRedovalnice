package com.example.funkcije;

public class login {

    //make public void login_check()
    public void login_check(String loginText, String passText) {
        //make if loginText.getText() == "admin" && passText.getText() == "admin"
        if (loginText.equals("test") && passText.equals("test")) {
            //print success
            System.out.println("Success");
            
        } else {
            //print error
            System.out.println("Error");
        }
    }

    
}

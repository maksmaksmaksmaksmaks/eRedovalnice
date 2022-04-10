package com.example.funkcije;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.connection_;

public class login {

    //make public void login_check()
    public void login_check(String loginText, String passText) throws SQLException {
        //get connection
        connection_ conn = new connection_();
        java.sql.Statement stm = conn.connect_to_db().createStatement();
        conn.connect_to_db();
        String query = "SELECT * FROM admini";
        ResultSet res = stm.executeQuery(query);
        while(res.next())
        {
            if(res.getString("uporabnisko_ime").equals(loginText) && res.getString("geslo").equals(passText))
            {
                System.out.println("login success");
                return;
            }
        }
        System.out.println("login failed");
    }

    
}

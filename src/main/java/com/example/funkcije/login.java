package com.example.funkcije;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class login {


    public static String encryptThisString(String input)
    {
        try {
            // getInstance() method is called with algorithm SHA-224
            MessageDigest md = MessageDigest.getInstance("SHA-224");
  
            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());
  
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
  
            // Convert message digest into hex value
            String hashtext = no.toString(16);
  
            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
  
            // return the HashText
            return hashtext;
        }
  
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    //make public void login_check()
    public void login_check(String loginText, String passText) throws SQLException {
        //get connection
        connection_ conn = new connection_();
        java.sql.Statement stm = conn.connect_to_db().createStatement();
        conn.connect_to_db();
        String query = "SELECT login('"+loginText+"','"+encryptThisString(passText) +");";
        ResultSet res = stm.executeQuery(query);
        
        
        while(res.next())
        {
            if(res.getString("uporabnisko_ime").equals(loginText) && res.getString("geslo").equals(encryptThisString(passText)))
            {
                System.out.println("Uspešno prijavljen");
                break;
            }
            else
            {
                System.out.println("Napačno uporabniško ime ali geslo");
                System.out.println(passText);
            }
        }
        
    }

    
}

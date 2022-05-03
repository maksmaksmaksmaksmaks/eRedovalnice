package com.example.funkcije;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.jswing_table;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class login {

    String tip = "";
    Integer id = 0;

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
        String data = "";
        //get connection
        connection_ conn = new connection_();
        java.sql.Statement stm = conn.connect_to_db().createStatement();
        conn.connect_to_db();
        String query = "SELECT login('"+loginText+"','"+encryptThisString(passText) +"');";
        System.out.println(query);
        ResultSet res = stm.executeQuery(query);
        
        
        while(res.next())
        {
            data = res.getString(1);
            //System.out.println(data);
        }
        //split data in data with ,
        String[] data_split = data.split(",");
        //pritn everything in datasplit
        for(int i = 0; i < data_split.length; i++)
        {
            System.out.println(data_split[i]);
        }
        //save first thing in data_split in type
        tip = data_split[0];
        //save second thing in data_split in id
        id = Integer.parseInt(data_split[1]);


        jswing_table jt = new jswing_table();
        jt.table_view(id);

        //prikaz_redovalnice();
        //close connection
        conn.connect_to_db().close();
        
    }

    
    public void prikaz_redovalnice() throws SQLException
    {
        Integer [] ocene = new Integer[10];
        
        if(tip.equals(tip))
        {
        System.out.println(tip);
        connection_ con = new connection_();
        java.sql.Statement stm = con.connect_to_db().createStatement();
        con.connect_to_db();
        String query = "SELECT o.ocena FROM ocene o WHERE ucenec_id = "+id+";";
        System.out.println(query);
        ResultSet res = stm.executeQuery(query);
        
        int i = 1;
        while(res.next())
        {
            //save data in ocene[]
            ocene[i] = res.getInt(1);
            i++;
        }
        }
        //pritn out all ocene[]
        for(int j = 1; j < ocene.length; j++)
        {
            System.out.println(ocene[j]);
        }
        
        
        
            
    }
}

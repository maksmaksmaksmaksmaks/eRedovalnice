package com.example;

import java.sql.Connection;
import java.sql.DriverManager;


public class connection_ {
    public Connection connect_to_db() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://ec2-63-35-156-160.eu-west-1.compute.amazonaws.com:5432/" +"dduqprfk2pmjoa","crdxllwroclbzy", "7f23fe20c1738b60012ad5610187600bf94832e783dd96d03c116143e259d684");
            System.out.print("connection: ");
            if (conn != null) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
    
}
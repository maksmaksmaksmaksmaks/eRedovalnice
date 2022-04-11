package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConn {
    public Connection connect_to_db() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://ec2-52-212-228-71.eu-west-1.compute.amazonaws.com:5432/" +"d9cuoeb7ksgh0","syvbxrnkfokxqr","86b03b6fc0fa544a179b6c363a926d169a95f6fb3a031ce2dc9224baa12c4057");
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

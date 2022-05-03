package com.example.funkcije;

import java.sql.SQLException;

import com.example.jswing_table;

public class Start {
    public void ucitelj(int id){

    }


    public void ucenec(int id) throws SQLException{
        
        jswing_table jt = new jswing_table();
        jt.table_view(id);

    }
    
}

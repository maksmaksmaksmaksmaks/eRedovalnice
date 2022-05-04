package com.example;

import java.io.IOException;
import java.sql.SQLException;

import com.example.App;
import com.example.jswing_table;

public class Start {
    public void ucitelj(int id) throws IOException{
        App.setRoot("ucitelj");


    }


    public void ucenec(int id) throws SQLException{
        
        jswing_table jt = new jswing_table();
        jt.table_view(id);

    }
    
}

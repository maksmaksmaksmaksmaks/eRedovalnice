package com.example;


import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.example.funkcije.connection_;

public class jswing_table {
    public static JFrame frame_profile;
    public void table_view(int user_id) throws SQLException {

        frame_profile = new JFrame("PROFILE");
        frame_profile.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame_profile.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame_profile.setVisible(true);

        int collumn_count = 0;
        //get connection
        connection_ conn = new connection_();
        java.sql.Statement stm = conn.connect_to_db().createStatement();
        conn.connect_to_db();
        
        CallableStatement cstmt = conn.connect_to_db().prepareCall("{?= CALL stetje_ocen(?)}");
        cstmt.registerOutParameter(1, Types.INTEGER);
        cstmt.setInt(2, user_id);
        cstmt.execute();
        collumn_count = cstmt.getInt(1);
        cstmt.close();

        String query = "SELECT view_ocene("+user_id+");";
        conn.connect_to_db().createStatement();
        ResultSet res = stm.executeQuery(query);

        String columns[] = {"AJE", "SVZ", "RPA", "IMA", "SPO", "OSTTJ", "OMT"};
        String data[][] = new String[collumn_count][7]; 

        int i = -1;
        int j = -1;
        String last = "";
        while (res.next()) {
               
                String x = res.getString(1);
                

                x = x.replace("(", "");
                x = x.replace(")", "");

                String[] parts = x.split(",");
                
                String new_ = "";
                
               // System.out.println(parts[0] + " ocena");
              //  System.out.println(parts[1] + " predmet");
              i++;
              new_ = parts[1];
              if(!new_.equals(last))
              {
                  j++;
                  i = 0;
              }
             /* System.out.print(j + " to je j \n");
              System.out.print(last + " to je last \n");
              System.out.print(new_ + " to je new \n");*/
              last = new_;
              
              data[i][j] = parts[0];
            
            }

            DefaultTableModel model = new DefaultTableModel(data, columns);
            JTable table = new JTable(model);
            table.setShowGrid(true);
            table.setShowVerticalLines(true);
            table.setRowHeight(20);
            //table.setSize(500,500);
            //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

            JScrollPane pane = new JScrollPane(table);
            JPanel panel = new JPanel();
            panel.add(pane);
            frame_profile.add(panel);
            frame_profile.setSize(500, 600);
            frame_profile.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame_profile.setVisible(true);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            frame_profile.add(panel);
            conn.connect_to_db().close();
            

        
    }
}

